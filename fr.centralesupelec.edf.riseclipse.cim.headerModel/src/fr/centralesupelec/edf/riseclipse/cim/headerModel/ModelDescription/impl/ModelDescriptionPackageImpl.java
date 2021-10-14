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
package fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.DifferenceModel;
import fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.FullModel;
import fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model;
import fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionFactory;
import fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelDescriptionPackageImpl extends EPackageImpl implements ModelDescriptionPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fullModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass differenceModelEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ModelDescriptionPackageImpl() {
        super( eNS_URI, ModelDescriptionFactory.eINSTANCE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ModelDescriptionPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ModelDescriptionPackage init() {
        if( isInited ) return ( ModelDescriptionPackage ) EPackage.Registry.INSTANCE
                .getEPackage( ModelDescriptionPackage.eNS_URI );

        // Obtain or create and register package
        ModelDescriptionPackageImpl theModelDescriptionPackage = ( ModelDescriptionPackageImpl ) ( EPackage.Registry.INSTANCE
                .get( eNS_URI ) instanceof ModelDescriptionPackageImpl ? EPackage.Registry.INSTANCE.get( eNS_URI )
                        : new ModelDescriptionPackageImpl() );

        isInited = true;

        // Create package meta-data objects
        theModelDescriptionPackage.createPackageContents();

        // Initialize created meta-data
        theModelDescriptionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theModelDescriptionPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put( ModelDescriptionPackage.eNS_URI, theModelDescriptionPackage );
        return theModelDescriptionPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModel() {
        return modelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getModel_Created() {
        return ( EAttribute ) modelEClass.getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getModel_ScenarioTime() {
        return ( EAttribute ) modelEClass.getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getModel_Description() {
        return ( EAttribute ) modelEClass.getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getModel_Version() {
        return ( EAttribute ) modelEClass.getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getModel_ModelingAuthoritySet() {
        return ( EAttribute ) modelEClass.getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getModel_Profile() {
        return ( EAttribute ) modelEClass.getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getModel_DependentOnUrn() {
        return ( EAttribute ) modelEClass.getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getModel_SupersedesUrn() {
        return ( EAttribute ) modelEClass.getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModel_DependentOn() {
        return ( EReference ) modelEClass.getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModel_Depending() {
        return ( EReference ) modelEClass.getEStructuralFeatures().get( 9 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModel_Supersedes() {
        return ( EReference ) modelEClass.getEStructuralFeatures().get( 10 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModel_SupersedesBy() {
        return ( EReference ) modelEClass.getEStructuralFeatures().get( 11 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getModel_Urn() {
        return ( EAttribute ) modelEClass.getEStructuralFeatures().get( 12 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFullModel() {
        return fullModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDifferenceModel() {
        return differenceModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModelDescriptionFactory getModelDescriptionFactory() {
        return ( ModelDescriptionFactory ) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if( isCreated ) return;
        isCreated = true;

        // Create classes and their features
        modelEClass = createEClass( MODEL );
        createEAttribute( modelEClass, MODEL__CREATED );
        createEAttribute( modelEClass, MODEL__SCENARIO_TIME );
        createEAttribute( modelEClass, MODEL__DESCRIPTION );
        createEAttribute( modelEClass, MODEL__VERSION );
        createEAttribute( modelEClass, MODEL__MODELING_AUTHORITY_SET );
        createEAttribute( modelEClass, MODEL__PROFILE );
        createEAttribute( modelEClass, MODEL__DEPENDENT_ON_URN );
        createEAttribute( modelEClass, MODEL__SUPERSEDES_URN );
        createEReference( modelEClass, MODEL__DEPENDENT_ON );
        createEReference( modelEClass, MODEL__DEPENDING );
        createEReference( modelEClass, MODEL__SUPERSEDES );
        createEReference( modelEClass, MODEL__SUPERSEDES_BY );
        createEAttribute( modelEClass, MODEL__URN );

        fullModelEClass = createEClass( FULL_MODEL );

        differenceModelEClass = createEClass( DIFFERENCE_MODEL );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if( isInitialized ) return;
        isInitialized = true;

        // Initialize package
        setName( eNAME );
        setNsPrefix( eNS_PREFIX );
        setNsURI( eNS_URI );

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        fullModelEClass.getESuperTypes().add( this.getModel() );
        differenceModelEClass.getESuperTypes().add( this.getModel() );

        // Initialize classes, features, and operations; add parameters
        initEClass( modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute( getModel_Created(), ecorePackage.getEDate(), "created", null, 0, 1, Model.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getModel_ScenarioTime(), ecorePackage.getEDate(), "scenarioTime", null, 0, 1, Model.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, Model.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getModel_Version(), ecorePackage.getEString(), "version", null, 0, 1, Model.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getModel_ModelingAuthoritySet(), ecorePackage.getEString(), "modelingAuthoritySet", null, 0, 1,
                Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getModel_Profile(), ecorePackage.getEString(), "profile", null, 0, -1, Model.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getModel_DependentOnUrn(), ecorePackage.getEString(), "dependentOnUrn", null, 0, -1,
                Model.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED );
        initEAttribute( getModel_SupersedesUrn(), ecorePackage.getEString(), "supersedesUrn", null, 0, -1, Model.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getModel_DependentOn(), this.getModel(), this.getModel_Depending(), "DependentOn", null, 0, -1,
                Model.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getModel_Depending(), this.getModel(), this.getModel_DependentOn(), "Depending", null, 0, -1,
                Model.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getModel_Supersedes(), this.getModel(), this.getModel_SupersedesBy(), "Supersedes", null, 0, -1,
                Model.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference( getModel_SupersedesBy(), this.getModel(), this.getModel_Supersedes(), "SupersedesBy", null, 0,
                -1, Model.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute( getModel_Urn(), ecorePackage.getEString(), "urn", null, 0, 1, Model.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass( fullModelEClass, FullModel.class, "FullModel", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        initEClass( differenceModelEClass, DifferenceModel.class, "DifferenceModel", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS );

        // Create resource
        createResource( eNS_URI );

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
        addAnnotation( getModel_Created(), source, new String[] { "name", "Model.created", "kind", "element",
                "namespace", "http://iec.ch/TC57/61970-552/ModelDescription/1" } );
        addAnnotation( getModel_ScenarioTime(), source, new String[] { "name", "Model.scenarioTime", "kind", "element",
                "namespace", "http://iec.ch/TC57/61970-552/ModelDescription/1" } );
        addAnnotation( getModel_Description(), source, new String[] { "name", "Model.description", "kind", "element",
                "namespace", "http://iec.ch/TC57/61970-552/ModelDescription/1" } );
        addAnnotation( getModel_Version(), source, new String[] { "name", "Model.version", "kind", "element",
                "namespace", "http://iec.ch/TC57/61970-552/ModelDescription/1" } );
        addAnnotation( getModel_ModelingAuthoritySet(), source, new String[] { "name", "Model.modelingAuthoritySet",
                "kind", "element", "namespace", "http://iec.ch/TC57/61970-552/ModelDescription/1" } );
        addAnnotation( getModel_Profile(), source, new String[] { "name", "Model.profile", "kind", "element",
                "namespace", "http://iec.ch/TC57/61970-552/ModelDescription/1" } );
        addAnnotation( getModel_DependentOnUrn(), source, new String[] { "name", "Model.DependentOn", "kind", "element",
                "namespace", "http://iec.ch/TC57/61970-552/ModelDescription/1" } );
        addAnnotation( getModel_SupersedesUrn(), source, new String[] { "name", "Model.Supersedes", "kind", "element",
                "namespace", "http://iec.ch/TC57/61970-552/ModelDescription/1" } );
        addAnnotation( getModel_Urn(), source, new String[] { "namespace", "http://www.w3.org/1999/02/22-rdf-syntax-ns",
                "name", "about", "kind", "attribute" } );
    }

} //ModelDescriptionPackageImpl
