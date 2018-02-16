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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;

public abstract class CimXMLHelperImpl extends XMLHelperImpl {

    public CimXMLHelperImpl( CimResourceImpl cimResourceImpl ) {
        super( cimResourceImpl );
    }

	@Override
	public String getQName( EStructuralFeature feature ) {
		// TODO better to modify metadata in ecore file
		return CimConstants.cimPrefix + ":" + extendedMetaData.getName( feature );
	}

    @Override
    public String getURI( String prefix ) {
        String uri = super.getURI( prefix );
        if( CimConstants.mdURIDef.equals( uri )) return CimConstants.mdURIDes;
        if(( uri != null ) && uri.endsWith( "#" )) return uri.substring( 0, uri.length() - 1 );
        return uri;
    }

}
