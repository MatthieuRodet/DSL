package org.xtext.example.perfectML.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.perfectML.services.PerfectMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPerfectMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'Use'", "'source'", "'data'", "':'", "'output'", "'file'", "'MLPClassifier'", "'with'", "'hidden_layer_sizes'", "'='", "'('", "','", "')'", "'activation'", "'identity'", "'logistic'", "'tanh'", "'relu'", "'solver'", "'lbfgs'", "'sgd'", "'adam'", "'alpha'", "'batch_size'", "'learning_rate'", "'constant'", "'invscaling'", "'adaptive'", "'learning_rate_init'", "'power_t'", "'max_iter'", "'shuffle'", "'random_state'", "'tolerance'", "'verbose'", "'warm_start'", "'momentum'", "'nesterovs_momentum'", "'early_stopping'", "'validation_fraction'", "'beta_1'", "'beta_2'", "'epsilon'", "'n_iter_no_change'", "'max_fun'", "'SVC'", "'C'", "'kernel'", "'rbf'", "'poly'", "'linear'", "'sigmoid'", "'precomputed'", "'degree'", "'gamma'", "'scale'", "'auto'", "'coef0'", "'shrinking'", "'probability'", "'cache_size'", "'decision_function_shape'", "'ovo'", "'ovr'", "'break_ties'", "'KNeighborsClassifier'", "'n_neighbors'", "'weights'", "'uniform'", "'distance'", "'algorithm'", "'ball_tree'", "'kd_tree'", "'brute'", "'leaf_size'", "'p'", "'metric'", "'mahalanobis'", "'seuclidean'", "'wminkowski'", "'minkowski'", "'chebyshev'", "'manhattan'", "'euclidean'", "'n_jobs'", "'%'", "'lines'", "'of'", "'training'", "'columns'", "'as'", "'target'", "'predictive'", "'From'", "'to'", "'['", "']'", "'and'", "'except'", "'.'", "'True'", "'False'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalPerfectMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPerfectMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPerfectMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPerfectML.g"; }



     	private PerfectMLGrammarAccess grammarAccess;

        public InternalPerfectMLParser(TokenStream input, PerfectMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PerfectMLFile";
       	}

       	@Override
       	protected PerfectMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePerfectMLFile"
    // InternalPerfectML.g:64:1: entryRulePerfectMLFile returns [EObject current=null] : iv_rulePerfectMLFile= rulePerfectMLFile EOF ;
    public final EObject entryRulePerfectMLFile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerfectMLFile = null;


        try {
            // InternalPerfectML.g:64:54: (iv_rulePerfectMLFile= rulePerfectMLFile EOF )
            // InternalPerfectML.g:65:2: iv_rulePerfectMLFile= rulePerfectMLFile EOF
            {
             newCompositeNode(grammarAccess.getPerfectMLFileRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerfectMLFile=rulePerfectMLFile();

            state._fsp--;

             current =iv_rulePerfectMLFile; 
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
    // $ANTLR end "entryRulePerfectMLFile"


    // $ANTLR start "rulePerfectMLFile"
    // InternalPerfectML.g:71:1: rulePerfectMLFile returns [EObject current=null] : ( ( (lv_programs_0_0= ruleProgram ) ) otherlv_1= ';' )+ ;
    public final EObject rulePerfectMLFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_programs_0_0 = null;



        	enterRule();

        try {
            // InternalPerfectML.g:77:2: ( ( ( (lv_programs_0_0= ruleProgram ) ) otherlv_1= ';' )+ )
            // InternalPerfectML.g:78:2: ( ( (lv_programs_0_0= ruleProgram ) ) otherlv_1= ';' )+
            {
            // InternalPerfectML.g:78:2: ( ( (lv_programs_0_0= ruleProgram ) ) otherlv_1= ';' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPerfectML.g:79:3: ( (lv_programs_0_0= ruleProgram ) ) otherlv_1= ';'
            	    {
            	    // InternalPerfectML.g:79:3: ( (lv_programs_0_0= ruleProgram ) )
            	    // InternalPerfectML.g:80:4: (lv_programs_0_0= ruleProgram )
            	    {
            	    // InternalPerfectML.g:80:4: (lv_programs_0_0= ruleProgram )
            	    // InternalPerfectML.g:81:5: lv_programs_0_0= ruleProgram
            	    {

            	    					newCompositeNode(grammarAccess.getPerfectMLFileAccess().getProgramsProgramParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_programs_0_0=ruleProgram();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPerfectMLFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"programs",
            	    						lv_programs_0_0,
            	    						"org.xtext.example.perfectML.PerfectML.Program");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    otherlv_1=(Token)match(input,11,FOLLOW_4); 

            	    			newLeafNode(otherlv_1, grammarAccess.getPerfectMLFileAccess().getSemicolonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "rulePerfectMLFile"


    // $ANTLR start "entryRuleProgram"
    // InternalPerfectML.g:106:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalPerfectML.g:106:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalPerfectML.g:107:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalPerfectML.g:113:1: ruleProgram returns [EObject current=null] : ( ( (lv_input_0_0= ruleInput ) ) ( (lv_output_1_0= ruleOutput ) ) ( (lv_algo_2_0= ruleAlgorithm ) ) ( (lv_nbtraining_3_0= ruleTrainingAmount ) ) ( (lv_column_4_0= ruleColumnDeclarations ) )? ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_input_0_0 = null;

        EObject lv_output_1_0 = null;

        EObject lv_algo_2_0 = null;

        EObject lv_nbtraining_3_0 = null;

        EObject lv_column_4_0 = null;



        	enterRule();

        try {
            // InternalPerfectML.g:119:2: ( ( ( (lv_input_0_0= ruleInput ) ) ( (lv_output_1_0= ruleOutput ) ) ( (lv_algo_2_0= ruleAlgorithm ) ) ( (lv_nbtraining_3_0= ruleTrainingAmount ) ) ( (lv_column_4_0= ruleColumnDeclarations ) )? ) )
            // InternalPerfectML.g:120:2: ( ( (lv_input_0_0= ruleInput ) ) ( (lv_output_1_0= ruleOutput ) ) ( (lv_algo_2_0= ruleAlgorithm ) ) ( (lv_nbtraining_3_0= ruleTrainingAmount ) ) ( (lv_column_4_0= ruleColumnDeclarations ) )? )
            {
            // InternalPerfectML.g:120:2: ( ( (lv_input_0_0= ruleInput ) ) ( (lv_output_1_0= ruleOutput ) ) ( (lv_algo_2_0= ruleAlgorithm ) ) ( (lv_nbtraining_3_0= ruleTrainingAmount ) ) ( (lv_column_4_0= ruleColumnDeclarations ) )? )
            // InternalPerfectML.g:121:3: ( (lv_input_0_0= ruleInput ) ) ( (lv_output_1_0= ruleOutput ) ) ( (lv_algo_2_0= ruleAlgorithm ) ) ( (lv_nbtraining_3_0= ruleTrainingAmount ) ) ( (lv_column_4_0= ruleColumnDeclarations ) )?
            {
            // InternalPerfectML.g:121:3: ( (lv_input_0_0= ruleInput ) )
            // InternalPerfectML.g:122:4: (lv_input_0_0= ruleInput )
            {
            // InternalPerfectML.g:122:4: (lv_input_0_0= ruleInput )
            // InternalPerfectML.g:123:5: lv_input_0_0= ruleInput
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getInputInputParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_input_0_0=ruleInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"org.xtext.example.perfectML.PerfectML.Input");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPerfectML.g:140:3: ( (lv_output_1_0= ruleOutput ) )
            // InternalPerfectML.g:141:4: (lv_output_1_0= ruleOutput )
            {
            // InternalPerfectML.g:141:4: (lv_output_1_0= ruleOutput )
            // InternalPerfectML.g:142:5: lv_output_1_0= ruleOutput
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getOutputOutputParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_output_1_0=ruleOutput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_1_0,
            						"org.xtext.example.perfectML.PerfectML.Output");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPerfectML.g:159:3: ( (lv_algo_2_0= ruleAlgorithm ) )
            // InternalPerfectML.g:160:4: (lv_algo_2_0= ruleAlgorithm )
            {
            // InternalPerfectML.g:160:4: (lv_algo_2_0= ruleAlgorithm )
            // InternalPerfectML.g:161:5: lv_algo_2_0= ruleAlgorithm
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getAlgoAlgorithmParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_algo_2_0=ruleAlgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"algo",
            						lv_algo_2_0,
            						"org.xtext.example.perfectML.PerfectML.Algorithm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPerfectML.g:178:3: ( (lv_nbtraining_3_0= ruleTrainingAmount ) )
            // InternalPerfectML.g:179:4: (lv_nbtraining_3_0= ruleTrainingAmount )
            {
            // InternalPerfectML.g:179:4: (lv_nbtraining_3_0= ruleTrainingAmount )
            // InternalPerfectML.g:180:5: lv_nbtraining_3_0= ruleTrainingAmount
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getNbtrainingTrainingAmountParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_nbtraining_3_0=ruleTrainingAmount();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"nbtraining",
            						lv_nbtraining_3_0,
            						"org.xtext.example.perfectML.PerfectML.TrainingAmount");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPerfectML.g:197:3: ( (lv_column_4_0= ruleColumnDeclarations ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPerfectML.g:198:4: (lv_column_4_0= ruleColumnDeclarations )
                    {
                    // InternalPerfectML.g:198:4: (lv_column_4_0= ruleColumnDeclarations )
                    // InternalPerfectML.g:199:5: lv_column_4_0= ruleColumnDeclarations
                    {

                    					newCompositeNode(grammarAccess.getProgramAccess().getColumnColumnDeclarationsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_column_4_0=ruleColumnDeclarations();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProgramRule());
                    					}
                    					set(
                    						current,
                    						"column",
                    						lv_column_4_0,
                    						"org.xtext.example.perfectML.PerfectML.ColumnDeclarations");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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


    // $ANTLR start "entryRuleInput"
    // InternalPerfectML.g:220:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalPerfectML.g:220:46: (iv_ruleInput= ruleInput EOF )
            // InternalPerfectML.g:221:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalPerfectML.g:227:1: ruleInput returns [EObject current=null] : (otherlv_0= 'Use' otherlv_1= 'source' otherlv_2= 'data' otherlv_3= ':' ( (lv_PATH_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_PATH_4_0=null;


        	enterRule();

        try {
            // InternalPerfectML.g:233:2: ( (otherlv_0= 'Use' otherlv_1= 'source' otherlv_2= 'data' otherlv_3= ':' ( (lv_PATH_4_0= RULE_STRING ) ) ) )
            // InternalPerfectML.g:234:2: (otherlv_0= 'Use' otherlv_1= 'source' otherlv_2= 'data' otherlv_3= ':' ( (lv_PATH_4_0= RULE_STRING ) ) )
            {
            // InternalPerfectML.g:234:2: (otherlv_0= 'Use' otherlv_1= 'source' otherlv_2= 'data' otherlv_3= ':' ( (lv_PATH_4_0= RULE_STRING ) ) )
            // InternalPerfectML.g:235:3: otherlv_0= 'Use' otherlv_1= 'source' otherlv_2= 'data' otherlv_3= ':' ( (lv_PATH_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getUseKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getSourceKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getDataKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getInputAccess().getColonKeyword_3());
            		
            // InternalPerfectML.g:251:3: ( (lv_PATH_4_0= RULE_STRING ) )
            // InternalPerfectML.g:252:4: (lv_PATH_4_0= RULE_STRING )
            {
            // InternalPerfectML.g:252:4: (lv_PATH_4_0= RULE_STRING )
            // InternalPerfectML.g:253:5: lv_PATH_4_0= RULE_STRING
            {
            lv_PATH_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_PATH_4_0, grammarAccess.getInputAccess().getPATHSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"PATH",
            						lv_PATH_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalPerfectML.g:273:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalPerfectML.g:273:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalPerfectML.g:274:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalPerfectML.g:280:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'Use' otherlv_1= 'output' otherlv_2= 'file' otherlv_3= ':' ( (lv_PATH_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_PATH_4_0=null;


        	enterRule();

        try {
            // InternalPerfectML.g:286:2: ( (otherlv_0= 'Use' otherlv_1= 'output' otherlv_2= 'file' otherlv_3= ':' ( (lv_PATH_4_0= RULE_STRING ) ) ) )
            // InternalPerfectML.g:287:2: (otherlv_0= 'Use' otherlv_1= 'output' otherlv_2= 'file' otherlv_3= ':' ( (lv_PATH_4_0= RULE_STRING ) ) )
            {
            // InternalPerfectML.g:287:2: (otherlv_0= 'Use' otherlv_1= 'output' otherlv_2= 'file' otherlv_3= ':' ( (lv_PATH_4_0= RULE_STRING ) ) )
            // InternalPerfectML.g:288:3: otherlv_0= 'Use' otherlv_1= 'output' otherlv_2= 'file' otherlv_3= ':' ( (lv_PATH_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getUseKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getOutputKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getFileKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getColonKeyword_3());
            		
            // InternalPerfectML.g:304:3: ( (lv_PATH_4_0= RULE_STRING ) )
            // InternalPerfectML.g:305:4: (lv_PATH_4_0= RULE_STRING )
            {
            // InternalPerfectML.g:305:4: (lv_PATH_4_0= RULE_STRING )
            // InternalPerfectML.g:306:5: lv_PATH_4_0= RULE_STRING
            {
            lv_PATH_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_PATH_4_0, grammarAccess.getOutputAccess().getPATHSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"PATH",
            						lv_PATH_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleAlgorithm"
    // InternalPerfectML.g:326:1: entryRuleAlgorithm returns [EObject current=null] : iv_ruleAlgorithm= ruleAlgorithm EOF ;
    public final EObject entryRuleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithm = null;


        try {
            // InternalPerfectML.g:326:50: (iv_ruleAlgorithm= ruleAlgorithm EOF )
            // InternalPerfectML.g:327:2: iv_ruleAlgorithm= ruleAlgorithm EOF
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
    // InternalPerfectML.g:333:1: ruleAlgorithm returns [EObject current=null] : (otherlv_0= 'Use' (this_MLPClassifier_1= ruleMLPClassifier | this_SVC_2= ruleSVC | this_KNeighborsClassifier_3= ruleKNeighborsClassifier ) ) ;
    public final EObject ruleAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_MLPClassifier_1 = null;

        EObject this_SVC_2 = null;

        EObject this_KNeighborsClassifier_3 = null;



        	enterRule();

        try {
            // InternalPerfectML.g:339:2: ( (otherlv_0= 'Use' (this_MLPClassifier_1= ruleMLPClassifier | this_SVC_2= ruleSVC | this_KNeighborsClassifier_3= ruleKNeighborsClassifier ) ) )
            // InternalPerfectML.g:340:2: (otherlv_0= 'Use' (this_MLPClassifier_1= ruleMLPClassifier | this_SVC_2= ruleSVC | this_KNeighborsClassifier_3= ruleKNeighborsClassifier ) )
            {
            // InternalPerfectML.g:340:2: (otherlv_0= 'Use' (this_MLPClassifier_1= ruleMLPClassifier | this_SVC_2= ruleSVC | this_KNeighborsClassifier_3= ruleKNeighborsClassifier ) )
            // InternalPerfectML.g:341:3: otherlv_0= 'Use' (this_MLPClassifier_1= ruleMLPClassifier | this_SVC_2= ruleSVC | this_KNeighborsClassifier_3= ruleKNeighborsClassifier )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmAccess().getUseKeyword_0());
            		
            // InternalPerfectML.g:345:3: (this_MLPClassifier_1= ruleMLPClassifier | this_SVC_2= ruleSVC | this_KNeighborsClassifier_3= ruleKNeighborsClassifier )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 57:
                {
                alt3=2;
                }
                break;
            case 77:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPerfectML.g:346:4: this_MLPClassifier_1= ruleMLPClassifier
                    {

                    				newCompositeNode(grammarAccess.getAlgorithmAccess().getMLPClassifierParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_MLPClassifier_1=ruleMLPClassifier();

                    state._fsp--;


                    				current = this_MLPClassifier_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:355:4: this_SVC_2= ruleSVC
                    {

                    				newCompositeNode(grammarAccess.getAlgorithmAccess().getSVCParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_SVC_2=ruleSVC();

                    state._fsp--;


                    				current = this_SVC_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalPerfectML.g:364:4: this_KNeighborsClassifier_3= ruleKNeighborsClassifier
                    {

                    				newCompositeNode(grammarAccess.getAlgorithmAccess().getKNeighborsClassifierParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_KNeighborsClassifier_3=ruleKNeighborsClassifier();

                    state._fsp--;


                    				current = this_KNeighborsClassifier_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

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
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "entryRuleMLPClassifier"
    // InternalPerfectML.g:377:1: entryRuleMLPClassifier returns [EObject current=null] : iv_ruleMLPClassifier= ruleMLPClassifier EOF ;
    public final EObject entryRuleMLPClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMLPClassifier = null;


        try {
            // InternalPerfectML.g:377:54: (iv_ruleMLPClassifier= ruleMLPClassifier EOF )
            // InternalPerfectML.g:378:2: iv_ruleMLPClassifier= ruleMLPClassifier EOF
            {
             newCompositeNode(grammarAccess.getMLPClassifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMLPClassifier=ruleMLPClassifier();

            state._fsp--;

             current =iv_ruleMLPClassifier; 
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
    // $ANTLR end "entryRuleMLPClassifier"


    // $ANTLR start "ruleMLPClassifier"
    // InternalPerfectML.g:384:1: ruleMLPClassifier returns [EObject current=null] : ( () otherlv_1= 'MLPClassifier' otherlv_2= 'with' ( ( (lv_hidden_layer_sizes_def_3_0= 'hidden_layer_sizes' ) ) otherlv_4= '=' otherlv_5= '(' ( (lv_hidden_layer_sizes_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_hidden_layer_sizes_8_0= RULE_INT ) ) )* otherlv_9= ')' )? ( ( (lv_activation_def_10_0= 'activation' ) ) otherlv_11= '=' ( ( (lv_activation_12_1= 'identity' | lv_activation_12_2= 'logistic' | lv_activation_12_3= 'tanh' | lv_activation_12_4= 'relu' ) ) ) )? ( ( (lv_solver_def_13_0= 'solver' ) ) otherlv_14= '=' ( ( (lv_solver_15_1= 'lbfgs' | lv_solver_15_2= 'sgd' | lv_solver_15_3= 'adam' ) ) ) )? ( ( (lv_alpha_def_16_0= 'alpha' ) ) otherlv_17= '=' ( (lv_alpha_18_0= ruleFLOAT ) ) )? ( ( (lv_batch_size_def_19_0= 'batch_size' ) ) otherlv_20= '=' ( (lv_batch_size_21_0= RULE_INT ) ) )? ( ( (lv_learning_rate_def_22_0= 'learning_rate' ) ) otherlv_23= '=' ( ( (lv_learning_rate_24_1= 'constant' | lv_learning_rate_24_2= 'invscaling' | lv_learning_rate_24_3= 'adaptive' ) ) ) )? ( ( (lv_learning_rate_init_def_25_0= 'learning_rate_init' ) ) otherlv_26= '=' ( (lv_learning_rate_init_27_0= ruleFLOAT ) ) )? ( ( (lv_power_t_def_28_0= 'power_t' ) ) otherlv_29= '=' ( (lv_power_t_30_0= ruleFLOAT ) ) )? ( ( (lv_max_iteer_def_31_0= 'max_iter' ) ) otherlv_32= '=' ( (lv_max_iter_33_0= ruleFLOAT ) ) )? ( ( (lv_shuffle_def_34_0= 'shuffle' ) ) otherlv_35= '=' ( (lv_shuffle_36_0= ruleBOOL ) ) )? ( ( (lv_random_state_def_37_0= 'random_state' ) ) otherlv_38= '=' ( (lv_random_state_39_0= RULE_INT ) ) )? ( ( (lv_tolerance_def_40_0= 'tolerance' ) ) otherlv_41= '=' ( (lv_tolerance_42_0= ruleFLOAT ) ) )? ( ( (lv_verbose_def_43_0= 'verbose' ) ) otherlv_44= '=' ( (lv_verbose_45_0= ruleBOOL ) ) )? ( ( (lv_warm_start_def_46_0= 'warm_start' ) ) otherlv_47= '=' ( (lv_warm_start_48_0= ruleBOOL ) ) )? ( ( (lv_momentum_def_49_0= 'momentum' ) ) otherlv_50= '=' ( (lv_momentum_51_0= ruleFLOAT ) ) )? ( ( (lv_nesterovs_momentum_def_52_0= 'nesterovs_momentum' ) ) otherlv_53= '=' ( (lv_nesterovs_momentum_54_0= ruleBOOL ) ) )? ( ( (lv_early_stopping_def_55_0= 'early_stopping' ) ) otherlv_56= '=' ( (lv_early_stopping_57_0= ruleBOOL ) ) )? ( ( (lv_validation_fraction_def_58_0= 'validation_fraction' ) ) otherlv_59= '=' ( (lv_validation_fraction_60_0= ruleFLOAT ) ) )? ( ( (lv_beta_1_def_61_0= 'beta_1' ) ) otherlv_62= '=' ( (lv_beta_1_63_0= ruleFLOAT ) ) )? ( ( (lv_beta_2_def_64_0= 'beta_2' ) ) otherlv_65= '=' ( (lv_beta_2_66_0= ruleFLOAT ) ) )? ( ( (lv_epsilon_def_67_0= 'epsilon' ) ) otherlv_68= '=' ( (lv_epsilon_69_0= ruleFLOAT ) ) )? ( ( (lv_n_iter_no_change_def_70_0= 'n_iter_no_change' ) ) otherlv_71= '=' ( (lv_n_iter_no_change_72_0= RULE_INT ) ) )? ( ( (lv_max_fun_def_73_0= 'max_fun' ) ) otherlv_74= '=' ( (lv_max_fun_75_0= RULE_INT ) ) )? ) ;
    public final EObject ruleMLPClassifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_hidden_layer_sizes_def_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_hidden_layer_sizes_6_0=null;
        Token otherlv_7=null;
        Token lv_hidden_layer_sizes_8_0=null;
        Token otherlv_9=null;
        Token lv_activation_def_10_0=null;
        Token otherlv_11=null;
        Token lv_activation_12_1=null;
        Token lv_activation_12_2=null;
        Token lv_activation_12_3=null;
        Token lv_activation_12_4=null;
        Token lv_solver_def_13_0=null;
        Token otherlv_14=null;
        Token lv_solver_15_1=null;
        Token lv_solver_15_2=null;
        Token lv_solver_15_3=null;
        Token lv_alpha_def_16_0=null;
        Token otherlv_17=null;
        Token lv_batch_size_def_19_0=null;
        Token otherlv_20=null;
        Token lv_batch_size_21_0=null;
        Token lv_learning_rate_def_22_0=null;
        Token otherlv_23=null;
        Token lv_learning_rate_24_1=null;
        Token lv_learning_rate_24_2=null;
        Token lv_learning_rate_24_3=null;
        Token lv_learning_rate_init_def_25_0=null;
        Token otherlv_26=null;
        Token lv_power_t_def_28_0=null;
        Token otherlv_29=null;
        Token lv_max_iteer_def_31_0=null;
        Token otherlv_32=null;
        Token lv_shuffle_def_34_0=null;
        Token otherlv_35=null;
        Token lv_random_state_def_37_0=null;
        Token otherlv_38=null;
        Token lv_random_state_39_0=null;
        Token lv_tolerance_def_40_0=null;
        Token otherlv_41=null;
        Token lv_verbose_def_43_0=null;
        Token otherlv_44=null;
        Token lv_warm_start_def_46_0=null;
        Token otherlv_47=null;
        Token lv_momentum_def_49_0=null;
        Token otherlv_50=null;
        Token lv_nesterovs_momentum_def_52_0=null;
        Token otherlv_53=null;
        Token lv_early_stopping_def_55_0=null;
        Token otherlv_56=null;
        Token lv_validation_fraction_def_58_0=null;
        Token otherlv_59=null;
        Token lv_beta_1_def_61_0=null;
        Token otherlv_62=null;
        Token lv_beta_2_def_64_0=null;
        Token otherlv_65=null;
        Token lv_epsilon_def_67_0=null;
        Token otherlv_68=null;
        Token lv_n_iter_no_change_def_70_0=null;
        Token otherlv_71=null;
        Token lv_n_iter_no_change_72_0=null;
        Token lv_max_fun_def_73_0=null;
        Token otherlv_74=null;
        Token lv_max_fun_75_0=null;
        EObject lv_alpha_18_0 = null;

        EObject lv_learning_rate_init_27_0 = null;

        EObject lv_power_t_30_0 = null;

        EObject lv_max_iter_33_0 = null;

        EObject lv_shuffle_36_0 = null;

        EObject lv_tolerance_42_0 = null;

        EObject lv_verbose_45_0 = null;

        EObject lv_warm_start_48_0 = null;

        EObject lv_momentum_51_0 = null;

        EObject lv_nesterovs_momentum_54_0 = null;

        EObject lv_early_stopping_57_0 = null;

        EObject lv_validation_fraction_60_0 = null;

        EObject lv_beta_1_63_0 = null;

        EObject lv_beta_2_66_0 = null;

        EObject lv_epsilon_69_0 = null;



        	enterRule();

        try {
            // InternalPerfectML.g:390:2: ( ( () otherlv_1= 'MLPClassifier' otherlv_2= 'with' ( ( (lv_hidden_layer_sizes_def_3_0= 'hidden_layer_sizes' ) ) otherlv_4= '=' otherlv_5= '(' ( (lv_hidden_layer_sizes_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_hidden_layer_sizes_8_0= RULE_INT ) ) )* otherlv_9= ')' )? ( ( (lv_activation_def_10_0= 'activation' ) ) otherlv_11= '=' ( ( (lv_activation_12_1= 'identity' | lv_activation_12_2= 'logistic' | lv_activation_12_3= 'tanh' | lv_activation_12_4= 'relu' ) ) ) )? ( ( (lv_solver_def_13_0= 'solver' ) ) otherlv_14= '=' ( ( (lv_solver_15_1= 'lbfgs' | lv_solver_15_2= 'sgd' | lv_solver_15_3= 'adam' ) ) ) )? ( ( (lv_alpha_def_16_0= 'alpha' ) ) otherlv_17= '=' ( (lv_alpha_18_0= ruleFLOAT ) ) )? ( ( (lv_batch_size_def_19_0= 'batch_size' ) ) otherlv_20= '=' ( (lv_batch_size_21_0= RULE_INT ) ) )? ( ( (lv_learning_rate_def_22_0= 'learning_rate' ) ) otherlv_23= '=' ( ( (lv_learning_rate_24_1= 'constant' | lv_learning_rate_24_2= 'invscaling' | lv_learning_rate_24_3= 'adaptive' ) ) ) )? ( ( (lv_learning_rate_init_def_25_0= 'learning_rate_init' ) ) otherlv_26= '=' ( (lv_learning_rate_init_27_0= ruleFLOAT ) ) )? ( ( (lv_power_t_def_28_0= 'power_t' ) ) otherlv_29= '=' ( (lv_power_t_30_0= ruleFLOAT ) ) )? ( ( (lv_max_iteer_def_31_0= 'max_iter' ) ) otherlv_32= '=' ( (lv_max_iter_33_0= ruleFLOAT ) ) )? ( ( (lv_shuffle_def_34_0= 'shuffle' ) ) otherlv_35= '=' ( (lv_shuffle_36_0= ruleBOOL ) ) )? ( ( (lv_random_state_def_37_0= 'random_state' ) ) otherlv_38= '=' ( (lv_random_state_39_0= RULE_INT ) ) )? ( ( (lv_tolerance_def_40_0= 'tolerance' ) ) otherlv_41= '=' ( (lv_tolerance_42_0= ruleFLOAT ) ) )? ( ( (lv_verbose_def_43_0= 'verbose' ) ) otherlv_44= '=' ( (lv_verbose_45_0= ruleBOOL ) ) )? ( ( (lv_warm_start_def_46_0= 'warm_start' ) ) otherlv_47= '=' ( (lv_warm_start_48_0= ruleBOOL ) ) )? ( ( (lv_momentum_def_49_0= 'momentum' ) ) otherlv_50= '=' ( (lv_momentum_51_0= ruleFLOAT ) ) )? ( ( (lv_nesterovs_momentum_def_52_0= 'nesterovs_momentum' ) ) otherlv_53= '=' ( (lv_nesterovs_momentum_54_0= ruleBOOL ) ) )? ( ( (lv_early_stopping_def_55_0= 'early_stopping' ) ) otherlv_56= '=' ( (lv_early_stopping_57_0= ruleBOOL ) ) )? ( ( (lv_validation_fraction_def_58_0= 'validation_fraction' ) ) otherlv_59= '=' ( (lv_validation_fraction_60_0= ruleFLOAT ) ) )? ( ( (lv_beta_1_def_61_0= 'beta_1' ) ) otherlv_62= '=' ( (lv_beta_1_63_0= ruleFLOAT ) ) )? ( ( (lv_beta_2_def_64_0= 'beta_2' ) ) otherlv_65= '=' ( (lv_beta_2_66_0= ruleFLOAT ) ) )? ( ( (lv_epsilon_def_67_0= 'epsilon' ) ) otherlv_68= '=' ( (lv_epsilon_69_0= ruleFLOAT ) ) )? ( ( (lv_n_iter_no_change_def_70_0= 'n_iter_no_change' ) ) otherlv_71= '=' ( (lv_n_iter_no_change_72_0= RULE_INT ) ) )? ( ( (lv_max_fun_def_73_0= 'max_fun' ) ) otherlv_74= '=' ( (lv_max_fun_75_0= RULE_INT ) ) )? ) )
            // InternalPerfectML.g:391:2: ( () otherlv_1= 'MLPClassifier' otherlv_2= 'with' ( ( (lv_hidden_layer_sizes_def_3_0= 'hidden_layer_sizes' ) ) otherlv_4= '=' otherlv_5= '(' ( (lv_hidden_layer_sizes_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_hidden_layer_sizes_8_0= RULE_INT ) ) )* otherlv_9= ')' )? ( ( (lv_activation_def_10_0= 'activation' ) ) otherlv_11= '=' ( ( (lv_activation_12_1= 'identity' | lv_activation_12_2= 'logistic' | lv_activation_12_3= 'tanh' | lv_activation_12_4= 'relu' ) ) ) )? ( ( (lv_solver_def_13_0= 'solver' ) ) otherlv_14= '=' ( ( (lv_solver_15_1= 'lbfgs' | lv_solver_15_2= 'sgd' | lv_solver_15_3= 'adam' ) ) ) )? ( ( (lv_alpha_def_16_0= 'alpha' ) ) otherlv_17= '=' ( (lv_alpha_18_0= ruleFLOAT ) ) )? ( ( (lv_batch_size_def_19_0= 'batch_size' ) ) otherlv_20= '=' ( (lv_batch_size_21_0= RULE_INT ) ) )? ( ( (lv_learning_rate_def_22_0= 'learning_rate' ) ) otherlv_23= '=' ( ( (lv_learning_rate_24_1= 'constant' | lv_learning_rate_24_2= 'invscaling' | lv_learning_rate_24_3= 'adaptive' ) ) ) )? ( ( (lv_learning_rate_init_def_25_0= 'learning_rate_init' ) ) otherlv_26= '=' ( (lv_learning_rate_init_27_0= ruleFLOAT ) ) )? ( ( (lv_power_t_def_28_0= 'power_t' ) ) otherlv_29= '=' ( (lv_power_t_30_0= ruleFLOAT ) ) )? ( ( (lv_max_iteer_def_31_0= 'max_iter' ) ) otherlv_32= '=' ( (lv_max_iter_33_0= ruleFLOAT ) ) )? ( ( (lv_shuffle_def_34_0= 'shuffle' ) ) otherlv_35= '=' ( (lv_shuffle_36_0= ruleBOOL ) ) )? ( ( (lv_random_state_def_37_0= 'random_state' ) ) otherlv_38= '=' ( (lv_random_state_39_0= RULE_INT ) ) )? ( ( (lv_tolerance_def_40_0= 'tolerance' ) ) otherlv_41= '=' ( (lv_tolerance_42_0= ruleFLOAT ) ) )? ( ( (lv_verbose_def_43_0= 'verbose' ) ) otherlv_44= '=' ( (lv_verbose_45_0= ruleBOOL ) ) )? ( ( (lv_warm_start_def_46_0= 'warm_start' ) ) otherlv_47= '=' ( (lv_warm_start_48_0= ruleBOOL ) ) )? ( ( (lv_momentum_def_49_0= 'momentum' ) ) otherlv_50= '=' ( (lv_momentum_51_0= ruleFLOAT ) ) )? ( ( (lv_nesterovs_momentum_def_52_0= 'nesterovs_momentum' ) ) otherlv_53= '=' ( (lv_nesterovs_momentum_54_0= ruleBOOL ) ) )? ( ( (lv_early_stopping_def_55_0= 'early_stopping' ) ) otherlv_56= '=' ( (lv_early_stopping_57_0= ruleBOOL ) ) )? ( ( (lv_validation_fraction_def_58_0= 'validation_fraction' ) ) otherlv_59= '=' ( (lv_validation_fraction_60_0= ruleFLOAT ) ) )? ( ( (lv_beta_1_def_61_0= 'beta_1' ) ) otherlv_62= '=' ( (lv_beta_1_63_0= ruleFLOAT ) ) )? ( ( (lv_beta_2_def_64_0= 'beta_2' ) ) otherlv_65= '=' ( (lv_beta_2_66_0= ruleFLOAT ) ) )? ( ( (lv_epsilon_def_67_0= 'epsilon' ) ) otherlv_68= '=' ( (lv_epsilon_69_0= ruleFLOAT ) ) )? ( ( (lv_n_iter_no_change_def_70_0= 'n_iter_no_change' ) ) otherlv_71= '=' ( (lv_n_iter_no_change_72_0= RULE_INT ) ) )? ( ( (lv_max_fun_def_73_0= 'max_fun' ) ) otherlv_74= '=' ( (lv_max_fun_75_0= RULE_INT ) ) )? )
            {
            // InternalPerfectML.g:391:2: ( () otherlv_1= 'MLPClassifier' otherlv_2= 'with' ( ( (lv_hidden_layer_sizes_def_3_0= 'hidden_layer_sizes' ) ) otherlv_4= '=' otherlv_5= '(' ( (lv_hidden_layer_sizes_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_hidden_layer_sizes_8_0= RULE_INT ) ) )* otherlv_9= ')' )? ( ( (lv_activation_def_10_0= 'activation' ) ) otherlv_11= '=' ( ( (lv_activation_12_1= 'identity' | lv_activation_12_2= 'logistic' | lv_activation_12_3= 'tanh' | lv_activation_12_4= 'relu' ) ) ) )? ( ( (lv_solver_def_13_0= 'solver' ) ) otherlv_14= '=' ( ( (lv_solver_15_1= 'lbfgs' | lv_solver_15_2= 'sgd' | lv_solver_15_3= 'adam' ) ) ) )? ( ( (lv_alpha_def_16_0= 'alpha' ) ) otherlv_17= '=' ( (lv_alpha_18_0= ruleFLOAT ) ) )? ( ( (lv_batch_size_def_19_0= 'batch_size' ) ) otherlv_20= '=' ( (lv_batch_size_21_0= RULE_INT ) ) )? ( ( (lv_learning_rate_def_22_0= 'learning_rate' ) ) otherlv_23= '=' ( ( (lv_learning_rate_24_1= 'constant' | lv_learning_rate_24_2= 'invscaling' | lv_learning_rate_24_3= 'adaptive' ) ) ) )? ( ( (lv_learning_rate_init_def_25_0= 'learning_rate_init' ) ) otherlv_26= '=' ( (lv_learning_rate_init_27_0= ruleFLOAT ) ) )? ( ( (lv_power_t_def_28_0= 'power_t' ) ) otherlv_29= '=' ( (lv_power_t_30_0= ruleFLOAT ) ) )? ( ( (lv_max_iteer_def_31_0= 'max_iter' ) ) otherlv_32= '=' ( (lv_max_iter_33_0= ruleFLOAT ) ) )? ( ( (lv_shuffle_def_34_0= 'shuffle' ) ) otherlv_35= '=' ( (lv_shuffle_36_0= ruleBOOL ) ) )? ( ( (lv_random_state_def_37_0= 'random_state' ) ) otherlv_38= '=' ( (lv_random_state_39_0= RULE_INT ) ) )? ( ( (lv_tolerance_def_40_0= 'tolerance' ) ) otherlv_41= '=' ( (lv_tolerance_42_0= ruleFLOAT ) ) )? ( ( (lv_verbose_def_43_0= 'verbose' ) ) otherlv_44= '=' ( (lv_verbose_45_0= ruleBOOL ) ) )? ( ( (lv_warm_start_def_46_0= 'warm_start' ) ) otherlv_47= '=' ( (lv_warm_start_48_0= ruleBOOL ) ) )? ( ( (lv_momentum_def_49_0= 'momentum' ) ) otherlv_50= '=' ( (lv_momentum_51_0= ruleFLOAT ) ) )? ( ( (lv_nesterovs_momentum_def_52_0= 'nesterovs_momentum' ) ) otherlv_53= '=' ( (lv_nesterovs_momentum_54_0= ruleBOOL ) ) )? ( ( (lv_early_stopping_def_55_0= 'early_stopping' ) ) otherlv_56= '=' ( (lv_early_stopping_57_0= ruleBOOL ) ) )? ( ( (lv_validation_fraction_def_58_0= 'validation_fraction' ) ) otherlv_59= '=' ( (lv_validation_fraction_60_0= ruleFLOAT ) ) )? ( ( (lv_beta_1_def_61_0= 'beta_1' ) ) otherlv_62= '=' ( (lv_beta_1_63_0= ruleFLOAT ) ) )? ( ( (lv_beta_2_def_64_0= 'beta_2' ) ) otherlv_65= '=' ( (lv_beta_2_66_0= ruleFLOAT ) ) )? ( ( (lv_epsilon_def_67_0= 'epsilon' ) ) otherlv_68= '=' ( (lv_epsilon_69_0= ruleFLOAT ) ) )? ( ( (lv_n_iter_no_change_def_70_0= 'n_iter_no_change' ) ) otherlv_71= '=' ( (lv_n_iter_no_change_72_0= RULE_INT ) ) )? ( ( (lv_max_fun_def_73_0= 'max_fun' ) ) otherlv_74= '=' ( (lv_max_fun_75_0= RULE_INT ) ) )? )
            // InternalPerfectML.g:392:3: () otherlv_1= 'MLPClassifier' otherlv_2= 'with' ( ( (lv_hidden_layer_sizes_def_3_0= 'hidden_layer_sizes' ) ) otherlv_4= '=' otherlv_5= '(' ( (lv_hidden_layer_sizes_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_hidden_layer_sizes_8_0= RULE_INT ) ) )* otherlv_9= ')' )? ( ( (lv_activation_def_10_0= 'activation' ) ) otherlv_11= '=' ( ( (lv_activation_12_1= 'identity' | lv_activation_12_2= 'logistic' | lv_activation_12_3= 'tanh' | lv_activation_12_4= 'relu' ) ) ) )? ( ( (lv_solver_def_13_0= 'solver' ) ) otherlv_14= '=' ( ( (lv_solver_15_1= 'lbfgs' | lv_solver_15_2= 'sgd' | lv_solver_15_3= 'adam' ) ) ) )? ( ( (lv_alpha_def_16_0= 'alpha' ) ) otherlv_17= '=' ( (lv_alpha_18_0= ruleFLOAT ) ) )? ( ( (lv_batch_size_def_19_0= 'batch_size' ) ) otherlv_20= '=' ( (lv_batch_size_21_0= RULE_INT ) ) )? ( ( (lv_learning_rate_def_22_0= 'learning_rate' ) ) otherlv_23= '=' ( ( (lv_learning_rate_24_1= 'constant' | lv_learning_rate_24_2= 'invscaling' | lv_learning_rate_24_3= 'adaptive' ) ) ) )? ( ( (lv_learning_rate_init_def_25_0= 'learning_rate_init' ) ) otherlv_26= '=' ( (lv_learning_rate_init_27_0= ruleFLOAT ) ) )? ( ( (lv_power_t_def_28_0= 'power_t' ) ) otherlv_29= '=' ( (lv_power_t_30_0= ruleFLOAT ) ) )? ( ( (lv_max_iteer_def_31_0= 'max_iter' ) ) otherlv_32= '=' ( (lv_max_iter_33_0= ruleFLOAT ) ) )? ( ( (lv_shuffle_def_34_0= 'shuffle' ) ) otherlv_35= '=' ( (lv_shuffle_36_0= ruleBOOL ) ) )? ( ( (lv_random_state_def_37_0= 'random_state' ) ) otherlv_38= '=' ( (lv_random_state_39_0= RULE_INT ) ) )? ( ( (lv_tolerance_def_40_0= 'tolerance' ) ) otherlv_41= '=' ( (lv_tolerance_42_0= ruleFLOAT ) ) )? ( ( (lv_verbose_def_43_0= 'verbose' ) ) otherlv_44= '=' ( (lv_verbose_45_0= ruleBOOL ) ) )? ( ( (lv_warm_start_def_46_0= 'warm_start' ) ) otherlv_47= '=' ( (lv_warm_start_48_0= ruleBOOL ) ) )? ( ( (lv_momentum_def_49_0= 'momentum' ) ) otherlv_50= '=' ( (lv_momentum_51_0= ruleFLOAT ) ) )? ( ( (lv_nesterovs_momentum_def_52_0= 'nesterovs_momentum' ) ) otherlv_53= '=' ( (lv_nesterovs_momentum_54_0= ruleBOOL ) ) )? ( ( (lv_early_stopping_def_55_0= 'early_stopping' ) ) otherlv_56= '=' ( (lv_early_stopping_57_0= ruleBOOL ) ) )? ( ( (lv_validation_fraction_def_58_0= 'validation_fraction' ) ) otherlv_59= '=' ( (lv_validation_fraction_60_0= ruleFLOAT ) ) )? ( ( (lv_beta_1_def_61_0= 'beta_1' ) ) otherlv_62= '=' ( (lv_beta_1_63_0= ruleFLOAT ) ) )? ( ( (lv_beta_2_def_64_0= 'beta_2' ) ) otherlv_65= '=' ( (lv_beta_2_66_0= ruleFLOAT ) ) )? ( ( (lv_epsilon_def_67_0= 'epsilon' ) ) otherlv_68= '=' ( (lv_epsilon_69_0= ruleFLOAT ) ) )? ( ( (lv_n_iter_no_change_def_70_0= 'n_iter_no_change' ) ) otherlv_71= '=' ( (lv_n_iter_no_change_72_0= RULE_INT ) ) )? ( ( (lv_max_fun_def_73_0= 'max_fun' ) ) otherlv_74= '=' ( (lv_max_fun_75_0= RULE_INT ) ) )?
            {
            // InternalPerfectML.g:392:3: ()
            // InternalPerfectML.g:393:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMLPClassifierAccess().getMLPClassifierAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMLPClassifierAccess().getMLPClassifierKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getMLPClassifierAccess().getWithKeyword_2());
            		
            // InternalPerfectML.g:407:3: ( ( (lv_hidden_layer_sizes_def_3_0= 'hidden_layer_sizes' ) ) otherlv_4= '=' otherlv_5= '(' ( (lv_hidden_layer_sizes_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_hidden_layer_sizes_8_0= RULE_INT ) ) )* otherlv_9= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPerfectML.g:408:4: ( (lv_hidden_layer_sizes_def_3_0= 'hidden_layer_sizes' ) ) otherlv_4= '=' otherlv_5= '(' ( (lv_hidden_layer_sizes_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_hidden_layer_sizes_8_0= RULE_INT ) ) )* otherlv_9= ')'
                    {
                    // InternalPerfectML.g:408:4: ( (lv_hidden_layer_sizes_def_3_0= 'hidden_layer_sizes' ) )
                    // InternalPerfectML.g:409:5: (lv_hidden_layer_sizes_def_3_0= 'hidden_layer_sizes' )
                    {
                    // InternalPerfectML.g:409:5: (lv_hidden_layer_sizes_def_3_0= 'hidden_layer_sizes' )
                    // InternalPerfectML.g:410:6: lv_hidden_layer_sizes_def_3_0= 'hidden_layer_sizes'
                    {
                    lv_hidden_layer_sizes_def_3_0=(Token)match(input,20,FOLLOW_15); 

                    						newLeafNode(lv_hidden_layer_sizes_def_3_0, grammarAccess.getMLPClassifierAccess().getHidden_layer_sizes_defHidden_layer_sizesKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "hidden_layer_sizes_def", lv_hidden_layer_sizes_def_3_0 != null, "hidden_layer_sizes");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_3_1());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getMLPClassifierAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalPerfectML.g:430:4: ( (lv_hidden_layer_sizes_6_0= RULE_INT ) )
                    // InternalPerfectML.g:431:5: (lv_hidden_layer_sizes_6_0= RULE_INT )
                    {
                    // InternalPerfectML.g:431:5: (lv_hidden_layer_sizes_6_0= RULE_INT )
                    // InternalPerfectML.g:432:6: lv_hidden_layer_sizes_6_0= RULE_INT
                    {
                    lv_hidden_layer_sizes_6_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_hidden_layer_sizes_6_0, grammarAccess.getMLPClassifierAccess().getHidden_layer_sizesINTTerminalRuleCall_3_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"hidden_layer_sizes",
                    							lv_hidden_layer_sizes_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPerfectML.g:448:4: (otherlv_7= ',' ( (lv_hidden_layer_sizes_8_0= RULE_INT ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==23) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPerfectML.g:449:5: otherlv_7= ',' ( (lv_hidden_layer_sizes_8_0= RULE_INT ) )
                    	    {
                    	    otherlv_7=(Token)match(input,23,FOLLOW_17); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMLPClassifierAccess().getCommaKeyword_3_4_0());
                    	    				
                    	    // InternalPerfectML.g:453:5: ( (lv_hidden_layer_sizes_8_0= RULE_INT ) )
                    	    // InternalPerfectML.g:454:6: (lv_hidden_layer_sizes_8_0= RULE_INT )
                    	    {
                    	    // InternalPerfectML.g:454:6: (lv_hidden_layer_sizes_8_0= RULE_INT )
                    	    // InternalPerfectML.g:455:7: lv_hidden_layer_sizes_8_0= RULE_INT
                    	    {
                    	    lv_hidden_layer_sizes_8_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    	    							newLeafNode(lv_hidden_layer_sizes_8_0, grammarAccess.getMLPClassifierAccess().getHidden_layer_sizesINTTerminalRuleCall_3_4_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMLPClassifierRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"hidden_layer_sizes",
                    	    								lv_hidden_layer_sizes_8_0,
                    	    								"org.eclipse.xtext.common.Terminals.INT");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getMLPClassifierAccess().getRightParenthesisKeyword_3_5());
                    			

                    }
                    break;

            }

            // InternalPerfectML.g:477:3: ( ( (lv_activation_def_10_0= 'activation' ) ) otherlv_11= '=' ( ( (lv_activation_12_1= 'identity' | lv_activation_12_2= 'logistic' | lv_activation_12_3= 'tanh' | lv_activation_12_4= 'relu' ) ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPerfectML.g:478:4: ( (lv_activation_def_10_0= 'activation' ) ) otherlv_11= '=' ( ( (lv_activation_12_1= 'identity' | lv_activation_12_2= 'logistic' | lv_activation_12_3= 'tanh' | lv_activation_12_4= 'relu' ) ) )
                    {
                    // InternalPerfectML.g:478:4: ( (lv_activation_def_10_0= 'activation' ) )
                    // InternalPerfectML.g:479:5: (lv_activation_def_10_0= 'activation' )
                    {
                    // InternalPerfectML.g:479:5: (lv_activation_def_10_0= 'activation' )
                    // InternalPerfectML.g:480:6: lv_activation_def_10_0= 'activation'
                    {
                    lv_activation_def_10_0=(Token)match(input,25,FOLLOW_15); 

                    						newLeafNode(lv_activation_def_10_0, grammarAccess.getMLPClassifierAccess().getActivation_defActivationKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "activation_def", lv_activation_def_10_0 != null, "activation");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,21,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalPerfectML.g:496:4: ( ( (lv_activation_12_1= 'identity' | lv_activation_12_2= 'logistic' | lv_activation_12_3= 'tanh' | lv_activation_12_4= 'relu' ) ) )
                    // InternalPerfectML.g:497:5: ( (lv_activation_12_1= 'identity' | lv_activation_12_2= 'logistic' | lv_activation_12_3= 'tanh' | lv_activation_12_4= 'relu' ) )
                    {
                    // InternalPerfectML.g:497:5: ( (lv_activation_12_1= 'identity' | lv_activation_12_2= 'logistic' | lv_activation_12_3= 'tanh' | lv_activation_12_4= 'relu' ) )
                    // InternalPerfectML.g:498:6: (lv_activation_12_1= 'identity' | lv_activation_12_2= 'logistic' | lv_activation_12_3= 'tanh' | lv_activation_12_4= 'relu' )
                    {
                    // InternalPerfectML.g:498:6: (lv_activation_12_1= 'identity' | lv_activation_12_2= 'logistic' | lv_activation_12_3= 'tanh' | lv_activation_12_4= 'relu' )
                    int alt6=4;
                    switch ( input.LA(1) ) {
                    case 26:
                        {
                        alt6=1;
                        }
                        break;
                    case 27:
                        {
                        alt6=2;
                        }
                        break;
                    case 28:
                        {
                        alt6=3;
                        }
                        break;
                    case 29:
                        {
                        alt6=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // InternalPerfectML.g:499:7: lv_activation_12_1= 'identity'
                            {
                            lv_activation_12_1=(Token)match(input,26,FOLLOW_21); 

                            							newLeafNode(lv_activation_12_1, grammarAccess.getMLPClassifierAccess().getActivationIdentityKeyword_4_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMLPClassifierRule());
                            							}
                            							setWithLastConsumed(current, "activation", lv_activation_12_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalPerfectML.g:510:7: lv_activation_12_2= 'logistic'
                            {
                            lv_activation_12_2=(Token)match(input,27,FOLLOW_21); 

                            							newLeafNode(lv_activation_12_2, grammarAccess.getMLPClassifierAccess().getActivationLogisticKeyword_4_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMLPClassifierRule());
                            							}
                            							setWithLastConsumed(current, "activation", lv_activation_12_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalPerfectML.g:521:7: lv_activation_12_3= 'tanh'
                            {
                            lv_activation_12_3=(Token)match(input,28,FOLLOW_21); 

                            							newLeafNode(lv_activation_12_3, grammarAccess.getMLPClassifierAccess().getActivationTanhKeyword_4_2_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMLPClassifierRule());
                            							}
                            							setWithLastConsumed(current, "activation", lv_activation_12_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalPerfectML.g:532:7: lv_activation_12_4= 'relu'
                            {
                            lv_activation_12_4=(Token)match(input,29,FOLLOW_21); 

                            							newLeafNode(lv_activation_12_4, grammarAccess.getMLPClassifierAccess().getActivationReluKeyword_4_2_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMLPClassifierRule());
                            							}
                            							setWithLastConsumed(current, "activation", lv_activation_12_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:546:3: ( ( (lv_solver_def_13_0= 'solver' ) ) otherlv_14= '=' ( ( (lv_solver_15_1= 'lbfgs' | lv_solver_15_2= 'sgd' | lv_solver_15_3= 'adam' ) ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPerfectML.g:547:4: ( (lv_solver_def_13_0= 'solver' ) ) otherlv_14= '=' ( ( (lv_solver_15_1= 'lbfgs' | lv_solver_15_2= 'sgd' | lv_solver_15_3= 'adam' ) ) )
                    {
                    // InternalPerfectML.g:547:4: ( (lv_solver_def_13_0= 'solver' ) )
                    // InternalPerfectML.g:548:5: (lv_solver_def_13_0= 'solver' )
                    {
                    // InternalPerfectML.g:548:5: (lv_solver_def_13_0= 'solver' )
                    // InternalPerfectML.g:549:6: lv_solver_def_13_0= 'solver'
                    {
                    lv_solver_def_13_0=(Token)match(input,30,FOLLOW_15); 

                    						newLeafNode(lv_solver_def_13_0, grammarAccess.getMLPClassifierAccess().getSolver_defSolverKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "solver_def", lv_solver_def_13_0 != null, "solver");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,21,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalPerfectML.g:565:4: ( ( (lv_solver_15_1= 'lbfgs' | lv_solver_15_2= 'sgd' | lv_solver_15_3= 'adam' ) ) )
                    // InternalPerfectML.g:566:5: ( (lv_solver_15_1= 'lbfgs' | lv_solver_15_2= 'sgd' | lv_solver_15_3= 'adam' ) )
                    {
                    // InternalPerfectML.g:566:5: ( (lv_solver_15_1= 'lbfgs' | lv_solver_15_2= 'sgd' | lv_solver_15_3= 'adam' ) )
                    // InternalPerfectML.g:567:6: (lv_solver_15_1= 'lbfgs' | lv_solver_15_2= 'sgd' | lv_solver_15_3= 'adam' )
                    {
                    // InternalPerfectML.g:567:6: (lv_solver_15_1= 'lbfgs' | lv_solver_15_2= 'sgd' | lv_solver_15_3= 'adam' )
                    int alt8=3;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt8=1;
                        }
                        break;
                    case 32:
                        {
                        alt8=2;
                        }
                        break;
                    case 33:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // InternalPerfectML.g:568:7: lv_solver_15_1= 'lbfgs'
                            {
                            lv_solver_15_1=(Token)match(input,31,FOLLOW_23); 

                            							newLeafNode(lv_solver_15_1, grammarAccess.getMLPClassifierAccess().getSolverLbfgsKeyword_5_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMLPClassifierRule());
                            							}
                            							setWithLastConsumed(current, "solver", lv_solver_15_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalPerfectML.g:579:7: lv_solver_15_2= 'sgd'
                            {
                            lv_solver_15_2=(Token)match(input,32,FOLLOW_23); 

                            							newLeafNode(lv_solver_15_2, grammarAccess.getMLPClassifierAccess().getSolverSgdKeyword_5_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMLPClassifierRule());
                            							}
                            							setWithLastConsumed(current, "solver", lv_solver_15_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalPerfectML.g:590:7: lv_solver_15_3= 'adam'
                            {
                            lv_solver_15_3=(Token)match(input,33,FOLLOW_23); 

                            							newLeafNode(lv_solver_15_3, grammarAccess.getMLPClassifierAccess().getSolverAdamKeyword_5_2_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMLPClassifierRule());
                            							}
                            							setWithLastConsumed(current, "solver", lv_solver_15_3, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:604:3: ( ( (lv_alpha_def_16_0= 'alpha' ) ) otherlv_17= '=' ( (lv_alpha_18_0= ruleFLOAT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPerfectML.g:605:4: ( (lv_alpha_def_16_0= 'alpha' ) ) otherlv_17= '=' ( (lv_alpha_18_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:605:4: ( (lv_alpha_def_16_0= 'alpha' ) )
                    // InternalPerfectML.g:606:5: (lv_alpha_def_16_0= 'alpha' )
                    {
                    // InternalPerfectML.g:606:5: (lv_alpha_def_16_0= 'alpha' )
                    // InternalPerfectML.g:607:6: lv_alpha_def_16_0= 'alpha'
                    {
                    lv_alpha_def_16_0=(Token)match(input,34,FOLLOW_15); 

                    						newLeafNode(lv_alpha_def_16_0, grammarAccess.getMLPClassifierAccess().getAlpha_defAlphaKeyword_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "alpha_def", lv_alpha_def_16_0 != null, "alpha");
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalPerfectML.g:623:4: ( (lv_alpha_18_0= ruleFLOAT ) )
                    // InternalPerfectML.g:624:5: (lv_alpha_18_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:624:5: (lv_alpha_18_0= ruleFLOAT )
                    // InternalPerfectML.g:625:6: lv_alpha_18_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getAlphaFLOATParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_alpha_18_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"alpha",
                    							lv_alpha_18_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:643:3: ( ( (lv_batch_size_def_19_0= 'batch_size' ) ) otherlv_20= '=' ( (lv_batch_size_21_0= RULE_INT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPerfectML.g:644:4: ( (lv_batch_size_def_19_0= 'batch_size' ) ) otherlv_20= '=' ( (lv_batch_size_21_0= RULE_INT ) )
                    {
                    // InternalPerfectML.g:644:4: ( (lv_batch_size_def_19_0= 'batch_size' ) )
                    // InternalPerfectML.g:645:5: (lv_batch_size_def_19_0= 'batch_size' )
                    {
                    // InternalPerfectML.g:645:5: (lv_batch_size_def_19_0= 'batch_size' )
                    // InternalPerfectML.g:646:6: lv_batch_size_def_19_0= 'batch_size'
                    {
                    lv_batch_size_def_19_0=(Token)match(input,35,FOLLOW_15); 

                    						newLeafNode(lv_batch_size_def_19_0, grammarAccess.getMLPClassifierAccess().getBatch_size_defBatch_sizeKeyword_7_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "batch_size_def", lv_batch_size_def_19_0 != null, "batch_size");
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_20, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalPerfectML.g:662:4: ( (lv_batch_size_21_0= RULE_INT ) )
                    // InternalPerfectML.g:663:5: (lv_batch_size_21_0= RULE_INT )
                    {
                    // InternalPerfectML.g:663:5: (lv_batch_size_21_0= RULE_INT )
                    // InternalPerfectML.g:664:6: lv_batch_size_21_0= RULE_INT
                    {
                    lv_batch_size_21_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_batch_size_21_0, grammarAccess.getMLPClassifierAccess().getBatch_sizeINTTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"batch_size",
                    							lv_batch_size_21_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:681:3: ( ( (lv_learning_rate_def_22_0= 'learning_rate' ) ) otherlv_23= '=' ( ( (lv_learning_rate_24_1= 'constant' | lv_learning_rate_24_2= 'invscaling' | lv_learning_rate_24_3= 'adaptive' ) ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPerfectML.g:682:4: ( (lv_learning_rate_def_22_0= 'learning_rate' ) ) otherlv_23= '=' ( ( (lv_learning_rate_24_1= 'constant' | lv_learning_rate_24_2= 'invscaling' | lv_learning_rate_24_3= 'adaptive' ) ) )
                    {
                    // InternalPerfectML.g:682:4: ( (lv_learning_rate_def_22_0= 'learning_rate' ) )
                    // InternalPerfectML.g:683:5: (lv_learning_rate_def_22_0= 'learning_rate' )
                    {
                    // InternalPerfectML.g:683:5: (lv_learning_rate_def_22_0= 'learning_rate' )
                    // InternalPerfectML.g:684:6: lv_learning_rate_def_22_0= 'learning_rate'
                    {
                    lv_learning_rate_def_22_0=(Token)match(input,36,FOLLOW_15); 

                    						newLeafNode(lv_learning_rate_def_22_0, grammarAccess.getMLPClassifierAccess().getLearning_rate_defLearning_rateKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "learning_rate_def", lv_learning_rate_def_22_0 != null, "learning_rate");
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,21,FOLLOW_26); 

                    				newLeafNode(otherlv_23, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalPerfectML.g:700:4: ( ( (lv_learning_rate_24_1= 'constant' | lv_learning_rate_24_2= 'invscaling' | lv_learning_rate_24_3= 'adaptive' ) ) )
                    // InternalPerfectML.g:701:5: ( (lv_learning_rate_24_1= 'constant' | lv_learning_rate_24_2= 'invscaling' | lv_learning_rate_24_3= 'adaptive' ) )
                    {
                    // InternalPerfectML.g:701:5: ( (lv_learning_rate_24_1= 'constant' | lv_learning_rate_24_2= 'invscaling' | lv_learning_rate_24_3= 'adaptive' ) )
                    // InternalPerfectML.g:702:6: (lv_learning_rate_24_1= 'constant' | lv_learning_rate_24_2= 'invscaling' | lv_learning_rate_24_3= 'adaptive' )
                    {
                    // InternalPerfectML.g:702:6: (lv_learning_rate_24_1= 'constant' | lv_learning_rate_24_2= 'invscaling' | lv_learning_rate_24_3= 'adaptive' )
                    int alt12=3;
                    switch ( input.LA(1) ) {
                    case 37:
                        {
                        alt12=1;
                        }
                        break;
                    case 38:
                        {
                        alt12=2;
                        }
                        break;
                    case 39:
                        {
                        alt12=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // InternalPerfectML.g:703:7: lv_learning_rate_24_1= 'constant'
                            {
                            lv_learning_rate_24_1=(Token)match(input,37,FOLLOW_27); 

                            							newLeafNode(lv_learning_rate_24_1, grammarAccess.getMLPClassifierAccess().getLearning_rateConstantKeyword_8_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMLPClassifierRule());
                            							}
                            							setWithLastConsumed(current, "learning_rate", lv_learning_rate_24_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalPerfectML.g:714:7: lv_learning_rate_24_2= 'invscaling'
                            {
                            lv_learning_rate_24_2=(Token)match(input,38,FOLLOW_27); 

                            							newLeafNode(lv_learning_rate_24_2, grammarAccess.getMLPClassifierAccess().getLearning_rateInvscalingKeyword_8_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMLPClassifierRule());
                            							}
                            							setWithLastConsumed(current, "learning_rate", lv_learning_rate_24_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalPerfectML.g:725:7: lv_learning_rate_24_3= 'adaptive'
                            {
                            lv_learning_rate_24_3=(Token)match(input,39,FOLLOW_27); 

                            							newLeafNode(lv_learning_rate_24_3, grammarAccess.getMLPClassifierAccess().getLearning_rateAdaptiveKeyword_8_2_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMLPClassifierRule());
                            							}
                            							setWithLastConsumed(current, "learning_rate", lv_learning_rate_24_3, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:739:3: ( ( (lv_learning_rate_init_def_25_0= 'learning_rate_init' ) ) otherlv_26= '=' ( (lv_learning_rate_init_27_0= ruleFLOAT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPerfectML.g:740:4: ( (lv_learning_rate_init_def_25_0= 'learning_rate_init' ) ) otherlv_26= '=' ( (lv_learning_rate_init_27_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:740:4: ( (lv_learning_rate_init_def_25_0= 'learning_rate_init' ) )
                    // InternalPerfectML.g:741:5: (lv_learning_rate_init_def_25_0= 'learning_rate_init' )
                    {
                    // InternalPerfectML.g:741:5: (lv_learning_rate_init_def_25_0= 'learning_rate_init' )
                    // InternalPerfectML.g:742:6: lv_learning_rate_init_def_25_0= 'learning_rate_init'
                    {
                    lv_learning_rate_init_def_25_0=(Token)match(input,40,FOLLOW_15); 

                    						newLeafNode(lv_learning_rate_init_def_25_0, grammarAccess.getMLPClassifierAccess().getLearning_rate_init_defLearning_rate_initKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "learning_rate_init_def", lv_learning_rate_init_def_25_0 != null, "learning_rate_init");
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_26, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalPerfectML.g:758:4: ( (lv_learning_rate_init_27_0= ruleFLOAT ) )
                    // InternalPerfectML.g:759:5: (lv_learning_rate_init_27_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:759:5: (lv_learning_rate_init_27_0= ruleFLOAT )
                    // InternalPerfectML.g:760:6: lv_learning_rate_init_27_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getLearning_rate_initFLOATParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_learning_rate_init_27_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"learning_rate_init",
                    							lv_learning_rate_init_27_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:778:3: ( ( (lv_power_t_def_28_0= 'power_t' ) ) otherlv_29= '=' ( (lv_power_t_30_0= ruleFLOAT ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPerfectML.g:779:4: ( (lv_power_t_def_28_0= 'power_t' ) ) otherlv_29= '=' ( (lv_power_t_30_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:779:4: ( (lv_power_t_def_28_0= 'power_t' ) )
                    // InternalPerfectML.g:780:5: (lv_power_t_def_28_0= 'power_t' )
                    {
                    // InternalPerfectML.g:780:5: (lv_power_t_def_28_0= 'power_t' )
                    // InternalPerfectML.g:781:6: lv_power_t_def_28_0= 'power_t'
                    {
                    lv_power_t_def_28_0=(Token)match(input,41,FOLLOW_15); 

                    						newLeafNode(lv_power_t_def_28_0, grammarAccess.getMLPClassifierAccess().getPower_t_defPower_tKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "power_t_def", lv_power_t_def_28_0 != null, "power_t");
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_29, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_10_1());
                    			
                    // InternalPerfectML.g:797:4: ( (lv_power_t_30_0= ruleFLOAT ) )
                    // InternalPerfectML.g:798:5: (lv_power_t_30_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:798:5: (lv_power_t_30_0= ruleFLOAT )
                    // InternalPerfectML.g:799:6: lv_power_t_30_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getPower_tFLOATParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_power_t_30_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"power_t",
                    							lv_power_t_30_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:817:3: ( ( (lv_max_iteer_def_31_0= 'max_iter' ) ) otherlv_32= '=' ( (lv_max_iter_33_0= ruleFLOAT ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPerfectML.g:818:4: ( (lv_max_iteer_def_31_0= 'max_iter' ) ) otherlv_32= '=' ( (lv_max_iter_33_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:818:4: ( (lv_max_iteer_def_31_0= 'max_iter' ) )
                    // InternalPerfectML.g:819:5: (lv_max_iteer_def_31_0= 'max_iter' )
                    {
                    // InternalPerfectML.g:819:5: (lv_max_iteer_def_31_0= 'max_iter' )
                    // InternalPerfectML.g:820:6: lv_max_iteer_def_31_0= 'max_iter'
                    {
                    lv_max_iteer_def_31_0=(Token)match(input,42,FOLLOW_15); 

                    						newLeafNode(lv_max_iteer_def_31_0, grammarAccess.getMLPClassifierAccess().getMax_iteer_defMax_iterKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "max_iteer_def", lv_max_iteer_def_31_0 != null, "max_iter");
                    					

                    }


                    }

                    otherlv_32=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_32, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_11_1());
                    			
                    // InternalPerfectML.g:836:4: ( (lv_max_iter_33_0= ruleFLOAT ) )
                    // InternalPerfectML.g:837:5: (lv_max_iter_33_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:837:5: (lv_max_iter_33_0= ruleFLOAT )
                    // InternalPerfectML.g:838:6: lv_max_iter_33_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getMax_iterFLOATParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_max_iter_33_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"max_iter",
                    							lv_max_iter_33_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:856:3: ( ( (lv_shuffle_def_34_0= 'shuffle' ) ) otherlv_35= '=' ( (lv_shuffle_36_0= ruleBOOL ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPerfectML.g:857:4: ( (lv_shuffle_def_34_0= 'shuffle' ) ) otherlv_35= '=' ( (lv_shuffle_36_0= ruleBOOL ) )
                    {
                    // InternalPerfectML.g:857:4: ( (lv_shuffle_def_34_0= 'shuffle' ) )
                    // InternalPerfectML.g:858:5: (lv_shuffle_def_34_0= 'shuffle' )
                    {
                    // InternalPerfectML.g:858:5: (lv_shuffle_def_34_0= 'shuffle' )
                    // InternalPerfectML.g:859:6: lv_shuffle_def_34_0= 'shuffle'
                    {
                    lv_shuffle_def_34_0=(Token)match(input,43,FOLLOW_15); 

                    						newLeafNode(lv_shuffle_def_34_0, grammarAccess.getMLPClassifierAccess().getShuffle_defShuffleKeyword_12_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "shuffle_def", lv_shuffle_def_34_0 != null, "shuffle");
                    					

                    }


                    }

                    otherlv_35=(Token)match(input,21,FOLLOW_31); 

                    				newLeafNode(otherlv_35, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_12_1());
                    			
                    // InternalPerfectML.g:875:4: ( (lv_shuffle_36_0= ruleBOOL ) )
                    // InternalPerfectML.g:876:5: (lv_shuffle_36_0= ruleBOOL )
                    {
                    // InternalPerfectML.g:876:5: (lv_shuffle_36_0= ruleBOOL )
                    // InternalPerfectML.g:877:6: lv_shuffle_36_0= ruleBOOL
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getShuffleBOOLParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_shuffle_36_0=ruleBOOL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"shuffle",
                    							lv_shuffle_36_0,
                    							"org.xtext.example.perfectML.PerfectML.BOOL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:895:3: ( ( (lv_random_state_def_37_0= 'random_state' ) ) otherlv_38= '=' ( (lv_random_state_39_0= RULE_INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPerfectML.g:896:4: ( (lv_random_state_def_37_0= 'random_state' ) ) otherlv_38= '=' ( (lv_random_state_39_0= RULE_INT ) )
                    {
                    // InternalPerfectML.g:896:4: ( (lv_random_state_def_37_0= 'random_state' ) )
                    // InternalPerfectML.g:897:5: (lv_random_state_def_37_0= 'random_state' )
                    {
                    // InternalPerfectML.g:897:5: (lv_random_state_def_37_0= 'random_state' )
                    // InternalPerfectML.g:898:6: lv_random_state_def_37_0= 'random_state'
                    {
                    lv_random_state_def_37_0=(Token)match(input,44,FOLLOW_15); 

                    						newLeafNode(lv_random_state_def_37_0, grammarAccess.getMLPClassifierAccess().getRandom_state_defRandom_stateKeyword_13_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "random_state_def", lv_random_state_def_37_0 != null, "random_state");
                    					

                    }


                    }

                    otherlv_38=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_38, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_13_1());
                    			
                    // InternalPerfectML.g:914:4: ( (lv_random_state_39_0= RULE_INT ) )
                    // InternalPerfectML.g:915:5: (lv_random_state_39_0= RULE_INT )
                    {
                    // InternalPerfectML.g:915:5: (lv_random_state_39_0= RULE_INT )
                    // InternalPerfectML.g:916:6: lv_random_state_39_0= RULE_INT
                    {
                    lv_random_state_39_0=(Token)match(input,RULE_INT,FOLLOW_33); 

                    						newLeafNode(lv_random_state_39_0, grammarAccess.getMLPClassifierAccess().getRandom_stateINTTerminalRuleCall_13_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"random_state",
                    							lv_random_state_39_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:933:3: ( ( (lv_tolerance_def_40_0= 'tolerance' ) ) otherlv_41= '=' ( (lv_tolerance_42_0= ruleFLOAT ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPerfectML.g:934:4: ( (lv_tolerance_def_40_0= 'tolerance' ) ) otherlv_41= '=' ( (lv_tolerance_42_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:934:4: ( (lv_tolerance_def_40_0= 'tolerance' ) )
                    // InternalPerfectML.g:935:5: (lv_tolerance_def_40_0= 'tolerance' )
                    {
                    // InternalPerfectML.g:935:5: (lv_tolerance_def_40_0= 'tolerance' )
                    // InternalPerfectML.g:936:6: lv_tolerance_def_40_0= 'tolerance'
                    {
                    lv_tolerance_def_40_0=(Token)match(input,45,FOLLOW_15); 

                    						newLeafNode(lv_tolerance_def_40_0, grammarAccess.getMLPClassifierAccess().getTolerance_defToleranceKeyword_14_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "tolerance_def", lv_tolerance_def_40_0 != null, "tolerance");
                    					

                    }


                    }

                    otherlv_41=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_41, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_14_1());
                    			
                    // InternalPerfectML.g:952:4: ( (lv_tolerance_42_0= ruleFLOAT ) )
                    // InternalPerfectML.g:953:5: (lv_tolerance_42_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:953:5: (lv_tolerance_42_0= ruleFLOAT )
                    // InternalPerfectML.g:954:6: lv_tolerance_42_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getToleranceFLOATParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_tolerance_42_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"tolerance",
                    							lv_tolerance_42_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:972:3: ( ( (lv_verbose_def_43_0= 'verbose' ) ) otherlv_44= '=' ( (lv_verbose_45_0= ruleBOOL ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPerfectML.g:973:4: ( (lv_verbose_def_43_0= 'verbose' ) ) otherlv_44= '=' ( (lv_verbose_45_0= ruleBOOL ) )
                    {
                    // InternalPerfectML.g:973:4: ( (lv_verbose_def_43_0= 'verbose' ) )
                    // InternalPerfectML.g:974:5: (lv_verbose_def_43_0= 'verbose' )
                    {
                    // InternalPerfectML.g:974:5: (lv_verbose_def_43_0= 'verbose' )
                    // InternalPerfectML.g:975:6: lv_verbose_def_43_0= 'verbose'
                    {
                    lv_verbose_def_43_0=(Token)match(input,46,FOLLOW_15); 

                    						newLeafNode(lv_verbose_def_43_0, grammarAccess.getMLPClassifierAccess().getVerbose_defVerboseKeyword_15_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "verbose_def", lv_verbose_def_43_0 != null, "verbose");
                    					

                    }


                    }

                    otherlv_44=(Token)match(input,21,FOLLOW_31); 

                    				newLeafNode(otherlv_44, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_15_1());
                    			
                    // InternalPerfectML.g:991:4: ( (lv_verbose_45_0= ruleBOOL ) )
                    // InternalPerfectML.g:992:5: (lv_verbose_45_0= ruleBOOL )
                    {
                    // InternalPerfectML.g:992:5: (lv_verbose_45_0= ruleBOOL )
                    // InternalPerfectML.g:993:6: lv_verbose_45_0= ruleBOOL
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getVerboseBOOLParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_verbose_45_0=ruleBOOL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"verbose",
                    							lv_verbose_45_0,
                    							"org.xtext.example.perfectML.PerfectML.BOOL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1011:3: ( ( (lv_warm_start_def_46_0= 'warm_start' ) ) otherlv_47= '=' ( (lv_warm_start_48_0= ruleBOOL ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPerfectML.g:1012:4: ( (lv_warm_start_def_46_0= 'warm_start' ) ) otherlv_47= '=' ( (lv_warm_start_48_0= ruleBOOL ) )
                    {
                    // InternalPerfectML.g:1012:4: ( (lv_warm_start_def_46_0= 'warm_start' ) )
                    // InternalPerfectML.g:1013:5: (lv_warm_start_def_46_0= 'warm_start' )
                    {
                    // InternalPerfectML.g:1013:5: (lv_warm_start_def_46_0= 'warm_start' )
                    // InternalPerfectML.g:1014:6: lv_warm_start_def_46_0= 'warm_start'
                    {
                    lv_warm_start_def_46_0=(Token)match(input,47,FOLLOW_15); 

                    						newLeafNode(lv_warm_start_def_46_0, grammarAccess.getMLPClassifierAccess().getWarm_start_defWarm_startKeyword_16_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "warm_start_def", lv_warm_start_def_46_0 != null, "warm_start");
                    					

                    }


                    }

                    otherlv_47=(Token)match(input,21,FOLLOW_31); 

                    				newLeafNode(otherlv_47, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_16_1());
                    			
                    // InternalPerfectML.g:1030:4: ( (lv_warm_start_48_0= ruleBOOL ) )
                    // InternalPerfectML.g:1031:5: (lv_warm_start_48_0= ruleBOOL )
                    {
                    // InternalPerfectML.g:1031:5: (lv_warm_start_48_0= ruleBOOL )
                    // InternalPerfectML.g:1032:6: lv_warm_start_48_0= ruleBOOL
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getWarm_startBOOLParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_warm_start_48_0=ruleBOOL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"warm_start",
                    							lv_warm_start_48_0,
                    							"org.xtext.example.perfectML.PerfectML.BOOL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1050:3: ( ( (lv_momentum_def_49_0= 'momentum' ) ) otherlv_50= '=' ( (lv_momentum_51_0= ruleFLOAT ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==48) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPerfectML.g:1051:4: ( (lv_momentum_def_49_0= 'momentum' ) ) otherlv_50= '=' ( (lv_momentum_51_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:1051:4: ( (lv_momentum_def_49_0= 'momentum' ) )
                    // InternalPerfectML.g:1052:5: (lv_momentum_def_49_0= 'momentum' )
                    {
                    // InternalPerfectML.g:1052:5: (lv_momentum_def_49_0= 'momentum' )
                    // InternalPerfectML.g:1053:6: lv_momentum_def_49_0= 'momentum'
                    {
                    lv_momentum_def_49_0=(Token)match(input,48,FOLLOW_15); 

                    						newLeafNode(lv_momentum_def_49_0, grammarAccess.getMLPClassifierAccess().getMomentum_defMomentumKeyword_17_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "momentum_def", lv_momentum_def_49_0 != null, "momentum");
                    					

                    }


                    }

                    otherlv_50=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_50, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_17_1());
                    			
                    // InternalPerfectML.g:1069:4: ( (lv_momentum_51_0= ruleFLOAT ) )
                    // InternalPerfectML.g:1070:5: (lv_momentum_51_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:1070:5: (lv_momentum_51_0= ruleFLOAT )
                    // InternalPerfectML.g:1071:6: lv_momentum_51_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getMomentumFLOATParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_momentum_51_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"momentum",
                    							lv_momentum_51_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1089:3: ( ( (lv_nesterovs_momentum_def_52_0= 'nesterovs_momentum' ) ) otherlv_53= '=' ( (lv_nesterovs_momentum_54_0= ruleBOOL ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPerfectML.g:1090:4: ( (lv_nesterovs_momentum_def_52_0= 'nesterovs_momentum' ) ) otherlv_53= '=' ( (lv_nesterovs_momentum_54_0= ruleBOOL ) )
                    {
                    // InternalPerfectML.g:1090:4: ( (lv_nesterovs_momentum_def_52_0= 'nesterovs_momentum' ) )
                    // InternalPerfectML.g:1091:5: (lv_nesterovs_momentum_def_52_0= 'nesterovs_momentum' )
                    {
                    // InternalPerfectML.g:1091:5: (lv_nesterovs_momentum_def_52_0= 'nesterovs_momentum' )
                    // InternalPerfectML.g:1092:6: lv_nesterovs_momentum_def_52_0= 'nesterovs_momentum'
                    {
                    lv_nesterovs_momentum_def_52_0=(Token)match(input,49,FOLLOW_15); 

                    						newLeafNode(lv_nesterovs_momentum_def_52_0, grammarAccess.getMLPClassifierAccess().getNesterovs_momentum_defNesterovs_momentumKeyword_18_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "nesterovs_momentum_def", lv_nesterovs_momentum_def_52_0 != null, "nesterovs_momentum");
                    					

                    }


                    }

                    otherlv_53=(Token)match(input,21,FOLLOW_31); 

                    				newLeafNode(otherlv_53, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_18_1());
                    			
                    // InternalPerfectML.g:1108:4: ( (lv_nesterovs_momentum_54_0= ruleBOOL ) )
                    // InternalPerfectML.g:1109:5: (lv_nesterovs_momentum_54_0= ruleBOOL )
                    {
                    // InternalPerfectML.g:1109:5: (lv_nesterovs_momentum_54_0= ruleBOOL )
                    // InternalPerfectML.g:1110:6: lv_nesterovs_momentum_54_0= ruleBOOL
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getNesterovs_momentumBOOLParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_nesterovs_momentum_54_0=ruleBOOL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"nesterovs_momentum",
                    							lv_nesterovs_momentum_54_0,
                    							"org.xtext.example.perfectML.PerfectML.BOOL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1128:3: ( ( (lv_early_stopping_def_55_0= 'early_stopping' ) ) otherlv_56= '=' ( (lv_early_stopping_57_0= ruleBOOL ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPerfectML.g:1129:4: ( (lv_early_stopping_def_55_0= 'early_stopping' ) ) otherlv_56= '=' ( (lv_early_stopping_57_0= ruleBOOL ) )
                    {
                    // InternalPerfectML.g:1129:4: ( (lv_early_stopping_def_55_0= 'early_stopping' ) )
                    // InternalPerfectML.g:1130:5: (lv_early_stopping_def_55_0= 'early_stopping' )
                    {
                    // InternalPerfectML.g:1130:5: (lv_early_stopping_def_55_0= 'early_stopping' )
                    // InternalPerfectML.g:1131:6: lv_early_stopping_def_55_0= 'early_stopping'
                    {
                    lv_early_stopping_def_55_0=(Token)match(input,50,FOLLOW_15); 

                    						newLeafNode(lv_early_stopping_def_55_0, grammarAccess.getMLPClassifierAccess().getEarly_stopping_defEarly_stoppingKeyword_19_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "early_stopping_def", lv_early_stopping_def_55_0 != null, "early_stopping");
                    					

                    }


                    }

                    otherlv_56=(Token)match(input,21,FOLLOW_31); 

                    				newLeafNode(otherlv_56, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_19_1());
                    			
                    // InternalPerfectML.g:1147:4: ( (lv_early_stopping_57_0= ruleBOOL ) )
                    // InternalPerfectML.g:1148:5: (lv_early_stopping_57_0= ruleBOOL )
                    {
                    // InternalPerfectML.g:1148:5: (lv_early_stopping_57_0= ruleBOOL )
                    // InternalPerfectML.g:1149:6: lv_early_stopping_57_0= ruleBOOL
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getEarly_stoppingBOOLParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_early_stopping_57_0=ruleBOOL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"early_stopping",
                    							lv_early_stopping_57_0,
                    							"org.xtext.example.perfectML.PerfectML.BOOL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1167:3: ( ( (lv_validation_fraction_def_58_0= 'validation_fraction' ) ) otherlv_59= '=' ( (lv_validation_fraction_60_0= ruleFLOAT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==51) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPerfectML.g:1168:4: ( (lv_validation_fraction_def_58_0= 'validation_fraction' ) ) otherlv_59= '=' ( (lv_validation_fraction_60_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:1168:4: ( (lv_validation_fraction_def_58_0= 'validation_fraction' ) )
                    // InternalPerfectML.g:1169:5: (lv_validation_fraction_def_58_0= 'validation_fraction' )
                    {
                    // InternalPerfectML.g:1169:5: (lv_validation_fraction_def_58_0= 'validation_fraction' )
                    // InternalPerfectML.g:1170:6: lv_validation_fraction_def_58_0= 'validation_fraction'
                    {
                    lv_validation_fraction_def_58_0=(Token)match(input,51,FOLLOW_15); 

                    						newLeafNode(lv_validation_fraction_def_58_0, grammarAccess.getMLPClassifierAccess().getValidation_fraction_defValidation_fractionKeyword_20_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "validation_fraction_def", lv_validation_fraction_def_58_0 != null, "validation_fraction");
                    					

                    }


                    }

                    otherlv_59=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_59, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_20_1());
                    			
                    // InternalPerfectML.g:1186:4: ( (lv_validation_fraction_60_0= ruleFLOAT ) )
                    // InternalPerfectML.g:1187:5: (lv_validation_fraction_60_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:1187:5: (lv_validation_fraction_60_0= ruleFLOAT )
                    // InternalPerfectML.g:1188:6: lv_validation_fraction_60_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getValidation_fractionFLOATParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_validation_fraction_60_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"validation_fraction",
                    							lv_validation_fraction_60_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1206:3: ( ( (lv_beta_1_def_61_0= 'beta_1' ) ) otherlv_62= '=' ( (lv_beta_1_63_0= ruleFLOAT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==52) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPerfectML.g:1207:4: ( (lv_beta_1_def_61_0= 'beta_1' ) ) otherlv_62= '=' ( (lv_beta_1_63_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:1207:4: ( (lv_beta_1_def_61_0= 'beta_1' ) )
                    // InternalPerfectML.g:1208:5: (lv_beta_1_def_61_0= 'beta_1' )
                    {
                    // InternalPerfectML.g:1208:5: (lv_beta_1_def_61_0= 'beta_1' )
                    // InternalPerfectML.g:1209:6: lv_beta_1_def_61_0= 'beta_1'
                    {
                    lv_beta_1_def_61_0=(Token)match(input,52,FOLLOW_15); 

                    						newLeafNode(lv_beta_1_def_61_0, grammarAccess.getMLPClassifierAccess().getBeta_1_defBeta_1Keyword_21_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "beta_1_def", lv_beta_1_def_61_0 != null, "beta_1");
                    					

                    }


                    }

                    otherlv_62=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_62, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_21_1());
                    			
                    // InternalPerfectML.g:1225:4: ( (lv_beta_1_63_0= ruleFLOAT ) )
                    // InternalPerfectML.g:1226:5: (lv_beta_1_63_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:1226:5: (lv_beta_1_63_0= ruleFLOAT )
                    // InternalPerfectML.g:1227:6: lv_beta_1_63_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getBeta_1FLOATParserRuleCall_21_2_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_beta_1_63_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"beta_1",
                    							lv_beta_1_63_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1245:3: ( ( (lv_beta_2_def_64_0= 'beta_2' ) ) otherlv_65= '=' ( (lv_beta_2_66_0= ruleFLOAT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==53) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPerfectML.g:1246:4: ( (lv_beta_2_def_64_0= 'beta_2' ) ) otherlv_65= '=' ( (lv_beta_2_66_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:1246:4: ( (lv_beta_2_def_64_0= 'beta_2' ) )
                    // InternalPerfectML.g:1247:5: (lv_beta_2_def_64_0= 'beta_2' )
                    {
                    // InternalPerfectML.g:1247:5: (lv_beta_2_def_64_0= 'beta_2' )
                    // InternalPerfectML.g:1248:6: lv_beta_2_def_64_0= 'beta_2'
                    {
                    lv_beta_2_def_64_0=(Token)match(input,53,FOLLOW_15); 

                    						newLeafNode(lv_beta_2_def_64_0, grammarAccess.getMLPClassifierAccess().getBeta_2_defBeta_2Keyword_22_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "beta_2_def", lv_beta_2_def_64_0 != null, "beta_2");
                    					

                    }


                    }

                    otherlv_65=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_65, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_22_1());
                    			
                    // InternalPerfectML.g:1264:4: ( (lv_beta_2_66_0= ruleFLOAT ) )
                    // InternalPerfectML.g:1265:5: (lv_beta_2_66_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:1265:5: (lv_beta_2_66_0= ruleFLOAT )
                    // InternalPerfectML.g:1266:6: lv_beta_2_66_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getBeta_2FLOATParserRuleCall_22_2_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_beta_2_66_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"beta_2",
                    							lv_beta_2_66_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1284:3: ( ( (lv_epsilon_def_67_0= 'epsilon' ) ) otherlv_68= '=' ( (lv_epsilon_69_0= ruleFLOAT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPerfectML.g:1285:4: ( (lv_epsilon_def_67_0= 'epsilon' ) ) otherlv_68= '=' ( (lv_epsilon_69_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:1285:4: ( (lv_epsilon_def_67_0= 'epsilon' ) )
                    // InternalPerfectML.g:1286:5: (lv_epsilon_def_67_0= 'epsilon' )
                    {
                    // InternalPerfectML.g:1286:5: (lv_epsilon_def_67_0= 'epsilon' )
                    // InternalPerfectML.g:1287:6: lv_epsilon_def_67_0= 'epsilon'
                    {
                    lv_epsilon_def_67_0=(Token)match(input,54,FOLLOW_15); 

                    						newLeafNode(lv_epsilon_def_67_0, grammarAccess.getMLPClassifierAccess().getEpsilon_defEpsilonKeyword_23_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "epsilon_def", lv_epsilon_def_67_0 != null, "epsilon");
                    					

                    }


                    }

                    otherlv_68=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_68, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_23_1());
                    			
                    // InternalPerfectML.g:1303:4: ( (lv_epsilon_69_0= ruleFLOAT ) )
                    // InternalPerfectML.g:1304:5: (lv_epsilon_69_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:1304:5: (lv_epsilon_69_0= ruleFLOAT )
                    // InternalPerfectML.g:1305:6: lv_epsilon_69_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMLPClassifierAccess().getEpsilonFLOATParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_epsilon_69_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMLPClassifierRule());
                    						}
                    						set(
                    							current,
                    							"epsilon",
                    							lv_epsilon_69_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1323:3: ( ( (lv_n_iter_no_change_def_70_0= 'n_iter_no_change' ) ) otherlv_71= '=' ( (lv_n_iter_no_change_72_0= RULE_INT ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==55) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPerfectML.g:1324:4: ( (lv_n_iter_no_change_def_70_0= 'n_iter_no_change' ) ) otherlv_71= '=' ( (lv_n_iter_no_change_72_0= RULE_INT ) )
                    {
                    // InternalPerfectML.g:1324:4: ( (lv_n_iter_no_change_def_70_0= 'n_iter_no_change' ) )
                    // InternalPerfectML.g:1325:5: (lv_n_iter_no_change_def_70_0= 'n_iter_no_change' )
                    {
                    // InternalPerfectML.g:1325:5: (lv_n_iter_no_change_def_70_0= 'n_iter_no_change' )
                    // InternalPerfectML.g:1326:6: lv_n_iter_no_change_def_70_0= 'n_iter_no_change'
                    {
                    lv_n_iter_no_change_def_70_0=(Token)match(input,55,FOLLOW_15); 

                    						newLeafNode(lv_n_iter_no_change_def_70_0, grammarAccess.getMLPClassifierAccess().getN_iter_no_change_defN_iter_no_changeKeyword_24_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "n_iter_no_change_def", lv_n_iter_no_change_def_70_0 != null, "n_iter_no_change");
                    					

                    }


                    }

                    otherlv_71=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_71, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_24_1());
                    			
                    // InternalPerfectML.g:1342:4: ( (lv_n_iter_no_change_72_0= RULE_INT ) )
                    // InternalPerfectML.g:1343:5: (lv_n_iter_no_change_72_0= RULE_INT )
                    {
                    // InternalPerfectML.g:1343:5: (lv_n_iter_no_change_72_0= RULE_INT )
                    // InternalPerfectML.g:1344:6: lv_n_iter_no_change_72_0= RULE_INT
                    {
                    lv_n_iter_no_change_72_0=(Token)match(input,RULE_INT,FOLLOW_44); 

                    						newLeafNode(lv_n_iter_no_change_72_0, grammarAccess.getMLPClassifierAccess().getN_iter_no_changeINTTerminalRuleCall_24_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"n_iter_no_change",
                    							lv_n_iter_no_change_72_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1361:3: ( ( (lv_max_fun_def_73_0= 'max_fun' ) ) otherlv_74= '=' ( (lv_max_fun_75_0= RULE_INT ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPerfectML.g:1362:4: ( (lv_max_fun_def_73_0= 'max_fun' ) ) otherlv_74= '=' ( (lv_max_fun_75_0= RULE_INT ) )
                    {
                    // InternalPerfectML.g:1362:4: ( (lv_max_fun_def_73_0= 'max_fun' ) )
                    // InternalPerfectML.g:1363:5: (lv_max_fun_def_73_0= 'max_fun' )
                    {
                    // InternalPerfectML.g:1363:5: (lv_max_fun_def_73_0= 'max_fun' )
                    // InternalPerfectML.g:1364:6: lv_max_fun_def_73_0= 'max_fun'
                    {
                    lv_max_fun_def_73_0=(Token)match(input,56,FOLLOW_15); 

                    						newLeafNode(lv_max_fun_def_73_0, grammarAccess.getMLPClassifierAccess().getMax_fun_defMax_funKeyword_25_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(current, "max_fun_def", lv_max_fun_def_73_0 != null, "max_fun");
                    					

                    }


                    }

                    otherlv_74=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_74, grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_25_1());
                    			
                    // InternalPerfectML.g:1380:4: ( (lv_max_fun_75_0= RULE_INT ) )
                    // InternalPerfectML.g:1381:5: (lv_max_fun_75_0= RULE_INT )
                    {
                    // InternalPerfectML.g:1381:5: (lv_max_fun_75_0= RULE_INT )
                    // InternalPerfectML.g:1382:6: lv_max_fun_75_0= RULE_INT
                    {
                    lv_max_fun_75_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_max_fun_75_0, grammarAccess.getMLPClassifierAccess().getMax_funINTTerminalRuleCall_25_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMLPClassifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"max_fun",
                    							lv_max_fun_75_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleMLPClassifier"


    // $ANTLR start "entryRuleSVC"
    // InternalPerfectML.g:1403:1: entryRuleSVC returns [EObject current=null] : iv_ruleSVC= ruleSVC EOF ;
    public final EObject entryRuleSVC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSVC = null;


        try {
            // InternalPerfectML.g:1403:44: (iv_ruleSVC= ruleSVC EOF )
            // InternalPerfectML.g:1404:2: iv_ruleSVC= ruleSVC EOF
            {
             newCompositeNode(grammarAccess.getSVCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSVC=ruleSVC();

            state._fsp--;

             current =iv_ruleSVC; 
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
    // $ANTLR end "entryRuleSVC"


    // $ANTLR start "ruleSVC"
    // InternalPerfectML.g:1410:1: ruleSVC returns [EObject current=null] : ( () otherlv_1= 'SVC' otherlv_2= 'with' ( ( (lv_C_def_3_0= 'C' ) ) otherlv_4= '=' ( (lv_C_5_0= ruleFLOAT ) ) )? ( ( (lv_kernel_def_6_0= 'kernel' ) ) otherlv_7= '=' ( ( (lv_kernel_8_1= 'rbf' | lv_kernel_8_2= 'poly' | lv_kernel_8_3= 'linear' | lv_kernel_8_4= 'sigmoid' | lv_kernel_8_5= 'precomputed' ) ) ) )? ( ( (lv_degree_def_9_0= 'degree' ) ) otherlv_10= '=' ( (lv_degree_11_0= RULE_INT ) ) )? ( ( (lv_gamma_def_12_0= 'gamma' ) ) otherlv_13= '=' ( ( (lv_gamma_14_1= 'scale' | lv_gamma_14_2= 'auto' ) ) ) )? ( ( (lv_coef0_def_15_0= 'coef0' ) ) otherlv_16= '=' ( (lv_coef0_17_0= ruleFLOAT ) ) )? ( ( (lv_shrinking_def_18_0= 'shrinking' ) ) otherlv_19= '=' ( (lv_shrinking_20_0= ruleBOOL ) ) )? ( ( (lv_probability_def_21_0= 'probability' ) ) otherlv_22= '=' ( (lv_probability_23_0= ruleBOOL ) ) )? ( ( (lv_tol_def_24_0= 'tolerance' ) ) otherlv_25= '=' ( (lv_tol_26_0= ruleFLOAT ) ) )? ( ( (lv_cache_size_def_27_0= 'cache_size' ) ) otherlv_28= '=' ( (lv_cache_size_29_0= ruleFLOAT ) ) )? ( ( (lv_verbose_def_30_0= 'verbose' ) ) otherlv_31= '=' ( (lv_verbose_32_0= ruleBOOL ) ) )? ( ( (lv_max_iter_def_33_0= 'max_iter' ) ) otherlv_34= '=' ( (lv_max_iter_35_0= RULE_INT ) ) )? ( ( (lv_decision_function_shape_def_36_0= 'decision_function_shape' ) ) otherlv_37= '=' ( ( (lv_decision_function_shape_38_1= 'ovo' | lv_decision_function_shape_38_2= 'ovr' ) ) ) )? ( ( (lv_break_ties_def_39_0= 'break_ties' ) ) otherlv_40= '=' ( (lv_break_ties_41_0= ruleBOOL ) ) )? ( ( (lv_random_state_def_42_0= 'random_state' ) ) otherlv_43= '=' ( (lv_random_state_44_0= RULE_INT ) ) )? ) ;
    public final EObject ruleSVC() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_C_def_3_0=null;
        Token otherlv_4=null;
        Token lv_kernel_def_6_0=null;
        Token otherlv_7=null;
        Token lv_kernel_8_1=null;
        Token lv_kernel_8_2=null;
        Token lv_kernel_8_3=null;
        Token lv_kernel_8_4=null;
        Token lv_kernel_8_5=null;
        Token lv_degree_def_9_0=null;
        Token otherlv_10=null;
        Token lv_degree_11_0=null;
        Token lv_gamma_def_12_0=null;
        Token otherlv_13=null;
        Token lv_gamma_14_1=null;
        Token lv_gamma_14_2=null;
        Token lv_coef0_def_15_0=null;
        Token otherlv_16=null;
        Token lv_shrinking_def_18_0=null;
        Token otherlv_19=null;
        Token lv_probability_def_21_0=null;
        Token otherlv_22=null;
        Token lv_tol_def_24_0=null;
        Token otherlv_25=null;
        Token lv_cache_size_def_27_0=null;
        Token otherlv_28=null;
        Token lv_verbose_def_30_0=null;
        Token otherlv_31=null;
        Token lv_max_iter_def_33_0=null;
        Token otherlv_34=null;
        Token lv_max_iter_35_0=null;
        Token lv_decision_function_shape_def_36_0=null;
        Token otherlv_37=null;
        Token lv_decision_function_shape_38_1=null;
        Token lv_decision_function_shape_38_2=null;
        Token lv_break_ties_def_39_0=null;
        Token otherlv_40=null;
        Token lv_random_state_def_42_0=null;
        Token otherlv_43=null;
        Token lv_random_state_44_0=null;
        EObject lv_C_5_0 = null;

        EObject lv_coef0_17_0 = null;

        EObject lv_shrinking_20_0 = null;

        EObject lv_probability_23_0 = null;

        EObject lv_tol_26_0 = null;

        EObject lv_cache_size_29_0 = null;

        EObject lv_verbose_32_0 = null;

        EObject lv_break_ties_41_0 = null;



        	enterRule();

        try {
            // InternalPerfectML.g:1416:2: ( ( () otherlv_1= 'SVC' otherlv_2= 'with' ( ( (lv_C_def_3_0= 'C' ) ) otherlv_4= '=' ( (lv_C_5_0= ruleFLOAT ) ) )? ( ( (lv_kernel_def_6_0= 'kernel' ) ) otherlv_7= '=' ( ( (lv_kernel_8_1= 'rbf' | lv_kernel_8_2= 'poly' | lv_kernel_8_3= 'linear' | lv_kernel_8_4= 'sigmoid' | lv_kernel_8_5= 'precomputed' ) ) ) )? ( ( (lv_degree_def_9_0= 'degree' ) ) otherlv_10= '=' ( (lv_degree_11_0= RULE_INT ) ) )? ( ( (lv_gamma_def_12_0= 'gamma' ) ) otherlv_13= '=' ( ( (lv_gamma_14_1= 'scale' | lv_gamma_14_2= 'auto' ) ) ) )? ( ( (lv_coef0_def_15_0= 'coef0' ) ) otherlv_16= '=' ( (lv_coef0_17_0= ruleFLOAT ) ) )? ( ( (lv_shrinking_def_18_0= 'shrinking' ) ) otherlv_19= '=' ( (lv_shrinking_20_0= ruleBOOL ) ) )? ( ( (lv_probability_def_21_0= 'probability' ) ) otherlv_22= '=' ( (lv_probability_23_0= ruleBOOL ) ) )? ( ( (lv_tol_def_24_0= 'tolerance' ) ) otherlv_25= '=' ( (lv_tol_26_0= ruleFLOAT ) ) )? ( ( (lv_cache_size_def_27_0= 'cache_size' ) ) otherlv_28= '=' ( (lv_cache_size_29_0= ruleFLOAT ) ) )? ( ( (lv_verbose_def_30_0= 'verbose' ) ) otherlv_31= '=' ( (lv_verbose_32_0= ruleBOOL ) ) )? ( ( (lv_max_iter_def_33_0= 'max_iter' ) ) otherlv_34= '=' ( (lv_max_iter_35_0= RULE_INT ) ) )? ( ( (lv_decision_function_shape_def_36_0= 'decision_function_shape' ) ) otherlv_37= '=' ( ( (lv_decision_function_shape_38_1= 'ovo' | lv_decision_function_shape_38_2= 'ovr' ) ) ) )? ( ( (lv_break_ties_def_39_0= 'break_ties' ) ) otherlv_40= '=' ( (lv_break_ties_41_0= ruleBOOL ) ) )? ( ( (lv_random_state_def_42_0= 'random_state' ) ) otherlv_43= '=' ( (lv_random_state_44_0= RULE_INT ) ) )? ) )
            // InternalPerfectML.g:1417:2: ( () otherlv_1= 'SVC' otherlv_2= 'with' ( ( (lv_C_def_3_0= 'C' ) ) otherlv_4= '=' ( (lv_C_5_0= ruleFLOAT ) ) )? ( ( (lv_kernel_def_6_0= 'kernel' ) ) otherlv_7= '=' ( ( (lv_kernel_8_1= 'rbf' | lv_kernel_8_2= 'poly' | lv_kernel_8_3= 'linear' | lv_kernel_8_4= 'sigmoid' | lv_kernel_8_5= 'precomputed' ) ) ) )? ( ( (lv_degree_def_9_0= 'degree' ) ) otherlv_10= '=' ( (lv_degree_11_0= RULE_INT ) ) )? ( ( (lv_gamma_def_12_0= 'gamma' ) ) otherlv_13= '=' ( ( (lv_gamma_14_1= 'scale' | lv_gamma_14_2= 'auto' ) ) ) )? ( ( (lv_coef0_def_15_0= 'coef0' ) ) otherlv_16= '=' ( (lv_coef0_17_0= ruleFLOAT ) ) )? ( ( (lv_shrinking_def_18_0= 'shrinking' ) ) otherlv_19= '=' ( (lv_shrinking_20_0= ruleBOOL ) ) )? ( ( (lv_probability_def_21_0= 'probability' ) ) otherlv_22= '=' ( (lv_probability_23_0= ruleBOOL ) ) )? ( ( (lv_tol_def_24_0= 'tolerance' ) ) otherlv_25= '=' ( (lv_tol_26_0= ruleFLOAT ) ) )? ( ( (lv_cache_size_def_27_0= 'cache_size' ) ) otherlv_28= '=' ( (lv_cache_size_29_0= ruleFLOAT ) ) )? ( ( (lv_verbose_def_30_0= 'verbose' ) ) otherlv_31= '=' ( (lv_verbose_32_0= ruleBOOL ) ) )? ( ( (lv_max_iter_def_33_0= 'max_iter' ) ) otherlv_34= '=' ( (lv_max_iter_35_0= RULE_INT ) ) )? ( ( (lv_decision_function_shape_def_36_0= 'decision_function_shape' ) ) otherlv_37= '=' ( ( (lv_decision_function_shape_38_1= 'ovo' | lv_decision_function_shape_38_2= 'ovr' ) ) ) )? ( ( (lv_break_ties_def_39_0= 'break_ties' ) ) otherlv_40= '=' ( (lv_break_ties_41_0= ruleBOOL ) ) )? ( ( (lv_random_state_def_42_0= 'random_state' ) ) otherlv_43= '=' ( (lv_random_state_44_0= RULE_INT ) ) )? )
            {
            // InternalPerfectML.g:1417:2: ( () otherlv_1= 'SVC' otherlv_2= 'with' ( ( (lv_C_def_3_0= 'C' ) ) otherlv_4= '=' ( (lv_C_5_0= ruleFLOAT ) ) )? ( ( (lv_kernel_def_6_0= 'kernel' ) ) otherlv_7= '=' ( ( (lv_kernel_8_1= 'rbf' | lv_kernel_8_2= 'poly' | lv_kernel_8_3= 'linear' | lv_kernel_8_4= 'sigmoid' | lv_kernel_8_5= 'precomputed' ) ) ) )? ( ( (lv_degree_def_9_0= 'degree' ) ) otherlv_10= '=' ( (lv_degree_11_0= RULE_INT ) ) )? ( ( (lv_gamma_def_12_0= 'gamma' ) ) otherlv_13= '=' ( ( (lv_gamma_14_1= 'scale' | lv_gamma_14_2= 'auto' ) ) ) )? ( ( (lv_coef0_def_15_0= 'coef0' ) ) otherlv_16= '=' ( (lv_coef0_17_0= ruleFLOAT ) ) )? ( ( (lv_shrinking_def_18_0= 'shrinking' ) ) otherlv_19= '=' ( (lv_shrinking_20_0= ruleBOOL ) ) )? ( ( (lv_probability_def_21_0= 'probability' ) ) otherlv_22= '=' ( (lv_probability_23_0= ruleBOOL ) ) )? ( ( (lv_tol_def_24_0= 'tolerance' ) ) otherlv_25= '=' ( (lv_tol_26_0= ruleFLOAT ) ) )? ( ( (lv_cache_size_def_27_0= 'cache_size' ) ) otherlv_28= '=' ( (lv_cache_size_29_0= ruleFLOAT ) ) )? ( ( (lv_verbose_def_30_0= 'verbose' ) ) otherlv_31= '=' ( (lv_verbose_32_0= ruleBOOL ) ) )? ( ( (lv_max_iter_def_33_0= 'max_iter' ) ) otherlv_34= '=' ( (lv_max_iter_35_0= RULE_INT ) ) )? ( ( (lv_decision_function_shape_def_36_0= 'decision_function_shape' ) ) otherlv_37= '=' ( ( (lv_decision_function_shape_38_1= 'ovo' | lv_decision_function_shape_38_2= 'ovr' ) ) ) )? ( ( (lv_break_ties_def_39_0= 'break_ties' ) ) otherlv_40= '=' ( (lv_break_ties_41_0= ruleBOOL ) ) )? ( ( (lv_random_state_def_42_0= 'random_state' ) ) otherlv_43= '=' ( (lv_random_state_44_0= RULE_INT ) ) )? )
            // InternalPerfectML.g:1418:3: () otherlv_1= 'SVC' otherlv_2= 'with' ( ( (lv_C_def_3_0= 'C' ) ) otherlv_4= '=' ( (lv_C_5_0= ruleFLOAT ) ) )? ( ( (lv_kernel_def_6_0= 'kernel' ) ) otherlv_7= '=' ( ( (lv_kernel_8_1= 'rbf' | lv_kernel_8_2= 'poly' | lv_kernel_8_3= 'linear' | lv_kernel_8_4= 'sigmoid' | lv_kernel_8_5= 'precomputed' ) ) ) )? ( ( (lv_degree_def_9_0= 'degree' ) ) otherlv_10= '=' ( (lv_degree_11_0= RULE_INT ) ) )? ( ( (lv_gamma_def_12_0= 'gamma' ) ) otherlv_13= '=' ( ( (lv_gamma_14_1= 'scale' | lv_gamma_14_2= 'auto' ) ) ) )? ( ( (lv_coef0_def_15_0= 'coef0' ) ) otherlv_16= '=' ( (lv_coef0_17_0= ruleFLOAT ) ) )? ( ( (lv_shrinking_def_18_0= 'shrinking' ) ) otherlv_19= '=' ( (lv_shrinking_20_0= ruleBOOL ) ) )? ( ( (lv_probability_def_21_0= 'probability' ) ) otherlv_22= '=' ( (lv_probability_23_0= ruleBOOL ) ) )? ( ( (lv_tol_def_24_0= 'tolerance' ) ) otherlv_25= '=' ( (lv_tol_26_0= ruleFLOAT ) ) )? ( ( (lv_cache_size_def_27_0= 'cache_size' ) ) otherlv_28= '=' ( (lv_cache_size_29_0= ruleFLOAT ) ) )? ( ( (lv_verbose_def_30_0= 'verbose' ) ) otherlv_31= '=' ( (lv_verbose_32_0= ruleBOOL ) ) )? ( ( (lv_max_iter_def_33_0= 'max_iter' ) ) otherlv_34= '=' ( (lv_max_iter_35_0= RULE_INT ) ) )? ( ( (lv_decision_function_shape_def_36_0= 'decision_function_shape' ) ) otherlv_37= '=' ( ( (lv_decision_function_shape_38_1= 'ovo' | lv_decision_function_shape_38_2= 'ovr' ) ) ) )? ( ( (lv_break_ties_def_39_0= 'break_ties' ) ) otherlv_40= '=' ( (lv_break_ties_41_0= ruleBOOL ) ) )? ( ( (lv_random_state_def_42_0= 'random_state' ) ) otherlv_43= '=' ( (lv_random_state_44_0= RULE_INT ) ) )?
            {
            // InternalPerfectML.g:1418:3: ()
            // InternalPerfectML.g:1419:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSVCAccess().getSVCAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSVCAccess().getSVCKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getSVCAccess().getWithKeyword_2());
            		
            // InternalPerfectML.g:1433:3: ( ( (lv_C_def_3_0= 'C' ) ) otherlv_4= '=' ( (lv_C_5_0= ruleFLOAT ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==58) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPerfectML.g:1434:4: ( (lv_C_def_3_0= 'C' ) ) otherlv_4= '=' ( (lv_C_5_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:1434:4: ( (lv_C_def_3_0= 'C' ) )
                    // InternalPerfectML.g:1435:5: (lv_C_def_3_0= 'C' )
                    {
                    // InternalPerfectML.g:1435:5: (lv_C_def_3_0= 'C' )
                    // InternalPerfectML.g:1436:6: lv_C_def_3_0= 'C'
                    {
                    lv_C_def_3_0=(Token)match(input,58,FOLLOW_15); 

                    						newLeafNode(lv_C_def_3_0, grammarAccess.getSVCAccess().getC_defCKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "C_def", lv_C_def_3_0 != null, "C");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getSVCAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalPerfectML.g:1452:4: ( (lv_C_5_0= ruleFLOAT ) )
                    // InternalPerfectML.g:1453:5: (lv_C_5_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:1453:5: (lv_C_5_0= ruleFLOAT )
                    // InternalPerfectML.g:1454:6: lv_C_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSVCAccess().getCFLOATParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_C_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVCRule());
                    						}
                    						set(
                    							current,
                    							"C",
                    							lv_C_5_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1472:3: ( ( (lv_kernel_def_6_0= 'kernel' ) ) otherlv_7= '=' ( ( (lv_kernel_8_1= 'rbf' | lv_kernel_8_2= 'poly' | lv_kernel_8_3= 'linear' | lv_kernel_8_4= 'sigmoid' | lv_kernel_8_5= 'precomputed' ) ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==59) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPerfectML.g:1473:4: ( (lv_kernel_def_6_0= 'kernel' ) ) otherlv_7= '=' ( ( (lv_kernel_8_1= 'rbf' | lv_kernel_8_2= 'poly' | lv_kernel_8_3= 'linear' | lv_kernel_8_4= 'sigmoid' | lv_kernel_8_5= 'precomputed' ) ) )
                    {
                    // InternalPerfectML.g:1473:4: ( (lv_kernel_def_6_0= 'kernel' ) )
                    // InternalPerfectML.g:1474:5: (lv_kernel_def_6_0= 'kernel' )
                    {
                    // InternalPerfectML.g:1474:5: (lv_kernel_def_6_0= 'kernel' )
                    // InternalPerfectML.g:1475:6: lv_kernel_def_6_0= 'kernel'
                    {
                    lv_kernel_def_6_0=(Token)match(input,59,FOLLOW_15); 

                    						newLeafNode(lv_kernel_def_6_0, grammarAccess.getSVCAccess().getKernel_defKernelKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "kernel_def", lv_kernel_def_6_0 != null, "kernel");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_47); 

                    				newLeafNode(otherlv_7, grammarAccess.getSVCAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalPerfectML.g:1491:4: ( ( (lv_kernel_8_1= 'rbf' | lv_kernel_8_2= 'poly' | lv_kernel_8_3= 'linear' | lv_kernel_8_4= 'sigmoid' | lv_kernel_8_5= 'precomputed' ) ) )
                    // InternalPerfectML.g:1492:5: ( (lv_kernel_8_1= 'rbf' | lv_kernel_8_2= 'poly' | lv_kernel_8_3= 'linear' | lv_kernel_8_4= 'sigmoid' | lv_kernel_8_5= 'precomputed' ) )
                    {
                    // InternalPerfectML.g:1492:5: ( (lv_kernel_8_1= 'rbf' | lv_kernel_8_2= 'poly' | lv_kernel_8_3= 'linear' | lv_kernel_8_4= 'sigmoid' | lv_kernel_8_5= 'precomputed' ) )
                    // InternalPerfectML.g:1493:6: (lv_kernel_8_1= 'rbf' | lv_kernel_8_2= 'poly' | lv_kernel_8_3= 'linear' | lv_kernel_8_4= 'sigmoid' | lv_kernel_8_5= 'precomputed' )
                    {
                    // InternalPerfectML.g:1493:6: (lv_kernel_8_1= 'rbf' | lv_kernel_8_2= 'poly' | lv_kernel_8_3= 'linear' | lv_kernel_8_4= 'sigmoid' | lv_kernel_8_5= 'precomputed' )
                    int alt32=5;
                    switch ( input.LA(1) ) {
                    case 60:
                        {
                        alt32=1;
                        }
                        break;
                    case 61:
                        {
                        alt32=2;
                        }
                        break;
                    case 62:
                        {
                        alt32=3;
                        }
                        break;
                    case 63:
                        {
                        alt32=4;
                        }
                        break;
                    case 64:
                        {
                        alt32=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }

                    switch (alt32) {
                        case 1 :
                            // InternalPerfectML.g:1494:7: lv_kernel_8_1= 'rbf'
                            {
                            lv_kernel_8_1=(Token)match(input,60,FOLLOW_48); 

                            							newLeafNode(lv_kernel_8_1, grammarAccess.getSVCAccess().getKernelRbfKeyword_4_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSVCRule());
                            							}
                            							setWithLastConsumed(current, "kernel", lv_kernel_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalPerfectML.g:1505:7: lv_kernel_8_2= 'poly'
                            {
                            lv_kernel_8_2=(Token)match(input,61,FOLLOW_48); 

                            							newLeafNode(lv_kernel_8_2, grammarAccess.getSVCAccess().getKernelPolyKeyword_4_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSVCRule());
                            							}
                            							setWithLastConsumed(current, "kernel", lv_kernel_8_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalPerfectML.g:1516:7: lv_kernel_8_3= 'linear'
                            {
                            lv_kernel_8_3=(Token)match(input,62,FOLLOW_48); 

                            							newLeafNode(lv_kernel_8_3, grammarAccess.getSVCAccess().getKernelLinearKeyword_4_2_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSVCRule());
                            							}
                            							setWithLastConsumed(current, "kernel", lv_kernel_8_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalPerfectML.g:1527:7: lv_kernel_8_4= 'sigmoid'
                            {
                            lv_kernel_8_4=(Token)match(input,63,FOLLOW_48); 

                            							newLeafNode(lv_kernel_8_4, grammarAccess.getSVCAccess().getKernelSigmoidKeyword_4_2_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSVCRule());
                            							}
                            							setWithLastConsumed(current, "kernel", lv_kernel_8_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalPerfectML.g:1538:7: lv_kernel_8_5= 'precomputed'
                            {
                            lv_kernel_8_5=(Token)match(input,64,FOLLOW_48); 

                            							newLeafNode(lv_kernel_8_5, grammarAccess.getSVCAccess().getKernelPrecomputedKeyword_4_2_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSVCRule());
                            							}
                            							setWithLastConsumed(current, "kernel", lv_kernel_8_5, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1552:3: ( ( (lv_degree_def_9_0= 'degree' ) ) otherlv_10= '=' ( (lv_degree_11_0= RULE_INT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==65) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPerfectML.g:1553:4: ( (lv_degree_def_9_0= 'degree' ) ) otherlv_10= '=' ( (lv_degree_11_0= RULE_INT ) )
                    {
                    // InternalPerfectML.g:1553:4: ( (lv_degree_def_9_0= 'degree' ) )
                    // InternalPerfectML.g:1554:5: (lv_degree_def_9_0= 'degree' )
                    {
                    // InternalPerfectML.g:1554:5: (lv_degree_def_9_0= 'degree' )
                    // InternalPerfectML.g:1555:6: lv_degree_def_9_0= 'degree'
                    {
                    lv_degree_def_9_0=(Token)match(input,65,FOLLOW_15); 

                    						newLeafNode(lv_degree_def_9_0, grammarAccess.getSVCAccess().getDegree_defDegreeKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "degree_def", lv_degree_def_9_0 != null, "degree");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getSVCAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalPerfectML.g:1571:4: ( (lv_degree_11_0= RULE_INT ) )
                    // InternalPerfectML.g:1572:5: (lv_degree_11_0= RULE_INT )
                    {
                    // InternalPerfectML.g:1572:5: (lv_degree_11_0= RULE_INT )
                    // InternalPerfectML.g:1573:6: lv_degree_11_0= RULE_INT
                    {
                    lv_degree_11_0=(Token)match(input,RULE_INT,FOLLOW_49); 

                    						newLeafNode(lv_degree_11_0, grammarAccess.getSVCAccess().getDegreeINTTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"degree",
                    							lv_degree_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1590:3: ( ( (lv_gamma_def_12_0= 'gamma' ) ) otherlv_13= '=' ( ( (lv_gamma_14_1= 'scale' | lv_gamma_14_2= 'auto' ) ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==66) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPerfectML.g:1591:4: ( (lv_gamma_def_12_0= 'gamma' ) ) otherlv_13= '=' ( ( (lv_gamma_14_1= 'scale' | lv_gamma_14_2= 'auto' ) ) )
                    {
                    // InternalPerfectML.g:1591:4: ( (lv_gamma_def_12_0= 'gamma' ) )
                    // InternalPerfectML.g:1592:5: (lv_gamma_def_12_0= 'gamma' )
                    {
                    // InternalPerfectML.g:1592:5: (lv_gamma_def_12_0= 'gamma' )
                    // InternalPerfectML.g:1593:6: lv_gamma_def_12_0= 'gamma'
                    {
                    lv_gamma_def_12_0=(Token)match(input,66,FOLLOW_15); 

                    						newLeafNode(lv_gamma_def_12_0, grammarAccess.getSVCAccess().getGamma_defGammaKeyword_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "gamma_def", lv_gamma_def_12_0 != null, "gamma");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,21,FOLLOW_50); 

                    				newLeafNode(otherlv_13, grammarAccess.getSVCAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalPerfectML.g:1609:4: ( ( (lv_gamma_14_1= 'scale' | lv_gamma_14_2= 'auto' ) ) )
                    // InternalPerfectML.g:1610:5: ( (lv_gamma_14_1= 'scale' | lv_gamma_14_2= 'auto' ) )
                    {
                    // InternalPerfectML.g:1610:5: ( (lv_gamma_14_1= 'scale' | lv_gamma_14_2= 'auto' ) )
                    // InternalPerfectML.g:1611:6: (lv_gamma_14_1= 'scale' | lv_gamma_14_2= 'auto' )
                    {
                    // InternalPerfectML.g:1611:6: (lv_gamma_14_1= 'scale' | lv_gamma_14_2= 'auto' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==67) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==68) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalPerfectML.g:1612:7: lv_gamma_14_1= 'scale'
                            {
                            lv_gamma_14_1=(Token)match(input,67,FOLLOW_51); 

                            							newLeafNode(lv_gamma_14_1, grammarAccess.getSVCAccess().getGammaScaleKeyword_6_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSVCRule());
                            							}
                            							setWithLastConsumed(current, "gamma", lv_gamma_14_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalPerfectML.g:1623:7: lv_gamma_14_2= 'auto'
                            {
                            lv_gamma_14_2=(Token)match(input,68,FOLLOW_51); 

                            							newLeafNode(lv_gamma_14_2, grammarAccess.getSVCAccess().getGammaAutoKeyword_6_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSVCRule());
                            							}
                            							setWithLastConsumed(current, "gamma", lv_gamma_14_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1637:3: ( ( (lv_coef0_def_15_0= 'coef0' ) ) otherlv_16= '=' ( (lv_coef0_17_0= ruleFLOAT ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==69) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPerfectML.g:1638:4: ( (lv_coef0_def_15_0= 'coef0' ) ) otherlv_16= '=' ( (lv_coef0_17_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:1638:4: ( (lv_coef0_def_15_0= 'coef0' ) )
                    // InternalPerfectML.g:1639:5: (lv_coef0_def_15_0= 'coef0' )
                    {
                    // InternalPerfectML.g:1639:5: (lv_coef0_def_15_0= 'coef0' )
                    // InternalPerfectML.g:1640:6: lv_coef0_def_15_0= 'coef0'
                    {
                    lv_coef0_def_15_0=(Token)match(input,69,FOLLOW_15); 

                    						newLeafNode(lv_coef0_def_15_0, grammarAccess.getSVCAccess().getCoef0_defCoef0Keyword_7_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "coef0_def", lv_coef0_def_15_0 != null, "coef0");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_16, grammarAccess.getSVCAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalPerfectML.g:1656:4: ( (lv_coef0_17_0= ruleFLOAT ) )
                    // InternalPerfectML.g:1657:5: (lv_coef0_17_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:1657:5: (lv_coef0_17_0= ruleFLOAT )
                    // InternalPerfectML.g:1658:6: lv_coef0_17_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSVCAccess().getCoef0FLOATParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_coef0_17_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVCRule());
                    						}
                    						set(
                    							current,
                    							"coef0",
                    							lv_coef0_17_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1676:3: ( ( (lv_shrinking_def_18_0= 'shrinking' ) ) otherlv_19= '=' ( (lv_shrinking_20_0= ruleBOOL ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==70) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPerfectML.g:1677:4: ( (lv_shrinking_def_18_0= 'shrinking' ) ) otherlv_19= '=' ( (lv_shrinking_20_0= ruleBOOL ) )
                    {
                    // InternalPerfectML.g:1677:4: ( (lv_shrinking_def_18_0= 'shrinking' ) )
                    // InternalPerfectML.g:1678:5: (lv_shrinking_def_18_0= 'shrinking' )
                    {
                    // InternalPerfectML.g:1678:5: (lv_shrinking_def_18_0= 'shrinking' )
                    // InternalPerfectML.g:1679:6: lv_shrinking_def_18_0= 'shrinking'
                    {
                    lv_shrinking_def_18_0=(Token)match(input,70,FOLLOW_15); 

                    						newLeafNode(lv_shrinking_def_18_0, grammarAccess.getSVCAccess().getShrinking_defShrinkingKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "shrinking_def", lv_shrinking_def_18_0 != null, "shrinking");
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,21,FOLLOW_31); 

                    				newLeafNode(otherlv_19, grammarAccess.getSVCAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalPerfectML.g:1695:4: ( (lv_shrinking_20_0= ruleBOOL ) )
                    // InternalPerfectML.g:1696:5: (lv_shrinking_20_0= ruleBOOL )
                    {
                    // InternalPerfectML.g:1696:5: (lv_shrinking_20_0= ruleBOOL )
                    // InternalPerfectML.g:1697:6: lv_shrinking_20_0= ruleBOOL
                    {

                    						newCompositeNode(grammarAccess.getSVCAccess().getShrinkingBOOLParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_shrinking_20_0=ruleBOOL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVCRule());
                    						}
                    						set(
                    							current,
                    							"shrinking",
                    							lv_shrinking_20_0,
                    							"org.xtext.example.perfectML.PerfectML.BOOL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1715:3: ( ( (lv_probability_def_21_0= 'probability' ) ) otherlv_22= '=' ( (lv_probability_23_0= ruleBOOL ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==71) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPerfectML.g:1716:4: ( (lv_probability_def_21_0= 'probability' ) ) otherlv_22= '=' ( (lv_probability_23_0= ruleBOOL ) )
                    {
                    // InternalPerfectML.g:1716:4: ( (lv_probability_def_21_0= 'probability' ) )
                    // InternalPerfectML.g:1717:5: (lv_probability_def_21_0= 'probability' )
                    {
                    // InternalPerfectML.g:1717:5: (lv_probability_def_21_0= 'probability' )
                    // InternalPerfectML.g:1718:6: lv_probability_def_21_0= 'probability'
                    {
                    lv_probability_def_21_0=(Token)match(input,71,FOLLOW_15); 

                    						newLeafNode(lv_probability_def_21_0, grammarAccess.getSVCAccess().getProbability_defProbabilityKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "probability_def", lv_probability_def_21_0 != null, "probability");
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,21,FOLLOW_31); 

                    				newLeafNode(otherlv_22, grammarAccess.getSVCAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalPerfectML.g:1734:4: ( (lv_probability_23_0= ruleBOOL ) )
                    // InternalPerfectML.g:1735:5: (lv_probability_23_0= ruleBOOL )
                    {
                    // InternalPerfectML.g:1735:5: (lv_probability_23_0= ruleBOOL )
                    // InternalPerfectML.g:1736:6: lv_probability_23_0= ruleBOOL
                    {

                    						newCompositeNode(grammarAccess.getSVCAccess().getProbabilityBOOLParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_probability_23_0=ruleBOOL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVCRule());
                    						}
                    						set(
                    							current,
                    							"probability",
                    							lv_probability_23_0,
                    							"org.xtext.example.perfectML.PerfectML.BOOL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1754:3: ( ( (lv_tol_def_24_0= 'tolerance' ) ) otherlv_25= '=' ( (lv_tol_26_0= ruleFLOAT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPerfectML.g:1755:4: ( (lv_tol_def_24_0= 'tolerance' ) ) otherlv_25= '=' ( (lv_tol_26_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:1755:4: ( (lv_tol_def_24_0= 'tolerance' ) )
                    // InternalPerfectML.g:1756:5: (lv_tol_def_24_0= 'tolerance' )
                    {
                    // InternalPerfectML.g:1756:5: (lv_tol_def_24_0= 'tolerance' )
                    // InternalPerfectML.g:1757:6: lv_tol_def_24_0= 'tolerance'
                    {
                    lv_tol_def_24_0=(Token)match(input,45,FOLLOW_15); 

                    						newLeafNode(lv_tol_def_24_0, grammarAccess.getSVCAccess().getTol_defToleranceKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "tol_def", lv_tol_def_24_0 != null, "tolerance");
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_25, grammarAccess.getSVCAccess().getEqualsSignKeyword_10_1());
                    			
                    // InternalPerfectML.g:1773:4: ( (lv_tol_26_0= ruleFLOAT ) )
                    // InternalPerfectML.g:1774:5: (lv_tol_26_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:1774:5: (lv_tol_26_0= ruleFLOAT )
                    // InternalPerfectML.g:1775:6: lv_tol_26_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSVCAccess().getTolFLOATParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_tol_26_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVCRule());
                    						}
                    						set(
                    							current,
                    							"tol",
                    							lv_tol_26_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1793:3: ( ( (lv_cache_size_def_27_0= 'cache_size' ) ) otherlv_28= '=' ( (lv_cache_size_29_0= ruleFLOAT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==72) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPerfectML.g:1794:4: ( (lv_cache_size_def_27_0= 'cache_size' ) ) otherlv_28= '=' ( (lv_cache_size_29_0= ruleFLOAT ) )
                    {
                    // InternalPerfectML.g:1794:4: ( (lv_cache_size_def_27_0= 'cache_size' ) )
                    // InternalPerfectML.g:1795:5: (lv_cache_size_def_27_0= 'cache_size' )
                    {
                    // InternalPerfectML.g:1795:5: (lv_cache_size_def_27_0= 'cache_size' )
                    // InternalPerfectML.g:1796:6: lv_cache_size_def_27_0= 'cache_size'
                    {
                    lv_cache_size_def_27_0=(Token)match(input,72,FOLLOW_15); 

                    						newLeafNode(lv_cache_size_def_27_0, grammarAccess.getSVCAccess().getCache_size_defCache_sizeKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "cache_size_def", lv_cache_size_def_27_0 != null, "cache_size");
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_28, grammarAccess.getSVCAccess().getEqualsSignKeyword_11_1());
                    			
                    // InternalPerfectML.g:1812:4: ( (lv_cache_size_29_0= ruleFLOAT ) )
                    // InternalPerfectML.g:1813:5: (lv_cache_size_29_0= ruleFLOAT )
                    {
                    // InternalPerfectML.g:1813:5: (lv_cache_size_29_0= ruleFLOAT )
                    // InternalPerfectML.g:1814:6: lv_cache_size_29_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSVCAccess().getCache_sizeFLOATParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_cache_size_29_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVCRule());
                    						}
                    						set(
                    							current,
                    							"cache_size",
                    							lv_cache_size_29_0,
                    							"org.xtext.example.perfectML.PerfectML.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1832:3: ( ( (lv_verbose_def_30_0= 'verbose' ) ) otherlv_31= '=' ( (lv_verbose_32_0= ruleBOOL ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPerfectML.g:1833:4: ( (lv_verbose_def_30_0= 'verbose' ) ) otherlv_31= '=' ( (lv_verbose_32_0= ruleBOOL ) )
                    {
                    // InternalPerfectML.g:1833:4: ( (lv_verbose_def_30_0= 'verbose' ) )
                    // InternalPerfectML.g:1834:5: (lv_verbose_def_30_0= 'verbose' )
                    {
                    // InternalPerfectML.g:1834:5: (lv_verbose_def_30_0= 'verbose' )
                    // InternalPerfectML.g:1835:6: lv_verbose_def_30_0= 'verbose'
                    {
                    lv_verbose_def_30_0=(Token)match(input,46,FOLLOW_15); 

                    						newLeafNode(lv_verbose_def_30_0, grammarAccess.getSVCAccess().getVerbose_defVerboseKeyword_12_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "verbose_def", lv_verbose_def_30_0 != null, "verbose");
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,21,FOLLOW_31); 

                    				newLeafNode(otherlv_31, grammarAccess.getSVCAccess().getEqualsSignKeyword_12_1());
                    			
                    // InternalPerfectML.g:1851:4: ( (lv_verbose_32_0= ruleBOOL ) )
                    // InternalPerfectML.g:1852:5: (lv_verbose_32_0= ruleBOOL )
                    {
                    // InternalPerfectML.g:1852:5: (lv_verbose_32_0= ruleBOOL )
                    // InternalPerfectML.g:1853:6: lv_verbose_32_0= ruleBOOL
                    {

                    						newCompositeNode(grammarAccess.getSVCAccess().getVerboseBOOLParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_verbose_32_0=ruleBOOL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVCRule());
                    						}
                    						set(
                    							current,
                    							"verbose",
                    							lv_verbose_32_0,
                    							"org.xtext.example.perfectML.PerfectML.BOOL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1871:3: ( ( (lv_max_iter_def_33_0= 'max_iter' ) ) otherlv_34= '=' ( (lv_max_iter_35_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPerfectML.g:1872:4: ( (lv_max_iter_def_33_0= 'max_iter' ) ) otherlv_34= '=' ( (lv_max_iter_35_0= RULE_INT ) )
                    {
                    // InternalPerfectML.g:1872:4: ( (lv_max_iter_def_33_0= 'max_iter' ) )
                    // InternalPerfectML.g:1873:5: (lv_max_iter_def_33_0= 'max_iter' )
                    {
                    // InternalPerfectML.g:1873:5: (lv_max_iter_def_33_0= 'max_iter' )
                    // InternalPerfectML.g:1874:6: lv_max_iter_def_33_0= 'max_iter'
                    {
                    lv_max_iter_def_33_0=(Token)match(input,42,FOLLOW_15); 

                    						newLeafNode(lv_max_iter_def_33_0, grammarAccess.getSVCAccess().getMax_iter_defMax_iterKeyword_13_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "max_iter_def", lv_max_iter_def_33_0 != null, "max_iter");
                    					

                    }


                    }

                    otherlv_34=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_34, grammarAccess.getSVCAccess().getEqualsSignKeyword_13_1());
                    			
                    // InternalPerfectML.g:1890:4: ( (lv_max_iter_35_0= RULE_INT ) )
                    // InternalPerfectML.g:1891:5: (lv_max_iter_35_0= RULE_INT )
                    {
                    // InternalPerfectML.g:1891:5: (lv_max_iter_35_0= RULE_INT )
                    // InternalPerfectML.g:1892:6: lv_max_iter_35_0= RULE_INT
                    {
                    lv_max_iter_35_0=(Token)match(input,RULE_INT,FOLLOW_58); 

                    						newLeafNode(lv_max_iter_35_0, grammarAccess.getSVCAccess().getMax_iterINTTerminalRuleCall_13_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"max_iter",
                    							lv_max_iter_35_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1909:3: ( ( (lv_decision_function_shape_def_36_0= 'decision_function_shape' ) ) otherlv_37= '=' ( ( (lv_decision_function_shape_38_1= 'ovo' | lv_decision_function_shape_38_2= 'ovr' ) ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==73) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPerfectML.g:1910:4: ( (lv_decision_function_shape_def_36_0= 'decision_function_shape' ) ) otherlv_37= '=' ( ( (lv_decision_function_shape_38_1= 'ovo' | lv_decision_function_shape_38_2= 'ovr' ) ) )
                    {
                    // InternalPerfectML.g:1910:4: ( (lv_decision_function_shape_def_36_0= 'decision_function_shape' ) )
                    // InternalPerfectML.g:1911:5: (lv_decision_function_shape_def_36_0= 'decision_function_shape' )
                    {
                    // InternalPerfectML.g:1911:5: (lv_decision_function_shape_def_36_0= 'decision_function_shape' )
                    // InternalPerfectML.g:1912:6: lv_decision_function_shape_def_36_0= 'decision_function_shape'
                    {
                    lv_decision_function_shape_def_36_0=(Token)match(input,73,FOLLOW_15); 

                    						newLeafNode(lv_decision_function_shape_def_36_0, grammarAccess.getSVCAccess().getDecision_function_shape_defDecision_function_shapeKeyword_14_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "decision_function_shape_def", lv_decision_function_shape_def_36_0 != null, "decision_function_shape");
                    					

                    }


                    }

                    otherlv_37=(Token)match(input,21,FOLLOW_59); 

                    				newLeafNode(otherlv_37, grammarAccess.getSVCAccess().getEqualsSignKeyword_14_1());
                    			
                    // InternalPerfectML.g:1928:4: ( ( (lv_decision_function_shape_38_1= 'ovo' | lv_decision_function_shape_38_2= 'ovr' ) ) )
                    // InternalPerfectML.g:1929:5: ( (lv_decision_function_shape_38_1= 'ovo' | lv_decision_function_shape_38_2= 'ovr' ) )
                    {
                    // InternalPerfectML.g:1929:5: ( (lv_decision_function_shape_38_1= 'ovo' | lv_decision_function_shape_38_2= 'ovr' ) )
                    // InternalPerfectML.g:1930:6: (lv_decision_function_shape_38_1= 'ovo' | lv_decision_function_shape_38_2= 'ovr' )
                    {
                    // InternalPerfectML.g:1930:6: (lv_decision_function_shape_38_1= 'ovo' | lv_decision_function_shape_38_2= 'ovr' )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==74) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==75) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalPerfectML.g:1931:7: lv_decision_function_shape_38_1= 'ovo'
                            {
                            lv_decision_function_shape_38_1=(Token)match(input,74,FOLLOW_60); 

                            							newLeafNode(lv_decision_function_shape_38_1, grammarAccess.getSVCAccess().getDecision_function_shapeOvoKeyword_14_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSVCRule());
                            							}
                            							setWithLastConsumed(current, "decision_function_shape", lv_decision_function_shape_38_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalPerfectML.g:1942:7: lv_decision_function_shape_38_2= 'ovr'
                            {
                            lv_decision_function_shape_38_2=(Token)match(input,75,FOLLOW_60); 

                            							newLeafNode(lv_decision_function_shape_38_2, grammarAccess.getSVCAccess().getDecision_function_shapeOvrKeyword_14_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSVCRule());
                            							}
                            							setWithLastConsumed(current, "decision_function_shape", lv_decision_function_shape_38_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1956:3: ( ( (lv_break_ties_def_39_0= 'break_ties' ) ) otherlv_40= '=' ( (lv_break_ties_41_0= ruleBOOL ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==76) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPerfectML.g:1957:4: ( (lv_break_ties_def_39_0= 'break_ties' ) ) otherlv_40= '=' ( (lv_break_ties_41_0= ruleBOOL ) )
                    {
                    // InternalPerfectML.g:1957:4: ( (lv_break_ties_def_39_0= 'break_ties' ) )
                    // InternalPerfectML.g:1958:5: (lv_break_ties_def_39_0= 'break_ties' )
                    {
                    // InternalPerfectML.g:1958:5: (lv_break_ties_def_39_0= 'break_ties' )
                    // InternalPerfectML.g:1959:6: lv_break_ties_def_39_0= 'break_ties'
                    {
                    lv_break_ties_def_39_0=(Token)match(input,76,FOLLOW_15); 

                    						newLeafNode(lv_break_ties_def_39_0, grammarAccess.getSVCAccess().getBreak_ties_defBreak_tiesKeyword_15_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "break_ties_def", lv_break_ties_def_39_0 != null, "break_ties");
                    					

                    }


                    }

                    otherlv_40=(Token)match(input,21,FOLLOW_31); 

                    				newLeafNode(otherlv_40, grammarAccess.getSVCAccess().getEqualsSignKeyword_15_1());
                    			
                    // InternalPerfectML.g:1975:4: ( (lv_break_ties_41_0= ruleBOOL ) )
                    // InternalPerfectML.g:1976:5: (lv_break_ties_41_0= ruleBOOL )
                    {
                    // InternalPerfectML.g:1976:5: (lv_break_ties_41_0= ruleBOOL )
                    // InternalPerfectML.g:1977:6: lv_break_ties_41_0= ruleBOOL
                    {

                    						newCompositeNode(grammarAccess.getSVCAccess().getBreak_tiesBOOLParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_break_ties_41_0=ruleBOOL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVCRule());
                    						}
                    						set(
                    							current,
                    							"break_ties",
                    							lv_break_ties_41_0,
                    							"org.xtext.example.perfectML.PerfectML.BOOL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:1995:3: ( ( (lv_random_state_def_42_0= 'random_state' ) ) otherlv_43= '=' ( (lv_random_state_44_0= RULE_INT ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPerfectML.g:1996:4: ( (lv_random_state_def_42_0= 'random_state' ) ) otherlv_43= '=' ( (lv_random_state_44_0= RULE_INT ) )
                    {
                    // InternalPerfectML.g:1996:4: ( (lv_random_state_def_42_0= 'random_state' ) )
                    // InternalPerfectML.g:1997:5: (lv_random_state_def_42_0= 'random_state' )
                    {
                    // InternalPerfectML.g:1997:5: (lv_random_state_def_42_0= 'random_state' )
                    // InternalPerfectML.g:1998:6: lv_random_state_def_42_0= 'random_state'
                    {
                    lv_random_state_def_42_0=(Token)match(input,44,FOLLOW_15); 

                    						newLeafNode(lv_random_state_def_42_0, grammarAccess.getSVCAccess().getRandom_state_defRandom_stateKeyword_16_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(current, "random_state_def", lv_random_state_def_42_0 != null, "random_state");
                    					

                    }


                    }

                    otherlv_43=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_43, grammarAccess.getSVCAccess().getEqualsSignKeyword_16_1());
                    			
                    // InternalPerfectML.g:2014:4: ( (lv_random_state_44_0= RULE_INT ) )
                    // InternalPerfectML.g:2015:5: (lv_random_state_44_0= RULE_INT )
                    {
                    // InternalPerfectML.g:2015:5: (lv_random_state_44_0= RULE_INT )
                    // InternalPerfectML.g:2016:6: lv_random_state_44_0= RULE_INT
                    {
                    lv_random_state_44_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_random_state_44_0, grammarAccess.getSVCAccess().getRandom_stateINTTerminalRuleCall_16_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSVCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"random_state",
                    							lv_random_state_44_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSVC"


    // $ANTLR start "entryRuleKNeighborsClassifier"
    // InternalPerfectML.g:2037:1: entryRuleKNeighborsClassifier returns [EObject current=null] : iv_ruleKNeighborsClassifier= ruleKNeighborsClassifier EOF ;
    public final EObject entryRuleKNeighborsClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKNeighborsClassifier = null;


        try {
            // InternalPerfectML.g:2037:61: (iv_ruleKNeighborsClassifier= ruleKNeighborsClassifier EOF )
            // InternalPerfectML.g:2038:2: iv_ruleKNeighborsClassifier= ruleKNeighborsClassifier EOF
            {
             newCompositeNode(grammarAccess.getKNeighborsClassifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKNeighborsClassifier=ruleKNeighborsClassifier();

            state._fsp--;

             current =iv_ruleKNeighborsClassifier; 
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
    // $ANTLR end "entryRuleKNeighborsClassifier"


    // $ANTLR start "ruleKNeighborsClassifier"
    // InternalPerfectML.g:2044:1: ruleKNeighborsClassifier returns [EObject current=null] : ( () otherlv_1= 'KNeighborsClassifier' otherlv_2= 'with' ( ( (lv_n_neighbors_def_3_0= 'n_neighbors' ) ) otherlv_4= '=' ( (lv_n_neighbors_5_0= RULE_INT ) ) )? ( ( (lv_weights_def_6_0= 'weights' ) ) otherlv_7= '=' ( ( (lv_weights_8_1= 'uniform' | lv_weights_8_2= 'distance' ) ) ) )? ( ( (lv_algorithm_def_9_0= 'algorithm' ) ) otherlv_10= '=' ( ( (lv_algorithm_11_1= 'auto' | lv_algorithm_11_2= 'ball_tree' | lv_algorithm_11_3= 'kd_tree' | lv_algorithm_11_4= 'brute' ) ) ) )? ( ( (lv_leaf_size_def_12_0= 'leaf_size' ) ) otherlv_13= '=' ( (lv_leaf_size_14_0= RULE_INT ) ) )? ( ( (lv_p_def_15_0= 'p' ) ) otherlv_16= '=' ( (lv_p_17_0= RULE_INT ) ) )? ( ( (lv_metric_def_18_0= 'metric' ) ) otherlv_19= '=' ( ( (lv_metric_20_1= 'mahalanobis' | lv_metric_20_2= 'seuclidean' | lv_metric_20_3= 'wminkowski' | lv_metric_20_4= 'minkowski' | lv_metric_20_5= 'chebyshev' | lv_metric_20_6= 'manhattan' | lv_metric_20_7= 'euclidean' ) ) ) )? ( ( (lv_n_jobs_def_21_0= 'n_jobs' ) ) otherlv_22= '=' ( (lv_n_jobs_23_0= RULE_INT ) ) )? ) ;
    public final EObject ruleKNeighborsClassifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_n_neighbors_def_3_0=null;
        Token otherlv_4=null;
        Token lv_n_neighbors_5_0=null;
        Token lv_weights_def_6_0=null;
        Token otherlv_7=null;
        Token lv_weights_8_1=null;
        Token lv_weights_8_2=null;
        Token lv_algorithm_def_9_0=null;
        Token otherlv_10=null;
        Token lv_algorithm_11_1=null;
        Token lv_algorithm_11_2=null;
        Token lv_algorithm_11_3=null;
        Token lv_algorithm_11_4=null;
        Token lv_leaf_size_def_12_0=null;
        Token otherlv_13=null;
        Token lv_leaf_size_14_0=null;
        Token lv_p_def_15_0=null;
        Token otherlv_16=null;
        Token lv_p_17_0=null;
        Token lv_metric_def_18_0=null;
        Token otherlv_19=null;
        Token lv_metric_20_1=null;
        Token lv_metric_20_2=null;
        Token lv_metric_20_3=null;
        Token lv_metric_20_4=null;
        Token lv_metric_20_5=null;
        Token lv_metric_20_6=null;
        Token lv_metric_20_7=null;
        Token lv_n_jobs_def_21_0=null;
        Token otherlv_22=null;
        Token lv_n_jobs_23_0=null;


        	enterRule();

        try {
            // InternalPerfectML.g:2050:2: ( ( () otherlv_1= 'KNeighborsClassifier' otherlv_2= 'with' ( ( (lv_n_neighbors_def_3_0= 'n_neighbors' ) ) otherlv_4= '=' ( (lv_n_neighbors_5_0= RULE_INT ) ) )? ( ( (lv_weights_def_6_0= 'weights' ) ) otherlv_7= '=' ( ( (lv_weights_8_1= 'uniform' | lv_weights_8_2= 'distance' ) ) ) )? ( ( (lv_algorithm_def_9_0= 'algorithm' ) ) otherlv_10= '=' ( ( (lv_algorithm_11_1= 'auto' | lv_algorithm_11_2= 'ball_tree' | lv_algorithm_11_3= 'kd_tree' | lv_algorithm_11_4= 'brute' ) ) ) )? ( ( (lv_leaf_size_def_12_0= 'leaf_size' ) ) otherlv_13= '=' ( (lv_leaf_size_14_0= RULE_INT ) ) )? ( ( (lv_p_def_15_0= 'p' ) ) otherlv_16= '=' ( (lv_p_17_0= RULE_INT ) ) )? ( ( (lv_metric_def_18_0= 'metric' ) ) otherlv_19= '=' ( ( (lv_metric_20_1= 'mahalanobis' | lv_metric_20_2= 'seuclidean' | lv_metric_20_3= 'wminkowski' | lv_metric_20_4= 'minkowski' | lv_metric_20_5= 'chebyshev' | lv_metric_20_6= 'manhattan' | lv_metric_20_7= 'euclidean' ) ) ) )? ( ( (lv_n_jobs_def_21_0= 'n_jobs' ) ) otherlv_22= '=' ( (lv_n_jobs_23_0= RULE_INT ) ) )? ) )
            // InternalPerfectML.g:2051:2: ( () otherlv_1= 'KNeighborsClassifier' otherlv_2= 'with' ( ( (lv_n_neighbors_def_3_0= 'n_neighbors' ) ) otherlv_4= '=' ( (lv_n_neighbors_5_0= RULE_INT ) ) )? ( ( (lv_weights_def_6_0= 'weights' ) ) otherlv_7= '=' ( ( (lv_weights_8_1= 'uniform' | lv_weights_8_2= 'distance' ) ) ) )? ( ( (lv_algorithm_def_9_0= 'algorithm' ) ) otherlv_10= '=' ( ( (lv_algorithm_11_1= 'auto' | lv_algorithm_11_2= 'ball_tree' | lv_algorithm_11_3= 'kd_tree' | lv_algorithm_11_4= 'brute' ) ) ) )? ( ( (lv_leaf_size_def_12_0= 'leaf_size' ) ) otherlv_13= '=' ( (lv_leaf_size_14_0= RULE_INT ) ) )? ( ( (lv_p_def_15_0= 'p' ) ) otherlv_16= '=' ( (lv_p_17_0= RULE_INT ) ) )? ( ( (lv_metric_def_18_0= 'metric' ) ) otherlv_19= '=' ( ( (lv_metric_20_1= 'mahalanobis' | lv_metric_20_2= 'seuclidean' | lv_metric_20_3= 'wminkowski' | lv_metric_20_4= 'minkowski' | lv_metric_20_5= 'chebyshev' | lv_metric_20_6= 'manhattan' | lv_metric_20_7= 'euclidean' ) ) ) )? ( ( (lv_n_jobs_def_21_0= 'n_jobs' ) ) otherlv_22= '=' ( (lv_n_jobs_23_0= RULE_INT ) ) )? )
            {
            // InternalPerfectML.g:2051:2: ( () otherlv_1= 'KNeighborsClassifier' otherlv_2= 'with' ( ( (lv_n_neighbors_def_3_0= 'n_neighbors' ) ) otherlv_4= '=' ( (lv_n_neighbors_5_0= RULE_INT ) ) )? ( ( (lv_weights_def_6_0= 'weights' ) ) otherlv_7= '=' ( ( (lv_weights_8_1= 'uniform' | lv_weights_8_2= 'distance' ) ) ) )? ( ( (lv_algorithm_def_9_0= 'algorithm' ) ) otherlv_10= '=' ( ( (lv_algorithm_11_1= 'auto' | lv_algorithm_11_2= 'ball_tree' | lv_algorithm_11_3= 'kd_tree' | lv_algorithm_11_4= 'brute' ) ) ) )? ( ( (lv_leaf_size_def_12_0= 'leaf_size' ) ) otherlv_13= '=' ( (lv_leaf_size_14_0= RULE_INT ) ) )? ( ( (lv_p_def_15_0= 'p' ) ) otherlv_16= '=' ( (lv_p_17_0= RULE_INT ) ) )? ( ( (lv_metric_def_18_0= 'metric' ) ) otherlv_19= '=' ( ( (lv_metric_20_1= 'mahalanobis' | lv_metric_20_2= 'seuclidean' | lv_metric_20_3= 'wminkowski' | lv_metric_20_4= 'minkowski' | lv_metric_20_5= 'chebyshev' | lv_metric_20_6= 'manhattan' | lv_metric_20_7= 'euclidean' ) ) ) )? ( ( (lv_n_jobs_def_21_0= 'n_jobs' ) ) otherlv_22= '=' ( (lv_n_jobs_23_0= RULE_INT ) ) )? )
            // InternalPerfectML.g:2052:3: () otherlv_1= 'KNeighborsClassifier' otherlv_2= 'with' ( ( (lv_n_neighbors_def_3_0= 'n_neighbors' ) ) otherlv_4= '=' ( (lv_n_neighbors_5_0= RULE_INT ) ) )? ( ( (lv_weights_def_6_0= 'weights' ) ) otherlv_7= '=' ( ( (lv_weights_8_1= 'uniform' | lv_weights_8_2= 'distance' ) ) ) )? ( ( (lv_algorithm_def_9_0= 'algorithm' ) ) otherlv_10= '=' ( ( (lv_algorithm_11_1= 'auto' | lv_algorithm_11_2= 'ball_tree' | lv_algorithm_11_3= 'kd_tree' | lv_algorithm_11_4= 'brute' ) ) ) )? ( ( (lv_leaf_size_def_12_0= 'leaf_size' ) ) otherlv_13= '=' ( (lv_leaf_size_14_0= RULE_INT ) ) )? ( ( (lv_p_def_15_0= 'p' ) ) otherlv_16= '=' ( (lv_p_17_0= RULE_INT ) ) )? ( ( (lv_metric_def_18_0= 'metric' ) ) otherlv_19= '=' ( ( (lv_metric_20_1= 'mahalanobis' | lv_metric_20_2= 'seuclidean' | lv_metric_20_3= 'wminkowski' | lv_metric_20_4= 'minkowski' | lv_metric_20_5= 'chebyshev' | lv_metric_20_6= 'manhattan' | lv_metric_20_7= 'euclidean' ) ) ) )? ( ( (lv_n_jobs_def_21_0= 'n_jobs' ) ) otherlv_22= '=' ( (lv_n_jobs_23_0= RULE_INT ) ) )?
            {
            // InternalPerfectML.g:2052:3: ()
            // InternalPerfectML.g:2053:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKNeighborsClassifierAccess().getKNeighborsClassifierAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getKNeighborsClassifierAccess().getKNeighborsClassifierKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getKNeighborsClassifierAccess().getWithKeyword_2());
            		
            // InternalPerfectML.g:2067:3: ( ( (lv_n_neighbors_def_3_0= 'n_neighbors' ) ) otherlv_4= '=' ( (lv_n_neighbors_5_0= RULE_INT ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==78) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPerfectML.g:2068:4: ( (lv_n_neighbors_def_3_0= 'n_neighbors' ) ) otherlv_4= '=' ( (lv_n_neighbors_5_0= RULE_INT ) )
                    {
                    // InternalPerfectML.g:2068:4: ( (lv_n_neighbors_def_3_0= 'n_neighbors' ) )
                    // InternalPerfectML.g:2069:5: (lv_n_neighbors_def_3_0= 'n_neighbors' )
                    {
                    // InternalPerfectML.g:2069:5: (lv_n_neighbors_def_3_0= 'n_neighbors' )
                    // InternalPerfectML.g:2070:6: lv_n_neighbors_def_3_0= 'n_neighbors'
                    {
                    lv_n_neighbors_def_3_0=(Token)match(input,78,FOLLOW_15); 

                    						newLeafNode(lv_n_neighbors_def_3_0, grammarAccess.getKNeighborsClassifierAccess().getN_neighbors_defN_neighborsKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                    						}
                    						setWithLastConsumed(current, "n_neighbors_def", lv_n_neighbors_def_3_0 != null, "n_neighbors");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalPerfectML.g:2086:4: ( (lv_n_neighbors_5_0= RULE_INT ) )
                    // InternalPerfectML.g:2087:5: (lv_n_neighbors_5_0= RULE_INT )
                    {
                    // InternalPerfectML.g:2087:5: (lv_n_neighbors_5_0= RULE_INT )
                    // InternalPerfectML.g:2088:6: lv_n_neighbors_5_0= RULE_INT
                    {
                    lv_n_neighbors_5_0=(Token)match(input,RULE_INT,FOLLOW_63); 

                    						newLeafNode(lv_n_neighbors_5_0, grammarAccess.getKNeighborsClassifierAccess().getN_neighborsINTTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"n_neighbors",
                    							lv_n_neighbors_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:2105:3: ( ( (lv_weights_def_6_0= 'weights' ) ) otherlv_7= '=' ( ( (lv_weights_8_1= 'uniform' | lv_weights_8_2= 'distance' ) ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==79) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPerfectML.g:2106:4: ( (lv_weights_def_6_0= 'weights' ) ) otherlv_7= '=' ( ( (lv_weights_8_1= 'uniform' | lv_weights_8_2= 'distance' ) ) )
                    {
                    // InternalPerfectML.g:2106:4: ( (lv_weights_def_6_0= 'weights' ) )
                    // InternalPerfectML.g:2107:5: (lv_weights_def_6_0= 'weights' )
                    {
                    // InternalPerfectML.g:2107:5: (lv_weights_def_6_0= 'weights' )
                    // InternalPerfectML.g:2108:6: lv_weights_def_6_0= 'weights'
                    {
                    lv_weights_def_6_0=(Token)match(input,79,FOLLOW_15); 

                    						newLeafNode(lv_weights_def_6_0, grammarAccess.getKNeighborsClassifierAccess().getWeights_defWeightsKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                    						}
                    						setWithLastConsumed(current, "weights_def", lv_weights_def_6_0 != null, "weights");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_64); 

                    				newLeafNode(otherlv_7, grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalPerfectML.g:2124:4: ( ( (lv_weights_8_1= 'uniform' | lv_weights_8_2= 'distance' ) ) )
                    // InternalPerfectML.g:2125:5: ( (lv_weights_8_1= 'uniform' | lv_weights_8_2= 'distance' ) )
                    {
                    // InternalPerfectML.g:2125:5: ( (lv_weights_8_1= 'uniform' | lv_weights_8_2= 'distance' ) )
                    // InternalPerfectML.g:2126:6: (lv_weights_8_1= 'uniform' | lv_weights_8_2= 'distance' )
                    {
                    // InternalPerfectML.g:2126:6: (lv_weights_8_1= 'uniform' | lv_weights_8_2= 'distance' )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==80) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==81) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalPerfectML.g:2127:7: lv_weights_8_1= 'uniform'
                            {
                            lv_weights_8_1=(Token)match(input,80,FOLLOW_65); 

                            							newLeafNode(lv_weights_8_1, grammarAccess.getKNeighborsClassifierAccess().getWeightsUniformKeyword_4_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                            							}
                            							setWithLastConsumed(current, "weights", lv_weights_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalPerfectML.g:2138:7: lv_weights_8_2= 'distance'
                            {
                            lv_weights_8_2=(Token)match(input,81,FOLLOW_65); 

                            							newLeafNode(lv_weights_8_2, grammarAccess.getKNeighborsClassifierAccess().getWeightsDistanceKeyword_4_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                            							}
                            							setWithLastConsumed(current, "weights", lv_weights_8_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:2152:3: ( ( (lv_algorithm_def_9_0= 'algorithm' ) ) otherlv_10= '=' ( ( (lv_algorithm_11_1= 'auto' | lv_algorithm_11_2= 'ball_tree' | lv_algorithm_11_3= 'kd_tree' | lv_algorithm_11_4= 'brute' ) ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==82) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPerfectML.g:2153:4: ( (lv_algorithm_def_9_0= 'algorithm' ) ) otherlv_10= '=' ( ( (lv_algorithm_11_1= 'auto' | lv_algorithm_11_2= 'ball_tree' | lv_algorithm_11_3= 'kd_tree' | lv_algorithm_11_4= 'brute' ) ) )
                    {
                    // InternalPerfectML.g:2153:4: ( (lv_algorithm_def_9_0= 'algorithm' ) )
                    // InternalPerfectML.g:2154:5: (lv_algorithm_def_9_0= 'algorithm' )
                    {
                    // InternalPerfectML.g:2154:5: (lv_algorithm_def_9_0= 'algorithm' )
                    // InternalPerfectML.g:2155:6: lv_algorithm_def_9_0= 'algorithm'
                    {
                    lv_algorithm_def_9_0=(Token)match(input,82,FOLLOW_15); 

                    						newLeafNode(lv_algorithm_def_9_0, grammarAccess.getKNeighborsClassifierAccess().getAlgorithm_defAlgorithmKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                    						}
                    						setWithLastConsumed(current, "algorithm_def", lv_algorithm_def_9_0 != null, "algorithm");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,21,FOLLOW_66); 

                    				newLeafNode(otherlv_10, grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalPerfectML.g:2171:4: ( ( (lv_algorithm_11_1= 'auto' | lv_algorithm_11_2= 'ball_tree' | lv_algorithm_11_3= 'kd_tree' | lv_algorithm_11_4= 'brute' ) ) )
                    // InternalPerfectML.g:2172:5: ( (lv_algorithm_11_1= 'auto' | lv_algorithm_11_2= 'ball_tree' | lv_algorithm_11_3= 'kd_tree' | lv_algorithm_11_4= 'brute' ) )
                    {
                    // InternalPerfectML.g:2172:5: ( (lv_algorithm_11_1= 'auto' | lv_algorithm_11_2= 'ball_tree' | lv_algorithm_11_3= 'kd_tree' | lv_algorithm_11_4= 'brute' ) )
                    // InternalPerfectML.g:2173:6: (lv_algorithm_11_1= 'auto' | lv_algorithm_11_2= 'ball_tree' | lv_algorithm_11_3= 'kd_tree' | lv_algorithm_11_4= 'brute' )
                    {
                    // InternalPerfectML.g:2173:6: (lv_algorithm_11_1= 'auto' | lv_algorithm_11_2= 'ball_tree' | lv_algorithm_11_3= 'kd_tree' | lv_algorithm_11_4= 'brute' )
                    int alt51=4;
                    switch ( input.LA(1) ) {
                    case 68:
                        {
                        alt51=1;
                        }
                        break;
                    case 83:
                        {
                        alt51=2;
                        }
                        break;
                    case 84:
                        {
                        alt51=3;
                        }
                        break;
                    case 85:
                        {
                        alt51=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }

                    switch (alt51) {
                        case 1 :
                            // InternalPerfectML.g:2174:7: lv_algorithm_11_1= 'auto'
                            {
                            lv_algorithm_11_1=(Token)match(input,68,FOLLOW_67); 

                            							newLeafNode(lv_algorithm_11_1, grammarAccess.getKNeighborsClassifierAccess().getAlgorithmAutoKeyword_5_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                            							}
                            							setWithLastConsumed(current, "algorithm", lv_algorithm_11_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalPerfectML.g:2185:7: lv_algorithm_11_2= 'ball_tree'
                            {
                            lv_algorithm_11_2=(Token)match(input,83,FOLLOW_67); 

                            							newLeafNode(lv_algorithm_11_2, grammarAccess.getKNeighborsClassifierAccess().getAlgorithmBall_treeKeyword_5_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                            							}
                            							setWithLastConsumed(current, "algorithm", lv_algorithm_11_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalPerfectML.g:2196:7: lv_algorithm_11_3= 'kd_tree'
                            {
                            lv_algorithm_11_3=(Token)match(input,84,FOLLOW_67); 

                            							newLeafNode(lv_algorithm_11_3, grammarAccess.getKNeighborsClassifierAccess().getAlgorithmKd_treeKeyword_5_2_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                            							}
                            							setWithLastConsumed(current, "algorithm", lv_algorithm_11_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalPerfectML.g:2207:7: lv_algorithm_11_4= 'brute'
                            {
                            lv_algorithm_11_4=(Token)match(input,85,FOLLOW_67); 

                            							newLeafNode(lv_algorithm_11_4, grammarAccess.getKNeighborsClassifierAccess().getAlgorithmBruteKeyword_5_2_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                            							}
                            							setWithLastConsumed(current, "algorithm", lv_algorithm_11_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:2221:3: ( ( (lv_leaf_size_def_12_0= 'leaf_size' ) ) otherlv_13= '=' ( (lv_leaf_size_14_0= RULE_INT ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==86) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalPerfectML.g:2222:4: ( (lv_leaf_size_def_12_0= 'leaf_size' ) ) otherlv_13= '=' ( (lv_leaf_size_14_0= RULE_INT ) )
                    {
                    // InternalPerfectML.g:2222:4: ( (lv_leaf_size_def_12_0= 'leaf_size' ) )
                    // InternalPerfectML.g:2223:5: (lv_leaf_size_def_12_0= 'leaf_size' )
                    {
                    // InternalPerfectML.g:2223:5: (lv_leaf_size_def_12_0= 'leaf_size' )
                    // InternalPerfectML.g:2224:6: lv_leaf_size_def_12_0= 'leaf_size'
                    {
                    lv_leaf_size_def_12_0=(Token)match(input,86,FOLLOW_15); 

                    						newLeafNode(lv_leaf_size_def_12_0, grammarAccess.getKNeighborsClassifierAccess().getLeaf_size_defLeaf_sizeKeyword_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                    						}
                    						setWithLastConsumed(current, "leaf_size_def", lv_leaf_size_def_12_0 != null, "leaf_size");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalPerfectML.g:2240:4: ( (lv_leaf_size_14_0= RULE_INT ) )
                    // InternalPerfectML.g:2241:5: (lv_leaf_size_14_0= RULE_INT )
                    {
                    // InternalPerfectML.g:2241:5: (lv_leaf_size_14_0= RULE_INT )
                    // InternalPerfectML.g:2242:6: lv_leaf_size_14_0= RULE_INT
                    {
                    lv_leaf_size_14_0=(Token)match(input,RULE_INT,FOLLOW_68); 

                    						newLeafNode(lv_leaf_size_14_0, grammarAccess.getKNeighborsClassifierAccess().getLeaf_sizeINTTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"leaf_size",
                    							lv_leaf_size_14_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:2259:3: ( ( (lv_p_def_15_0= 'p' ) ) otherlv_16= '=' ( (lv_p_17_0= RULE_INT ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==87) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPerfectML.g:2260:4: ( (lv_p_def_15_0= 'p' ) ) otherlv_16= '=' ( (lv_p_17_0= RULE_INT ) )
                    {
                    // InternalPerfectML.g:2260:4: ( (lv_p_def_15_0= 'p' ) )
                    // InternalPerfectML.g:2261:5: (lv_p_def_15_0= 'p' )
                    {
                    // InternalPerfectML.g:2261:5: (lv_p_def_15_0= 'p' )
                    // InternalPerfectML.g:2262:6: lv_p_def_15_0= 'p'
                    {
                    lv_p_def_15_0=(Token)match(input,87,FOLLOW_15); 

                    						newLeafNode(lv_p_def_15_0, grammarAccess.getKNeighborsClassifierAccess().getP_defPKeyword_7_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                    						}
                    						setWithLastConsumed(current, "p_def", lv_p_def_15_0 != null, "p");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_16, grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalPerfectML.g:2278:4: ( (lv_p_17_0= RULE_INT ) )
                    // InternalPerfectML.g:2279:5: (lv_p_17_0= RULE_INT )
                    {
                    // InternalPerfectML.g:2279:5: (lv_p_17_0= RULE_INT )
                    // InternalPerfectML.g:2280:6: lv_p_17_0= RULE_INT
                    {
                    lv_p_17_0=(Token)match(input,RULE_INT,FOLLOW_69); 

                    						newLeafNode(lv_p_17_0, grammarAccess.getKNeighborsClassifierAccess().getPINTTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"p",
                    							lv_p_17_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:2297:3: ( ( (lv_metric_def_18_0= 'metric' ) ) otherlv_19= '=' ( ( (lv_metric_20_1= 'mahalanobis' | lv_metric_20_2= 'seuclidean' | lv_metric_20_3= 'wminkowski' | lv_metric_20_4= 'minkowski' | lv_metric_20_5= 'chebyshev' | lv_metric_20_6= 'manhattan' | lv_metric_20_7= 'euclidean' ) ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==88) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalPerfectML.g:2298:4: ( (lv_metric_def_18_0= 'metric' ) ) otherlv_19= '=' ( ( (lv_metric_20_1= 'mahalanobis' | lv_metric_20_2= 'seuclidean' | lv_metric_20_3= 'wminkowski' | lv_metric_20_4= 'minkowski' | lv_metric_20_5= 'chebyshev' | lv_metric_20_6= 'manhattan' | lv_metric_20_7= 'euclidean' ) ) )
                    {
                    // InternalPerfectML.g:2298:4: ( (lv_metric_def_18_0= 'metric' ) )
                    // InternalPerfectML.g:2299:5: (lv_metric_def_18_0= 'metric' )
                    {
                    // InternalPerfectML.g:2299:5: (lv_metric_def_18_0= 'metric' )
                    // InternalPerfectML.g:2300:6: lv_metric_def_18_0= 'metric'
                    {
                    lv_metric_def_18_0=(Token)match(input,88,FOLLOW_15); 

                    						newLeafNode(lv_metric_def_18_0, grammarAccess.getKNeighborsClassifierAccess().getMetric_defMetricKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                    						}
                    						setWithLastConsumed(current, "metric_def", lv_metric_def_18_0 != null, "metric");
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,21,FOLLOW_70); 

                    				newLeafNode(otherlv_19, grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalPerfectML.g:2316:4: ( ( (lv_metric_20_1= 'mahalanobis' | lv_metric_20_2= 'seuclidean' | lv_metric_20_3= 'wminkowski' | lv_metric_20_4= 'minkowski' | lv_metric_20_5= 'chebyshev' | lv_metric_20_6= 'manhattan' | lv_metric_20_7= 'euclidean' ) ) )
                    // InternalPerfectML.g:2317:5: ( (lv_metric_20_1= 'mahalanobis' | lv_metric_20_2= 'seuclidean' | lv_metric_20_3= 'wminkowski' | lv_metric_20_4= 'minkowski' | lv_metric_20_5= 'chebyshev' | lv_metric_20_6= 'manhattan' | lv_metric_20_7= 'euclidean' ) )
                    {
                    // InternalPerfectML.g:2317:5: ( (lv_metric_20_1= 'mahalanobis' | lv_metric_20_2= 'seuclidean' | lv_metric_20_3= 'wminkowski' | lv_metric_20_4= 'minkowski' | lv_metric_20_5= 'chebyshev' | lv_metric_20_6= 'manhattan' | lv_metric_20_7= 'euclidean' ) )
                    // InternalPerfectML.g:2318:6: (lv_metric_20_1= 'mahalanobis' | lv_metric_20_2= 'seuclidean' | lv_metric_20_3= 'wminkowski' | lv_metric_20_4= 'minkowski' | lv_metric_20_5= 'chebyshev' | lv_metric_20_6= 'manhattan' | lv_metric_20_7= 'euclidean' )
                    {
                    // InternalPerfectML.g:2318:6: (lv_metric_20_1= 'mahalanobis' | lv_metric_20_2= 'seuclidean' | lv_metric_20_3= 'wminkowski' | lv_metric_20_4= 'minkowski' | lv_metric_20_5= 'chebyshev' | lv_metric_20_6= 'manhattan' | lv_metric_20_7= 'euclidean' )
                    int alt55=7;
                    switch ( input.LA(1) ) {
                    case 89:
                        {
                        alt55=1;
                        }
                        break;
                    case 90:
                        {
                        alt55=2;
                        }
                        break;
                    case 91:
                        {
                        alt55=3;
                        }
                        break;
                    case 92:
                        {
                        alt55=4;
                        }
                        break;
                    case 93:
                        {
                        alt55=5;
                        }
                        break;
                    case 94:
                        {
                        alt55=6;
                        }
                        break;
                    case 95:
                        {
                        alt55=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }

                    switch (alt55) {
                        case 1 :
                            // InternalPerfectML.g:2319:7: lv_metric_20_1= 'mahalanobis'
                            {
                            lv_metric_20_1=(Token)match(input,89,FOLLOW_71); 

                            							newLeafNode(lv_metric_20_1, grammarAccess.getKNeighborsClassifierAccess().getMetricMahalanobisKeyword_8_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                            							}
                            							setWithLastConsumed(current, "metric", lv_metric_20_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalPerfectML.g:2330:7: lv_metric_20_2= 'seuclidean'
                            {
                            lv_metric_20_2=(Token)match(input,90,FOLLOW_71); 

                            							newLeafNode(lv_metric_20_2, grammarAccess.getKNeighborsClassifierAccess().getMetricSeuclideanKeyword_8_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                            							}
                            							setWithLastConsumed(current, "metric", lv_metric_20_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalPerfectML.g:2341:7: lv_metric_20_3= 'wminkowski'
                            {
                            lv_metric_20_3=(Token)match(input,91,FOLLOW_71); 

                            							newLeafNode(lv_metric_20_3, grammarAccess.getKNeighborsClassifierAccess().getMetricWminkowskiKeyword_8_2_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                            							}
                            							setWithLastConsumed(current, "metric", lv_metric_20_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalPerfectML.g:2352:7: lv_metric_20_4= 'minkowski'
                            {
                            lv_metric_20_4=(Token)match(input,92,FOLLOW_71); 

                            							newLeafNode(lv_metric_20_4, grammarAccess.getKNeighborsClassifierAccess().getMetricMinkowskiKeyword_8_2_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                            							}
                            							setWithLastConsumed(current, "metric", lv_metric_20_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalPerfectML.g:2363:7: lv_metric_20_5= 'chebyshev'
                            {
                            lv_metric_20_5=(Token)match(input,93,FOLLOW_71); 

                            							newLeafNode(lv_metric_20_5, grammarAccess.getKNeighborsClassifierAccess().getMetricChebyshevKeyword_8_2_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                            							}
                            							setWithLastConsumed(current, "metric", lv_metric_20_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalPerfectML.g:2374:7: lv_metric_20_6= 'manhattan'
                            {
                            lv_metric_20_6=(Token)match(input,94,FOLLOW_71); 

                            							newLeafNode(lv_metric_20_6, grammarAccess.getKNeighborsClassifierAccess().getMetricManhattanKeyword_8_2_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                            							}
                            							setWithLastConsumed(current, "metric", lv_metric_20_6, null);
                            						

                            }
                            break;
                        case 7 :
                            // InternalPerfectML.g:2385:7: lv_metric_20_7= 'euclidean'
                            {
                            lv_metric_20_7=(Token)match(input,95,FOLLOW_71); 

                            							newLeafNode(lv_metric_20_7, grammarAccess.getKNeighborsClassifierAccess().getMetricEuclideanKeyword_8_2_0_6());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                            							}
                            							setWithLastConsumed(current, "metric", lv_metric_20_7, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalPerfectML.g:2399:3: ( ( (lv_n_jobs_def_21_0= 'n_jobs' ) ) otherlv_22= '=' ( (lv_n_jobs_23_0= RULE_INT ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==96) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalPerfectML.g:2400:4: ( (lv_n_jobs_def_21_0= 'n_jobs' ) ) otherlv_22= '=' ( (lv_n_jobs_23_0= RULE_INT ) )
                    {
                    // InternalPerfectML.g:2400:4: ( (lv_n_jobs_def_21_0= 'n_jobs' ) )
                    // InternalPerfectML.g:2401:5: (lv_n_jobs_def_21_0= 'n_jobs' )
                    {
                    // InternalPerfectML.g:2401:5: (lv_n_jobs_def_21_0= 'n_jobs' )
                    // InternalPerfectML.g:2402:6: lv_n_jobs_def_21_0= 'n_jobs'
                    {
                    lv_n_jobs_def_21_0=(Token)match(input,96,FOLLOW_15); 

                    						newLeafNode(lv_n_jobs_def_21_0, grammarAccess.getKNeighborsClassifierAccess().getN_jobs_defN_jobsKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                    						}
                    						setWithLastConsumed(current, "n_jobs_def", lv_n_jobs_def_21_0 != null, "n_jobs");
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_22, grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalPerfectML.g:2418:4: ( (lv_n_jobs_23_0= RULE_INT ) )
                    // InternalPerfectML.g:2419:5: (lv_n_jobs_23_0= RULE_INT )
                    {
                    // InternalPerfectML.g:2419:5: (lv_n_jobs_23_0= RULE_INT )
                    // InternalPerfectML.g:2420:6: lv_n_jobs_23_0= RULE_INT
                    {
                    lv_n_jobs_23_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_n_jobs_23_0, grammarAccess.getKNeighborsClassifierAccess().getN_jobsINTTerminalRuleCall_9_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKNeighborsClassifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"n_jobs",
                    							lv_n_jobs_23_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleKNeighborsClassifier"


    // $ANTLR start "entryRuleTrainingAmount"
    // InternalPerfectML.g:2441:1: entryRuleTrainingAmount returns [EObject current=null] : iv_ruleTrainingAmount= ruleTrainingAmount EOF ;
    public final EObject entryRuleTrainingAmount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingAmount = null;


        try {
            // InternalPerfectML.g:2441:55: (iv_ruleTrainingAmount= ruleTrainingAmount EOF )
            // InternalPerfectML.g:2442:2: iv_ruleTrainingAmount= ruleTrainingAmount EOF
            {
             newCompositeNode(grammarAccess.getTrainingAmountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainingAmount=ruleTrainingAmount();

            state._fsp--;

             current =iv_ruleTrainingAmount; 
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
    // $ANTLR end "entryRuleTrainingAmount"


    // $ANTLR start "ruleTrainingAmount"
    // InternalPerfectML.g:2448:1: ruleTrainingAmount returns [EObject current=null] : (otherlv_0= 'with' ( (lv_value_1_0= RULE_INT ) ) ( ( (lv_percent_2_0= '%' ) ) | (otherlv_3= 'lines' otherlv_4= 'of' ) ) otherlv_5= 'training' ) ;
    public final EObject ruleTrainingAmount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_percent_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalPerfectML.g:2454:2: ( (otherlv_0= 'with' ( (lv_value_1_0= RULE_INT ) ) ( ( (lv_percent_2_0= '%' ) ) | (otherlv_3= 'lines' otherlv_4= 'of' ) ) otherlv_5= 'training' ) )
            // InternalPerfectML.g:2455:2: (otherlv_0= 'with' ( (lv_value_1_0= RULE_INT ) ) ( ( (lv_percent_2_0= '%' ) ) | (otherlv_3= 'lines' otherlv_4= 'of' ) ) otherlv_5= 'training' )
            {
            // InternalPerfectML.g:2455:2: (otherlv_0= 'with' ( (lv_value_1_0= RULE_INT ) ) ( ( (lv_percent_2_0= '%' ) ) | (otherlv_3= 'lines' otherlv_4= 'of' ) ) otherlv_5= 'training' )
            // InternalPerfectML.g:2456:3: otherlv_0= 'with' ( (lv_value_1_0= RULE_INT ) ) ( ( (lv_percent_2_0= '%' ) ) | (otherlv_3= 'lines' otherlv_4= 'of' ) ) otherlv_5= 'training'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTrainingAmountAccess().getWithKeyword_0());
            		
            // InternalPerfectML.g:2460:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalPerfectML.g:2461:4: (lv_value_1_0= RULE_INT )
            {
            // InternalPerfectML.g:2461:4: (lv_value_1_0= RULE_INT )
            // InternalPerfectML.g:2462:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_72); 

            					newLeafNode(lv_value_1_0, grammarAccess.getTrainingAmountAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainingAmountRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPerfectML.g:2478:3: ( ( (lv_percent_2_0= '%' ) ) | (otherlv_3= 'lines' otherlv_4= 'of' ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==97) ) {
                alt58=1;
            }
            else if ( (LA58_0==98) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalPerfectML.g:2479:4: ( (lv_percent_2_0= '%' ) )
                    {
                    // InternalPerfectML.g:2479:4: ( (lv_percent_2_0= '%' ) )
                    // InternalPerfectML.g:2480:5: (lv_percent_2_0= '%' )
                    {
                    // InternalPerfectML.g:2480:5: (lv_percent_2_0= '%' )
                    // InternalPerfectML.g:2481:6: lv_percent_2_0= '%'
                    {
                    lv_percent_2_0=(Token)match(input,97,FOLLOW_73); 

                    						newLeafNode(lv_percent_2_0, grammarAccess.getTrainingAmountAccess().getPercentPercentSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTrainingAmountRule());
                    						}
                    						setWithLastConsumed(current, "percent", lv_percent_2_0 != null, "%");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:2494:4: (otherlv_3= 'lines' otherlv_4= 'of' )
                    {
                    // InternalPerfectML.g:2494:4: (otherlv_3= 'lines' otherlv_4= 'of' )
                    // InternalPerfectML.g:2495:5: otherlv_3= 'lines' otherlv_4= 'of'
                    {
                    otherlv_3=(Token)match(input,98,FOLLOW_74); 

                    					newLeafNode(otherlv_3, grammarAccess.getTrainingAmountAccess().getLinesKeyword_2_1_0());
                    				
                    otherlv_4=(Token)match(input,99,FOLLOW_73); 

                    					newLeafNode(otherlv_4, grammarAccess.getTrainingAmountAccess().getOfKeyword_2_1_1());
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,100,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTrainingAmountAccess().getTrainingKeyword_3());
            		

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
    // $ANTLR end "ruleTrainingAmount"


    // $ANTLR start "entryRuleColumnDeclarations"
    // InternalPerfectML.g:2513:1: entryRuleColumnDeclarations returns [EObject current=null] : iv_ruleColumnDeclarations= ruleColumnDeclarations EOF ;
    public final EObject entryRuleColumnDeclarations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDeclarations = null;


        try {
            // InternalPerfectML.g:2513:59: (iv_ruleColumnDeclarations= ruleColumnDeclarations EOF )
            // InternalPerfectML.g:2514:2: iv_ruleColumnDeclarations= ruleColumnDeclarations EOF
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
    // InternalPerfectML.g:2520:1: ruleColumnDeclarations returns [EObject current=null] : ( () otherlv_1= 'Use' otherlv_2= 'columns' otherlv_3= ':' ( ( (lv_target_4_0= ruleColumnSet ) ) otherlv_5= 'as' ( (lv_target_def_6_0= 'target' ) ) ) ( ( (lv_predictive_7_0= ruleColumnSet ) ) otherlv_8= 'as' ( (lv_pred_def_9_0= 'predictive' ) ) )? ) ;
    public final EObject ruleColumnDeclarations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_target_def_6_0=null;
        Token otherlv_8=null;
        Token lv_pred_def_9_0=null;
        EObject lv_target_4_0 = null;

        EObject lv_predictive_7_0 = null;



        	enterRule();

        try {
            // InternalPerfectML.g:2526:2: ( ( () otherlv_1= 'Use' otherlv_2= 'columns' otherlv_3= ':' ( ( (lv_target_4_0= ruleColumnSet ) ) otherlv_5= 'as' ( (lv_target_def_6_0= 'target' ) ) ) ( ( (lv_predictive_7_0= ruleColumnSet ) ) otherlv_8= 'as' ( (lv_pred_def_9_0= 'predictive' ) ) )? ) )
            // InternalPerfectML.g:2527:2: ( () otherlv_1= 'Use' otherlv_2= 'columns' otherlv_3= ':' ( ( (lv_target_4_0= ruleColumnSet ) ) otherlv_5= 'as' ( (lv_target_def_6_0= 'target' ) ) ) ( ( (lv_predictive_7_0= ruleColumnSet ) ) otherlv_8= 'as' ( (lv_pred_def_9_0= 'predictive' ) ) )? )
            {
            // InternalPerfectML.g:2527:2: ( () otherlv_1= 'Use' otherlv_2= 'columns' otherlv_3= ':' ( ( (lv_target_4_0= ruleColumnSet ) ) otherlv_5= 'as' ( (lv_target_def_6_0= 'target' ) ) ) ( ( (lv_predictive_7_0= ruleColumnSet ) ) otherlv_8= 'as' ( (lv_pred_def_9_0= 'predictive' ) ) )? )
            // InternalPerfectML.g:2528:3: () otherlv_1= 'Use' otherlv_2= 'columns' otherlv_3= ':' ( ( (lv_target_4_0= ruleColumnSet ) ) otherlv_5= 'as' ( (lv_target_def_6_0= 'target' ) ) ) ( ( (lv_predictive_7_0= ruleColumnSet ) ) otherlv_8= 'as' ( (lv_pred_def_9_0= 'predictive' ) ) )?
            {
            // InternalPerfectML.g:2528:3: ()
            // InternalPerfectML.g:2529:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnDeclarationsAccess().getColumnDeclarationsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnDeclarationsAccess().getUseKeyword_1());
            		
            otherlv_2=(Token)match(input,101,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnDeclarationsAccess().getColumnsKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_76); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnDeclarationsAccess().getColonKeyword_3());
            		
            // InternalPerfectML.g:2547:3: ( ( (lv_target_4_0= ruleColumnSet ) ) otherlv_5= 'as' ( (lv_target_def_6_0= 'target' ) ) )
            // InternalPerfectML.g:2548:4: ( (lv_target_4_0= ruleColumnSet ) ) otherlv_5= 'as' ( (lv_target_def_6_0= 'target' ) )
            {
            // InternalPerfectML.g:2548:4: ( (lv_target_4_0= ruleColumnSet ) )
            // InternalPerfectML.g:2549:5: (lv_target_4_0= ruleColumnSet )
            {
            // InternalPerfectML.g:2549:5: (lv_target_4_0= ruleColumnSet )
            // InternalPerfectML.g:2550:6: lv_target_4_0= ruleColumnSet
            {

            						newCompositeNode(grammarAccess.getColumnDeclarationsAccess().getTargetColumnSetParserRuleCall_4_0_0());
            					
            pushFollow(FOLLOW_77);
            lv_target_4_0=ruleColumnSet();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getColumnDeclarationsRule());
            						}
            						set(
            							current,
            							"target",
            							lv_target_4_0,
            							"org.xtext.example.perfectML.PerfectML.ColumnSet");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,102,FOLLOW_78); 

            				newLeafNode(otherlv_5, grammarAccess.getColumnDeclarationsAccess().getAsKeyword_4_1());
            			
            // InternalPerfectML.g:2571:4: ( (lv_target_def_6_0= 'target' ) )
            // InternalPerfectML.g:2572:5: (lv_target_def_6_0= 'target' )
            {
            // InternalPerfectML.g:2572:5: (lv_target_def_6_0= 'target' )
            // InternalPerfectML.g:2573:6: lv_target_def_6_0= 'target'
            {
            lv_target_def_6_0=(Token)match(input,103,FOLLOW_79); 

            						newLeafNode(lv_target_def_6_0, grammarAccess.getColumnDeclarationsAccess().getTarget_defTargetKeyword_4_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getColumnDeclarationsRule());
            						}
            						setWithLastConsumed(current, "target_def", lv_target_def_6_0 != null, "target");
            					

            }


            }


            }

            // InternalPerfectML.g:2586:3: ( ( (lv_predictive_7_0= ruleColumnSet ) ) otherlv_8= 'as' ( (lv_pred_def_9_0= 'predictive' ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==22||LA59_0==105||LA59_0==107) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalPerfectML.g:2587:4: ( (lv_predictive_7_0= ruleColumnSet ) ) otherlv_8= 'as' ( (lv_pred_def_9_0= 'predictive' ) )
                    {
                    // InternalPerfectML.g:2587:4: ( (lv_predictive_7_0= ruleColumnSet ) )
                    // InternalPerfectML.g:2588:5: (lv_predictive_7_0= ruleColumnSet )
                    {
                    // InternalPerfectML.g:2588:5: (lv_predictive_7_0= ruleColumnSet )
                    // InternalPerfectML.g:2589:6: lv_predictive_7_0= ruleColumnSet
                    {

                    						newCompositeNode(grammarAccess.getColumnDeclarationsAccess().getPredictiveColumnSetParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_77);
                    lv_predictive_7_0=ruleColumnSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnDeclarationsRule());
                    						}
                    						set(
                    							current,
                    							"predictive",
                    							lv_predictive_7_0,
                    							"org.xtext.example.perfectML.PerfectML.ColumnSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,102,FOLLOW_80); 

                    				newLeafNode(otherlv_8, grammarAccess.getColumnDeclarationsAccess().getAsKeyword_5_1());
                    			
                    // InternalPerfectML.g:2610:4: ( (lv_pred_def_9_0= 'predictive' ) )
                    // InternalPerfectML.g:2611:5: (lv_pred_def_9_0= 'predictive' )
                    {
                    // InternalPerfectML.g:2611:5: (lv_pred_def_9_0= 'predictive' )
                    // InternalPerfectML.g:2612:6: lv_pred_def_9_0= 'predictive'
                    {
                    lv_pred_def_9_0=(Token)match(input,104,FOLLOW_2); 

                    						newLeafNode(lv_pred_def_9_0, grammarAccess.getColumnDeclarationsAccess().getPred_defPredictiveKeyword_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnDeclarationsRule());
                    						}
                    						setWithLastConsumed(current, "pred_def", lv_pred_def_9_0 != null, "predictive");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleColumnDeclarations"


    // $ANTLR start "entryRuleColumnSet"
    // InternalPerfectML.g:2629:1: entryRuleColumnSet returns [EObject current=null] : iv_ruleColumnSet= ruleColumnSet EOF ;
    public final EObject entryRuleColumnSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnSet = null;


        try {
            // InternalPerfectML.g:2629:50: (iv_ruleColumnSet= ruleColumnSet EOF )
            // InternalPerfectML.g:2630:2: iv_ruleColumnSet= ruleColumnSet EOF
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
    // InternalPerfectML.g:2636:1: ruleColumnSet returns [EObject current=null] : ( ( ( (lv_op_0_0= '(' ) ) ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')' ) | ( ( (lv_range_7_0= 'From' ) ) ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) ) ) | ( ( (lv_list_11_0= '[' ) ) ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']' ) ) ;
    public final EObject ruleColumnSet() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_range_7_0=null;
        Token lv_ArgR1_8_0=null;
        Token otherlv_9=null;
        Token lv_ArgR2_10_0=null;
        Token lv_list_11_0=null;
        Token lv_ArgList_12_0=null;
        Token otherlv_13=null;
        Token lv_ArgList_14_0=null;
        Token otherlv_15=null;
        EObject lv_ArgBin1_1_0 = null;

        EObject lv_opType_3_0 = null;

        EObject lv_ArgBin2_5_0 = null;



        	enterRule();

        try {
            // InternalPerfectML.g:2642:2: ( ( ( ( (lv_op_0_0= '(' ) ) ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')' ) | ( ( (lv_range_7_0= 'From' ) ) ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) ) ) | ( ( (lv_list_11_0= '[' ) ) ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']' ) ) )
            // InternalPerfectML.g:2643:2: ( ( ( (lv_op_0_0= '(' ) ) ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')' ) | ( ( (lv_range_7_0= 'From' ) ) ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) ) ) | ( ( (lv_list_11_0= '[' ) ) ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']' ) )
            {
            // InternalPerfectML.g:2643:2: ( ( ( (lv_op_0_0= '(' ) ) ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')' ) | ( ( (lv_range_7_0= 'From' ) ) ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) ) ) | ( ( (lv_list_11_0= '[' ) ) ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']' ) )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt61=1;
                }
                break;
            case 105:
                {
                alt61=2;
                }
                break;
            case 107:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalPerfectML.g:2644:3: ( ( (lv_op_0_0= '(' ) ) ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')' )
                    {
                    // InternalPerfectML.g:2644:3: ( ( (lv_op_0_0= '(' ) ) ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')' )
                    // InternalPerfectML.g:2645:4: ( (lv_op_0_0= '(' ) ) ( (lv_ArgBin1_1_0= ruleColumnSet ) ) otherlv_2= ')' ( (lv_opType_3_0= ruleBinop ) ) otherlv_4= '(' ( (lv_ArgBin2_5_0= ruleColumnSet ) ) otherlv_6= ')'
                    {
                    // InternalPerfectML.g:2645:4: ( (lv_op_0_0= '(' ) )
                    // InternalPerfectML.g:2646:5: (lv_op_0_0= '(' )
                    {
                    // InternalPerfectML.g:2646:5: (lv_op_0_0= '(' )
                    // InternalPerfectML.g:2647:6: lv_op_0_0= '('
                    {
                    lv_op_0_0=(Token)match(input,22,FOLLOW_76); 

                    						newLeafNode(lv_op_0_0, grammarAccess.getColumnSetAccess().getOpLeftParenthesisKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnSetRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_0_0 != null, "(");
                    					

                    }


                    }

                    // InternalPerfectML.g:2659:4: ( (lv_ArgBin1_1_0= ruleColumnSet ) )
                    // InternalPerfectML.g:2660:5: (lv_ArgBin1_1_0= ruleColumnSet )
                    {
                    // InternalPerfectML.g:2660:5: (lv_ArgBin1_1_0= ruleColumnSet )
                    // InternalPerfectML.g:2661:6: lv_ArgBin1_1_0= ruleColumnSet
                    {

                    						newCompositeNode(grammarAccess.getColumnSetAccess().getArgBin1ColumnSetParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    lv_ArgBin1_1_0=ruleColumnSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnSetRule());
                    						}
                    						set(
                    							current,
                    							"ArgBin1",
                    							lv_ArgBin1_1_0,
                    							"org.xtext.example.perfectML.PerfectML.ColumnSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_82); 

                    				newLeafNode(otherlv_2, grammarAccess.getColumnSetAccess().getRightParenthesisKeyword_0_2());
                    			
                    // InternalPerfectML.g:2682:4: ( (lv_opType_3_0= ruleBinop ) )
                    // InternalPerfectML.g:2683:5: (lv_opType_3_0= ruleBinop )
                    {
                    // InternalPerfectML.g:2683:5: (lv_opType_3_0= ruleBinop )
                    // InternalPerfectML.g:2684:6: lv_opType_3_0= ruleBinop
                    {

                    						newCompositeNode(grammarAccess.getColumnSetAccess().getOpTypeBinopParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_opType_3_0=ruleBinop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnSetRule());
                    						}
                    						set(
                    							current,
                    							"opType",
                    							lv_opType_3_0,
                    							"org.xtext.example.perfectML.PerfectML.Binop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_76); 

                    				newLeafNode(otherlv_4, grammarAccess.getColumnSetAccess().getLeftParenthesisKeyword_0_4());
                    			
                    // InternalPerfectML.g:2705:4: ( (lv_ArgBin2_5_0= ruleColumnSet ) )
                    // InternalPerfectML.g:2706:5: (lv_ArgBin2_5_0= ruleColumnSet )
                    {
                    // InternalPerfectML.g:2706:5: (lv_ArgBin2_5_0= ruleColumnSet )
                    // InternalPerfectML.g:2707:6: lv_ArgBin2_5_0= ruleColumnSet
                    {

                    						newCompositeNode(grammarAccess.getColumnSetAccess().getArgBin2ColumnSetParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_81);
                    lv_ArgBin2_5_0=ruleColumnSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnSetRule());
                    						}
                    						set(
                    							current,
                    							"ArgBin2",
                    							lv_ArgBin2_5_0,
                    							"org.xtext.example.perfectML.PerfectML.ColumnSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnSetAccess().getRightParenthesisKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:2730:3: ( ( (lv_range_7_0= 'From' ) ) ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) ) )
                    {
                    // InternalPerfectML.g:2730:3: ( ( (lv_range_7_0= 'From' ) ) ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) ) )
                    // InternalPerfectML.g:2731:4: ( (lv_range_7_0= 'From' ) ) ( (lv_ArgR1_8_0= RULE_INT ) ) otherlv_9= 'to' ( (lv_ArgR2_10_0= RULE_INT ) )
                    {
                    // InternalPerfectML.g:2731:4: ( (lv_range_7_0= 'From' ) )
                    // InternalPerfectML.g:2732:5: (lv_range_7_0= 'From' )
                    {
                    // InternalPerfectML.g:2732:5: (lv_range_7_0= 'From' )
                    // InternalPerfectML.g:2733:6: lv_range_7_0= 'From'
                    {
                    lv_range_7_0=(Token)match(input,105,FOLLOW_17); 

                    						newLeafNode(lv_range_7_0, grammarAccess.getColumnSetAccess().getRangeFromKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnSetRule());
                    						}
                    						setWithLastConsumed(current, "range", lv_range_7_0 != null, "From");
                    					

                    }


                    }

                    // InternalPerfectML.g:2745:4: ( (lv_ArgR1_8_0= RULE_INT ) )
                    // InternalPerfectML.g:2746:5: (lv_ArgR1_8_0= RULE_INT )
                    {
                    // InternalPerfectML.g:2746:5: (lv_ArgR1_8_0= RULE_INT )
                    // InternalPerfectML.g:2747:6: lv_ArgR1_8_0= RULE_INT
                    {
                    lv_ArgR1_8_0=(Token)match(input,RULE_INT,FOLLOW_83); 

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

                    otherlv_9=(Token)match(input,106,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getColumnSetAccess().getToKeyword_1_2());
                    			
                    // InternalPerfectML.g:2767:4: ( (lv_ArgR2_10_0= RULE_INT ) )
                    // InternalPerfectML.g:2768:5: (lv_ArgR2_10_0= RULE_INT )
                    {
                    // InternalPerfectML.g:2768:5: (lv_ArgR2_10_0= RULE_INT )
                    // InternalPerfectML.g:2769:6: lv_ArgR2_10_0= RULE_INT
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
                    // InternalPerfectML.g:2787:3: ( ( (lv_list_11_0= '[' ) ) ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']' )
                    {
                    // InternalPerfectML.g:2787:3: ( ( (lv_list_11_0= '[' ) ) ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']' )
                    // InternalPerfectML.g:2788:4: ( (lv_list_11_0= '[' ) ) ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )* ( (lv_ArgList_14_0= RULE_INT ) ) otherlv_15= ']'
                    {
                    // InternalPerfectML.g:2788:4: ( (lv_list_11_0= '[' ) )
                    // InternalPerfectML.g:2789:5: (lv_list_11_0= '[' )
                    {
                    // InternalPerfectML.g:2789:5: (lv_list_11_0= '[' )
                    // InternalPerfectML.g:2790:6: lv_list_11_0= '['
                    {
                    lv_list_11_0=(Token)match(input,107,FOLLOW_17); 

                    						newLeafNode(lv_list_11_0, grammarAccess.getColumnSetAccess().getListLeftSquareBracketKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnSetRule());
                    						}
                    						setWithLastConsumed(current, "list", lv_list_11_0 != null, "[");
                    					

                    }


                    }

                    // InternalPerfectML.g:2802:4: ( ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ',' )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_INT) ) {
                            int LA60_1 = input.LA(2);

                            if ( (LA60_1==23) ) {
                                alt60=1;
                            }


                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalPerfectML.g:2803:5: ( (lv_ArgList_12_0= RULE_INT ) ) otherlv_13= ','
                    	    {
                    	    // InternalPerfectML.g:2803:5: ( (lv_ArgList_12_0= RULE_INT ) )
                    	    // InternalPerfectML.g:2804:6: (lv_ArgList_12_0= RULE_INT )
                    	    {
                    	    // InternalPerfectML.g:2804:6: (lv_ArgList_12_0= RULE_INT )
                    	    // InternalPerfectML.g:2805:7: lv_ArgList_12_0= RULE_INT
                    	    {
                    	    lv_ArgList_12_0=(Token)match(input,RULE_INT,FOLLOW_84); 

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

                    	    otherlv_13=(Token)match(input,23,FOLLOW_17); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getColumnSetAccess().getCommaKeyword_2_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    // InternalPerfectML.g:2826:4: ( (lv_ArgList_14_0= RULE_INT ) )
                    // InternalPerfectML.g:2827:5: (lv_ArgList_14_0= RULE_INT )
                    {
                    // InternalPerfectML.g:2827:5: (lv_ArgList_14_0= RULE_INT )
                    // InternalPerfectML.g:2828:6: lv_ArgList_14_0= RULE_INT
                    {
                    lv_ArgList_14_0=(Token)match(input,RULE_INT,FOLLOW_85); 

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

                    otherlv_15=(Token)match(input,108,FOLLOW_2); 

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
    // InternalPerfectML.g:2853:1: entryRuleBinop returns [EObject current=null] : iv_ruleBinop= ruleBinop EOF ;
    public final EObject entryRuleBinop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinop = null;


        try {
            // InternalPerfectML.g:2853:46: (iv_ruleBinop= ruleBinop EOF )
            // InternalPerfectML.g:2854:2: iv_ruleBinop= ruleBinop EOF
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
    // InternalPerfectML.g:2860:1: ruleBinop returns [EObject current=null] : ( ( (lv_type_0_0= 'and' ) ) | ( (lv_type_1_0= 'except' ) ) ) ;
    public final EObject ruleBinop() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalPerfectML.g:2866:2: ( ( ( (lv_type_0_0= 'and' ) ) | ( (lv_type_1_0= 'except' ) ) ) )
            // InternalPerfectML.g:2867:2: ( ( (lv_type_0_0= 'and' ) ) | ( (lv_type_1_0= 'except' ) ) )
            {
            // InternalPerfectML.g:2867:2: ( ( (lv_type_0_0= 'and' ) ) | ( (lv_type_1_0= 'except' ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==109) ) {
                alt62=1;
            }
            else if ( (LA62_0==110) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalPerfectML.g:2868:3: ( (lv_type_0_0= 'and' ) )
                    {
                    // InternalPerfectML.g:2868:3: ( (lv_type_0_0= 'and' ) )
                    // InternalPerfectML.g:2869:4: (lv_type_0_0= 'and' )
                    {
                    // InternalPerfectML.g:2869:4: (lv_type_0_0= 'and' )
                    // InternalPerfectML.g:2870:5: lv_type_0_0= 'and'
                    {
                    lv_type_0_0=(Token)match(input,109,FOLLOW_2); 

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
                    // InternalPerfectML.g:2883:3: ( (lv_type_1_0= 'except' ) )
                    {
                    // InternalPerfectML.g:2883:3: ( (lv_type_1_0= 'except' ) )
                    // InternalPerfectML.g:2884:4: (lv_type_1_0= 'except' )
                    {
                    // InternalPerfectML.g:2884:4: (lv_type_1_0= 'except' )
                    // InternalPerfectML.g:2885:5: lv_type_1_0= 'except'
                    {
                    lv_type_1_0=(Token)match(input,110,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFLOAT"
    // InternalPerfectML.g:2901:1: entryRuleFLOAT returns [EObject current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final EObject entryRuleFLOAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFLOAT = null;


        try {
            // InternalPerfectML.g:2901:46: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalPerfectML.g:2902:2: iv_ruleFLOAT= ruleFLOAT EOF
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
    // InternalPerfectML.g:2908:1: ruleFLOAT returns [EObject current=null] : ( ( (lv_IntPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_DecPart_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFLOAT() throws RecognitionException {
        EObject current = null;

        Token lv_IntPart_0_0=null;
        Token otherlv_1=null;
        Token lv_DecPart_2_0=null;


        	enterRule();

        try {
            // InternalPerfectML.g:2914:2: ( ( ( (lv_IntPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_DecPart_2_0= RULE_INT ) ) ) )
            // InternalPerfectML.g:2915:2: ( ( (lv_IntPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_DecPart_2_0= RULE_INT ) ) )
            {
            // InternalPerfectML.g:2915:2: ( ( (lv_IntPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_DecPart_2_0= RULE_INT ) ) )
            // InternalPerfectML.g:2916:3: ( (lv_IntPart_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_DecPart_2_0= RULE_INT ) )
            {
            // InternalPerfectML.g:2916:3: ( (lv_IntPart_0_0= RULE_INT ) )
            // InternalPerfectML.g:2917:4: (lv_IntPart_0_0= RULE_INT )
            {
            // InternalPerfectML.g:2917:4: (lv_IntPart_0_0= RULE_INT )
            // InternalPerfectML.g:2918:5: lv_IntPart_0_0= RULE_INT
            {
            lv_IntPart_0_0=(Token)match(input,RULE_INT,FOLLOW_86); 

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

            otherlv_1=(Token)match(input,111,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            // InternalPerfectML.g:2938:3: ( (lv_DecPart_2_0= RULE_INT ) )
            // InternalPerfectML.g:2939:4: (lv_DecPart_2_0= RULE_INT )
            {
            // InternalPerfectML.g:2939:4: (lv_DecPart_2_0= RULE_INT )
            // InternalPerfectML.g:2940:5: lv_DecPart_2_0= RULE_INT
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
    // InternalPerfectML.g:2960:1: entryRuleBOOL returns [EObject current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final EObject entryRuleBOOL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOL = null;


        try {
            // InternalPerfectML.g:2960:45: (iv_ruleBOOL= ruleBOOL EOF )
            // InternalPerfectML.g:2961:2: iv_ruleBOOL= ruleBOOL EOF
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
    // InternalPerfectML.g:2967:1: ruleBOOL returns [EObject current=null] : ( ( (lv_value_0_0= 'True' ) ) | ( (lv_value_1_0= 'False' ) ) ) ;
    public final EObject ruleBOOL() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalPerfectML.g:2973:2: ( ( ( (lv_value_0_0= 'True' ) ) | ( (lv_value_1_0= 'False' ) ) ) )
            // InternalPerfectML.g:2974:2: ( ( (lv_value_0_0= 'True' ) ) | ( (lv_value_1_0= 'False' ) ) )
            {
            // InternalPerfectML.g:2974:2: ( ( (lv_value_0_0= 'True' ) ) | ( (lv_value_1_0= 'False' ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==112) ) {
                alt63=1;
            }
            else if ( (LA63_0==113) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalPerfectML.g:2975:3: ( (lv_value_0_0= 'True' ) )
                    {
                    // InternalPerfectML.g:2975:3: ( (lv_value_0_0= 'True' ) )
                    // InternalPerfectML.g:2976:4: (lv_value_0_0= 'True' )
                    {
                    // InternalPerfectML.g:2976:4: (lv_value_0_0= 'True' )
                    // InternalPerfectML.g:2977:5: lv_value_0_0= 'True'
                    {
                    lv_value_0_0=(Token)match(input,112,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getBOOLAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBOOLRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_0, "True");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:2990:3: ( (lv_value_1_0= 'False' ) )
                    {
                    // InternalPerfectML.g:2990:3: ( (lv_value_1_0= 'False' ) )
                    // InternalPerfectML.g:2991:4: (lv_value_1_0= 'False' )
                    {
                    // InternalPerfectML.g:2991:4: (lv_value_1_0= 'False' )
                    // InternalPerfectML.g:2992:5: lv_value_1_0= 'False'
                    {
                    lv_value_1_0=(Token)match(input,113,FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getBOOLAccess().getValueFalseKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBOOLRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_1_0, "False");
                    				

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0200000000040000L,0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x01FFFF1C42100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x01FFFF1C42000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x01FFFF1C40000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x01FFFF1C00000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x01FFFF1800000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x01FFFF1000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x01FFFF0000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x01FFFE0000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x01FFFC0000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x01FFF80000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x01FFF00000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x01FFE00000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x01FFC00000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x01FF800000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x01FF000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x01FE000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x01FC000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x01F8000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x01F0000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x01E0000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0C00740000000002L,0x00000000000013E6L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800740000000002L,0x00000000000013E6L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000740000000002L,0x00000000000013E6L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000740000000002L,0x00000000000013E4L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000740000000002L,0x00000000000013E0L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000740000000002L,0x00000000000013C0L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000740000000002L,0x0000000000001380L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000740000000002L,0x0000000000001300L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000540000000002L,0x0000000000001300L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000540000000002L,0x0000000000001200L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000140000000002L,0x0000000000001200L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000100000000002L,0x0000000000001200L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000100000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000101C4C000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x0000000101C48000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000002L,0x0000000101C40000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000380010L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000000101C00000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000101800000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000000101000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x00000000FE000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000400000L,0x00000A0000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000400002L,0x00000A0000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});

}