/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.perfectML.perfectML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.perfectML.perfectML.ColumnSet#isOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.ColumnSet#getArgBin1 <em>Arg Bin1</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.ColumnSet#getOpType <em>Op Type</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.ColumnSet#getArgBin2 <em>Arg Bin2</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.ColumnSet#isRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.ColumnSet#getArgR1 <em>Arg R1</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.ColumnSet#getArgR2 <em>Arg R2</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.ColumnSet#isList <em>List</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.ColumnSet#getArgList <em>Arg List</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage#getColumnSet()
 * @model
 * @generated
 */
public interface ColumnSet extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(boolean)
   * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage#getColumnSet_Op()
   * @model
   * @generated
   */
  boolean isOp();

  /**
   * Sets the value of the '{@link org.xtext.example.perfectML.perfectML.ColumnSet#isOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #isOp()
   * @generated
   */
  void setOp(boolean value);

  /**
   * Returns the value of the '<em><b>Arg Bin1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg Bin1</em>' containment reference.
   * @see #setArgBin1(ColumnSet)
   * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage#getColumnSet_ArgBin1()
   * @model containment="true"
   * @generated
   */
  ColumnSet getArgBin1();

  /**
   * Sets the value of the '{@link org.xtext.example.perfectML.perfectML.ColumnSet#getArgBin1 <em>Arg Bin1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg Bin1</em>' containment reference.
   * @see #getArgBin1()
   * @generated
   */
  void setArgBin1(ColumnSet value);

  /**
   * Returns the value of the '<em><b>Op Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Type</em>' containment reference.
   * @see #setOpType(Binop)
   * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage#getColumnSet_OpType()
   * @model containment="true"
   * @generated
   */
  Binop getOpType();

  /**
   * Sets the value of the '{@link org.xtext.example.perfectML.perfectML.ColumnSet#getOpType <em>Op Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Type</em>' containment reference.
   * @see #getOpType()
   * @generated
   */
  void setOpType(Binop value);

  /**
   * Returns the value of the '<em><b>Arg Bin2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg Bin2</em>' containment reference.
   * @see #setArgBin2(ColumnSet)
   * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage#getColumnSet_ArgBin2()
   * @model containment="true"
   * @generated
   */
  ColumnSet getArgBin2();

  /**
   * Sets the value of the '{@link org.xtext.example.perfectML.perfectML.ColumnSet#getArgBin2 <em>Arg Bin2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg Bin2</em>' containment reference.
   * @see #getArgBin2()
   * @generated
   */
  void setArgBin2(ColumnSet value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' attribute.
   * @see #setRange(boolean)
   * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage#getColumnSet_Range()
   * @model
   * @generated
   */
  boolean isRange();

  /**
   * Sets the value of the '{@link org.xtext.example.perfectML.perfectML.ColumnSet#isRange <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' attribute.
   * @see #isRange()
   * @generated
   */
  void setRange(boolean value);

  /**
   * Returns the value of the '<em><b>Arg R1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg R1</em>' attribute.
   * @see #setArgR1(int)
   * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage#getColumnSet_ArgR1()
   * @model
   * @generated
   */
  int getArgR1();

  /**
   * Sets the value of the '{@link org.xtext.example.perfectML.perfectML.ColumnSet#getArgR1 <em>Arg R1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg R1</em>' attribute.
   * @see #getArgR1()
   * @generated
   */
  void setArgR1(int value);

  /**
   * Returns the value of the '<em><b>Arg R2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg R2</em>' attribute.
   * @see #setArgR2(int)
   * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage#getColumnSet_ArgR2()
   * @model
   * @generated
   */
  int getArgR2();

  /**
   * Sets the value of the '{@link org.xtext.example.perfectML.perfectML.ColumnSet#getArgR2 <em>Arg R2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg R2</em>' attribute.
   * @see #getArgR2()
   * @generated
   */
  void setArgR2(int value);

  /**
   * Returns the value of the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' attribute.
   * @see #setList(boolean)
   * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage#getColumnSet_List()
   * @model
   * @generated
   */
  boolean isList();

  /**
   * Sets the value of the '{@link org.xtext.example.perfectML.perfectML.ColumnSet#isList <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' attribute.
   * @see #isList()
   * @generated
   */
  void setList(boolean value);

  /**
   * Returns the value of the '<em><b>Arg List</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg List</em>' attribute list.
   * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage#getColumnSet_ArgList()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getArgList();

} // ColumnSet