/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
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

import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResource;

/**
 */
public abstract class AbstractCimResource extends XMLResourceImpl implements IRiseClipseResource {

    private static final String CIM_INFO_CATEGORY = "CIM/Statistics";
    // Used in other places
            static final String CIM_LOADER_CATEGORY = "CIM/ModelLoader";
    
    private HashMap< String, Integer > cimObjectsCount;
    private AbstractCimXmlHandler abstractCimXmlHandler;
    private Set< EObject > foreignObjects;
    private boolean loadFinalization;

    /**
     * Creates an instance of the resource.
     * @param uri the URI of the new resource.
     */
    public AbstractCimResource( URI uri ) {
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
     * rdf:ID is set as the IDAttributeName (@see AbstractCimResourceFactory.createResource()
     * In SAXXMLHandler.handleObjectAttribs(), setID is called but not setAttribValue() 
     */
    @Override
    public void setID( EObject obj, String id ) {
        // XMLResourceImpl.setID( EObject obj, String id ) updates both eObjectToIDMap and idToEObjectMap
        // We do not need the first, and if it is constructed, we have a problem in finalizeLoad():
        // when we do remove( object ), the setID will be called with null, but the lookup of rdf:ID will fail
        // because namespaceSupport in XMLHelper is empty (popContext() called at XMLHandler.endDocument) and
        // prefix rdf cannot be resolved, so we get an unknown feature error !
        // So we do not call the method of the superclass
        //super.setID( obj, id );
        if( id != null ) {
            getIDToEObjectMap().put( id, obj );
        }

        // CimObjectWithID is unknown here
        // TODO : put this class in this package ?
        abstractCimXmlHandler.setIDAttribValue( obj, id );
    }

    public void addCimObject( String name ) {
        if( cimObjectsCount.get( name ) == null ) {
            cimObjectsCount.put( name, Integer.valueOf( 1 ));
        }
        else {
            cimObjectsCount.put( name, Integer.valueOf( cimObjectsCount.get( name ) + 1 ));
        }
    }

    @Override
    public void printStatistics( IRiseClipseConsole console ) {
        console.info( CIM_INFO_CATEGORY, 0,  "Statistics on resource ", this.getURI() );
        for( String name : cimObjectsCount.keySet() ) {
            console.info( CIM_INFO_CATEGORY, 0, name, " : ", cimObjectsCount.get( name ) );
        }
    }

    public void setXMLHandler( AbstractCimXmlHandler abstractCimXmlHandler ) {
        this.abstractCimXmlHandler = abstractCimXmlHandler;
    }

    @Override
    public void finalizeLoad( IRiseClipseConsole console ) {
        // Avoid NPE when XML parser fails and endDocument is not called
        if( abstractCimXmlHandler != null ) {
            loadFinalization = true;
            // TODO: find why this was needed and adapt accordingly
//            if( ignore_unresolved_reference ) abstractCimXmlHandler.set_ignore_unresolved_reference();
            abstractCimXmlHandler.handleCrossResourceReferences();
            // put it back to false, because if another resource is finalizing and ask us for
            // an object, we must not search in another resource
            loadFinalization = false;
        }

        // Merge foreign objects into originals
        for( EObject object : foreignObjects ) {
            EObject original = getEObjectByIDInNeighbors( this.getID( object ));
            if( original != null ) {
                // A superclass may be used instead of the real class of object
                // They are such cases in ENTSO-E_Test_Configurations_v3.0 files
                //EClass c = original.eClass();
                EClass c = object.eClass();
                for( EStructuralFeature f : c.getEAllStructuralFeatures() ) {
                    if( object.eIsSet( f ) ) {
                        Object value = object.eGet( f );
                        object.eUnset( f );
                        original.eSet( f, value );
                    }
                }
                this.getContents().remove( object );
            }
            else {
                console.error( CIM_LOADER_CATEGORY, 0,
                        "cannot find foreign object with ID ", this.getID( object ), " in ", this.uri.lastSegment() );
            }
        }
        foreignObjects.clear();
    }

    /*
     * XMLResourceImpl.getEObjectByID() looks for object in idToEObjectMap which is not null
     * because we force it by calling xmlResource.setID() in AbstractCimXmlHandler.processTopObject().
     * If the object belongs to this resource, it should be found (calls are made in endDocument()).
     * If the object belongs to another resource, it is not in idToEObjectMap.
     * Then, as XMLResourceImpl.useIDAttributes() say always yes, XMLResourceImpl.getEObjectByID()
     * calls ResourceImpl.getEObjectByID().
     * This one looks in intrinsicIDToEObjectMap, which is also not null (see AbstractCimResource constructor).
     * The object again will not be found in the map. Therefore, ResourceImpl.getEObjectByID() will
     * search in the whole resource, and it will do it for every reference to objects in other
     * resources !
     * 
     * We implement here the following strategy :
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
            if( resource instanceof AbstractCimResource ) {
                EObject obj = resource.getEObject( id );
                if( obj != null ) return obj;
            }
        }

        return null;
    }

    public void addForeignObject( EObject object ) {
        foreignObjects.add( object );
    }

} // AbstractCimResource
