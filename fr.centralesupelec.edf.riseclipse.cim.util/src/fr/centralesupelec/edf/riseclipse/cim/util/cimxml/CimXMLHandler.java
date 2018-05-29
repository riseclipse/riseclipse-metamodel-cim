/*
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      http://wdi.supelec.fr/software/RiseClipse/
 */
package fr.centralesupelec.edf.riseclipse.cim.util.cimxml;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.UnresolvedReferenceException;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;

import fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model;
import fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;

public abstract class CimXMLHandler extends SAXXMLHandler {

    private long startTime;
    private boolean nextIsCompound;
    private boolean ignore_unresolved_reference = false;
    //private String cimURI;

    public CimXMLHandler( String cimURI, XMLResource xmiResource, XMLHelper helper, Map< ?, ? > options ) {
        super( xmiResource, helper, options );
        //this.cimURI = cimURI;
        nextIsCompound = false;
    }

    @Override
    public void startDocument() {
        startTime = ( new Date() ).getTime();

        // We need the handler for CimResourceImpl.setID()
        (( CimResourceImpl ) xmlResource ).setXMLHandler( this );
        
        super.startDocument();
    }

    @Override
    public void endDocument() {
        super.endDocument();
        
        String name = this.resourceURI.lastSegment();
        AbstractRiseClipseConsole.getConsole().info( "time to load " + name + ": " + (( new Date() ).getTime() - startTime ) + "ms" );

        // We keep handler because it keeps unresolved references
        // TODO: can we keep only what is needed instead of full handler
        // to save memory ?
        // Done now in startDocument
        //(( CimResourceImpl ) xmlResource ).setXMLHandler( this );
    }

    @Override
    protected void createTopObject( String prefix, String name ) {
        String uri = helper.getURI( prefix );
        if( CimConstants.rdfURI.equals( uri ) ) return;
        super.createTopObject( prefix, name );

        CimResourceImpl r = ( CimResourceImpl ) this.xmlResource;
        r.addCimObject( name );
    }
    
    /*
     * In CIMXML, only one end of an association is saved. We use the transient
     * attribute for this.
     * When the multiplicities are asymmetric (0/1 - many), the end of the 0/1
     * side is saved in the object corresponding to the many side.
     * When the multiplicities are symmetric (0/1 - 0/1 or many - many), we
     * choose one end and the other is marked transient. When one end is marked
     * transient, the other must not "resolve proxy" (The opposite of a
     * transient reference must transient if it is proxy resolving).
     * If the end in a CimXml file is not the one expected,
     * XMLHandler.handleFeature(String, String) call createObject(EObject
     * peekObject, EStructuralFeature feature) because the reference is not
     * proxy resolving.
     * To get the right behavior, we dynamically exchange the transient & proxy state.
     * 
     * Compound objects should be set as contained in Ecore. However, EMF XML do not expect
     * first the property name then the property type name as it is in CIMXML:
     * <cim:CimObject>
     *   <cim:CimObject.PropertyName>
     *     <cim:PropertyType>
     *       <cim:PropertyType.AttributeName>value</cim:PropertyType.AttributeName>
     *     </cim:PropertyType>
     *   </cim:CimObject.PropertyName>
     * </cim:CimObject>
     * 
     * The expected XMI looks like:
     * <cim:CimObject>
     *   <cim:CimObject.PropertyName>
     *     <cim:PropertyType.AttributeName>value</cim:PropertyType.AttributeName>
     *   </cim:CimObject.PropertyName>
     * </cim:CimObject>
     * 
     * The compound object is created when <cim:CimObject.PropertyName> is read, and 
     * <cim:PropertyType> is then not recognized as a feature.
     * 
     * To handle this, we duplicate the top of stacks of the handler when <cim:PropertyType>
     * is read: <cim:PropertyType.AttributeName> will then set the correct attribute value
     * and </cim:PropertyType> will pop correctly.
     */
    @Override
    protected void handleFeature( String prefix, String name ) {
        EObject peekObject = objects.peekEObject();
        if( peekObject != null ) {
            EStructuralFeature feature = getFeature( peekObject, prefix, name, true );
            // For compound objects
            if( nextIsCompound ) {
                if( feature != null ) {
                    // TODO: Something unexpected ???
                }
                nextIsCompound = false;
                objects.push( peekObject );
                types.push( OBJECT_TYPE );
                mixedTargets.push( null );
                return;
            }
            if( feature instanceof EReference ) {
                EReference eReference = ( EReference ) feature;
                
                EReference opposite = eReference.getEOpposite();
                if(   eReference.isResolveProxies() &&    eReference.isTransient() &&
                    ! opposite   .isResolveProxies() && ! opposite.  isTransient()) {
                    eReference.setResolveProxies( false );
                    eReference.setTransient( false );
                    opposite.setResolveProxies( true );
                    opposite.setTransient( true );
                }
                
                if( eReference.isContainment() ) {
                    nextIsCompound = true;
                }
            }
        }
        super.handleFeature( prefix, name );
    }

