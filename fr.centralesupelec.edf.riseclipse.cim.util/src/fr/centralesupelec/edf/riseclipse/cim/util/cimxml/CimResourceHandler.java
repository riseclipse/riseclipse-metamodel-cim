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

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;

import fr.centralesupelec.edf.riseclipse.util.RiseClipseRuntimeException;

public abstract class CimResourceHandler extends BasicResourceHandler {
    
    static final String xmlDeclaration = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?>\n";

    public void preSave( XMLResource resource, OutputStream outputStream, Map<?, ?> options, String cimURI ) {
        super.preSave( resource, outputStream, options );
        
        StringBuffer buffer = new StringBuffer();
        
        buffer.append( xmlDeclaration );
        
        buffer.append( '<' );
        buffer.append( CimConstants.qualifiedRdfRDF );
        buffer.append( '\n' );
        
        buffer.append( "    " );
        buffer.append( CimConstants.xmlnsPrefix );
        buffer.append( ':' );
        buffer.append( CimConstants.rdfPrefix );
        buffer.append( '=' );
        buffer.append( '"' );
        buffer.append( CimConstants.rdfURI );
        buffer.append( '"' );
        buffer.append( '\n' );

        buffer.append( "    " );
        buffer.append( CimConstants.xmlnsPrefix );
        buffer.append( ':' );
        buffer.append( CimConstants.cimPrefix );
        buffer.append( '=' );
        buffer.append( '"' );
        buffer.append( cimURI );
        buffer.append( '"' );
        buffer.append( '\n' );
        
        try {
            outputStream.write( buffer.toString().getBytes() );
        }
        catch( IOException e ) {
            throw new RiseClipseRuntimeException( "CimResourceHandler.preSave: outputStream.write failed", e );
        }
        
    }

    @Override
    public void postSave( XMLResource resource, OutputStream outputStream, Map< ?, ? > options ) {
        
        StringBuffer buffer = new StringBuffer();
        
        buffer.append( '<' );
        buffer.append( '/' );
        
        buffer.append( CimConstants.rdfPrefix );
        buffer.append( ':' );
        buffer.append( CimConstants.nameRdfRDF );
        
        buffer.append( '>' );
        buffer.append( '\n' );
        
        try {
            outputStream.write( buffer.toString().getBytes() );
        }
        catch (IOException e) {
            throw new RiseClipseRuntimeException( "CimResourceHandler.postSave: outputStream.write failed", e );
        }

        super.postSave( resource, outputStream, options );
    }

}
