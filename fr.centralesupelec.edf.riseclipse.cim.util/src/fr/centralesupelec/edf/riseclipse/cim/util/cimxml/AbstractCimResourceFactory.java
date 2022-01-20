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
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;

import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResourceFactory;



/**
 */
public abstract class AbstractCimResourceFactory extends ResourceFactoryImpl implements IRiseClipseResourceFactory {

    private Map< Object, Object > nameToFeatureCache;

    /**
     * Creates an instance of the resource factory.
     */
    protected AbstractCimResourceFactory() {
        super();

        nameToFeatureCache = new HashMap< Object, Object >();
    }

    /**
     * Creates an instance of the resource.
     */
    protected abstract AbstractCimResource createCimResource( URI uri );

    protected abstract AbstractCimResourceHandler createCimResourceHandler();
    
    @Override
    public AbstractCimResource createResource( URI uri ) {
        AbstractCimResource result = createCimResource( uri );

        result.getDefaultSaveOptions().put( XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE );
        result.getDefaultLoadOptions().put( XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE );

        result.getDefaultSaveOptions().put( XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE );

        result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE );
        result.getDefaultSaveOptions().put( XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE );

        result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE );

        // This one is commented on Entsoe2011, why ?
        // TODO: find usage
        //result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE );

        // <?xml line is set by AbstractCimResourceHandler.preSave
        result.getDefaultSaveOptions().put( XMLResource.OPTION_DECLARE_XML, Boolean.FALSE );
        result.getDefaultSaveOptions().put( XMLResource.OPTION_ENCODING, "UTF-8" );
        // Keep all values that has been set
        result.getDefaultSaveOptions().put( XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE );
        // For preSave/postSave
        result.getDefaultSaveOptions().put( XMLResource.OPTION_RESOURCE_HANDLER, createCimResourceHandler() );

        XMLResource.XMLMap map = new XMLMapImpl();
        // rdf prefix may be hardcoded because we know we use it for saving
        map.setIDAttributeName( AbstractCimConstants.qualifiedRdfID );
        result.getDefaultSaveOptions().put( XMLResource.OPTION_XML_MAP, map );

        // From https://www.eclipse.org/modeling/emf/docs/performance/EMFPerformanceTips.html
        // and https://sdqweb.ipd.kit.edu/wiki/EMF_Model_Loading_Performance_Tweaks
        // TODO : use a "Boolean Flags Reserved Bits" in CimObjectWithID
        result.getDefaultLoadOptions().put( XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE );
        result.getDefaultLoadOptions().put( XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE );
        result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl() );
        result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, nameToFeatureCache );

        // Use new methods
        result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE );

        return result;
    }

} //AbstractCimResourceFactory
