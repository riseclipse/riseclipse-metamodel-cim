/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.util.cimxml;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;

import fr.centralesupelec.edf.riseclipse.util.RiseClipseRuntimeException;

public abstract class AbstractCimResourceHandler extends BasicResourceHandler {
    
    static final String xmlDeclaration = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?>\n";

    public void preSave( XMLResource resource, OutputStream outputStream, Map<?, ?> options, String cimURI ) {
        super.preSave( resource, outputStream, options );
        
        StringBuffer buffer = new StringBuffer();
        
        buffer.append( xmlDeclaration );
        
        buffer.append( '<' );
        buffer.append( AbstractCimConstants.qualifiedRdfRDF );
        buffer.append( '\n' );
        
        buffer.append( "    " );
        buffer.append( AbstractCimConstants.xmlnsPrefix );
        buffer.append( ':' );
        buffer.append( AbstractCimConstants.rdfPrefix );
        buffer.append( '=' );
        buffer.append( '"' );
        buffer.append( AbstractCimConstants.rdfURISharp );
        buffer.append( '"' );
        buffer.append( '\n' );

        buffer.append( "    " );
        buffer.append( AbstractCimConstants.xmlnsPrefix );
        buffer.append( ':' );
        buffer.append( AbstractCimConstants.cimPrefix );
        buffer.append( '=' );
        buffer.append( '"' );
        buffer.append( cimURI );
        buffer.append( '"' );
        buffer.append( '>' );
        buffer.append( '\n' );
        
        try {
            outputStream.write( buffer.toString().getBytes() );
        }
        catch( IOException e ) {
            throw new RiseClipseRuntimeException( "AbstractCimResourceHandler.preSave: outputStream.write failed", e );
        }
        
    }

    @Override
    public void postSave( XMLResource resource, OutputStream outputStream, Map< ?, ? > options ) {
        
        StringBuffer buffer = new StringBuffer();
        
        buffer.append( '<' );
        buffer.append( '/' );
        
        buffer.append( AbstractCimConstants.rdfPrefix );
        buffer.append( ':' );
        buffer.append( AbstractCimConstants.nameRdfRDF );
        
        buffer.append( '>' );
        buffer.append( '\n' );
        
        try {
            outputStream.write( buffer.toString().getBytes() );
        }
        catch (IOException e) {
            throw new RiseClipseRuntimeException( "AbstractCimResourceHandler.postSave: outputStream.write failed", e );
        }

        super.postSave( resource, outputStream, options );
    }

}