    @Override
    protected void handleUnknownFeature( String prefix, String name, boolean isElement, EObject peekObject, String value ) {
        // TODO: some RiseClipse specific message ?
        super.handleUnknownFeature( prefix, name, isElement, peekObject, value );
    }

    @Override
    protected EStructuralFeature getFeature( EObject object, String prefix, String name, boolean isElement ) {
        // May be called with null prefix (see XMLHandler.handleFeature(String prefix, String name))
        if( prefix != null ) {
            String uri = helper.getURI( prefix );
            if( CimConstants.rdfURI.equals( uri ) && CimConstants.nameRdfAbout.equals( name )) {
                // We consider that rdf:about is the same as rdf:ID for the purpose of reading files.
                // But, such an object will have to be merged with the real object when all
                // resources are loaded.
                // This is only valid for CimObject, not for FullModel in header !
                if( object.eClass().getEPackage() != ModelDescriptionPackage.eINSTANCE ) {
                    (( CimResourceImpl ) xmlResource ).addForeignObject( object );
                    name = CimConstants.nameRdfID;
                }
            }
        }
        return super.getFeature( object, prefix, name, isElement );
    }

    @Override
    public void endElement( String uri, String localName, String name ) {
        if( uri.isEmpty() ) {
            int index = name.indexOf( ':', 0 );
            localName = name;
            if( index != -1 ) {
                String prefix = name.substring( 0, index );
                localName = name.substring( index + 1 );
                uri = helper.getURI( prefix );
            }
        }
        if( CimConstants.rdfURISharp.equals( uri ) ) return;

        super.endElement( uri, localName, name );
    }

    @Override
    protected void setValueFromId( EObject object, EReference eReference, String ids ) {
        // Take care of references
        String resource = attribs.getValue( CimConstants.qualifiedRdfResource );
        if( resource != null ) {
            int p = resource.indexOf( "#" );
            if( p == -1 ) {
                String where = getLineNumber() == -1 ? "" : " at line " + getLineNumber();
                AbstractRiseClipseConsole.getConsole().error(
                        "The rdf:resource value of "
                      + eReference.getContainerClass().getSimpleName()
                      + "." + eReference.getName()
                      + " is missing '#'" + where );
            }
            else {
                // Ignore the URI before the # because we don't handle it
                // TODO: handle it!
                resource = resource.substring( p );
            }
            super.setValueFromId( object, eReference, resource );
        }
        else {
            // Issue #3-an-error-should-be-detected-when-a-reference-is-given-as-the-element-value-instead-of-as-the-value-of-the-rdf-resource-attribute
            //super.setValueFromId( object, eReference, ids );
            String where = getLineNumber() == -1 ? "" : " at line " + getLineNumber();
            AbstractRiseClipseConsole.getConsole().error(
                      "the value of feature "
                    + eReference.getContainerClass().getSimpleName()
                    + "." + eReference.getName()
                    + " should be given using the rdf:resource attribute" + where );
        }
    }
    
    /*
     * CimResourceImpl.setID() need to access setAttribValue for setting ID attribute
     */
    public void setIDAttribValue( EObject object, String id ) {
        setAttribValue( object, CimConstants.qualifiedRdfID, id );
    }

