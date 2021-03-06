/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.perfectML.perfectML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.perfectML.perfectML.KNeighborsClassifier;
import org.xtext.example.perfectML.perfectML.PerfectMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KNeighbors Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#isN_neighbors_def <em>Nneighbors def</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#getN_neighbors <em>Nneighbors</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#isWeights_def <em>Weights def</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#getWeights <em>Weights</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#isAlgorithm_def <em>Algorithm def</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#isLeaf_size_def <em>Leaf size def</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#getLeaf_size <em>Leaf size</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#isP_def <em>Pdef</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#isMetric_def <em>Metric def</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#isN_jobs_def <em>Njobs def</em>}</li>
 *   <li>{@link org.xtext.example.perfectML.perfectML.impl.KNeighborsClassifierImpl#getN_jobs <em>Njobs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KNeighborsClassifierImpl extends AlgorithmImpl implements KNeighborsClassifier
{
  /**
   * The default value of the '{@link #isN_neighbors_def() <em>Nneighbors def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isN_neighbors_def()
   * @generated
   * @ordered
   */
  protected static final boolean NNEIGHBORS_DEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isN_neighbors_def() <em>Nneighbors def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isN_neighbors_def()
   * @generated
   * @ordered
   */
  protected boolean n_neighbors_def = NNEIGHBORS_DEF_EDEFAULT;

  /**
   * The default value of the '{@link #getN_neighbors() <em>Nneighbors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN_neighbors()
   * @generated
   * @ordered
   */
  protected static final int NNEIGHBORS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getN_neighbors() <em>Nneighbors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN_neighbors()
   * @generated
   * @ordered
   */
  protected int n_neighbors = NNEIGHBORS_EDEFAULT;

  /**
   * The default value of the '{@link #isWeights_def() <em>Weights def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWeights_def()
   * @generated
   * @ordered
   */
  protected static final boolean WEIGHTS_DEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWeights_def() <em>Weights def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWeights_def()
   * @generated
   * @ordered
   */
  protected boolean weights_def = WEIGHTS_DEF_EDEFAULT;

  /**
   * The default value of the '{@link #getWeights() <em>Weights</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeights()
   * @generated
   * @ordered
   */
  protected static final String WEIGHTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWeights() <em>Weights</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeights()
   * @generated
   * @ordered
   */
  protected String weights = WEIGHTS_EDEFAULT;

  /**
   * The default value of the '{@link #isAlgorithm_def() <em>Algorithm def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAlgorithm_def()
   * @generated
   * @ordered
   */
  protected static final boolean ALGORITHM_DEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAlgorithm_def() <em>Algorithm def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAlgorithm_def()
   * @generated
   * @ordered
   */
  protected boolean algorithm_def = ALGORITHM_DEF_EDEFAULT;

  /**
   * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgorithm()
   * @generated
   * @ordered
   */
  protected static final String ALGORITHM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgorithm()
   * @generated
   * @ordered
   */
  protected String algorithm = ALGORITHM_EDEFAULT;

  /**
   * The default value of the '{@link #isLeaf_size_def() <em>Leaf size def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLeaf_size_def()
   * @generated
   * @ordered
   */
  protected static final boolean LEAF_SIZE_DEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLeaf_size_def() <em>Leaf size def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLeaf_size_def()
   * @generated
   * @ordered
   */
  protected boolean leaf_size_def = LEAF_SIZE_DEF_EDEFAULT;

  /**
   * The default value of the '{@link #getLeaf_size() <em>Leaf size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeaf_size()
   * @generated
   * @ordered
   */
  protected static final int LEAF_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLeaf_size() <em>Leaf size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeaf_size()
   * @generated
   * @ordered
   */
  protected int leaf_size = LEAF_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #isP_def() <em>Pdef</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isP_def()
   * @generated
   * @ordered
   */
  protected static final boolean PDEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isP_def() <em>Pdef</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isP_def()
   * @generated
   * @ordered
   */
  protected boolean p_def = PDEF_EDEFAULT;

  /**
   * The default value of the '{@link #getP() <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected static final int P_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getP() <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected int p = P_EDEFAULT;

  /**
   * The default value of the '{@link #isMetric_def() <em>Metric def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMetric_def()
   * @generated
   * @ordered
   */
  protected static final boolean METRIC_DEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMetric_def() <em>Metric def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMetric_def()
   * @generated
   * @ordered
   */
  protected boolean metric_def = METRIC_DEF_EDEFAULT;

  /**
   * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected static final String METRIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected String metric = METRIC_EDEFAULT;

  /**
   * The default value of the '{@link #isN_jobs_def() <em>Njobs def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isN_jobs_def()
   * @generated
   * @ordered
   */
  protected static final boolean NJOBS_DEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isN_jobs_def() <em>Njobs def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isN_jobs_def()
   * @generated
   * @ordered
   */
  protected boolean n_jobs_def = NJOBS_DEF_EDEFAULT;

  /**
   * The default value of the '{@link #getN_jobs() <em>Njobs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN_jobs()
   * @generated
   * @ordered
   */
  protected static final int NJOBS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getN_jobs() <em>Njobs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN_jobs()
   * @generated
   * @ordered
   */
  protected int n_jobs = NJOBS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KNeighborsClassifierImpl()
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
    return PerfectMLPackage.Literals.KNEIGHBORS_CLASSIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isN_neighbors_def()
  {
    return n_neighbors_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setN_neighbors_def(boolean newN_neighbors_def)
  {
    boolean oldN_neighbors_def = n_neighbors_def;
    n_neighbors_def = newN_neighbors_def;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS_DEF, oldN_neighbors_def, n_neighbors_def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getN_neighbors()
  {
    return n_neighbors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setN_neighbors(int newN_neighbors)
  {
    int oldN_neighbors = n_neighbors;
    n_neighbors = newN_neighbors;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS, oldN_neighbors, n_neighbors));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isWeights_def()
  {
    return weights_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWeights_def(boolean newWeights_def)
  {
    boolean oldWeights_def = weights_def;
    weights_def = newWeights_def;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__WEIGHTS_DEF, oldWeights_def, weights_def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getWeights()
  {
    return weights;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWeights(String newWeights)
  {
    String oldWeights = weights;
    weights = newWeights;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__WEIGHTS, oldWeights, weights));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isAlgorithm_def()
  {
    return algorithm_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlgorithm_def(boolean newAlgorithm_def)
  {
    boolean oldAlgorithm_def = algorithm_def;
    algorithm_def = newAlgorithm_def;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__ALGORITHM_DEF, oldAlgorithm_def, algorithm_def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAlgorithm()
  {
    return algorithm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlgorithm(String newAlgorithm)
  {
    String oldAlgorithm = algorithm;
    algorithm = newAlgorithm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__ALGORITHM, oldAlgorithm, algorithm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isLeaf_size_def()
  {
    return leaf_size_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeaf_size_def(boolean newLeaf_size_def)
  {
    boolean oldLeaf_size_def = leaf_size_def;
    leaf_size_def = newLeaf_size_def;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__LEAF_SIZE_DEF, oldLeaf_size_def, leaf_size_def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getLeaf_size()
  {
    return leaf_size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeaf_size(int newLeaf_size)
  {
    int oldLeaf_size = leaf_size;
    leaf_size = newLeaf_size;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__LEAF_SIZE, oldLeaf_size, leaf_size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isP_def()
  {
    return p_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setP_def(boolean newP_def)
  {
    boolean oldP_def = p_def;
    p_def = newP_def;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__PDEF, oldP_def, p_def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getP()
  {
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setP(int newP)
  {
    int oldP = p;
    p = newP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__P, oldP, p));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isMetric_def()
  {
    return metric_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMetric_def(boolean newMetric_def)
  {
    boolean oldMetric_def = metric_def;
    metric_def = newMetric_def;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__METRIC_DEF, oldMetric_def, metric_def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMetric()
  {
    return metric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMetric(String newMetric)
  {
    String oldMetric = metric;
    metric = newMetric;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__METRIC, oldMetric, metric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isN_jobs_def()
  {
    return n_jobs_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setN_jobs_def(boolean newN_jobs_def)
  {
    boolean oldN_jobs_def = n_jobs_def;
    n_jobs_def = newN_jobs_def;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NJOBS_DEF, oldN_jobs_def, n_jobs_def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getN_jobs()
  {
    return n_jobs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setN_jobs(int newN_jobs)
  {
    int oldN_jobs = n_jobs;
    n_jobs = newN_jobs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NJOBS, oldN_jobs, n_jobs));
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
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS_DEF:
        return isN_neighbors_def();
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS:
        return getN_neighbors();
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__WEIGHTS_DEF:
        return isWeights_def();
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__WEIGHTS:
        return getWeights();
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__ALGORITHM_DEF:
        return isAlgorithm_def();
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__ALGORITHM:
        return getAlgorithm();
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__LEAF_SIZE_DEF:
        return isLeaf_size_def();
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__LEAF_SIZE:
        return getLeaf_size();
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__PDEF:
        return isP_def();
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__P:
        return getP();
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__METRIC_DEF:
        return isMetric_def();
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__METRIC:
        return getMetric();
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NJOBS_DEF:
        return isN_jobs_def();
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NJOBS:
        return getN_jobs();
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
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS_DEF:
        setN_neighbors_def((Boolean)newValue);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS:
        setN_neighbors((Integer)newValue);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__WEIGHTS_DEF:
        setWeights_def((Boolean)newValue);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__WEIGHTS:
        setWeights((String)newValue);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__ALGORITHM_DEF:
        setAlgorithm_def((Boolean)newValue);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__ALGORITHM:
        setAlgorithm((String)newValue);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__LEAF_SIZE_DEF:
        setLeaf_size_def((Boolean)newValue);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__LEAF_SIZE:
        setLeaf_size((Integer)newValue);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__PDEF:
        setP_def((Boolean)newValue);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__P:
        setP((Integer)newValue);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__METRIC_DEF:
        setMetric_def((Boolean)newValue);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__METRIC:
        setMetric((String)newValue);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NJOBS_DEF:
        setN_jobs_def((Boolean)newValue);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NJOBS:
        setN_jobs((Integer)newValue);
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
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS_DEF:
        setN_neighbors_def(NNEIGHBORS_DEF_EDEFAULT);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS:
        setN_neighbors(NNEIGHBORS_EDEFAULT);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__WEIGHTS_DEF:
        setWeights_def(WEIGHTS_DEF_EDEFAULT);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__WEIGHTS:
        setWeights(WEIGHTS_EDEFAULT);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__ALGORITHM_DEF:
        setAlgorithm_def(ALGORITHM_DEF_EDEFAULT);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__ALGORITHM:
        setAlgorithm(ALGORITHM_EDEFAULT);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__LEAF_SIZE_DEF:
        setLeaf_size_def(LEAF_SIZE_DEF_EDEFAULT);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__LEAF_SIZE:
        setLeaf_size(LEAF_SIZE_EDEFAULT);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__PDEF:
        setP_def(PDEF_EDEFAULT);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__P:
        setP(P_EDEFAULT);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__METRIC_DEF:
        setMetric_def(METRIC_DEF_EDEFAULT);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__METRIC:
        setMetric(METRIC_EDEFAULT);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NJOBS_DEF:
        setN_jobs_def(NJOBS_DEF_EDEFAULT);
        return;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NJOBS:
        setN_jobs(NJOBS_EDEFAULT);
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
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS_DEF:
        return n_neighbors_def != NNEIGHBORS_DEF_EDEFAULT;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NNEIGHBORS:
        return n_neighbors != NNEIGHBORS_EDEFAULT;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__WEIGHTS_DEF:
        return weights_def != WEIGHTS_DEF_EDEFAULT;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__WEIGHTS:
        return WEIGHTS_EDEFAULT == null ? weights != null : !WEIGHTS_EDEFAULT.equals(weights);
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__ALGORITHM_DEF:
        return algorithm_def != ALGORITHM_DEF_EDEFAULT;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__ALGORITHM:
        return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__LEAF_SIZE_DEF:
        return leaf_size_def != LEAF_SIZE_DEF_EDEFAULT;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__LEAF_SIZE:
        return leaf_size != LEAF_SIZE_EDEFAULT;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__PDEF:
        return p_def != PDEF_EDEFAULT;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__P:
        return p != P_EDEFAULT;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__METRIC_DEF:
        return metric_def != METRIC_DEF_EDEFAULT;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__METRIC:
        return METRIC_EDEFAULT == null ? metric != null : !METRIC_EDEFAULT.equals(metric);
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NJOBS_DEF:
        return n_jobs_def != NJOBS_DEF_EDEFAULT;
      case PerfectMLPackage.KNEIGHBORS_CLASSIFIER__NJOBS:
        return n_jobs != NJOBS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (n_neighbors_def: ");
    result.append(n_neighbors_def);
    result.append(", n_neighbors: ");
    result.append(n_neighbors);
    result.append(", weights_def: ");
    result.append(weights_def);
    result.append(", weights: ");
    result.append(weights);
    result.append(", algorithm_def: ");
    result.append(algorithm_def);
    result.append(", algorithm: ");
    result.append(algorithm);
    result.append(", leaf_size_def: ");
    result.append(leaf_size_def);
    result.append(", leaf_size: ");
    result.append(leaf_size);
    result.append(", p_def: ");
    result.append(p_def);
    result.append(", p: ");
    result.append(p);
    result.append(", metric_def: ");
    result.append(metric_def);
    result.append(", metric: ");
    result.append(metric);
    result.append(", n_jobs_def: ");
    result.append(n_jobs_def);
    result.append(", n_jobs: ");
    result.append(n_jobs);
    result.append(')');
    return result.toString();
  }

} //KNeighborsClassifierImpl
