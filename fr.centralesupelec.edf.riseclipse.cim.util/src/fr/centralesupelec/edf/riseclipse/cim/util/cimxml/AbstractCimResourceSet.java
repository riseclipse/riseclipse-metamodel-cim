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

import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResource;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseResourceSet;


public abstract class AbstractCimResourceSet extends AbstractRiseClipseResourceSet {
    
    protected AbstractCimResourceFactory resourceFactory;
    
    public AbstractCimResourceSet( boolean strictContent ) {
        super( strictContent );
    }

    /* (non-Javadoc)
     * @see fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseResourceSet#finalizeLoad(fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole)
     */
    @Override
    public void finalizeLoad( IRiseClipseConsole console ) {
        for(  IRiseClipseResource resource : getRiseClipseResources() ) {
            resource.finalizeLoad( console );
        }
    }

}
