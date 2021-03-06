/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.perfectML.perfectML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training Amount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.perfectML.perfectML.TrainingAmount#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.TrainingAmount#isPercent <em>Percent</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage#getTrainingAmount()
 * @model
 * @generated
 */
public interface TrainingAmount extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage#getTrainingAmount_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.perfectML.perfectML.TrainingAmount#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Percent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Percent</em>' attribute.
   * @see #setPercent(boolean)
   * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage#getTrainingAmount_Percent()
   * @model
   * @generated
   */
  boolean isPercent();

  /**
   * Sets the value of the '{@link org.xtext.example.perfectML.perfectML.TrainingAmount#isPercent <em>Percent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Percent</em>' attribute.
   * @see #isPercent()
   * @generated
   */
  void setPercent(boolean value);

} // TrainingAmount
