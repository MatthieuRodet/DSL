/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ColumnDeclaration#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ColumnDeclaration#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getColumnDeclaration()
 * @model
 * @generated
 */
public interface ColumnDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference.
   * @see #setColumns(ColumnSet)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getColumnDeclaration_Columns()
   * @model containment="true"
   * @generated
   */
  ColumnSet getColumns();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ColumnDeclaration#getColumns <em>Columns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columns</em>' containment reference.
   * @see #getColumns()
   * @generated
   */
  void setColumns(ColumnSet value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TargetPredictive)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getColumnDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  TargetPredictive getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ColumnDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TargetPredictive value);

} // ColumnDeclaration