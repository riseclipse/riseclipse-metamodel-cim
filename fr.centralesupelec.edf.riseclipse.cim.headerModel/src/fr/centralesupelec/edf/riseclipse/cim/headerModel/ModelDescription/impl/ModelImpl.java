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
package fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model;
import fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl#getScenarioTime <em>Scenario Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl#getModelingAuthoritySet <em>Modeling Authority Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl#getDependentOnUrn <em>Dependent On Urn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl#getSupersedesUrn <em>Supersedes Urn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl#getDependentOn <em>Dependent On</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl#getDepending <em>Depending</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl#getSupersedes <em>Supersedes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl#getSupersedesBy <em>Supersedes By</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl.ModelImpl#getUrn <em>Urn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
    /**
     * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreated()
     * @generated
     * @ordered
     */
    protected static final Date CREATED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreated()
     * @generated
     * @ordered
     */
    protected Date created = CREATED_EDEFAULT;

    /**
     * The default value of the '{@link #getScenarioTime() <em>Scenario Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScenarioTime()
     * @generated
     * @ordered
     */
    protected static final Date SCENARIO_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScenarioTime() <em>Scenario Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScenarioTime()
     * @generated
     * @ordered
     */
    protected Date scenarioTime = SCENARIO_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getModelingAuthoritySet() <em>Modeling Authority Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelingAuthoritySet()
     * @generated
     * @ordered
     */
    protected static final String MODELING_AUTHORITY_SET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModelingAuthoritySet() <em>Modeling Authority Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelingAuthoritySet()
     * @generated
     * @ordered
     */
    protected String modelingAuthoritySet = MODELING_AUTHORITY_SET_EDEFAULT;

    /**
     * The cached value of the '{@link #getProfile() <em>Profile</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProfile()
     * @generated
     * @ordered
     */
    protected EList< String > profile;

    /**
     * The cached value of the '{@link #getDependentOnUrn() <em>Dependent On Urn</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDependentOnUrn()
     * @generated
     * @ordered
     */
    protected EList< String > dependentOnUrn;

    /**
     * The cached value of the '{@link #getSupersedesUrn() <em>Supersedes Urn</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupersedesUrn()
     * @generated
     * @ordered
     */
    protected EList< String > supersedesUrn;

    /**
     * The cached value of the '{@link #getDependentOn() <em>Dependent On</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDependentOn()
     * @generated
     * @ordered
     */
    protected EList< Model > dependentOn;

    /**
     * The cached value of the '{@link #getDepending() <em>Depending</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDepending()
     * @generated
     * @ordered
     */
    protected EList< Model > depending;

    /**
     * The cached value of the '{@link #getSupersedes() <em>Supersedes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupersedes()
     * @generated
     * @ordered
     */
    protected EList< Model > supersedes;

    /**
     * The cached value of the '{@link #getSupersedesBy() <em>Supersedes By</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupersedesBy()
     * @generated
     * @ordered
     */
    protected EList< Model > supersedesBy;

    /**
     * The default value of the '{@link #getUrn() <em>Urn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrn()
     * @generated
     * @ordered
     */
    protected static final String URN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUrn() <em>Urn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrn()
     * @generated
     * @ordered
     */
    protected String urn = URN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelDescriptionPackage.Literals.MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getCreated() {
        return created;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCreated( Date newCreated ) {
        Date oldCreated = created;
        created = newCreated;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                ModelDescriptionPackage.MODEL__CREATED, oldCreated, created ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getScenarioTime() {
        return scenarioTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setScenarioTime( Date newScenarioTime ) {
        Date oldScenarioTime = scenarioTime;
        scenarioTime = newScenarioTime;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                ModelDescriptionPackage.MODEL__SCENARIO_TIME, oldScenarioTime, scenarioTime ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDescription( String newDescription ) {
        String oldDescription = description;
        description = newDescription;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                ModelDescriptionPackage.MODEL__DESCRIPTION, oldDescription, description ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVersion( String newVersion ) {
        String oldVersion = version;
        version = newVersion;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                ModelDescriptionPackage.MODEL__VERSION, oldVersion, version ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getModelingAuthoritySet() {
        return modelingAuthoritySet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setModelingAuthoritySet( String newModelingAuthoritySet ) {
        String oldModelingAuthoritySet = modelingAuthoritySet;
        modelingAuthoritySet = newModelingAuthoritySet;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, ModelDescriptionPackage.MODEL__MODELING_AUTHORITY_SET,
                        oldModelingAuthoritySet, modelingAuthoritySet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< String > getProfile() {
        if( profile == null ) {
            profile = new EDataTypeUniqueEList< String >( String.class, this, ModelDescriptionPackage.MODEL__PROFILE );
        }
        return profile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< String > getDependentOnUrn() {
        if( dependentOnUrn == null ) {
            dependentOnUrn = new EDataTypeUniqueEList< String >( String.class, this,
                    ModelDescriptionPackage.MODEL__DEPENDENT_ON_URN );
        }
        return dependentOnUrn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< String > getSupersedesUrn() {
        if( supersedesUrn == null ) {
            supersedesUrn = new EDataTypeUniqueEList< String >( String.class, this,
                    ModelDescriptionPackage.MODEL__SUPERSEDES_URN );
        }
        return supersedesUrn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Model > getDependentOn() {
        if( dependentOn == null ) {
            dependentOn = new EObjectWithInverseEList.ManyInverse< Model >( Model.class, this,
                    ModelDescriptionPackage.MODEL__DEPENDENT_ON, ModelDescriptionPackage.MODEL__DEPENDING );
        }
        return dependentOn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Model > getDepending() {
        if( depending == null ) {
            depending = new EObjectWithInverseResolvingEList.ManyInverse< Model >( Model.class, this,
                    ModelDescriptionPackage.MODEL__DEPENDING, ModelDescriptionPackage.MODEL__DEPENDENT_ON );
        }
        return depending;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Model > getSupersedes() {
        if( supersedes == null ) {
            supersedes = new EObjectWithInverseEList.ManyInverse< Model >( Model.class, this,
                    ModelDescriptionPackage.MODEL__SUPERSEDES, ModelDescriptionPackage.MODEL__SUPERSEDES_BY );
        }
        return supersedes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Model > getSupersedesBy() {
        if( supersedesBy == null ) {
            supersedesBy = new EObjectWithInverseResolvingEList.ManyInverse< Model >( Model.class, this,
                    ModelDescriptionPackage.MODEL__SUPERSEDES_BY, ModelDescriptionPackage.MODEL__SUPERSEDES );
        }
        return supersedesBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUrn() {
        return urn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUrn( String newUrn ) {
        String oldUrn = urn;
        urn = newUrn;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, ModelDescriptionPackage.MODEL__URN, oldUrn, urn ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case ModelDescriptionPackage.MODEL__DEPENDENT_ON:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDependentOn() ).basicAdd( otherEnd,
                    msgs );
        case ModelDescriptionPackage.MODEL__DEPENDING:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDepending() ).basicAdd( otherEnd,
                    msgs );
        case ModelDescriptionPackage.MODEL__SUPERSEDES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSupersedes() ).basicAdd( otherEnd,
                    msgs );
        case ModelDescriptionPackage.MODEL__SUPERSEDES_BY:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSupersedesBy() ).basicAdd( otherEnd,
                    msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case ModelDescriptionPackage.MODEL__DEPENDENT_ON:
            return ( ( InternalEList< ? > ) getDependentOn() ).basicRemove( otherEnd, msgs );
        case ModelDescriptionPackage.MODEL__DEPENDING:
            return ( ( InternalEList< ? > ) getDepending() ).basicRemove( otherEnd, msgs );
        case ModelDescriptionPackage.MODEL__SUPERSEDES:
            return ( ( InternalEList< ? > ) getSupersedes() ).basicRemove( otherEnd, msgs );
        case ModelDescriptionPackage.MODEL__SUPERSEDES_BY:
            return ( ( InternalEList< ? > ) getSupersedesBy() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case ModelDescriptionPackage.MODEL__CREATED:
            return getCreated();
        case ModelDescriptionPackage.MODEL__SCENARIO_TIME:
            return getScenarioTime();
        case ModelDescriptionPackage.MODEL__DESCRIPTION:
            return getDescription();
        case ModelDescriptionPackage.MODEL__VERSION:
            return getVersion();
        case ModelDescriptionPackage.MODEL__MODELING_AUTHORITY_SET:
            return getModelingAuthoritySet();
        case ModelDescriptionPackage.MODEL__PROFILE:
            return getProfile();
        case ModelDescriptionPackage.MODEL__DEPENDENT_ON_URN:
            return getDependentOnUrn();
        case ModelDescriptionPackage.MODEL__SUPERSEDES_URN:
            return getSupersedesUrn();
        case ModelDescriptionPackage.MODEL__DEPENDENT_ON:
            return getDependentOn();
        case ModelDescriptionPackage.MODEL__DEPENDING:
            return getDepending();
        case ModelDescriptionPackage.MODEL__SUPERSEDES:
            return getSupersedes();
        case ModelDescriptionPackage.MODEL__SUPERSEDES_BY:
            return getSupersedesBy();
        case ModelDescriptionPackage.MODEL__URN:
            return getUrn();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case ModelDescriptionPackage.MODEL__CREATED:
            setCreated( ( Date ) newValue );
            return;
        case ModelDescriptionPackage.MODEL__SCENARIO_TIME:
            setScenarioTime( ( Date ) newValue );
            return;
        case ModelDescriptionPackage.MODEL__DESCRIPTION:
            setDescription( ( String ) newValue );
            return;
        case ModelDescriptionPackage.MODEL__VERSION:
            setVersion( ( String ) newValue );
            return;
        case ModelDescriptionPackage.MODEL__MODELING_AUTHORITY_SET:
            setModelingAuthoritySet( ( String ) newValue );
            return;
        case ModelDescriptionPackage.MODEL__PROFILE:
            getProfile().clear();
            getProfile().addAll( ( Collection< ? extends String > ) newValue );
            return;
        case ModelDescriptionPackage.MODEL__DEPENDENT_ON_URN:
            getDependentOnUrn().clear();
            getDependentOnUrn().addAll( ( Collection< ? extends String > ) newValue );
            return;
        case ModelDescriptionPackage.MODEL__SUPERSEDES_URN:
            getSupersedesUrn().clear();
            getSupersedesUrn().addAll( ( Collection< ? extends String > ) newValue );
            return;
        case ModelDescriptionPackage.MODEL__DEPENDENT_ON:
            getDependentOn().clear();
            getDependentOn().addAll( ( Collection< ? extends Model > ) newValue );
            return;
        case ModelDescriptionPackage.MODEL__DEPENDING:
            getDepending().clear();
            getDepending().addAll( ( Collection< ? extends Model > ) newValue );
            return;
        case ModelDescriptionPackage.MODEL__SUPERSEDES:
            getSupersedes().clear();
            getSupersedes().addAll( ( Collection< ? extends Model > ) newValue );
            return;
        case ModelDescriptionPackage.MODEL__SUPERSEDES_BY:
            getSupersedesBy().clear();
            getSupersedesBy().addAll( ( Collection< ? extends Model > ) newValue );
            return;
        case ModelDescriptionPackage.MODEL__URN:
            setUrn( ( String ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case ModelDescriptionPackage.MODEL__CREATED:
            setCreated( CREATED_EDEFAULT );
            return;
        case ModelDescriptionPackage.MODEL__SCENARIO_TIME:
            setScenarioTime( SCENARIO_TIME_EDEFAULT );
            return;
        case ModelDescriptionPackage.MODEL__DESCRIPTION:
            setDescription( DESCRIPTION_EDEFAULT );
            return;
        case ModelDescriptionPackage.MODEL__VERSION:
            setVersion( VERSION_EDEFAULT );
            return;
        case ModelDescriptionPackage.MODEL__MODELING_AUTHORITY_SET:
            setModelingAuthoritySet( MODELING_AUTHORITY_SET_EDEFAULT );
            return;
        case ModelDescriptionPackage.MODEL__PROFILE:
            getProfile().clear();
            return;
        case ModelDescriptionPackage.MODEL__DEPENDENT_ON_URN:
            getDependentOnUrn().clear();
            return;
        case ModelDescriptionPackage.MODEL__SUPERSEDES_URN:
            getSupersedesUrn().clear();
            return;
        case ModelDescriptionPackage.MODEL__DEPENDENT_ON:
            getDependentOn().clear();
            return;
        case ModelDescriptionPackage.MODEL__DEPENDING:
            getDepending().clear();
            return;
        case ModelDescriptionPackage.MODEL__SUPERSEDES:
            getSupersedes().clear();
            return;
        case ModelDescriptionPackage.MODEL__SUPERSEDES_BY:
            getSupersedesBy().clear();
            return;
        case ModelDescriptionPackage.MODEL__URN:
            setUrn( URN_EDEFAULT );
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case ModelDescriptionPackage.MODEL__CREATED:
            return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals( created );
        case ModelDescriptionPackage.MODEL__SCENARIO_TIME:
            return SCENARIO_TIME_EDEFAULT == null ? scenarioTime != null
                    : !SCENARIO_TIME_EDEFAULT.equals( scenarioTime );
        case ModelDescriptionPackage.MODEL__DESCRIPTION:
            return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals( description );
        case ModelDescriptionPackage.MODEL__VERSION:
            return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals( version );
        case ModelDescriptionPackage.MODEL__MODELING_AUTHORITY_SET:
            return MODELING_AUTHORITY_SET_EDEFAULT == null ? modelingAuthoritySet != null
                    : !MODELING_AUTHORITY_SET_EDEFAULT.equals( modelingAuthoritySet );
        case ModelDescriptionPackage.MODEL__PROFILE:
            return profile != null && !profile.isEmpty();
        case ModelDescriptionPackage.MODEL__DEPENDENT_ON_URN:
            return dependentOnUrn != null && !dependentOnUrn.isEmpty();
        case ModelDescriptionPackage.MODEL__SUPERSEDES_URN:
            return supersedesUrn != null && !supersedesUrn.isEmpty();
        case ModelDescriptionPackage.MODEL__DEPENDENT_ON:
            return dependentOn != null && !dependentOn.isEmpty();
        case ModelDescriptionPackage.MODEL__DEPENDING:
            return depending != null && !depending.isEmpty();
        case ModelDescriptionPackage.MODEL__SUPERSEDES:
            return supersedes != null && !supersedes.isEmpty();
        case ModelDescriptionPackage.MODEL__SUPERSEDES_BY:
            return supersedesBy != null && !supersedesBy.isEmpty();
        case ModelDescriptionPackage.MODEL__URN:
            return URN_EDEFAULT == null ? urn != null : !URN_EDEFAULT.equals( urn );
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (created: " );
        result.append( created );
        result.append( ", scenarioTime: " );
        result.append( scenarioTime );
        result.append( ", description: " );
        result.append( description );
        result.append( ", version: " );
        result.append( version );
        result.append( ", modelingAuthoritySet: " );
        result.append( modelingAuthoritySet );
        result.append( ", profile: " );
        result.append( profile );
        result.append( ", dependentOnUrn: " );
        result.append( dependentOnUrn );
        result.append( ", supersedesUrn: " );
        result.append( supersedesUrn );
        result.append( ", urn: " );
        result.append( urn );
        result.append( ')' );
        return result.toString();
    }

} //ModelImpl
