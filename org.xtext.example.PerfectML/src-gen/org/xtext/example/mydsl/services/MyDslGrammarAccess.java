/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cBlocsFileAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cBlocsFileFileParserRuleCall_0_0 = (RuleCall)cBlocsFileAssignment_0.eContents().get(0);
		private final Assignment cBlocsAlgoAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBlocsAlgoAlgorithmParserRuleCall_1_0 = (RuleCall)cBlocsAlgoAssignment_1.eContents().get(0);
		private final Assignment cBlocsParaAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBlocsParaParameterDeclarationParserRuleCall_2_0 = (RuleCall)cBlocsParaAssignment_2.eContents().get(0);
		private final Assignment cBlocsColuAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBlocsColuColumnDeclarationsParserRuleCall_3_0 = (RuleCall)cBlocsColuAssignment_3.eContents().get(0);
		
		//Program:
		//    blocsFile = File
		//    blocsAlgo = Algorithm
		//    blocsPara = ParameterDeclaration
		//    blocsColu = ColumnDeclarations
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//blocsFile = File
		//blocsAlgo = Algorithm
		//blocsPara = ParameterDeclaration
		//blocsColu = ColumnDeclarations
		public Group getGroup() { return cGroup; }
		
		//blocsFile = File
		public Assignment getBlocsFileAssignment_0() { return cBlocsFileAssignment_0; }
		
		//File
		public RuleCall getBlocsFileFileParserRuleCall_0_0() { return cBlocsFileFileParserRuleCall_0_0; }
		
		//blocsAlgo = Algorithm
		public Assignment getBlocsAlgoAssignment_1() { return cBlocsAlgoAssignment_1; }
		
		//Algorithm
		public RuleCall getBlocsAlgoAlgorithmParserRuleCall_1_0() { return cBlocsAlgoAlgorithmParserRuleCall_1_0; }
		
		//blocsPara = ParameterDeclaration
		public Assignment getBlocsParaAssignment_2() { return cBlocsParaAssignment_2; }
		
		//ParameterDeclaration
		public RuleCall getBlocsParaParameterDeclarationParserRuleCall_2_0() { return cBlocsParaParameterDeclarationParserRuleCall_2_0; }
		
		//blocsColu = ColumnDeclarations
		public Assignment getBlocsColuAssignment_3() { return cBlocsColuAssignment_3; }
		
		//ColumnDeclarations
		public RuleCall getBlocsColuColumnDeclarationsParserRuleCall_3_0() { return cBlocsColuColumnDeclarationsParserRuleCall_3_0; }
	}
	public class FileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.File");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUseSourceDataKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPATHAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPATHSTRINGTerminalRuleCall_1_0 = (RuleCall)cPATHAssignment_1.eContents().get(0);
		private final Keyword cLineFeedKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//File :
		//    'Use source data :' PATH=STRING '\n'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Use source data :' PATH=STRING '\n'
		public Group getGroup() { return cGroup; }
		
		//'Use source data :'
		public Keyword getUseSourceDataKeyword_0() { return cUseSourceDataKeyword_0; }
		
		//PATH=STRING
		public Assignment getPATHAssignment_1() { return cPATHAssignment_1; }
		
		//STRING
		public RuleCall getPATHSTRINGTerminalRuleCall_1_0() { return cPATHSTRINGTerminalRuleCall_1_0; }
		
		//'\n'
		public Keyword getLineFeedKeyword_2() { return cLineFeedKeyword_2; }
	}
	public class AlgorithmElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Algorithm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAlgorithmAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUseAlgorithmKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cWithKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cBlocAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cBlocAlgoDeclarationParserRuleCall_4_0_0 = (RuleCall)cBlocAssignment_4_0.eContents().get(0);
		private final Keyword cLineFeedKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		
		//Algorithm :
		//    {Algorithm} 'Use algorithm' Name = ID 'with\n' (Bloc+=AlgoDeclaration '\n')*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Algorithm} 'Use algorithm' Name = ID 'with\n' (Bloc+=AlgoDeclaration '\n')*
		public Group getGroup() { return cGroup; }
		
		//{Algorithm}
		public Action getAlgorithmAction_0() { return cAlgorithmAction_0; }
		
		//'Use algorithm'
		public Keyword getUseAlgorithmKeyword_1() { return cUseAlgorithmKeyword_1; }
		
		//Name = ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'with\n'
		public Keyword getWithKeyword_3() { return cWithKeyword_3; }
		
		//(Bloc+=AlgoDeclaration '\n')*
		public Group getGroup_4() { return cGroup_4; }
		
		//Bloc+=AlgoDeclaration
		public Assignment getBlocAssignment_4_0() { return cBlocAssignment_4_0; }
		
		//AlgoDeclaration
		public RuleCall getBlocAlgoDeclarationParserRuleCall_4_0_0() { return cBlocAlgoDeclarationParserRuleCall_4_0_0; }
		
		//'\n'
		public Keyword getLineFeedKeyword_4_1() { return cLineFeedKeyword_4_1; }
	}
	public class ParameterDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ParameterDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cParameterDeclarationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUseParametersKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cBlocAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cBlocParaDeclarationParserRuleCall_2_0_0 = (RuleCall)cBlocAssignment_2_0.eContents().get(0);
		private final Keyword cLineFeedKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		
		//ParameterDeclaration :
		//    {ParameterDeclaration} 'Use parameters :\n' (Bloc+=ParaDeclaration '\n')*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{ParameterDeclaration} 'Use parameters :\n' (Bloc+=ParaDeclaration '\n')*
		public Group getGroup() { return cGroup; }
		
		//{ParameterDeclaration}
		public Action getParameterDeclarationAction_0() { return cParameterDeclarationAction_0; }
		
		//'Use parameters :\n'
		public Keyword getUseParametersKeyword_1() { return cUseParametersKeyword_1; }
		
		//(Bloc+=ParaDeclaration '\n')*
		public Group getGroup_2() { return cGroup_2; }
		
		//Bloc+=ParaDeclaration
		public Assignment getBlocAssignment_2_0() { return cBlocAssignment_2_0; }
		
		//ParaDeclaration
		public RuleCall getBlocParaDeclarationParserRuleCall_2_0_0() { return cBlocParaDeclarationParserRuleCall_2_0_0; }
		
		//'\n'
		public Keyword getLineFeedKeyword_2_1() { return cLineFeedKeyword_2_1; }
	}
	public class ColumnDeclarationsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ColumnDeclarations");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cColumnDeclarationsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUseColumnsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cBlocAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cBlocColumnDeclarationParserRuleCall_2_0_0 = (RuleCall)cBlocAssignment_2_0.eContents().get(0);
		private final Keyword cLineFeedKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		
		//ColumnDeclarations :
		//    {ColumnDeclarations} 'Use columns :\n' (Bloc+=ColumnDeclaration '\n')*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{ColumnDeclarations} 'Use columns :\n' (Bloc+=ColumnDeclaration '\n')*
		public Group getGroup() { return cGroup; }
		
		//{ColumnDeclarations}
		public Action getColumnDeclarationsAction_0() { return cColumnDeclarationsAction_0; }
		
		//'Use columns :\n'
		public Keyword getUseColumnsKeyword_1() { return cUseColumnsKeyword_1; }
		
		//(Bloc+=ColumnDeclaration '\n')*
		public Group getGroup_2() { return cGroup_2; }
		
		//Bloc+=ColumnDeclaration
		public Assignment getBlocAssignment_2_0() { return cBlocAssignment_2_0; }
		
		//ColumnDeclaration
		public RuleCall getBlocColumnDeclarationParserRuleCall_2_0_0() { return cBlocColumnDeclarationParserRuleCall_2_0_0; }
		
		//'\n'
		public Keyword getLineFeedKeyword_2_1() { return cLineFeedKeyword_2_1; }
	}
	public class AlgoDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.AlgoDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cAsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//AlgoDeclaration :
		//    Name=ID 'as' Value=Value
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Name=ID 'as' Value=Value
		public Group getGroup() { return cGroup; }
		
		//Name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'as'
		public Keyword getAsKeyword_1() { return cAsKeyword_1; }
		
		//Value=Value
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_2_0() { return cValueValueParserRuleCall_2_0; }
	}
	public class ParaDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ParaDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cValuesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//ParaDeclaration :
		//    Name=ID 'values' Value=Value
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Name=ID 'values' Value=Value
		public Group getGroup() { return cGroup; }
		
		//Name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'values'
		public Keyword getValuesKeyword_1() { return cValuesKeyword_1; }
		
		//Value=Value
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_2_0() { return cValueValueParserRuleCall_2_0; }
	}
	public class ColumnDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ColumnDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cColumnsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cColumnsColumnSetParserRuleCall_0_0 = (RuleCall)cColumnsAssignment_0.eContents().get(0);
		private final Keyword cAsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTargetPredictiveParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//ColumnDeclaration :
		//    Columns = ColumnSet 'as' Type=TargetPredictive
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Columns = ColumnSet 'as' Type=TargetPredictive
		public Group getGroup() { return cGroup; }
		
		//Columns = ColumnSet
		public Assignment getColumnsAssignment_0() { return cColumnsAssignment_0; }
		
		//ColumnSet
		public RuleCall getColumnsColumnSetParserRuleCall_0_0() { return cColumnsColumnSetParserRuleCall_0_0; }
		
		//'as'
		public Keyword getAsKeyword_1() { return cAsKeyword_1; }
		
		//Type=TargetPredictive
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//TargetPredictive
		public RuleCall getTypeTargetPredictiveParserRuleCall_2_0() { return cTypeTargetPredictiveParserRuleCall_2_0; }
	}
	public class ColumnSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ColumnSet");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cArgBin1Assignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cArgBin1ColumnSetParserRuleCall_0_1_0 = (RuleCall)cArgBin1Assignment_0_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cOpTypeAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cOpTypeBinopParserRuleCall_0_3_0 = (RuleCall)cOpTypeAssignment_0_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_4 = (Keyword)cGroup_0.eContents().get(4);
		private final Assignment cArgBin2Assignment_0_5 = (Assignment)cGroup_0.eContents().get(5);
		private final RuleCall cArgBin2ColumnSetParserRuleCall_0_5_0 = (RuleCall)cArgBin2Assignment_0_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_6 = (Keyword)cGroup_0.eContents().get(6);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cFromKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cArgR1Assignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cArgR1INTTerminalRuleCall_1_1_0 = (RuleCall)cArgR1Assignment_1_1.eContents().get(0);
		private final Keyword cToKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cArgR2Assignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cArgR2INTTerminalRuleCall_1_3_0 = (RuleCall)cArgR2Assignment_1_3.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Assignment cArgListAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final RuleCall cArgListINTTerminalRuleCall_2_1_0_0 = (RuleCall)cArgListAssignment_2_1_0.eContents().get(0);
		private final Keyword cCommaKeyword_2_1_1 = (Keyword)cGroup_2_1.eContents().get(1);
		private final Assignment cArgListAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cArgListINTTerminalRuleCall_2_2_0 = (RuleCall)cArgListAssignment_2_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		
		//ColumnSet :
		//    '(' ArgBin1=ColumnSet ')' opType = Binop '(' ArgBin2=ColumnSet ')'
		//    |'From' ArgR1=INT 'to' ArgR2=INT
		//    |'[' (ArgList+=INT ',')* ArgList+=INT ']'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' ArgBin1=ColumnSet ')' opType = Binop '(' ArgBin2=ColumnSet ')'
		//|'From' ArgR1=INT 'to' ArgR2=INT
		//|'[' (ArgList+=INT ',')* ArgList+=INT ']'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' ArgBin1=ColumnSet ')' opType = Binop '(' ArgBin2=ColumnSet ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//ArgBin1=ColumnSet
		public Assignment getArgBin1Assignment_0_1() { return cArgBin1Assignment_0_1; }
		
		//ColumnSet
		public RuleCall getArgBin1ColumnSetParserRuleCall_0_1_0() { return cArgBin1ColumnSetParserRuleCall_0_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//opType = Binop
		public Assignment getOpTypeAssignment_0_3() { return cOpTypeAssignment_0_3; }
		
		//Binop
		public RuleCall getOpTypeBinopParserRuleCall_0_3_0() { return cOpTypeBinopParserRuleCall_0_3_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_4() { return cLeftParenthesisKeyword_0_4; }
		
		//ArgBin2=ColumnSet
		public Assignment getArgBin2Assignment_0_5() { return cArgBin2Assignment_0_5; }
		
		//ColumnSet
		public RuleCall getArgBin2ColumnSetParserRuleCall_0_5_0() { return cArgBin2ColumnSetParserRuleCall_0_5_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_6() { return cRightParenthesisKeyword_0_6; }
		
		//'From' ArgR1=INT 'to' ArgR2=INT
		public Group getGroup_1() { return cGroup_1; }
		
		//'From'
		public Keyword getFromKeyword_1_0() { return cFromKeyword_1_0; }
		
		//ArgR1=INT
		public Assignment getArgR1Assignment_1_1() { return cArgR1Assignment_1_1; }
		
		//INT
		public RuleCall getArgR1INTTerminalRuleCall_1_1_0() { return cArgR1INTTerminalRuleCall_1_1_0; }
		
		//'to'
		public Keyword getToKeyword_1_2() { return cToKeyword_1_2; }
		
		//ArgR2=INT
		public Assignment getArgR2Assignment_1_3() { return cArgR2Assignment_1_3; }
		
		//INT
		public RuleCall getArgR2INTTerminalRuleCall_1_3_0() { return cArgR2INTTerminalRuleCall_1_3_0; }
		
		//'[' (ArgList+=INT ',')* ArgList+=INT ']'
		public Group getGroup_2() { return cGroup_2; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_2_0() { return cLeftSquareBracketKeyword_2_0; }
		
		//(ArgList+=INT ',')*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ArgList+=INT
		public Assignment getArgListAssignment_2_1_0() { return cArgListAssignment_2_1_0; }
		
		//INT
		public RuleCall getArgListINTTerminalRuleCall_2_1_0_0() { return cArgListINTTerminalRuleCall_2_1_0_0; }
		
		//','
		public Keyword getCommaKeyword_2_1_1() { return cCommaKeyword_2_1_1; }
		
		//ArgList+=INT
		public Assignment getArgListAssignment_2_2() { return cArgListAssignment_2_2; }
		
		//INT
		public RuleCall getArgListINTTerminalRuleCall_2_2_0() { return cArgListINTTerminalRuleCall_2_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2_3() { return cRightSquareBracketKeyword_2_3; }
	}
	public class BinopElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Binop");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cTypeAndKeyword_0_0 = (Keyword)cTypeAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cTypeExceptKeyword_1_0 = (Keyword)cTypeAssignment_1.eContents().get(0);
		
		//Binop :
		//    type = 'and' | type = 'except'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//type = 'and' | type = 'except'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//type = 'and'
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//'and'
		public Keyword getTypeAndKeyword_0_0() { return cTypeAndKeyword_0_0; }
		
		//type = 'except'
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//'except'
		public Keyword getTypeExceptKeyword_1_0() { return cTypeExceptKeyword_1_0; }
	}
	public class TargetPredictiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.TargetPredictive");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cTypeTargetKeyword_0_0 = (Keyword)cTypeAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cTypePredictiveKeyword_1_0 = (Keyword)cTypeAssignment_1.eContents().get(0);
		
		//TargetPredictive :
		//    type = "target" | type = "predictive"
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//type = "target" | type = "predictive"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//type = "target"
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//"target"
		public Keyword getTypeTargetKeyword_0_0() { return cTypeTargetKeyword_0_0; }
		
		//type = "predictive"
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//"predictive"
		public Keyword getTypePredictiveKeyword_1_0() { return cTypePredictiveKeyword_1_0; }
	}
	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cIntAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cIntINTTerminalRuleCall_0_0 = (RuleCall)cIntAssignment_0.eContents().get(0);
		private final Assignment cStrAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cStrSTRINGTerminalRuleCall_1_0 = (RuleCall)cStrAssignment_1.eContents().get(0);
		private final Assignment cFloatAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cFloatFLOATParserRuleCall_2_0 = (RuleCall)cFloatAssignment_2.eContents().get(0);
		private final Assignment cBoolAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cBoolBOOLParserRuleCall_3_0 = (RuleCall)cBoolAssignment_3.eContents().get(0);
		
		//Value :
		//    int=INT | str=STRING | float=FLOAT | bool=BOOL
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//int=INT | str=STRING | float=FLOAT | bool=BOOL
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//int=INT
		public Assignment getIntAssignment_0() { return cIntAssignment_0; }
		
		//INT
		public RuleCall getIntINTTerminalRuleCall_0_0() { return cIntINTTerminalRuleCall_0_0; }
		
		//str=STRING
		public Assignment getStrAssignment_1() { return cStrAssignment_1; }
		
		//STRING
		public RuleCall getStrSTRINGTerminalRuleCall_1_0() { return cStrSTRINGTerminalRuleCall_1_0; }
		
		//float=FLOAT
		public Assignment getFloatAssignment_2() { return cFloatAssignment_2; }
		
		//FLOAT
		public RuleCall getFloatFLOATParserRuleCall_2_0() { return cFloatFLOATParserRuleCall_2_0; }
		
		//bool=BOOL
		public Assignment getBoolAssignment_3() { return cBoolAssignment_3; }
		
		//BOOL
		public RuleCall getBoolBOOLParserRuleCall_3_0() { return cBoolBOOLParserRuleCall_3_0; }
	}
	public class FLOATElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.FLOAT");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIntPartAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIntPartINTTerminalRuleCall_0_0 = (RuleCall)cIntPartAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDecPartAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDecPartINTTerminalRuleCall_2_0 = (RuleCall)cDecPartAssignment_2.eContents().get(0);
		
		//FLOAT :
		//    IntPart=INT '.' DecPart=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//IntPart=INT '.' DecPart=INT
		public Group getGroup() { return cGroup; }
		
		//IntPart=INT
		public Assignment getIntPartAssignment_0() { return cIntPartAssignment_0; }
		
		//INT
		public RuleCall getIntPartINTTerminalRuleCall_0_0() { return cIntPartINTTerminalRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//DecPart=INT
		public Assignment getDecPartAssignment_2() { return cDecPartAssignment_2; }
		
		//INT
		public RuleCall getDecPartINTTerminalRuleCall_2_0() { return cDecPartINTTerminalRuleCall_2_0; }
	}
	public class BOOLElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.BOOL");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cValueTrueKeyword_0_0 = (Keyword)cValueAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cValueFalseKeyword_1_0 = (Keyword)cValueAssignment_1.eContents().get(0);
		
		//BOOL :
		//    value = "true" | value = "false"
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value = "true" | value = "false"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//value = "true"
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }
		
		//"true"
		public Keyword getValueTrueKeyword_0_0() { return cValueTrueKeyword_0_0; }
		
		//value = "false"
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//"false"
		public Keyword getValueFalseKeyword_1_0() { return cValueFalseKeyword_1_0; }
	}
	
	
	private final ProgramElements pProgram;
	private final FileElements pFile;
	private final AlgorithmElements pAlgorithm;
	private final ParameterDeclarationElements pParameterDeclaration;
	private final ColumnDeclarationsElements pColumnDeclarations;
	private final AlgoDeclarationElements pAlgoDeclaration;
	private final ParaDeclarationElements pParaDeclaration;
	private final ColumnDeclarationElements pColumnDeclaration;
	private final ColumnSetElements pColumnSet;
	private final BinopElements pBinop;
	private final TargetPredictiveElements pTargetPredictive;
	private final ValueElements pValue;
	private final FLOATElements pFLOAT;
	private final BOOLElements pBOOL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProgram = new ProgramElements();
		this.pFile = new FileElements();
		this.pAlgorithm = new AlgorithmElements();
		this.pParameterDeclaration = new ParameterDeclarationElements();
		this.pColumnDeclarations = new ColumnDeclarationsElements();
		this.pAlgoDeclaration = new AlgoDeclarationElements();
		this.pParaDeclaration = new ParaDeclarationElements();
		this.pColumnDeclaration = new ColumnDeclarationElements();
		this.pColumnSet = new ColumnSetElements();
		this.pBinop = new BinopElements();
		this.pTargetPredictive = new TargetPredictiveElements();
		this.pValue = new ValueElements();
		this.pFLOAT = new FLOATElements();
		this.pBOOL = new BOOLElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Program:
	//    blocsFile = File
	//    blocsAlgo = Algorithm
	//    blocsPara = ParameterDeclaration
	//    blocsColu = ColumnDeclarations
	//;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}
	
	//File :
	//    'Use source data :' PATH=STRING '\n'
	//;
	public FileElements getFileAccess() {
		return pFile;
	}
	
	public ParserRule getFileRule() {
		return getFileAccess().getRule();
	}
	
	//Algorithm :
	//    {Algorithm} 'Use algorithm' Name = ID 'with\n' (Bloc+=AlgoDeclaration '\n')*
	//;
	public AlgorithmElements getAlgorithmAccess() {
		return pAlgorithm;
	}
	
	public ParserRule getAlgorithmRule() {
		return getAlgorithmAccess().getRule();
	}
	
	//ParameterDeclaration :
	//    {ParameterDeclaration} 'Use parameters :\n' (Bloc+=ParaDeclaration '\n')*
	//;
	public ParameterDeclarationElements getParameterDeclarationAccess() {
		return pParameterDeclaration;
	}
	
	public ParserRule getParameterDeclarationRule() {
		return getParameterDeclarationAccess().getRule();
	}
	
	//ColumnDeclarations :
	//    {ColumnDeclarations} 'Use columns :\n' (Bloc+=ColumnDeclaration '\n')*
	//;
	public ColumnDeclarationsElements getColumnDeclarationsAccess() {
		return pColumnDeclarations;
	}
	
	public ParserRule getColumnDeclarationsRule() {
		return getColumnDeclarationsAccess().getRule();
	}
	
	//AlgoDeclaration :
	//    Name=ID 'as' Value=Value
	//;
	public AlgoDeclarationElements getAlgoDeclarationAccess() {
		return pAlgoDeclaration;
	}
	
	public ParserRule getAlgoDeclarationRule() {
		return getAlgoDeclarationAccess().getRule();
	}
	
	//ParaDeclaration :
	//    Name=ID 'values' Value=Value
	//;
	public ParaDeclarationElements getParaDeclarationAccess() {
		return pParaDeclaration;
	}
	
	public ParserRule getParaDeclarationRule() {
		return getParaDeclarationAccess().getRule();
	}
	
	//ColumnDeclaration :
	//    Columns = ColumnSet 'as' Type=TargetPredictive
	//;
	public ColumnDeclarationElements getColumnDeclarationAccess() {
		return pColumnDeclaration;
	}
	
	public ParserRule getColumnDeclarationRule() {
		return getColumnDeclarationAccess().getRule();
	}
	
	//ColumnSet :
	//    '(' ArgBin1=ColumnSet ')' opType = Binop '(' ArgBin2=ColumnSet ')'
	//    |'From' ArgR1=INT 'to' ArgR2=INT
	//    |'[' (ArgList+=INT ',')* ArgList+=INT ']'
	//;
	public ColumnSetElements getColumnSetAccess() {
		return pColumnSet;
	}
	
	public ParserRule getColumnSetRule() {
		return getColumnSetAccess().getRule();
	}
	
	//Binop :
	//    type = 'and' | type = 'except'
	//;
	public BinopElements getBinopAccess() {
		return pBinop;
	}
	
	public ParserRule getBinopRule() {
		return getBinopAccess().getRule();
	}
	
	//TargetPredictive :
	//    type = "target" | type = "predictive"
	//;
	public TargetPredictiveElements getTargetPredictiveAccess() {
		return pTargetPredictive;
	}
	
	public ParserRule getTargetPredictiveRule() {
		return getTargetPredictiveAccess().getRule();
	}
	
	//Value :
	//    int=INT | str=STRING | float=FLOAT | bool=BOOL
	//;
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}
	
	//FLOAT :
	//    IntPart=INT '.' DecPart=INT
	//;
	public FLOATElements getFLOATAccess() {
		return pFLOAT;
	}
	
	public ParserRule getFLOATRule() {
		return getFLOATAccess().getRule();
	}
	
	//BOOL :
	//    value = "true" | value = "false"
	//;
	public BOOLElements getBOOLAccess() {
		return pBOOL;
	}
	
	public ParserRule getBOOLRule() {
		return getBOOLAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}