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

public abstract class CimConstants {

    public static final String xmlnsURI = "http://www.w3.org/2000/xmlns/"; //$NON-NLS-1$
    public static final String xmlnsPrefix = "xmlns"; //$NON-NLS-1$
    
    public static final String rdfURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#"; //$NON-NLS-1$
    public static final String rdfPrefix = "rdf";  //$NON-NLS-1$
    public static final String nameRdfRDF = "RDF"; //$NON-NLS-1$
    public static final String nameRdfID = "ID"; //$NON-NLS-1$
    public static final String nameRdfResource = "resource"; //$NON-NLS-1$
    public static final String nameRdfAbout = "about"; //$NON-NLS-1$
    public static final String nameRdfDescription = "Description";
    
    public static final String qualifiedRdfRDF         = rdfPrefix + ":" + nameRdfRDF;
    public static final String qualifiedRdfID          = rdfPrefix + ":" + nameRdfID;
    public static final String qualifiedRdfResource    = rdfPrefix + ":" + nameRdfResource;
    public static final String qualifiedRdfAbout       = rdfPrefix + ":" + nameRdfAbout;
    public static final String qualifiedRdfDescription = rdfPrefix + ":" + nameRdfDescription;
    
    public static final String mdURIDes = "http://iec.ch/TC57/61970-552/ModelDescription/1#";
    public static final String mdURIDef = "http://iec.ch/TC57/61970-552/ModelDefinition/1#";
//    public static final String mdPrefix = "md";
//    public static final String nameMdFullModel = "FullModel";
//    public static final String nameMdModel = "Model";
//    public static final String nameMdCreated = "created";
//    public static final String nameMdScenarioTime = "scenarioTime";
//    public static final String nameMdDescription = "description";
//    public static final String nameMdModelingAuthoritySet = "modelingAuthoritySet";
//    public static final String nameMdProfile = "profile";
//    public static final String nameMdVersion = "version";
//    public static final String nameMdDependentOn = "DependentOn";
//    public static final String nameMdSupersededBy = "SupersededBy";
//    
//    public static final String qualifiedMdFullModel = mdPrefix + ":" + nameMdFullModel;
//    public static final String qualifiedMdModel = mdPrefix + ":" + nameMdModel;
//    public static final String qualifiedMdCreated = qualifiedMdModel + "." + nameMdCreated;
//    public static final String qualifiedMdScenarioTime = qualifiedMdModel + "." + nameMdScenarioTime;
//    public static final String qualifiedMdDescription = qualifiedMdModel + "." + nameMdDescription;
//    public static final String qualifiedMdModelingAuthoritySet = qualifiedMdModel + "." + nameMdModelingAuthoritySet;
//    public static final String qualifiedMdProfile = qualifiedMdModel + "." + nameMdProfile;
//    public static final String qualifiedMdVersion = qualifiedMdModel + "." + nameMdVersion;
//    public static final String qualifiedMdDependentOn = qualifiedMdModel + "." + nameMdDependentOn;
//    public static final String qualifiedMdSupersededBy = qualifiedMdModel + "." + nameMdSupersededBy;
    
    public static final String cimPrefix = "cim";  //$NON-NLS-1$
    
    public static final String dmURI = "http://iec.ch/2002/schema/CIM_difference_model#"; //$NON-NLS-1$
    public static final String dmPrefix = "dm";  //$NON-NLS-1$
    public static final String nameDmDifferenceModel = "DifferenceModel"; //$NON-NLS-1$
    public static final String nameDmReverseDifferences = "reverseDifferences"; //$NON-NLS-1$
    public static final String nameDmForwardDifferences = "forwardDifferences"; //$NON-NLS-1$
    public final static String nameParseType = "parseType";  //$NON-NLS-1$
    public final static String valueStatements = "Statements";  //$NON-NLS-1$
    
    public static final String qualifiedDifferenceModel    = dmPrefix + ":" + nameDmDifferenceModel;
    public static final String qualifiedReverseDifferences = dmPrefix + ":" + nameDmReverseDifferences;
    public static final String qualifiedForwardDifferences = dmPrefix + ":" + nameDmForwardDifferences;
    
    public static final String literal0 = "0";  //$NON-NLS-1$
    public static final String literal1 = "1";  //$NON-NLS-1$
    public static final String literalFalse = "false";  //$NON-NLS-1$
    public static final String literalTrue = "true";  //$NON-NLS-1$
    
    public static final String zipExtension = "zip";  //$NON-NLS-1$
    public static final String keyProfile = "Profile";  //$NON-NLS-1$
}
