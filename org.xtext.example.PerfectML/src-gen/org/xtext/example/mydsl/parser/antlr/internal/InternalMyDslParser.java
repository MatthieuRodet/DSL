package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Use source data :'", "'\\n'", "'Use algorithm'", "'with\\n'", "'Use parameters :\\n'", "'Use columns :\\n'", "'as'", "'values'", "'('", "')'", "'From'", "'to'", "'['", "','", "']'", "'and'", "'except'", "'target'", "'predictive'", "'.'", "'true'", "'false'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyDsl.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyDsl.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_blocsFile_0_0= ruleFile ) ) ( (lv_blocsAlgo_1_0= ruleAlgorithm ) ) ( (lv_blocsPara_2_0= ruleParameterDeclaration ) ) ( (lv_blocsColu_3_0= ruleColumnDeclarations ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_blocsFile_0_0 = null;

        EObject lv_blocsAlgo_1_0 = null;

        EObject lv_blocsPara_2_0 = null;

        EObject lv_blocsColu_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_blocsFile_0_0= ruleFile ) ) ( (lv_blocsAlgo_1_0= ruleAlgorithm ) ) ( (lv_blocsPara_2_0= ruleParameterDeclaration ) ) ( (lv_blocsColu_3_0= ruleColumnDeclarations ) ) ) )
            // InternalMyDsl.g:78:2: ( ( (lv_blocsFile_0_0= ruleFile ) ) ( (lv_blocsAlgo_1_0= ruleAlgorithm ) ) ( (lv_blocsPara_2_0= ruleParameterDeclaration ) ) ( (lv_blocsColu_3_0= ruleColumnDeclarations ) ) )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_blocsFile_0_0= ruleFile ) ) ( (lv_blocsAlgo_1_0= ruleAlgorithm ) ) ( (lv_blocsPara_2_0= ruleParameterDeclaration ) ) ( (lv_blocsColu_3_0= ruleColumnDeclarations ) ) )
            // InternalMyDsl.g:79:3: ( (lv_blocsFile_0_0= ruleFile ) ) ( (lv_blocsAlgo_1_0= ruleAlgorithm ) ) ( (lv_blocsPara_2_0= ruleParameterDeclaration ) ) ( (lv_blocsColu_3_0= ruleColumnDeclarations ) )
            {
            // InternalMyDsl.g:79:3: ( (lv_blocsFile_0_0= ruleFile ) )
            // InternalMyDsl.g:80:4: (lv_blocsFile_0_0= ruleFile )
            {
            // InternalMyDsl.g:80:4: (lv_blocsFile_0_0= ruleFile )
            // InternalMyDsl.g:81:5: lv_blocsFile_0_0= ruleFile
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getBlocsFileFileParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_blocsFile_0_0=ruleFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"blocsFile",
            						lv_blocsFile_0_0,
            						"org.xtext.example.mydsl.MyDsl.File");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:98:3: ( (lv_blocsAlgo_1_0= ruleAlgorithm ) )
            // InternalMyDsl.g:99:4: (lv_blocsAlgo_1_0= ruleAlgorithm )
            {
            // InternalMyDsl.g:99:4: (lv_blocsAlgo_1_0= ruleAlgorithm )
            // InternalMyDsl.g:100:5: lv_blocsAlgo_1_0= ruleAlgorithm
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getBlocsAlgoAlgorithmParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_blocsAlgo_1_0=ruleAlgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"blocsAlgo",
            						lv_blocsAlgo_1_0,
            						"org.xtext.example.mydsl.MyDsl.Algorithm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:117:3: ( (lv_blocsPara_2_0= ruleParameterDeclaration ) )
            // InternalMyDsl.g:118:4: (lv_blocsPara_2_0= ruleParameterDeclaration )
            {
            // InternalMyDsl.g:118:4: (lv_blocsPara_2_0= ruleParameterDeclaration )
            // InternalMyDsl.g:119:5: lv_blocsPara_2_0= ruleParameterDeclaration
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getBlocsParaParameterDeclarationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_blocsPara_2_0=ruleParameterDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"blocsPara",
            						lv_blocsPara_2_0,
            						"org.xtext.example.mydsl.MyDsl.ParameterDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:136:3: ( (lv_blocsColu_3_0= ruleColumnDeclarations ) )
            // InternalMyDsl.g:137:4: (lv_blocsColu_3_0= ruleColumnDeclarations )
            {
            // InternalMyDsl.g:137:4: (lv_blocsColu_3_0= ruleColumnDeclarations )
            // InternalMyDsl.g:138:5: lv_blocsColu_3_0= ruleColumnDeclarations
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getBlocsColuColumnDeclarationsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_blocsColu_3_0=ruleColumnDeclarations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"blocsColu",
            						lv_blocsColu_3_0,
            						"org.xtext.example.mydsl.MyDsl.ColumnDeclarations");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFile"
    // InternalMyDsl.g:159:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalMyDsl.g:159:45: (iv_ruleFile= ruleFile EOF )
            // InternalMyDsl.g:160:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalMyDsl.g:166:1: ruleFile returns [EObject current=null] : (otherlv_0= 'Use source data :' ( (lv_PATH_1_0= RULE_STRING ) ) otherlv_2= '\\n' ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_PATH_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:172:2: ( (otherlv_0= 'Use source data :' ( (lv_PATH_1_0= RULE_STRING ) ) otherlv_2= '\\n' ) )
            // InternalMyDsl.g:173:2: (otherlv_0= 'Use source data :' ( (lv_PATH_1_0= RULE_STRING ) ) otherlv_2= '\\n' )
            {
            // InternalMyDsl.g:173:2: (otherlv_0= 'Use source data :' ( (lv_PATH_1_0= RULE_STRING ) ) otherlv_2= '\\n' )
            // InternalMyDsl.g:174:3: otherlv_0= 'Use source data :' ( (lv_PATH_1_0= RULE_STRING ) ) otherlv_2= '\\n'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFileAccess().getUseSourceDataKeyword_0());
            		
            // InternalMyDsl.g:178:3: ( (lv_PATH_1_0= RULE_STRING ) )
            // InternalMyDsl.g:179:4: (lv_PATH_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:179:4: (lv_PATH_1_0= RULE_STRING )
            // InternalMyDsl.g:180:5: lv_PATH_1_0= RULE_STRING
            {
            lv_PATH_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_PATH_1_0, grammarAccess.getFileAccess().getPATHSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"PATH",
            						lv_PATH_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFileAccess().getLineFeedKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleAlgorithm"
    // InternalMyDsl.g:204:1: entryRuleAlgorithm returns [EObject current=null] : iv_ruleAlgorithm= ruleAlgorithm EOF ;
    public final EObject entryRuleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithm = null;


        try {
            // InternalMyDsl.g:204:50: (iv_ruleAlgorithm= ruleAlgorithm EOF )
            // InternalMyDsl.g:205:2: iv_ruleAlgorithm= ruleAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithm=ruleAlgorithm();

            state._fsp--;

             current =iv_ruleAlgorithm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgorithm"


    // $ANTLR start "ruleAlgorithm"
    // InternalMyDsl.g:211:1: ruleAlgorithm returns [EObject current=null] : ( () otherlv_1= 'Use algorithm' ( (lv_Name_2_0= RULE_ID ) ) otherlv_3= 'with\\n' ( ( (lv_Bloc_4_0= ruleAlgoDeclaration ) ) otherlv_5= '\\n' )* ) ;
    public final EObject ruleAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_Name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_Bloc_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:217:2: ( ( () otherlv_1= 'Use algorithm' ( (lv_Name_2_0= RULE_ID ) ) otherlv_3= 'with\\n' ( ( (lv_Bloc_4_0= ruleAlgoDeclaration ) ) otherlv_5= '\\n' )* ) )
            // InternalMyDsl.g:218:2: ( () otherlv_1= 'Use algorithm' ( (lv_Name_2_0= RULE_ID ) ) otherlv_3= 'with\\n' ( ( (lv_Bloc_4_0= ruleAlgoDeclaration ) ) otherlv_5= '\\n' )* )
            {
            // InternalMyDsl.g:218:2: ( () otherlv_1= 'Use algorithm' ( (lv_Name_2_0= RULE_ID ) ) otherlv_3= 'with\\n' ( ( (lv_Bloc_4_0= ruleAlgoDeclaration ) ) otherlv_5= '\\n' )* )
            // InternalMyDsl.g:219:3: () otherlv_1= 'Use algorithm' ( (lv_Name_2_0= RULE_ID ) ) otherlv_3= 'with\\n' ( ( (lv_Bloc_4_0= ruleAlgoDeclaration ) ) otherlv_5= '\\n' )*
            {
            // InternalMyDsl.g:219:3: ()
            // InternalMyDsl.g:220:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlgorithmAccess().getAlgorithmAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgorithmAccess().getUseAlgorithmKeyword_1());
            		
            // InternalMyDsl.g:230:3: ( (lv_Name_2_0= RULE_ID ) )
            // InternalMyDsl.g:231:4: (lv_Name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:231:4: (lv_Name_2_0= RULE_ID )
            // InternalMyDsl.g:232:5: lv_Name_2_0= RULE_ID
            {
            lv_Name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_Name_2_0, grammarAccess.getAlgorithmAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgorithmRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAlgorithmAccess().getWithKeyword_3());
            		
            // InternalMyDsl.g:252:3: ( ( (lv_Bloc_4_0= ruleAlgoDeclaration ) ) otherlv_5= '\\n' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:253:4: ( (lv_Bloc_4_0= ruleAlgoDeclaration ) ) otherlv_5= '\\n'
            	    {
            	    // InternalMyDsl.g:253:4: ( (lv_Bloc_4_0= ruleAlgoDeclaration ) )
            	    // InternalMyDsl.g:254:5: (lv_Bloc_4_0= ruleAlgoDeclaration )
            	    {
            	    // InternalMyDsl.g:254:5: (lv_Bloc_4_0= ruleAlgoDeclaration )
            	    // InternalMyDsl.g:255:6: lv_Bloc_4_0= ruleAlgoDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getAlgorithmAccess().getBlocAlgoDeclarationParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_Bloc_4_0=ruleAlgoDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAlgorithmRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Bloc",
            	    							lv_Bloc_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.AlgoDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,12,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAlgorithmAccess().getLineFeedKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "entryRuleParameterDeclaration"
    // InternalMyDsl.g:281:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // InternalMyDsl.g:281:61: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // InternalMyDsl.g:282:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;

             current =iv_ruleParameterDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // InternalMyDsl.g:288:1: ruleParameterDeclaration returns [EObject current=null] : ( () otherlv_1= 'Use parameters :\\n' ( ( (lv_Bloc_2_0= ruleParaDeclaration ) ) otherlv_3= '\\n' )* ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_Bloc_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:294:2: ( ( () otherlv_1= 'Use parameters :\\n' ( ( (lv_Bloc_2_0= ruleParaDeclaration ) ) otherlv_3= '\\n' )* ) )
            // InternalMyDsl.g:295:2: ( () otherlv_1= 'Use parameters :\\n' ( ( (lv_Bloc_2_0= ruleParaDeclaration ) ) otherlv_3= '\\n' )* )
            {
            // InternalMyDsl.g:295:2: ( () otherlv_1= 'Use parameters :\\n' ( ( (lv_Bloc_2_0= ruleParaDeclaration ) ) otherlv_3= '\\n' )* )
            // InternalMyDsl.g:296:3: () otherlv_1= 'Use parameters :\\n' ( ( (lv_Bloc_2_0= ruleParaDeclaration ) ) otherlv_3= '\\n' )*
            {
            // InternalMyDsl.g:296:3: ()
            // InternalMyDsl.g:297:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDeclarationAccess().getParameterDeclarationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDeclarationAccess().getUseParametersKeyword_1());
            		
            // InternalMyDsl.g:307:3: ( ( (lv_Bloc_2_0= ruleParaDeclaration ) ) otherlv_3= '\\n' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:308:4: ( (lv_Bloc_2_0= ruleParaDeclaration ) ) otherlv_3= '\\n'
            	    {
            	    // InternalMyDsl.g:308:4: ( (lv_Bloc_2_0= ruleParaDeclaration ) )
            	    // InternalMyDsl.g:309:5: (lv_Bloc_2_0= ruleParaDeclaration )
            	    {
            	    // InternalMyDsl.g:309:5: (lv_Bloc_2_0= ruleParaDeclaration )
            	    // InternalMyDsl.g:310:6: lv_Bloc_2_0= ruleParaDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getParameterDeclarationAccess().getBlocParaDeclarationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_Bloc_2_0=ruleParaDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Bloc",
            	    							lv_Bloc_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.ParaDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterDeclarationAccess().getLineFeedKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleColumnDeclarations"
    // InternalMyDsl.g:336:1: entryRuleColumnDeclarations returns [EObject current=null] : iv_ruleColumnDeclarations= ruleColumnDeclarations EOF ;
    public final EObject entryRuleColumnDeclarations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDeclarations = null;


        try {
            // InternalMyDsl.g:336:59: (iv_ruleColumnDeclarations= ruleColumnDeclarations EOF )
            // InternalMyDsl.g:337:2: iv_ruleColumnDeclarations= ruleColumnDeclarations EOF
            {
             newCompositeNode(grammarAccess.getColumnDeclarationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnDeclarations=ruleColumnDeclarations();

            state._fsp--;

             current =iv_ruleColumnDeclarations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnDeclarations"


    // $ANTLR start "ruleColumnDeclarations"
    // InternalMyDsl.g:343:1: ruleColumnDeclarations returns [EObject current=null] : ( () otherlv_1= 'Use columns :\\n' ( ( (lv_Bloc_2_0= ruleColumnDeclaration ) ) otherlv_3= '\\n' )* ) ;
    public final EObject ruleColumnDeclarations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_Bloc_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:349:2: ( ( () otherlv_1= 'Use columns :\\n' ( ( (lv_Bloc_2_0= ruleColumnDeclaration ) ) otherlv_3= '\\n' )* ) )
            // InternalMyDsl.g:350:2: ( () otherlv_1= 'Use columns :\\n' ( ( (lv_Bloc_2_0= ruleColumnDeclaration ) ) otherlv_3= '\\n' )* )
            {
            // InternalMyDsl.g:350:2: ( () otherlv_1= 'Use columns :\\n' ( ( (lv_Bloc_2_0= ruleColumnDeclaration ) ) otherlv_3= '\\n' )* )
            // InternalMyDsl.g:351:3: () otherlv_1= 'Use columns :\\n' ( ( (lv_Bloc_2_0= ruleColumnDeclaration ) ) otherlv_3= '\\n' )*
            {
            // InternalMyDsl.g:351:3: ()
            // InternalMyDsl.g:352:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnDeclarationsAccess().getColumnDeclarationsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnDeclarationsAccess().getUseColumnsKeyword_1());
            		
            // InternalMyDsl.g:362:3: ( ( (lv_Bloc_2_0= ruleColumnDeclaration ) ) otherlv_3= '\\n' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19||LA3_0==21||LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:363:4: ( (lv_Bloc_2_0= ruleColumnDeclaration ) ) otherlv_3= '\\n'
            	    {
            	    // InternalMyDsl.g:363:4: ( (lv_Bloc_2_0= ruleColumnDeclaration ) )
            	    // InternalMyDsl.g:364:5: (lv_Bloc_2_0= ruleColumnDeclaration )
            	    {
            	    // InternalMyDsl.g:364:5: (lv_Bloc_2_0= ruleColumnDeclaration )
            	    // InternalMyDsl.g:365:6: lv_Bloc_2_0= ruleColumnDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getColumnDeclarationsAccess().getBlocColumnDeclarationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_Bloc_2_0=ruleColumnDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getColumnDeclarationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Bloc",
            	    							lv_Bloc_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.ColumnDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getColumnDeclarationsAccess().getLineFeedKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnDeclarations"


    // $ANTLR start "entryRuleAlgoDeclaration"
    // InternalMyDsl.g:391:1: entryRuleAlgoDeclaration returns [EObject current=null] : iv_ruleAlgoDeclaration= ruleAlgoDeclaration EOF ;
    public final EObject entryRuleAlgoDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgoDeclaration = null;


        try {
            // InternalMyDsl.g:391:56: (iv_ruleAlgoDeclaration= ruleAlgoDeclaration EOF )
            // InternalMyDsl.g:392:2: iv_ruleAlgoDeclaration= ruleAlgoDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAlgoDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgoDeclaration=ruleAlgoDeclaration();

            state._fsp--;

             current =iv_ruleAlgoDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgoDeclaration"


    // $ANTLR start "ruleAlgoDeclaration"
    // InternalMyDsl.g:398:1: ruleAlgoDeclaration returns [EObject current=null] : ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_Value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAlgoDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_Name_0_0=null;
        Token otherlv_1=null;
        EObject lv_Value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:404:2: ( ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_Value_2_0= ruleValue ) ) ) )
            // InternalMyDsl.g:405:2: ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_Value_2_0= ruleValue ) ) )
            {
            // InternalMyDsl.g:405:2: ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_Value_2_0= ruleValue ) ) )
            // InternalMyDsl.g:406:3: ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_Value_2_0= ruleValue ) )
            {
            // InternalMyDsl.g:406:3: ( (lv_Name_0_0= RULE_ID ) )
            // InternalMyDsl.g:407:4: (lv_Name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:407:4: (lv_Name_0_0= RULE_ID )
            // InternalMyDsl.g:408:5: lv_Name_0_0= RULE_ID
            {
            lv_Name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_Name_0_0, grammarAccess.getAlgoDeclarationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgoDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgoDeclarationAccess().getAsKeyword_1());
            		
            // InternalMyDsl.g:428:3: ( (lv_Value_2_0= ruleValue ) )
            // InternalMyDsl.g:429:4: (lv_Value_2_0= ruleValue )
            {
            // InternalMyDsl.g:429:4: (lv_Value_2_0= ruleValue )
            // InternalMyDsl.g:430:5: lv_Value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAlgoDeclarationAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_Value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgoDeclarationRule());
            					}
            					set(
            						current,
            						"Value",
            						lv_Value_2_0,
            						"org.xtext.example.mydsl.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgoDeclaration"


    // $ANTLR start "entryRuleParaDeclaration"
    // InternalMyDsl.g:451:1: entryRuleParaDeclaration returns [EObject current=null] : iv_ruleParaDeclaration= ruleParaDeclaration EOF ;
    public final EObject entryRuleParaDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParaDeclaration = null;


        try {
            // InternalMyDsl.g:451:56: (iv_ruleParaDeclaration= ruleParaDeclaration EOF )
            // InternalMyDsl.g:452:2: iv_ruleParaDeclaration= ruleParaDeclaration EOF
            {
             newCompositeNode(grammarAccess.getParaDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParaDeclaration=ruleParaDeclaration();

            state._fsp--;

             current =iv_ruleParaDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParaDeclaration"


    // $ANTLR start "ruleParaDeclaration"
    // InternalMyDsl.g:458:1: ruleParaDeclaration returns [EObject current=null] : ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= 'values' ( (lv_Value_2_0= ruleValue ) ) ) ;
    public final EObject ruleParaDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_Name_0_0=null;
        Token otherlv_1=null;
        EObject lv_Value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:464:2: ( ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= 'values' ( (lv_Value_2_0= ruleValue ) ) ) )
            // InternalMyDsl.g:465:2: ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= 'values' ( (lv_Value_2_0= ruleValue ) ) )
            {
            // InternalMyDsl.g:465:2: ( ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= 'values' ( (lv_Value_2_0= ruleValue ) ) )
            // InternalMyDsl.g:466:3: ( (lv_Name_0_0= RULE_ID ) ) otherlv_1= 'values' ( (lv_Value_2_0= ruleValue ) )
            {
            // InternalMyDsl.g:466:3: ( (lv_Name_0_0= RULE_ID ) )
            // InternalMyDsl.g:467:4: (lv_Name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:467:4: (lv_Name_0_0= RULE_ID )
            // InternalMyDsl.g:468:5: lv_Name_0_0= RULE_ID
            {
            lv_Name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_Name_0_0, grammarAccess.getParaDeclarationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParaDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getParaDeclarationAccess().getValuesKeyword_1());
            		
            // InternalMyDsl.g:488:3: ( (lv_Value_2_0= ruleValue ) )
            // InternalMyDsl.g:489:4: (lv_Value_2_0= ruleValue )
            {
            // InternalMyDsl.g:489:4: (lv_Value_2_0= ruleValue )
            // InternalMyDsl.g:490:5: lv_Value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getParaDeclarationAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_Value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParaDeclarationRule());
            					}
            					set(
            						current,
            						"Value",
            						lv_Value_2_0,
            						"org.xtext.example.mydsl.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParaDeclaration"


    // $ANTLR start "entryRuleColumnDeclaration"
    // InternalMyDsl.g:511:1: entryRuleColumnDeclaration returns [EObject current=null] : iv_ruleColumnDeclaration= ruleColumnDeclaration EOF ;
    public final EObject entryRuleColumnDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDeclaration = null;


        try {
            // InternalMyDsl.g:511:58: (iv_ruleColumnDeclaration= ruleColumnDeclaration EOF )
            // InternalMyDsl.g:512:2: iv_ruleColumnDeclaration= ruleColumnDeclaration EOF
            {
             newCompositeNode(grammarAccess.getColumnDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnDeclaration=ruleColumnDeclaration();

            state._fsp--;

             current =iv_ruleColumnDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnDeclaration"


    // $ANTLR start "ruleColumnDeclaration"
    // InternalMyDsl.g:518:1: ruleColumnDeclaration returns [EObject current=null] : ( ( (lv_Columns_0_0= ruleColumnSet ) ) otherlv_1= 'as' ( (lv_Type_2_0= ruleTargetPredictive ) ) ) ;
    public final EObject ruleColumnDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_Columns_0_0 = null;

        EObject lv_Type_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:524:2: ( ( ( (lv_Columns_0_0= ruleColumnSet ) ) otherlv_1= 'as' ( (lv_Type_2_0= ruleTargetPredictive ) ) ) )
            // InternalMyDsl.g:525:2: ( ( (lv_Columns_0_0= ruleColumnSet ) ) otherlv_1= 'as' ( (lv_Type_2_0= ruleTargetPredictive ) ) )
            {
            // InternalMyDsl.g:525:2: ( ( (lv_Columns_0_0= ruleColumnSet ) ) otherlv_1= 'as' ( (lv_Type_2_0= ruleTargetPredictive ) ) )
            // InternalMyDsl.g:526:3: ( (lv_Columns_0_0= ruleColumnSet ) ) otherlv_1= 'as' ( (lv_Type_2_0= ruleTargetPredictive ) )
            {
            // InternalMyDsl.g:526:3: ( (lv_Columns_0_0= ruleColumnSet ) )
            // InternalMyDsl.g:527:4: (lv_Columns_0_0= ruleColumnSet )
            {
            // InternalMyDsl.g:527:4: (lv_Columns_0_0= ruleColumnSet )
            // InternalMyDsl.g:528:5: lv_Columns_0_0= ruleColumnSet
            {

            					newCompositeNode(grammarAccess.getColumnDeclarationAccess().getColumnsColumnSetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_Columns_0_0=ruleColumnSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnDeclarationRule());
            					}
            					set(
            						current,
            						"Columns",
            						lv_Columns_0_0,
            						"org.xtext.example.mydsl.MyDsl.ColumnSet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnDeclarationAccess().getAsKeyword_1());
            		
            // InternalMyDsl.g:549:3: ( (lv_Type_2_0= ruleTargetPredictive ) )
            // InternalMyDsl.g:550:4: (lv_Type_2_0= ruleTargetPredictive )
            {
            // InternalMyDsl.g:550:4: (lv_Type_2_0= ruleTargetPredictive )
            // InternalMyDsl.g:551:5: lv_Type_2_0= ruleTargetPredictive
            {

            					newCompositeNode(grammarAccess.getColumnDeclarationAccess().getTypeTargetPredictiveParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_Type_2_0=ruleTargetPredictive();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnDeclarationRule());
            					}
            					set(
            						current,
            						"Type",
            						lv_Type_2_0,
            						"org.xtext.example.mydsl.MyDsl.TargetPredictive");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnDeclaration"


    // $ANTLR start "entryRuleColumnSet"
    // InternalMyDsl.g:572:1: entryRuleColumnSet returns [EObject current=null] : iv_ruleColumnSet= ruleColumnSet EOF ;
    public final EObject entryRuleColumnSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnSet = null;


        try {
            // InternalMyDsl.g:572:50: (iv_ruleColumnSet= ruleColumnSet EOF )
            // InternalMyDsl.g:573:2: iv_ruleColumnSet= ruleColumnSet EOF
            {
             newCompositeNode(grammarAccess.getColumnSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnSet=ruleColumnSet();

            state._fsp--;

             current =iv_ruleColumnSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnSet"


    // $ANTLR start "ruleColumnSet"
    // InternalMyDsl.g:579:1: ruleColumnSet returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')' ) | (otherlv_7= 'From' ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) ) ) | (otherlv_11= '[' ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']' ) ) ;
    public final EObject ruleColumnSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_ArgR1_8_0=null;
        Token otherlv_9=null;
        Token lv_ArgR2_10_0=null;
        Token otherlv_11=null;
        Token lv_ArgList_12_0=null;
        Token otherlv_13=null;
        Token lv_ArgList_14_0=null;
        Token otherlv_15=null;
        EObject lv_ArgBin1_1_0 = null;

        EObject lv_opType_3_0 = null;

        EObject lv_ArgBin2_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:585:2: ( ( (otherlv_0= '(' ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')' ) | (otherlv_7= 'From' ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) ) ) | (otherlv_11= '[' ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']' ) ) )
            // InternalMyDsl.g:586:2: ( (otherlv_0= '(' ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')' ) | (otherlv_7= 'From' ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) ) ) | (otherlv_11= '[' ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']' ) )
            {
            // InternalMyDsl.g:586:2: ( (otherlv_0= '(' ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')' ) | (otherlv_7= 'From' ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) ) ) | (otherlv_11= '[' ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:587:3: (otherlv_0= '(' ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')' )
                    {
                    // InternalMyDsl.g:587:3: (otherlv_0= '(' ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')' )
                    // InternalMyDsl.g:588:4: otherlv_0= '(' ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getColumnSetAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalMyDsl.g:592:4: ( (lv_ArgBin1_1_0= ruleColumnSet ) )
                    // InternalMyDsl.g:593:5: (lv_ArgBin1_1_0= ruleColumnSet )
                    {
                    // InternalMyDsl.g:593:5: (lv_ArgBin1_1_0= ruleColumnSet )
                    // InternalMyDsl.g:594:6: lv_ArgBin1_1_0= ruleColumnSet
                    {

                    						newCompositeNode(grammarAccess.getColumnSetAccess().getArgBin1ColumnSetParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_ArgBin1_1_0=ruleColumnSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnSetRule());
                    						}
                    						set(
                    							current,
                    							"ArgBin1",
                    							lv_ArgBin1_1_0,
                    							"org.xtext.example.mydsl.MyDsl.ColumnSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getColumnSetAccess().getRightParenthesisKeyword_0_2());
                    			
                    // InternalMyDsl.g:615:4: ( (lv_opType_3_0= ruleBinop ) )
                    // InternalMyDsl.g:616:5: (lv_opType_3_0= ruleBinop )
                    {
                    // InternalMyDsl.g:616:5: (lv_opType_3_0= ruleBinop )
                    // InternalMyDsl.g:617:6: lv_opType_3_0= ruleBinop
                    {

                    						newCompositeNode(grammarAccess.getColumnSetAccess().getOpTypeBinopParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_opType_3_0=ruleBinop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnSetRule());
                    						}
                    						set(
                    							current,
                    							"opType",
                    							lv_opType_3_0,
                    							"org.xtext.example.mydsl.MyDsl.Binop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getColumnSetAccess().getLeftParenthesisKeyword_0_4());
                    			
                    // InternalMyDsl.g:638:4: ( (lv_ArgBin2_5_0= ruleColumnSet ) )
                    // InternalMyDsl.g:639:5: (lv_ArgBin2_5_0= ruleColumnSet )
                    {
                    // InternalMyDsl.g:639:5: (lv_ArgBin2_5_0= ruleColumnSet )
                    // InternalMyDsl.g:640:6: lv_ArgBin2_5_0= ruleColumnSet
                    {

                    						newCompositeNode(grammarAccess.getColumnSetAccess().getArgBin2ColumnSetParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_ArgBin2_5_0=ruleColumnSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnSetRule());
                    						}
                    						set(
                    							current,
                    							"ArgBin2",
                    							lv_ArgBin2_5_0,
                    							"org.xtext.example.mydsl.MyDsl.ColumnSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnSetAccess().getRightParenthesisKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:663:3: (otherlv_7= 'From' ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:663:3: (otherlv_7= 'From' ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) ) )
                    // InternalMyDsl.g:664:4: otherlv_7= 'From' ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnSetAccess().getFromKeyword_1_0());
                    			
                    // InternalMyDsl.g:668:4: ( (lv_ArgR1_8_0= RULE_INT ) )
                    // InternalMyDsl.g:669:5: (lv_ArgR1_8_0= RULE_INT )
                    {
                    // InternalMyDsl.g:669:5: (lv_ArgR1_8_0= RULE_INT )
                    // InternalMyDsl.g:670:6: lv_ArgR1_8_0= RULE_INT
                    {
                    lv_ArgR1_8_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                    						newLeafNode(lv_ArgR1_8_0, grammarAccess.getColumnSetAccess().getArgR1INTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnSetRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ArgR1",
                    							lv_ArgR1_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getColumnSetAccess().getToKeyword_1_2());
                    			
                    // InternalMyDsl.g:690:4: ( (lv_ArgR2_10_0= RULE_INT ) )
                    // InternalMyDsl.g:691:5: (lv_ArgR2_10_0= RULE_INT )
                    {
                    // InternalMyDsl.g:691:5: (lv_ArgR2_10_0= RULE_INT )
                    // InternalMyDsl.g:692:6: lv_ArgR2_10_0= RULE_INT
                    {
                    lv_ArgR2_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_ArgR2_10_0, grammarAccess.getColumnSetAccess().getArgR2INTTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnSetRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ArgR2",
                    							lv_ArgR2_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:710:3: (otherlv_11= '[' ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']' )
                    {
                    // InternalMyDsl.g:710:3: (otherlv_11= '[' ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']' )
                    // InternalMyDsl.g:711:4: otherlv_11= '[' ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']'
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getColumnSetAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalMyDsl.g:715:4: ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_INT) ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1==24) ) {
                                alt4=1;
                            }


                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:716:5: ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ','
                    	    {
                    	    // InternalMyDsl.g:716:5: ( (lv_ArgList_12_0= RULE_INT ) )
                    	    // InternalMyDsl.g:717:6: (lv_ArgList_12_0= RULE_INT )
                    	    {
                    	    // InternalMyDsl.g:717:6: (lv_ArgList_12_0= RULE_INT )
                    	    // InternalMyDsl.g:718:7: lv_ArgList_12_0= RULE_INT
                    	    {
                    	    lv_ArgList_12_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    	    							newLeafNode(lv_ArgList_12_0, grammarAccess.getColumnSetAccess().getArgListINTTerminalRuleCall_2_1_0_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getColumnSetRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"ArgList",
                    	    								lv_ArgList_12_0,
                    	    								"org.eclipse.xtext.common.Terminals.INT");
                    	    						

                    	    }


                    	    }

                    	    otherlv_13=(Token)match(input,24,FOLLOW_20); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getColumnSetAccess().getCommaKeyword_2_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // InternalMyDsl.g:739:4: ( (lv_ArgList_14_0= RULE_INT ) )
                    // InternalMyDsl.g:740:5: (lv_ArgList_14_0= RULE_INT )
                    {
                    // InternalMyDsl.g:740:5: (lv_ArgList_14_0= RULE_INT )
                    // InternalMyDsl.g:741:6: lv_ArgList_14_0= RULE_INT
                    {
                    lv_ArgList_14_0=(Token)match(input,RULE_INT,FOLLOW_23); 

                    						newLeafNode(lv_ArgList_14_0, grammarAccess.getColumnSetAccess().getArgListINTTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnSetRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"ArgList",
                    							lv_ArgList_14_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getColumnSetAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnSet"


    // $ANTLR start "entryRuleBinop"
    // InternalMyDsl.g:766:1: entryRuleBinop returns [EObject current=null] : iv_ruleBinop= ruleBinop EOF ;
    public final EObject entryRuleBinop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinop = null;


        try {
            // InternalMyDsl.g:766:46: (iv_ruleBinop= ruleBinop EOF )
            // InternalMyDsl.g:767:2: iv_ruleBinop= ruleBinop EOF
            {
             newCompositeNode(grammarAccess.getBinopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinop=ruleBinop();

            state._fsp--;

             current =iv_ruleBinop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinop"


    // $ANTLR start "ruleBinop"
    // InternalMyDsl.g:773:1: ruleBinop returns [EObject current=null] : ( ( (lv_type_0_0= 'and' ) ) | ( (lv_type_1_0= 'except' ) ) ) ;
    public final EObject ruleBinop() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:779:2: ( ( ( (lv_type_0_0= 'and' ) ) | ( (lv_type_1_0= 'except' ) ) ) )
            // InternalMyDsl.g:780:2: ( ( (lv_type_0_0= 'and' ) ) | ( (lv_type_1_0= 'except' ) ) )
            {
            // InternalMyDsl.g:780:2: ( ( (lv_type_0_0= 'and' ) ) | ( (lv_type_1_0= 'except' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:781:3: ( (lv_type_0_0= 'and' ) )
                    {
                    // InternalMyDsl.g:781:3: ( (lv_type_0_0= 'and' ) )
                    // InternalMyDsl.g:782:4: (lv_type_0_0= 'and' )
                    {
                    // InternalMyDsl.g:782:4: (lv_type_0_0= 'and' )
                    // InternalMyDsl.g:783:5: lv_type_0_0= 'and'
                    {
                    lv_type_0_0=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_type_0_0, grammarAccess.getBinopAccess().getTypeAndKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBinopRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_0, "and");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:796:3: ( (lv_type_1_0= 'except' ) )
                    {
                    // InternalMyDsl.g:796:3: ( (lv_type_1_0= 'except' ) )
                    // InternalMyDsl.g:797:4: (lv_type_1_0= 'except' )
                    {
                    // InternalMyDsl.g:797:4: (lv_type_1_0= 'except' )
                    // InternalMyDsl.g:798:5: lv_type_1_0= 'except'
                    {
                    lv_type_1_0=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_type_1_0, grammarAccess.getBinopAccess().getTypeExceptKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBinopRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_1_0, "except");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinop"


    // $ANTLR start "entryRuleTargetPredictive"
    // InternalMyDsl.g:814:1: entryRuleTargetPredictive returns [EObject current=null] : iv_ruleTargetPredictive= ruleTargetPredictive EOF ;
    public final EObject entryRuleTargetPredictive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetPredictive = null;


        try {
            // InternalMyDsl.g:814:57: (iv_ruleTargetPredictive= ruleTargetPredictive EOF )
            // InternalMyDsl.g:815:2: iv_ruleTargetPredictive= ruleTargetPredictive EOF
            {
             newCompositeNode(grammarAccess.getTargetPredictiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetPredictive=ruleTargetPredictive();

            state._fsp--;

             current =iv_ruleTargetPredictive; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargetPredictive"


    // $ANTLR start "ruleTargetPredictive"
    // InternalMyDsl.g:821:1: ruleTargetPredictive returns [EObject current=null] : ( ( (lv_type_0_0= 'target' ) ) | ( (lv_type_1_0= 'predictive' ) ) ) ;
    public final EObject ruleTargetPredictive() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:827:2: ( ( ( (lv_type_0_0= 'target' ) ) | ( (lv_type_1_0= 'predictive' ) ) ) )
            // InternalMyDsl.g:828:2: ( ( (lv_type_0_0= 'target' ) ) | ( (lv_type_1_0= 'predictive' ) ) )
            {
            // InternalMyDsl.g:828:2: ( ( (lv_type_0_0= 'target' ) ) | ( (lv_type_1_0= 'predictive' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:829:3: ( (lv_type_0_0= 'target' ) )
                    {
                    // InternalMyDsl.g:829:3: ( (lv_type_0_0= 'target' ) )
                    // InternalMyDsl.g:830:4: (lv_type_0_0= 'target' )
                    {
                    // InternalMyDsl.g:830:4: (lv_type_0_0= 'target' )
                    // InternalMyDsl.g:831:5: lv_type_0_0= 'target'
                    {
                    lv_type_0_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_type_0_0, grammarAccess.getTargetPredictiveAccess().getTypeTargetKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTargetPredictiveRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_0, "target");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:844:3: ( (lv_type_1_0= 'predictive' ) )
                    {
                    // InternalMyDsl.g:844:3: ( (lv_type_1_0= 'predictive' ) )
                    // InternalMyDsl.g:845:4: (lv_type_1_0= 'predictive' )
                    {
                    // InternalMyDsl.g:845:4: (lv_type_1_0= 'predictive' )
                    // InternalMyDsl.g:846:5: lv_type_1_0= 'predictive'
                    {
                    lv_type_1_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_type_1_0, grammarAccess.getTargetPredictiveAccess().getTypePredictiveKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTargetPredictiveRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_1_0, "predictive");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetPredictive"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:862:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMyDsl.g:862:46: (iv_ruleValue= ruleValue EOF )
            // InternalMyDsl.g:863:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:869:1: ruleValue returns [EObject current=null] : ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_str_1_0= RULE_STRING ) ) | ( (lv_float_2_0= ruleFLOAT ) ) | ( (lv_bool_3_0= ruleBOOL ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_int_0_0=null;
        Token lv_str_1_0=null;
        EObject lv_float_2_0 = null;

        EObject lv_bool_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:875:2: ( ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_str_1_0= RULE_STRING ) ) | ( (lv_float_2_0= ruleFLOAT ) ) | ( (lv_bool_3_0= ruleBOOL ) ) ) )
            // InternalMyDsl.g:876:2: ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_str_1_0= RULE_STRING ) ) | ( (lv_float_2_0= ruleFLOAT ) ) | ( (lv_bool_3_0= ruleBOOL ) ) )
            {
            // InternalMyDsl.g:876:2: ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_str_1_0= RULE_STRING ) ) | ( (lv_float_2_0= ruleFLOAT ) ) | ( (lv_bool_3_0= ruleBOOL ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==12) ) {
                    alt8=1;
                }
                else if ( (LA8_1==30) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case 31:
            case 32:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:877:3: ( (lv_int_0_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:877:3: ( (lv_int_0_0= RULE_INT ) )
                    // InternalMyDsl.g:878:4: (lv_int_0_0= RULE_INT )
                    {
                    // InternalMyDsl.g:878:4: (lv_int_0_0= RULE_INT )
                    // InternalMyDsl.g:879:5: lv_int_0_0= RULE_INT
                    {
                    lv_int_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_int_0_0, grammarAccess.getValueAccess().getIntINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"int",
                    						lv_int_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:896:3: ( (lv_str_1_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:896:3: ( (lv_str_1_0= RULE_STRING ) )
                    // InternalMyDsl.g:897:4: (lv_str_1_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:897:4: (lv_str_1_0= RULE_STRING )
                    // InternalMyDsl.g:898:5: lv_str_1_0= RULE_STRING
                    {
                    lv_str_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_str_1_0, grammarAccess.getValueAccess().getStrSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"str",
                    						lv_str_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:915:3: ( (lv_float_2_0= ruleFLOAT ) )
                    {
                    // InternalMyDsl.g:915:3: ( (lv_float_2_0= ruleFLOAT ) )
                    // InternalMyDsl.g:916:4: (lv_float_2_0= ruleFLOAT )
                    {
                    // InternalMyDsl.g:916:4: (lv_float_2_0= ruleFLOAT )
                    // InternalMyDsl.g:917:5: lv_float_2_0= ruleFLOAT
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getFloatFLOATParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_float_2_0=ruleFLOAT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"float",
                    						lv_float_2_0,
                    						"org.xtext.example.mydsl.MyDsl.FLOAT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:935:3: ( (lv_bool_3_0= ruleBOOL ) )
                    {
                    // InternalMyDsl.g:935:3: ( (lv_bool_3_0= ruleBOOL ) )
                    // InternalMyDsl.g:936:4: (lv_bool_3_0= ruleBOOL )
                    {
                    // InternalMyDsl.g:936:4: (lv_bool_3_0= ruleBOOL )
                    // InternalMyDsl.g:937:5: lv_bool_3_0= ruleBOOL
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getBoolBOOLParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bool_3_0=ruleBOOL();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"bool",
                    						lv_bool_3_0,
                    						"org.xtext.example.mydsl.MyDsl.BOOL");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMyDsl.g:958:1: entryRuleFLOAT returns [EObject current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final EObject entryRuleFLOAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFLOAT = null;


        try {
            // InternalMyDsl.g:958:46: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalMyDsl.g:959:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMyDsl.g:965:1: ruleFLOAT returns [EObject current=null] : ( ( (lv_IntPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_DecPart_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFLOAT() throws RecognitionException {
        EObject current = null;

        Token lv_IntPart_0_0=null;
        Token otherlv_1=null;
        Token lv_DecPart_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:971:2: ( ( ( (lv_IntPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_DecPart_2_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:972:2: ( ( (lv_IntPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_DecPart_2_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:972:2: ( ( (lv_IntPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_DecPart_2_0= RULE_INT ) ) )
            // InternalMyDsl.g:973:3: ( (lv_IntPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_DecPart_2_0= RULE_INT ) )
            {
            // InternalMyDsl.g:973:3: ( (lv_IntPart_0_0= RULE_INT ) )
            // InternalMyDsl.g:974:4: (lv_IntPart_0_0= RULE_INT )
            {
            // InternalMyDsl.g:974:4: (lv_IntPart_0_0= RULE_INT )
            // InternalMyDsl.g:975:5: lv_IntPart_0_0= RULE_INT
            {
            lv_IntPart_0_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_IntPart_0_0, grammarAccess.getFLOATAccess().getIntPartINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFLOATRule());
            					}
            					setWithLastConsumed(
            						current,
            						"IntPart",
            						lv_IntPart_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            // InternalMyDsl.g:995:3: ( (lv_DecPart_2_0= RULE_INT ) )
            // InternalMyDsl.g:996:4: (lv_DecPart_2_0= RULE_INT )
            {
            // InternalMyDsl.g:996:4: (lv_DecPart_2_0= RULE_INT )
            // InternalMyDsl.g:997:5: lv_DecPart_2_0= RULE_INT
            {
            lv_DecPart_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_DecPart_2_0, grammarAccess.getFLOATAccess().getDecPartINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFLOATRule());
            					}
            					setWithLastConsumed(
            						current,
            						"DecPart",
            						lv_DecPart_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleBOOL"
    // InternalMyDsl.g:1017:1: entryRuleBOOL returns [EObject current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final EObject entryRuleBOOL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOL = null;


        try {
            // InternalMyDsl.g:1017:45: (iv_ruleBOOL= ruleBOOL EOF )
            // InternalMyDsl.g:1018:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // InternalMyDsl.g:1024:1: ruleBOOL returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) ;
    public final EObject ruleBOOL() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1030:2: ( ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) )
            // InternalMyDsl.g:1031:2: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            {
            // InternalMyDsl.g:1031:2: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            else if ( (LA9_0==32) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1032:3: ( (lv_value_0_0= 'true' ) )
                    {
                    // InternalMyDsl.g:1032:3: ( (lv_value_0_0= 'true' ) )
                    // InternalMyDsl.g:1033:4: (lv_value_0_0= 'true' )
                    {
                    // InternalMyDsl.g:1033:4: (lv_value_0_0= 'true' )
                    // InternalMyDsl.g:1034:5: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getBOOLAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBOOLRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1047:3: ( (lv_value_1_0= 'false' ) )
                    {
                    // InternalMyDsl.g:1047:3: ( (lv_value_1_0= 'false' ) )
                    // InternalMyDsl.g:1048:4: (lv_value_1_0= 'false' )
                    {
                    // InternalMyDsl.g:1048:4: (lv_value_1_0= 'false' )
                    // InternalMyDsl.g:1049:5: lv_value_1_0= 'false'
                    {
                    lv_value_1_0=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getBOOLAccess().getValueFalseKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBOOLRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_1_0, "false");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOL"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000A80002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000180000050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000A80000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});

}