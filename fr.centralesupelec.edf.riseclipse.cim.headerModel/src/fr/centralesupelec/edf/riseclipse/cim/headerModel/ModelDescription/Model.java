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

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getCreated <em>Created</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getScenarioTime <em>Scenario Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getModelingAuthoritySet <em>Modeling Authority Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getProfile <em>Profile</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDependentOnUrn <em>Dependent On Urn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getSupersedesUrn <em>Supersedes Urn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDependentOn <em>Dependent On</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDepending <em>Depending</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getSupersedes <em>Supersedes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getSupersedesBy <em>Supersedes By</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getUrn <em>Urn</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
    /**
     * Returns the value of the '<em><b>Created</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Created</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Created</em>' attribute.
     * @see #setCreated(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel_Created()
     * @model extendedMetaData="name='Model.created' kind='element' namespace='http://iec.ch/TC57/61970-552/ModelDescription/1'"
     * @generated
     */
    Date getCreated();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getCreated <em>Created</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Created</em>' attribute.
     * @see #getCreated()
     * @generated
     */
    void setCreated( Date value );

    /**
     * Returns the value of the '<em><b>Scenario Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scenario Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scenario Time</em>' attribute.
     * @see #setScenarioTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel_ScenarioTime()
     * @model extendedMetaData="name='Model.scenarioTime' kind='element' namespace='http://iec.ch/TC57/61970-552/ModelDescription/1'"
     * @generated
     */
    Date getScenarioTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getScenarioTime <em>Scenario Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scenario Time</em>' attribute.
     * @see #getScenarioTime()
     * @generated
     */
    void setScenarioTime( Date value );

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel_Description()
     * @model extendedMetaData="name='Model.description' kind='element' namespace='http://iec.ch/TC57/61970-552/ModelDescription/1'"
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription( String value );

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel_Version()
     * @model extendedMetaData="name='Model.version' kind='element' namespace='http://iec.ch/TC57/61970-552/ModelDescription/1'"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion( String value );

    /**
     * Returns the value of the '<em><b>Modeling Authority Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modeling Authority Set</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modeling Authority Set</em>' attribute.
     * @see #setModelingAuthoritySet(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel_ModelingAuthoritySet()
     * @model extendedMetaData="name='Model.modelingAuthoritySet' kind='element' namespace='http://iec.ch/TC57/61970-552/ModelDescription/1'"
     * @generated
     */
    String getModelingAuthoritySet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getModelingAuthoritySet <em>Modeling Authority Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modeling Authority Set</em>' attribute.
     * @see #getModelingAuthoritySet()
     * @generated
     */
    void setModelingAuthoritySet( String value );

    /**
     * Returns the value of the '<em><b>Profile</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Profile</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Profile</em>' attribute list.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel_Profile()
     * @model extendedMetaData="name='Model.profile' kind='element' namespace='http://iec.ch/TC57/61970-552/ModelDescription/1'"
     * @generated
     */
    EList< String > getProfile();

    /**
     * Returns the value of the '<em><b>Dependent On Urn</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependent On Urn</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dependent On Urn</em>' attribute list.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel_DependentOnUrn()
     * @model transient="true"
     *        extendedMetaData="name='Model.DependentOn' kind='element' namespace='http://iec.ch/TC57/61970-552/ModelDescription/1'"
     * @generated
     */
    EList< String > getDependentOnUrn();

    /**
     * Returns the value of the '<em><b>Supersedes Urn</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supersedes Urn</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Supersedes Urn</em>' attribute list.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel_SupersedesUrn()
     * @model transient="true"
     *        extendedMetaData="name='Model.Supersedes' kind='element' namespace='http://iec.ch/TC57/61970-552/ModelDescription/1'"
     * @generated
     */
    EList< String > getSupersedesUrn();

    /**
     * Returns the value of the '<em><b>Dependent On</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDepending <em>Depending</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependent On</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dependent On</em>' reference list.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel_DependentOn()
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDepending
     * @model opposite="Depending" resolveProxies="false" transient="true"
     * @generated
     */
    EList< Model > getDependentOn();

    /**
     * Returns the value of the '<em><b>Depending</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDependentOn <em>Dependent On</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Depending</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Depending</em>' reference list.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel_Depending()
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getDependentOn
     * @model opposite="DependentOn" transient="true"
     * @generated
     */
    EList< Model > getDepending();

    /**
     * Returns the value of the '<em><b>Supersedes</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getSupersedesBy <em>Supersedes By</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supersedes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Supersedes</em>' reference list.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel_Supersedes()
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getSupersedesBy
     * @model opposite="SupersedesBy" resolveProxies="false" transient="true"
     * @generated
     */
    EList< Model > getSupersedes();

    /**
     * Returns the value of the '<em><b>Supersedes By</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getSupersedes <em>Supersedes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supersedes By</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Supersedes By</em>' reference list.
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel_SupersedesBy()
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getSupersedes
     * @model opposite="Supersedes" transient="true"
     * @generated
     */
    EList< Model > getSupersedesBy();

    /**
     * Returns the value of the '<em><b>Urn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Urn</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Urn</em>' attribute.
     * @see #setUrn(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage#getModel_Urn()
     * @model id="true"
     *        extendedMetaData="namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns' name='about' kind='attribute'"
     * @generated
     */
    String getUrn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model#getUrn <em>Urn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Urn</em>' attribute.
     * @see #getUrn()
     * @generated
     */
    void setUrn( String value );

} // Model
