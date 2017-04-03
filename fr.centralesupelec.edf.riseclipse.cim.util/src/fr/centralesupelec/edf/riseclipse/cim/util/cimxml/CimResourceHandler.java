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

import fr.centralesupelec.edf.riseclipse.util.RiseClipseException;

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
        
//        buffer.append( "    " );
//        buffer.append( CimConstants.xmlnsPrefix );
//        buffer.append( ':' );
//        buffer.append( CimConstants.mdPrefix );
//        buffer.append( '=' );
//        buffer.append( '"' );
//        buffer.append( CimConstants.mdURI );
//        buffer.append( "\">\n" );
        
        try {
            outputStream.write( buffer.toString().getBytes() );
        }
        catch( IOException e ) {
            throw new RiseClipseException( "CimResourceHandler.preSave: outputStream.write failed", e );
        }
        
        // Save header if present
        // TODO: header
        /*
        if( (( CimResourceImpl ) resource ).isHeaderPresent() ) {
            CimModelHeader header = (( CimResourceImpl ) resource ).getHeader();
            buffer = new StringBuffer();
            
            buffer.append( '<' );
            buffer.append( CimConstants.qualifiedMdFullModel );
            buffer.append( ' ' );
            buffer.append( CimConstants.qualifiedRdfAbout );
            buffer.append( '=' );
            buffer.append( '"' );
            buffer.append( header.getModelID() );
            buffer.append( "\">\n" );
            
            if( header.getCreated() != null ) {
                buffer.append( "  <" );
                buffer.append( CimConstants.qualifiedMdCreated );
                buffer.append( '>' );
                buffer.append( new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSZ").format( header.getCreated() ));
                buffer.append( "</" );
                buffer.append( CimConstants.qualifiedMdCreated );
                buffer.append( ">\n" );
            }
            
            if( header.getScenarioTime() != null ) {
                buffer.append( "  <" );
                buffer.append( CimConstants.qualifiedMdScenarioTime );
                buffer.append( '>' );
                buffer.append( new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSZ").format( header.getScenarioTime() ));
                buffer.append( "</" );
                buffer.append( CimConstants.qualifiedMdScenarioTime );
                buffer.append( ">\n" );
            }
            
            if( header.getDescription() != null ) {
                buffer.append( "  <" );
                buffer.append( CimConstants.qualifiedMdDescription );
                buffer.append( '>' );
                buffer.append( header.getDescription() );
                buffer.append( "</" );
                buffer.append( CimConstants.qualifiedMdDescription );
                buffer.append( ">\n" );
            }
            
            if( header.getModelingAuthoritySet() != null ) {
                buffer.append( "  <" );
                buffer.append( CimConstants.qualifiedMdModelingAuthoritySet );
                buffer.append( '>' );
                buffer.append( header.getModelingAuthoritySet() );
                buffer.append( "</" );
                buffer.append( CimConstants.qualifiedMdModelingAuthoritySet );
                buffer.append( ">\n" );
            }
            
            if( header.getVersion() != null ) {
                buffer.append( "  <" );
                buffer.append( CimConstants.qualifiedMdVersion );
                buffer.append( '>' );
                buffer.append( header.getVersion() );
                buffer.append( "</" );
                buffer.append( CimConstants.qualifiedMdVersion );
                buffer.append( ">\n" );
            }
            
            Iterator<String> s = header.getDependentOnIterator();
            while( s.hasNext() ) {
                buffer.append( "  <" );
                buffer.append( CimConstants.qualifiedMdDependentOn );
                buffer.append( ' ' );
                buffer.append( CimConstants.qualifiedRdfResource );
                buffer.append( '=' );
                buffer.append( '"' );
                buffer.append( s.next() );
                buffer.append( "\" />\n" );
            }
            
            s = header.getSupersededByIterator();
            while( s.hasNext() ) {
                buffer.append( "  <" );
                buffer.append( CimConstants.qualifiedMdSupersededBy );
                buffer.append( ' ' );
                buffer.append( CimConstants.qualifiedRdfResource );
                buffer.append( '=' );
                buffer.append( '"' );
                buffer.append( s.next() );
                buffer.append( "\" />\n" );
            }
            
            s = header.getProfileIterator();
            while( s.hasNext() ) {
                buffer.append( "  <" );
                buffer.append( CimConstants.qualifiedMdProfile );
                buffer.append( '>' );
                buffer.append( s.next() );
                buffer.append( "</" );
                buffer.append( CimConstants.qualifiedMdProfile );
                buffer.append( ">\n" );
            }
            
            buffer.append( "</" );
            buffer.append( CimConstants.qualifiedMdFullModel );
            buffer.append( ">\n" );
            
            try {
                outputStream.write( buffer.toString().getBytes() );
            } catch (IOException e) {
                throw new RuntimeException( e );
            }
        }
        */
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
            throw new RiseClipseException( "CimResourceHandler.postSave: outputStream.write failed", e );
        }

        super.postSave( resource, outputStream, options );
    }

}