    @Override
    protected void setFeatureValue( EObject object, EStructuralFeature feature, Object value ) {
        // Catch multiple set of same attribute (see below for references)
        if( ! feature.isMany() ) {
            if( object.eIsSet( feature )) {
                String where = getLineNumber() == -1 ? "" : " at line " + getLineNumber();
                if( object.eGet( feature ).equals( value )) {
                    AbstractRiseClipseConsole.getConsole().warning(
                              "feature " + feature.getName()
                            + " has already been set with same value" + where );
                }
                else {
                    AbstractRiseClipseConsole.getConsole().error(
                              "feature " + feature.getName()
                            + " has already been set with a different value, it will be overwritten" + where );
                }
            }
        }
        else {
            // We could check for a value already present in a multi-valued attribute
            // but there are no such things in CIM
        }
        // attribs may be null when rdf:resource value does not start with # (in case
        // the referenced object is elsewhere, it starts with the URI).
        String resource = null;
        if( attribs != null ) resource = attribs.getValue( CimConstants.qualifiedRdfResource );
        if( resource != null ) {
            // take care of header elements
            if(( object instanceof Model )
              && ( feature.getFeatureID() == ModelDescriptionPackage.DIFFERENCE_MODEL__DEPENDENT_ON_URN
                || feature.getFeatureID() == ModelDescriptionPackage.DIFFERENCE_MODEL__SUPERSEDES_URN )) {
                super.setFeatureValue( object, feature, resource );
            }
            else if( setEnumValue( object, feature, resource )) {
                // Done
            }
            else {
                // TODO: is it possible ??
                super.setFeatureValue( object, feature, value );
            }
        }
        else {
            super.setFeatureValue( object, feature, value );
        }
    }
    
    /*
     * Overridden to catch multiple set of same reference
     */
    @Override
    protected void setFeatureValue( EObject object, EStructuralFeature feature, Object value, int position ) {
        if( feature instanceof EReference ) {
            String where = getLineNumber() == -1 ? "" : " at line " + getLineNumber();
            if( ! feature.isMany() ) {
                if( object.eIsSet( feature )) {
                    if( object.eGet( feature ).equals( value )) {
                        AbstractRiseClipseConsole.getConsole().warning(
                                  "feature " + feature.getName()
                                + " has already been set with same value" + where );
                    }
                    else {
                        AbstractRiseClipseConsole.getConsole().error(
                                  "feature " + feature.getName()
                                + " has already been set with a different value, it will be overwritten" + where );
                    }
                }
            }
            else {
                EList< ? > l = ( EList< ? > ) object.eGet( feature );
                if(( l != null ) && l.contains( value )) {
                    AbstractRiseClipseConsole.getConsole().warning(
                              "reference " + feature.getName()
                            + " has already been added with same value" + where );
                }
            }
        }
        
        // When an rdf:about is used, it is converted to rdf:ID by CimXMLHandler.getFeature()
        // However, the the value starts with a # that must be removed
        if( CimConstants.nameRdfID.equals( feature.getName() )) {
                try {
                    String id = ( String ) value;
                    if( id.charAt( 0 ) == '#' ) {
                        super.setFeatureValue( object, feature, id.substring( 1 ), position );
                    }
                    else {
                        super.setFeatureValue( object, feature, value, position );
                    }
                }
                catch( ClassCastException e ) {
                    super.setFeatureValue( object, feature, value, position );
                }
                return;
        }
        super.setFeatureValue( object, feature, value, position );
    }
    
    protected abstract boolean setEnumValue( EObject object, EStructuralFeature feature, String resource );

    @Override
    public void error( XMIException e ) {
        String name = this.resourceURI.lastSegment();
        if( e instanceof UnresolvedReferenceException ) {
            if( ! ignore_unresolved_reference ) {
                UnresolvedReferenceException u = ( UnresolvedReferenceException ) e;
                AbstractRiseClipseConsole.getConsole().error(
                          "unresolved reference " + u.getReference()
                        + " at line " + u.getLine() + " in " + name );
            }
        }
        else {
            AbstractRiseClipseConsole.getConsole().error(
                      "Exception " + e.getMessage() + " while parsing " + name
                    + " at line " + e.getLine() );
        }
    }

    /*
     * In an archive with multiple files, wait that all resources are loaded before
     * considering that an unresolved reference is an error
     */
    @Override
    protected void handleForwardReferences( boolean isEndDocument ) {
        super.handleForwardReferences( false );
    }

    public void handleCrossResourceReferences() {
        super.handleForwardReferences( true );
    }

    public void set_ignore_unresolved_reference() {
        this.ignore_unresolved_reference  = true;
    }

}
