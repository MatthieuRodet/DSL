/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.perfectML.perfectML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.perfectML.perfectML.PerfectMLFile;
import org.xtext.example.perfectML.perfectML.PerfectMLPackage;
import org.xtext.example.perfectML.perfectML.Program;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.PerfectMLFileImpl#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerfectMLFileImpl extends MinimalEObjectImpl.Container implements PerfectMLFile
{
  /**
   * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrograms()
   * @generated
   * @ordered
   */
  protected EList<Program> programs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PerfectMLFileImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PerfectMLPackage.Literals.PERFECT_ML_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Program> getPrograms()
  {
    if (programs == null)
    {
      programs = new EObjectContainmentEList<Program>(Program.class, this, PerfectMLPackage.PERFECT_ML_FILE__PROGRAMS);
    }
    return programs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PerfectMLPackage.PERFECT_ML_FILE__PROGRAMS:
        return ((InternalEList<?>)getPrograms()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PerfectMLPackage.PERFECT_ML_FILE__PROGRAMS:
        return getPrograms();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PerfectMLPackage.PERFECT_ML_FILE__PROGRAMS:
        getPrograms().clear();
        getPrograms().addAll((Collection<? extends Program>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PerfectMLPackage.PERFECT_ML_FILE__PROGRAMS:
        getPrograms().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PerfectMLPackage.PERFECT_ML_FILE__PROGRAMS:
        return programs != null && !programs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PerfectMLFileImpl
