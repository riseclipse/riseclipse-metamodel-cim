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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResource;

/**
 */
public abstract class CimResourceImpl extends XMLResourceImpl implements IRiseClipseResource {

    private HashMap< String, Integer > cimObjectsCount;
    private CimXMLHandler cimXMLHandler;
    private Set< EObject > foreignObjects;
    private boolean loadFinalization;

    /**
     * Creates an instance of the resource.
     * @param uri the URI of the new resource.
     */
    public CimResourceImpl( URI uri ) {
        super( uri );

        // TODO: use both intrinsicID and extrinsicID ?
        // see http://fr.slideshare.net/kenn.hussey/performance-and-extensibility-with-emf
        this.setIntrinsicIDToEObjectMap( new HashMap< String, EObject >() );

        cimObjectsCount = new HashMap< String, Integer >();
        foreignObjects = new HashSet< EObject >();
        loadFinalization = false;
    }

    @Override
    protected boolean useIDs() {
        return true;
    }

    /*
     * rdf:ID is set as the IDAttributeName (@see CimResourceFactoryImpl.createResource()
     * In SAXXMLHandler.handleObjectAttribs(), setID is called but not setAttribValue() 
     */
    @Override
    public void setID( EObject obj, String id ) {
        super.setID( obj, id );
        // CimObjectWithID is unknown here
        // TODO : put this class in this package ?
        cimXMLHandler.setIDAttribValue( obj, id );
    }

    public void addCimObject( String name ) {
        if( cimObjectsCount.get( name ) == null ) {
            cimObjectsCount.put( name, new Integer( 1 ) );
        }
        else {
            cimObjectsCount.put( name, new Integer( cimObjectsCount.get( name ) + 1 ) );
        }
    }

    @Override
    public void printStatistics( IRiseClipseConsole console ) {
        console.info( "Statistics on resource " + this.getURI() );
        for( String name : cimObjectsCount.keySet() ) {
            console.info( name + " : " + cimObjectsCount.get( name ) );
        }
    }

    public void setXMLHandler( CimXMLHandler cimXMLHandler ) {
        this.cimXMLHandler = cimXMLHandler;
    }

    @Override
    public void finalizeLoad( boolean ignore_unresolved_reference ) {
        // Avoid NPE when XML parser fails and endDocument is not called
        if( cimXMLHandler != null ) {
            loadFinalization = true;
            if( ignore_unresolved_reference ) cimXMLHandler.set_ignore_unresolved_reference();
            cimXMLHandler.handleCrossResourceReferences();
            // put it back to false, because if another resource is finalizing and ask us for
            // an object, we must not search in another resource
            loadFinalization = false;
        }

        // Merge foreign objects into originals
        for( EObject object : foreignObjects ) {
            EObject original = getEObjectByIDInNeighbors( this.getID( object ).substring( 1 ) );
            if( original != null ) {
                EClass c = original.eClass();
                for( EStructuralFeature f : c.getEAllStructuralFeatures() ) {
                    if( object.eIsSet( f ) ) {
                        original.eSet( f, object.eGet( f ) );
                    }
                }
                this.getContents().remove( object );
            }
            else {
                AbstractRiseClipseConsole.getConsole().error(
                        "cannot find foreign object with ID " + this.getID( object ).substring( 1 ) + " in "
                                + this.uri.lastSegment() );
            }
        }
        foreignObjects.clear();
    }

    /*
     * XMLResourceImpl.getEObjectByID() looks for object in idToEObjectMap which is not null
     * because we force it by calling xmlResource.setID() in CimXMLHandler.processTopObject().
     * If the object belongs to this resource, it should be found (calls are made in endDocument()).
     * If the object belongs to another resource, it is not in idToEObjectMap.
     * Then, as XMLResourceImpl.useIDAttributes() say always yes, XMLResourceImpl.getEObjectByID()
     * calls ResourceImpl.getEObjectByID().
     * This one looks in intrinsicIDToEObjectMap, which is also not null (see CimResourceImpl constructor).
     * The object again will not be found in the map. Therefore, ResourceImpl.getEObjectByID() will
     * search in the whole resource, and it will do it for every reference to objects in other
     * resources !
     * 
     * We implement here the folowing strategy :
     * - it we are in endDocument() (not all resources are loaded), we just look in idToEObjectMap
     * - if we finalize the load, we look in other resources in the same resourceSet.
     * 
     * TODO: do we need both idToEObjectMap and intrinsicIDToEObjectMap ? we need to check loading
     * time when the later is not used
     */
    @Override
    public EObject getEObjectByID( String id ) {
        // If the XML file is not valid, idToEObjectMap may be null and the resource is empty
        if( idToEObjectMap == null ) return null;
        
        EObject obj = idToEObjectMap.get( id );
        if( obj != null ) {
            // Don't give back a foreigner
            if( !foreignObjects.contains( obj ) ) {
                return obj;
            }
        }

        if( !loadFinalization ) return null;

        return getEObjectByIDInNeighbors( id );
    }

    protected EObject getEObjectByIDInNeighbors( String id ) {
        for( Resource resource : this.getResourceSet().getResources() ) {
            if( resource == this ) continue;
            if( resource instanceof CimResourceImpl ) {
                EObject obj = resource.getEObject( id );
                if( obj != null ) return obj;
            }
        }

        return null;
    }

    public void addForeignObject( EObject object ) {
        foreignObjects.add( object );
    }

} // CimResourceImpl
