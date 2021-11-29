/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.perfectML.generator;

import com.google.common.base.Objects;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.perfectML.perfectML.Algorithm;
import org.xtext.example.perfectML.perfectML.BOOL;
import org.xtext.example.perfectML.perfectML.ColumnDeclarations;
import org.xtext.example.perfectML.perfectML.ColumnSet;
import org.xtext.example.perfectML.perfectML.FLOAT;
import org.xtext.example.perfectML.perfectML.Input;
import org.xtext.example.perfectML.perfectML.KNeighborsClassifier;
import org.xtext.example.perfectML.perfectML.MLPClassifier;
import org.xtext.example.perfectML.perfectML.Output;
import org.xtext.example.perfectML.perfectML.PerfectMLFile;
import org.xtext.example.perfectML.perfectML.Program;
import org.xtext.example.perfectML.perfectML.SVC;
import org.xtext.example.perfectML.perfectML.TrainingAmount;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PerfectMLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
  
  protected String _compile(final PerfectMLFile file) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import pandas as pd");
      _builder.newLine();
      _builder.append("import numpy as np");
      _builder.newLine();
      String res = _builder.toString();
      EList<Program> _programs = file.getPrograms();
      for (final Program prog : _programs) {
        String _res = res;
        String _compile = this.compile(prog);
        res = (_res + _compile);
      }
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  protected String _compile(final Program prog) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    String _compile = this.compile(prog.getInput());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    String _compile_1 = this.compile(prog.getOutput());
    _builder.append(_compile_1);
    _builder.newLineIfNotEmpty();
    String _compile_2 = this.compile(prog.getAlgo());
    _builder.append(_compile_2);
    _builder.newLineIfNotEmpty();
    String _compile_3 = this.compile(prog.getNbtraining());
    _builder.append(_compile_3);
    _builder.newLineIfNotEmpty();
    _builder.append("pred_indexes = set([n for n in range(len(in_file)-1)])");
    _builder.newLine();
    _builder.append("target_indexes = set([len(in_file) - 1])");
    _builder.newLine();
    {
      ColumnDeclarations _column = prog.getColumn();
      boolean _tripleNotEquals = (_column != null);
      if (_tripleNotEquals) {
        String _compile_4 = this.compile(prog.getColumn());
        _builder.append(_compile_4);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("training_lines = in_file[:linesep]");
    _builder.newLine();
    _builder.append("testing_lines = in_file[linesep:]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("training_data = training_lines[:, pred_indexes]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("training_targets = training_lines[:, target_indexes]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("test_data = testing_lines[:, pred_indexes]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("result = []");
    _builder.newLine();
    _builder.newLine();
    _builder.append("for column in training_targets:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("clf.fit(training_data, column)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("result.append(clf.predict(test_data))");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# write result to a csv file");
    _builder.newLine();
    _builder.append("pd.DataFrame.to_csv(out_file, result)");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _compile(final Input input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("input_path = \"");
    String _pATH = input.getPATH();
    _builder.append(_pATH);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("in_file = pd.read_csv(input_path).to_numpy()");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _compile(final Output output) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("out_file = \"");
    String _pATH = output.getPATH();
    _builder.append(_pATH);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _compile(final SVC algoSVC) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from sklearn.svm import SVC");
    _builder.newLine();
    _builder.append("clf = SVC()");
    _builder.newLine();
    String _compileParams = this.compileParams(algoSVC);
    _builder.append(_compileParams);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _compile(final MLPClassifier algoMLP) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from sklearn.neural_network import MLPClassifier");
    _builder.newLine();
    _builder.append("clf = MLPClassifier()");
    _builder.newLine();
    String _compileParams = this.compileParams(algoMLP);
    _builder.append(_compileParams);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _compile(final KNeighborsClassifier algoKN) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from sklearn.neighbors import KNeighborsClassifier");
    _builder.newLine();
    _builder.append("clf = KNeighborsClassifier()");
    _builder.newLine();
    String _compileParams = this.compileParams(algoKN);
    _builder.append(_compileParams);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _compileParams(final SVC algoSVC) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isC_def = algoSVC.isC_def();
      if (_isC_def) {
        _builder.append("clf.set_params(c=");
        String _compile = this.compile(algoSVC.getC());
        _builder.append(_compile);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isKernel_def = algoSVC.isKernel_def();
      if (_isKernel_def) {
        _builder.append("clf.set_params(kernel=\'");
        String _kernel = algoSVC.getKernel();
        _builder.append(_kernel);
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isDegree_def = algoSVC.isDegree_def();
      if (_isDegree_def) {
        _builder.append("clf.set_params(degree=");
        int _degree = algoSVC.getDegree();
        _builder.append(_degree);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isGamma_def = algoSVC.isGamma_def();
      if (_isGamma_def) {
        _builder.append("clf.set_params(gamma=\'");
        String _gamma = algoSVC.getGamma();
        _builder.append(_gamma);
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isCoef0_def = algoSVC.isCoef0_def();
      if (_isCoef0_def) {
        _builder.append("clf.set_params(coef0=");
        String _compile_1 = this.compile(algoSVC.getCoef0());
        _builder.append(_compile_1);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isShrinking_def = algoSVC.isShrinking_def();
      if (_isShrinking_def) {
        _builder.append("clf.set_params(shrinking=");
        String _compile_2 = this.compile(algoSVC.getShrinking());
        _builder.append(_compile_2);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isProbability_def = algoSVC.isProbability_def();
      if (_isProbability_def) {
        _builder.append("clf.set_params(probability=");
        String _compile_3 = this.compile(algoSVC.getProbability());
        _builder.append(_compile_3);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isTol_def = algoSVC.isTol_def();
      if (_isTol_def) {
        _builder.append("clf.set_params(tol=");
        String _compile_4 = this.compile(algoSVC.getTol());
        _builder.append(_compile_4);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isCache_size_def = algoSVC.isCache_size_def();
      if (_isCache_size_def) {
        _builder.append("clf.set_params(cache_size=");
        String _compile_5 = this.compile(algoSVC.getCache_size());
        _builder.append(_compile_5);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isVerbose_def = algoSVC.isVerbose_def();
      if (_isVerbose_def) {
        _builder.append("clf.set_params(verbose=");
        String _compile_6 = this.compile(algoSVC.getVerbose());
        _builder.append(_compile_6);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isMax_iter_def = algoSVC.isMax_iter_def();
      if (_isMax_iter_def) {
        _builder.append("clf.set_params(max_iter=");
        int _max_iter = algoSVC.getMax_iter();
        _builder.append(_max_iter);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isDecision_function_shape_def = algoSVC.isDecision_function_shape_def();
      if (_isDecision_function_shape_def) {
        _builder.append("clf.set_params(decision_function_shape=\'");
        String _decision_function_shape = algoSVC.getDecision_function_shape();
        _builder.append(_decision_function_shape);
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isBreak_ties_def = algoSVC.isBreak_ties_def();
      if (_isBreak_ties_def) {
        _builder.append("clf.set_params(break_ties=");
        String _compile_7 = this.compile(algoSVC.getBreak_ties());
        _builder.append(_compile_7);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isRandom_state_def = algoSVC.isRandom_state_def();
      if (_isRandom_state_def) {
        _builder.append("clf.set_params(random_state=");
        int _random_state = algoSVC.getRandom_state();
        _builder.append(_random_state);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected String _compileParams(final MLPClassifier algoMLP) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isHidden_layer_sizes_def = algoMLP.isHidden_layer_sizes_def();
      if (_isHidden_layer_sizes_def) {
        _builder.append("clf.set_params(hidden_layer_sizes=");
        EList<Integer> _hidden_layer_sizes = algoMLP.getHidden_layer_sizes();
        _builder.append(_hidden_layer_sizes);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isActivation_def = algoMLP.isActivation_def();
      if (_isActivation_def) {
        _builder.append("clf.set_params(activation=\'");
        String _activation = algoMLP.getActivation();
        _builder.append(_activation);
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isSolver_def = algoMLP.isSolver_def();
      if (_isSolver_def) {
        _builder.append("clf.set_params(solver=\'");
        String _solver = algoMLP.getSolver();
        _builder.append(_solver);
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isAlpha_def = algoMLP.isAlpha_def();
      if (_isAlpha_def) {
        _builder.append("clf.set_params(alpha=");
        String _compile = this.compile(algoMLP.getAlpha());
        _builder.append(_compile);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isBatch_size_def = algoMLP.isBatch_size_def();
      if (_isBatch_size_def) {
        _builder.append("clf.set_params(batch_size=");
        int _batch_size = algoMLP.getBatch_size();
        _builder.append(_batch_size);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isLearning_rate_def = algoMLP.isLearning_rate_def();
      if (_isLearning_rate_def) {
        _builder.append("clf.set_params(learning_rate=\'");
        String _learning_rate = algoMLP.getLearning_rate();
        _builder.append(_learning_rate);
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isLearning_rate_init_def = algoMLP.isLearning_rate_init_def();
      if (_isLearning_rate_init_def) {
        _builder.append("clf.set_params(learning_rate_init=");
        String _compile_1 = this.compile(algoMLP.getLearning_rate_init());
        _builder.append(_compile_1);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isPower_t_def = algoMLP.isPower_t_def();
      if (_isPower_t_def) {
        _builder.append("clf.set_params(power_t=");
        String _compile_2 = this.compile(algoMLP.getPower_t());
        _builder.append(_compile_2);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isMax_iteer_def = algoMLP.isMax_iteer_def();
      if (_isMax_iteer_def) {
        _builder.append("clf.set_params(max_iter=");
        String _compile_3 = this.compile(algoMLP.getMax_iter());
        _builder.append(_compile_3);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isShuffle_def = algoMLP.isShuffle_def();
      if (_isShuffle_def) {
        _builder.append("clf.set_params(shuffle=");
        String _compile_4 = this.compile(algoMLP.getShuffle());
        _builder.append(_compile_4);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isRandom_state_def = algoMLP.isRandom_state_def();
      if (_isRandom_state_def) {
        _builder.append("clf.set_params(random_state=");
        int _random_state = algoMLP.getRandom_state();
        _builder.append(_random_state);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isTolerance_def = algoMLP.isTolerance_def();
      if (_isTolerance_def) {
        _builder.append("clf.set_params(tolerance=");
        String _compile_5 = this.compile(algoMLP.getTolerance());
        _builder.append(_compile_5);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isVerbose_def = algoMLP.isVerbose_def();
      if (_isVerbose_def) {
        _builder.append("clf.set_params(verbose=");
        String _compile_6 = this.compile(algoMLP.getVerbose());
        _builder.append(_compile_6);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isWarm_start_def = algoMLP.isWarm_start_def();
      if (_isWarm_start_def) {
        _builder.append("clf.set_params(warm_start=");
        String _compile_7 = this.compile(algoMLP.getWarm_start());
        _builder.append(_compile_7);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isMomentum_def = algoMLP.isMomentum_def();
      if (_isMomentum_def) {
        _builder.append("clf.set_params(momentum=");
        String _compile_8 = this.compile(algoMLP.getMomentum());
        _builder.append(_compile_8);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isNesterovs_momentum_def = algoMLP.isNesterovs_momentum_def();
      if (_isNesterovs_momentum_def) {
        _builder.append("clf.set_params(nesterovs_momentum=");
        String _compile_9 = this.compile(algoMLP.getNesterovs_momentum());
        _builder.append(_compile_9);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isEarly_stopping_def = algoMLP.isEarly_stopping_def();
      if (_isEarly_stopping_def) {
        _builder.append("clf.set_params(early_stopping=");
        String _compile_10 = this.compile(algoMLP.getEarly_stopping());
        _builder.append(_compile_10);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isValidation_fraction_def = algoMLP.isValidation_fraction_def();
      if (_isValidation_fraction_def) {
        _builder.append("clf.set_params(validation_fraction=");
        String _compile_11 = this.compile(algoMLP.getValidation_fraction());
        _builder.append(_compile_11);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isBeta_1_def = algoMLP.isBeta_1_def();
      if (_isBeta_1_def) {
        _builder.append("clf.set_params(beta_1=");
        String _compile_12 = this.compile(algoMLP.getBeta_1());
        _builder.append(_compile_12);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isBeta_2_def = algoMLP.isBeta_2_def();
      if (_isBeta_2_def) {
        _builder.append("clf.set_params(beta_2=");
        String _compile_13 = this.compile(algoMLP.getBeta_2());
        _builder.append(_compile_13);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isEpsilon_def = algoMLP.isEpsilon_def();
      if (_isEpsilon_def) {
        _builder.append("clf.set_params(epsilon=");
        String _compile_14 = this.compile(algoMLP.getEpsilon());
        _builder.append(_compile_14);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isN_iter_no_change_def = algoMLP.isN_iter_no_change_def();
      if (_isN_iter_no_change_def) {
        _builder.append("clf.set_params(n_iter_no_change=");
        int _n_iter_no_change = algoMLP.getN_iter_no_change();
        _builder.append(_n_iter_no_change);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isMax_fun_def = algoMLP.isMax_fun_def();
      if (_isMax_fun_def) {
        _builder.append("clf.set_params(max_fun=");
        int _max_fun = algoMLP.getMax_fun();
        _builder.append(_max_fun);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected String _compileParams(final KNeighborsClassifier algoKN) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isN_neighbors_def = algoKN.isN_neighbors_def();
      if (_isN_neighbors_def) {
        _builder.append("clf.set_params(n_neighbors=");
        int _n_neighbors = algoKN.getN_neighbors();
        _builder.append(_n_neighbors);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isWeights_def = algoKN.isWeights_def();
      if (_isWeights_def) {
        _builder.append("clf.set_params(weights=\'");
        String _weights = algoKN.getWeights();
        _builder.append(_weights);
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isAlgorithm_def = algoKN.isAlgorithm_def();
      if (_isAlgorithm_def) {
        _builder.append("clf.set_params(algorithm=\'");
        String _algorithm = algoKN.getAlgorithm();
        _builder.append(_algorithm);
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isLeaf_size_def = algoKN.isLeaf_size_def();
      if (_isLeaf_size_def) {
        _builder.append("clf.set_params(leaf_size=");
        int _leaf_size = algoKN.getLeaf_size();
        _builder.append(_leaf_size);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isP_def = algoKN.isP_def();
      if (_isP_def) {
        _builder.append("clf.set_params(p=");
        int _p = algoKN.getP();
        _builder.append(_p);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isMetric_def = algoKN.isMetric_def();
      if (_isMetric_def) {
        _builder.append("clf.set_params(metric=\'");
        String _metric = algoKN.getMetric();
        _builder.append(_metric);
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isN_jobs_def = algoKN.isN_jobs_def();
      if (_isN_jobs_def) {
        _builder.append("clf.set_params(n_jobs=");
        int _n_jobs = algoKN.getN_jobs();
        _builder.append(_n_jobs);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected String _compile(final TrainingAmount training) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isPercent = training.isPercent();
      if (_isPercent) {
        _builder.append("linesep = (");
        int _value = training.getValue();
        _builder.append(_value);
        _builder.append(" / 100) * len(in_file)");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("linesep = ");
        int _value_1 = training.getValue();
        _builder.append(_value_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected String _compile(final ColumnDeclarations col) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("target_indexes = ");
    String _compile = this.compile(col.getTarget());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    {
      boolean _isPred_def = col.isPred_def();
      if (_isPred_def) {
        _builder.append("predictive_indexes = ");
        String _compile_1 = this.compile(col.getPredictive());
        _builder.append(_compile_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("pred_indexes = pred_indexes.difference(target_indexes)");
    _builder.newLine();
    _builder.append("pred_indexes = list(pred_indexes)");
    _builder.newLine();
    _builder.append("target_indexes = list(target_indexes)");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _compile(final ColumnSet colset) {
    String _xifexpression = null;
    boolean _isOp = colset.isOp();
    if (_isOp) {
      StringConcatenation _builder = new StringConcatenation();
      String _compile = this.compile(colset.getArgBin1());
      _builder.append(_compile);
      {
        String _type = colset.getOpType().getType();
        boolean _equals = Objects.equal(_type, "and");
        if (_equals) {
          _builder.append(".union(");
        } else {
          _builder.append(".difference(");
        }
      }
      String _compile_1 = this.compile(colset.getArgBin2());
      _builder.append(_compile_1);
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder.toString();
    } else {
      String _xifexpression_1 = null;
      boolean _isRange = colset.isRange();
      if (_isRange) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("set([n for n in range(");
        int _argR1 = colset.getArgR1();
        _builder_1.append(_argR1);
        _builder_1.append(",");
        int _argR2 = colset.getArgR2();
        _builder_1.append(_argR2);
        _builder_1.append("+1)])");
        _builder_1.newLineIfNotEmpty();
        _xifexpression_1 = _builder_1.toString();
      } else {
        String _xifexpression_2 = null;
        boolean _isList = colset.isList();
        if (_isList) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("set([");
          String _join = IterableExtensions.join(colset.getArgList(), " ");
          _builder_2.append(_join);
          _builder_2.append("])");
          _builder_2.newLineIfNotEmpty();
          _xifexpression_2 = _builder_2.toString();
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected String _compile(final BOOL b) {
    return b.getValue();
  }
  
  protected String _compile(final FLOAT f) {
    int _intPart = f.getIntPart();
    String _plus = (Integer.valueOf(_intPart) + ".");
    int _decPart = f.getDecPart();
    return (_plus + Integer.valueOf(_decPart));
  }
  
  public void eval(final PerfectMLFile file) {
    EList<Program> _programs = file.getPrograms();
    for (final Program p : _programs) {
      this.eval(p);
    }
  }
  
  public List<List<String>> eval(final Program prog) {
    try {
      final String in_file = prog.getInput().getPATH();
      final String out_file = prog.getOutput().getPATH();
      final boolean isPercent = prog.getNbtraining().isPercent();
      final List<List<String>> data = new ArrayList<List<String>>();
      try (final BufferedReader br = new Function0<BufferedReader>() {
        @Override
        public BufferedReader apply() {
          try {
            FileReader _fileReader = new FileReader(in_file);
            return new BufferedReader(_fileReader);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      }.apply()) {
        String line = null;
        while (((line = br.readLine()) != null)) {
          {
            final String[] values = line.split(",");
            data.add(Arrays.<String>asList(values));
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          System.out.println(("Could not read from " + in_file));
          return new ArrayList<List<String>>();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      int linesep = 0;
      if (isPercent) {
        int _value = prog.getNbtraining().getValue();
        int _divide = (_value / 100);
        int _length = ((Object[])Conversions.unwrapArray(data, Object.class)).length;
        int _multiply = (_divide * _length);
        linesep = _multiply;
      } else {
        linesep = prog.getNbtraining().getValue();
      }
      final List<String>[] trainingLines = Arrays.<List<String>>copyOfRange(((List<String>[])Conversions.unwrapArray(data, List.class)), 0, linesep);
      final List<String>[] testingLines = Arrays.<List<String>>copyOfRange(((List<String>[])Conversions.unwrapArray(data, List.class)), linesep, ((Object[])Conversions.unwrapArray(data, Object.class)).length);
      final Set<Integer>[] indexes = this.eval(prog.getColumn(), ((Object[])Conversions.unwrapArray(data.get(0), Object.class)).length);
      final Set<Integer> pred_indexes = indexes[1];
      final ArrayList<ArrayList<String>> training_targets = new ArrayList<ArrayList<String>>();
      for (final Integer i : pred_indexes) {
        {
          final ArrayList<String> resClass = new ArrayList<String>();
          for (int j = 0; (j < trainingLines.length); j++) {
            resClass.add((trainingLines[j]).get((i).intValue()));
          }
          training_targets.add(resClass);
        }
      }
      final List<List<String>> result = new ArrayList<List<String>>();
      for (final List<String> entry : testingLines) {
        {
          final Random rand = new Random();
          final int n = rand.nextInt(training_targets.size());
          result.add(training_targets.get(n));
        }
      }
      try (final FileWriter writer = new Function0<FileWriter>() {
        @Override
        public FileWriter apply() {
          try {
            return new FileWriter(out_file);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      }.apply()) {
        for (final List<String> line : result) {
          String _join = IterableExtensions.join(line, ",");
          String _plus = (_join + "\n");
          writer.append(_plus);
        }
      }
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Set<Integer>[] eval(final ColumnDeclarations col, final int size) {
    final Set<Integer> targets = this.eval(col.getTarget());
    Set<Integer> pred = null;
    boolean _isPred_def = col.isPred_def();
    if (_isPred_def) {
      pred = this.eval(col.getPredictive());
    } else {
      for (int i = 0; (i < (size - 1)); i++) {
        pred.add(Integer.valueOf(i));
      }
    }
    pred.removeAll(targets);
    return new Set[] { targets, pred };
  }
  
  public Set<Integer> eval(final ColumnSet colset) {
    Set<Integer> _xifexpression = null;
    boolean _isOp = colset.isOp();
    if (_isOp) {
      Set<Integer> _xblockexpression = null;
      {
        final Set<Integer> result = this.eval(colset.getArgBin1());
        String _type = colset.getOpType().getType();
        boolean _equals = Objects.equal(_type, "and");
        if (_equals) {
          result.addAll(this.eval(colset.getArgBin2()));
        } else {
          result.removeAll(this.eval(colset.getArgBin2()));
        }
        _xblockexpression = result;
      }
      _xifexpression = _xblockexpression;
    } else {
      HashSet<Integer> _xifexpression_1 = null;
      boolean _isRange = colset.isRange();
      if (_isRange) {
        HashSet<Integer> _xblockexpression_1 = null;
        {
          final HashSet<Integer> result = new HashSet<Integer>();
          for (int i = colset.getArgR1(); (i <= colset.getArgR2()); i++) {
            result.add(Integer.valueOf(i));
          }
          _xblockexpression_1 = result;
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        HashSet<Integer> _xifexpression_2 = null;
        boolean _isList = colset.isList();
        if (_isList) {
          HashSet<Integer> _xblockexpression_2 = null;
          {
            final HashSet<Integer> result = new HashSet<Integer>();
            EList<Integer> _argList = colset.getArgList();
            for (final Integer i : _argList) {
              result.add(i);
            }
            _xblockexpression_2 = result;
          }
          _xifexpression_2 = _xblockexpression_2;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String compile(final EObject algoKN) {
    if (algoKN instanceof KNeighborsClassifier) {
      return _compile((KNeighborsClassifier)algoKN);
    } else if (algoKN instanceof MLPClassifier) {
      return _compile((MLPClassifier)algoKN);
    } else if (algoKN instanceof SVC) {
      return _compile((SVC)algoKN);
    } else if (algoKN instanceof BOOL) {
      return _compile((BOOL)algoKN);
    } else if (algoKN instanceof ColumnDeclarations) {
      return _compile((ColumnDeclarations)algoKN);
    } else if (algoKN instanceof ColumnSet) {
      return _compile((ColumnSet)algoKN);
    } else if (algoKN instanceof FLOAT) {
      return _compile((FLOAT)algoKN);
    } else if (algoKN instanceof Input) {
      return _compile((Input)algoKN);
    } else if (algoKN instanceof Output) {
      return _compile((Output)algoKN);
    } else if (algoKN instanceof PerfectMLFile) {
      return _compile((PerfectMLFile)algoKN);
    } else if (algoKN instanceof Program) {
      return _compile((Program)algoKN);
    } else if (algoKN instanceof TrainingAmount) {
      return _compile((TrainingAmount)algoKN);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(algoKN).toString());
    }
  }
  
  public String compileParams(final Algorithm algoKN) {
    if (algoKN instanceof KNeighborsClassifier) {
      return _compileParams((KNeighborsClassifier)algoKN);
    } else if (algoKN instanceof MLPClassifier) {
      return _compileParams((MLPClassifier)algoKN);
    } else if (algoKN instanceof SVC) {
      return _compileParams((SVC)algoKN);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(algoKN).toString());
    }
  }
}
