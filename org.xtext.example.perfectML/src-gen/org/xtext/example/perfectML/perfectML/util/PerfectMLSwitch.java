/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.perfectML.perfectML.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.perfectML.perfectML.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.perfectML.perfectML.PerfectMLPackage
 * @generated
 */
public class PerfectMLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PerfectMLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PerfectMLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PerfectMLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PerfectMLPackage.PERFECT_ML_FILE:
      {
        PerfectMLFile perfectMLFile = (PerfectMLFile)theEObject;
        T result = casePerfectMLFile(perfectMLFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PerfectMLPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PerfectMLPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PerfectMLPackage.OUTPUT:
      {
        Output output = (Output)theEObject;
        T result = caseOutput(output);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PerfectMLPackage.ALGORITHM:
      {
        Algorithm algorithm = (Algorithm)theEObject;
        T result = caseAlgorithm(algorithm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PerfectMLPackage.MLP_CLASSIFIER:
      {
        MLPClassifier mlpClassifier = (MLPClassifier)theEObject;
        T result = caseMLPClassifier(mlpClassifier);
        if (result == null) result = caseAlgorithm(mlpClassifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PerfectMLPackage.SVC:
      {
        SVC svc = (SVC)theEObject;
        T result = caseSVC(svc);
        if (result == null) result = caseAlgorithm(svc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER:
      {
        KNeighborsClassifier kNeighborsClassifier = (KNeighborsClassifier)theEObject;
        T result = caseKNeighborsClassifier(kNeighborsClassifier);
        if (result == null) result = caseAlgorithm(kNeighborsClassifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PerfectMLPackage.TRAINING_AMOUNT:
      {
        TrainingAmount trainingAmount = (TrainingAmount)theEObject;
        T result = caseTrainingAmount(trainingAmount);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PerfectMLPackage.COLUMN_DECLARATIONS:
      {
        ColumnDeclarations columnDeclarations = (ColumnDeclarations)theEObject;
        T result = caseColumnDeclarations(columnDeclarations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PerfectMLPackage.COLUMN_SET:
      {
        ColumnSet columnSet = (ColumnSet)theEObject;
        T result = caseColumnSet(columnSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PerfectMLPackage.BINOP:
      {
        Binop binop = (Binop)theEObject;
        T result = caseBinop(binop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PerfectMLPackage.FLOAT:
      {
        FLOAT float_ = (FLOAT)theEObject;
        T result = caseFLOAT(float_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PerfectMLPackage.BOOL:
      {
        BOOL bool = (BOOL)theEObject;
        T result = caseBOOL(bool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePerfectMLFile(PerfectMLFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput(Input object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutput(Output object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Algorithm</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Algorithm</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlgorithm(Algorithm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MLP Classifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MLP Classifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMLPClassifier(MLPClassifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SVC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SVC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSVC(SVC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>KNeighbors Classifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>KNeighbors Classifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKNeighborsClassifier(KNeighborsClassifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Training Amount</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Training Amount</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrainingAmount(TrainingAmount object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Declarations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Declarations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnDeclarations(ColumnDeclarations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnSet(ColumnSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinop(Binop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FLOAT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FLOAT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFLOAT(FLOAT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BOOL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BOOL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBOOL(BOOL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PerfectMLSwitch
