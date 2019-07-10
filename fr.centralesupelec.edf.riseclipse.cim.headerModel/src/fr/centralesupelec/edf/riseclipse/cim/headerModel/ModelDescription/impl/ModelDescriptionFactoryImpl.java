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
package fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelDescriptionFactoryImpl extends EFactoryImpl implements ModelDescriptionFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ModelDescriptionFactory init() {
        try {
            ModelDescriptionFactory theModelDescriptionFactory = ( ModelDescriptionFactory ) EPackage.Registry.INSTANCE
                    .getEFactory( ModelDescriptionPackage.eNS_URI );
            if( theModelDescriptionFactory != null ) {
                return theModelDescriptionFactory;
            }
        }
        catch( Exception exception ) {
            EcorePlugin.INSTANCE.log( exception );
        }
        return new ModelDescriptionFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelDescriptionFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create( EClass eClass ) {
        switch( eClass.getClassifierID() ) {
        case ModelDescriptionPackage.MODEL:
            return createModel();
        case ModelDescriptionPackage.FULL_MODEL:
            return createFullModel();
        case ModelDescriptionPackage.DIFFERENCE_MODEL:
            return createDifferenceModel();
        default:
            throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Model createModel() {
        ModelImpl model = new ModelImpl();
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FullModel createFullModel() {
        FullModelImpl fullModel = new FullModelImpl();
        return fullModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DifferenceModel createDifferenceModel() {
        DifferenceModelImpl differenceModel = new DifferenceModelImpl();
        return differenceModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModelDescriptionPackage getModelDescriptionPackage() {
        return ( ModelDescriptionPackage ) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ModelDescriptionPackage getPackage() {
        return ModelDescriptionPackage.eINSTANCE;
    }

} //ModelDescriptionFactoryImpl
