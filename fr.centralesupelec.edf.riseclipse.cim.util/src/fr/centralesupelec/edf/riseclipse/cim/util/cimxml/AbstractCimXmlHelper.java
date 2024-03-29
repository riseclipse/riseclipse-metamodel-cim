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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;

public abstract class AbstractCimXmlHelper extends XMLHelperImpl {

    public AbstractCimXmlHelper( AbstractCimResource abstractCimResource ) {
        super( abstractCimResource );
    }

	@Override
	public String getQName( EStructuralFeature feature ) {
		// TODO better to modify metadata in ecore file
		return AbstractCimConstants.cimPrefix + ":" + extendedMetaData.getName( feature );
	}

    @Override
    public String getURI( String prefix ) {
        String uri = super.getURI( prefix );
        if( AbstractCimConstants.mdURIDef.equals( uri )) return AbstractCimConstants.mdURIDes;
        if(( uri != null ) && uri.endsWith( "#" )) return uri.substring( 0, uri.length() - 1 );
        return uri;
    }

}
