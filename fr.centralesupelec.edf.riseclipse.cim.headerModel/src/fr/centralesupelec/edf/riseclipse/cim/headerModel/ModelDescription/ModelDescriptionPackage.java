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
package fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface ModelDescriptionPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "ModelDescription";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://iec.ch/TC57/61970-552/ModelDescription/1";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "md";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ModelDescriptionPackage eINSTANCE = fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelDescriptionPackageImpl
            .init();

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelDescriptionPackageImpl#getModel()
     * @generated
     */
    int MODEL = 0;

    /**
     * The feature id for the '<em><b>Created</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__CREATED = 0;

    /**
     * The feature id for the '<em><b>Scenario Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__SCENARIO_TIME = 1;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__DESCRIPTION = 2;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__VERSION = 3;

    /**
     * The feature id for the '<em><b>Modeling Authority Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__MODELING_AUTHORITY_SET = 4;

    /**
     * The feature id for the '<em><b>Profile</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__PROFILE = 5;

    /**
     * The feature id for the '<em><b>Dependent On Urn</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__DEPENDENT_ON_URN = 6;

    /**
     * The feature id for the '<em><b>Supersedes Urn</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__SUPERSEDES_URN = 7;

    /**
     * The feature id for the '<em><b>Dependent On</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__DEPENDENT_ON = 8;

    /**
     * The feature id for the '<em><b>Depending</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__DEPENDING = 9;

    /**
     * The feature id for the '<em><b>Supersedes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__SUPERSEDES = 10;

    /**
     * The feature id for the '<em><b>Supersedes By</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__SUPERSEDES_BY = 11;

    /**
     * The feature id for the '<em><b>Urn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__URN = 12;

    /**
     * The number of structural features of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_FEATURE_COUNT = 13;

    /**
     * The number of operations of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.FullModelImpl <em>Full Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.FullModelImpl
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelDescriptionPackageImpl#getFullModel()
     * @generated
     */
    int FULL_MODEL = 1;

    /**
     * The feature id for the '<em><b>Created</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL__CREATED = MODEL__CREATED;

    /**
     * The feature id for the '<em><b>Scenario Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL__SCENARIO_TIME = MODEL__SCENARIO_TIME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL__DESCRIPTION = MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL__VERSION = MODEL__VERSION;

    /**
     * The feature id for the '<em><b>Modeling Authority Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL__MODELING_AUTHORITY_SET = MODEL__MODELING_AUTHORITY_SET;

    /**
     * The feature id for the '<em><b>Profile</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL__PROFILE = MODEL__PROFILE;

    /**
     * The feature id for the '<em><b>Dependent On Urn</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL__DEPENDENT_ON_URN = MODEL__DEPENDENT_ON_URN;

    /**
     * The feature id for the '<em><b>Supersedes Urn</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL__SUPERSEDES_URN = MODEL__SUPERSEDES_URN;

    /**
     * The feature id for the '<em><b>Dependent On</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL__DEPENDENT_ON = MODEL__DEPENDENT_ON;

    /**
     * The feature id for the '<em><b>Depending</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL__DEPENDING = MODEL__DEPENDING;

    /**
     * The feature id for the '<em><b>Supersedes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL__SUPERSEDES = MODEL__SUPERSEDES;

    /**
     * The feature id for the '<em><b>Supersedes By</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL__SUPERSEDES_BY = MODEL__SUPERSEDES_BY;

    /**
     * The feature id for the '<em><b>Urn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL__URN = MODEL__URN;

    /**
     * The number of structural features of the '<em>Full Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Full Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FULL_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.DifferenceModelImpl <em>Difference Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.DifferenceModelImpl
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelDescriptionPackageImpl#getDifferenceModel()
     * @generated
     */
    int DIFFERENCE_MODEL = 2;

    /**
     * The feature id for the '<em><b>Created</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL__CREATED = MODEL__CREATED;

    /**
     * The feature id for the '<em><b>Scenario Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL__SCENARIO_TIME = MODEL__SCENARIO_TIME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL__DESCRIPTION = MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL__VERSION = MODEL__VERSION;

    /**
     * The feature id for the '<em><b>Modeling Authority Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL__MODELING_AUTHORITY_SET = MODEL__MODELING_AUTHORITY_SET;

    /**
     * The feature id for the '<em><b>Profile</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL__PROFILE = MODEL__PROFILE;

    /**
     * The feature id for the '<em><b>Dependent On Urn</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL__DEPENDENT_ON_URN = MODEL__DEPENDENT_ON_URN;

    /**
     * The feature id for the '<em><b>Supersedes Urn</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL__SUPERSEDES_URN = MODEL__SUPERSEDES_URN;

    /**
     * The feature id for the '<em><b>Dependent On</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL__DEPENDENT_ON = MODEL__DEPENDENT_ON;

    /**
     * The feature id for the '<em><b>Depending</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL__DEPENDING = MODEL__DEPENDING;

    /**
     * The feature id for the '<em><b>Supersedes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL__SUPERSEDES = MODEL__SUPERSEDES;

    /**
     * The feature id for the '<em><b>Supersedes By</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL__SUPERSEDES_BY = MODEL__SUPERSEDES_BY;

    /**
     * The feature id for the '<em><b>Urn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL__URN = MODEL__URN;

    /**
     * The number of structural features of the '<em>Difference Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Difference Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIFFERENCE_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model
     * @generated
     */
    EClass getModel();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getCreated <em>Created</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Created</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getCreated()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_Created();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getScenarioTime <em>Scenario Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scenario Time</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getScenarioTime()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_ScenarioTime();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDescription()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_Description();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getVersion()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_Version();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getModelingAuthoritySet <em>Modeling Authority Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modeling Authority Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getModelingAuthoritySet()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_ModelingAuthoritySet();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getProfile <em>Profile</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Profile</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getProfile()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_Profile();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDependentOnUrn <em>Dependent On Urn</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Dependent On Urn</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDependentOnUrn()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_DependentOnUrn();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getSupersedesUrn <em>Supersedes Urn</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Supersedes Urn</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getSupersedesUrn()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_SupersedesUrn();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDependentOn <em>Dependent On</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Dependent On</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDependentOn()
     * @see #getModel()
     * @generated
     */
    EReference getModel_DependentOn();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDepending <em>Depending</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Depending</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDepending()
     * @see #getModel()
     * @generated
     */
    EReference getModel_Depending();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getSupersedes <em>Supersedes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Supersedes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getSupersedes()
     * @see #getModel()
     * @generated
     */
    EReference getModel_Supersedes();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getSupersedesBy <em>Supersedes By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Supersedes By</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getSupersedesBy()
     * @see #getModel()
     * @generated
     */
    EReference getModel_SupersedesBy();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getUrn <em>Urn</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Urn</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getUrn()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_Urn();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.FullModel <em>Full Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Full Model</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.FullModel
     * @generated
     */
    EClass getFullModel();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.DifferenceModel <em>Difference Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Difference Model</em>'.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.DifferenceModel
     * @generated
     */
    EClass getDifferenceModel();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ModelDescriptionFactory getModelDescriptionFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl <em>Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl
         * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelDescriptionPackageImpl#getModel()
         * @generated
         */
        EClass MODEL = eINSTANCE.getModel();

        /**
         * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__CREATED = eINSTANCE.getModel_Created();

        /**
         * The meta object literal for the '<em><b>Scenario Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__SCENARIO_TIME = eINSTANCE.getModel_ScenarioTime();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__DESCRIPTION = eINSTANCE.getModel_Description();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__VERSION = eINSTANCE.getModel_Version();

        /**
         * The meta object literal for the '<em><b>Modeling Authority Set</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__MODELING_AUTHORITY_SET = eINSTANCE.getModel_ModelingAuthoritySet();

        /**
         * The meta object literal for the '<em><b>Profile</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__PROFILE = eINSTANCE.getModel_Profile();

        /**
         * The meta object literal for the '<em><b>Dependent On Urn</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__DEPENDENT_ON_URN = eINSTANCE.getModel_DependentOnUrn();

        /**
         * The meta object literal for the '<em><b>Supersedes Urn</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__SUPERSEDES_URN = eINSTANCE.getModel_SupersedesUrn();

        /**
         * The meta object literal for the '<em><b>Dependent On</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__DEPENDENT_ON = eINSTANCE.getModel_DependentOn();

        /**
         * The meta object literal for the '<em><b>Depending</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__DEPENDING = eINSTANCE.getModel_Depending();

        /**
         * The meta object literal for the '<em><b>Supersedes</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__SUPERSEDES = eINSTANCE.getModel_Supersedes();

        /**
         * The meta object literal for the '<em><b>Supersedes By</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL__SUPERSEDES_BY = eINSTANCE.getModel_SupersedesBy();

        /**
         * The meta object literal for the '<em><b>Urn</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__URN = eINSTANCE.getModel_Urn();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.FullModelImpl <em>Full Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.FullModelImpl
         * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelDescriptionPackageImpl#getFullModel()
         * @generated
         */
        EClass FULL_MODEL = eINSTANCE.getFullModel();

        /**
         * The meta object literal for the '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.DifferenceModelImpl <em>Difference Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.DifferenceModelImpl
         * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelDescriptionPackageImpl#getDifferenceModel()
         * @generated
         */
        EClass DIFFERENCE_MODEL = eINSTANCE.getDifferenceModel();

    }

} //ModelDescriptionPackage
