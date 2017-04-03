/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 */
package fr.centralesupelec.edf.riseclipse.cim.util.cimxml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;

public abstract class CimXMLSaveImpl extends XMLSaveImpl implements XMLSave {
	
	private String cimURI;
    private EStructuralFeature idStructuralFeature;

    public CimXMLSaveImpl( String cimURI, XMLHelper helper ) {
        super( helper );
	    this.cimURI = cimURI;
	    this.idStructuralFeature = null;
	}

	public CimXMLSaveImpl( String cimURI, Map< ?, ? > options, XMLHelper helper, String encoding ) {
		super( options, helper, encoding );
        this.cimURI = cimURI;
	}

	public CimXMLSaveImpl( String cimURI, Map< ?, ? > options, XMLHelper helper, String encoding, String xmlVersion ) {
		super( options, helper, encoding, xmlVersion );
        this.cimURI = cimURI;
	}
	
	/*
	 * The top object should be RDF, but we don't handle it as an object and the tags
	 * are written by CimResourceHandler
	 */
	@Override
    protected Object writeTopObjects( List< ? extends EObject > contents ) {
        if( contents.size() == 0 ) return null;
        Object res = writeTopObject( contents.get( 0 ));
        for( int i = 1; i < contents.size(); ++i ) {
            res = writeTopObject( contents.get( i ));
        }
        return res;
    }
	
    /*
     * CimResourceHandler takes care of namespace declarations
     */
    @Override
    protected void addNamespaceDeclarations() {
        return;
    }
	
    /*
     * references are saved as attribute rdf:resource
     */
    @Override
    protected void saveElementIDRef( EObject target, EStructuralFeature f ) {
        String name = helper.getQName( f );
        String id = helper.getHREF( target );
        if( id != null ) {
            // doc.saveDataValueElement( name, id );
            doc.startElement( name );
            doc.addAttribute( CimConstants.qualifiedRdfResource, id );
            doc.endElement();
        }
    }

    /*
     * Enumeration values are saved differently
     */
	@Override
	protected void saveDataTypeElementSingle( EObject o, EStructuralFeature f ) {
		if( f.getEType() instanceof EEnum ) {
			saveEnumAttributeValue( o, helper.getValue( o, f ), f );
			return;
		}
		super.saveDataTypeElementSingle( o, f );
	}

    protected void saveEnumAttributeValue( EObject o, Object value, EStructuralFeature f ) {
        StringBuffer svalue = new StringBuffer( cimURI );
        svalue = svalue.append( value.getClass().getSimpleName() );
        svalue = svalue.append( "." );
        svalue = svalue.append( getDatatypeValue( value, f, true ));
        doc.startElement( helper.getQName( f ) );
        doc.addAttribute( CimConstants.qualifiedRdfResource, svalue.toString() );
        doc.endElement();
    }

    @Override
    protected boolean shouldSaveFeature( EObject o, EStructuralFeature f ) {
        if( this.idStructuralFeature == null ) {
            if( CimConstants.nameRdfID.equals( f.getName() )) {
                this.idStructuralFeature = f;
                return false;
            }
        }
        else if( this.idStructuralFeature == f ) {
            return false;
        }
        
        // some references may have been set to null:
        // it happens with QVT when the referenced object is in another file that is not loaded
        // the corresponding XML element will have an xsi:nil attribute, which is bad
        // One solution is to tranform elements in the right order, so that we can detect such problem (which
        // may arise when late resolve is used). But it is quite complicated to get this right order !
        // So, we avoid to save null references
        if( f instanceof EReference ) {
            if( o.eIsSet( f ) && o.eGet( f ) == null ) return false;
        }
        return super.shouldSaveFeature( o, f );
    }

}
