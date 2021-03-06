/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Algorithm;
import org.xtext.example.mydsl.myDsl.ColumnDeclarations;
import org.xtext.example.mydsl.myDsl.File;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.ParameterDeclaration;
import org.xtext.example.mydsl.myDsl.Program;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProgramImpl#getBlocsFile <em>Blocs File</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProgramImpl#getBlocsAlgo <em>Blocs Algo</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProgramImpl#getBlocsPara <em>Blocs Para</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProgramImpl#getBlocsColu <em>Blocs Colu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getBlocsFile() <em>Blocs File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocsFile()
   * @generated
   * @ordered
   */
  protected File blocsFile;

  /**
   * The cached value of the '{@link #getBlocsAlgo() <em>Blocs Algo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocsAlgo()
   * @generated
   * @ordered
   */
  protected Algorithm blocsAlgo;

  /**
   * The cached value of the '{@link #getBlocsPara() <em>Blocs Para</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocsPara()
   * @generated
   * @ordered
   */
  protected ParameterDeclaration blocsPara;

  /**
   * The cached value of the '{@link #getBlocsColu() <em>Blocs Colu</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocsColu()
   * @generated
   * @ordered
   */
  protected ColumnDeclarations blocsColu;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
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
    return MyDslPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public File getBlocsFile()
  {
    return blocsFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocsFile(File newBlocsFile, NotificationChain msgs)
  {
    File oldBlocsFile = blocsFile;
    blocsFile = newBlocsFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PROGRAM__BLOCS_FILE, oldBlocsFile, newBlocsFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBlocsFile(File newBlocsFile)
  {
    if (newBlocsFile != blocsFile)
    {
      NotificationChain msgs = null;
      if (blocsFile != null)
        msgs = ((InternalEObject)blocsFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROGRAM__BLOCS_FILE, null, msgs);
      if (newBlocsFile != null)
        msgs = ((InternalEObject)newBlocsFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROGRAM__BLOCS_FILE, null, msgs);
      msgs = basicSetBlocsFile(newBlocsFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROGRAM__BLOCS_FILE, newBlocsFile, newBlocsFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Algorithm getBlocsAlgo()
  {
    return blocsAlgo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocsAlgo(Algorithm newBlocsAlgo, NotificationChain msgs)
  {
    Algorithm oldBlocsAlgo = blocsAlgo;
    blocsAlgo = newBlocsAlgo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PROGRAM__BLOCS_ALGO, oldBlocsAlgo, newBlocsAlgo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBlocsAlgo(Algorithm newBlocsAlgo)
  {
    if (newBlocsAlgo != blocsAlgo)
    {
      NotificationChain msgs = null;
      if (blocsAlgo != null)
        msgs = ((InternalEObject)blocsAlgo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROGRAM__BLOCS_ALGO, null, msgs);
      if (newBlocsAlgo != null)
        msgs = ((InternalEObject)newBlocsAlgo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROGRAM__BLOCS_ALGO, null, msgs);
      msgs = basicSetBlocsAlgo(newBlocsAlgo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROGRAM__BLOCS_ALGO, newBlocsAlgo, newBlocsAlgo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterDeclaration getBlocsPara()
  {
    return blocsPara;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocsPara(ParameterDeclaration newBlocsPara, NotificationChain msgs)
  {
    ParameterDeclaration oldBlocsPara = blocsPara;
    blocsPara = newBlocsPara;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PROGRAM__BLOCS_PARA, oldBlocsPara, newBlocsPara);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBlocsPara(ParameterDeclaration newBlocsPara)
  {
    if (newBlocsPara != blocsPara)
    {
      NotificationChain msgs = null;
      if (blocsPara != null)
        msgs = ((InternalEObject)blocsPara).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROGRAM__BLOCS_PARA, null, msgs);
      if (newBlocsPara != null)
        msgs = ((InternalEObject)newBlocsPara).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROGRAM__BLOCS_PARA, null, msgs);
      msgs = basicSetBlocsPara(newBlocsPara, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROGRAM__BLOCS_PARA, newBlocsPara, newBlocsPara));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColumnDeclarations getBlocsColu()
  {
    return blocsColu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocsColu(ColumnDeclarations newBlocsColu, NotificationChain msgs)
  {
    ColumnDeclarations oldBlocsColu = blocsColu;
    blocsColu = newBlocsColu;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PROGRAM__BLOCS_COLU, oldBlocsColu, newBlocsColu);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBlocsColu(ColumnDeclarations newBlocsColu)
  {
    if (newBlocsColu != blocsColu)
    {
      NotificationChain msgs = null;
      if (blocsColu != null)
        msgs = ((InternalEObject)blocsColu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROGRAM__BLOCS_COLU, null, msgs);
      if (newBlocsColu != null)
        msgs = ((InternalEObject)newBlocsColu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROGRAM__BLOCS_COLU, null, msgs);
      msgs = basicSetBlocsColu(newBlocsColu, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROGRAM__BLOCS_COLU, newBlocsColu, newBlocsColu));
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
      case MyDslPackage.PROGRAM__BLOCS_FILE:
        return basicSetBlocsFile(null, msgs);
      case MyDslPackage.PROGRAM__BLOCS_ALGO:
        return basicSetBlocsAlgo(null, msgs);
      case MyDslPackage.PROGRAM__BLOCS_PARA:
        return basicSetBlocsPara(null, msgs);
      case MyDslPackage.PROGRAM__BLOCS_COLU:
        return basicSetBlocsColu(null, msgs);
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
      case MyDslPackage.PROGRAM__BLOCS_FILE:
        return getBlocsFile();
      case MyDslPackage.PROGRAM__BLOCS_ALGO:
        return getBlocsAlgo();
      case MyDslPackage.PROGRAM__BLOCS_PARA:
        return getBlocsPara();
      case MyDslPackage.PROGRAM__BLOCS_COLU:
        return getBlocsColu();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.PROGRAM__BLOCS_FILE:
        setBlocsFile((File)newValue);
        return;
      case MyDslPackage.PROGRAM__BLOCS_ALGO:
        setBlocsAlgo((Algorithm)newValue);
        return;
      case MyDslPackage.PROGRAM__BLOCS_PARA:
        setBlocsPara((ParameterDeclaration)newValue);
        return;
      case MyDslPackage.PROGRAM__BLOCS_COLU:
        setBlocsColu((ColumnDeclarations)newValue);
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
      case MyDslPackage.PROGRAM__BLOCS_FILE:
        setBlocsFile((File)null);
        return;
      case MyDslPackage.PROGRAM__BLOCS_ALGO:
        setBlocsAlgo((Algorithm)null);
        return;
      case MyDslPackage.PROGRAM__BLOCS_PARA:
        setBlocsPara((ParameterDeclaration)null);
        return;
      case MyDslPackage.PROGRAM__BLOCS_COLU:
        setBlocsColu((ColumnDeclarations)null);
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
      case MyDslPackage.PROGRAM__BLOCS_FILE:
        return blocsFile != null;
      case MyDslPackage.PROGRAM__BLOCS_ALGO:
        return blocsAlgo != null;
      case MyDslPackage.PROGRAM__BLOCS_PARA:
        return blocsPara != null;
      case MyDslPackage.PROGRAM__BLOCS_COLU:
        return blocsColu != null;
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl
