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
package fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.provider;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model;
import fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addCreatedPropertyDescriptor( object );
            addScenarioTimePropertyDescriptor( object );
            addDescriptionPropertyDescriptor( object );
            addVersionPropertyDescriptor( object );
            addModelingAuthoritySetPropertyDescriptor( object );
            addProfilePropertyDescriptor( object );
            addDependentOnUrnPropertyDescriptor( object );
            addSupersedesUrnPropertyDescriptor( object );
            addDependentOnPropertyDescriptor( object );
            addDependingPropertyDescriptor( object );
            addSupersedesPropertyDescriptor( object );
            addSupersedesByPropertyDescriptor( object );
            addUrnPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Created feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCreatedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Model_created_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Model_created_feature",
                                "_UI_Model_type" ),
                        ModelDescriptionPackage.Literals.MODEL__CREATED, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Scenario Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScenarioTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Model_scenarioTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Model_scenarioTime_feature",
                                "_UI_Model_type" ),
                        ModelDescriptionPackage.Literals.MODEL__SCENARIO_TIME, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Description feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDescriptionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Model_description_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Model_description_feature",
                                "_UI_Model_type" ),
                        ModelDescriptionPackage.Literals.MODEL__DESCRIPTION, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVersionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Model_version_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Model_version_feature",
                                "_UI_Model_type" ),
                        ModelDescriptionPackage.Literals.MODEL__VERSION, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Modeling Authority Set feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModelingAuthoritySetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Model_modelingAuthoritySet_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Model_modelingAuthoritySet_feature",
                                "_UI_Model_type" ),
                        ModelDescriptionPackage.Literals.MODEL__MODELING_AUTHORITY_SET, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Profile feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProfilePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Model_profile_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Model_profile_feature",
                                "_UI_Model_type" ),
                        ModelDescriptionPackage.Literals.MODEL__PROFILE, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dependent On Urn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDependentOnUrnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Model_dependentOnUrn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Model_dependentOnUrn_feature",
                                "_UI_Model_type" ),
                        ModelDescriptionPackage.Literals.MODEL__DEPENDENT_ON_URN, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Supersedes Urn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSupersedesUrnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Model_supersedesUrn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Model_supersedesUrn_feature",
                                "_UI_Model_type" ),
                        ModelDescriptionPackage.Literals.MODEL__SUPERSEDES_URN, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dependent On feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDependentOnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Model_DependentOn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Model_DependentOn_feature",
                                "_UI_Model_type" ),
                        ModelDescriptionPackage.Literals.MODEL__DEPENDENT_ON, true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Depending feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDependingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Model_Depending_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Model_Depending_feature",
                                "_UI_Model_type" ),
                        ModelDescriptionPackage.Literals.MODEL__DEPENDING, true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Supersedes feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSupersedesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Model_Supersedes_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Model_Supersedes_feature",
                                "_UI_Model_type" ),
                        ModelDescriptionPackage.Literals.MODEL__SUPERSEDES, true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Supersedes By feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSupersedesByPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Model_SupersedesBy_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Model_SupersedesBy_feature",
                                "_UI_Model_type" ),
                        ModelDescriptionPackage.Literals.MODEL__SUPERSEDES_BY, true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Urn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUrnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Model_urn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Model_urn_feature", "_UI_Model_type" ),
                        ModelDescriptionPackage.Literals.MODEL__URN, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns Model.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Model" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        Date labelValue = ( ( Model ) object ).getCreated();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ? getString( "_UI_Model_type" )
                : getString( "_UI_Model_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( Model.class ) ) {
        case ModelDescriptionPackage.MODEL__CREATED:
        case ModelDescriptionPackage.MODEL__SCENARIO_TIME:
        case ModelDescriptionPackage.MODEL__DESCRIPTION:
        case ModelDescriptionPackage.MODEL__VERSION:
        case ModelDescriptionPackage.MODEL__MODELING_AUTHORITY_SET:
        case ModelDescriptionPackage.MODEL__PROFILE:
        case ModelDescriptionPackage.MODEL__DEPENDENT_ON_URN:
        case ModelDescriptionPackage.MODEL__SUPERSEDES_URN:
        case ModelDescriptionPackage.MODEL__URN:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return HeaderModelEditPlugin.INSTANCE;
    }

}
