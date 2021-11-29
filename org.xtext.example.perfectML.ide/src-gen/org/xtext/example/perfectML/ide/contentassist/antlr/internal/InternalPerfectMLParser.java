package org.xtext.example.perfectML.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.perfectML.services.PerfectMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPerfectMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'identity'", "'logistic'", "'tanh'", "'relu'", "'lbfgs'", "'sgd'", "'adam'", "'constant'", "'invscaling'", "'adaptive'", "'rbf'", "'poly'", "'linear'", "'sigmoid'", "'precomputed'", "'scale'", "'auto'", "'ovo'", "'ovr'", "'uniform'", "'distance'", "'ball_tree'", "'kd_tree'", "'brute'", "'mahalanobis'", "'seuclidean'", "'wminkowski'", "'minkowski'", "'chebyshev'", "'manhattan'", "'euclidean'", "';'", "'Use'", "'source'", "'data'", "':'", "'output'", "'file'", "'MLPClassifier'", "'with'", "'='", "'('", "')'", "','", "'SVC'", "'KNeighborsClassifier'", "'training'", "'lines'", "'of'", "'columns'", "'as'", "'to'", "']'", "'.'", "'hidden_layer_sizes'", "'activation'", "'solver'", "'alpha'", "'batch_size'", "'learning_rate'", "'learning_rate_init'", "'power_t'", "'max_iter'", "'shuffle'", "'random_state'", "'tolerance'", "'verbose'", "'warm_start'", "'momentum'", "'nesterovs_momentum'", "'early_stopping'", "'validation_fraction'", "'beta_1'", "'beta_2'", "'epsilon'", "'n_iter_no_change'", "'max_fun'", "'C'", "'kernel'", "'degree'", "'gamma'", "'coef0'", "'shrinking'", "'probability'", "'cache_size'", "'decision_function_shape'", "'break_ties'", "'n_neighbors'", "'weights'", "'algorithm'", "'leaf_size'", "'p'", "'metric'", "'n_jobs'", "'%'", "'target'", "'predictive'", "'From'", "'['", "'and'", "'except'", "'True'", "'False'"
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

    	public void setGrammarAccess(PerfectMLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePerfectMLFile"
    // InternalPerfectML.g:53:1: entryRulePerfectMLFile : rulePerfectMLFile EOF ;
    public final void entryRulePerfectMLFile() throws RecognitionException {
        try {
            // InternalPerfectML.g:54:1: ( rulePerfectMLFile EOF )
            // InternalPerfectML.g:55:1: rulePerfectMLFile EOF
            {
             before(grammarAccess.getPerfectMLFileRule()); 
            pushFollow(FOLLOW_1);
            rulePerfectMLFile();

            state._fsp--;

             after(grammarAccess.getPerfectMLFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerfectMLFile"


    // $ANTLR start "rulePerfectMLFile"
    // InternalPerfectML.g:62:1: rulePerfectMLFile : ( ( ( rule__PerfectMLFile__Group__0 ) ) ( ( rule__PerfectMLFile__Group__0 )* ) ) ;
    public final void rulePerfectMLFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:66:2: ( ( ( ( rule__PerfectMLFile__Group__0 ) ) ( ( rule__PerfectMLFile__Group__0 )* ) ) )
            // InternalPerfectML.g:67:2: ( ( ( rule__PerfectMLFile__Group__0 ) ) ( ( rule__PerfectMLFile__Group__0 )* ) )
            {
            // InternalPerfectML.g:67:2: ( ( ( rule__PerfectMLFile__Group__0 ) ) ( ( rule__PerfectMLFile__Group__0 )* ) )
            // InternalPerfectML.g:68:3: ( ( rule__PerfectMLFile__Group__0 ) ) ( ( rule__PerfectMLFile__Group__0 )* )
            {
            // InternalPerfectML.g:68:3: ( ( rule__PerfectMLFile__Group__0 ) )
            // InternalPerfectML.g:69:4: ( rule__PerfectMLFile__Group__0 )
            {
             before(grammarAccess.getPerfectMLFileAccess().getGroup()); 
            // InternalPerfectML.g:70:4: ( rule__PerfectMLFile__Group__0 )
            // InternalPerfectML.g:70:5: rule__PerfectMLFile__Group__0
            {
            pushFollow(FOLLOW_3);
            rule__PerfectMLFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerfectMLFileAccess().getGroup()); 

            }

            // InternalPerfectML.g:73:3: ( ( rule__PerfectMLFile__Group__0 )* )
            // InternalPerfectML.g:74:4: ( rule__PerfectMLFile__Group__0 )*
            {
             before(grammarAccess.getPerfectMLFileAccess().getGroup()); 
            // InternalPerfectML.g:75:4: ( rule__PerfectMLFile__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==43) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPerfectML.g:75:5: rule__PerfectMLFile__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PerfectMLFile__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPerfectMLFileAccess().getGroup()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerfectMLFile"


    // $ANTLR start "entryRuleProgram"
    // InternalPerfectML.g:85:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalPerfectML.g:86:1: ( ruleProgram EOF )
            // InternalPerfectML.g:87:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalPerfectML.g:94:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:98:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalPerfectML.g:99:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalPerfectML.g:99:2: ( ( rule__Program__Group__0 ) )
            // InternalPerfectML.g:100:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalPerfectML.g:101:3: ( rule__Program__Group__0 )
            // InternalPerfectML.g:101:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleInput"
    // InternalPerfectML.g:110:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalPerfectML.g:111:1: ( ruleInput EOF )
            // InternalPerfectML.g:112:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalPerfectML.g:119:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:123:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalPerfectML.g:124:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalPerfectML.g:124:2: ( ( rule__Input__Group__0 ) )
            // InternalPerfectML.g:125:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalPerfectML.g:126:3: ( rule__Input__Group__0 )
            // InternalPerfectML.g:126:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalPerfectML.g:135:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalPerfectML.g:136:1: ( ruleOutput EOF )
            // InternalPerfectML.g:137:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalPerfectML.g:144:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:148:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalPerfectML.g:149:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalPerfectML.g:149:2: ( ( rule__Output__Group__0 ) )
            // InternalPerfectML.g:150:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalPerfectML.g:151:3: ( rule__Output__Group__0 )
            // InternalPerfectML.g:151:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleAlgorithm"
    // InternalPerfectML.g:160:1: entryRuleAlgorithm : ruleAlgorithm EOF ;
    public final void entryRuleAlgorithm() throws RecognitionException {
        try {
            // InternalPerfectML.g:161:1: ( ruleAlgorithm EOF )
            // InternalPerfectML.g:162:1: ruleAlgorithm EOF
            {
             before(grammarAccess.getAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgorithm();

            state._fsp--;

             after(grammarAccess.getAlgorithmRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlgorithm"


    // $ANTLR start "ruleAlgorithm"
    // InternalPerfectML.g:169:1: ruleAlgorithm : ( ( rule__Algorithm__Group__0 ) ) ;
    public final void ruleAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:173:2: ( ( ( rule__Algorithm__Group__0 ) ) )
            // InternalPerfectML.g:174:2: ( ( rule__Algorithm__Group__0 ) )
            {
            // InternalPerfectML.g:174:2: ( ( rule__Algorithm__Group__0 ) )
            // InternalPerfectML.g:175:3: ( rule__Algorithm__Group__0 )
            {
             before(grammarAccess.getAlgorithmAccess().getGroup()); 
            // InternalPerfectML.g:176:3: ( rule__Algorithm__Group__0 )
            // InternalPerfectML.g:176:4: rule__Algorithm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "entryRuleMLPClassifier"
    // InternalPerfectML.g:185:1: entryRuleMLPClassifier : ruleMLPClassifier EOF ;
    public final void entryRuleMLPClassifier() throws RecognitionException {
        try {
            // InternalPerfectML.g:186:1: ( ruleMLPClassifier EOF )
            // InternalPerfectML.g:187:1: ruleMLPClassifier EOF
            {
             before(grammarAccess.getMLPClassifierRule()); 
            pushFollow(FOLLOW_1);
            ruleMLPClassifier();

            state._fsp--;

             after(grammarAccess.getMLPClassifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMLPClassifier"


    // $ANTLR start "ruleMLPClassifier"
    // InternalPerfectML.g:194:1: ruleMLPClassifier : ( ( rule__MLPClassifier__Group__0 ) ) ;
    public final void ruleMLPClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:198:2: ( ( ( rule__MLPClassifier__Group__0 ) ) )
            // InternalPerfectML.g:199:2: ( ( rule__MLPClassifier__Group__0 ) )
            {
            // InternalPerfectML.g:199:2: ( ( rule__MLPClassifier__Group__0 ) )
            // InternalPerfectML.g:200:3: ( rule__MLPClassifier__Group__0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup()); 
            // InternalPerfectML.g:201:3: ( rule__MLPClassifier__Group__0 )
            // InternalPerfectML.g:201:4: rule__MLPClassifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMLPClassifier"


    // $ANTLR start "entryRuleSVC"
    // InternalPerfectML.g:210:1: entryRuleSVC : ruleSVC EOF ;
    public final void entryRuleSVC() throws RecognitionException {
        try {
            // InternalPerfectML.g:211:1: ( ruleSVC EOF )
            // InternalPerfectML.g:212:1: ruleSVC EOF
            {
             before(grammarAccess.getSVCRule()); 
            pushFollow(FOLLOW_1);
            ruleSVC();

            state._fsp--;

             after(grammarAccess.getSVCRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSVC"


    // $ANTLR start "ruleSVC"
    // InternalPerfectML.g:219:1: ruleSVC : ( ( rule__SVC__Group__0 ) ) ;
    public final void ruleSVC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:223:2: ( ( ( rule__SVC__Group__0 ) ) )
            // InternalPerfectML.g:224:2: ( ( rule__SVC__Group__0 ) )
            {
            // InternalPerfectML.g:224:2: ( ( rule__SVC__Group__0 ) )
            // InternalPerfectML.g:225:3: ( rule__SVC__Group__0 )
            {
             before(grammarAccess.getSVCAccess().getGroup()); 
            // InternalPerfectML.g:226:3: ( rule__SVC__Group__0 )
            // InternalPerfectML.g:226:4: rule__SVC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSVC"


    // $ANTLR start "entryRuleKNeighborsClassifier"
    // InternalPerfectML.g:235:1: entryRuleKNeighborsClassifier : ruleKNeighborsClassifier EOF ;
    public final void entryRuleKNeighborsClassifier() throws RecognitionException {
        try {
            // InternalPerfectML.g:236:1: ( ruleKNeighborsClassifier EOF )
            // InternalPerfectML.g:237:1: ruleKNeighborsClassifier EOF
            {
             before(grammarAccess.getKNeighborsClassifierRule()); 
            pushFollow(FOLLOW_1);
            ruleKNeighborsClassifier();

            state._fsp--;

             after(grammarAccess.getKNeighborsClassifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKNeighborsClassifier"


    // $ANTLR start "ruleKNeighborsClassifier"
    // InternalPerfectML.g:244:1: ruleKNeighborsClassifier : ( ( rule__KNeighborsClassifier__Group__0 ) ) ;
    public final void ruleKNeighborsClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:248:2: ( ( ( rule__KNeighborsClassifier__Group__0 ) ) )
            // InternalPerfectML.g:249:2: ( ( rule__KNeighborsClassifier__Group__0 ) )
            {
            // InternalPerfectML.g:249:2: ( ( rule__KNeighborsClassifier__Group__0 ) )
            // InternalPerfectML.g:250:3: ( rule__KNeighborsClassifier__Group__0 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getGroup()); 
            // InternalPerfectML.g:251:3: ( rule__KNeighborsClassifier__Group__0 )
            // InternalPerfectML.g:251:4: rule__KNeighborsClassifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKNeighborsClassifier"


    // $ANTLR start "entryRuleTrainingAmount"
    // InternalPerfectML.g:260:1: entryRuleTrainingAmount : ruleTrainingAmount EOF ;
    public final void entryRuleTrainingAmount() throws RecognitionException {
        try {
            // InternalPerfectML.g:261:1: ( ruleTrainingAmount EOF )
            // InternalPerfectML.g:262:1: ruleTrainingAmount EOF
            {
             before(grammarAccess.getTrainingAmountRule()); 
            pushFollow(FOLLOW_1);
            ruleTrainingAmount();

            state._fsp--;

             after(grammarAccess.getTrainingAmountRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrainingAmount"


    // $ANTLR start "ruleTrainingAmount"
    // InternalPerfectML.g:269:1: ruleTrainingAmount : ( ( rule__TrainingAmount__Group__0 ) ) ;
    public final void ruleTrainingAmount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:273:2: ( ( ( rule__TrainingAmount__Group__0 ) ) )
            // InternalPerfectML.g:274:2: ( ( rule__TrainingAmount__Group__0 ) )
            {
            // InternalPerfectML.g:274:2: ( ( rule__TrainingAmount__Group__0 ) )
            // InternalPerfectML.g:275:3: ( rule__TrainingAmount__Group__0 )
            {
             before(grammarAccess.getTrainingAmountAccess().getGroup()); 
            // InternalPerfectML.g:276:3: ( rule__TrainingAmount__Group__0 )
            // InternalPerfectML.g:276:4: rule__TrainingAmount__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrainingAmount__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAmountAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainingAmount"


    // $ANTLR start "entryRuleColumnDeclarations"
    // InternalPerfectML.g:285:1: entryRuleColumnDeclarations : ruleColumnDeclarations EOF ;
    public final void entryRuleColumnDeclarations() throws RecognitionException {
        try {
            // InternalPerfectML.g:286:1: ( ruleColumnDeclarations EOF )
            // InternalPerfectML.g:287:1: ruleColumnDeclarations EOF
            {
             before(grammarAccess.getColumnDeclarationsRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnDeclarations();

            state._fsp--;

             after(grammarAccess.getColumnDeclarationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnDeclarations"


    // $ANTLR start "ruleColumnDeclarations"
    // InternalPerfectML.g:294:1: ruleColumnDeclarations : ( ( rule__ColumnDeclarations__Group__0 ) ) ;
    public final void ruleColumnDeclarations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:298:2: ( ( ( rule__ColumnDeclarations__Group__0 ) ) )
            // InternalPerfectML.g:299:2: ( ( rule__ColumnDeclarations__Group__0 ) )
            {
            // InternalPerfectML.g:299:2: ( ( rule__ColumnDeclarations__Group__0 ) )
            // InternalPerfectML.g:300:3: ( rule__ColumnDeclarations__Group__0 )
            {
             before(grammarAccess.getColumnDeclarationsAccess().getGroup()); 
            // InternalPerfectML.g:301:3: ( rule__ColumnDeclarations__Group__0 )
            // InternalPerfectML.g:301:4: rule__ColumnDeclarations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDeclarationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnDeclarations"


    // $ANTLR start "entryRuleColumnSet"
    // InternalPerfectML.g:310:1: entryRuleColumnSet : ruleColumnSet EOF ;
    public final void entryRuleColumnSet() throws RecognitionException {
        try {
            // InternalPerfectML.g:311:1: ( ruleColumnSet EOF )
            // InternalPerfectML.g:312:1: ruleColumnSet EOF
            {
             before(grammarAccess.getColumnSetRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnSet();

            state._fsp--;

             after(grammarAccess.getColumnSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnSet"


    // $ANTLR start "ruleColumnSet"
    // InternalPerfectML.g:319:1: ruleColumnSet : ( ( rule__ColumnSet__Alternatives ) ) ;
    public final void ruleColumnSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:323:2: ( ( ( rule__ColumnSet__Alternatives ) ) )
            // InternalPerfectML.g:324:2: ( ( rule__ColumnSet__Alternatives ) )
            {
            // InternalPerfectML.g:324:2: ( ( rule__ColumnSet__Alternatives ) )
            // InternalPerfectML.g:325:3: ( rule__ColumnSet__Alternatives )
            {
             before(grammarAccess.getColumnSetAccess().getAlternatives()); 
            // InternalPerfectML.g:326:3: ( rule__ColumnSet__Alternatives )
            // InternalPerfectML.g:326:4: rule__ColumnSet__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnSetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnSet"


    // $ANTLR start "entryRuleBinop"
    // InternalPerfectML.g:335:1: entryRuleBinop : ruleBinop EOF ;
    public final void entryRuleBinop() throws RecognitionException {
        try {
            // InternalPerfectML.g:336:1: ( ruleBinop EOF )
            // InternalPerfectML.g:337:1: ruleBinop EOF
            {
             before(grammarAccess.getBinopRule()); 
            pushFollow(FOLLOW_1);
            ruleBinop();

            state._fsp--;

             after(grammarAccess.getBinopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinop"


    // $ANTLR start "ruleBinop"
    // InternalPerfectML.g:344:1: ruleBinop : ( ( rule__Binop__Alternatives ) ) ;
    public final void ruleBinop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:348:2: ( ( ( rule__Binop__Alternatives ) ) )
            // InternalPerfectML.g:349:2: ( ( rule__Binop__Alternatives ) )
            {
            // InternalPerfectML.g:349:2: ( ( rule__Binop__Alternatives ) )
            // InternalPerfectML.g:350:3: ( rule__Binop__Alternatives )
            {
             before(grammarAccess.getBinopAccess().getAlternatives()); 
            // InternalPerfectML.g:351:3: ( rule__Binop__Alternatives )
            // InternalPerfectML.g:351:4: rule__Binop__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Binop__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinopAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinop"


    // $ANTLR start "entryRuleFLOAT"
    // InternalPerfectML.g:360:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalPerfectML.g:361:1: ( ruleFLOAT EOF )
            // InternalPerfectML.g:362:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalPerfectML.g:369:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:373:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalPerfectML.g:374:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalPerfectML.g:374:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalPerfectML.g:375:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalPerfectML.g:376:3: ( rule__FLOAT__Group__0 )
            // InternalPerfectML.g:376:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleBOOL"
    // InternalPerfectML.g:385:1: entryRuleBOOL : ruleBOOL EOF ;
    public final void entryRuleBOOL() throws RecognitionException {
        try {
            // InternalPerfectML.g:386:1: ( ruleBOOL EOF )
            // InternalPerfectML.g:387:1: ruleBOOL EOF
            {
             before(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_1);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getBOOLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // InternalPerfectML.g:394:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:398:2: ( ( ( rule__BOOL__Alternatives ) ) )
            // InternalPerfectML.g:399:2: ( ( rule__BOOL__Alternatives ) )
            {
            // InternalPerfectML.g:399:2: ( ( rule__BOOL__Alternatives ) )
            // InternalPerfectML.g:400:3: ( rule__BOOL__Alternatives )
            {
             before(grammarAccess.getBOOLAccess().getAlternatives()); 
            // InternalPerfectML.g:401:3: ( rule__BOOL__Alternatives )
            // InternalPerfectML.g:401:4: rule__BOOL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOOL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "rule__Algorithm__Alternatives_1"
    // InternalPerfectML.g:409:1: rule__Algorithm__Alternatives_1 : ( ( ruleMLPClassifier ) | ( ruleSVC ) | ( ruleKNeighborsClassifier ) );
    public final void rule__Algorithm__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:413:1: ( ( ruleMLPClassifier ) | ( ruleSVC ) | ( ruleKNeighborsClassifier ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt2=1;
                }
                break;
            case 55:
                {
                alt2=2;
                }
                break;
            case 56:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPerfectML.g:414:2: ( ruleMLPClassifier )
                    {
                    // InternalPerfectML.g:414:2: ( ruleMLPClassifier )
                    // InternalPerfectML.g:415:3: ruleMLPClassifier
                    {
                     before(grammarAccess.getAlgorithmAccess().getMLPClassifierParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMLPClassifier();

                    state._fsp--;

                     after(grammarAccess.getAlgorithmAccess().getMLPClassifierParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:420:2: ( ruleSVC )
                    {
                    // InternalPerfectML.g:420:2: ( ruleSVC )
                    // InternalPerfectML.g:421:3: ruleSVC
                    {
                     before(grammarAccess.getAlgorithmAccess().getSVCParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSVC();

                    state._fsp--;

                     after(grammarAccess.getAlgorithmAccess().getSVCParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPerfectML.g:426:2: ( ruleKNeighborsClassifier )
                    {
                    // InternalPerfectML.g:426:2: ( ruleKNeighborsClassifier )
                    // InternalPerfectML.g:427:3: ruleKNeighborsClassifier
                    {
                     before(grammarAccess.getAlgorithmAccess().getKNeighborsClassifierParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleKNeighborsClassifier();

                    state._fsp--;

                     after(grammarAccess.getAlgorithmAccess().getKNeighborsClassifierParserRuleCall_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Alternatives_1"


    // $ANTLR start "rule__MLPClassifier__ActivationAlternatives_4_2_0"
    // InternalPerfectML.g:436:1: rule__MLPClassifier__ActivationAlternatives_4_2_0 : ( ( 'identity' ) | ( 'logistic' ) | ( 'tanh' ) | ( 'relu' ) );
    public final void rule__MLPClassifier__ActivationAlternatives_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:440:1: ( ( 'identity' ) | ( 'logistic' ) | ( 'tanh' ) | ( 'relu' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPerfectML.g:441:2: ( 'identity' )
                    {
                    // InternalPerfectML.g:441:2: ( 'identity' )
                    // InternalPerfectML.g:442:3: 'identity'
                    {
                     before(grammarAccess.getMLPClassifierAccess().getActivationIdentityKeyword_4_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMLPClassifierAccess().getActivationIdentityKeyword_4_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:447:2: ( 'logistic' )
                    {
                    // InternalPerfectML.g:447:2: ( 'logistic' )
                    // InternalPerfectML.g:448:3: 'logistic'
                    {
                     before(grammarAccess.getMLPClassifierAccess().getActivationLogisticKeyword_4_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMLPClassifierAccess().getActivationLogisticKeyword_4_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPerfectML.g:453:2: ( 'tanh' )
                    {
                    // InternalPerfectML.g:453:2: ( 'tanh' )
                    // InternalPerfectML.g:454:3: 'tanh'
                    {
                     before(grammarAccess.getMLPClassifierAccess().getActivationTanhKeyword_4_2_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMLPClassifierAccess().getActivationTanhKeyword_4_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPerfectML.g:459:2: ( 'relu' )
                    {
                    // InternalPerfectML.g:459:2: ( 'relu' )
                    // InternalPerfectML.g:460:3: 'relu'
                    {
                     before(grammarAccess.getMLPClassifierAccess().getActivationReluKeyword_4_2_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMLPClassifierAccess().getActivationReluKeyword_4_2_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__ActivationAlternatives_4_2_0"


    // $ANTLR start "rule__MLPClassifier__SolverAlternatives_5_2_0"
    // InternalPerfectML.g:469:1: rule__MLPClassifier__SolverAlternatives_5_2_0 : ( ( 'lbfgs' ) | ( 'sgd' ) | ( 'adam' ) );
    public final void rule__MLPClassifier__SolverAlternatives_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:473:1: ( ( 'lbfgs' ) | ( 'sgd' ) | ( 'adam' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPerfectML.g:474:2: ( 'lbfgs' )
                    {
                    // InternalPerfectML.g:474:2: ( 'lbfgs' )
                    // InternalPerfectML.g:475:3: 'lbfgs'
                    {
                     before(grammarAccess.getMLPClassifierAccess().getSolverLbfgsKeyword_5_2_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMLPClassifierAccess().getSolverLbfgsKeyword_5_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:480:2: ( 'sgd' )
                    {
                    // InternalPerfectML.g:480:2: ( 'sgd' )
                    // InternalPerfectML.g:481:3: 'sgd'
                    {
                     before(grammarAccess.getMLPClassifierAccess().getSolverSgdKeyword_5_2_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMLPClassifierAccess().getSolverSgdKeyword_5_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPerfectML.g:486:2: ( 'adam' )
                    {
                    // InternalPerfectML.g:486:2: ( 'adam' )
                    // InternalPerfectML.g:487:3: 'adam'
                    {
                     before(grammarAccess.getMLPClassifierAccess().getSolverAdamKeyword_5_2_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMLPClassifierAccess().getSolverAdamKeyword_5_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__SolverAlternatives_5_2_0"


    // $ANTLR start "rule__MLPClassifier__Learning_rateAlternatives_8_2_0"
    // InternalPerfectML.g:496:1: rule__MLPClassifier__Learning_rateAlternatives_8_2_0 : ( ( 'constant' ) | ( 'invscaling' ) | ( 'adaptive' ) );
    public final void rule__MLPClassifier__Learning_rateAlternatives_8_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:500:1: ( ( 'constant' ) | ( 'invscaling' ) | ( 'adaptive' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
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
                    // InternalPerfectML.g:501:2: ( 'constant' )
                    {
                    // InternalPerfectML.g:501:2: ( 'constant' )
                    // InternalPerfectML.g:502:3: 'constant'
                    {
                     before(grammarAccess.getMLPClassifierAccess().getLearning_rateConstantKeyword_8_2_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMLPClassifierAccess().getLearning_rateConstantKeyword_8_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:507:2: ( 'invscaling' )
                    {
                    // InternalPerfectML.g:507:2: ( 'invscaling' )
                    // InternalPerfectML.g:508:3: 'invscaling'
                    {
                     before(grammarAccess.getMLPClassifierAccess().getLearning_rateInvscalingKeyword_8_2_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMLPClassifierAccess().getLearning_rateInvscalingKeyword_8_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPerfectML.g:513:2: ( 'adaptive' )
                    {
                    // InternalPerfectML.g:513:2: ( 'adaptive' )
                    // InternalPerfectML.g:514:3: 'adaptive'
                    {
                     before(grammarAccess.getMLPClassifierAccess().getLearning_rateAdaptiveKeyword_8_2_0_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMLPClassifierAccess().getLearning_rateAdaptiveKeyword_8_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Learning_rateAlternatives_8_2_0"


    // $ANTLR start "rule__SVC__KernelAlternatives_4_2_0"
    // InternalPerfectML.g:523:1: rule__SVC__KernelAlternatives_4_2_0 : ( ( 'rbf' ) | ( 'poly' ) | ( 'linear' ) | ( 'sigmoid' ) | ( 'precomputed' ) );
    public final void rule__SVC__KernelAlternatives_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:527:1: ( ( 'rbf' ) | ( 'poly' ) | ( 'linear' ) | ( 'sigmoid' ) | ( 'precomputed' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPerfectML.g:528:2: ( 'rbf' )
                    {
                    // InternalPerfectML.g:528:2: ( 'rbf' )
                    // InternalPerfectML.g:529:3: 'rbf'
                    {
                     before(grammarAccess.getSVCAccess().getKernelRbfKeyword_4_2_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSVCAccess().getKernelRbfKeyword_4_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:534:2: ( 'poly' )
                    {
                    // InternalPerfectML.g:534:2: ( 'poly' )
                    // InternalPerfectML.g:535:3: 'poly'
                    {
                     before(grammarAccess.getSVCAccess().getKernelPolyKeyword_4_2_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSVCAccess().getKernelPolyKeyword_4_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPerfectML.g:540:2: ( 'linear' )
                    {
                    // InternalPerfectML.g:540:2: ( 'linear' )
                    // InternalPerfectML.g:541:3: 'linear'
                    {
                     before(grammarAccess.getSVCAccess().getKernelLinearKeyword_4_2_0_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSVCAccess().getKernelLinearKeyword_4_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPerfectML.g:546:2: ( 'sigmoid' )
                    {
                    // InternalPerfectML.g:546:2: ( 'sigmoid' )
                    // InternalPerfectML.g:547:3: 'sigmoid'
                    {
                     before(grammarAccess.getSVCAccess().getKernelSigmoidKeyword_4_2_0_3()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getSVCAccess().getKernelSigmoidKeyword_4_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPerfectML.g:552:2: ( 'precomputed' )
                    {
                    // InternalPerfectML.g:552:2: ( 'precomputed' )
                    // InternalPerfectML.g:553:3: 'precomputed'
                    {
                     before(grammarAccess.getSVCAccess().getKernelPrecomputedKeyword_4_2_0_4()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getSVCAccess().getKernelPrecomputedKeyword_4_2_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__KernelAlternatives_4_2_0"


    // $ANTLR start "rule__SVC__GammaAlternatives_6_2_0"
    // InternalPerfectML.g:562:1: rule__SVC__GammaAlternatives_6_2_0 : ( ( 'scale' ) | ( 'auto' ) );
    public final void rule__SVC__GammaAlternatives_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:566:1: ( ( 'scale' ) | ( 'auto' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPerfectML.g:567:2: ( 'scale' )
                    {
                    // InternalPerfectML.g:567:2: ( 'scale' )
                    // InternalPerfectML.g:568:3: 'scale'
                    {
                     before(grammarAccess.getSVCAccess().getGammaScaleKeyword_6_2_0_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getSVCAccess().getGammaScaleKeyword_6_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:573:2: ( 'auto' )
                    {
                    // InternalPerfectML.g:573:2: ( 'auto' )
                    // InternalPerfectML.g:574:3: 'auto'
                    {
                     before(grammarAccess.getSVCAccess().getGammaAutoKeyword_6_2_0_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getSVCAccess().getGammaAutoKeyword_6_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__GammaAlternatives_6_2_0"


    // $ANTLR start "rule__SVC__Decision_function_shapeAlternatives_14_2_0"
    // InternalPerfectML.g:583:1: rule__SVC__Decision_function_shapeAlternatives_14_2_0 : ( ( 'ovo' ) | ( 'ovr' ) );
    public final void rule__SVC__Decision_function_shapeAlternatives_14_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:587:1: ( ( 'ovo' ) | ( 'ovr' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==29) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPerfectML.g:588:2: ( 'ovo' )
                    {
                    // InternalPerfectML.g:588:2: ( 'ovo' )
                    // InternalPerfectML.g:589:3: 'ovo'
                    {
                     before(grammarAccess.getSVCAccess().getDecision_function_shapeOvoKeyword_14_2_0_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getSVCAccess().getDecision_function_shapeOvoKeyword_14_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:594:2: ( 'ovr' )
                    {
                    // InternalPerfectML.g:594:2: ( 'ovr' )
                    // InternalPerfectML.g:595:3: 'ovr'
                    {
                     before(grammarAccess.getSVCAccess().getDecision_function_shapeOvrKeyword_14_2_0_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSVCAccess().getDecision_function_shapeOvrKeyword_14_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Decision_function_shapeAlternatives_14_2_0"


    // $ANTLR start "rule__KNeighborsClassifier__WeightsAlternatives_4_2_0"
    // InternalPerfectML.g:604:1: rule__KNeighborsClassifier__WeightsAlternatives_4_2_0 : ( ( 'uniform' ) | ( 'distance' ) );
    public final void rule__KNeighborsClassifier__WeightsAlternatives_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:608:1: ( ( 'uniform' ) | ( 'distance' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPerfectML.g:609:2: ( 'uniform' )
                    {
                    // InternalPerfectML.g:609:2: ( 'uniform' )
                    // InternalPerfectML.g:610:3: 'uniform'
                    {
                     before(grammarAccess.getKNeighborsClassifierAccess().getWeightsUniformKeyword_4_2_0_0()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getKNeighborsClassifierAccess().getWeightsUniformKeyword_4_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:615:2: ( 'distance' )
                    {
                    // InternalPerfectML.g:615:2: ( 'distance' )
                    // InternalPerfectML.g:616:3: 'distance'
                    {
                     before(grammarAccess.getKNeighborsClassifierAccess().getWeightsDistanceKeyword_4_2_0_1()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getKNeighborsClassifierAccess().getWeightsDistanceKeyword_4_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__WeightsAlternatives_4_2_0"


    // $ANTLR start "rule__KNeighborsClassifier__AlgorithmAlternatives_5_2_0"
    // InternalPerfectML.g:625:1: rule__KNeighborsClassifier__AlgorithmAlternatives_5_2_0 : ( ( 'auto' ) | ( 'ball_tree' ) | ( 'kd_tree' ) | ( 'brute' ) );
    public final void rule__KNeighborsClassifier__AlgorithmAlternatives_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:629:1: ( ( 'auto' ) | ( 'ball_tree' ) | ( 'kd_tree' ) | ( 'brute' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            case 34:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPerfectML.g:630:2: ( 'auto' )
                    {
                    // InternalPerfectML.g:630:2: ( 'auto' )
                    // InternalPerfectML.g:631:3: 'auto'
                    {
                     before(grammarAccess.getKNeighborsClassifierAccess().getAlgorithmAutoKeyword_5_2_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getKNeighborsClassifierAccess().getAlgorithmAutoKeyword_5_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:636:2: ( 'ball_tree' )
                    {
                    // InternalPerfectML.g:636:2: ( 'ball_tree' )
                    // InternalPerfectML.g:637:3: 'ball_tree'
                    {
                     before(grammarAccess.getKNeighborsClassifierAccess().getAlgorithmBall_treeKeyword_5_2_0_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getKNeighborsClassifierAccess().getAlgorithmBall_treeKeyword_5_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPerfectML.g:642:2: ( 'kd_tree' )
                    {
                    // InternalPerfectML.g:642:2: ( 'kd_tree' )
                    // InternalPerfectML.g:643:3: 'kd_tree'
                    {
                     before(grammarAccess.getKNeighborsClassifierAccess().getAlgorithmKd_treeKeyword_5_2_0_2()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getKNeighborsClassifierAccess().getAlgorithmKd_treeKeyword_5_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPerfectML.g:648:2: ( 'brute' )
                    {
                    // InternalPerfectML.g:648:2: ( 'brute' )
                    // InternalPerfectML.g:649:3: 'brute'
                    {
                     before(grammarAccess.getKNeighborsClassifierAccess().getAlgorithmBruteKeyword_5_2_0_3()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getKNeighborsClassifierAccess().getAlgorithmBruteKeyword_5_2_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__AlgorithmAlternatives_5_2_0"


    // $ANTLR start "rule__KNeighborsClassifier__MetricAlternatives_8_2_0"
    // InternalPerfectML.g:658:1: rule__KNeighborsClassifier__MetricAlternatives_8_2_0 : ( ( 'mahalanobis' ) | ( 'seuclidean' ) | ( 'wminkowski' ) | ( 'minkowski' ) | ( 'chebyshev' ) | ( 'manhattan' ) | ( 'euclidean' ) );
    public final void rule__KNeighborsClassifier__MetricAlternatives_8_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:662:1: ( ( 'mahalanobis' ) | ( 'seuclidean' ) | ( 'wminkowski' ) | ( 'minkowski' ) | ( 'chebyshev' ) | ( 'manhattan' ) | ( 'euclidean' ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt11=1;
                }
                break;
            case 36:
                {
                alt11=2;
                }
                break;
            case 37:
                {
                alt11=3;
                }
                break;
            case 38:
                {
                alt11=4;
                }
                break;
            case 39:
                {
                alt11=5;
                }
                break;
            case 40:
                {
                alt11=6;
                }
                break;
            case 41:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPerfectML.g:663:2: ( 'mahalanobis' )
                    {
                    // InternalPerfectML.g:663:2: ( 'mahalanobis' )
                    // InternalPerfectML.g:664:3: 'mahalanobis'
                    {
                     before(grammarAccess.getKNeighborsClassifierAccess().getMetricMahalanobisKeyword_8_2_0_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getKNeighborsClassifierAccess().getMetricMahalanobisKeyword_8_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:669:2: ( 'seuclidean' )
                    {
                    // InternalPerfectML.g:669:2: ( 'seuclidean' )
                    // InternalPerfectML.g:670:3: 'seuclidean'
                    {
                     before(grammarAccess.getKNeighborsClassifierAccess().getMetricSeuclideanKeyword_8_2_0_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getKNeighborsClassifierAccess().getMetricSeuclideanKeyword_8_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPerfectML.g:675:2: ( 'wminkowski' )
                    {
                    // InternalPerfectML.g:675:2: ( 'wminkowski' )
                    // InternalPerfectML.g:676:3: 'wminkowski'
                    {
                     before(grammarAccess.getKNeighborsClassifierAccess().getMetricWminkowskiKeyword_8_2_0_2()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getKNeighborsClassifierAccess().getMetricWminkowskiKeyword_8_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPerfectML.g:681:2: ( 'minkowski' )
                    {
                    // InternalPerfectML.g:681:2: ( 'minkowski' )
                    // InternalPerfectML.g:682:3: 'minkowski'
                    {
                     before(grammarAccess.getKNeighborsClassifierAccess().getMetricMinkowskiKeyword_8_2_0_3()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getKNeighborsClassifierAccess().getMetricMinkowskiKeyword_8_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPerfectML.g:687:2: ( 'chebyshev' )
                    {
                    // InternalPerfectML.g:687:2: ( 'chebyshev' )
                    // InternalPerfectML.g:688:3: 'chebyshev'
                    {
                     before(grammarAccess.getKNeighborsClassifierAccess().getMetricChebyshevKeyword_8_2_0_4()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getKNeighborsClassifierAccess().getMetricChebyshevKeyword_8_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPerfectML.g:693:2: ( 'manhattan' )
                    {
                    // InternalPerfectML.g:693:2: ( 'manhattan' )
                    // InternalPerfectML.g:694:3: 'manhattan'
                    {
                     before(grammarAccess.getKNeighborsClassifierAccess().getMetricManhattanKeyword_8_2_0_5()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getKNeighborsClassifierAccess().getMetricManhattanKeyword_8_2_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPerfectML.g:699:2: ( 'euclidean' )
                    {
                    // InternalPerfectML.g:699:2: ( 'euclidean' )
                    // InternalPerfectML.g:700:3: 'euclidean'
                    {
                     before(grammarAccess.getKNeighborsClassifierAccess().getMetricEuclideanKeyword_8_2_0_6()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getKNeighborsClassifierAccess().getMetricEuclideanKeyword_8_2_0_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__MetricAlternatives_8_2_0"


    // $ANTLR start "rule__TrainingAmount__Alternatives_2"
    // InternalPerfectML.g:709:1: rule__TrainingAmount__Alternatives_2 : ( ( ( rule__TrainingAmount__PercentAssignment_2_0 ) ) | ( ( rule__TrainingAmount__Group_2_1__0 ) ) );
    public final void rule__TrainingAmount__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:713:1: ( ( ( rule__TrainingAmount__PercentAssignment_2_0 ) ) | ( ( rule__TrainingAmount__Group_2_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==105) ) {
                alt12=1;
            }
            else if ( (LA12_0==58) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPerfectML.g:714:2: ( ( rule__TrainingAmount__PercentAssignment_2_0 ) )
                    {
                    // InternalPerfectML.g:714:2: ( ( rule__TrainingAmount__PercentAssignment_2_0 ) )
                    // InternalPerfectML.g:715:3: ( rule__TrainingAmount__PercentAssignment_2_0 )
                    {
                     before(grammarAccess.getTrainingAmountAccess().getPercentAssignment_2_0()); 
                    // InternalPerfectML.g:716:3: ( rule__TrainingAmount__PercentAssignment_2_0 )
                    // InternalPerfectML.g:716:4: rule__TrainingAmount__PercentAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrainingAmount__PercentAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrainingAmountAccess().getPercentAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:720:2: ( ( rule__TrainingAmount__Group_2_1__0 ) )
                    {
                    // InternalPerfectML.g:720:2: ( ( rule__TrainingAmount__Group_2_1__0 ) )
                    // InternalPerfectML.g:721:3: ( rule__TrainingAmount__Group_2_1__0 )
                    {
                     before(grammarAccess.getTrainingAmountAccess().getGroup_2_1()); 
                    // InternalPerfectML.g:722:3: ( rule__TrainingAmount__Group_2_1__0 )
                    // InternalPerfectML.g:722:4: rule__TrainingAmount__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrainingAmount__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrainingAmountAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__Alternatives_2"


    // $ANTLR start "rule__ColumnSet__Alternatives"
    // InternalPerfectML.g:730:1: rule__ColumnSet__Alternatives : ( ( ( rule__ColumnSet__Group_0__0 ) ) | ( ( rule__ColumnSet__Group_1__0 ) ) | ( ( rule__ColumnSet__Group_2__0 ) ) );
    public final void rule__ColumnSet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:734:1: ( ( ( rule__ColumnSet__Group_0__0 ) ) | ( ( rule__ColumnSet__Group_1__0 ) ) | ( ( rule__ColumnSet__Group_2__0 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt13=1;
                }
                break;
            case 108:
                {
                alt13=2;
                }
                break;
            case 109:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPerfectML.g:735:2: ( ( rule__ColumnSet__Group_0__0 ) )
                    {
                    // InternalPerfectML.g:735:2: ( ( rule__ColumnSet__Group_0__0 ) )
                    // InternalPerfectML.g:736:3: ( rule__ColumnSet__Group_0__0 )
                    {
                     before(grammarAccess.getColumnSetAccess().getGroup_0()); 
                    // InternalPerfectML.g:737:3: ( rule__ColumnSet__Group_0__0 )
                    // InternalPerfectML.g:737:4: rule__ColumnSet__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnSet__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnSetAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:741:2: ( ( rule__ColumnSet__Group_1__0 ) )
                    {
                    // InternalPerfectML.g:741:2: ( ( rule__ColumnSet__Group_1__0 ) )
                    // InternalPerfectML.g:742:3: ( rule__ColumnSet__Group_1__0 )
                    {
                     before(grammarAccess.getColumnSetAccess().getGroup_1()); 
                    // InternalPerfectML.g:743:3: ( rule__ColumnSet__Group_1__0 )
                    // InternalPerfectML.g:743:4: rule__ColumnSet__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnSet__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnSetAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPerfectML.g:747:2: ( ( rule__ColumnSet__Group_2__0 ) )
                    {
                    // InternalPerfectML.g:747:2: ( ( rule__ColumnSet__Group_2__0 ) )
                    // InternalPerfectML.g:748:3: ( rule__ColumnSet__Group_2__0 )
                    {
                     before(grammarAccess.getColumnSetAccess().getGroup_2()); 
                    // InternalPerfectML.g:749:3: ( rule__ColumnSet__Group_2__0 )
                    // InternalPerfectML.g:749:4: rule__ColumnSet__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnSet__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnSetAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Alternatives"


    // $ANTLR start "rule__Binop__Alternatives"
    // InternalPerfectML.g:757:1: rule__Binop__Alternatives : ( ( ( rule__Binop__TypeAssignment_0 ) ) | ( ( rule__Binop__TypeAssignment_1 ) ) );
    public final void rule__Binop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:761:1: ( ( ( rule__Binop__TypeAssignment_0 ) ) | ( ( rule__Binop__TypeAssignment_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==110) ) {
                alt14=1;
            }
            else if ( (LA14_0==111) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPerfectML.g:762:2: ( ( rule__Binop__TypeAssignment_0 ) )
                    {
                    // InternalPerfectML.g:762:2: ( ( rule__Binop__TypeAssignment_0 ) )
                    // InternalPerfectML.g:763:3: ( rule__Binop__TypeAssignment_0 )
                    {
                     before(grammarAccess.getBinopAccess().getTypeAssignment_0()); 
                    // InternalPerfectML.g:764:3: ( rule__Binop__TypeAssignment_0 )
                    // InternalPerfectML.g:764:4: rule__Binop__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Binop__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinopAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:768:2: ( ( rule__Binop__TypeAssignment_1 ) )
                    {
                    // InternalPerfectML.g:768:2: ( ( rule__Binop__TypeAssignment_1 ) )
                    // InternalPerfectML.g:769:3: ( rule__Binop__TypeAssignment_1 )
                    {
                     before(grammarAccess.getBinopAccess().getTypeAssignment_1()); 
                    // InternalPerfectML.g:770:3: ( rule__Binop__TypeAssignment_1 )
                    // InternalPerfectML.g:770:4: rule__Binop__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Binop__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinopAccess().getTypeAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binop__Alternatives"


    // $ANTLR start "rule__BOOL__Alternatives"
    // InternalPerfectML.g:778:1: rule__BOOL__Alternatives : ( ( ( rule__BOOL__ValueAssignment_0 ) ) | ( ( rule__BOOL__ValueAssignment_1 ) ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:782:1: ( ( ( rule__BOOL__ValueAssignment_0 ) ) | ( ( rule__BOOL__ValueAssignment_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==112) ) {
                alt15=1;
            }
            else if ( (LA15_0==113) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalPerfectML.g:783:2: ( ( rule__BOOL__ValueAssignment_0 ) )
                    {
                    // InternalPerfectML.g:783:2: ( ( rule__BOOL__ValueAssignment_0 ) )
                    // InternalPerfectML.g:784:3: ( rule__BOOL__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBOOLAccess().getValueAssignment_0()); 
                    // InternalPerfectML.g:785:3: ( rule__BOOL__ValueAssignment_0 )
                    // InternalPerfectML.g:785:4: rule__BOOL__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOOL__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBOOLAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerfectML.g:789:2: ( ( rule__BOOL__ValueAssignment_1 ) )
                    {
                    // InternalPerfectML.g:789:2: ( ( rule__BOOL__ValueAssignment_1 ) )
                    // InternalPerfectML.g:790:3: ( rule__BOOL__ValueAssignment_1 )
                    {
                     before(grammarAccess.getBOOLAccess().getValueAssignment_1()); 
                    // InternalPerfectML.g:791:3: ( rule__BOOL__ValueAssignment_1 )
                    // InternalPerfectML.g:791:4: rule__BOOL__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOOL__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBOOLAccess().getValueAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL__Alternatives"


    // $ANTLR start "rule__PerfectMLFile__Group__0"
    // InternalPerfectML.g:799:1: rule__PerfectMLFile__Group__0 : rule__PerfectMLFile__Group__0__Impl rule__PerfectMLFile__Group__1 ;
    public final void rule__PerfectMLFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:803:1: ( rule__PerfectMLFile__Group__0__Impl rule__PerfectMLFile__Group__1 )
            // InternalPerfectML.g:804:2: rule__PerfectMLFile__Group__0__Impl rule__PerfectMLFile__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PerfectMLFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerfectMLFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerfectMLFile__Group__0"


    // $ANTLR start "rule__PerfectMLFile__Group__0__Impl"
    // InternalPerfectML.g:811:1: rule__PerfectMLFile__Group__0__Impl : ( ( rule__PerfectMLFile__ProgramsAssignment_0 ) ) ;
    public final void rule__PerfectMLFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:815:1: ( ( ( rule__PerfectMLFile__ProgramsAssignment_0 ) ) )
            // InternalPerfectML.g:816:1: ( ( rule__PerfectMLFile__ProgramsAssignment_0 ) )
            {
            // InternalPerfectML.g:816:1: ( ( rule__PerfectMLFile__ProgramsAssignment_0 ) )
            // InternalPerfectML.g:817:2: ( rule__PerfectMLFile__ProgramsAssignment_0 )
            {
             before(grammarAccess.getPerfectMLFileAccess().getProgramsAssignment_0()); 
            // InternalPerfectML.g:818:2: ( rule__PerfectMLFile__ProgramsAssignment_0 )
            // InternalPerfectML.g:818:3: rule__PerfectMLFile__ProgramsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PerfectMLFile__ProgramsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPerfectMLFileAccess().getProgramsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerfectMLFile__Group__0__Impl"


    // $ANTLR start "rule__PerfectMLFile__Group__1"
    // InternalPerfectML.g:826:1: rule__PerfectMLFile__Group__1 : rule__PerfectMLFile__Group__1__Impl ;
    public final void rule__PerfectMLFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:830:1: ( rule__PerfectMLFile__Group__1__Impl )
            // InternalPerfectML.g:831:2: rule__PerfectMLFile__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PerfectMLFile__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerfectMLFile__Group__1"


    // $ANTLR start "rule__PerfectMLFile__Group__1__Impl"
    // InternalPerfectML.g:837:1: rule__PerfectMLFile__Group__1__Impl : ( ';' ) ;
    public final void rule__PerfectMLFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:841:1: ( ( ';' ) )
            // InternalPerfectML.g:842:1: ( ';' )
            {
            // InternalPerfectML.g:842:1: ( ';' )
            // InternalPerfectML.g:843:2: ';'
            {
             before(grammarAccess.getPerfectMLFileAccess().getSemicolonKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPerfectMLFileAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerfectMLFile__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__0"
    // InternalPerfectML.g:853:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:857:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPerfectML.g:858:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalPerfectML.g:865:1: rule__Program__Group__0__Impl : ( ( rule__Program__InputAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:869:1: ( ( ( rule__Program__InputAssignment_0 ) ) )
            // InternalPerfectML.g:870:1: ( ( rule__Program__InputAssignment_0 ) )
            {
            // InternalPerfectML.g:870:1: ( ( rule__Program__InputAssignment_0 ) )
            // InternalPerfectML.g:871:2: ( rule__Program__InputAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getInputAssignment_0()); 
            // InternalPerfectML.g:872:2: ( rule__Program__InputAssignment_0 )
            // InternalPerfectML.g:872:3: rule__Program__InputAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__InputAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getInputAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalPerfectML.g:880:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:884:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPerfectML.g:885:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalPerfectML.g:892:1: rule__Program__Group__1__Impl : ( ( rule__Program__OutputAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:896:1: ( ( ( rule__Program__OutputAssignment_1 ) ) )
            // InternalPerfectML.g:897:1: ( ( rule__Program__OutputAssignment_1 ) )
            {
            // InternalPerfectML.g:897:1: ( ( rule__Program__OutputAssignment_1 ) )
            // InternalPerfectML.g:898:2: ( rule__Program__OutputAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getOutputAssignment_1()); 
            // InternalPerfectML.g:899:2: ( rule__Program__OutputAssignment_1 )
            // InternalPerfectML.g:899:3: rule__Program__OutputAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__OutputAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getOutputAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalPerfectML.g:907:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:911:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalPerfectML.g:912:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalPerfectML.g:919:1: rule__Program__Group__2__Impl : ( ( rule__Program__AlgoAssignment_2 ) ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:923:1: ( ( ( rule__Program__AlgoAssignment_2 ) ) )
            // InternalPerfectML.g:924:1: ( ( rule__Program__AlgoAssignment_2 ) )
            {
            // InternalPerfectML.g:924:1: ( ( rule__Program__AlgoAssignment_2 ) )
            // InternalPerfectML.g:925:2: ( rule__Program__AlgoAssignment_2 )
            {
             before(grammarAccess.getProgramAccess().getAlgoAssignment_2()); 
            // InternalPerfectML.g:926:2: ( rule__Program__AlgoAssignment_2 )
            // InternalPerfectML.g:926:3: rule__Program__AlgoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Program__AlgoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getAlgoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalPerfectML.g:934:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:938:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalPerfectML.g:939:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalPerfectML.g:946:1: rule__Program__Group__3__Impl : ( ( rule__Program__NbtrainingAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:950:1: ( ( ( rule__Program__NbtrainingAssignment_3 ) ) )
            // InternalPerfectML.g:951:1: ( ( rule__Program__NbtrainingAssignment_3 ) )
            {
            // InternalPerfectML.g:951:1: ( ( rule__Program__NbtrainingAssignment_3 ) )
            // InternalPerfectML.g:952:2: ( rule__Program__NbtrainingAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getNbtrainingAssignment_3()); 
            // InternalPerfectML.g:953:2: ( rule__Program__NbtrainingAssignment_3 )
            // InternalPerfectML.g:953:3: rule__Program__NbtrainingAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Program__NbtrainingAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNbtrainingAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalPerfectML.g:961:1: rule__Program__Group__4 : rule__Program__Group__4__Impl ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:965:1: ( rule__Program__Group__4__Impl )
            // InternalPerfectML.g:966:2: rule__Program__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalPerfectML.g:972:1: rule__Program__Group__4__Impl : ( ( rule__Program__ColumnAssignment_4 )? ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:976:1: ( ( ( rule__Program__ColumnAssignment_4 )? ) )
            // InternalPerfectML.g:977:1: ( ( rule__Program__ColumnAssignment_4 )? )
            {
            // InternalPerfectML.g:977:1: ( ( rule__Program__ColumnAssignment_4 )? )
            // InternalPerfectML.g:978:2: ( rule__Program__ColumnAssignment_4 )?
            {
             before(grammarAccess.getProgramAccess().getColumnAssignment_4()); 
            // InternalPerfectML.g:979:2: ( rule__Program__ColumnAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPerfectML.g:979:3: rule__Program__ColumnAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__ColumnAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getColumnAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalPerfectML.g:988:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:992:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalPerfectML.g:993:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalPerfectML.g:1000:1: rule__Input__Group__0__Impl : ( 'Use' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1004:1: ( ( 'Use' ) )
            // InternalPerfectML.g:1005:1: ( 'Use' )
            {
            // InternalPerfectML.g:1005:1: ( 'Use' )
            // InternalPerfectML.g:1006:2: 'Use'
            {
             before(grammarAccess.getInputAccess().getUseKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalPerfectML.g:1015:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1019:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalPerfectML.g:1020:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalPerfectML.g:1027:1: rule__Input__Group__1__Impl : ( 'source' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1031:1: ( ( 'source' ) )
            // InternalPerfectML.g:1032:1: ( 'source' )
            {
            // InternalPerfectML.g:1032:1: ( 'source' )
            // InternalPerfectML.g:1033:2: 'source'
            {
             before(grammarAccess.getInputAccess().getSourceKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getSourceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalPerfectML.g:1042:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1046:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalPerfectML.g:1047:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalPerfectML.g:1054:1: rule__Input__Group__2__Impl : ( 'data' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1058:1: ( ( 'data' ) )
            // InternalPerfectML.g:1059:1: ( 'data' )
            {
            // InternalPerfectML.g:1059:1: ( 'data' )
            // InternalPerfectML.g:1060:2: 'data'
            {
             before(grammarAccess.getInputAccess().getDataKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getDataKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // InternalPerfectML.g:1069:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1073:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalPerfectML.g:1074:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // InternalPerfectML.g:1081:1: rule__Input__Group__3__Impl : ( ':' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1085:1: ( ( ':' ) )
            // InternalPerfectML.g:1086:1: ( ':' )
            {
            // InternalPerfectML.g:1086:1: ( ':' )
            // InternalPerfectML.g:1087:2: ':'
            {
             before(grammarAccess.getInputAccess().getColonKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // InternalPerfectML.g:1096:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1100:1: ( rule__Input__Group__4__Impl )
            // InternalPerfectML.g:1101:2: rule__Input__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // InternalPerfectML.g:1107:1: rule__Input__Group__4__Impl : ( ( rule__Input__PATHAssignment_4 ) ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1111:1: ( ( ( rule__Input__PATHAssignment_4 ) ) )
            // InternalPerfectML.g:1112:1: ( ( rule__Input__PATHAssignment_4 ) )
            {
            // InternalPerfectML.g:1112:1: ( ( rule__Input__PATHAssignment_4 ) )
            // InternalPerfectML.g:1113:2: ( rule__Input__PATHAssignment_4 )
            {
             before(grammarAccess.getInputAccess().getPATHAssignment_4()); 
            // InternalPerfectML.g:1114:2: ( rule__Input__PATHAssignment_4 )
            // InternalPerfectML.g:1114:3: rule__Input__PATHAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Input__PATHAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getPATHAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalPerfectML.g:1123:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1127:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalPerfectML.g:1128:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalPerfectML.g:1135:1: rule__Output__Group__0__Impl : ( 'Use' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1139:1: ( ( 'Use' ) )
            // InternalPerfectML.g:1140:1: ( 'Use' )
            {
            // InternalPerfectML.g:1140:1: ( 'Use' )
            // InternalPerfectML.g:1141:2: 'Use'
            {
             before(grammarAccess.getOutputAccess().getUseKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalPerfectML.g:1150:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1154:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalPerfectML.g:1155:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalPerfectML.g:1162:1: rule__Output__Group__1__Impl : ( 'output' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1166:1: ( ( 'output' ) )
            // InternalPerfectML.g:1167:1: ( 'output' )
            {
            // InternalPerfectML.g:1167:1: ( 'output' )
            // InternalPerfectML.g:1168:2: 'output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalPerfectML.g:1177:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1181:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalPerfectML.g:1182:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalPerfectML.g:1189:1: rule__Output__Group__2__Impl : ( 'file' ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1193:1: ( ( 'file' ) )
            // InternalPerfectML.g:1194:1: ( 'file' )
            {
            // InternalPerfectML.g:1194:1: ( 'file' )
            // InternalPerfectML.g:1195:2: 'file'
            {
             before(grammarAccess.getOutputAccess().getFileKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getFileKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalPerfectML.g:1204:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1208:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalPerfectML.g:1209:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Output__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalPerfectML.g:1216:1: rule__Output__Group__3__Impl : ( ':' ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1220:1: ( ( ':' ) )
            // InternalPerfectML.g:1221:1: ( ':' )
            {
            // InternalPerfectML.g:1221:1: ( ':' )
            // InternalPerfectML.g:1222:2: ':'
            {
             before(grammarAccess.getOutputAccess().getColonKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Output__Group__4"
    // InternalPerfectML.g:1231:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1235:1: ( rule__Output__Group__4__Impl )
            // InternalPerfectML.g:1236:2: rule__Output__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4"


    // $ANTLR start "rule__Output__Group__4__Impl"
    // InternalPerfectML.g:1242:1: rule__Output__Group__4__Impl : ( ( rule__Output__PATHAssignment_4 ) ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1246:1: ( ( ( rule__Output__PATHAssignment_4 ) ) )
            // InternalPerfectML.g:1247:1: ( ( rule__Output__PATHAssignment_4 ) )
            {
            // InternalPerfectML.g:1247:1: ( ( rule__Output__PATHAssignment_4 ) )
            // InternalPerfectML.g:1248:2: ( rule__Output__PATHAssignment_4 )
            {
             before(grammarAccess.getOutputAccess().getPATHAssignment_4()); 
            // InternalPerfectML.g:1249:2: ( rule__Output__PATHAssignment_4 )
            // InternalPerfectML.g:1249:3: rule__Output__PATHAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Output__PATHAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getPATHAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4__Impl"


    // $ANTLR start "rule__Algorithm__Group__0"
    // InternalPerfectML.g:1258:1: rule__Algorithm__Group__0 : rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 ;
    public final void rule__Algorithm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1262:1: ( rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 )
            // InternalPerfectML.g:1263:2: rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Algorithm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__0"


    // $ANTLR start "rule__Algorithm__Group__0__Impl"
    // InternalPerfectML.g:1270:1: rule__Algorithm__Group__0__Impl : ( 'Use' ) ;
    public final void rule__Algorithm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1274:1: ( ( 'Use' ) )
            // InternalPerfectML.g:1275:1: ( 'Use' )
            {
            // InternalPerfectML.g:1275:1: ( 'Use' )
            // InternalPerfectML.g:1276:2: 'Use'
            {
             before(grammarAccess.getAlgorithmAccess().getUseKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__0__Impl"


    // $ANTLR start "rule__Algorithm__Group__1"
    // InternalPerfectML.g:1285:1: rule__Algorithm__Group__1 : rule__Algorithm__Group__1__Impl ;
    public final void rule__Algorithm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1289:1: ( rule__Algorithm__Group__1__Impl )
            // InternalPerfectML.g:1290:2: rule__Algorithm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__1"


    // $ANTLR start "rule__Algorithm__Group__1__Impl"
    // InternalPerfectML.g:1296:1: rule__Algorithm__Group__1__Impl : ( ( rule__Algorithm__Alternatives_1 ) ) ;
    public final void rule__Algorithm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1300:1: ( ( ( rule__Algorithm__Alternatives_1 ) ) )
            // InternalPerfectML.g:1301:1: ( ( rule__Algorithm__Alternatives_1 ) )
            {
            // InternalPerfectML.g:1301:1: ( ( rule__Algorithm__Alternatives_1 ) )
            // InternalPerfectML.g:1302:2: ( rule__Algorithm__Alternatives_1 )
            {
             before(grammarAccess.getAlgorithmAccess().getAlternatives_1()); 
            // InternalPerfectML.g:1303:2: ( rule__Algorithm__Alternatives_1 )
            // InternalPerfectML.g:1303:3: rule__Algorithm__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__0"
    // InternalPerfectML.g:1312:1: rule__MLPClassifier__Group__0 : rule__MLPClassifier__Group__0__Impl rule__MLPClassifier__Group__1 ;
    public final void rule__MLPClassifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1316:1: ( rule__MLPClassifier__Group__0__Impl rule__MLPClassifier__Group__1 )
            // InternalPerfectML.g:1317:2: rule__MLPClassifier__Group__0__Impl rule__MLPClassifier__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__MLPClassifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__0"


    // $ANTLR start "rule__MLPClassifier__Group__0__Impl"
    // InternalPerfectML.g:1324:1: rule__MLPClassifier__Group__0__Impl : ( () ) ;
    public final void rule__MLPClassifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1328:1: ( ( () ) )
            // InternalPerfectML.g:1329:1: ( () )
            {
            // InternalPerfectML.g:1329:1: ( () )
            // InternalPerfectML.g:1330:2: ()
            {
             before(grammarAccess.getMLPClassifierAccess().getMLPClassifierAction_0()); 
            // InternalPerfectML.g:1331:2: ()
            // InternalPerfectML.g:1331:3: 
            {
            }

             after(grammarAccess.getMLPClassifierAccess().getMLPClassifierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__1"
    // InternalPerfectML.g:1339:1: rule__MLPClassifier__Group__1 : rule__MLPClassifier__Group__1__Impl rule__MLPClassifier__Group__2 ;
    public final void rule__MLPClassifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1343:1: ( rule__MLPClassifier__Group__1__Impl rule__MLPClassifier__Group__2 )
            // InternalPerfectML.g:1344:2: rule__MLPClassifier__Group__1__Impl rule__MLPClassifier__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__MLPClassifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__1"


    // $ANTLR start "rule__MLPClassifier__Group__1__Impl"
    // InternalPerfectML.g:1351:1: rule__MLPClassifier__Group__1__Impl : ( 'MLPClassifier' ) ;
    public final void rule__MLPClassifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1355:1: ( ( 'MLPClassifier' ) )
            // InternalPerfectML.g:1356:1: ( 'MLPClassifier' )
            {
            // InternalPerfectML.g:1356:1: ( 'MLPClassifier' )
            // InternalPerfectML.g:1357:2: 'MLPClassifier'
            {
             before(grammarAccess.getMLPClassifierAccess().getMLPClassifierKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getMLPClassifierKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__2"
    // InternalPerfectML.g:1366:1: rule__MLPClassifier__Group__2 : rule__MLPClassifier__Group__2__Impl rule__MLPClassifier__Group__3 ;
    public final void rule__MLPClassifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1370:1: ( rule__MLPClassifier__Group__2__Impl rule__MLPClassifier__Group__3 )
            // InternalPerfectML.g:1371:2: rule__MLPClassifier__Group__2__Impl rule__MLPClassifier__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__2"


    // $ANTLR start "rule__MLPClassifier__Group__2__Impl"
    // InternalPerfectML.g:1378:1: rule__MLPClassifier__Group__2__Impl : ( 'with' ) ;
    public final void rule__MLPClassifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1382:1: ( ( 'with' ) )
            // InternalPerfectML.g:1383:1: ( 'with' )
            {
            // InternalPerfectML.g:1383:1: ( 'with' )
            // InternalPerfectML.g:1384:2: 'with'
            {
             before(grammarAccess.getMLPClassifierAccess().getWithKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__3"
    // InternalPerfectML.g:1393:1: rule__MLPClassifier__Group__3 : rule__MLPClassifier__Group__3__Impl rule__MLPClassifier__Group__4 ;
    public final void rule__MLPClassifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1397:1: ( rule__MLPClassifier__Group__3__Impl rule__MLPClassifier__Group__4 )
            // InternalPerfectML.g:1398:2: rule__MLPClassifier__Group__3__Impl rule__MLPClassifier__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__3"


    // $ANTLR start "rule__MLPClassifier__Group__3__Impl"
    // InternalPerfectML.g:1405:1: rule__MLPClassifier__Group__3__Impl : ( ( rule__MLPClassifier__Group_3__0 )? ) ;
    public final void rule__MLPClassifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1409:1: ( ( ( rule__MLPClassifier__Group_3__0 )? ) )
            // InternalPerfectML.g:1410:1: ( ( rule__MLPClassifier__Group_3__0 )? )
            {
            // InternalPerfectML.g:1410:1: ( ( rule__MLPClassifier__Group_3__0 )? )
            // InternalPerfectML.g:1411:2: ( rule__MLPClassifier__Group_3__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_3()); 
            // InternalPerfectML.g:1412:2: ( rule__MLPClassifier__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==65) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPerfectML.g:1412:3: rule__MLPClassifier__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__3__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__4"
    // InternalPerfectML.g:1420:1: rule__MLPClassifier__Group__4 : rule__MLPClassifier__Group__4__Impl rule__MLPClassifier__Group__5 ;
    public final void rule__MLPClassifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1424:1: ( rule__MLPClassifier__Group__4__Impl rule__MLPClassifier__Group__5 )
            // InternalPerfectML.g:1425:2: rule__MLPClassifier__Group__4__Impl rule__MLPClassifier__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__4"


    // $ANTLR start "rule__MLPClassifier__Group__4__Impl"
    // InternalPerfectML.g:1432:1: rule__MLPClassifier__Group__4__Impl : ( ( rule__MLPClassifier__Group_4__0 )? ) ;
    public final void rule__MLPClassifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1436:1: ( ( ( rule__MLPClassifier__Group_4__0 )? ) )
            // InternalPerfectML.g:1437:1: ( ( rule__MLPClassifier__Group_4__0 )? )
            {
            // InternalPerfectML.g:1437:1: ( ( rule__MLPClassifier__Group_4__0 )? )
            // InternalPerfectML.g:1438:2: ( rule__MLPClassifier__Group_4__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_4()); 
            // InternalPerfectML.g:1439:2: ( rule__MLPClassifier__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==66) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPerfectML.g:1439:3: rule__MLPClassifier__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__4__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__5"
    // InternalPerfectML.g:1447:1: rule__MLPClassifier__Group__5 : rule__MLPClassifier__Group__5__Impl rule__MLPClassifier__Group__6 ;
    public final void rule__MLPClassifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1451:1: ( rule__MLPClassifier__Group__5__Impl rule__MLPClassifier__Group__6 )
            // InternalPerfectML.g:1452:2: rule__MLPClassifier__Group__5__Impl rule__MLPClassifier__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__5"


    // $ANTLR start "rule__MLPClassifier__Group__5__Impl"
    // InternalPerfectML.g:1459:1: rule__MLPClassifier__Group__5__Impl : ( ( rule__MLPClassifier__Group_5__0 )? ) ;
    public final void rule__MLPClassifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1463:1: ( ( ( rule__MLPClassifier__Group_5__0 )? ) )
            // InternalPerfectML.g:1464:1: ( ( rule__MLPClassifier__Group_5__0 )? )
            {
            // InternalPerfectML.g:1464:1: ( ( rule__MLPClassifier__Group_5__0 )? )
            // InternalPerfectML.g:1465:2: ( rule__MLPClassifier__Group_5__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_5()); 
            // InternalPerfectML.g:1466:2: ( rule__MLPClassifier__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==67) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPerfectML.g:1466:3: rule__MLPClassifier__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__5__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__6"
    // InternalPerfectML.g:1474:1: rule__MLPClassifier__Group__6 : rule__MLPClassifier__Group__6__Impl rule__MLPClassifier__Group__7 ;
    public final void rule__MLPClassifier__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1478:1: ( rule__MLPClassifier__Group__6__Impl rule__MLPClassifier__Group__7 )
            // InternalPerfectML.g:1479:2: rule__MLPClassifier__Group__6__Impl rule__MLPClassifier__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__6"


    // $ANTLR start "rule__MLPClassifier__Group__6__Impl"
    // InternalPerfectML.g:1486:1: rule__MLPClassifier__Group__6__Impl : ( ( rule__MLPClassifier__Group_6__0 )? ) ;
    public final void rule__MLPClassifier__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1490:1: ( ( ( rule__MLPClassifier__Group_6__0 )? ) )
            // InternalPerfectML.g:1491:1: ( ( rule__MLPClassifier__Group_6__0 )? )
            {
            // InternalPerfectML.g:1491:1: ( ( rule__MLPClassifier__Group_6__0 )? )
            // InternalPerfectML.g:1492:2: ( rule__MLPClassifier__Group_6__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_6()); 
            // InternalPerfectML.g:1493:2: ( rule__MLPClassifier__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==68) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPerfectML.g:1493:3: rule__MLPClassifier__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__6__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__7"
    // InternalPerfectML.g:1501:1: rule__MLPClassifier__Group__7 : rule__MLPClassifier__Group__7__Impl rule__MLPClassifier__Group__8 ;
    public final void rule__MLPClassifier__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1505:1: ( rule__MLPClassifier__Group__7__Impl rule__MLPClassifier__Group__8 )
            // InternalPerfectML.g:1506:2: rule__MLPClassifier__Group__7__Impl rule__MLPClassifier__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__7"


    // $ANTLR start "rule__MLPClassifier__Group__7__Impl"
    // InternalPerfectML.g:1513:1: rule__MLPClassifier__Group__7__Impl : ( ( rule__MLPClassifier__Group_7__0 )? ) ;
    public final void rule__MLPClassifier__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1517:1: ( ( ( rule__MLPClassifier__Group_7__0 )? ) )
            // InternalPerfectML.g:1518:1: ( ( rule__MLPClassifier__Group_7__0 )? )
            {
            // InternalPerfectML.g:1518:1: ( ( rule__MLPClassifier__Group_7__0 )? )
            // InternalPerfectML.g:1519:2: ( rule__MLPClassifier__Group_7__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_7()); 
            // InternalPerfectML.g:1520:2: ( rule__MLPClassifier__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==69) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPerfectML.g:1520:3: rule__MLPClassifier__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__7__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__8"
    // InternalPerfectML.g:1528:1: rule__MLPClassifier__Group__8 : rule__MLPClassifier__Group__8__Impl rule__MLPClassifier__Group__9 ;
    public final void rule__MLPClassifier__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1532:1: ( rule__MLPClassifier__Group__8__Impl rule__MLPClassifier__Group__9 )
            // InternalPerfectML.g:1533:2: rule__MLPClassifier__Group__8__Impl rule__MLPClassifier__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__8"


    // $ANTLR start "rule__MLPClassifier__Group__8__Impl"
    // InternalPerfectML.g:1540:1: rule__MLPClassifier__Group__8__Impl : ( ( rule__MLPClassifier__Group_8__0 )? ) ;
    public final void rule__MLPClassifier__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1544:1: ( ( ( rule__MLPClassifier__Group_8__0 )? ) )
            // InternalPerfectML.g:1545:1: ( ( rule__MLPClassifier__Group_8__0 )? )
            {
            // InternalPerfectML.g:1545:1: ( ( rule__MLPClassifier__Group_8__0 )? )
            // InternalPerfectML.g:1546:2: ( rule__MLPClassifier__Group_8__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_8()); 
            // InternalPerfectML.g:1547:2: ( rule__MLPClassifier__Group_8__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==70) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPerfectML.g:1547:3: rule__MLPClassifier__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__8__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__9"
    // InternalPerfectML.g:1555:1: rule__MLPClassifier__Group__9 : rule__MLPClassifier__Group__9__Impl rule__MLPClassifier__Group__10 ;
    public final void rule__MLPClassifier__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1559:1: ( rule__MLPClassifier__Group__9__Impl rule__MLPClassifier__Group__10 )
            // InternalPerfectML.g:1560:2: rule__MLPClassifier__Group__9__Impl rule__MLPClassifier__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__9"


    // $ANTLR start "rule__MLPClassifier__Group__9__Impl"
    // InternalPerfectML.g:1567:1: rule__MLPClassifier__Group__9__Impl : ( ( rule__MLPClassifier__Group_9__0 )? ) ;
    public final void rule__MLPClassifier__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1571:1: ( ( ( rule__MLPClassifier__Group_9__0 )? ) )
            // InternalPerfectML.g:1572:1: ( ( rule__MLPClassifier__Group_9__0 )? )
            {
            // InternalPerfectML.g:1572:1: ( ( rule__MLPClassifier__Group_9__0 )? )
            // InternalPerfectML.g:1573:2: ( rule__MLPClassifier__Group_9__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_9()); 
            // InternalPerfectML.g:1574:2: ( rule__MLPClassifier__Group_9__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==71) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPerfectML.g:1574:3: rule__MLPClassifier__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__9__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__10"
    // InternalPerfectML.g:1582:1: rule__MLPClassifier__Group__10 : rule__MLPClassifier__Group__10__Impl rule__MLPClassifier__Group__11 ;
    public final void rule__MLPClassifier__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1586:1: ( rule__MLPClassifier__Group__10__Impl rule__MLPClassifier__Group__11 )
            // InternalPerfectML.g:1587:2: rule__MLPClassifier__Group__10__Impl rule__MLPClassifier__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__10"


    // $ANTLR start "rule__MLPClassifier__Group__10__Impl"
    // InternalPerfectML.g:1594:1: rule__MLPClassifier__Group__10__Impl : ( ( rule__MLPClassifier__Group_10__0 )? ) ;
    public final void rule__MLPClassifier__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1598:1: ( ( ( rule__MLPClassifier__Group_10__0 )? ) )
            // InternalPerfectML.g:1599:1: ( ( rule__MLPClassifier__Group_10__0 )? )
            {
            // InternalPerfectML.g:1599:1: ( ( rule__MLPClassifier__Group_10__0 )? )
            // InternalPerfectML.g:1600:2: ( rule__MLPClassifier__Group_10__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_10()); 
            // InternalPerfectML.g:1601:2: ( rule__MLPClassifier__Group_10__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==72) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPerfectML.g:1601:3: rule__MLPClassifier__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__10__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__11"
    // InternalPerfectML.g:1609:1: rule__MLPClassifier__Group__11 : rule__MLPClassifier__Group__11__Impl rule__MLPClassifier__Group__12 ;
    public final void rule__MLPClassifier__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1613:1: ( rule__MLPClassifier__Group__11__Impl rule__MLPClassifier__Group__12 )
            // InternalPerfectML.g:1614:2: rule__MLPClassifier__Group__11__Impl rule__MLPClassifier__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__11"


    // $ANTLR start "rule__MLPClassifier__Group__11__Impl"
    // InternalPerfectML.g:1621:1: rule__MLPClassifier__Group__11__Impl : ( ( rule__MLPClassifier__Group_11__0 )? ) ;
    public final void rule__MLPClassifier__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1625:1: ( ( ( rule__MLPClassifier__Group_11__0 )? ) )
            // InternalPerfectML.g:1626:1: ( ( rule__MLPClassifier__Group_11__0 )? )
            {
            // InternalPerfectML.g:1626:1: ( ( rule__MLPClassifier__Group_11__0 )? )
            // InternalPerfectML.g:1627:2: ( rule__MLPClassifier__Group_11__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_11()); 
            // InternalPerfectML.g:1628:2: ( rule__MLPClassifier__Group_11__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==73) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPerfectML.g:1628:3: rule__MLPClassifier__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__11__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__12"
    // InternalPerfectML.g:1636:1: rule__MLPClassifier__Group__12 : rule__MLPClassifier__Group__12__Impl rule__MLPClassifier__Group__13 ;
    public final void rule__MLPClassifier__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1640:1: ( rule__MLPClassifier__Group__12__Impl rule__MLPClassifier__Group__13 )
            // InternalPerfectML.g:1641:2: rule__MLPClassifier__Group__12__Impl rule__MLPClassifier__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__12"


    // $ANTLR start "rule__MLPClassifier__Group__12__Impl"
    // InternalPerfectML.g:1648:1: rule__MLPClassifier__Group__12__Impl : ( ( rule__MLPClassifier__Group_12__0 )? ) ;
    public final void rule__MLPClassifier__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1652:1: ( ( ( rule__MLPClassifier__Group_12__0 )? ) )
            // InternalPerfectML.g:1653:1: ( ( rule__MLPClassifier__Group_12__0 )? )
            {
            // InternalPerfectML.g:1653:1: ( ( rule__MLPClassifier__Group_12__0 )? )
            // InternalPerfectML.g:1654:2: ( rule__MLPClassifier__Group_12__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_12()); 
            // InternalPerfectML.g:1655:2: ( rule__MLPClassifier__Group_12__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==74) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPerfectML.g:1655:3: rule__MLPClassifier__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__12__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__13"
    // InternalPerfectML.g:1663:1: rule__MLPClassifier__Group__13 : rule__MLPClassifier__Group__13__Impl rule__MLPClassifier__Group__14 ;
    public final void rule__MLPClassifier__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1667:1: ( rule__MLPClassifier__Group__13__Impl rule__MLPClassifier__Group__14 )
            // InternalPerfectML.g:1668:2: rule__MLPClassifier__Group__13__Impl rule__MLPClassifier__Group__14
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__13"


    // $ANTLR start "rule__MLPClassifier__Group__13__Impl"
    // InternalPerfectML.g:1675:1: rule__MLPClassifier__Group__13__Impl : ( ( rule__MLPClassifier__Group_13__0 )? ) ;
    public final void rule__MLPClassifier__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1679:1: ( ( ( rule__MLPClassifier__Group_13__0 )? ) )
            // InternalPerfectML.g:1680:1: ( ( rule__MLPClassifier__Group_13__0 )? )
            {
            // InternalPerfectML.g:1680:1: ( ( rule__MLPClassifier__Group_13__0 )? )
            // InternalPerfectML.g:1681:2: ( rule__MLPClassifier__Group_13__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_13()); 
            // InternalPerfectML.g:1682:2: ( rule__MLPClassifier__Group_13__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==75) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPerfectML.g:1682:3: rule__MLPClassifier__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__13__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__14"
    // InternalPerfectML.g:1690:1: rule__MLPClassifier__Group__14 : rule__MLPClassifier__Group__14__Impl rule__MLPClassifier__Group__15 ;
    public final void rule__MLPClassifier__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1694:1: ( rule__MLPClassifier__Group__14__Impl rule__MLPClassifier__Group__15 )
            // InternalPerfectML.g:1695:2: rule__MLPClassifier__Group__14__Impl rule__MLPClassifier__Group__15
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__14"


    // $ANTLR start "rule__MLPClassifier__Group__14__Impl"
    // InternalPerfectML.g:1702:1: rule__MLPClassifier__Group__14__Impl : ( ( rule__MLPClassifier__Group_14__0 )? ) ;
    public final void rule__MLPClassifier__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1706:1: ( ( ( rule__MLPClassifier__Group_14__0 )? ) )
            // InternalPerfectML.g:1707:1: ( ( rule__MLPClassifier__Group_14__0 )? )
            {
            // InternalPerfectML.g:1707:1: ( ( rule__MLPClassifier__Group_14__0 )? )
            // InternalPerfectML.g:1708:2: ( rule__MLPClassifier__Group_14__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_14()); 
            // InternalPerfectML.g:1709:2: ( rule__MLPClassifier__Group_14__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==76) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPerfectML.g:1709:3: rule__MLPClassifier__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__14__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__15"
    // InternalPerfectML.g:1717:1: rule__MLPClassifier__Group__15 : rule__MLPClassifier__Group__15__Impl rule__MLPClassifier__Group__16 ;
    public final void rule__MLPClassifier__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1721:1: ( rule__MLPClassifier__Group__15__Impl rule__MLPClassifier__Group__16 )
            // InternalPerfectML.g:1722:2: rule__MLPClassifier__Group__15__Impl rule__MLPClassifier__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__15"


    // $ANTLR start "rule__MLPClassifier__Group__15__Impl"
    // InternalPerfectML.g:1729:1: rule__MLPClassifier__Group__15__Impl : ( ( rule__MLPClassifier__Group_15__0 )? ) ;
    public final void rule__MLPClassifier__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1733:1: ( ( ( rule__MLPClassifier__Group_15__0 )? ) )
            // InternalPerfectML.g:1734:1: ( ( rule__MLPClassifier__Group_15__0 )? )
            {
            // InternalPerfectML.g:1734:1: ( ( rule__MLPClassifier__Group_15__0 )? )
            // InternalPerfectML.g:1735:2: ( rule__MLPClassifier__Group_15__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_15()); 
            // InternalPerfectML.g:1736:2: ( rule__MLPClassifier__Group_15__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==77) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPerfectML.g:1736:3: rule__MLPClassifier__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__15__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__16"
    // InternalPerfectML.g:1744:1: rule__MLPClassifier__Group__16 : rule__MLPClassifier__Group__16__Impl rule__MLPClassifier__Group__17 ;
    public final void rule__MLPClassifier__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1748:1: ( rule__MLPClassifier__Group__16__Impl rule__MLPClassifier__Group__17 )
            // InternalPerfectML.g:1749:2: rule__MLPClassifier__Group__16__Impl rule__MLPClassifier__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__16"


    // $ANTLR start "rule__MLPClassifier__Group__16__Impl"
    // InternalPerfectML.g:1756:1: rule__MLPClassifier__Group__16__Impl : ( ( rule__MLPClassifier__Group_16__0 )? ) ;
    public final void rule__MLPClassifier__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1760:1: ( ( ( rule__MLPClassifier__Group_16__0 )? ) )
            // InternalPerfectML.g:1761:1: ( ( rule__MLPClassifier__Group_16__0 )? )
            {
            // InternalPerfectML.g:1761:1: ( ( rule__MLPClassifier__Group_16__0 )? )
            // InternalPerfectML.g:1762:2: ( rule__MLPClassifier__Group_16__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_16()); 
            // InternalPerfectML.g:1763:2: ( rule__MLPClassifier__Group_16__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==78) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPerfectML.g:1763:3: rule__MLPClassifier__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__16__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__17"
    // InternalPerfectML.g:1771:1: rule__MLPClassifier__Group__17 : rule__MLPClassifier__Group__17__Impl rule__MLPClassifier__Group__18 ;
    public final void rule__MLPClassifier__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1775:1: ( rule__MLPClassifier__Group__17__Impl rule__MLPClassifier__Group__18 )
            // InternalPerfectML.g:1776:2: rule__MLPClassifier__Group__17__Impl rule__MLPClassifier__Group__18
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__17"


    // $ANTLR start "rule__MLPClassifier__Group__17__Impl"
    // InternalPerfectML.g:1783:1: rule__MLPClassifier__Group__17__Impl : ( ( rule__MLPClassifier__Group_17__0 )? ) ;
    public final void rule__MLPClassifier__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1787:1: ( ( ( rule__MLPClassifier__Group_17__0 )? ) )
            // InternalPerfectML.g:1788:1: ( ( rule__MLPClassifier__Group_17__0 )? )
            {
            // InternalPerfectML.g:1788:1: ( ( rule__MLPClassifier__Group_17__0 )? )
            // InternalPerfectML.g:1789:2: ( rule__MLPClassifier__Group_17__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_17()); 
            // InternalPerfectML.g:1790:2: ( rule__MLPClassifier__Group_17__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==79) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPerfectML.g:1790:3: rule__MLPClassifier__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__17__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__18"
    // InternalPerfectML.g:1798:1: rule__MLPClassifier__Group__18 : rule__MLPClassifier__Group__18__Impl rule__MLPClassifier__Group__19 ;
    public final void rule__MLPClassifier__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1802:1: ( rule__MLPClassifier__Group__18__Impl rule__MLPClassifier__Group__19 )
            // InternalPerfectML.g:1803:2: rule__MLPClassifier__Group__18__Impl rule__MLPClassifier__Group__19
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__18"


    // $ANTLR start "rule__MLPClassifier__Group__18__Impl"
    // InternalPerfectML.g:1810:1: rule__MLPClassifier__Group__18__Impl : ( ( rule__MLPClassifier__Group_18__0 )? ) ;
    public final void rule__MLPClassifier__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1814:1: ( ( ( rule__MLPClassifier__Group_18__0 )? ) )
            // InternalPerfectML.g:1815:1: ( ( rule__MLPClassifier__Group_18__0 )? )
            {
            // InternalPerfectML.g:1815:1: ( ( rule__MLPClassifier__Group_18__0 )? )
            // InternalPerfectML.g:1816:2: ( rule__MLPClassifier__Group_18__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_18()); 
            // InternalPerfectML.g:1817:2: ( rule__MLPClassifier__Group_18__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==80) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPerfectML.g:1817:3: rule__MLPClassifier__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_18__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__18__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__19"
    // InternalPerfectML.g:1825:1: rule__MLPClassifier__Group__19 : rule__MLPClassifier__Group__19__Impl rule__MLPClassifier__Group__20 ;
    public final void rule__MLPClassifier__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1829:1: ( rule__MLPClassifier__Group__19__Impl rule__MLPClassifier__Group__20 )
            // InternalPerfectML.g:1830:2: rule__MLPClassifier__Group__19__Impl rule__MLPClassifier__Group__20
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__19"


    // $ANTLR start "rule__MLPClassifier__Group__19__Impl"
    // InternalPerfectML.g:1837:1: rule__MLPClassifier__Group__19__Impl : ( ( rule__MLPClassifier__Group_19__0 )? ) ;
    public final void rule__MLPClassifier__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1841:1: ( ( ( rule__MLPClassifier__Group_19__0 )? ) )
            // InternalPerfectML.g:1842:1: ( ( rule__MLPClassifier__Group_19__0 )? )
            {
            // InternalPerfectML.g:1842:1: ( ( rule__MLPClassifier__Group_19__0 )? )
            // InternalPerfectML.g:1843:2: ( rule__MLPClassifier__Group_19__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_19()); 
            // InternalPerfectML.g:1844:2: ( rule__MLPClassifier__Group_19__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==81) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPerfectML.g:1844:3: rule__MLPClassifier__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__19__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__20"
    // InternalPerfectML.g:1852:1: rule__MLPClassifier__Group__20 : rule__MLPClassifier__Group__20__Impl rule__MLPClassifier__Group__21 ;
    public final void rule__MLPClassifier__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1856:1: ( rule__MLPClassifier__Group__20__Impl rule__MLPClassifier__Group__21 )
            // InternalPerfectML.g:1857:2: rule__MLPClassifier__Group__20__Impl rule__MLPClassifier__Group__21
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__20"


    // $ANTLR start "rule__MLPClassifier__Group__20__Impl"
    // InternalPerfectML.g:1864:1: rule__MLPClassifier__Group__20__Impl : ( ( rule__MLPClassifier__Group_20__0 )? ) ;
    public final void rule__MLPClassifier__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1868:1: ( ( ( rule__MLPClassifier__Group_20__0 )? ) )
            // InternalPerfectML.g:1869:1: ( ( rule__MLPClassifier__Group_20__0 )? )
            {
            // InternalPerfectML.g:1869:1: ( ( rule__MLPClassifier__Group_20__0 )? )
            // InternalPerfectML.g:1870:2: ( rule__MLPClassifier__Group_20__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_20()); 
            // InternalPerfectML.g:1871:2: ( rule__MLPClassifier__Group_20__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==82) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPerfectML.g:1871:3: rule__MLPClassifier__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_20__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__20__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__21"
    // InternalPerfectML.g:1879:1: rule__MLPClassifier__Group__21 : rule__MLPClassifier__Group__21__Impl rule__MLPClassifier__Group__22 ;
    public final void rule__MLPClassifier__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1883:1: ( rule__MLPClassifier__Group__21__Impl rule__MLPClassifier__Group__22 )
            // InternalPerfectML.g:1884:2: rule__MLPClassifier__Group__21__Impl rule__MLPClassifier__Group__22
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__21"


    // $ANTLR start "rule__MLPClassifier__Group__21__Impl"
    // InternalPerfectML.g:1891:1: rule__MLPClassifier__Group__21__Impl : ( ( rule__MLPClassifier__Group_21__0 )? ) ;
    public final void rule__MLPClassifier__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1895:1: ( ( ( rule__MLPClassifier__Group_21__0 )? ) )
            // InternalPerfectML.g:1896:1: ( ( rule__MLPClassifier__Group_21__0 )? )
            {
            // InternalPerfectML.g:1896:1: ( ( rule__MLPClassifier__Group_21__0 )? )
            // InternalPerfectML.g:1897:2: ( rule__MLPClassifier__Group_21__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_21()); 
            // InternalPerfectML.g:1898:2: ( rule__MLPClassifier__Group_21__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==83) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPerfectML.g:1898:3: rule__MLPClassifier__Group_21__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_21__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__21__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__22"
    // InternalPerfectML.g:1906:1: rule__MLPClassifier__Group__22 : rule__MLPClassifier__Group__22__Impl rule__MLPClassifier__Group__23 ;
    public final void rule__MLPClassifier__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1910:1: ( rule__MLPClassifier__Group__22__Impl rule__MLPClassifier__Group__23 )
            // InternalPerfectML.g:1911:2: rule__MLPClassifier__Group__22__Impl rule__MLPClassifier__Group__23
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__22"


    // $ANTLR start "rule__MLPClassifier__Group__22__Impl"
    // InternalPerfectML.g:1918:1: rule__MLPClassifier__Group__22__Impl : ( ( rule__MLPClassifier__Group_22__0 )? ) ;
    public final void rule__MLPClassifier__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1922:1: ( ( ( rule__MLPClassifier__Group_22__0 )? ) )
            // InternalPerfectML.g:1923:1: ( ( rule__MLPClassifier__Group_22__0 )? )
            {
            // InternalPerfectML.g:1923:1: ( ( rule__MLPClassifier__Group_22__0 )? )
            // InternalPerfectML.g:1924:2: ( rule__MLPClassifier__Group_22__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_22()); 
            // InternalPerfectML.g:1925:2: ( rule__MLPClassifier__Group_22__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==84) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPerfectML.g:1925:3: rule__MLPClassifier__Group_22__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_22__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__22__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__23"
    // InternalPerfectML.g:1933:1: rule__MLPClassifier__Group__23 : rule__MLPClassifier__Group__23__Impl rule__MLPClassifier__Group__24 ;
    public final void rule__MLPClassifier__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1937:1: ( rule__MLPClassifier__Group__23__Impl rule__MLPClassifier__Group__24 )
            // InternalPerfectML.g:1938:2: rule__MLPClassifier__Group__23__Impl rule__MLPClassifier__Group__24
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__23"


    // $ANTLR start "rule__MLPClassifier__Group__23__Impl"
    // InternalPerfectML.g:1945:1: rule__MLPClassifier__Group__23__Impl : ( ( rule__MLPClassifier__Group_23__0 )? ) ;
    public final void rule__MLPClassifier__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1949:1: ( ( ( rule__MLPClassifier__Group_23__0 )? ) )
            // InternalPerfectML.g:1950:1: ( ( rule__MLPClassifier__Group_23__0 )? )
            {
            // InternalPerfectML.g:1950:1: ( ( rule__MLPClassifier__Group_23__0 )? )
            // InternalPerfectML.g:1951:2: ( rule__MLPClassifier__Group_23__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_23()); 
            // InternalPerfectML.g:1952:2: ( rule__MLPClassifier__Group_23__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==85) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPerfectML.g:1952:3: rule__MLPClassifier__Group_23__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_23__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__23__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__24"
    // InternalPerfectML.g:1960:1: rule__MLPClassifier__Group__24 : rule__MLPClassifier__Group__24__Impl rule__MLPClassifier__Group__25 ;
    public final void rule__MLPClassifier__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1964:1: ( rule__MLPClassifier__Group__24__Impl rule__MLPClassifier__Group__25 )
            // InternalPerfectML.g:1965:2: rule__MLPClassifier__Group__24__Impl rule__MLPClassifier__Group__25
            {
            pushFollow(FOLLOW_15);
            rule__MLPClassifier__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__24"


    // $ANTLR start "rule__MLPClassifier__Group__24__Impl"
    // InternalPerfectML.g:1972:1: rule__MLPClassifier__Group__24__Impl : ( ( rule__MLPClassifier__Group_24__0 )? ) ;
    public final void rule__MLPClassifier__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1976:1: ( ( ( rule__MLPClassifier__Group_24__0 )? ) )
            // InternalPerfectML.g:1977:1: ( ( rule__MLPClassifier__Group_24__0 )? )
            {
            // InternalPerfectML.g:1977:1: ( ( rule__MLPClassifier__Group_24__0 )? )
            // InternalPerfectML.g:1978:2: ( rule__MLPClassifier__Group_24__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_24()); 
            // InternalPerfectML.g:1979:2: ( rule__MLPClassifier__Group_24__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==86) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPerfectML.g:1979:3: rule__MLPClassifier__Group_24__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_24__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__24__Impl"


    // $ANTLR start "rule__MLPClassifier__Group__25"
    // InternalPerfectML.g:1987:1: rule__MLPClassifier__Group__25 : rule__MLPClassifier__Group__25__Impl ;
    public final void rule__MLPClassifier__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:1991:1: ( rule__MLPClassifier__Group__25__Impl )
            // InternalPerfectML.g:1992:2: rule__MLPClassifier__Group__25__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group__25__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__25"


    // $ANTLR start "rule__MLPClassifier__Group__25__Impl"
    // InternalPerfectML.g:1998:1: rule__MLPClassifier__Group__25__Impl : ( ( rule__MLPClassifier__Group_25__0 )? ) ;
    public final void rule__MLPClassifier__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2002:1: ( ( ( rule__MLPClassifier__Group_25__0 )? ) )
            // InternalPerfectML.g:2003:1: ( ( rule__MLPClassifier__Group_25__0 )? )
            {
            // InternalPerfectML.g:2003:1: ( ( rule__MLPClassifier__Group_25__0 )? )
            // InternalPerfectML.g:2004:2: ( rule__MLPClassifier__Group_25__0 )?
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_25()); 
            // InternalPerfectML.g:2005:2: ( rule__MLPClassifier__Group_25__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==87) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPerfectML.g:2005:3: rule__MLPClassifier__Group_25__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLPClassifier__Group_25__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLPClassifierAccess().getGroup_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group__25__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_3__0"
    // InternalPerfectML.g:2014:1: rule__MLPClassifier__Group_3__0 : rule__MLPClassifier__Group_3__0__Impl rule__MLPClassifier__Group_3__1 ;
    public final void rule__MLPClassifier__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2018:1: ( rule__MLPClassifier__Group_3__0__Impl rule__MLPClassifier__Group_3__1 )
            // InternalPerfectML.g:2019:2: rule__MLPClassifier__Group_3__0__Impl rule__MLPClassifier__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3__0"


    // $ANTLR start "rule__MLPClassifier__Group_3__0__Impl"
    // InternalPerfectML.g:2026:1: rule__MLPClassifier__Group_3__0__Impl : ( ( rule__MLPClassifier__Hidden_layer_sizes_defAssignment_3_0 ) ) ;
    public final void rule__MLPClassifier__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2030:1: ( ( ( rule__MLPClassifier__Hidden_layer_sizes_defAssignment_3_0 ) ) )
            // InternalPerfectML.g:2031:1: ( ( rule__MLPClassifier__Hidden_layer_sizes_defAssignment_3_0 ) )
            {
            // InternalPerfectML.g:2031:1: ( ( rule__MLPClassifier__Hidden_layer_sizes_defAssignment_3_0 ) )
            // InternalPerfectML.g:2032:2: ( rule__MLPClassifier__Hidden_layer_sizes_defAssignment_3_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizes_defAssignment_3_0()); 
            // InternalPerfectML.g:2033:2: ( rule__MLPClassifier__Hidden_layer_sizes_defAssignment_3_0 )
            // InternalPerfectML.g:2033:3: rule__MLPClassifier__Hidden_layer_sizes_defAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Hidden_layer_sizes_defAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizes_defAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_3__1"
    // InternalPerfectML.g:2041:1: rule__MLPClassifier__Group_3__1 : rule__MLPClassifier__Group_3__1__Impl rule__MLPClassifier__Group_3__2 ;
    public final void rule__MLPClassifier__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2045:1: ( rule__MLPClassifier__Group_3__1__Impl rule__MLPClassifier__Group_3__2 )
            // InternalPerfectML.g:2046:2: rule__MLPClassifier__Group_3__1__Impl rule__MLPClassifier__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__MLPClassifier__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3__1"


    // $ANTLR start "rule__MLPClassifier__Group_3__1__Impl"
    // InternalPerfectML.g:2053:1: rule__MLPClassifier__Group_3__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2057:1: ( ( '=' ) )
            // InternalPerfectML.g:2058:1: ( '=' )
            {
            // InternalPerfectML.g:2058:1: ( '=' )
            // InternalPerfectML.g:2059:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_3_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_3__2"
    // InternalPerfectML.g:2068:1: rule__MLPClassifier__Group_3__2 : rule__MLPClassifier__Group_3__2__Impl rule__MLPClassifier__Group_3__3 ;
    public final void rule__MLPClassifier__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2072:1: ( rule__MLPClassifier__Group_3__2__Impl rule__MLPClassifier__Group_3__3 )
            // InternalPerfectML.g:2073:2: rule__MLPClassifier__Group_3__2__Impl rule__MLPClassifier__Group_3__3
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3__2"


    // $ANTLR start "rule__MLPClassifier__Group_3__2__Impl"
    // InternalPerfectML.g:2080:1: rule__MLPClassifier__Group_3__2__Impl : ( '(' ) ;
    public final void rule__MLPClassifier__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2084:1: ( ( '(' ) )
            // InternalPerfectML.g:2085:1: ( '(' )
            {
            // InternalPerfectML.g:2085:1: ( '(' )
            // InternalPerfectML.g:2086:2: '('
            {
             before(grammarAccess.getMLPClassifierAccess().getLeftParenthesisKeyword_3_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getLeftParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_3__3"
    // InternalPerfectML.g:2095:1: rule__MLPClassifier__Group_3__3 : rule__MLPClassifier__Group_3__3__Impl rule__MLPClassifier__Group_3__4 ;
    public final void rule__MLPClassifier__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2099:1: ( rule__MLPClassifier__Group_3__3__Impl rule__MLPClassifier__Group_3__4 )
            // InternalPerfectML.g:2100:2: rule__MLPClassifier__Group_3__3__Impl rule__MLPClassifier__Group_3__4
            {
            pushFollow(FOLLOW_19);
            rule__MLPClassifier__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3__3"


    // $ANTLR start "rule__MLPClassifier__Group_3__3__Impl"
    // InternalPerfectML.g:2107:1: rule__MLPClassifier__Group_3__3__Impl : ( ( rule__MLPClassifier__Hidden_layer_sizesAssignment_3_3 ) ) ;
    public final void rule__MLPClassifier__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2111:1: ( ( ( rule__MLPClassifier__Hidden_layer_sizesAssignment_3_3 ) ) )
            // InternalPerfectML.g:2112:1: ( ( rule__MLPClassifier__Hidden_layer_sizesAssignment_3_3 ) )
            {
            // InternalPerfectML.g:2112:1: ( ( rule__MLPClassifier__Hidden_layer_sizesAssignment_3_3 ) )
            // InternalPerfectML.g:2113:2: ( rule__MLPClassifier__Hidden_layer_sizesAssignment_3_3 )
            {
             before(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizesAssignment_3_3()); 
            // InternalPerfectML.g:2114:2: ( rule__MLPClassifier__Hidden_layer_sizesAssignment_3_3 )
            // InternalPerfectML.g:2114:3: rule__MLPClassifier__Hidden_layer_sizesAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Hidden_layer_sizesAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizesAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3__3__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_3__4"
    // InternalPerfectML.g:2122:1: rule__MLPClassifier__Group_3__4 : rule__MLPClassifier__Group_3__4__Impl rule__MLPClassifier__Group_3__5 ;
    public final void rule__MLPClassifier__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2126:1: ( rule__MLPClassifier__Group_3__4__Impl rule__MLPClassifier__Group_3__5 )
            // InternalPerfectML.g:2127:2: rule__MLPClassifier__Group_3__4__Impl rule__MLPClassifier__Group_3__5
            {
            pushFollow(FOLLOW_19);
            rule__MLPClassifier__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3__4"


    // $ANTLR start "rule__MLPClassifier__Group_3__4__Impl"
    // InternalPerfectML.g:2134:1: rule__MLPClassifier__Group_3__4__Impl : ( ( rule__MLPClassifier__Group_3_4__0 )* ) ;
    public final void rule__MLPClassifier__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2138:1: ( ( ( rule__MLPClassifier__Group_3_4__0 )* ) )
            // InternalPerfectML.g:2139:1: ( ( rule__MLPClassifier__Group_3_4__0 )* )
            {
            // InternalPerfectML.g:2139:1: ( ( rule__MLPClassifier__Group_3_4__0 )* )
            // InternalPerfectML.g:2140:2: ( rule__MLPClassifier__Group_3_4__0 )*
            {
             before(grammarAccess.getMLPClassifierAccess().getGroup_3_4()); 
            // InternalPerfectML.g:2141:2: ( rule__MLPClassifier__Group_3_4__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==54) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPerfectML.g:2141:3: rule__MLPClassifier__Group_3_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MLPClassifier__Group_3_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getMLPClassifierAccess().getGroup_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3__4__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_3__5"
    // InternalPerfectML.g:2149:1: rule__MLPClassifier__Group_3__5 : rule__MLPClassifier__Group_3__5__Impl ;
    public final void rule__MLPClassifier__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2153:1: ( rule__MLPClassifier__Group_3__5__Impl )
            // InternalPerfectML.g:2154:2: rule__MLPClassifier__Group_3__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_3__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3__5"


    // $ANTLR start "rule__MLPClassifier__Group_3__5__Impl"
    // InternalPerfectML.g:2160:1: rule__MLPClassifier__Group_3__5__Impl : ( ')' ) ;
    public final void rule__MLPClassifier__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2164:1: ( ( ')' ) )
            // InternalPerfectML.g:2165:1: ( ')' )
            {
            // InternalPerfectML.g:2165:1: ( ')' )
            // InternalPerfectML.g:2166:2: ')'
            {
             before(grammarAccess.getMLPClassifierAccess().getRightParenthesisKeyword_3_5()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getRightParenthesisKeyword_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3__5__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_3_4__0"
    // InternalPerfectML.g:2176:1: rule__MLPClassifier__Group_3_4__0 : rule__MLPClassifier__Group_3_4__0__Impl rule__MLPClassifier__Group_3_4__1 ;
    public final void rule__MLPClassifier__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2180:1: ( rule__MLPClassifier__Group_3_4__0__Impl rule__MLPClassifier__Group_3_4__1 )
            // InternalPerfectML.g:2181:2: rule__MLPClassifier__Group_3_4__0__Impl rule__MLPClassifier__Group_3_4__1
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_3_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3_4__0"


    // $ANTLR start "rule__MLPClassifier__Group_3_4__0__Impl"
    // InternalPerfectML.g:2188:1: rule__MLPClassifier__Group_3_4__0__Impl : ( ',' ) ;
    public final void rule__MLPClassifier__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2192:1: ( ( ',' ) )
            // InternalPerfectML.g:2193:1: ( ',' )
            {
            // InternalPerfectML.g:2193:1: ( ',' )
            // InternalPerfectML.g:2194:2: ','
            {
             before(grammarAccess.getMLPClassifierAccess().getCommaKeyword_3_4_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getCommaKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3_4__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_3_4__1"
    // InternalPerfectML.g:2203:1: rule__MLPClassifier__Group_3_4__1 : rule__MLPClassifier__Group_3_4__1__Impl ;
    public final void rule__MLPClassifier__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2207:1: ( rule__MLPClassifier__Group_3_4__1__Impl )
            // InternalPerfectML.g:2208:2: rule__MLPClassifier__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_3_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3_4__1"


    // $ANTLR start "rule__MLPClassifier__Group_3_4__1__Impl"
    // InternalPerfectML.g:2214:1: rule__MLPClassifier__Group_3_4__1__Impl : ( ( rule__MLPClassifier__Hidden_layer_sizesAssignment_3_4_1 ) ) ;
    public final void rule__MLPClassifier__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2218:1: ( ( ( rule__MLPClassifier__Hidden_layer_sizesAssignment_3_4_1 ) ) )
            // InternalPerfectML.g:2219:1: ( ( rule__MLPClassifier__Hidden_layer_sizesAssignment_3_4_1 ) )
            {
            // InternalPerfectML.g:2219:1: ( ( rule__MLPClassifier__Hidden_layer_sizesAssignment_3_4_1 ) )
            // InternalPerfectML.g:2220:2: ( rule__MLPClassifier__Hidden_layer_sizesAssignment_3_4_1 )
            {
             before(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizesAssignment_3_4_1()); 
            // InternalPerfectML.g:2221:2: ( rule__MLPClassifier__Hidden_layer_sizesAssignment_3_4_1 )
            // InternalPerfectML.g:2221:3: rule__MLPClassifier__Hidden_layer_sizesAssignment_3_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Hidden_layer_sizesAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizesAssignment_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_3_4__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_4__0"
    // InternalPerfectML.g:2230:1: rule__MLPClassifier__Group_4__0 : rule__MLPClassifier__Group_4__0__Impl rule__MLPClassifier__Group_4__1 ;
    public final void rule__MLPClassifier__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2234:1: ( rule__MLPClassifier__Group_4__0__Impl rule__MLPClassifier__Group_4__1 )
            // InternalPerfectML.g:2235:2: rule__MLPClassifier__Group_4__0__Impl rule__MLPClassifier__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_4__0"


    // $ANTLR start "rule__MLPClassifier__Group_4__0__Impl"
    // InternalPerfectML.g:2242:1: rule__MLPClassifier__Group_4__0__Impl : ( ( rule__MLPClassifier__Activation_defAssignment_4_0 ) ) ;
    public final void rule__MLPClassifier__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2246:1: ( ( ( rule__MLPClassifier__Activation_defAssignment_4_0 ) ) )
            // InternalPerfectML.g:2247:1: ( ( rule__MLPClassifier__Activation_defAssignment_4_0 ) )
            {
            // InternalPerfectML.g:2247:1: ( ( rule__MLPClassifier__Activation_defAssignment_4_0 ) )
            // InternalPerfectML.g:2248:2: ( rule__MLPClassifier__Activation_defAssignment_4_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getActivation_defAssignment_4_0()); 
            // InternalPerfectML.g:2249:2: ( rule__MLPClassifier__Activation_defAssignment_4_0 )
            // InternalPerfectML.g:2249:3: rule__MLPClassifier__Activation_defAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Activation_defAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getActivation_defAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_4__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_4__1"
    // InternalPerfectML.g:2257:1: rule__MLPClassifier__Group_4__1 : rule__MLPClassifier__Group_4__1__Impl rule__MLPClassifier__Group_4__2 ;
    public final void rule__MLPClassifier__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2261:1: ( rule__MLPClassifier__Group_4__1__Impl rule__MLPClassifier__Group_4__2 )
            // InternalPerfectML.g:2262:2: rule__MLPClassifier__Group_4__1__Impl rule__MLPClassifier__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__MLPClassifier__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_4__1"


    // $ANTLR start "rule__MLPClassifier__Group_4__1__Impl"
    // InternalPerfectML.g:2269:1: rule__MLPClassifier__Group_4__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2273:1: ( ( '=' ) )
            // InternalPerfectML.g:2274:1: ( '=' )
            {
            // InternalPerfectML.g:2274:1: ( '=' )
            // InternalPerfectML.g:2275:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_4_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_4__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_4__2"
    // InternalPerfectML.g:2284:1: rule__MLPClassifier__Group_4__2 : rule__MLPClassifier__Group_4__2__Impl ;
    public final void rule__MLPClassifier__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2288:1: ( rule__MLPClassifier__Group_4__2__Impl )
            // InternalPerfectML.g:2289:2: rule__MLPClassifier__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_4__2"


    // $ANTLR start "rule__MLPClassifier__Group_4__2__Impl"
    // InternalPerfectML.g:2295:1: rule__MLPClassifier__Group_4__2__Impl : ( ( rule__MLPClassifier__ActivationAssignment_4_2 ) ) ;
    public final void rule__MLPClassifier__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2299:1: ( ( ( rule__MLPClassifier__ActivationAssignment_4_2 ) ) )
            // InternalPerfectML.g:2300:1: ( ( rule__MLPClassifier__ActivationAssignment_4_2 ) )
            {
            // InternalPerfectML.g:2300:1: ( ( rule__MLPClassifier__ActivationAssignment_4_2 ) )
            // InternalPerfectML.g:2301:2: ( rule__MLPClassifier__ActivationAssignment_4_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getActivationAssignment_4_2()); 
            // InternalPerfectML.g:2302:2: ( rule__MLPClassifier__ActivationAssignment_4_2 )
            // InternalPerfectML.g:2302:3: rule__MLPClassifier__ActivationAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__ActivationAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getActivationAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_4__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_5__0"
    // InternalPerfectML.g:2311:1: rule__MLPClassifier__Group_5__0 : rule__MLPClassifier__Group_5__0__Impl rule__MLPClassifier__Group_5__1 ;
    public final void rule__MLPClassifier__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2315:1: ( rule__MLPClassifier__Group_5__0__Impl rule__MLPClassifier__Group_5__1 )
            // InternalPerfectML.g:2316:2: rule__MLPClassifier__Group_5__0__Impl rule__MLPClassifier__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_5__0"


    // $ANTLR start "rule__MLPClassifier__Group_5__0__Impl"
    // InternalPerfectML.g:2323:1: rule__MLPClassifier__Group_5__0__Impl : ( ( rule__MLPClassifier__Solver_defAssignment_5_0 ) ) ;
    public final void rule__MLPClassifier__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2327:1: ( ( ( rule__MLPClassifier__Solver_defAssignment_5_0 ) ) )
            // InternalPerfectML.g:2328:1: ( ( rule__MLPClassifier__Solver_defAssignment_5_0 ) )
            {
            // InternalPerfectML.g:2328:1: ( ( rule__MLPClassifier__Solver_defAssignment_5_0 ) )
            // InternalPerfectML.g:2329:2: ( rule__MLPClassifier__Solver_defAssignment_5_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getSolver_defAssignment_5_0()); 
            // InternalPerfectML.g:2330:2: ( rule__MLPClassifier__Solver_defAssignment_5_0 )
            // InternalPerfectML.g:2330:3: rule__MLPClassifier__Solver_defAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Solver_defAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getSolver_defAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_5__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_5__1"
    // InternalPerfectML.g:2338:1: rule__MLPClassifier__Group_5__1 : rule__MLPClassifier__Group_5__1__Impl rule__MLPClassifier__Group_5__2 ;
    public final void rule__MLPClassifier__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2342:1: ( rule__MLPClassifier__Group_5__1__Impl rule__MLPClassifier__Group_5__2 )
            // InternalPerfectML.g:2343:2: rule__MLPClassifier__Group_5__1__Impl rule__MLPClassifier__Group_5__2
            {
            pushFollow(FOLLOW_22);
            rule__MLPClassifier__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_5__1"


    // $ANTLR start "rule__MLPClassifier__Group_5__1__Impl"
    // InternalPerfectML.g:2350:1: rule__MLPClassifier__Group_5__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2354:1: ( ( '=' ) )
            // InternalPerfectML.g:2355:1: ( '=' )
            {
            // InternalPerfectML.g:2355:1: ( '=' )
            // InternalPerfectML.g:2356:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_5_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_5__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_5__2"
    // InternalPerfectML.g:2365:1: rule__MLPClassifier__Group_5__2 : rule__MLPClassifier__Group_5__2__Impl ;
    public final void rule__MLPClassifier__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2369:1: ( rule__MLPClassifier__Group_5__2__Impl )
            // InternalPerfectML.g:2370:2: rule__MLPClassifier__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_5__2"


    // $ANTLR start "rule__MLPClassifier__Group_5__2__Impl"
    // InternalPerfectML.g:2376:1: rule__MLPClassifier__Group_5__2__Impl : ( ( rule__MLPClassifier__SolverAssignment_5_2 ) ) ;
    public final void rule__MLPClassifier__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2380:1: ( ( ( rule__MLPClassifier__SolverAssignment_5_2 ) ) )
            // InternalPerfectML.g:2381:1: ( ( rule__MLPClassifier__SolverAssignment_5_2 ) )
            {
            // InternalPerfectML.g:2381:1: ( ( rule__MLPClassifier__SolverAssignment_5_2 ) )
            // InternalPerfectML.g:2382:2: ( rule__MLPClassifier__SolverAssignment_5_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getSolverAssignment_5_2()); 
            // InternalPerfectML.g:2383:2: ( rule__MLPClassifier__SolverAssignment_5_2 )
            // InternalPerfectML.g:2383:3: rule__MLPClassifier__SolverAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__SolverAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getSolverAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_5__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_6__0"
    // InternalPerfectML.g:2392:1: rule__MLPClassifier__Group_6__0 : rule__MLPClassifier__Group_6__0__Impl rule__MLPClassifier__Group_6__1 ;
    public final void rule__MLPClassifier__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2396:1: ( rule__MLPClassifier__Group_6__0__Impl rule__MLPClassifier__Group_6__1 )
            // InternalPerfectML.g:2397:2: rule__MLPClassifier__Group_6__0__Impl rule__MLPClassifier__Group_6__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_6__0"


    // $ANTLR start "rule__MLPClassifier__Group_6__0__Impl"
    // InternalPerfectML.g:2404:1: rule__MLPClassifier__Group_6__0__Impl : ( ( rule__MLPClassifier__Alpha_defAssignment_6_0 ) ) ;
    public final void rule__MLPClassifier__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2408:1: ( ( ( rule__MLPClassifier__Alpha_defAssignment_6_0 ) ) )
            // InternalPerfectML.g:2409:1: ( ( rule__MLPClassifier__Alpha_defAssignment_6_0 ) )
            {
            // InternalPerfectML.g:2409:1: ( ( rule__MLPClassifier__Alpha_defAssignment_6_0 ) )
            // InternalPerfectML.g:2410:2: ( rule__MLPClassifier__Alpha_defAssignment_6_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getAlpha_defAssignment_6_0()); 
            // InternalPerfectML.g:2411:2: ( rule__MLPClassifier__Alpha_defAssignment_6_0 )
            // InternalPerfectML.g:2411:3: rule__MLPClassifier__Alpha_defAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Alpha_defAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getAlpha_defAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_6__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_6__1"
    // InternalPerfectML.g:2419:1: rule__MLPClassifier__Group_6__1 : rule__MLPClassifier__Group_6__1__Impl rule__MLPClassifier__Group_6__2 ;
    public final void rule__MLPClassifier__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2423:1: ( rule__MLPClassifier__Group_6__1__Impl rule__MLPClassifier__Group_6__2 )
            // InternalPerfectML.g:2424:2: rule__MLPClassifier__Group_6__1__Impl rule__MLPClassifier__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_6__1"


    // $ANTLR start "rule__MLPClassifier__Group_6__1__Impl"
    // InternalPerfectML.g:2431:1: rule__MLPClassifier__Group_6__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2435:1: ( ( '=' ) )
            // InternalPerfectML.g:2436:1: ( '=' )
            {
            // InternalPerfectML.g:2436:1: ( '=' )
            // InternalPerfectML.g:2437:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_6_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_6__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_6__2"
    // InternalPerfectML.g:2446:1: rule__MLPClassifier__Group_6__2 : rule__MLPClassifier__Group_6__2__Impl ;
    public final void rule__MLPClassifier__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2450:1: ( rule__MLPClassifier__Group_6__2__Impl )
            // InternalPerfectML.g:2451:2: rule__MLPClassifier__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_6__2"


    // $ANTLR start "rule__MLPClassifier__Group_6__2__Impl"
    // InternalPerfectML.g:2457:1: rule__MLPClassifier__Group_6__2__Impl : ( ( rule__MLPClassifier__AlphaAssignment_6_2 ) ) ;
    public final void rule__MLPClassifier__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2461:1: ( ( ( rule__MLPClassifier__AlphaAssignment_6_2 ) ) )
            // InternalPerfectML.g:2462:1: ( ( rule__MLPClassifier__AlphaAssignment_6_2 ) )
            {
            // InternalPerfectML.g:2462:1: ( ( rule__MLPClassifier__AlphaAssignment_6_2 ) )
            // InternalPerfectML.g:2463:2: ( rule__MLPClassifier__AlphaAssignment_6_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getAlphaAssignment_6_2()); 
            // InternalPerfectML.g:2464:2: ( rule__MLPClassifier__AlphaAssignment_6_2 )
            // InternalPerfectML.g:2464:3: rule__MLPClassifier__AlphaAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__AlphaAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getAlphaAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_6__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_7__0"
    // InternalPerfectML.g:2473:1: rule__MLPClassifier__Group_7__0 : rule__MLPClassifier__Group_7__0__Impl rule__MLPClassifier__Group_7__1 ;
    public final void rule__MLPClassifier__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2477:1: ( rule__MLPClassifier__Group_7__0__Impl rule__MLPClassifier__Group_7__1 )
            // InternalPerfectML.g:2478:2: rule__MLPClassifier__Group_7__0__Impl rule__MLPClassifier__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_7__0"


    // $ANTLR start "rule__MLPClassifier__Group_7__0__Impl"
    // InternalPerfectML.g:2485:1: rule__MLPClassifier__Group_7__0__Impl : ( ( rule__MLPClassifier__Batch_size_defAssignment_7_0 ) ) ;
    public final void rule__MLPClassifier__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2489:1: ( ( ( rule__MLPClassifier__Batch_size_defAssignment_7_0 ) ) )
            // InternalPerfectML.g:2490:1: ( ( rule__MLPClassifier__Batch_size_defAssignment_7_0 ) )
            {
            // InternalPerfectML.g:2490:1: ( ( rule__MLPClassifier__Batch_size_defAssignment_7_0 ) )
            // InternalPerfectML.g:2491:2: ( rule__MLPClassifier__Batch_size_defAssignment_7_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getBatch_size_defAssignment_7_0()); 
            // InternalPerfectML.g:2492:2: ( rule__MLPClassifier__Batch_size_defAssignment_7_0 )
            // InternalPerfectML.g:2492:3: rule__MLPClassifier__Batch_size_defAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Batch_size_defAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getBatch_size_defAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_7__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_7__1"
    // InternalPerfectML.g:2500:1: rule__MLPClassifier__Group_7__1 : rule__MLPClassifier__Group_7__1__Impl rule__MLPClassifier__Group_7__2 ;
    public final void rule__MLPClassifier__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2504:1: ( rule__MLPClassifier__Group_7__1__Impl rule__MLPClassifier__Group_7__2 )
            // InternalPerfectML.g:2505:2: rule__MLPClassifier__Group_7__1__Impl rule__MLPClassifier__Group_7__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_7__1"


    // $ANTLR start "rule__MLPClassifier__Group_7__1__Impl"
    // InternalPerfectML.g:2512:1: rule__MLPClassifier__Group_7__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2516:1: ( ( '=' ) )
            // InternalPerfectML.g:2517:1: ( '=' )
            {
            // InternalPerfectML.g:2517:1: ( '=' )
            // InternalPerfectML.g:2518:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_7_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_7__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_7__2"
    // InternalPerfectML.g:2527:1: rule__MLPClassifier__Group_7__2 : rule__MLPClassifier__Group_7__2__Impl ;
    public final void rule__MLPClassifier__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2531:1: ( rule__MLPClassifier__Group_7__2__Impl )
            // InternalPerfectML.g:2532:2: rule__MLPClassifier__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_7__2"


    // $ANTLR start "rule__MLPClassifier__Group_7__2__Impl"
    // InternalPerfectML.g:2538:1: rule__MLPClassifier__Group_7__2__Impl : ( ( rule__MLPClassifier__Batch_sizeAssignment_7_2 ) ) ;
    public final void rule__MLPClassifier__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2542:1: ( ( ( rule__MLPClassifier__Batch_sizeAssignment_7_2 ) ) )
            // InternalPerfectML.g:2543:1: ( ( rule__MLPClassifier__Batch_sizeAssignment_7_2 ) )
            {
            // InternalPerfectML.g:2543:1: ( ( rule__MLPClassifier__Batch_sizeAssignment_7_2 ) )
            // InternalPerfectML.g:2544:2: ( rule__MLPClassifier__Batch_sizeAssignment_7_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getBatch_sizeAssignment_7_2()); 
            // InternalPerfectML.g:2545:2: ( rule__MLPClassifier__Batch_sizeAssignment_7_2 )
            // InternalPerfectML.g:2545:3: rule__MLPClassifier__Batch_sizeAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Batch_sizeAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getBatch_sizeAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_7__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_8__0"
    // InternalPerfectML.g:2554:1: rule__MLPClassifier__Group_8__0 : rule__MLPClassifier__Group_8__0__Impl rule__MLPClassifier__Group_8__1 ;
    public final void rule__MLPClassifier__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2558:1: ( rule__MLPClassifier__Group_8__0__Impl rule__MLPClassifier__Group_8__1 )
            // InternalPerfectML.g:2559:2: rule__MLPClassifier__Group_8__0__Impl rule__MLPClassifier__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_8__0"


    // $ANTLR start "rule__MLPClassifier__Group_8__0__Impl"
    // InternalPerfectML.g:2566:1: rule__MLPClassifier__Group_8__0__Impl : ( ( rule__MLPClassifier__Learning_rate_defAssignment_8_0 ) ) ;
    public final void rule__MLPClassifier__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2570:1: ( ( ( rule__MLPClassifier__Learning_rate_defAssignment_8_0 ) ) )
            // InternalPerfectML.g:2571:1: ( ( rule__MLPClassifier__Learning_rate_defAssignment_8_0 ) )
            {
            // InternalPerfectML.g:2571:1: ( ( rule__MLPClassifier__Learning_rate_defAssignment_8_0 ) )
            // InternalPerfectML.g:2572:2: ( rule__MLPClassifier__Learning_rate_defAssignment_8_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getLearning_rate_defAssignment_8_0()); 
            // InternalPerfectML.g:2573:2: ( rule__MLPClassifier__Learning_rate_defAssignment_8_0 )
            // InternalPerfectML.g:2573:3: rule__MLPClassifier__Learning_rate_defAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Learning_rate_defAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getLearning_rate_defAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_8__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_8__1"
    // InternalPerfectML.g:2581:1: rule__MLPClassifier__Group_8__1 : rule__MLPClassifier__Group_8__1__Impl rule__MLPClassifier__Group_8__2 ;
    public final void rule__MLPClassifier__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2585:1: ( rule__MLPClassifier__Group_8__1__Impl rule__MLPClassifier__Group_8__2 )
            // InternalPerfectML.g:2586:2: rule__MLPClassifier__Group_8__1__Impl rule__MLPClassifier__Group_8__2
            {
            pushFollow(FOLLOW_23);
            rule__MLPClassifier__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_8__1"


    // $ANTLR start "rule__MLPClassifier__Group_8__1__Impl"
    // InternalPerfectML.g:2593:1: rule__MLPClassifier__Group_8__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2597:1: ( ( '=' ) )
            // InternalPerfectML.g:2598:1: ( '=' )
            {
            // InternalPerfectML.g:2598:1: ( '=' )
            // InternalPerfectML.g:2599:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_8_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_8__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_8__2"
    // InternalPerfectML.g:2608:1: rule__MLPClassifier__Group_8__2 : rule__MLPClassifier__Group_8__2__Impl ;
    public final void rule__MLPClassifier__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2612:1: ( rule__MLPClassifier__Group_8__2__Impl )
            // InternalPerfectML.g:2613:2: rule__MLPClassifier__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_8__2"


    // $ANTLR start "rule__MLPClassifier__Group_8__2__Impl"
    // InternalPerfectML.g:2619:1: rule__MLPClassifier__Group_8__2__Impl : ( ( rule__MLPClassifier__Learning_rateAssignment_8_2 ) ) ;
    public final void rule__MLPClassifier__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2623:1: ( ( ( rule__MLPClassifier__Learning_rateAssignment_8_2 ) ) )
            // InternalPerfectML.g:2624:1: ( ( rule__MLPClassifier__Learning_rateAssignment_8_2 ) )
            {
            // InternalPerfectML.g:2624:1: ( ( rule__MLPClassifier__Learning_rateAssignment_8_2 ) )
            // InternalPerfectML.g:2625:2: ( rule__MLPClassifier__Learning_rateAssignment_8_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getLearning_rateAssignment_8_2()); 
            // InternalPerfectML.g:2626:2: ( rule__MLPClassifier__Learning_rateAssignment_8_2 )
            // InternalPerfectML.g:2626:3: rule__MLPClassifier__Learning_rateAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Learning_rateAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getLearning_rateAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_8__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_9__0"
    // InternalPerfectML.g:2635:1: rule__MLPClassifier__Group_9__0 : rule__MLPClassifier__Group_9__0__Impl rule__MLPClassifier__Group_9__1 ;
    public final void rule__MLPClassifier__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2639:1: ( rule__MLPClassifier__Group_9__0__Impl rule__MLPClassifier__Group_9__1 )
            // InternalPerfectML.g:2640:2: rule__MLPClassifier__Group_9__0__Impl rule__MLPClassifier__Group_9__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_9__0"


    // $ANTLR start "rule__MLPClassifier__Group_9__0__Impl"
    // InternalPerfectML.g:2647:1: rule__MLPClassifier__Group_9__0__Impl : ( ( rule__MLPClassifier__Learning_rate_init_defAssignment_9_0 ) ) ;
    public final void rule__MLPClassifier__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2651:1: ( ( ( rule__MLPClassifier__Learning_rate_init_defAssignment_9_0 ) ) )
            // InternalPerfectML.g:2652:1: ( ( rule__MLPClassifier__Learning_rate_init_defAssignment_9_0 ) )
            {
            // InternalPerfectML.g:2652:1: ( ( rule__MLPClassifier__Learning_rate_init_defAssignment_9_0 ) )
            // InternalPerfectML.g:2653:2: ( rule__MLPClassifier__Learning_rate_init_defAssignment_9_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getLearning_rate_init_defAssignment_9_0()); 
            // InternalPerfectML.g:2654:2: ( rule__MLPClassifier__Learning_rate_init_defAssignment_9_0 )
            // InternalPerfectML.g:2654:3: rule__MLPClassifier__Learning_rate_init_defAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Learning_rate_init_defAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getLearning_rate_init_defAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_9__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_9__1"
    // InternalPerfectML.g:2662:1: rule__MLPClassifier__Group_9__1 : rule__MLPClassifier__Group_9__1__Impl rule__MLPClassifier__Group_9__2 ;
    public final void rule__MLPClassifier__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2666:1: ( rule__MLPClassifier__Group_9__1__Impl rule__MLPClassifier__Group_9__2 )
            // InternalPerfectML.g:2667:2: rule__MLPClassifier__Group_9__1__Impl rule__MLPClassifier__Group_9__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_9__1"


    // $ANTLR start "rule__MLPClassifier__Group_9__1__Impl"
    // InternalPerfectML.g:2674:1: rule__MLPClassifier__Group_9__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2678:1: ( ( '=' ) )
            // InternalPerfectML.g:2679:1: ( '=' )
            {
            // InternalPerfectML.g:2679:1: ( '=' )
            // InternalPerfectML.g:2680:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_9_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_9__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_9__2"
    // InternalPerfectML.g:2689:1: rule__MLPClassifier__Group_9__2 : rule__MLPClassifier__Group_9__2__Impl ;
    public final void rule__MLPClassifier__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2693:1: ( rule__MLPClassifier__Group_9__2__Impl )
            // InternalPerfectML.g:2694:2: rule__MLPClassifier__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_9__2"


    // $ANTLR start "rule__MLPClassifier__Group_9__2__Impl"
    // InternalPerfectML.g:2700:1: rule__MLPClassifier__Group_9__2__Impl : ( ( rule__MLPClassifier__Learning_rate_initAssignment_9_2 ) ) ;
    public final void rule__MLPClassifier__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2704:1: ( ( ( rule__MLPClassifier__Learning_rate_initAssignment_9_2 ) ) )
            // InternalPerfectML.g:2705:1: ( ( rule__MLPClassifier__Learning_rate_initAssignment_9_2 ) )
            {
            // InternalPerfectML.g:2705:1: ( ( rule__MLPClassifier__Learning_rate_initAssignment_9_2 ) )
            // InternalPerfectML.g:2706:2: ( rule__MLPClassifier__Learning_rate_initAssignment_9_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getLearning_rate_initAssignment_9_2()); 
            // InternalPerfectML.g:2707:2: ( rule__MLPClassifier__Learning_rate_initAssignment_9_2 )
            // InternalPerfectML.g:2707:3: rule__MLPClassifier__Learning_rate_initAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Learning_rate_initAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getLearning_rate_initAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_9__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_10__0"
    // InternalPerfectML.g:2716:1: rule__MLPClassifier__Group_10__0 : rule__MLPClassifier__Group_10__0__Impl rule__MLPClassifier__Group_10__1 ;
    public final void rule__MLPClassifier__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2720:1: ( rule__MLPClassifier__Group_10__0__Impl rule__MLPClassifier__Group_10__1 )
            // InternalPerfectML.g:2721:2: rule__MLPClassifier__Group_10__0__Impl rule__MLPClassifier__Group_10__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_10__0"


    // $ANTLR start "rule__MLPClassifier__Group_10__0__Impl"
    // InternalPerfectML.g:2728:1: rule__MLPClassifier__Group_10__0__Impl : ( ( rule__MLPClassifier__Power_t_defAssignment_10_0 ) ) ;
    public final void rule__MLPClassifier__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2732:1: ( ( ( rule__MLPClassifier__Power_t_defAssignment_10_0 ) ) )
            // InternalPerfectML.g:2733:1: ( ( rule__MLPClassifier__Power_t_defAssignment_10_0 ) )
            {
            // InternalPerfectML.g:2733:1: ( ( rule__MLPClassifier__Power_t_defAssignment_10_0 ) )
            // InternalPerfectML.g:2734:2: ( rule__MLPClassifier__Power_t_defAssignment_10_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getPower_t_defAssignment_10_0()); 
            // InternalPerfectML.g:2735:2: ( rule__MLPClassifier__Power_t_defAssignment_10_0 )
            // InternalPerfectML.g:2735:3: rule__MLPClassifier__Power_t_defAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Power_t_defAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getPower_t_defAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_10__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_10__1"
    // InternalPerfectML.g:2743:1: rule__MLPClassifier__Group_10__1 : rule__MLPClassifier__Group_10__1__Impl rule__MLPClassifier__Group_10__2 ;
    public final void rule__MLPClassifier__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2747:1: ( rule__MLPClassifier__Group_10__1__Impl rule__MLPClassifier__Group_10__2 )
            // InternalPerfectML.g:2748:2: rule__MLPClassifier__Group_10__1__Impl rule__MLPClassifier__Group_10__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_10__1"


    // $ANTLR start "rule__MLPClassifier__Group_10__1__Impl"
    // InternalPerfectML.g:2755:1: rule__MLPClassifier__Group_10__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2759:1: ( ( '=' ) )
            // InternalPerfectML.g:2760:1: ( '=' )
            {
            // InternalPerfectML.g:2760:1: ( '=' )
            // InternalPerfectML.g:2761:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_10_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_10__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_10__2"
    // InternalPerfectML.g:2770:1: rule__MLPClassifier__Group_10__2 : rule__MLPClassifier__Group_10__2__Impl ;
    public final void rule__MLPClassifier__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2774:1: ( rule__MLPClassifier__Group_10__2__Impl )
            // InternalPerfectML.g:2775:2: rule__MLPClassifier__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_10__2"


    // $ANTLR start "rule__MLPClassifier__Group_10__2__Impl"
    // InternalPerfectML.g:2781:1: rule__MLPClassifier__Group_10__2__Impl : ( ( rule__MLPClassifier__Power_tAssignment_10_2 ) ) ;
    public final void rule__MLPClassifier__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2785:1: ( ( ( rule__MLPClassifier__Power_tAssignment_10_2 ) ) )
            // InternalPerfectML.g:2786:1: ( ( rule__MLPClassifier__Power_tAssignment_10_2 ) )
            {
            // InternalPerfectML.g:2786:1: ( ( rule__MLPClassifier__Power_tAssignment_10_2 ) )
            // InternalPerfectML.g:2787:2: ( rule__MLPClassifier__Power_tAssignment_10_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getPower_tAssignment_10_2()); 
            // InternalPerfectML.g:2788:2: ( rule__MLPClassifier__Power_tAssignment_10_2 )
            // InternalPerfectML.g:2788:3: rule__MLPClassifier__Power_tAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Power_tAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getPower_tAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_10__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_11__0"
    // InternalPerfectML.g:2797:1: rule__MLPClassifier__Group_11__0 : rule__MLPClassifier__Group_11__0__Impl rule__MLPClassifier__Group_11__1 ;
    public final void rule__MLPClassifier__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2801:1: ( rule__MLPClassifier__Group_11__0__Impl rule__MLPClassifier__Group_11__1 )
            // InternalPerfectML.g:2802:2: rule__MLPClassifier__Group_11__0__Impl rule__MLPClassifier__Group_11__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_11__0"


    // $ANTLR start "rule__MLPClassifier__Group_11__0__Impl"
    // InternalPerfectML.g:2809:1: rule__MLPClassifier__Group_11__0__Impl : ( ( rule__MLPClassifier__Max_iteer_defAssignment_11_0 ) ) ;
    public final void rule__MLPClassifier__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2813:1: ( ( ( rule__MLPClassifier__Max_iteer_defAssignment_11_0 ) ) )
            // InternalPerfectML.g:2814:1: ( ( rule__MLPClassifier__Max_iteer_defAssignment_11_0 ) )
            {
            // InternalPerfectML.g:2814:1: ( ( rule__MLPClassifier__Max_iteer_defAssignment_11_0 ) )
            // InternalPerfectML.g:2815:2: ( rule__MLPClassifier__Max_iteer_defAssignment_11_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getMax_iteer_defAssignment_11_0()); 
            // InternalPerfectML.g:2816:2: ( rule__MLPClassifier__Max_iteer_defAssignment_11_0 )
            // InternalPerfectML.g:2816:3: rule__MLPClassifier__Max_iteer_defAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Max_iteer_defAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getMax_iteer_defAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_11__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_11__1"
    // InternalPerfectML.g:2824:1: rule__MLPClassifier__Group_11__1 : rule__MLPClassifier__Group_11__1__Impl rule__MLPClassifier__Group_11__2 ;
    public final void rule__MLPClassifier__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2828:1: ( rule__MLPClassifier__Group_11__1__Impl rule__MLPClassifier__Group_11__2 )
            // InternalPerfectML.g:2829:2: rule__MLPClassifier__Group_11__1__Impl rule__MLPClassifier__Group_11__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_11__1"


    // $ANTLR start "rule__MLPClassifier__Group_11__1__Impl"
    // InternalPerfectML.g:2836:1: rule__MLPClassifier__Group_11__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2840:1: ( ( '=' ) )
            // InternalPerfectML.g:2841:1: ( '=' )
            {
            // InternalPerfectML.g:2841:1: ( '=' )
            // InternalPerfectML.g:2842:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_11_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_11__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_11__2"
    // InternalPerfectML.g:2851:1: rule__MLPClassifier__Group_11__2 : rule__MLPClassifier__Group_11__2__Impl ;
    public final void rule__MLPClassifier__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2855:1: ( rule__MLPClassifier__Group_11__2__Impl )
            // InternalPerfectML.g:2856:2: rule__MLPClassifier__Group_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_11__2"


    // $ANTLR start "rule__MLPClassifier__Group_11__2__Impl"
    // InternalPerfectML.g:2862:1: rule__MLPClassifier__Group_11__2__Impl : ( ( rule__MLPClassifier__Max_iterAssignment_11_2 ) ) ;
    public final void rule__MLPClassifier__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2866:1: ( ( ( rule__MLPClassifier__Max_iterAssignment_11_2 ) ) )
            // InternalPerfectML.g:2867:1: ( ( rule__MLPClassifier__Max_iterAssignment_11_2 ) )
            {
            // InternalPerfectML.g:2867:1: ( ( rule__MLPClassifier__Max_iterAssignment_11_2 ) )
            // InternalPerfectML.g:2868:2: ( rule__MLPClassifier__Max_iterAssignment_11_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getMax_iterAssignment_11_2()); 
            // InternalPerfectML.g:2869:2: ( rule__MLPClassifier__Max_iterAssignment_11_2 )
            // InternalPerfectML.g:2869:3: rule__MLPClassifier__Max_iterAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Max_iterAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getMax_iterAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_11__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_12__0"
    // InternalPerfectML.g:2878:1: rule__MLPClassifier__Group_12__0 : rule__MLPClassifier__Group_12__0__Impl rule__MLPClassifier__Group_12__1 ;
    public final void rule__MLPClassifier__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2882:1: ( rule__MLPClassifier__Group_12__0__Impl rule__MLPClassifier__Group_12__1 )
            // InternalPerfectML.g:2883:2: rule__MLPClassifier__Group_12__0__Impl rule__MLPClassifier__Group_12__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_12__0"


    // $ANTLR start "rule__MLPClassifier__Group_12__0__Impl"
    // InternalPerfectML.g:2890:1: rule__MLPClassifier__Group_12__0__Impl : ( ( rule__MLPClassifier__Shuffle_defAssignment_12_0 ) ) ;
    public final void rule__MLPClassifier__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2894:1: ( ( ( rule__MLPClassifier__Shuffle_defAssignment_12_0 ) ) )
            // InternalPerfectML.g:2895:1: ( ( rule__MLPClassifier__Shuffle_defAssignment_12_0 ) )
            {
            // InternalPerfectML.g:2895:1: ( ( rule__MLPClassifier__Shuffle_defAssignment_12_0 ) )
            // InternalPerfectML.g:2896:2: ( rule__MLPClassifier__Shuffle_defAssignment_12_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getShuffle_defAssignment_12_0()); 
            // InternalPerfectML.g:2897:2: ( rule__MLPClassifier__Shuffle_defAssignment_12_0 )
            // InternalPerfectML.g:2897:3: rule__MLPClassifier__Shuffle_defAssignment_12_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Shuffle_defAssignment_12_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getShuffle_defAssignment_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_12__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_12__1"
    // InternalPerfectML.g:2905:1: rule__MLPClassifier__Group_12__1 : rule__MLPClassifier__Group_12__1__Impl rule__MLPClassifier__Group_12__2 ;
    public final void rule__MLPClassifier__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2909:1: ( rule__MLPClassifier__Group_12__1__Impl rule__MLPClassifier__Group_12__2 )
            // InternalPerfectML.g:2910:2: rule__MLPClassifier__Group_12__1__Impl rule__MLPClassifier__Group_12__2
            {
            pushFollow(FOLLOW_24);
            rule__MLPClassifier__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_12__1"


    // $ANTLR start "rule__MLPClassifier__Group_12__1__Impl"
    // InternalPerfectML.g:2917:1: rule__MLPClassifier__Group_12__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2921:1: ( ( '=' ) )
            // InternalPerfectML.g:2922:1: ( '=' )
            {
            // InternalPerfectML.g:2922:1: ( '=' )
            // InternalPerfectML.g:2923:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_12_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_12__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_12__2"
    // InternalPerfectML.g:2932:1: rule__MLPClassifier__Group_12__2 : rule__MLPClassifier__Group_12__2__Impl ;
    public final void rule__MLPClassifier__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2936:1: ( rule__MLPClassifier__Group_12__2__Impl )
            // InternalPerfectML.g:2937:2: rule__MLPClassifier__Group_12__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_12__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_12__2"


    // $ANTLR start "rule__MLPClassifier__Group_12__2__Impl"
    // InternalPerfectML.g:2943:1: rule__MLPClassifier__Group_12__2__Impl : ( ( rule__MLPClassifier__ShuffleAssignment_12_2 ) ) ;
    public final void rule__MLPClassifier__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2947:1: ( ( ( rule__MLPClassifier__ShuffleAssignment_12_2 ) ) )
            // InternalPerfectML.g:2948:1: ( ( rule__MLPClassifier__ShuffleAssignment_12_2 ) )
            {
            // InternalPerfectML.g:2948:1: ( ( rule__MLPClassifier__ShuffleAssignment_12_2 ) )
            // InternalPerfectML.g:2949:2: ( rule__MLPClassifier__ShuffleAssignment_12_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getShuffleAssignment_12_2()); 
            // InternalPerfectML.g:2950:2: ( rule__MLPClassifier__ShuffleAssignment_12_2 )
            // InternalPerfectML.g:2950:3: rule__MLPClassifier__ShuffleAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__ShuffleAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getShuffleAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_12__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_13__0"
    // InternalPerfectML.g:2959:1: rule__MLPClassifier__Group_13__0 : rule__MLPClassifier__Group_13__0__Impl rule__MLPClassifier__Group_13__1 ;
    public final void rule__MLPClassifier__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2963:1: ( rule__MLPClassifier__Group_13__0__Impl rule__MLPClassifier__Group_13__1 )
            // InternalPerfectML.g:2964:2: rule__MLPClassifier__Group_13__0__Impl rule__MLPClassifier__Group_13__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_13__0"


    // $ANTLR start "rule__MLPClassifier__Group_13__0__Impl"
    // InternalPerfectML.g:2971:1: rule__MLPClassifier__Group_13__0__Impl : ( ( rule__MLPClassifier__Random_state_defAssignment_13_0 ) ) ;
    public final void rule__MLPClassifier__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2975:1: ( ( ( rule__MLPClassifier__Random_state_defAssignment_13_0 ) ) )
            // InternalPerfectML.g:2976:1: ( ( rule__MLPClassifier__Random_state_defAssignment_13_0 ) )
            {
            // InternalPerfectML.g:2976:1: ( ( rule__MLPClassifier__Random_state_defAssignment_13_0 ) )
            // InternalPerfectML.g:2977:2: ( rule__MLPClassifier__Random_state_defAssignment_13_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getRandom_state_defAssignment_13_0()); 
            // InternalPerfectML.g:2978:2: ( rule__MLPClassifier__Random_state_defAssignment_13_0 )
            // InternalPerfectML.g:2978:3: rule__MLPClassifier__Random_state_defAssignment_13_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Random_state_defAssignment_13_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getRandom_state_defAssignment_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_13__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_13__1"
    // InternalPerfectML.g:2986:1: rule__MLPClassifier__Group_13__1 : rule__MLPClassifier__Group_13__1__Impl rule__MLPClassifier__Group_13__2 ;
    public final void rule__MLPClassifier__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:2990:1: ( rule__MLPClassifier__Group_13__1__Impl rule__MLPClassifier__Group_13__2 )
            // InternalPerfectML.g:2991:2: rule__MLPClassifier__Group_13__1__Impl rule__MLPClassifier__Group_13__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_13__1"


    // $ANTLR start "rule__MLPClassifier__Group_13__1__Impl"
    // InternalPerfectML.g:2998:1: rule__MLPClassifier__Group_13__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3002:1: ( ( '=' ) )
            // InternalPerfectML.g:3003:1: ( '=' )
            {
            // InternalPerfectML.g:3003:1: ( '=' )
            // InternalPerfectML.g:3004:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_13_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_13__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_13__2"
    // InternalPerfectML.g:3013:1: rule__MLPClassifier__Group_13__2 : rule__MLPClassifier__Group_13__2__Impl ;
    public final void rule__MLPClassifier__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3017:1: ( rule__MLPClassifier__Group_13__2__Impl )
            // InternalPerfectML.g:3018:2: rule__MLPClassifier__Group_13__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_13__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_13__2"


    // $ANTLR start "rule__MLPClassifier__Group_13__2__Impl"
    // InternalPerfectML.g:3024:1: rule__MLPClassifier__Group_13__2__Impl : ( ( rule__MLPClassifier__Random_stateAssignment_13_2 ) ) ;
    public final void rule__MLPClassifier__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3028:1: ( ( ( rule__MLPClassifier__Random_stateAssignment_13_2 ) ) )
            // InternalPerfectML.g:3029:1: ( ( rule__MLPClassifier__Random_stateAssignment_13_2 ) )
            {
            // InternalPerfectML.g:3029:1: ( ( rule__MLPClassifier__Random_stateAssignment_13_2 ) )
            // InternalPerfectML.g:3030:2: ( rule__MLPClassifier__Random_stateAssignment_13_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getRandom_stateAssignment_13_2()); 
            // InternalPerfectML.g:3031:2: ( rule__MLPClassifier__Random_stateAssignment_13_2 )
            // InternalPerfectML.g:3031:3: rule__MLPClassifier__Random_stateAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Random_stateAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getRandom_stateAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_13__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_14__0"
    // InternalPerfectML.g:3040:1: rule__MLPClassifier__Group_14__0 : rule__MLPClassifier__Group_14__0__Impl rule__MLPClassifier__Group_14__1 ;
    public final void rule__MLPClassifier__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3044:1: ( rule__MLPClassifier__Group_14__0__Impl rule__MLPClassifier__Group_14__1 )
            // InternalPerfectML.g:3045:2: rule__MLPClassifier__Group_14__0__Impl rule__MLPClassifier__Group_14__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_14__0"


    // $ANTLR start "rule__MLPClassifier__Group_14__0__Impl"
    // InternalPerfectML.g:3052:1: rule__MLPClassifier__Group_14__0__Impl : ( ( rule__MLPClassifier__Tolerance_defAssignment_14_0 ) ) ;
    public final void rule__MLPClassifier__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3056:1: ( ( ( rule__MLPClassifier__Tolerance_defAssignment_14_0 ) ) )
            // InternalPerfectML.g:3057:1: ( ( rule__MLPClassifier__Tolerance_defAssignment_14_0 ) )
            {
            // InternalPerfectML.g:3057:1: ( ( rule__MLPClassifier__Tolerance_defAssignment_14_0 ) )
            // InternalPerfectML.g:3058:2: ( rule__MLPClassifier__Tolerance_defAssignment_14_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getTolerance_defAssignment_14_0()); 
            // InternalPerfectML.g:3059:2: ( rule__MLPClassifier__Tolerance_defAssignment_14_0 )
            // InternalPerfectML.g:3059:3: rule__MLPClassifier__Tolerance_defAssignment_14_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Tolerance_defAssignment_14_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getTolerance_defAssignment_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_14__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_14__1"
    // InternalPerfectML.g:3067:1: rule__MLPClassifier__Group_14__1 : rule__MLPClassifier__Group_14__1__Impl rule__MLPClassifier__Group_14__2 ;
    public final void rule__MLPClassifier__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3071:1: ( rule__MLPClassifier__Group_14__1__Impl rule__MLPClassifier__Group_14__2 )
            // InternalPerfectML.g:3072:2: rule__MLPClassifier__Group_14__1__Impl rule__MLPClassifier__Group_14__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_14__1"


    // $ANTLR start "rule__MLPClassifier__Group_14__1__Impl"
    // InternalPerfectML.g:3079:1: rule__MLPClassifier__Group_14__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3083:1: ( ( '=' ) )
            // InternalPerfectML.g:3084:1: ( '=' )
            {
            // InternalPerfectML.g:3084:1: ( '=' )
            // InternalPerfectML.g:3085:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_14_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_14__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_14__2"
    // InternalPerfectML.g:3094:1: rule__MLPClassifier__Group_14__2 : rule__MLPClassifier__Group_14__2__Impl ;
    public final void rule__MLPClassifier__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3098:1: ( rule__MLPClassifier__Group_14__2__Impl )
            // InternalPerfectML.g:3099:2: rule__MLPClassifier__Group_14__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_14__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_14__2"


    // $ANTLR start "rule__MLPClassifier__Group_14__2__Impl"
    // InternalPerfectML.g:3105:1: rule__MLPClassifier__Group_14__2__Impl : ( ( rule__MLPClassifier__ToleranceAssignment_14_2 ) ) ;
    public final void rule__MLPClassifier__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3109:1: ( ( ( rule__MLPClassifier__ToleranceAssignment_14_2 ) ) )
            // InternalPerfectML.g:3110:1: ( ( rule__MLPClassifier__ToleranceAssignment_14_2 ) )
            {
            // InternalPerfectML.g:3110:1: ( ( rule__MLPClassifier__ToleranceAssignment_14_2 ) )
            // InternalPerfectML.g:3111:2: ( rule__MLPClassifier__ToleranceAssignment_14_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getToleranceAssignment_14_2()); 
            // InternalPerfectML.g:3112:2: ( rule__MLPClassifier__ToleranceAssignment_14_2 )
            // InternalPerfectML.g:3112:3: rule__MLPClassifier__ToleranceAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__ToleranceAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getToleranceAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_14__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_15__0"
    // InternalPerfectML.g:3121:1: rule__MLPClassifier__Group_15__0 : rule__MLPClassifier__Group_15__0__Impl rule__MLPClassifier__Group_15__1 ;
    public final void rule__MLPClassifier__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3125:1: ( rule__MLPClassifier__Group_15__0__Impl rule__MLPClassifier__Group_15__1 )
            // InternalPerfectML.g:3126:2: rule__MLPClassifier__Group_15__0__Impl rule__MLPClassifier__Group_15__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_15__0"


    // $ANTLR start "rule__MLPClassifier__Group_15__0__Impl"
    // InternalPerfectML.g:3133:1: rule__MLPClassifier__Group_15__0__Impl : ( ( rule__MLPClassifier__Verbose_defAssignment_15_0 ) ) ;
    public final void rule__MLPClassifier__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3137:1: ( ( ( rule__MLPClassifier__Verbose_defAssignment_15_0 ) ) )
            // InternalPerfectML.g:3138:1: ( ( rule__MLPClassifier__Verbose_defAssignment_15_0 ) )
            {
            // InternalPerfectML.g:3138:1: ( ( rule__MLPClassifier__Verbose_defAssignment_15_0 ) )
            // InternalPerfectML.g:3139:2: ( rule__MLPClassifier__Verbose_defAssignment_15_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getVerbose_defAssignment_15_0()); 
            // InternalPerfectML.g:3140:2: ( rule__MLPClassifier__Verbose_defAssignment_15_0 )
            // InternalPerfectML.g:3140:3: rule__MLPClassifier__Verbose_defAssignment_15_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Verbose_defAssignment_15_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getVerbose_defAssignment_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_15__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_15__1"
    // InternalPerfectML.g:3148:1: rule__MLPClassifier__Group_15__1 : rule__MLPClassifier__Group_15__1__Impl rule__MLPClassifier__Group_15__2 ;
    public final void rule__MLPClassifier__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3152:1: ( rule__MLPClassifier__Group_15__1__Impl rule__MLPClassifier__Group_15__2 )
            // InternalPerfectML.g:3153:2: rule__MLPClassifier__Group_15__1__Impl rule__MLPClassifier__Group_15__2
            {
            pushFollow(FOLLOW_24);
            rule__MLPClassifier__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_15__1"


    // $ANTLR start "rule__MLPClassifier__Group_15__1__Impl"
    // InternalPerfectML.g:3160:1: rule__MLPClassifier__Group_15__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3164:1: ( ( '=' ) )
            // InternalPerfectML.g:3165:1: ( '=' )
            {
            // InternalPerfectML.g:3165:1: ( '=' )
            // InternalPerfectML.g:3166:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_15_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_15__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_15__2"
    // InternalPerfectML.g:3175:1: rule__MLPClassifier__Group_15__2 : rule__MLPClassifier__Group_15__2__Impl ;
    public final void rule__MLPClassifier__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3179:1: ( rule__MLPClassifier__Group_15__2__Impl )
            // InternalPerfectML.g:3180:2: rule__MLPClassifier__Group_15__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_15__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_15__2"


    // $ANTLR start "rule__MLPClassifier__Group_15__2__Impl"
    // InternalPerfectML.g:3186:1: rule__MLPClassifier__Group_15__2__Impl : ( ( rule__MLPClassifier__VerboseAssignment_15_2 ) ) ;
    public final void rule__MLPClassifier__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3190:1: ( ( ( rule__MLPClassifier__VerboseAssignment_15_2 ) ) )
            // InternalPerfectML.g:3191:1: ( ( rule__MLPClassifier__VerboseAssignment_15_2 ) )
            {
            // InternalPerfectML.g:3191:1: ( ( rule__MLPClassifier__VerboseAssignment_15_2 ) )
            // InternalPerfectML.g:3192:2: ( rule__MLPClassifier__VerboseAssignment_15_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getVerboseAssignment_15_2()); 
            // InternalPerfectML.g:3193:2: ( rule__MLPClassifier__VerboseAssignment_15_2 )
            // InternalPerfectML.g:3193:3: rule__MLPClassifier__VerboseAssignment_15_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__VerboseAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getVerboseAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_15__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_16__0"
    // InternalPerfectML.g:3202:1: rule__MLPClassifier__Group_16__0 : rule__MLPClassifier__Group_16__0__Impl rule__MLPClassifier__Group_16__1 ;
    public final void rule__MLPClassifier__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3206:1: ( rule__MLPClassifier__Group_16__0__Impl rule__MLPClassifier__Group_16__1 )
            // InternalPerfectML.g:3207:2: rule__MLPClassifier__Group_16__0__Impl rule__MLPClassifier__Group_16__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_16__0"


    // $ANTLR start "rule__MLPClassifier__Group_16__0__Impl"
    // InternalPerfectML.g:3214:1: rule__MLPClassifier__Group_16__0__Impl : ( ( rule__MLPClassifier__Warm_start_defAssignment_16_0 ) ) ;
    public final void rule__MLPClassifier__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3218:1: ( ( ( rule__MLPClassifier__Warm_start_defAssignment_16_0 ) ) )
            // InternalPerfectML.g:3219:1: ( ( rule__MLPClassifier__Warm_start_defAssignment_16_0 ) )
            {
            // InternalPerfectML.g:3219:1: ( ( rule__MLPClassifier__Warm_start_defAssignment_16_0 ) )
            // InternalPerfectML.g:3220:2: ( rule__MLPClassifier__Warm_start_defAssignment_16_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getWarm_start_defAssignment_16_0()); 
            // InternalPerfectML.g:3221:2: ( rule__MLPClassifier__Warm_start_defAssignment_16_0 )
            // InternalPerfectML.g:3221:3: rule__MLPClassifier__Warm_start_defAssignment_16_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Warm_start_defAssignment_16_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getWarm_start_defAssignment_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_16__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_16__1"
    // InternalPerfectML.g:3229:1: rule__MLPClassifier__Group_16__1 : rule__MLPClassifier__Group_16__1__Impl rule__MLPClassifier__Group_16__2 ;
    public final void rule__MLPClassifier__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3233:1: ( rule__MLPClassifier__Group_16__1__Impl rule__MLPClassifier__Group_16__2 )
            // InternalPerfectML.g:3234:2: rule__MLPClassifier__Group_16__1__Impl rule__MLPClassifier__Group_16__2
            {
            pushFollow(FOLLOW_24);
            rule__MLPClassifier__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_16__1"


    // $ANTLR start "rule__MLPClassifier__Group_16__1__Impl"
    // InternalPerfectML.g:3241:1: rule__MLPClassifier__Group_16__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3245:1: ( ( '=' ) )
            // InternalPerfectML.g:3246:1: ( '=' )
            {
            // InternalPerfectML.g:3246:1: ( '=' )
            // InternalPerfectML.g:3247:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_16_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_16__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_16__2"
    // InternalPerfectML.g:3256:1: rule__MLPClassifier__Group_16__2 : rule__MLPClassifier__Group_16__2__Impl ;
    public final void rule__MLPClassifier__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3260:1: ( rule__MLPClassifier__Group_16__2__Impl )
            // InternalPerfectML.g:3261:2: rule__MLPClassifier__Group_16__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_16__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_16__2"


    // $ANTLR start "rule__MLPClassifier__Group_16__2__Impl"
    // InternalPerfectML.g:3267:1: rule__MLPClassifier__Group_16__2__Impl : ( ( rule__MLPClassifier__Warm_startAssignment_16_2 ) ) ;
    public final void rule__MLPClassifier__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3271:1: ( ( ( rule__MLPClassifier__Warm_startAssignment_16_2 ) ) )
            // InternalPerfectML.g:3272:1: ( ( rule__MLPClassifier__Warm_startAssignment_16_2 ) )
            {
            // InternalPerfectML.g:3272:1: ( ( rule__MLPClassifier__Warm_startAssignment_16_2 ) )
            // InternalPerfectML.g:3273:2: ( rule__MLPClassifier__Warm_startAssignment_16_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getWarm_startAssignment_16_2()); 
            // InternalPerfectML.g:3274:2: ( rule__MLPClassifier__Warm_startAssignment_16_2 )
            // InternalPerfectML.g:3274:3: rule__MLPClassifier__Warm_startAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Warm_startAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getWarm_startAssignment_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_16__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_17__0"
    // InternalPerfectML.g:3283:1: rule__MLPClassifier__Group_17__0 : rule__MLPClassifier__Group_17__0__Impl rule__MLPClassifier__Group_17__1 ;
    public final void rule__MLPClassifier__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3287:1: ( rule__MLPClassifier__Group_17__0__Impl rule__MLPClassifier__Group_17__1 )
            // InternalPerfectML.g:3288:2: rule__MLPClassifier__Group_17__0__Impl rule__MLPClassifier__Group_17__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_17__0"


    // $ANTLR start "rule__MLPClassifier__Group_17__0__Impl"
    // InternalPerfectML.g:3295:1: rule__MLPClassifier__Group_17__0__Impl : ( ( rule__MLPClassifier__Momentum_defAssignment_17_0 ) ) ;
    public final void rule__MLPClassifier__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3299:1: ( ( ( rule__MLPClassifier__Momentum_defAssignment_17_0 ) ) )
            // InternalPerfectML.g:3300:1: ( ( rule__MLPClassifier__Momentum_defAssignment_17_0 ) )
            {
            // InternalPerfectML.g:3300:1: ( ( rule__MLPClassifier__Momentum_defAssignment_17_0 ) )
            // InternalPerfectML.g:3301:2: ( rule__MLPClassifier__Momentum_defAssignment_17_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getMomentum_defAssignment_17_0()); 
            // InternalPerfectML.g:3302:2: ( rule__MLPClassifier__Momentum_defAssignment_17_0 )
            // InternalPerfectML.g:3302:3: rule__MLPClassifier__Momentum_defAssignment_17_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Momentum_defAssignment_17_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getMomentum_defAssignment_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_17__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_17__1"
    // InternalPerfectML.g:3310:1: rule__MLPClassifier__Group_17__1 : rule__MLPClassifier__Group_17__1__Impl rule__MLPClassifier__Group_17__2 ;
    public final void rule__MLPClassifier__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3314:1: ( rule__MLPClassifier__Group_17__1__Impl rule__MLPClassifier__Group_17__2 )
            // InternalPerfectML.g:3315:2: rule__MLPClassifier__Group_17__1__Impl rule__MLPClassifier__Group_17__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_17__1"


    // $ANTLR start "rule__MLPClassifier__Group_17__1__Impl"
    // InternalPerfectML.g:3322:1: rule__MLPClassifier__Group_17__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3326:1: ( ( '=' ) )
            // InternalPerfectML.g:3327:1: ( '=' )
            {
            // InternalPerfectML.g:3327:1: ( '=' )
            // InternalPerfectML.g:3328:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_17_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_17__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_17__2"
    // InternalPerfectML.g:3337:1: rule__MLPClassifier__Group_17__2 : rule__MLPClassifier__Group_17__2__Impl ;
    public final void rule__MLPClassifier__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3341:1: ( rule__MLPClassifier__Group_17__2__Impl )
            // InternalPerfectML.g:3342:2: rule__MLPClassifier__Group_17__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_17__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_17__2"


    // $ANTLR start "rule__MLPClassifier__Group_17__2__Impl"
    // InternalPerfectML.g:3348:1: rule__MLPClassifier__Group_17__2__Impl : ( ( rule__MLPClassifier__MomentumAssignment_17_2 ) ) ;
    public final void rule__MLPClassifier__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3352:1: ( ( ( rule__MLPClassifier__MomentumAssignment_17_2 ) ) )
            // InternalPerfectML.g:3353:1: ( ( rule__MLPClassifier__MomentumAssignment_17_2 ) )
            {
            // InternalPerfectML.g:3353:1: ( ( rule__MLPClassifier__MomentumAssignment_17_2 ) )
            // InternalPerfectML.g:3354:2: ( rule__MLPClassifier__MomentumAssignment_17_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getMomentumAssignment_17_2()); 
            // InternalPerfectML.g:3355:2: ( rule__MLPClassifier__MomentumAssignment_17_2 )
            // InternalPerfectML.g:3355:3: rule__MLPClassifier__MomentumAssignment_17_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__MomentumAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getMomentumAssignment_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_17__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_18__0"
    // InternalPerfectML.g:3364:1: rule__MLPClassifier__Group_18__0 : rule__MLPClassifier__Group_18__0__Impl rule__MLPClassifier__Group_18__1 ;
    public final void rule__MLPClassifier__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3368:1: ( rule__MLPClassifier__Group_18__0__Impl rule__MLPClassifier__Group_18__1 )
            // InternalPerfectML.g:3369:2: rule__MLPClassifier__Group_18__0__Impl rule__MLPClassifier__Group_18__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_18__0"


    // $ANTLR start "rule__MLPClassifier__Group_18__0__Impl"
    // InternalPerfectML.g:3376:1: rule__MLPClassifier__Group_18__0__Impl : ( ( rule__MLPClassifier__Nesterovs_momentum_defAssignment_18_0 ) ) ;
    public final void rule__MLPClassifier__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3380:1: ( ( ( rule__MLPClassifier__Nesterovs_momentum_defAssignment_18_0 ) ) )
            // InternalPerfectML.g:3381:1: ( ( rule__MLPClassifier__Nesterovs_momentum_defAssignment_18_0 ) )
            {
            // InternalPerfectML.g:3381:1: ( ( rule__MLPClassifier__Nesterovs_momentum_defAssignment_18_0 ) )
            // InternalPerfectML.g:3382:2: ( rule__MLPClassifier__Nesterovs_momentum_defAssignment_18_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getNesterovs_momentum_defAssignment_18_0()); 
            // InternalPerfectML.g:3383:2: ( rule__MLPClassifier__Nesterovs_momentum_defAssignment_18_0 )
            // InternalPerfectML.g:3383:3: rule__MLPClassifier__Nesterovs_momentum_defAssignment_18_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Nesterovs_momentum_defAssignment_18_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getNesterovs_momentum_defAssignment_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_18__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_18__1"
    // InternalPerfectML.g:3391:1: rule__MLPClassifier__Group_18__1 : rule__MLPClassifier__Group_18__1__Impl rule__MLPClassifier__Group_18__2 ;
    public final void rule__MLPClassifier__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3395:1: ( rule__MLPClassifier__Group_18__1__Impl rule__MLPClassifier__Group_18__2 )
            // InternalPerfectML.g:3396:2: rule__MLPClassifier__Group_18__1__Impl rule__MLPClassifier__Group_18__2
            {
            pushFollow(FOLLOW_24);
            rule__MLPClassifier__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_18__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_18__1"


    // $ANTLR start "rule__MLPClassifier__Group_18__1__Impl"
    // InternalPerfectML.g:3403:1: rule__MLPClassifier__Group_18__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3407:1: ( ( '=' ) )
            // InternalPerfectML.g:3408:1: ( '=' )
            {
            // InternalPerfectML.g:3408:1: ( '=' )
            // InternalPerfectML.g:3409:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_18_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_18__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_18__2"
    // InternalPerfectML.g:3418:1: rule__MLPClassifier__Group_18__2 : rule__MLPClassifier__Group_18__2__Impl ;
    public final void rule__MLPClassifier__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3422:1: ( rule__MLPClassifier__Group_18__2__Impl )
            // InternalPerfectML.g:3423:2: rule__MLPClassifier__Group_18__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_18__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_18__2"


    // $ANTLR start "rule__MLPClassifier__Group_18__2__Impl"
    // InternalPerfectML.g:3429:1: rule__MLPClassifier__Group_18__2__Impl : ( ( rule__MLPClassifier__Nesterovs_momentumAssignment_18_2 ) ) ;
    public final void rule__MLPClassifier__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3433:1: ( ( ( rule__MLPClassifier__Nesterovs_momentumAssignment_18_2 ) ) )
            // InternalPerfectML.g:3434:1: ( ( rule__MLPClassifier__Nesterovs_momentumAssignment_18_2 ) )
            {
            // InternalPerfectML.g:3434:1: ( ( rule__MLPClassifier__Nesterovs_momentumAssignment_18_2 ) )
            // InternalPerfectML.g:3435:2: ( rule__MLPClassifier__Nesterovs_momentumAssignment_18_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getNesterovs_momentumAssignment_18_2()); 
            // InternalPerfectML.g:3436:2: ( rule__MLPClassifier__Nesterovs_momentumAssignment_18_2 )
            // InternalPerfectML.g:3436:3: rule__MLPClassifier__Nesterovs_momentumAssignment_18_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Nesterovs_momentumAssignment_18_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getNesterovs_momentumAssignment_18_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_18__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_19__0"
    // InternalPerfectML.g:3445:1: rule__MLPClassifier__Group_19__0 : rule__MLPClassifier__Group_19__0__Impl rule__MLPClassifier__Group_19__1 ;
    public final void rule__MLPClassifier__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3449:1: ( rule__MLPClassifier__Group_19__0__Impl rule__MLPClassifier__Group_19__1 )
            // InternalPerfectML.g:3450:2: rule__MLPClassifier__Group_19__0__Impl rule__MLPClassifier__Group_19__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_19__0"


    // $ANTLR start "rule__MLPClassifier__Group_19__0__Impl"
    // InternalPerfectML.g:3457:1: rule__MLPClassifier__Group_19__0__Impl : ( ( rule__MLPClassifier__Early_stopping_defAssignment_19_0 ) ) ;
    public final void rule__MLPClassifier__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3461:1: ( ( ( rule__MLPClassifier__Early_stopping_defAssignment_19_0 ) ) )
            // InternalPerfectML.g:3462:1: ( ( rule__MLPClassifier__Early_stopping_defAssignment_19_0 ) )
            {
            // InternalPerfectML.g:3462:1: ( ( rule__MLPClassifier__Early_stopping_defAssignment_19_0 ) )
            // InternalPerfectML.g:3463:2: ( rule__MLPClassifier__Early_stopping_defAssignment_19_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getEarly_stopping_defAssignment_19_0()); 
            // InternalPerfectML.g:3464:2: ( rule__MLPClassifier__Early_stopping_defAssignment_19_0 )
            // InternalPerfectML.g:3464:3: rule__MLPClassifier__Early_stopping_defAssignment_19_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Early_stopping_defAssignment_19_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getEarly_stopping_defAssignment_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_19__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_19__1"
    // InternalPerfectML.g:3472:1: rule__MLPClassifier__Group_19__1 : rule__MLPClassifier__Group_19__1__Impl rule__MLPClassifier__Group_19__2 ;
    public final void rule__MLPClassifier__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3476:1: ( rule__MLPClassifier__Group_19__1__Impl rule__MLPClassifier__Group_19__2 )
            // InternalPerfectML.g:3477:2: rule__MLPClassifier__Group_19__1__Impl rule__MLPClassifier__Group_19__2
            {
            pushFollow(FOLLOW_24);
            rule__MLPClassifier__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_19__1"


    // $ANTLR start "rule__MLPClassifier__Group_19__1__Impl"
    // InternalPerfectML.g:3484:1: rule__MLPClassifier__Group_19__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3488:1: ( ( '=' ) )
            // InternalPerfectML.g:3489:1: ( '=' )
            {
            // InternalPerfectML.g:3489:1: ( '=' )
            // InternalPerfectML.g:3490:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_19_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_19__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_19__2"
    // InternalPerfectML.g:3499:1: rule__MLPClassifier__Group_19__2 : rule__MLPClassifier__Group_19__2__Impl ;
    public final void rule__MLPClassifier__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3503:1: ( rule__MLPClassifier__Group_19__2__Impl )
            // InternalPerfectML.g:3504:2: rule__MLPClassifier__Group_19__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_19__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_19__2"


    // $ANTLR start "rule__MLPClassifier__Group_19__2__Impl"
    // InternalPerfectML.g:3510:1: rule__MLPClassifier__Group_19__2__Impl : ( ( rule__MLPClassifier__Early_stoppingAssignment_19_2 ) ) ;
    public final void rule__MLPClassifier__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3514:1: ( ( ( rule__MLPClassifier__Early_stoppingAssignment_19_2 ) ) )
            // InternalPerfectML.g:3515:1: ( ( rule__MLPClassifier__Early_stoppingAssignment_19_2 ) )
            {
            // InternalPerfectML.g:3515:1: ( ( rule__MLPClassifier__Early_stoppingAssignment_19_2 ) )
            // InternalPerfectML.g:3516:2: ( rule__MLPClassifier__Early_stoppingAssignment_19_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getEarly_stoppingAssignment_19_2()); 
            // InternalPerfectML.g:3517:2: ( rule__MLPClassifier__Early_stoppingAssignment_19_2 )
            // InternalPerfectML.g:3517:3: rule__MLPClassifier__Early_stoppingAssignment_19_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Early_stoppingAssignment_19_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getEarly_stoppingAssignment_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_19__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_20__0"
    // InternalPerfectML.g:3526:1: rule__MLPClassifier__Group_20__0 : rule__MLPClassifier__Group_20__0__Impl rule__MLPClassifier__Group_20__1 ;
    public final void rule__MLPClassifier__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3530:1: ( rule__MLPClassifier__Group_20__0__Impl rule__MLPClassifier__Group_20__1 )
            // InternalPerfectML.g:3531:2: rule__MLPClassifier__Group_20__0__Impl rule__MLPClassifier__Group_20__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_20__0"


    // $ANTLR start "rule__MLPClassifier__Group_20__0__Impl"
    // InternalPerfectML.g:3538:1: rule__MLPClassifier__Group_20__0__Impl : ( ( rule__MLPClassifier__Validation_fraction_defAssignment_20_0 ) ) ;
    public final void rule__MLPClassifier__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3542:1: ( ( ( rule__MLPClassifier__Validation_fraction_defAssignment_20_0 ) ) )
            // InternalPerfectML.g:3543:1: ( ( rule__MLPClassifier__Validation_fraction_defAssignment_20_0 ) )
            {
            // InternalPerfectML.g:3543:1: ( ( rule__MLPClassifier__Validation_fraction_defAssignment_20_0 ) )
            // InternalPerfectML.g:3544:2: ( rule__MLPClassifier__Validation_fraction_defAssignment_20_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getValidation_fraction_defAssignment_20_0()); 
            // InternalPerfectML.g:3545:2: ( rule__MLPClassifier__Validation_fraction_defAssignment_20_0 )
            // InternalPerfectML.g:3545:3: rule__MLPClassifier__Validation_fraction_defAssignment_20_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Validation_fraction_defAssignment_20_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getValidation_fraction_defAssignment_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_20__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_20__1"
    // InternalPerfectML.g:3553:1: rule__MLPClassifier__Group_20__1 : rule__MLPClassifier__Group_20__1__Impl rule__MLPClassifier__Group_20__2 ;
    public final void rule__MLPClassifier__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3557:1: ( rule__MLPClassifier__Group_20__1__Impl rule__MLPClassifier__Group_20__2 )
            // InternalPerfectML.g:3558:2: rule__MLPClassifier__Group_20__1__Impl rule__MLPClassifier__Group_20__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_20__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_20__1"


    // $ANTLR start "rule__MLPClassifier__Group_20__1__Impl"
    // InternalPerfectML.g:3565:1: rule__MLPClassifier__Group_20__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3569:1: ( ( '=' ) )
            // InternalPerfectML.g:3570:1: ( '=' )
            {
            // InternalPerfectML.g:3570:1: ( '=' )
            // InternalPerfectML.g:3571:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_20_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_20__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_20__2"
    // InternalPerfectML.g:3580:1: rule__MLPClassifier__Group_20__2 : rule__MLPClassifier__Group_20__2__Impl ;
    public final void rule__MLPClassifier__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3584:1: ( rule__MLPClassifier__Group_20__2__Impl )
            // InternalPerfectML.g:3585:2: rule__MLPClassifier__Group_20__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_20__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_20__2"


    // $ANTLR start "rule__MLPClassifier__Group_20__2__Impl"
    // InternalPerfectML.g:3591:1: rule__MLPClassifier__Group_20__2__Impl : ( ( rule__MLPClassifier__Validation_fractionAssignment_20_2 ) ) ;
    public final void rule__MLPClassifier__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3595:1: ( ( ( rule__MLPClassifier__Validation_fractionAssignment_20_2 ) ) )
            // InternalPerfectML.g:3596:1: ( ( rule__MLPClassifier__Validation_fractionAssignment_20_2 ) )
            {
            // InternalPerfectML.g:3596:1: ( ( rule__MLPClassifier__Validation_fractionAssignment_20_2 ) )
            // InternalPerfectML.g:3597:2: ( rule__MLPClassifier__Validation_fractionAssignment_20_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getValidation_fractionAssignment_20_2()); 
            // InternalPerfectML.g:3598:2: ( rule__MLPClassifier__Validation_fractionAssignment_20_2 )
            // InternalPerfectML.g:3598:3: rule__MLPClassifier__Validation_fractionAssignment_20_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Validation_fractionAssignment_20_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getValidation_fractionAssignment_20_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_20__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_21__0"
    // InternalPerfectML.g:3607:1: rule__MLPClassifier__Group_21__0 : rule__MLPClassifier__Group_21__0__Impl rule__MLPClassifier__Group_21__1 ;
    public final void rule__MLPClassifier__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3611:1: ( rule__MLPClassifier__Group_21__0__Impl rule__MLPClassifier__Group_21__1 )
            // InternalPerfectML.g:3612:2: rule__MLPClassifier__Group_21__0__Impl rule__MLPClassifier__Group_21__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_21__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_21__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_21__0"


    // $ANTLR start "rule__MLPClassifier__Group_21__0__Impl"
    // InternalPerfectML.g:3619:1: rule__MLPClassifier__Group_21__0__Impl : ( ( rule__MLPClassifier__Beta_1_defAssignment_21_0 ) ) ;
    public final void rule__MLPClassifier__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3623:1: ( ( ( rule__MLPClassifier__Beta_1_defAssignment_21_0 ) ) )
            // InternalPerfectML.g:3624:1: ( ( rule__MLPClassifier__Beta_1_defAssignment_21_0 ) )
            {
            // InternalPerfectML.g:3624:1: ( ( rule__MLPClassifier__Beta_1_defAssignment_21_0 ) )
            // InternalPerfectML.g:3625:2: ( rule__MLPClassifier__Beta_1_defAssignment_21_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getBeta_1_defAssignment_21_0()); 
            // InternalPerfectML.g:3626:2: ( rule__MLPClassifier__Beta_1_defAssignment_21_0 )
            // InternalPerfectML.g:3626:3: rule__MLPClassifier__Beta_1_defAssignment_21_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Beta_1_defAssignment_21_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getBeta_1_defAssignment_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_21__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_21__1"
    // InternalPerfectML.g:3634:1: rule__MLPClassifier__Group_21__1 : rule__MLPClassifier__Group_21__1__Impl rule__MLPClassifier__Group_21__2 ;
    public final void rule__MLPClassifier__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3638:1: ( rule__MLPClassifier__Group_21__1__Impl rule__MLPClassifier__Group_21__2 )
            // InternalPerfectML.g:3639:2: rule__MLPClassifier__Group_21__1__Impl rule__MLPClassifier__Group_21__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_21__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_21__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_21__1"


    // $ANTLR start "rule__MLPClassifier__Group_21__1__Impl"
    // InternalPerfectML.g:3646:1: rule__MLPClassifier__Group_21__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3650:1: ( ( '=' ) )
            // InternalPerfectML.g:3651:1: ( '=' )
            {
            // InternalPerfectML.g:3651:1: ( '=' )
            // InternalPerfectML.g:3652:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_21_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_21_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_21__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_21__2"
    // InternalPerfectML.g:3661:1: rule__MLPClassifier__Group_21__2 : rule__MLPClassifier__Group_21__2__Impl ;
    public final void rule__MLPClassifier__Group_21__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3665:1: ( rule__MLPClassifier__Group_21__2__Impl )
            // InternalPerfectML.g:3666:2: rule__MLPClassifier__Group_21__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_21__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_21__2"


    // $ANTLR start "rule__MLPClassifier__Group_21__2__Impl"
    // InternalPerfectML.g:3672:1: rule__MLPClassifier__Group_21__2__Impl : ( ( rule__MLPClassifier__Beta_1Assignment_21_2 ) ) ;
    public final void rule__MLPClassifier__Group_21__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3676:1: ( ( ( rule__MLPClassifier__Beta_1Assignment_21_2 ) ) )
            // InternalPerfectML.g:3677:1: ( ( rule__MLPClassifier__Beta_1Assignment_21_2 ) )
            {
            // InternalPerfectML.g:3677:1: ( ( rule__MLPClassifier__Beta_1Assignment_21_2 ) )
            // InternalPerfectML.g:3678:2: ( rule__MLPClassifier__Beta_1Assignment_21_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getBeta_1Assignment_21_2()); 
            // InternalPerfectML.g:3679:2: ( rule__MLPClassifier__Beta_1Assignment_21_2 )
            // InternalPerfectML.g:3679:3: rule__MLPClassifier__Beta_1Assignment_21_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Beta_1Assignment_21_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getBeta_1Assignment_21_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_21__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_22__0"
    // InternalPerfectML.g:3688:1: rule__MLPClassifier__Group_22__0 : rule__MLPClassifier__Group_22__0__Impl rule__MLPClassifier__Group_22__1 ;
    public final void rule__MLPClassifier__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3692:1: ( rule__MLPClassifier__Group_22__0__Impl rule__MLPClassifier__Group_22__1 )
            // InternalPerfectML.g:3693:2: rule__MLPClassifier__Group_22__0__Impl rule__MLPClassifier__Group_22__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_22__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_22__0"


    // $ANTLR start "rule__MLPClassifier__Group_22__0__Impl"
    // InternalPerfectML.g:3700:1: rule__MLPClassifier__Group_22__0__Impl : ( ( rule__MLPClassifier__Beta_2_defAssignment_22_0 ) ) ;
    public final void rule__MLPClassifier__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3704:1: ( ( ( rule__MLPClassifier__Beta_2_defAssignment_22_0 ) ) )
            // InternalPerfectML.g:3705:1: ( ( rule__MLPClassifier__Beta_2_defAssignment_22_0 ) )
            {
            // InternalPerfectML.g:3705:1: ( ( rule__MLPClassifier__Beta_2_defAssignment_22_0 ) )
            // InternalPerfectML.g:3706:2: ( rule__MLPClassifier__Beta_2_defAssignment_22_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getBeta_2_defAssignment_22_0()); 
            // InternalPerfectML.g:3707:2: ( rule__MLPClassifier__Beta_2_defAssignment_22_0 )
            // InternalPerfectML.g:3707:3: rule__MLPClassifier__Beta_2_defAssignment_22_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Beta_2_defAssignment_22_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getBeta_2_defAssignment_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_22__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_22__1"
    // InternalPerfectML.g:3715:1: rule__MLPClassifier__Group_22__1 : rule__MLPClassifier__Group_22__1__Impl rule__MLPClassifier__Group_22__2 ;
    public final void rule__MLPClassifier__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3719:1: ( rule__MLPClassifier__Group_22__1__Impl rule__MLPClassifier__Group_22__2 )
            // InternalPerfectML.g:3720:2: rule__MLPClassifier__Group_22__1__Impl rule__MLPClassifier__Group_22__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_22__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_22__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_22__1"


    // $ANTLR start "rule__MLPClassifier__Group_22__1__Impl"
    // InternalPerfectML.g:3727:1: rule__MLPClassifier__Group_22__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3731:1: ( ( '=' ) )
            // InternalPerfectML.g:3732:1: ( '=' )
            {
            // InternalPerfectML.g:3732:1: ( '=' )
            // InternalPerfectML.g:3733:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_22_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_22_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_22__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_22__2"
    // InternalPerfectML.g:3742:1: rule__MLPClassifier__Group_22__2 : rule__MLPClassifier__Group_22__2__Impl ;
    public final void rule__MLPClassifier__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3746:1: ( rule__MLPClassifier__Group_22__2__Impl )
            // InternalPerfectML.g:3747:2: rule__MLPClassifier__Group_22__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_22__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_22__2"


    // $ANTLR start "rule__MLPClassifier__Group_22__2__Impl"
    // InternalPerfectML.g:3753:1: rule__MLPClassifier__Group_22__2__Impl : ( ( rule__MLPClassifier__Beta_2Assignment_22_2 ) ) ;
    public final void rule__MLPClassifier__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3757:1: ( ( ( rule__MLPClassifier__Beta_2Assignment_22_2 ) ) )
            // InternalPerfectML.g:3758:1: ( ( rule__MLPClassifier__Beta_2Assignment_22_2 ) )
            {
            // InternalPerfectML.g:3758:1: ( ( rule__MLPClassifier__Beta_2Assignment_22_2 ) )
            // InternalPerfectML.g:3759:2: ( rule__MLPClassifier__Beta_2Assignment_22_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getBeta_2Assignment_22_2()); 
            // InternalPerfectML.g:3760:2: ( rule__MLPClassifier__Beta_2Assignment_22_2 )
            // InternalPerfectML.g:3760:3: rule__MLPClassifier__Beta_2Assignment_22_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Beta_2Assignment_22_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getBeta_2Assignment_22_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_22__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_23__0"
    // InternalPerfectML.g:3769:1: rule__MLPClassifier__Group_23__0 : rule__MLPClassifier__Group_23__0__Impl rule__MLPClassifier__Group_23__1 ;
    public final void rule__MLPClassifier__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3773:1: ( rule__MLPClassifier__Group_23__0__Impl rule__MLPClassifier__Group_23__1 )
            // InternalPerfectML.g:3774:2: rule__MLPClassifier__Group_23__0__Impl rule__MLPClassifier__Group_23__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_23__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_23__0"


    // $ANTLR start "rule__MLPClassifier__Group_23__0__Impl"
    // InternalPerfectML.g:3781:1: rule__MLPClassifier__Group_23__0__Impl : ( ( rule__MLPClassifier__Epsilon_defAssignment_23_0 ) ) ;
    public final void rule__MLPClassifier__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3785:1: ( ( ( rule__MLPClassifier__Epsilon_defAssignment_23_0 ) ) )
            // InternalPerfectML.g:3786:1: ( ( rule__MLPClassifier__Epsilon_defAssignment_23_0 ) )
            {
            // InternalPerfectML.g:3786:1: ( ( rule__MLPClassifier__Epsilon_defAssignment_23_0 ) )
            // InternalPerfectML.g:3787:2: ( rule__MLPClassifier__Epsilon_defAssignment_23_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getEpsilon_defAssignment_23_0()); 
            // InternalPerfectML.g:3788:2: ( rule__MLPClassifier__Epsilon_defAssignment_23_0 )
            // InternalPerfectML.g:3788:3: rule__MLPClassifier__Epsilon_defAssignment_23_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Epsilon_defAssignment_23_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getEpsilon_defAssignment_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_23__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_23__1"
    // InternalPerfectML.g:3796:1: rule__MLPClassifier__Group_23__1 : rule__MLPClassifier__Group_23__1__Impl rule__MLPClassifier__Group_23__2 ;
    public final void rule__MLPClassifier__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3800:1: ( rule__MLPClassifier__Group_23__1__Impl rule__MLPClassifier__Group_23__2 )
            // InternalPerfectML.g:3801:2: rule__MLPClassifier__Group_23__1__Impl rule__MLPClassifier__Group_23__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_23__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_23__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_23__1"


    // $ANTLR start "rule__MLPClassifier__Group_23__1__Impl"
    // InternalPerfectML.g:3808:1: rule__MLPClassifier__Group_23__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3812:1: ( ( '=' ) )
            // InternalPerfectML.g:3813:1: ( '=' )
            {
            // InternalPerfectML.g:3813:1: ( '=' )
            // InternalPerfectML.g:3814:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_23_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_23_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_23__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_23__2"
    // InternalPerfectML.g:3823:1: rule__MLPClassifier__Group_23__2 : rule__MLPClassifier__Group_23__2__Impl ;
    public final void rule__MLPClassifier__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3827:1: ( rule__MLPClassifier__Group_23__2__Impl )
            // InternalPerfectML.g:3828:2: rule__MLPClassifier__Group_23__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_23__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_23__2"


    // $ANTLR start "rule__MLPClassifier__Group_23__2__Impl"
    // InternalPerfectML.g:3834:1: rule__MLPClassifier__Group_23__2__Impl : ( ( rule__MLPClassifier__EpsilonAssignment_23_2 ) ) ;
    public final void rule__MLPClassifier__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3838:1: ( ( ( rule__MLPClassifier__EpsilonAssignment_23_2 ) ) )
            // InternalPerfectML.g:3839:1: ( ( rule__MLPClassifier__EpsilonAssignment_23_2 ) )
            {
            // InternalPerfectML.g:3839:1: ( ( rule__MLPClassifier__EpsilonAssignment_23_2 ) )
            // InternalPerfectML.g:3840:2: ( rule__MLPClassifier__EpsilonAssignment_23_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getEpsilonAssignment_23_2()); 
            // InternalPerfectML.g:3841:2: ( rule__MLPClassifier__EpsilonAssignment_23_2 )
            // InternalPerfectML.g:3841:3: rule__MLPClassifier__EpsilonAssignment_23_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__EpsilonAssignment_23_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getEpsilonAssignment_23_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_23__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_24__0"
    // InternalPerfectML.g:3850:1: rule__MLPClassifier__Group_24__0 : rule__MLPClassifier__Group_24__0__Impl rule__MLPClassifier__Group_24__1 ;
    public final void rule__MLPClassifier__Group_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3854:1: ( rule__MLPClassifier__Group_24__0__Impl rule__MLPClassifier__Group_24__1 )
            // InternalPerfectML.g:3855:2: rule__MLPClassifier__Group_24__0__Impl rule__MLPClassifier__Group_24__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_24__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_24__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_24__0"


    // $ANTLR start "rule__MLPClassifier__Group_24__0__Impl"
    // InternalPerfectML.g:3862:1: rule__MLPClassifier__Group_24__0__Impl : ( ( rule__MLPClassifier__N_iter_no_change_defAssignment_24_0 ) ) ;
    public final void rule__MLPClassifier__Group_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3866:1: ( ( ( rule__MLPClassifier__N_iter_no_change_defAssignment_24_0 ) ) )
            // InternalPerfectML.g:3867:1: ( ( rule__MLPClassifier__N_iter_no_change_defAssignment_24_0 ) )
            {
            // InternalPerfectML.g:3867:1: ( ( rule__MLPClassifier__N_iter_no_change_defAssignment_24_0 ) )
            // InternalPerfectML.g:3868:2: ( rule__MLPClassifier__N_iter_no_change_defAssignment_24_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getN_iter_no_change_defAssignment_24_0()); 
            // InternalPerfectML.g:3869:2: ( rule__MLPClassifier__N_iter_no_change_defAssignment_24_0 )
            // InternalPerfectML.g:3869:3: rule__MLPClassifier__N_iter_no_change_defAssignment_24_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__N_iter_no_change_defAssignment_24_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getN_iter_no_change_defAssignment_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_24__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_24__1"
    // InternalPerfectML.g:3877:1: rule__MLPClassifier__Group_24__1 : rule__MLPClassifier__Group_24__1__Impl rule__MLPClassifier__Group_24__2 ;
    public final void rule__MLPClassifier__Group_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3881:1: ( rule__MLPClassifier__Group_24__1__Impl rule__MLPClassifier__Group_24__2 )
            // InternalPerfectML.g:3882:2: rule__MLPClassifier__Group_24__1__Impl rule__MLPClassifier__Group_24__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_24__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_24__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_24__1"


    // $ANTLR start "rule__MLPClassifier__Group_24__1__Impl"
    // InternalPerfectML.g:3889:1: rule__MLPClassifier__Group_24__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3893:1: ( ( '=' ) )
            // InternalPerfectML.g:3894:1: ( '=' )
            {
            // InternalPerfectML.g:3894:1: ( '=' )
            // InternalPerfectML.g:3895:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_24_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_24_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_24__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_24__2"
    // InternalPerfectML.g:3904:1: rule__MLPClassifier__Group_24__2 : rule__MLPClassifier__Group_24__2__Impl ;
    public final void rule__MLPClassifier__Group_24__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3908:1: ( rule__MLPClassifier__Group_24__2__Impl )
            // InternalPerfectML.g:3909:2: rule__MLPClassifier__Group_24__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_24__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_24__2"


    // $ANTLR start "rule__MLPClassifier__Group_24__2__Impl"
    // InternalPerfectML.g:3915:1: rule__MLPClassifier__Group_24__2__Impl : ( ( rule__MLPClassifier__N_iter_no_changeAssignment_24_2 ) ) ;
    public final void rule__MLPClassifier__Group_24__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3919:1: ( ( ( rule__MLPClassifier__N_iter_no_changeAssignment_24_2 ) ) )
            // InternalPerfectML.g:3920:1: ( ( rule__MLPClassifier__N_iter_no_changeAssignment_24_2 ) )
            {
            // InternalPerfectML.g:3920:1: ( ( rule__MLPClassifier__N_iter_no_changeAssignment_24_2 ) )
            // InternalPerfectML.g:3921:2: ( rule__MLPClassifier__N_iter_no_changeAssignment_24_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getN_iter_no_changeAssignment_24_2()); 
            // InternalPerfectML.g:3922:2: ( rule__MLPClassifier__N_iter_no_changeAssignment_24_2 )
            // InternalPerfectML.g:3922:3: rule__MLPClassifier__N_iter_no_changeAssignment_24_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__N_iter_no_changeAssignment_24_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getN_iter_no_changeAssignment_24_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_24__2__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_25__0"
    // InternalPerfectML.g:3931:1: rule__MLPClassifier__Group_25__0 : rule__MLPClassifier__Group_25__0__Impl rule__MLPClassifier__Group_25__1 ;
    public final void rule__MLPClassifier__Group_25__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3935:1: ( rule__MLPClassifier__Group_25__0__Impl rule__MLPClassifier__Group_25__1 )
            // InternalPerfectML.g:3936:2: rule__MLPClassifier__Group_25__0__Impl rule__MLPClassifier__Group_25__1
            {
            pushFollow(FOLLOW_16);
            rule__MLPClassifier__Group_25__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_25__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_25__0"


    // $ANTLR start "rule__MLPClassifier__Group_25__0__Impl"
    // InternalPerfectML.g:3943:1: rule__MLPClassifier__Group_25__0__Impl : ( ( rule__MLPClassifier__Max_fun_defAssignment_25_0 ) ) ;
    public final void rule__MLPClassifier__Group_25__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3947:1: ( ( ( rule__MLPClassifier__Max_fun_defAssignment_25_0 ) ) )
            // InternalPerfectML.g:3948:1: ( ( rule__MLPClassifier__Max_fun_defAssignment_25_0 ) )
            {
            // InternalPerfectML.g:3948:1: ( ( rule__MLPClassifier__Max_fun_defAssignment_25_0 ) )
            // InternalPerfectML.g:3949:2: ( rule__MLPClassifier__Max_fun_defAssignment_25_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getMax_fun_defAssignment_25_0()); 
            // InternalPerfectML.g:3950:2: ( rule__MLPClassifier__Max_fun_defAssignment_25_0 )
            // InternalPerfectML.g:3950:3: rule__MLPClassifier__Max_fun_defAssignment_25_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Max_fun_defAssignment_25_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getMax_fun_defAssignment_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_25__0__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_25__1"
    // InternalPerfectML.g:3958:1: rule__MLPClassifier__Group_25__1 : rule__MLPClassifier__Group_25__1__Impl rule__MLPClassifier__Group_25__2 ;
    public final void rule__MLPClassifier__Group_25__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3962:1: ( rule__MLPClassifier__Group_25__1__Impl rule__MLPClassifier__Group_25__2 )
            // InternalPerfectML.g:3963:2: rule__MLPClassifier__Group_25__1__Impl rule__MLPClassifier__Group_25__2
            {
            pushFollow(FOLLOW_18);
            rule__MLPClassifier__Group_25__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_25__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_25__1"


    // $ANTLR start "rule__MLPClassifier__Group_25__1__Impl"
    // InternalPerfectML.g:3970:1: rule__MLPClassifier__Group_25__1__Impl : ( '=' ) ;
    public final void rule__MLPClassifier__Group_25__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3974:1: ( ( '=' ) )
            // InternalPerfectML.g:3975:1: ( '=' )
            {
            // InternalPerfectML.g:3975:1: ( '=' )
            // InternalPerfectML.g:3976:2: '='
            {
             before(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_25_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEqualsSignKeyword_25_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_25__1__Impl"


    // $ANTLR start "rule__MLPClassifier__Group_25__2"
    // InternalPerfectML.g:3985:1: rule__MLPClassifier__Group_25__2 : rule__MLPClassifier__Group_25__2__Impl ;
    public final void rule__MLPClassifier__Group_25__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:3989:1: ( rule__MLPClassifier__Group_25__2__Impl )
            // InternalPerfectML.g:3990:2: rule__MLPClassifier__Group_25__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Group_25__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_25__2"


    // $ANTLR start "rule__MLPClassifier__Group_25__2__Impl"
    // InternalPerfectML.g:3996:1: rule__MLPClassifier__Group_25__2__Impl : ( ( rule__MLPClassifier__Max_funAssignment_25_2 ) ) ;
    public final void rule__MLPClassifier__Group_25__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4000:1: ( ( ( rule__MLPClassifier__Max_funAssignment_25_2 ) ) )
            // InternalPerfectML.g:4001:1: ( ( rule__MLPClassifier__Max_funAssignment_25_2 ) )
            {
            // InternalPerfectML.g:4001:1: ( ( rule__MLPClassifier__Max_funAssignment_25_2 ) )
            // InternalPerfectML.g:4002:2: ( rule__MLPClassifier__Max_funAssignment_25_2 )
            {
             before(grammarAccess.getMLPClassifierAccess().getMax_funAssignment_25_2()); 
            // InternalPerfectML.g:4003:2: ( rule__MLPClassifier__Max_funAssignment_25_2 )
            // InternalPerfectML.g:4003:3: rule__MLPClassifier__Max_funAssignment_25_2
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Max_funAssignment_25_2();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getMax_funAssignment_25_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Group_25__2__Impl"


    // $ANTLR start "rule__SVC__Group__0"
    // InternalPerfectML.g:4012:1: rule__SVC__Group__0 : rule__SVC__Group__0__Impl rule__SVC__Group__1 ;
    public final void rule__SVC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4016:1: ( rule__SVC__Group__0__Impl rule__SVC__Group__1 )
            // InternalPerfectML.g:4017:2: rule__SVC__Group__0__Impl rule__SVC__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__SVC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__0"


    // $ANTLR start "rule__SVC__Group__0__Impl"
    // InternalPerfectML.g:4024:1: rule__SVC__Group__0__Impl : ( () ) ;
    public final void rule__SVC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4028:1: ( ( () ) )
            // InternalPerfectML.g:4029:1: ( () )
            {
            // InternalPerfectML.g:4029:1: ( () )
            // InternalPerfectML.g:4030:2: ()
            {
             before(grammarAccess.getSVCAccess().getSVCAction_0()); 
            // InternalPerfectML.g:4031:2: ()
            // InternalPerfectML.g:4031:3: 
            {
            }

             after(grammarAccess.getSVCAccess().getSVCAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__0__Impl"


    // $ANTLR start "rule__SVC__Group__1"
    // InternalPerfectML.g:4039:1: rule__SVC__Group__1 : rule__SVC__Group__1__Impl rule__SVC__Group__2 ;
    public final void rule__SVC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4043:1: ( rule__SVC__Group__1__Impl rule__SVC__Group__2 )
            // InternalPerfectML.g:4044:2: rule__SVC__Group__1__Impl rule__SVC__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SVC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__1"


    // $ANTLR start "rule__SVC__Group__1__Impl"
    // InternalPerfectML.g:4051:1: rule__SVC__Group__1__Impl : ( 'SVC' ) ;
    public final void rule__SVC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4055:1: ( ( 'SVC' ) )
            // InternalPerfectML.g:4056:1: ( 'SVC' )
            {
            // InternalPerfectML.g:4056:1: ( 'SVC' )
            // InternalPerfectML.g:4057:2: 'SVC'
            {
             before(grammarAccess.getSVCAccess().getSVCKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getSVCKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__1__Impl"


    // $ANTLR start "rule__SVC__Group__2"
    // InternalPerfectML.g:4066:1: rule__SVC__Group__2 : rule__SVC__Group__2__Impl rule__SVC__Group__3 ;
    public final void rule__SVC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4070:1: ( rule__SVC__Group__2__Impl rule__SVC__Group__3 )
            // InternalPerfectML.g:4071:2: rule__SVC__Group__2__Impl rule__SVC__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__2"


    // $ANTLR start "rule__SVC__Group__2__Impl"
    // InternalPerfectML.g:4078:1: rule__SVC__Group__2__Impl : ( 'with' ) ;
    public final void rule__SVC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4082:1: ( ( 'with' ) )
            // InternalPerfectML.g:4083:1: ( 'with' )
            {
            // InternalPerfectML.g:4083:1: ( 'with' )
            // InternalPerfectML.g:4084:2: 'with'
            {
             before(grammarAccess.getSVCAccess().getWithKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__2__Impl"


    // $ANTLR start "rule__SVC__Group__3"
    // InternalPerfectML.g:4093:1: rule__SVC__Group__3 : rule__SVC__Group__3__Impl rule__SVC__Group__4 ;
    public final void rule__SVC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4097:1: ( rule__SVC__Group__3__Impl rule__SVC__Group__4 )
            // InternalPerfectML.g:4098:2: rule__SVC__Group__3__Impl rule__SVC__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__3"


    // $ANTLR start "rule__SVC__Group__3__Impl"
    // InternalPerfectML.g:4105:1: rule__SVC__Group__3__Impl : ( ( rule__SVC__Group_3__0 )? ) ;
    public final void rule__SVC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4109:1: ( ( ( rule__SVC__Group_3__0 )? ) )
            // InternalPerfectML.g:4110:1: ( ( rule__SVC__Group_3__0 )? )
            {
            // InternalPerfectML.g:4110:1: ( ( rule__SVC__Group_3__0 )? )
            // InternalPerfectML.g:4111:2: ( rule__SVC__Group_3__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_3()); 
            // InternalPerfectML.g:4112:2: ( rule__SVC__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==88) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPerfectML.g:4112:3: rule__SVC__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__3__Impl"


    // $ANTLR start "rule__SVC__Group__4"
    // InternalPerfectML.g:4120:1: rule__SVC__Group__4 : rule__SVC__Group__4__Impl rule__SVC__Group__5 ;
    public final void rule__SVC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4124:1: ( rule__SVC__Group__4__Impl rule__SVC__Group__5 )
            // InternalPerfectML.g:4125:2: rule__SVC__Group__4__Impl rule__SVC__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__4"


    // $ANTLR start "rule__SVC__Group__4__Impl"
    // InternalPerfectML.g:4132:1: rule__SVC__Group__4__Impl : ( ( rule__SVC__Group_4__0 )? ) ;
    public final void rule__SVC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4136:1: ( ( ( rule__SVC__Group_4__0 )? ) )
            // InternalPerfectML.g:4137:1: ( ( rule__SVC__Group_4__0 )? )
            {
            // InternalPerfectML.g:4137:1: ( ( rule__SVC__Group_4__0 )? )
            // InternalPerfectML.g:4138:2: ( rule__SVC__Group_4__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_4()); 
            // InternalPerfectML.g:4139:2: ( rule__SVC__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==89) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPerfectML.g:4139:3: rule__SVC__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__4__Impl"


    // $ANTLR start "rule__SVC__Group__5"
    // InternalPerfectML.g:4147:1: rule__SVC__Group__5 : rule__SVC__Group__5__Impl rule__SVC__Group__6 ;
    public final void rule__SVC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4151:1: ( rule__SVC__Group__5__Impl rule__SVC__Group__6 )
            // InternalPerfectML.g:4152:2: rule__SVC__Group__5__Impl rule__SVC__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__5"


    // $ANTLR start "rule__SVC__Group__5__Impl"
    // InternalPerfectML.g:4159:1: rule__SVC__Group__5__Impl : ( ( rule__SVC__Group_5__0 )? ) ;
    public final void rule__SVC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4163:1: ( ( ( rule__SVC__Group_5__0 )? ) )
            // InternalPerfectML.g:4164:1: ( ( rule__SVC__Group_5__0 )? )
            {
            // InternalPerfectML.g:4164:1: ( ( rule__SVC__Group_5__0 )? )
            // InternalPerfectML.g:4165:2: ( rule__SVC__Group_5__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_5()); 
            // InternalPerfectML.g:4166:2: ( rule__SVC__Group_5__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==90) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPerfectML.g:4166:3: rule__SVC__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__5__Impl"


    // $ANTLR start "rule__SVC__Group__6"
    // InternalPerfectML.g:4174:1: rule__SVC__Group__6 : rule__SVC__Group__6__Impl rule__SVC__Group__7 ;
    public final void rule__SVC__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4178:1: ( rule__SVC__Group__6__Impl rule__SVC__Group__7 )
            // InternalPerfectML.g:4179:2: rule__SVC__Group__6__Impl rule__SVC__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__6"


    // $ANTLR start "rule__SVC__Group__6__Impl"
    // InternalPerfectML.g:4186:1: rule__SVC__Group__6__Impl : ( ( rule__SVC__Group_6__0 )? ) ;
    public final void rule__SVC__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4190:1: ( ( ( rule__SVC__Group_6__0 )? ) )
            // InternalPerfectML.g:4191:1: ( ( rule__SVC__Group_6__0 )? )
            {
            // InternalPerfectML.g:4191:1: ( ( rule__SVC__Group_6__0 )? )
            // InternalPerfectML.g:4192:2: ( rule__SVC__Group_6__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_6()); 
            // InternalPerfectML.g:4193:2: ( rule__SVC__Group_6__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==91) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPerfectML.g:4193:3: rule__SVC__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__6__Impl"


    // $ANTLR start "rule__SVC__Group__7"
    // InternalPerfectML.g:4201:1: rule__SVC__Group__7 : rule__SVC__Group__7__Impl rule__SVC__Group__8 ;
    public final void rule__SVC__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4205:1: ( rule__SVC__Group__7__Impl rule__SVC__Group__8 )
            // InternalPerfectML.g:4206:2: rule__SVC__Group__7__Impl rule__SVC__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__7"


    // $ANTLR start "rule__SVC__Group__7__Impl"
    // InternalPerfectML.g:4213:1: rule__SVC__Group__7__Impl : ( ( rule__SVC__Group_7__0 )? ) ;
    public final void rule__SVC__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4217:1: ( ( ( rule__SVC__Group_7__0 )? ) )
            // InternalPerfectML.g:4218:1: ( ( rule__SVC__Group_7__0 )? )
            {
            // InternalPerfectML.g:4218:1: ( ( rule__SVC__Group_7__0 )? )
            // InternalPerfectML.g:4219:2: ( rule__SVC__Group_7__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_7()); 
            // InternalPerfectML.g:4220:2: ( rule__SVC__Group_7__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==92) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPerfectML.g:4220:3: rule__SVC__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__7__Impl"


    // $ANTLR start "rule__SVC__Group__8"
    // InternalPerfectML.g:4228:1: rule__SVC__Group__8 : rule__SVC__Group__8__Impl rule__SVC__Group__9 ;
    public final void rule__SVC__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4232:1: ( rule__SVC__Group__8__Impl rule__SVC__Group__9 )
            // InternalPerfectML.g:4233:2: rule__SVC__Group__8__Impl rule__SVC__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__8"


    // $ANTLR start "rule__SVC__Group__8__Impl"
    // InternalPerfectML.g:4240:1: rule__SVC__Group__8__Impl : ( ( rule__SVC__Group_8__0 )? ) ;
    public final void rule__SVC__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4244:1: ( ( ( rule__SVC__Group_8__0 )? ) )
            // InternalPerfectML.g:4245:1: ( ( rule__SVC__Group_8__0 )? )
            {
            // InternalPerfectML.g:4245:1: ( ( rule__SVC__Group_8__0 )? )
            // InternalPerfectML.g:4246:2: ( rule__SVC__Group_8__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_8()); 
            // InternalPerfectML.g:4247:2: ( rule__SVC__Group_8__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==93) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPerfectML.g:4247:3: rule__SVC__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__8__Impl"


    // $ANTLR start "rule__SVC__Group__9"
    // InternalPerfectML.g:4255:1: rule__SVC__Group__9 : rule__SVC__Group__9__Impl rule__SVC__Group__10 ;
    public final void rule__SVC__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4259:1: ( rule__SVC__Group__9__Impl rule__SVC__Group__10 )
            // InternalPerfectML.g:4260:2: rule__SVC__Group__9__Impl rule__SVC__Group__10
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__9"


    // $ANTLR start "rule__SVC__Group__9__Impl"
    // InternalPerfectML.g:4267:1: rule__SVC__Group__9__Impl : ( ( rule__SVC__Group_9__0 )? ) ;
    public final void rule__SVC__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4271:1: ( ( ( rule__SVC__Group_9__0 )? ) )
            // InternalPerfectML.g:4272:1: ( ( rule__SVC__Group_9__0 )? )
            {
            // InternalPerfectML.g:4272:1: ( ( rule__SVC__Group_9__0 )? )
            // InternalPerfectML.g:4273:2: ( rule__SVC__Group_9__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_9()); 
            // InternalPerfectML.g:4274:2: ( rule__SVC__Group_9__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==94) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPerfectML.g:4274:3: rule__SVC__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__9__Impl"


    // $ANTLR start "rule__SVC__Group__10"
    // InternalPerfectML.g:4282:1: rule__SVC__Group__10 : rule__SVC__Group__10__Impl rule__SVC__Group__11 ;
    public final void rule__SVC__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4286:1: ( rule__SVC__Group__10__Impl rule__SVC__Group__11 )
            // InternalPerfectML.g:4287:2: rule__SVC__Group__10__Impl rule__SVC__Group__11
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__10"


    // $ANTLR start "rule__SVC__Group__10__Impl"
    // InternalPerfectML.g:4294:1: rule__SVC__Group__10__Impl : ( ( rule__SVC__Group_10__0 )? ) ;
    public final void rule__SVC__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4298:1: ( ( ( rule__SVC__Group_10__0 )? ) )
            // InternalPerfectML.g:4299:1: ( ( rule__SVC__Group_10__0 )? )
            {
            // InternalPerfectML.g:4299:1: ( ( rule__SVC__Group_10__0 )? )
            // InternalPerfectML.g:4300:2: ( rule__SVC__Group_10__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_10()); 
            // InternalPerfectML.g:4301:2: ( rule__SVC__Group_10__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==76) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPerfectML.g:4301:3: rule__SVC__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__10__Impl"


    // $ANTLR start "rule__SVC__Group__11"
    // InternalPerfectML.g:4309:1: rule__SVC__Group__11 : rule__SVC__Group__11__Impl rule__SVC__Group__12 ;
    public final void rule__SVC__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4313:1: ( rule__SVC__Group__11__Impl rule__SVC__Group__12 )
            // InternalPerfectML.g:4314:2: rule__SVC__Group__11__Impl rule__SVC__Group__12
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__11"


    // $ANTLR start "rule__SVC__Group__11__Impl"
    // InternalPerfectML.g:4321:1: rule__SVC__Group__11__Impl : ( ( rule__SVC__Group_11__0 )? ) ;
    public final void rule__SVC__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4325:1: ( ( ( rule__SVC__Group_11__0 )? ) )
            // InternalPerfectML.g:4326:1: ( ( rule__SVC__Group_11__0 )? )
            {
            // InternalPerfectML.g:4326:1: ( ( rule__SVC__Group_11__0 )? )
            // InternalPerfectML.g:4327:2: ( rule__SVC__Group_11__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_11()); 
            // InternalPerfectML.g:4328:2: ( rule__SVC__Group_11__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==95) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPerfectML.g:4328:3: rule__SVC__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__11__Impl"


    // $ANTLR start "rule__SVC__Group__12"
    // InternalPerfectML.g:4336:1: rule__SVC__Group__12 : rule__SVC__Group__12__Impl rule__SVC__Group__13 ;
    public final void rule__SVC__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4340:1: ( rule__SVC__Group__12__Impl rule__SVC__Group__13 )
            // InternalPerfectML.g:4341:2: rule__SVC__Group__12__Impl rule__SVC__Group__13
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__12"


    // $ANTLR start "rule__SVC__Group__12__Impl"
    // InternalPerfectML.g:4348:1: rule__SVC__Group__12__Impl : ( ( rule__SVC__Group_12__0 )? ) ;
    public final void rule__SVC__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4352:1: ( ( ( rule__SVC__Group_12__0 )? ) )
            // InternalPerfectML.g:4353:1: ( ( rule__SVC__Group_12__0 )? )
            {
            // InternalPerfectML.g:4353:1: ( ( rule__SVC__Group_12__0 )? )
            // InternalPerfectML.g:4354:2: ( rule__SVC__Group_12__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_12()); 
            // InternalPerfectML.g:4355:2: ( rule__SVC__Group_12__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==77) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPerfectML.g:4355:3: rule__SVC__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__12__Impl"


    // $ANTLR start "rule__SVC__Group__13"
    // InternalPerfectML.g:4363:1: rule__SVC__Group__13 : rule__SVC__Group__13__Impl rule__SVC__Group__14 ;
    public final void rule__SVC__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4367:1: ( rule__SVC__Group__13__Impl rule__SVC__Group__14 )
            // InternalPerfectML.g:4368:2: rule__SVC__Group__13__Impl rule__SVC__Group__14
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__13"


    // $ANTLR start "rule__SVC__Group__13__Impl"
    // InternalPerfectML.g:4375:1: rule__SVC__Group__13__Impl : ( ( rule__SVC__Group_13__0 )? ) ;
    public final void rule__SVC__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4379:1: ( ( ( rule__SVC__Group_13__0 )? ) )
            // InternalPerfectML.g:4380:1: ( ( rule__SVC__Group_13__0 )? )
            {
            // InternalPerfectML.g:4380:1: ( ( rule__SVC__Group_13__0 )? )
            // InternalPerfectML.g:4381:2: ( rule__SVC__Group_13__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_13()); 
            // InternalPerfectML.g:4382:2: ( rule__SVC__Group_13__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==73) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPerfectML.g:4382:3: rule__SVC__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__13__Impl"


    // $ANTLR start "rule__SVC__Group__14"
    // InternalPerfectML.g:4390:1: rule__SVC__Group__14 : rule__SVC__Group__14__Impl rule__SVC__Group__15 ;
    public final void rule__SVC__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4394:1: ( rule__SVC__Group__14__Impl rule__SVC__Group__15 )
            // InternalPerfectML.g:4395:2: rule__SVC__Group__14__Impl rule__SVC__Group__15
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__14"


    // $ANTLR start "rule__SVC__Group__14__Impl"
    // InternalPerfectML.g:4402:1: rule__SVC__Group__14__Impl : ( ( rule__SVC__Group_14__0 )? ) ;
    public final void rule__SVC__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4406:1: ( ( ( rule__SVC__Group_14__0 )? ) )
            // InternalPerfectML.g:4407:1: ( ( rule__SVC__Group_14__0 )? )
            {
            // InternalPerfectML.g:4407:1: ( ( rule__SVC__Group_14__0 )? )
            // InternalPerfectML.g:4408:2: ( rule__SVC__Group_14__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_14()); 
            // InternalPerfectML.g:4409:2: ( rule__SVC__Group_14__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==96) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPerfectML.g:4409:3: rule__SVC__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__14__Impl"


    // $ANTLR start "rule__SVC__Group__15"
    // InternalPerfectML.g:4417:1: rule__SVC__Group__15 : rule__SVC__Group__15__Impl rule__SVC__Group__16 ;
    public final void rule__SVC__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4421:1: ( rule__SVC__Group__15__Impl rule__SVC__Group__16 )
            // InternalPerfectML.g:4422:2: rule__SVC__Group__15__Impl rule__SVC__Group__16
            {
            pushFollow(FOLLOW_26);
            rule__SVC__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__15"


    // $ANTLR start "rule__SVC__Group__15__Impl"
    // InternalPerfectML.g:4429:1: rule__SVC__Group__15__Impl : ( ( rule__SVC__Group_15__0 )? ) ;
    public final void rule__SVC__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4433:1: ( ( ( rule__SVC__Group_15__0 )? ) )
            // InternalPerfectML.g:4434:1: ( ( rule__SVC__Group_15__0 )? )
            {
            // InternalPerfectML.g:4434:1: ( ( rule__SVC__Group_15__0 )? )
            // InternalPerfectML.g:4435:2: ( rule__SVC__Group_15__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_15()); 
            // InternalPerfectML.g:4436:2: ( rule__SVC__Group_15__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==97) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalPerfectML.g:4436:3: rule__SVC__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__15__Impl"


    // $ANTLR start "rule__SVC__Group__16"
    // InternalPerfectML.g:4444:1: rule__SVC__Group__16 : rule__SVC__Group__16__Impl ;
    public final void rule__SVC__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4448:1: ( rule__SVC__Group__16__Impl )
            // InternalPerfectML.g:4449:2: rule__SVC__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__16"


    // $ANTLR start "rule__SVC__Group__16__Impl"
    // InternalPerfectML.g:4455:1: rule__SVC__Group__16__Impl : ( ( rule__SVC__Group_16__0 )? ) ;
    public final void rule__SVC__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4459:1: ( ( ( rule__SVC__Group_16__0 )? ) )
            // InternalPerfectML.g:4460:1: ( ( rule__SVC__Group_16__0 )? )
            {
            // InternalPerfectML.g:4460:1: ( ( rule__SVC__Group_16__0 )? )
            // InternalPerfectML.g:4461:2: ( rule__SVC__Group_16__0 )?
            {
             before(grammarAccess.getSVCAccess().getGroup_16()); 
            // InternalPerfectML.g:4462:2: ( rule__SVC__Group_16__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==75) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPerfectML.g:4462:3: rule__SVC__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVC__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVCAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group__16__Impl"


    // $ANTLR start "rule__SVC__Group_3__0"
    // InternalPerfectML.g:4471:1: rule__SVC__Group_3__0 : rule__SVC__Group_3__0__Impl rule__SVC__Group_3__1 ;
    public final void rule__SVC__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4475:1: ( rule__SVC__Group_3__0__Impl rule__SVC__Group_3__1 )
            // InternalPerfectML.g:4476:2: rule__SVC__Group_3__0__Impl rule__SVC__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_3__0"


    // $ANTLR start "rule__SVC__Group_3__0__Impl"
    // InternalPerfectML.g:4483:1: rule__SVC__Group_3__0__Impl : ( ( rule__SVC__C_defAssignment_3_0 ) ) ;
    public final void rule__SVC__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4487:1: ( ( ( rule__SVC__C_defAssignment_3_0 ) ) )
            // InternalPerfectML.g:4488:1: ( ( rule__SVC__C_defAssignment_3_0 ) )
            {
            // InternalPerfectML.g:4488:1: ( ( rule__SVC__C_defAssignment_3_0 ) )
            // InternalPerfectML.g:4489:2: ( rule__SVC__C_defAssignment_3_0 )
            {
             before(grammarAccess.getSVCAccess().getC_defAssignment_3_0()); 
            // InternalPerfectML.g:4490:2: ( rule__SVC__C_defAssignment_3_0 )
            // InternalPerfectML.g:4490:3: rule__SVC__C_defAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__C_defAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getC_defAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_3__0__Impl"


    // $ANTLR start "rule__SVC__Group_3__1"
    // InternalPerfectML.g:4498:1: rule__SVC__Group_3__1 : rule__SVC__Group_3__1__Impl rule__SVC__Group_3__2 ;
    public final void rule__SVC__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4502:1: ( rule__SVC__Group_3__1__Impl rule__SVC__Group_3__2 )
            // InternalPerfectML.g:4503:2: rule__SVC__Group_3__1__Impl rule__SVC__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__SVC__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_3__1"


    // $ANTLR start "rule__SVC__Group_3__1__Impl"
    // InternalPerfectML.g:4510:1: rule__SVC__Group_3__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4514:1: ( ( '=' ) )
            // InternalPerfectML.g:4515:1: ( '=' )
            {
            // InternalPerfectML.g:4515:1: ( '=' )
            // InternalPerfectML.g:4516:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_3_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_3__1__Impl"


    // $ANTLR start "rule__SVC__Group_3__2"
    // InternalPerfectML.g:4525:1: rule__SVC__Group_3__2 : rule__SVC__Group_3__2__Impl ;
    public final void rule__SVC__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4529:1: ( rule__SVC__Group_3__2__Impl )
            // InternalPerfectML.g:4530:2: rule__SVC__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_3__2"


    // $ANTLR start "rule__SVC__Group_3__2__Impl"
    // InternalPerfectML.g:4536:1: rule__SVC__Group_3__2__Impl : ( ( rule__SVC__CAssignment_3_2 ) ) ;
    public final void rule__SVC__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4540:1: ( ( ( rule__SVC__CAssignment_3_2 ) ) )
            // InternalPerfectML.g:4541:1: ( ( rule__SVC__CAssignment_3_2 ) )
            {
            // InternalPerfectML.g:4541:1: ( ( rule__SVC__CAssignment_3_2 ) )
            // InternalPerfectML.g:4542:2: ( rule__SVC__CAssignment_3_2 )
            {
             before(grammarAccess.getSVCAccess().getCAssignment_3_2()); 
            // InternalPerfectML.g:4543:2: ( rule__SVC__CAssignment_3_2 )
            // InternalPerfectML.g:4543:3: rule__SVC__CAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__CAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getCAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_3__2__Impl"


    // $ANTLR start "rule__SVC__Group_4__0"
    // InternalPerfectML.g:4552:1: rule__SVC__Group_4__0 : rule__SVC__Group_4__0__Impl rule__SVC__Group_4__1 ;
    public final void rule__SVC__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4556:1: ( rule__SVC__Group_4__0__Impl rule__SVC__Group_4__1 )
            // InternalPerfectML.g:4557:2: rule__SVC__Group_4__0__Impl rule__SVC__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_4__0"


    // $ANTLR start "rule__SVC__Group_4__0__Impl"
    // InternalPerfectML.g:4564:1: rule__SVC__Group_4__0__Impl : ( ( rule__SVC__Kernel_defAssignment_4_0 ) ) ;
    public final void rule__SVC__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4568:1: ( ( ( rule__SVC__Kernel_defAssignment_4_0 ) ) )
            // InternalPerfectML.g:4569:1: ( ( rule__SVC__Kernel_defAssignment_4_0 ) )
            {
            // InternalPerfectML.g:4569:1: ( ( rule__SVC__Kernel_defAssignment_4_0 ) )
            // InternalPerfectML.g:4570:2: ( rule__SVC__Kernel_defAssignment_4_0 )
            {
             before(grammarAccess.getSVCAccess().getKernel_defAssignment_4_0()); 
            // InternalPerfectML.g:4571:2: ( rule__SVC__Kernel_defAssignment_4_0 )
            // InternalPerfectML.g:4571:3: rule__SVC__Kernel_defAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Kernel_defAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getKernel_defAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_4__0__Impl"


    // $ANTLR start "rule__SVC__Group_4__1"
    // InternalPerfectML.g:4579:1: rule__SVC__Group_4__1 : rule__SVC__Group_4__1__Impl rule__SVC__Group_4__2 ;
    public final void rule__SVC__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4583:1: ( rule__SVC__Group_4__1__Impl rule__SVC__Group_4__2 )
            // InternalPerfectML.g:4584:2: rule__SVC__Group_4__1__Impl rule__SVC__Group_4__2
            {
            pushFollow(FOLLOW_27);
            rule__SVC__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_4__1"


    // $ANTLR start "rule__SVC__Group_4__1__Impl"
    // InternalPerfectML.g:4591:1: rule__SVC__Group_4__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4595:1: ( ( '=' ) )
            // InternalPerfectML.g:4596:1: ( '=' )
            {
            // InternalPerfectML.g:4596:1: ( '=' )
            // InternalPerfectML.g:4597:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_4_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_4__1__Impl"


    // $ANTLR start "rule__SVC__Group_4__2"
    // InternalPerfectML.g:4606:1: rule__SVC__Group_4__2 : rule__SVC__Group_4__2__Impl ;
    public final void rule__SVC__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4610:1: ( rule__SVC__Group_4__2__Impl )
            // InternalPerfectML.g:4611:2: rule__SVC__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_4__2"


    // $ANTLR start "rule__SVC__Group_4__2__Impl"
    // InternalPerfectML.g:4617:1: rule__SVC__Group_4__2__Impl : ( ( rule__SVC__KernelAssignment_4_2 ) ) ;
    public final void rule__SVC__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4621:1: ( ( ( rule__SVC__KernelAssignment_4_2 ) ) )
            // InternalPerfectML.g:4622:1: ( ( rule__SVC__KernelAssignment_4_2 ) )
            {
            // InternalPerfectML.g:4622:1: ( ( rule__SVC__KernelAssignment_4_2 ) )
            // InternalPerfectML.g:4623:2: ( rule__SVC__KernelAssignment_4_2 )
            {
             before(grammarAccess.getSVCAccess().getKernelAssignment_4_2()); 
            // InternalPerfectML.g:4624:2: ( rule__SVC__KernelAssignment_4_2 )
            // InternalPerfectML.g:4624:3: rule__SVC__KernelAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__KernelAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getKernelAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_4__2__Impl"


    // $ANTLR start "rule__SVC__Group_5__0"
    // InternalPerfectML.g:4633:1: rule__SVC__Group_5__0 : rule__SVC__Group_5__0__Impl rule__SVC__Group_5__1 ;
    public final void rule__SVC__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4637:1: ( rule__SVC__Group_5__0__Impl rule__SVC__Group_5__1 )
            // InternalPerfectML.g:4638:2: rule__SVC__Group_5__0__Impl rule__SVC__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_5__0"


    // $ANTLR start "rule__SVC__Group_5__0__Impl"
    // InternalPerfectML.g:4645:1: rule__SVC__Group_5__0__Impl : ( ( rule__SVC__Degree_defAssignment_5_0 ) ) ;
    public final void rule__SVC__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4649:1: ( ( ( rule__SVC__Degree_defAssignment_5_0 ) ) )
            // InternalPerfectML.g:4650:1: ( ( rule__SVC__Degree_defAssignment_5_0 ) )
            {
            // InternalPerfectML.g:4650:1: ( ( rule__SVC__Degree_defAssignment_5_0 ) )
            // InternalPerfectML.g:4651:2: ( rule__SVC__Degree_defAssignment_5_0 )
            {
             before(grammarAccess.getSVCAccess().getDegree_defAssignment_5_0()); 
            // InternalPerfectML.g:4652:2: ( rule__SVC__Degree_defAssignment_5_0 )
            // InternalPerfectML.g:4652:3: rule__SVC__Degree_defAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Degree_defAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getDegree_defAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_5__0__Impl"


    // $ANTLR start "rule__SVC__Group_5__1"
    // InternalPerfectML.g:4660:1: rule__SVC__Group_5__1 : rule__SVC__Group_5__1__Impl rule__SVC__Group_5__2 ;
    public final void rule__SVC__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4664:1: ( rule__SVC__Group_5__1__Impl rule__SVC__Group_5__2 )
            // InternalPerfectML.g:4665:2: rule__SVC__Group_5__1__Impl rule__SVC__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__SVC__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_5__1"


    // $ANTLR start "rule__SVC__Group_5__1__Impl"
    // InternalPerfectML.g:4672:1: rule__SVC__Group_5__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4676:1: ( ( '=' ) )
            // InternalPerfectML.g:4677:1: ( '=' )
            {
            // InternalPerfectML.g:4677:1: ( '=' )
            // InternalPerfectML.g:4678:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_5_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_5__1__Impl"


    // $ANTLR start "rule__SVC__Group_5__2"
    // InternalPerfectML.g:4687:1: rule__SVC__Group_5__2 : rule__SVC__Group_5__2__Impl ;
    public final void rule__SVC__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4691:1: ( rule__SVC__Group_5__2__Impl )
            // InternalPerfectML.g:4692:2: rule__SVC__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_5__2"


    // $ANTLR start "rule__SVC__Group_5__2__Impl"
    // InternalPerfectML.g:4698:1: rule__SVC__Group_5__2__Impl : ( ( rule__SVC__DegreeAssignment_5_2 ) ) ;
    public final void rule__SVC__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4702:1: ( ( ( rule__SVC__DegreeAssignment_5_2 ) ) )
            // InternalPerfectML.g:4703:1: ( ( rule__SVC__DegreeAssignment_5_2 ) )
            {
            // InternalPerfectML.g:4703:1: ( ( rule__SVC__DegreeAssignment_5_2 ) )
            // InternalPerfectML.g:4704:2: ( rule__SVC__DegreeAssignment_5_2 )
            {
             before(grammarAccess.getSVCAccess().getDegreeAssignment_5_2()); 
            // InternalPerfectML.g:4705:2: ( rule__SVC__DegreeAssignment_5_2 )
            // InternalPerfectML.g:4705:3: rule__SVC__DegreeAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__DegreeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getDegreeAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_5__2__Impl"


    // $ANTLR start "rule__SVC__Group_6__0"
    // InternalPerfectML.g:4714:1: rule__SVC__Group_6__0 : rule__SVC__Group_6__0__Impl rule__SVC__Group_6__1 ;
    public final void rule__SVC__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4718:1: ( rule__SVC__Group_6__0__Impl rule__SVC__Group_6__1 )
            // InternalPerfectML.g:4719:2: rule__SVC__Group_6__0__Impl rule__SVC__Group_6__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_6__0"


    // $ANTLR start "rule__SVC__Group_6__0__Impl"
    // InternalPerfectML.g:4726:1: rule__SVC__Group_6__0__Impl : ( ( rule__SVC__Gamma_defAssignment_6_0 ) ) ;
    public final void rule__SVC__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4730:1: ( ( ( rule__SVC__Gamma_defAssignment_6_0 ) ) )
            // InternalPerfectML.g:4731:1: ( ( rule__SVC__Gamma_defAssignment_6_0 ) )
            {
            // InternalPerfectML.g:4731:1: ( ( rule__SVC__Gamma_defAssignment_6_0 ) )
            // InternalPerfectML.g:4732:2: ( rule__SVC__Gamma_defAssignment_6_0 )
            {
             before(grammarAccess.getSVCAccess().getGamma_defAssignment_6_0()); 
            // InternalPerfectML.g:4733:2: ( rule__SVC__Gamma_defAssignment_6_0 )
            // InternalPerfectML.g:4733:3: rule__SVC__Gamma_defAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Gamma_defAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getGamma_defAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_6__0__Impl"


    // $ANTLR start "rule__SVC__Group_6__1"
    // InternalPerfectML.g:4741:1: rule__SVC__Group_6__1 : rule__SVC__Group_6__1__Impl rule__SVC__Group_6__2 ;
    public final void rule__SVC__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4745:1: ( rule__SVC__Group_6__1__Impl rule__SVC__Group_6__2 )
            // InternalPerfectML.g:4746:2: rule__SVC__Group_6__1__Impl rule__SVC__Group_6__2
            {
            pushFollow(FOLLOW_28);
            rule__SVC__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_6__1"


    // $ANTLR start "rule__SVC__Group_6__1__Impl"
    // InternalPerfectML.g:4753:1: rule__SVC__Group_6__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4757:1: ( ( '=' ) )
            // InternalPerfectML.g:4758:1: ( '=' )
            {
            // InternalPerfectML.g:4758:1: ( '=' )
            // InternalPerfectML.g:4759:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_6_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_6__1__Impl"


    // $ANTLR start "rule__SVC__Group_6__2"
    // InternalPerfectML.g:4768:1: rule__SVC__Group_6__2 : rule__SVC__Group_6__2__Impl ;
    public final void rule__SVC__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4772:1: ( rule__SVC__Group_6__2__Impl )
            // InternalPerfectML.g:4773:2: rule__SVC__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_6__2"


    // $ANTLR start "rule__SVC__Group_6__2__Impl"
    // InternalPerfectML.g:4779:1: rule__SVC__Group_6__2__Impl : ( ( rule__SVC__GammaAssignment_6_2 ) ) ;
    public final void rule__SVC__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4783:1: ( ( ( rule__SVC__GammaAssignment_6_2 ) ) )
            // InternalPerfectML.g:4784:1: ( ( rule__SVC__GammaAssignment_6_2 ) )
            {
            // InternalPerfectML.g:4784:1: ( ( rule__SVC__GammaAssignment_6_2 ) )
            // InternalPerfectML.g:4785:2: ( rule__SVC__GammaAssignment_6_2 )
            {
             before(grammarAccess.getSVCAccess().getGammaAssignment_6_2()); 
            // InternalPerfectML.g:4786:2: ( rule__SVC__GammaAssignment_6_2 )
            // InternalPerfectML.g:4786:3: rule__SVC__GammaAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__GammaAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getGammaAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_6__2__Impl"


    // $ANTLR start "rule__SVC__Group_7__0"
    // InternalPerfectML.g:4795:1: rule__SVC__Group_7__0 : rule__SVC__Group_7__0__Impl rule__SVC__Group_7__1 ;
    public final void rule__SVC__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4799:1: ( rule__SVC__Group_7__0__Impl rule__SVC__Group_7__1 )
            // InternalPerfectML.g:4800:2: rule__SVC__Group_7__0__Impl rule__SVC__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_7__0"


    // $ANTLR start "rule__SVC__Group_7__0__Impl"
    // InternalPerfectML.g:4807:1: rule__SVC__Group_7__0__Impl : ( ( rule__SVC__Coef0_defAssignment_7_0 ) ) ;
    public final void rule__SVC__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4811:1: ( ( ( rule__SVC__Coef0_defAssignment_7_0 ) ) )
            // InternalPerfectML.g:4812:1: ( ( rule__SVC__Coef0_defAssignment_7_0 ) )
            {
            // InternalPerfectML.g:4812:1: ( ( rule__SVC__Coef0_defAssignment_7_0 ) )
            // InternalPerfectML.g:4813:2: ( rule__SVC__Coef0_defAssignment_7_0 )
            {
             before(grammarAccess.getSVCAccess().getCoef0_defAssignment_7_0()); 
            // InternalPerfectML.g:4814:2: ( rule__SVC__Coef0_defAssignment_7_0 )
            // InternalPerfectML.g:4814:3: rule__SVC__Coef0_defAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Coef0_defAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getCoef0_defAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_7__0__Impl"


    // $ANTLR start "rule__SVC__Group_7__1"
    // InternalPerfectML.g:4822:1: rule__SVC__Group_7__1 : rule__SVC__Group_7__1__Impl rule__SVC__Group_7__2 ;
    public final void rule__SVC__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4826:1: ( rule__SVC__Group_7__1__Impl rule__SVC__Group_7__2 )
            // InternalPerfectML.g:4827:2: rule__SVC__Group_7__1__Impl rule__SVC__Group_7__2
            {
            pushFollow(FOLLOW_18);
            rule__SVC__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_7__1"


    // $ANTLR start "rule__SVC__Group_7__1__Impl"
    // InternalPerfectML.g:4834:1: rule__SVC__Group_7__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4838:1: ( ( '=' ) )
            // InternalPerfectML.g:4839:1: ( '=' )
            {
            // InternalPerfectML.g:4839:1: ( '=' )
            // InternalPerfectML.g:4840:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_7_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_7__1__Impl"


    // $ANTLR start "rule__SVC__Group_7__2"
    // InternalPerfectML.g:4849:1: rule__SVC__Group_7__2 : rule__SVC__Group_7__2__Impl ;
    public final void rule__SVC__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4853:1: ( rule__SVC__Group_7__2__Impl )
            // InternalPerfectML.g:4854:2: rule__SVC__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_7__2"


    // $ANTLR start "rule__SVC__Group_7__2__Impl"
    // InternalPerfectML.g:4860:1: rule__SVC__Group_7__2__Impl : ( ( rule__SVC__Coef0Assignment_7_2 ) ) ;
    public final void rule__SVC__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4864:1: ( ( ( rule__SVC__Coef0Assignment_7_2 ) ) )
            // InternalPerfectML.g:4865:1: ( ( rule__SVC__Coef0Assignment_7_2 ) )
            {
            // InternalPerfectML.g:4865:1: ( ( rule__SVC__Coef0Assignment_7_2 ) )
            // InternalPerfectML.g:4866:2: ( rule__SVC__Coef0Assignment_7_2 )
            {
             before(grammarAccess.getSVCAccess().getCoef0Assignment_7_2()); 
            // InternalPerfectML.g:4867:2: ( rule__SVC__Coef0Assignment_7_2 )
            // InternalPerfectML.g:4867:3: rule__SVC__Coef0Assignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Coef0Assignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getCoef0Assignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_7__2__Impl"


    // $ANTLR start "rule__SVC__Group_8__0"
    // InternalPerfectML.g:4876:1: rule__SVC__Group_8__0 : rule__SVC__Group_8__0__Impl rule__SVC__Group_8__1 ;
    public final void rule__SVC__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4880:1: ( rule__SVC__Group_8__0__Impl rule__SVC__Group_8__1 )
            // InternalPerfectML.g:4881:2: rule__SVC__Group_8__0__Impl rule__SVC__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_8__0"


    // $ANTLR start "rule__SVC__Group_8__0__Impl"
    // InternalPerfectML.g:4888:1: rule__SVC__Group_8__0__Impl : ( ( rule__SVC__Shrinking_defAssignment_8_0 ) ) ;
    public final void rule__SVC__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4892:1: ( ( ( rule__SVC__Shrinking_defAssignment_8_0 ) ) )
            // InternalPerfectML.g:4893:1: ( ( rule__SVC__Shrinking_defAssignment_8_0 ) )
            {
            // InternalPerfectML.g:4893:1: ( ( rule__SVC__Shrinking_defAssignment_8_0 ) )
            // InternalPerfectML.g:4894:2: ( rule__SVC__Shrinking_defAssignment_8_0 )
            {
             before(grammarAccess.getSVCAccess().getShrinking_defAssignment_8_0()); 
            // InternalPerfectML.g:4895:2: ( rule__SVC__Shrinking_defAssignment_8_0 )
            // InternalPerfectML.g:4895:3: rule__SVC__Shrinking_defAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Shrinking_defAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getShrinking_defAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_8__0__Impl"


    // $ANTLR start "rule__SVC__Group_8__1"
    // InternalPerfectML.g:4903:1: rule__SVC__Group_8__1 : rule__SVC__Group_8__1__Impl rule__SVC__Group_8__2 ;
    public final void rule__SVC__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4907:1: ( rule__SVC__Group_8__1__Impl rule__SVC__Group_8__2 )
            // InternalPerfectML.g:4908:2: rule__SVC__Group_8__1__Impl rule__SVC__Group_8__2
            {
            pushFollow(FOLLOW_24);
            rule__SVC__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_8__1"


    // $ANTLR start "rule__SVC__Group_8__1__Impl"
    // InternalPerfectML.g:4915:1: rule__SVC__Group_8__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4919:1: ( ( '=' ) )
            // InternalPerfectML.g:4920:1: ( '=' )
            {
            // InternalPerfectML.g:4920:1: ( '=' )
            // InternalPerfectML.g:4921:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_8_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_8__1__Impl"


    // $ANTLR start "rule__SVC__Group_8__2"
    // InternalPerfectML.g:4930:1: rule__SVC__Group_8__2 : rule__SVC__Group_8__2__Impl ;
    public final void rule__SVC__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4934:1: ( rule__SVC__Group_8__2__Impl )
            // InternalPerfectML.g:4935:2: rule__SVC__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_8__2"


    // $ANTLR start "rule__SVC__Group_8__2__Impl"
    // InternalPerfectML.g:4941:1: rule__SVC__Group_8__2__Impl : ( ( rule__SVC__ShrinkingAssignment_8_2 ) ) ;
    public final void rule__SVC__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4945:1: ( ( ( rule__SVC__ShrinkingAssignment_8_2 ) ) )
            // InternalPerfectML.g:4946:1: ( ( rule__SVC__ShrinkingAssignment_8_2 ) )
            {
            // InternalPerfectML.g:4946:1: ( ( rule__SVC__ShrinkingAssignment_8_2 ) )
            // InternalPerfectML.g:4947:2: ( rule__SVC__ShrinkingAssignment_8_2 )
            {
             before(grammarAccess.getSVCAccess().getShrinkingAssignment_8_2()); 
            // InternalPerfectML.g:4948:2: ( rule__SVC__ShrinkingAssignment_8_2 )
            // InternalPerfectML.g:4948:3: rule__SVC__ShrinkingAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__ShrinkingAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getShrinkingAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_8__2__Impl"


    // $ANTLR start "rule__SVC__Group_9__0"
    // InternalPerfectML.g:4957:1: rule__SVC__Group_9__0 : rule__SVC__Group_9__0__Impl rule__SVC__Group_9__1 ;
    public final void rule__SVC__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4961:1: ( rule__SVC__Group_9__0__Impl rule__SVC__Group_9__1 )
            // InternalPerfectML.g:4962:2: rule__SVC__Group_9__0__Impl rule__SVC__Group_9__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_9__0"


    // $ANTLR start "rule__SVC__Group_9__0__Impl"
    // InternalPerfectML.g:4969:1: rule__SVC__Group_9__0__Impl : ( ( rule__SVC__Probability_defAssignment_9_0 ) ) ;
    public final void rule__SVC__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4973:1: ( ( ( rule__SVC__Probability_defAssignment_9_0 ) ) )
            // InternalPerfectML.g:4974:1: ( ( rule__SVC__Probability_defAssignment_9_0 ) )
            {
            // InternalPerfectML.g:4974:1: ( ( rule__SVC__Probability_defAssignment_9_0 ) )
            // InternalPerfectML.g:4975:2: ( rule__SVC__Probability_defAssignment_9_0 )
            {
             before(grammarAccess.getSVCAccess().getProbability_defAssignment_9_0()); 
            // InternalPerfectML.g:4976:2: ( rule__SVC__Probability_defAssignment_9_0 )
            // InternalPerfectML.g:4976:3: rule__SVC__Probability_defAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Probability_defAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getProbability_defAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_9__0__Impl"


    // $ANTLR start "rule__SVC__Group_9__1"
    // InternalPerfectML.g:4984:1: rule__SVC__Group_9__1 : rule__SVC__Group_9__1__Impl rule__SVC__Group_9__2 ;
    public final void rule__SVC__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:4988:1: ( rule__SVC__Group_9__1__Impl rule__SVC__Group_9__2 )
            // InternalPerfectML.g:4989:2: rule__SVC__Group_9__1__Impl rule__SVC__Group_9__2
            {
            pushFollow(FOLLOW_24);
            rule__SVC__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_9__1"


    // $ANTLR start "rule__SVC__Group_9__1__Impl"
    // InternalPerfectML.g:4996:1: rule__SVC__Group_9__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5000:1: ( ( '=' ) )
            // InternalPerfectML.g:5001:1: ( '=' )
            {
            // InternalPerfectML.g:5001:1: ( '=' )
            // InternalPerfectML.g:5002:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_9_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_9__1__Impl"


    // $ANTLR start "rule__SVC__Group_9__2"
    // InternalPerfectML.g:5011:1: rule__SVC__Group_9__2 : rule__SVC__Group_9__2__Impl ;
    public final void rule__SVC__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5015:1: ( rule__SVC__Group_9__2__Impl )
            // InternalPerfectML.g:5016:2: rule__SVC__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_9__2"


    // $ANTLR start "rule__SVC__Group_9__2__Impl"
    // InternalPerfectML.g:5022:1: rule__SVC__Group_9__2__Impl : ( ( rule__SVC__ProbabilityAssignment_9_2 ) ) ;
    public final void rule__SVC__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5026:1: ( ( ( rule__SVC__ProbabilityAssignment_9_2 ) ) )
            // InternalPerfectML.g:5027:1: ( ( rule__SVC__ProbabilityAssignment_9_2 ) )
            {
            // InternalPerfectML.g:5027:1: ( ( rule__SVC__ProbabilityAssignment_9_2 ) )
            // InternalPerfectML.g:5028:2: ( rule__SVC__ProbabilityAssignment_9_2 )
            {
             before(grammarAccess.getSVCAccess().getProbabilityAssignment_9_2()); 
            // InternalPerfectML.g:5029:2: ( rule__SVC__ProbabilityAssignment_9_2 )
            // InternalPerfectML.g:5029:3: rule__SVC__ProbabilityAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__ProbabilityAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getProbabilityAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_9__2__Impl"


    // $ANTLR start "rule__SVC__Group_10__0"
    // InternalPerfectML.g:5038:1: rule__SVC__Group_10__0 : rule__SVC__Group_10__0__Impl rule__SVC__Group_10__1 ;
    public final void rule__SVC__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5042:1: ( rule__SVC__Group_10__0__Impl rule__SVC__Group_10__1 )
            // InternalPerfectML.g:5043:2: rule__SVC__Group_10__0__Impl rule__SVC__Group_10__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_10__0"


    // $ANTLR start "rule__SVC__Group_10__0__Impl"
    // InternalPerfectML.g:5050:1: rule__SVC__Group_10__0__Impl : ( ( rule__SVC__Tol_defAssignment_10_0 ) ) ;
    public final void rule__SVC__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5054:1: ( ( ( rule__SVC__Tol_defAssignment_10_0 ) ) )
            // InternalPerfectML.g:5055:1: ( ( rule__SVC__Tol_defAssignment_10_0 ) )
            {
            // InternalPerfectML.g:5055:1: ( ( rule__SVC__Tol_defAssignment_10_0 ) )
            // InternalPerfectML.g:5056:2: ( rule__SVC__Tol_defAssignment_10_0 )
            {
             before(grammarAccess.getSVCAccess().getTol_defAssignment_10_0()); 
            // InternalPerfectML.g:5057:2: ( rule__SVC__Tol_defAssignment_10_0 )
            // InternalPerfectML.g:5057:3: rule__SVC__Tol_defAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Tol_defAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getTol_defAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_10__0__Impl"


    // $ANTLR start "rule__SVC__Group_10__1"
    // InternalPerfectML.g:5065:1: rule__SVC__Group_10__1 : rule__SVC__Group_10__1__Impl rule__SVC__Group_10__2 ;
    public final void rule__SVC__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5069:1: ( rule__SVC__Group_10__1__Impl rule__SVC__Group_10__2 )
            // InternalPerfectML.g:5070:2: rule__SVC__Group_10__1__Impl rule__SVC__Group_10__2
            {
            pushFollow(FOLLOW_18);
            rule__SVC__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_10__1"


    // $ANTLR start "rule__SVC__Group_10__1__Impl"
    // InternalPerfectML.g:5077:1: rule__SVC__Group_10__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5081:1: ( ( '=' ) )
            // InternalPerfectML.g:5082:1: ( '=' )
            {
            // InternalPerfectML.g:5082:1: ( '=' )
            // InternalPerfectML.g:5083:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_10_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_10__1__Impl"


    // $ANTLR start "rule__SVC__Group_10__2"
    // InternalPerfectML.g:5092:1: rule__SVC__Group_10__2 : rule__SVC__Group_10__2__Impl ;
    public final void rule__SVC__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5096:1: ( rule__SVC__Group_10__2__Impl )
            // InternalPerfectML.g:5097:2: rule__SVC__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_10__2"


    // $ANTLR start "rule__SVC__Group_10__2__Impl"
    // InternalPerfectML.g:5103:1: rule__SVC__Group_10__2__Impl : ( ( rule__SVC__TolAssignment_10_2 ) ) ;
    public final void rule__SVC__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5107:1: ( ( ( rule__SVC__TolAssignment_10_2 ) ) )
            // InternalPerfectML.g:5108:1: ( ( rule__SVC__TolAssignment_10_2 ) )
            {
            // InternalPerfectML.g:5108:1: ( ( rule__SVC__TolAssignment_10_2 ) )
            // InternalPerfectML.g:5109:2: ( rule__SVC__TolAssignment_10_2 )
            {
             before(grammarAccess.getSVCAccess().getTolAssignment_10_2()); 
            // InternalPerfectML.g:5110:2: ( rule__SVC__TolAssignment_10_2 )
            // InternalPerfectML.g:5110:3: rule__SVC__TolAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__TolAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getTolAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_10__2__Impl"


    // $ANTLR start "rule__SVC__Group_11__0"
    // InternalPerfectML.g:5119:1: rule__SVC__Group_11__0 : rule__SVC__Group_11__0__Impl rule__SVC__Group_11__1 ;
    public final void rule__SVC__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5123:1: ( rule__SVC__Group_11__0__Impl rule__SVC__Group_11__1 )
            // InternalPerfectML.g:5124:2: rule__SVC__Group_11__0__Impl rule__SVC__Group_11__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_11__0"


    // $ANTLR start "rule__SVC__Group_11__0__Impl"
    // InternalPerfectML.g:5131:1: rule__SVC__Group_11__0__Impl : ( ( rule__SVC__Cache_size_defAssignment_11_0 ) ) ;
    public final void rule__SVC__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5135:1: ( ( ( rule__SVC__Cache_size_defAssignment_11_0 ) ) )
            // InternalPerfectML.g:5136:1: ( ( rule__SVC__Cache_size_defAssignment_11_0 ) )
            {
            // InternalPerfectML.g:5136:1: ( ( rule__SVC__Cache_size_defAssignment_11_0 ) )
            // InternalPerfectML.g:5137:2: ( rule__SVC__Cache_size_defAssignment_11_0 )
            {
             before(grammarAccess.getSVCAccess().getCache_size_defAssignment_11_0()); 
            // InternalPerfectML.g:5138:2: ( rule__SVC__Cache_size_defAssignment_11_0 )
            // InternalPerfectML.g:5138:3: rule__SVC__Cache_size_defAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Cache_size_defAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getCache_size_defAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_11__0__Impl"


    // $ANTLR start "rule__SVC__Group_11__1"
    // InternalPerfectML.g:5146:1: rule__SVC__Group_11__1 : rule__SVC__Group_11__1__Impl rule__SVC__Group_11__2 ;
    public final void rule__SVC__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5150:1: ( rule__SVC__Group_11__1__Impl rule__SVC__Group_11__2 )
            // InternalPerfectML.g:5151:2: rule__SVC__Group_11__1__Impl rule__SVC__Group_11__2
            {
            pushFollow(FOLLOW_18);
            rule__SVC__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_11__1"


    // $ANTLR start "rule__SVC__Group_11__1__Impl"
    // InternalPerfectML.g:5158:1: rule__SVC__Group_11__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5162:1: ( ( '=' ) )
            // InternalPerfectML.g:5163:1: ( '=' )
            {
            // InternalPerfectML.g:5163:1: ( '=' )
            // InternalPerfectML.g:5164:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_11_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_11__1__Impl"


    // $ANTLR start "rule__SVC__Group_11__2"
    // InternalPerfectML.g:5173:1: rule__SVC__Group_11__2 : rule__SVC__Group_11__2__Impl ;
    public final void rule__SVC__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5177:1: ( rule__SVC__Group_11__2__Impl )
            // InternalPerfectML.g:5178:2: rule__SVC__Group_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_11__2"


    // $ANTLR start "rule__SVC__Group_11__2__Impl"
    // InternalPerfectML.g:5184:1: rule__SVC__Group_11__2__Impl : ( ( rule__SVC__Cache_sizeAssignment_11_2 ) ) ;
    public final void rule__SVC__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5188:1: ( ( ( rule__SVC__Cache_sizeAssignment_11_2 ) ) )
            // InternalPerfectML.g:5189:1: ( ( rule__SVC__Cache_sizeAssignment_11_2 ) )
            {
            // InternalPerfectML.g:5189:1: ( ( rule__SVC__Cache_sizeAssignment_11_2 ) )
            // InternalPerfectML.g:5190:2: ( rule__SVC__Cache_sizeAssignment_11_2 )
            {
             before(grammarAccess.getSVCAccess().getCache_sizeAssignment_11_2()); 
            // InternalPerfectML.g:5191:2: ( rule__SVC__Cache_sizeAssignment_11_2 )
            // InternalPerfectML.g:5191:3: rule__SVC__Cache_sizeAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Cache_sizeAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getCache_sizeAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_11__2__Impl"


    // $ANTLR start "rule__SVC__Group_12__0"
    // InternalPerfectML.g:5200:1: rule__SVC__Group_12__0 : rule__SVC__Group_12__0__Impl rule__SVC__Group_12__1 ;
    public final void rule__SVC__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5204:1: ( rule__SVC__Group_12__0__Impl rule__SVC__Group_12__1 )
            // InternalPerfectML.g:5205:2: rule__SVC__Group_12__0__Impl rule__SVC__Group_12__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_12__0"


    // $ANTLR start "rule__SVC__Group_12__0__Impl"
    // InternalPerfectML.g:5212:1: rule__SVC__Group_12__0__Impl : ( ( rule__SVC__Verbose_defAssignment_12_0 ) ) ;
    public final void rule__SVC__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5216:1: ( ( ( rule__SVC__Verbose_defAssignment_12_0 ) ) )
            // InternalPerfectML.g:5217:1: ( ( rule__SVC__Verbose_defAssignment_12_0 ) )
            {
            // InternalPerfectML.g:5217:1: ( ( rule__SVC__Verbose_defAssignment_12_0 ) )
            // InternalPerfectML.g:5218:2: ( rule__SVC__Verbose_defAssignment_12_0 )
            {
             before(grammarAccess.getSVCAccess().getVerbose_defAssignment_12_0()); 
            // InternalPerfectML.g:5219:2: ( rule__SVC__Verbose_defAssignment_12_0 )
            // InternalPerfectML.g:5219:3: rule__SVC__Verbose_defAssignment_12_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Verbose_defAssignment_12_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getVerbose_defAssignment_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_12__0__Impl"


    // $ANTLR start "rule__SVC__Group_12__1"
    // InternalPerfectML.g:5227:1: rule__SVC__Group_12__1 : rule__SVC__Group_12__1__Impl rule__SVC__Group_12__2 ;
    public final void rule__SVC__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5231:1: ( rule__SVC__Group_12__1__Impl rule__SVC__Group_12__2 )
            // InternalPerfectML.g:5232:2: rule__SVC__Group_12__1__Impl rule__SVC__Group_12__2
            {
            pushFollow(FOLLOW_24);
            rule__SVC__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_12__1"


    // $ANTLR start "rule__SVC__Group_12__1__Impl"
    // InternalPerfectML.g:5239:1: rule__SVC__Group_12__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5243:1: ( ( '=' ) )
            // InternalPerfectML.g:5244:1: ( '=' )
            {
            // InternalPerfectML.g:5244:1: ( '=' )
            // InternalPerfectML.g:5245:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_12_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_12__1__Impl"


    // $ANTLR start "rule__SVC__Group_12__2"
    // InternalPerfectML.g:5254:1: rule__SVC__Group_12__2 : rule__SVC__Group_12__2__Impl ;
    public final void rule__SVC__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5258:1: ( rule__SVC__Group_12__2__Impl )
            // InternalPerfectML.g:5259:2: rule__SVC__Group_12__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_12__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_12__2"


    // $ANTLR start "rule__SVC__Group_12__2__Impl"
    // InternalPerfectML.g:5265:1: rule__SVC__Group_12__2__Impl : ( ( rule__SVC__VerboseAssignment_12_2 ) ) ;
    public final void rule__SVC__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5269:1: ( ( ( rule__SVC__VerboseAssignment_12_2 ) ) )
            // InternalPerfectML.g:5270:1: ( ( rule__SVC__VerboseAssignment_12_2 ) )
            {
            // InternalPerfectML.g:5270:1: ( ( rule__SVC__VerboseAssignment_12_2 ) )
            // InternalPerfectML.g:5271:2: ( rule__SVC__VerboseAssignment_12_2 )
            {
             before(grammarAccess.getSVCAccess().getVerboseAssignment_12_2()); 
            // InternalPerfectML.g:5272:2: ( rule__SVC__VerboseAssignment_12_2 )
            // InternalPerfectML.g:5272:3: rule__SVC__VerboseAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__VerboseAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getVerboseAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_12__2__Impl"


    // $ANTLR start "rule__SVC__Group_13__0"
    // InternalPerfectML.g:5281:1: rule__SVC__Group_13__0 : rule__SVC__Group_13__0__Impl rule__SVC__Group_13__1 ;
    public final void rule__SVC__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5285:1: ( rule__SVC__Group_13__0__Impl rule__SVC__Group_13__1 )
            // InternalPerfectML.g:5286:2: rule__SVC__Group_13__0__Impl rule__SVC__Group_13__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_13__0"


    // $ANTLR start "rule__SVC__Group_13__0__Impl"
    // InternalPerfectML.g:5293:1: rule__SVC__Group_13__0__Impl : ( ( rule__SVC__Max_iter_defAssignment_13_0 ) ) ;
    public final void rule__SVC__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5297:1: ( ( ( rule__SVC__Max_iter_defAssignment_13_0 ) ) )
            // InternalPerfectML.g:5298:1: ( ( rule__SVC__Max_iter_defAssignment_13_0 ) )
            {
            // InternalPerfectML.g:5298:1: ( ( rule__SVC__Max_iter_defAssignment_13_0 ) )
            // InternalPerfectML.g:5299:2: ( rule__SVC__Max_iter_defAssignment_13_0 )
            {
             before(grammarAccess.getSVCAccess().getMax_iter_defAssignment_13_0()); 
            // InternalPerfectML.g:5300:2: ( rule__SVC__Max_iter_defAssignment_13_0 )
            // InternalPerfectML.g:5300:3: rule__SVC__Max_iter_defAssignment_13_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Max_iter_defAssignment_13_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getMax_iter_defAssignment_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_13__0__Impl"


    // $ANTLR start "rule__SVC__Group_13__1"
    // InternalPerfectML.g:5308:1: rule__SVC__Group_13__1 : rule__SVC__Group_13__1__Impl rule__SVC__Group_13__2 ;
    public final void rule__SVC__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5312:1: ( rule__SVC__Group_13__1__Impl rule__SVC__Group_13__2 )
            // InternalPerfectML.g:5313:2: rule__SVC__Group_13__1__Impl rule__SVC__Group_13__2
            {
            pushFollow(FOLLOW_18);
            rule__SVC__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_13__1"


    // $ANTLR start "rule__SVC__Group_13__1__Impl"
    // InternalPerfectML.g:5320:1: rule__SVC__Group_13__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5324:1: ( ( '=' ) )
            // InternalPerfectML.g:5325:1: ( '=' )
            {
            // InternalPerfectML.g:5325:1: ( '=' )
            // InternalPerfectML.g:5326:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_13_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_13__1__Impl"


    // $ANTLR start "rule__SVC__Group_13__2"
    // InternalPerfectML.g:5335:1: rule__SVC__Group_13__2 : rule__SVC__Group_13__2__Impl ;
    public final void rule__SVC__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5339:1: ( rule__SVC__Group_13__2__Impl )
            // InternalPerfectML.g:5340:2: rule__SVC__Group_13__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_13__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_13__2"


    // $ANTLR start "rule__SVC__Group_13__2__Impl"
    // InternalPerfectML.g:5346:1: rule__SVC__Group_13__2__Impl : ( ( rule__SVC__Max_iterAssignment_13_2 ) ) ;
    public final void rule__SVC__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5350:1: ( ( ( rule__SVC__Max_iterAssignment_13_2 ) ) )
            // InternalPerfectML.g:5351:1: ( ( rule__SVC__Max_iterAssignment_13_2 ) )
            {
            // InternalPerfectML.g:5351:1: ( ( rule__SVC__Max_iterAssignment_13_2 ) )
            // InternalPerfectML.g:5352:2: ( rule__SVC__Max_iterAssignment_13_2 )
            {
             before(grammarAccess.getSVCAccess().getMax_iterAssignment_13_2()); 
            // InternalPerfectML.g:5353:2: ( rule__SVC__Max_iterAssignment_13_2 )
            // InternalPerfectML.g:5353:3: rule__SVC__Max_iterAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Max_iterAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getMax_iterAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_13__2__Impl"


    // $ANTLR start "rule__SVC__Group_14__0"
    // InternalPerfectML.g:5362:1: rule__SVC__Group_14__0 : rule__SVC__Group_14__0__Impl rule__SVC__Group_14__1 ;
    public final void rule__SVC__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5366:1: ( rule__SVC__Group_14__0__Impl rule__SVC__Group_14__1 )
            // InternalPerfectML.g:5367:2: rule__SVC__Group_14__0__Impl rule__SVC__Group_14__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_14__0"


    // $ANTLR start "rule__SVC__Group_14__0__Impl"
    // InternalPerfectML.g:5374:1: rule__SVC__Group_14__0__Impl : ( ( rule__SVC__Decision_function_shape_defAssignment_14_0 ) ) ;
    public final void rule__SVC__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5378:1: ( ( ( rule__SVC__Decision_function_shape_defAssignment_14_0 ) ) )
            // InternalPerfectML.g:5379:1: ( ( rule__SVC__Decision_function_shape_defAssignment_14_0 ) )
            {
            // InternalPerfectML.g:5379:1: ( ( rule__SVC__Decision_function_shape_defAssignment_14_0 ) )
            // InternalPerfectML.g:5380:2: ( rule__SVC__Decision_function_shape_defAssignment_14_0 )
            {
             before(grammarAccess.getSVCAccess().getDecision_function_shape_defAssignment_14_0()); 
            // InternalPerfectML.g:5381:2: ( rule__SVC__Decision_function_shape_defAssignment_14_0 )
            // InternalPerfectML.g:5381:3: rule__SVC__Decision_function_shape_defAssignment_14_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Decision_function_shape_defAssignment_14_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getDecision_function_shape_defAssignment_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_14__0__Impl"


    // $ANTLR start "rule__SVC__Group_14__1"
    // InternalPerfectML.g:5389:1: rule__SVC__Group_14__1 : rule__SVC__Group_14__1__Impl rule__SVC__Group_14__2 ;
    public final void rule__SVC__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5393:1: ( rule__SVC__Group_14__1__Impl rule__SVC__Group_14__2 )
            // InternalPerfectML.g:5394:2: rule__SVC__Group_14__1__Impl rule__SVC__Group_14__2
            {
            pushFollow(FOLLOW_29);
            rule__SVC__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_14__1"


    // $ANTLR start "rule__SVC__Group_14__1__Impl"
    // InternalPerfectML.g:5401:1: rule__SVC__Group_14__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5405:1: ( ( '=' ) )
            // InternalPerfectML.g:5406:1: ( '=' )
            {
            // InternalPerfectML.g:5406:1: ( '=' )
            // InternalPerfectML.g:5407:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_14_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_14__1__Impl"


    // $ANTLR start "rule__SVC__Group_14__2"
    // InternalPerfectML.g:5416:1: rule__SVC__Group_14__2 : rule__SVC__Group_14__2__Impl ;
    public final void rule__SVC__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5420:1: ( rule__SVC__Group_14__2__Impl )
            // InternalPerfectML.g:5421:2: rule__SVC__Group_14__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_14__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_14__2"


    // $ANTLR start "rule__SVC__Group_14__2__Impl"
    // InternalPerfectML.g:5427:1: rule__SVC__Group_14__2__Impl : ( ( rule__SVC__Decision_function_shapeAssignment_14_2 ) ) ;
    public final void rule__SVC__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5431:1: ( ( ( rule__SVC__Decision_function_shapeAssignment_14_2 ) ) )
            // InternalPerfectML.g:5432:1: ( ( rule__SVC__Decision_function_shapeAssignment_14_2 ) )
            {
            // InternalPerfectML.g:5432:1: ( ( rule__SVC__Decision_function_shapeAssignment_14_2 ) )
            // InternalPerfectML.g:5433:2: ( rule__SVC__Decision_function_shapeAssignment_14_2 )
            {
             before(grammarAccess.getSVCAccess().getDecision_function_shapeAssignment_14_2()); 
            // InternalPerfectML.g:5434:2: ( rule__SVC__Decision_function_shapeAssignment_14_2 )
            // InternalPerfectML.g:5434:3: rule__SVC__Decision_function_shapeAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Decision_function_shapeAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getDecision_function_shapeAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_14__2__Impl"


    // $ANTLR start "rule__SVC__Group_15__0"
    // InternalPerfectML.g:5443:1: rule__SVC__Group_15__0 : rule__SVC__Group_15__0__Impl rule__SVC__Group_15__1 ;
    public final void rule__SVC__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5447:1: ( rule__SVC__Group_15__0__Impl rule__SVC__Group_15__1 )
            // InternalPerfectML.g:5448:2: rule__SVC__Group_15__0__Impl rule__SVC__Group_15__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_15__0"


    // $ANTLR start "rule__SVC__Group_15__0__Impl"
    // InternalPerfectML.g:5455:1: rule__SVC__Group_15__0__Impl : ( ( rule__SVC__Break_ties_defAssignment_15_0 ) ) ;
    public final void rule__SVC__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5459:1: ( ( ( rule__SVC__Break_ties_defAssignment_15_0 ) ) )
            // InternalPerfectML.g:5460:1: ( ( rule__SVC__Break_ties_defAssignment_15_0 ) )
            {
            // InternalPerfectML.g:5460:1: ( ( rule__SVC__Break_ties_defAssignment_15_0 ) )
            // InternalPerfectML.g:5461:2: ( rule__SVC__Break_ties_defAssignment_15_0 )
            {
             before(grammarAccess.getSVCAccess().getBreak_ties_defAssignment_15_0()); 
            // InternalPerfectML.g:5462:2: ( rule__SVC__Break_ties_defAssignment_15_0 )
            // InternalPerfectML.g:5462:3: rule__SVC__Break_ties_defAssignment_15_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Break_ties_defAssignment_15_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getBreak_ties_defAssignment_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_15__0__Impl"


    // $ANTLR start "rule__SVC__Group_15__1"
    // InternalPerfectML.g:5470:1: rule__SVC__Group_15__1 : rule__SVC__Group_15__1__Impl rule__SVC__Group_15__2 ;
    public final void rule__SVC__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5474:1: ( rule__SVC__Group_15__1__Impl rule__SVC__Group_15__2 )
            // InternalPerfectML.g:5475:2: rule__SVC__Group_15__1__Impl rule__SVC__Group_15__2
            {
            pushFollow(FOLLOW_24);
            rule__SVC__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_15__1"


    // $ANTLR start "rule__SVC__Group_15__1__Impl"
    // InternalPerfectML.g:5482:1: rule__SVC__Group_15__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5486:1: ( ( '=' ) )
            // InternalPerfectML.g:5487:1: ( '=' )
            {
            // InternalPerfectML.g:5487:1: ( '=' )
            // InternalPerfectML.g:5488:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_15_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_15__1__Impl"


    // $ANTLR start "rule__SVC__Group_15__2"
    // InternalPerfectML.g:5497:1: rule__SVC__Group_15__2 : rule__SVC__Group_15__2__Impl ;
    public final void rule__SVC__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5501:1: ( rule__SVC__Group_15__2__Impl )
            // InternalPerfectML.g:5502:2: rule__SVC__Group_15__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_15__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_15__2"


    // $ANTLR start "rule__SVC__Group_15__2__Impl"
    // InternalPerfectML.g:5508:1: rule__SVC__Group_15__2__Impl : ( ( rule__SVC__Break_tiesAssignment_15_2 ) ) ;
    public final void rule__SVC__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5512:1: ( ( ( rule__SVC__Break_tiesAssignment_15_2 ) ) )
            // InternalPerfectML.g:5513:1: ( ( rule__SVC__Break_tiesAssignment_15_2 ) )
            {
            // InternalPerfectML.g:5513:1: ( ( rule__SVC__Break_tiesAssignment_15_2 ) )
            // InternalPerfectML.g:5514:2: ( rule__SVC__Break_tiesAssignment_15_2 )
            {
             before(grammarAccess.getSVCAccess().getBreak_tiesAssignment_15_2()); 
            // InternalPerfectML.g:5515:2: ( rule__SVC__Break_tiesAssignment_15_2 )
            // InternalPerfectML.g:5515:3: rule__SVC__Break_tiesAssignment_15_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Break_tiesAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getBreak_tiesAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_15__2__Impl"


    // $ANTLR start "rule__SVC__Group_16__0"
    // InternalPerfectML.g:5524:1: rule__SVC__Group_16__0 : rule__SVC__Group_16__0__Impl rule__SVC__Group_16__1 ;
    public final void rule__SVC__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5528:1: ( rule__SVC__Group_16__0__Impl rule__SVC__Group_16__1 )
            // InternalPerfectML.g:5529:2: rule__SVC__Group_16__0__Impl rule__SVC__Group_16__1
            {
            pushFollow(FOLLOW_16);
            rule__SVC__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_16__0"


    // $ANTLR start "rule__SVC__Group_16__0__Impl"
    // InternalPerfectML.g:5536:1: rule__SVC__Group_16__0__Impl : ( ( rule__SVC__Random_state_defAssignment_16_0 ) ) ;
    public final void rule__SVC__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5540:1: ( ( ( rule__SVC__Random_state_defAssignment_16_0 ) ) )
            // InternalPerfectML.g:5541:1: ( ( rule__SVC__Random_state_defAssignment_16_0 ) )
            {
            // InternalPerfectML.g:5541:1: ( ( rule__SVC__Random_state_defAssignment_16_0 ) )
            // InternalPerfectML.g:5542:2: ( rule__SVC__Random_state_defAssignment_16_0 )
            {
             before(grammarAccess.getSVCAccess().getRandom_state_defAssignment_16_0()); 
            // InternalPerfectML.g:5543:2: ( rule__SVC__Random_state_defAssignment_16_0 )
            // InternalPerfectML.g:5543:3: rule__SVC__Random_state_defAssignment_16_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Random_state_defAssignment_16_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getRandom_state_defAssignment_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_16__0__Impl"


    // $ANTLR start "rule__SVC__Group_16__1"
    // InternalPerfectML.g:5551:1: rule__SVC__Group_16__1 : rule__SVC__Group_16__1__Impl rule__SVC__Group_16__2 ;
    public final void rule__SVC__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5555:1: ( rule__SVC__Group_16__1__Impl rule__SVC__Group_16__2 )
            // InternalPerfectML.g:5556:2: rule__SVC__Group_16__1__Impl rule__SVC__Group_16__2
            {
            pushFollow(FOLLOW_18);
            rule__SVC__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVC__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_16__1"


    // $ANTLR start "rule__SVC__Group_16__1__Impl"
    // InternalPerfectML.g:5563:1: rule__SVC__Group_16__1__Impl : ( '=' ) ;
    public final void rule__SVC__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5567:1: ( ( '=' ) )
            // InternalPerfectML.g:5568:1: ( '=' )
            {
            // InternalPerfectML.g:5568:1: ( '=' )
            // InternalPerfectML.g:5569:2: '='
            {
             before(grammarAccess.getSVCAccess().getEqualsSignKeyword_16_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getEqualsSignKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_16__1__Impl"


    // $ANTLR start "rule__SVC__Group_16__2"
    // InternalPerfectML.g:5578:1: rule__SVC__Group_16__2 : rule__SVC__Group_16__2__Impl ;
    public final void rule__SVC__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5582:1: ( rule__SVC__Group_16__2__Impl )
            // InternalPerfectML.g:5583:2: rule__SVC__Group_16__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Group_16__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_16__2"


    // $ANTLR start "rule__SVC__Group_16__2__Impl"
    // InternalPerfectML.g:5589:1: rule__SVC__Group_16__2__Impl : ( ( rule__SVC__Random_stateAssignment_16_2 ) ) ;
    public final void rule__SVC__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5593:1: ( ( ( rule__SVC__Random_stateAssignment_16_2 ) ) )
            // InternalPerfectML.g:5594:1: ( ( rule__SVC__Random_stateAssignment_16_2 ) )
            {
            // InternalPerfectML.g:5594:1: ( ( rule__SVC__Random_stateAssignment_16_2 ) )
            // InternalPerfectML.g:5595:2: ( rule__SVC__Random_stateAssignment_16_2 )
            {
             before(grammarAccess.getSVCAccess().getRandom_stateAssignment_16_2()); 
            // InternalPerfectML.g:5596:2: ( rule__SVC__Random_stateAssignment_16_2 )
            // InternalPerfectML.g:5596:3: rule__SVC__Random_stateAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Random_stateAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getRandom_stateAssignment_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Group_16__2__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group__0"
    // InternalPerfectML.g:5605:1: rule__KNeighborsClassifier__Group__0 : rule__KNeighborsClassifier__Group__0__Impl rule__KNeighborsClassifier__Group__1 ;
    public final void rule__KNeighborsClassifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5609:1: ( rule__KNeighborsClassifier__Group__0__Impl rule__KNeighborsClassifier__Group__1 )
            // InternalPerfectML.g:5610:2: rule__KNeighborsClassifier__Group__0__Impl rule__KNeighborsClassifier__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__KNeighborsClassifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__0"


    // $ANTLR start "rule__KNeighborsClassifier__Group__0__Impl"
    // InternalPerfectML.g:5617:1: rule__KNeighborsClassifier__Group__0__Impl : ( () ) ;
    public final void rule__KNeighborsClassifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5621:1: ( ( () ) )
            // InternalPerfectML.g:5622:1: ( () )
            {
            // InternalPerfectML.g:5622:1: ( () )
            // InternalPerfectML.g:5623:2: ()
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getKNeighborsClassifierAction_0()); 
            // InternalPerfectML.g:5624:2: ()
            // InternalPerfectML.g:5624:3: 
            {
            }

             after(grammarAccess.getKNeighborsClassifierAccess().getKNeighborsClassifierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__0__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group__1"
    // InternalPerfectML.g:5632:1: rule__KNeighborsClassifier__Group__1 : rule__KNeighborsClassifier__Group__1__Impl rule__KNeighborsClassifier__Group__2 ;
    public final void rule__KNeighborsClassifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5636:1: ( rule__KNeighborsClassifier__Group__1__Impl rule__KNeighborsClassifier__Group__2 )
            // InternalPerfectML.g:5637:2: rule__KNeighborsClassifier__Group__1__Impl rule__KNeighborsClassifier__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__KNeighborsClassifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__1"


    // $ANTLR start "rule__KNeighborsClassifier__Group__1__Impl"
    // InternalPerfectML.g:5644:1: rule__KNeighborsClassifier__Group__1__Impl : ( 'KNeighborsClassifier' ) ;
    public final void rule__KNeighborsClassifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5648:1: ( ( 'KNeighborsClassifier' ) )
            // InternalPerfectML.g:5649:1: ( 'KNeighborsClassifier' )
            {
            // InternalPerfectML.g:5649:1: ( 'KNeighborsClassifier' )
            // InternalPerfectML.g:5650:2: 'KNeighborsClassifier'
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getKNeighborsClassifierKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getKNeighborsClassifierKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__1__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group__2"
    // InternalPerfectML.g:5659:1: rule__KNeighborsClassifier__Group__2 : rule__KNeighborsClassifier__Group__2__Impl rule__KNeighborsClassifier__Group__3 ;
    public final void rule__KNeighborsClassifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5663:1: ( rule__KNeighborsClassifier__Group__2__Impl rule__KNeighborsClassifier__Group__3 )
            // InternalPerfectML.g:5664:2: rule__KNeighborsClassifier__Group__2__Impl rule__KNeighborsClassifier__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__KNeighborsClassifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__2"


    // $ANTLR start "rule__KNeighborsClassifier__Group__2__Impl"
    // InternalPerfectML.g:5671:1: rule__KNeighborsClassifier__Group__2__Impl : ( 'with' ) ;
    public final void rule__KNeighborsClassifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5675:1: ( ( 'with' ) )
            // InternalPerfectML.g:5676:1: ( 'with' )
            {
            // InternalPerfectML.g:5676:1: ( 'with' )
            // InternalPerfectML.g:5677:2: 'with'
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getWithKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__2__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group__3"
    // InternalPerfectML.g:5686:1: rule__KNeighborsClassifier__Group__3 : rule__KNeighborsClassifier__Group__3__Impl rule__KNeighborsClassifier__Group__4 ;
    public final void rule__KNeighborsClassifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5690:1: ( rule__KNeighborsClassifier__Group__3__Impl rule__KNeighborsClassifier__Group__4 )
            // InternalPerfectML.g:5691:2: rule__KNeighborsClassifier__Group__3__Impl rule__KNeighborsClassifier__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__KNeighborsClassifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__3"


    // $ANTLR start "rule__KNeighborsClassifier__Group__3__Impl"
    // InternalPerfectML.g:5698:1: rule__KNeighborsClassifier__Group__3__Impl : ( ( rule__KNeighborsClassifier__Group_3__0 )? ) ;
    public final void rule__KNeighborsClassifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5702:1: ( ( ( rule__KNeighborsClassifier__Group_3__0 )? ) )
            // InternalPerfectML.g:5703:1: ( ( rule__KNeighborsClassifier__Group_3__0 )? )
            {
            // InternalPerfectML.g:5703:1: ( ( rule__KNeighborsClassifier__Group_3__0 )? )
            // InternalPerfectML.g:5704:2: ( rule__KNeighborsClassifier__Group_3__0 )?
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getGroup_3()); 
            // InternalPerfectML.g:5705:2: ( rule__KNeighborsClassifier__Group_3__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==98) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalPerfectML.g:5705:3: rule__KNeighborsClassifier__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KNeighborsClassifier__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__3__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group__4"
    // InternalPerfectML.g:5713:1: rule__KNeighborsClassifier__Group__4 : rule__KNeighborsClassifier__Group__4__Impl rule__KNeighborsClassifier__Group__5 ;
    public final void rule__KNeighborsClassifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5717:1: ( rule__KNeighborsClassifier__Group__4__Impl rule__KNeighborsClassifier__Group__5 )
            // InternalPerfectML.g:5718:2: rule__KNeighborsClassifier__Group__4__Impl rule__KNeighborsClassifier__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__KNeighborsClassifier__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__4"


    // $ANTLR start "rule__KNeighborsClassifier__Group__4__Impl"
    // InternalPerfectML.g:5725:1: rule__KNeighborsClassifier__Group__4__Impl : ( ( rule__KNeighborsClassifier__Group_4__0 )? ) ;
    public final void rule__KNeighborsClassifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5729:1: ( ( ( rule__KNeighborsClassifier__Group_4__0 )? ) )
            // InternalPerfectML.g:5730:1: ( ( rule__KNeighborsClassifier__Group_4__0 )? )
            {
            // InternalPerfectML.g:5730:1: ( ( rule__KNeighborsClassifier__Group_4__0 )? )
            // InternalPerfectML.g:5731:2: ( rule__KNeighborsClassifier__Group_4__0 )?
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getGroup_4()); 
            // InternalPerfectML.g:5732:2: ( rule__KNeighborsClassifier__Group_4__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==99) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalPerfectML.g:5732:3: rule__KNeighborsClassifier__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KNeighborsClassifier__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__4__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group__5"
    // InternalPerfectML.g:5740:1: rule__KNeighborsClassifier__Group__5 : rule__KNeighborsClassifier__Group__5__Impl rule__KNeighborsClassifier__Group__6 ;
    public final void rule__KNeighborsClassifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5744:1: ( rule__KNeighborsClassifier__Group__5__Impl rule__KNeighborsClassifier__Group__6 )
            // InternalPerfectML.g:5745:2: rule__KNeighborsClassifier__Group__5__Impl rule__KNeighborsClassifier__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__KNeighborsClassifier__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__5"


    // $ANTLR start "rule__KNeighborsClassifier__Group__5__Impl"
    // InternalPerfectML.g:5752:1: rule__KNeighborsClassifier__Group__5__Impl : ( ( rule__KNeighborsClassifier__Group_5__0 )? ) ;
    public final void rule__KNeighborsClassifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5756:1: ( ( ( rule__KNeighborsClassifier__Group_5__0 )? ) )
            // InternalPerfectML.g:5757:1: ( ( rule__KNeighborsClassifier__Group_5__0 )? )
            {
            // InternalPerfectML.g:5757:1: ( ( rule__KNeighborsClassifier__Group_5__0 )? )
            // InternalPerfectML.g:5758:2: ( rule__KNeighborsClassifier__Group_5__0 )?
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getGroup_5()); 
            // InternalPerfectML.g:5759:2: ( rule__KNeighborsClassifier__Group_5__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==100) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalPerfectML.g:5759:3: rule__KNeighborsClassifier__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KNeighborsClassifier__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__5__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group__6"
    // InternalPerfectML.g:5767:1: rule__KNeighborsClassifier__Group__6 : rule__KNeighborsClassifier__Group__6__Impl rule__KNeighborsClassifier__Group__7 ;
    public final void rule__KNeighborsClassifier__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5771:1: ( rule__KNeighborsClassifier__Group__6__Impl rule__KNeighborsClassifier__Group__7 )
            // InternalPerfectML.g:5772:2: rule__KNeighborsClassifier__Group__6__Impl rule__KNeighborsClassifier__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__KNeighborsClassifier__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__6"


    // $ANTLR start "rule__KNeighborsClassifier__Group__6__Impl"
    // InternalPerfectML.g:5779:1: rule__KNeighborsClassifier__Group__6__Impl : ( ( rule__KNeighborsClassifier__Group_6__0 )? ) ;
    public final void rule__KNeighborsClassifier__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5783:1: ( ( ( rule__KNeighborsClassifier__Group_6__0 )? ) )
            // InternalPerfectML.g:5784:1: ( ( rule__KNeighborsClassifier__Group_6__0 )? )
            {
            // InternalPerfectML.g:5784:1: ( ( rule__KNeighborsClassifier__Group_6__0 )? )
            // InternalPerfectML.g:5785:2: ( rule__KNeighborsClassifier__Group_6__0 )?
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getGroup_6()); 
            // InternalPerfectML.g:5786:2: ( rule__KNeighborsClassifier__Group_6__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==101) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalPerfectML.g:5786:3: rule__KNeighborsClassifier__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KNeighborsClassifier__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__6__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group__7"
    // InternalPerfectML.g:5794:1: rule__KNeighborsClassifier__Group__7 : rule__KNeighborsClassifier__Group__7__Impl rule__KNeighborsClassifier__Group__8 ;
    public final void rule__KNeighborsClassifier__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5798:1: ( rule__KNeighborsClassifier__Group__7__Impl rule__KNeighborsClassifier__Group__8 )
            // InternalPerfectML.g:5799:2: rule__KNeighborsClassifier__Group__7__Impl rule__KNeighborsClassifier__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__KNeighborsClassifier__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__7"


    // $ANTLR start "rule__KNeighborsClassifier__Group__7__Impl"
    // InternalPerfectML.g:5806:1: rule__KNeighborsClassifier__Group__7__Impl : ( ( rule__KNeighborsClassifier__Group_7__0 )? ) ;
    public final void rule__KNeighborsClassifier__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5810:1: ( ( ( rule__KNeighborsClassifier__Group_7__0 )? ) )
            // InternalPerfectML.g:5811:1: ( ( rule__KNeighborsClassifier__Group_7__0 )? )
            {
            // InternalPerfectML.g:5811:1: ( ( rule__KNeighborsClassifier__Group_7__0 )? )
            // InternalPerfectML.g:5812:2: ( rule__KNeighborsClassifier__Group_7__0 )?
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getGroup_7()); 
            // InternalPerfectML.g:5813:2: ( rule__KNeighborsClassifier__Group_7__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==102) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalPerfectML.g:5813:3: rule__KNeighborsClassifier__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KNeighborsClassifier__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__7__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group__8"
    // InternalPerfectML.g:5821:1: rule__KNeighborsClassifier__Group__8 : rule__KNeighborsClassifier__Group__8__Impl rule__KNeighborsClassifier__Group__9 ;
    public final void rule__KNeighborsClassifier__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5825:1: ( rule__KNeighborsClassifier__Group__8__Impl rule__KNeighborsClassifier__Group__9 )
            // InternalPerfectML.g:5826:2: rule__KNeighborsClassifier__Group__8__Impl rule__KNeighborsClassifier__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__KNeighborsClassifier__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__8"


    // $ANTLR start "rule__KNeighborsClassifier__Group__8__Impl"
    // InternalPerfectML.g:5833:1: rule__KNeighborsClassifier__Group__8__Impl : ( ( rule__KNeighborsClassifier__Group_8__0 )? ) ;
    public final void rule__KNeighborsClassifier__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5837:1: ( ( ( rule__KNeighborsClassifier__Group_8__0 )? ) )
            // InternalPerfectML.g:5838:1: ( ( rule__KNeighborsClassifier__Group_8__0 )? )
            {
            // InternalPerfectML.g:5838:1: ( ( rule__KNeighborsClassifier__Group_8__0 )? )
            // InternalPerfectML.g:5839:2: ( rule__KNeighborsClassifier__Group_8__0 )?
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getGroup_8()); 
            // InternalPerfectML.g:5840:2: ( rule__KNeighborsClassifier__Group_8__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==103) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalPerfectML.g:5840:3: rule__KNeighborsClassifier__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KNeighborsClassifier__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__8__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group__9"
    // InternalPerfectML.g:5848:1: rule__KNeighborsClassifier__Group__9 : rule__KNeighborsClassifier__Group__9__Impl ;
    public final void rule__KNeighborsClassifier__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5852:1: ( rule__KNeighborsClassifier__Group__9__Impl )
            // InternalPerfectML.g:5853:2: rule__KNeighborsClassifier__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__9"


    // $ANTLR start "rule__KNeighborsClassifier__Group__9__Impl"
    // InternalPerfectML.g:5859:1: rule__KNeighborsClassifier__Group__9__Impl : ( ( rule__KNeighborsClassifier__Group_9__0 )? ) ;
    public final void rule__KNeighborsClassifier__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5863:1: ( ( ( rule__KNeighborsClassifier__Group_9__0 )? ) )
            // InternalPerfectML.g:5864:1: ( ( rule__KNeighborsClassifier__Group_9__0 )? )
            {
            // InternalPerfectML.g:5864:1: ( ( rule__KNeighborsClassifier__Group_9__0 )? )
            // InternalPerfectML.g:5865:2: ( rule__KNeighborsClassifier__Group_9__0 )?
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getGroup_9()); 
            // InternalPerfectML.g:5866:2: ( rule__KNeighborsClassifier__Group_9__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==104) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalPerfectML.g:5866:3: rule__KNeighborsClassifier__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KNeighborsClassifier__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group__9__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_3__0"
    // InternalPerfectML.g:5875:1: rule__KNeighborsClassifier__Group_3__0 : rule__KNeighborsClassifier__Group_3__0__Impl rule__KNeighborsClassifier__Group_3__1 ;
    public final void rule__KNeighborsClassifier__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5879:1: ( rule__KNeighborsClassifier__Group_3__0__Impl rule__KNeighborsClassifier__Group_3__1 )
            // InternalPerfectML.g:5880:2: rule__KNeighborsClassifier__Group_3__0__Impl rule__KNeighborsClassifier__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__KNeighborsClassifier__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_3__0"


    // $ANTLR start "rule__KNeighborsClassifier__Group_3__0__Impl"
    // InternalPerfectML.g:5887:1: rule__KNeighborsClassifier__Group_3__0__Impl : ( ( rule__KNeighborsClassifier__N_neighbors_defAssignment_3_0 ) ) ;
    public final void rule__KNeighborsClassifier__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5891:1: ( ( ( rule__KNeighborsClassifier__N_neighbors_defAssignment_3_0 ) ) )
            // InternalPerfectML.g:5892:1: ( ( rule__KNeighborsClassifier__N_neighbors_defAssignment_3_0 ) )
            {
            // InternalPerfectML.g:5892:1: ( ( rule__KNeighborsClassifier__N_neighbors_defAssignment_3_0 ) )
            // InternalPerfectML.g:5893:2: ( rule__KNeighborsClassifier__N_neighbors_defAssignment_3_0 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getN_neighbors_defAssignment_3_0()); 
            // InternalPerfectML.g:5894:2: ( rule__KNeighborsClassifier__N_neighbors_defAssignment_3_0 )
            // InternalPerfectML.g:5894:3: rule__KNeighborsClassifier__N_neighbors_defAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__N_neighbors_defAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getN_neighbors_defAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_3__0__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_3__1"
    // InternalPerfectML.g:5902:1: rule__KNeighborsClassifier__Group_3__1 : rule__KNeighborsClassifier__Group_3__1__Impl rule__KNeighborsClassifier__Group_3__2 ;
    public final void rule__KNeighborsClassifier__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5906:1: ( rule__KNeighborsClassifier__Group_3__1__Impl rule__KNeighborsClassifier__Group_3__2 )
            // InternalPerfectML.g:5907:2: rule__KNeighborsClassifier__Group_3__1__Impl rule__KNeighborsClassifier__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__KNeighborsClassifier__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_3__1"


    // $ANTLR start "rule__KNeighborsClassifier__Group_3__1__Impl"
    // InternalPerfectML.g:5914:1: rule__KNeighborsClassifier__Group_3__1__Impl : ( '=' ) ;
    public final void rule__KNeighborsClassifier__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5918:1: ( ( '=' ) )
            // InternalPerfectML.g:5919:1: ( '=' )
            {
            // InternalPerfectML.g:5919:1: ( '=' )
            // InternalPerfectML.g:5920:2: '='
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_3_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_3__1__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_3__2"
    // InternalPerfectML.g:5929:1: rule__KNeighborsClassifier__Group_3__2 : rule__KNeighborsClassifier__Group_3__2__Impl ;
    public final void rule__KNeighborsClassifier__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5933:1: ( rule__KNeighborsClassifier__Group_3__2__Impl )
            // InternalPerfectML.g:5934:2: rule__KNeighborsClassifier__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_3__2"


    // $ANTLR start "rule__KNeighborsClassifier__Group_3__2__Impl"
    // InternalPerfectML.g:5940:1: rule__KNeighborsClassifier__Group_3__2__Impl : ( ( rule__KNeighborsClassifier__N_neighborsAssignment_3_2 ) ) ;
    public final void rule__KNeighborsClassifier__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5944:1: ( ( ( rule__KNeighborsClassifier__N_neighborsAssignment_3_2 ) ) )
            // InternalPerfectML.g:5945:1: ( ( rule__KNeighborsClassifier__N_neighborsAssignment_3_2 ) )
            {
            // InternalPerfectML.g:5945:1: ( ( rule__KNeighborsClassifier__N_neighborsAssignment_3_2 ) )
            // InternalPerfectML.g:5946:2: ( rule__KNeighborsClassifier__N_neighborsAssignment_3_2 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getN_neighborsAssignment_3_2()); 
            // InternalPerfectML.g:5947:2: ( rule__KNeighborsClassifier__N_neighborsAssignment_3_2 )
            // InternalPerfectML.g:5947:3: rule__KNeighborsClassifier__N_neighborsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__N_neighborsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getN_neighborsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_3__2__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_4__0"
    // InternalPerfectML.g:5956:1: rule__KNeighborsClassifier__Group_4__0 : rule__KNeighborsClassifier__Group_4__0__Impl rule__KNeighborsClassifier__Group_4__1 ;
    public final void rule__KNeighborsClassifier__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5960:1: ( rule__KNeighborsClassifier__Group_4__0__Impl rule__KNeighborsClassifier__Group_4__1 )
            // InternalPerfectML.g:5961:2: rule__KNeighborsClassifier__Group_4__0__Impl rule__KNeighborsClassifier__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__KNeighborsClassifier__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_4__0"


    // $ANTLR start "rule__KNeighborsClassifier__Group_4__0__Impl"
    // InternalPerfectML.g:5968:1: rule__KNeighborsClassifier__Group_4__0__Impl : ( ( rule__KNeighborsClassifier__Weights_defAssignment_4_0 ) ) ;
    public final void rule__KNeighborsClassifier__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5972:1: ( ( ( rule__KNeighborsClassifier__Weights_defAssignment_4_0 ) ) )
            // InternalPerfectML.g:5973:1: ( ( rule__KNeighborsClassifier__Weights_defAssignment_4_0 ) )
            {
            // InternalPerfectML.g:5973:1: ( ( rule__KNeighborsClassifier__Weights_defAssignment_4_0 ) )
            // InternalPerfectML.g:5974:2: ( rule__KNeighborsClassifier__Weights_defAssignment_4_0 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getWeights_defAssignment_4_0()); 
            // InternalPerfectML.g:5975:2: ( rule__KNeighborsClassifier__Weights_defAssignment_4_0 )
            // InternalPerfectML.g:5975:3: rule__KNeighborsClassifier__Weights_defAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Weights_defAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getWeights_defAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_4__0__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_4__1"
    // InternalPerfectML.g:5983:1: rule__KNeighborsClassifier__Group_4__1 : rule__KNeighborsClassifier__Group_4__1__Impl rule__KNeighborsClassifier__Group_4__2 ;
    public final void rule__KNeighborsClassifier__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5987:1: ( rule__KNeighborsClassifier__Group_4__1__Impl rule__KNeighborsClassifier__Group_4__2 )
            // InternalPerfectML.g:5988:2: rule__KNeighborsClassifier__Group_4__1__Impl rule__KNeighborsClassifier__Group_4__2
            {
            pushFollow(FOLLOW_31);
            rule__KNeighborsClassifier__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_4__1"


    // $ANTLR start "rule__KNeighborsClassifier__Group_4__1__Impl"
    // InternalPerfectML.g:5995:1: rule__KNeighborsClassifier__Group_4__1__Impl : ( '=' ) ;
    public final void rule__KNeighborsClassifier__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:5999:1: ( ( '=' ) )
            // InternalPerfectML.g:6000:1: ( '=' )
            {
            // InternalPerfectML.g:6000:1: ( '=' )
            // InternalPerfectML.g:6001:2: '='
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_4_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_4__1__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_4__2"
    // InternalPerfectML.g:6010:1: rule__KNeighborsClassifier__Group_4__2 : rule__KNeighborsClassifier__Group_4__2__Impl ;
    public final void rule__KNeighborsClassifier__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6014:1: ( rule__KNeighborsClassifier__Group_4__2__Impl )
            // InternalPerfectML.g:6015:2: rule__KNeighborsClassifier__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_4__2"


    // $ANTLR start "rule__KNeighborsClassifier__Group_4__2__Impl"
    // InternalPerfectML.g:6021:1: rule__KNeighborsClassifier__Group_4__2__Impl : ( ( rule__KNeighborsClassifier__WeightsAssignment_4_2 ) ) ;
    public final void rule__KNeighborsClassifier__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6025:1: ( ( ( rule__KNeighborsClassifier__WeightsAssignment_4_2 ) ) )
            // InternalPerfectML.g:6026:1: ( ( rule__KNeighborsClassifier__WeightsAssignment_4_2 ) )
            {
            // InternalPerfectML.g:6026:1: ( ( rule__KNeighborsClassifier__WeightsAssignment_4_2 ) )
            // InternalPerfectML.g:6027:2: ( rule__KNeighborsClassifier__WeightsAssignment_4_2 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getWeightsAssignment_4_2()); 
            // InternalPerfectML.g:6028:2: ( rule__KNeighborsClassifier__WeightsAssignment_4_2 )
            // InternalPerfectML.g:6028:3: rule__KNeighborsClassifier__WeightsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__WeightsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getWeightsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_4__2__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_5__0"
    // InternalPerfectML.g:6037:1: rule__KNeighborsClassifier__Group_5__0 : rule__KNeighborsClassifier__Group_5__0__Impl rule__KNeighborsClassifier__Group_5__1 ;
    public final void rule__KNeighborsClassifier__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6041:1: ( rule__KNeighborsClassifier__Group_5__0__Impl rule__KNeighborsClassifier__Group_5__1 )
            // InternalPerfectML.g:6042:2: rule__KNeighborsClassifier__Group_5__0__Impl rule__KNeighborsClassifier__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__KNeighborsClassifier__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_5__0"


    // $ANTLR start "rule__KNeighborsClassifier__Group_5__0__Impl"
    // InternalPerfectML.g:6049:1: rule__KNeighborsClassifier__Group_5__0__Impl : ( ( rule__KNeighborsClassifier__Algorithm_defAssignment_5_0 ) ) ;
    public final void rule__KNeighborsClassifier__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6053:1: ( ( ( rule__KNeighborsClassifier__Algorithm_defAssignment_5_0 ) ) )
            // InternalPerfectML.g:6054:1: ( ( rule__KNeighborsClassifier__Algorithm_defAssignment_5_0 ) )
            {
            // InternalPerfectML.g:6054:1: ( ( rule__KNeighborsClassifier__Algorithm_defAssignment_5_0 ) )
            // InternalPerfectML.g:6055:2: ( rule__KNeighborsClassifier__Algorithm_defAssignment_5_0 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getAlgorithm_defAssignment_5_0()); 
            // InternalPerfectML.g:6056:2: ( rule__KNeighborsClassifier__Algorithm_defAssignment_5_0 )
            // InternalPerfectML.g:6056:3: rule__KNeighborsClassifier__Algorithm_defAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Algorithm_defAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getAlgorithm_defAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_5__0__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_5__1"
    // InternalPerfectML.g:6064:1: rule__KNeighborsClassifier__Group_5__1 : rule__KNeighborsClassifier__Group_5__1__Impl rule__KNeighborsClassifier__Group_5__2 ;
    public final void rule__KNeighborsClassifier__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6068:1: ( rule__KNeighborsClassifier__Group_5__1__Impl rule__KNeighborsClassifier__Group_5__2 )
            // InternalPerfectML.g:6069:2: rule__KNeighborsClassifier__Group_5__1__Impl rule__KNeighborsClassifier__Group_5__2
            {
            pushFollow(FOLLOW_32);
            rule__KNeighborsClassifier__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_5__1"


    // $ANTLR start "rule__KNeighborsClassifier__Group_5__1__Impl"
    // InternalPerfectML.g:6076:1: rule__KNeighborsClassifier__Group_5__1__Impl : ( '=' ) ;
    public final void rule__KNeighborsClassifier__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6080:1: ( ( '=' ) )
            // InternalPerfectML.g:6081:1: ( '=' )
            {
            // InternalPerfectML.g:6081:1: ( '=' )
            // InternalPerfectML.g:6082:2: '='
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_5_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_5__1__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_5__2"
    // InternalPerfectML.g:6091:1: rule__KNeighborsClassifier__Group_5__2 : rule__KNeighborsClassifier__Group_5__2__Impl ;
    public final void rule__KNeighborsClassifier__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6095:1: ( rule__KNeighborsClassifier__Group_5__2__Impl )
            // InternalPerfectML.g:6096:2: rule__KNeighborsClassifier__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_5__2"


    // $ANTLR start "rule__KNeighborsClassifier__Group_5__2__Impl"
    // InternalPerfectML.g:6102:1: rule__KNeighborsClassifier__Group_5__2__Impl : ( ( rule__KNeighborsClassifier__AlgorithmAssignment_5_2 ) ) ;
    public final void rule__KNeighborsClassifier__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6106:1: ( ( ( rule__KNeighborsClassifier__AlgorithmAssignment_5_2 ) ) )
            // InternalPerfectML.g:6107:1: ( ( rule__KNeighborsClassifier__AlgorithmAssignment_5_2 ) )
            {
            // InternalPerfectML.g:6107:1: ( ( rule__KNeighborsClassifier__AlgorithmAssignment_5_2 ) )
            // InternalPerfectML.g:6108:2: ( rule__KNeighborsClassifier__AlgorithmAssignment_5_2 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getAlgorithmAssignment_5_2()); 
            // InternalPerfectML.g:6109:2: ( rule__KNeighborsClassifier__AlgorithmAssignment_5_2 )
            // InternalPerfectML.g:6109:3: rule__KNeighborsClassifier__AlgorithmAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__AlgorithmAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getAlgorithmAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_5__2__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_6__0"
    // InternalPerfectML.g:6118:1: rule__KNeighborsClassifier__Group_6__0 : rule__KNeighborsClassifier__Group_6__0__Impl rule__KNeighborsClassifier__Group_6__1 ;
    public final void rule__KNeighborsClassifier__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6122:1: ( rule__KNeighborsClassifier__Group_6__0__Impl rule__KNeighborsClassifier__Group_6__1 )
            // InternalPerfectML.g:6123:2: rule__KNeighborsClassifier__Group_6__0__Impl rule__KNeighborsClassifier__Group_6__1
            {
            pushFollow(FOLLOW_16);
            rule__KNeighborsClassifier__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_6__0"


    // $ANTLR start "rule__KNeighborsClassifier__Group_6__0__Impl"
    // InternalPerfectML.g:6130:1: rule__KNeighborsClassifier__Group_6__0__Impl : ( ( rule__KNeighborsClassifier__Leaf_size_defAssignment_6_0 ) ) ;
    public final void rule__KNeighborsClassifier__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6134:1: ( ( ( rule__KNeighborsClassifier__Leaf_size_defAssignment_6_0 ) ) )
            // InternalPerfectML.g:6135:1: ( ( rule__KNeighborsClassifier__Leaf_size_defAssignment_6_0 ) )
            {
            // InternalPerfectML.g:6135:1: ( ( rule__KNeighborsClassifier__Leaf_size_defAssignment_6_0 ) )
            // InternalPerfectML.g:6136:2: ( rule__KNeighborsClassifier__Leaf_size_defAssignment_6_0 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getLeaf_size_defAssignment_6_0()); 
            // InternalPerfectML.g:6137:2: ( rule__KNeighborsClassifier__Leaf_size_defAssignment_6_0 )
            // InternalPerfectML.g:6137:3: rule__KNeighborsClassifier__Leaf_size_defAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Leaf_size_defAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getLeaf_size_defAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_6__0__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_6__1"
    // InternalPerfectML.g:6145:1: rule__KNeighborsClassifier__Group_6__1 : rule__KNeighborsClassifier__Group_6__1__Impl rule__KNeighborsClassifier__Group_6__2 ;
    public final void rule__KNeighborsClassifier__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6149:1: ( rule__KNeighborsClassifier__Group_6__1__Impl rule__KNeighborsClassifier__Group_6__2 )
            // InternalPerfectML.g:6150:2: rule__KNeighborsClassifier__Group_6__1__Impl rule__KNeighborsClassifier__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__KNeighborsClassifier__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_6__1"


    // $ANTLR start "rule__KNeighborsClassifier__Group_6__1__Impl"
    // InternalPerfectML.g:6157:1: rule__KNeighborsClassifier__Group_6__1__Impl : ( '=' ) ;
    public final void rule__KNeighborsClassifier__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6161:1: ( ( '=' ) )
            // InternalPerfectML.g:6162:1: ( '=' )
            {
            // InternalPerfectML.g:6162:1: ( '=' )
            // InternalPerfectML.g:6163:2: '='
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_6_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_6__1__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_6__2"
    // InternalPerfectML.g:6172:1: rule__KNeighborsClassifier__Group_6__2 : rule__KNeighborsClassifier__Group_6__2__Impl ;
    public final void rule__KNeighborsClassifier__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6176:1: ( rule__KNeighborsClassifier__Group_6__2__Impl )
            // InternalPerfectML.g:6177:2: rule__KNeighborsClassifier__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_6__2"


    // $ANTLR start "rule__KNeighborsClassifier__Group_6__2__Impl"
    // InternalPerfectML.g:6183:1: rule__KNeighborsClassifier__Group_6__2__Impl : ( ( rule__KNeighborsClassifier__Leaf_sizeAssignment_6_2 ) ) ;
    public final void rule__KNeighborsClassifier__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6187:1: ( ( ( rule__KNeighborsClassifier__Leaf_sizeAssignment_6_2 ) ) )
            // InternalPerfectML.g:6188:1: ( ( rule__KNeighborsClassifier__Leaf_sizeAssignment_6_2 ) )
            {
            // InternalPerfectML.g:6188:1: ( ( rule__KNeighborsClassifier__Leaf_sizeAssignment_6_2 ) )
            // InternalPerfectML.g:6189:2: ( rule__KNeighborsClassifier__Leaf_sizeAssignment_6_2 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getLeaf_sizeAssignment_6_2()); 
            // InternalPerfectML.g:6190:2: ( rule__KNeighborsClassifier__Leaf_sizeAssignment_6_2 )
            // InternalPerfectML.g:6190:3: rule__KNeighborsClassifier__Leaf_sizeAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Leaf_sizeAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getLeaf_sizeAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_6__2__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_7__0"
    // InternalPerfectML.g:6199:1: rule__KNeighborsClassifier__Group_7__0 : rule__KNeighborsClassifier__Group_7__0__Impl rule__KNeighborsClassifier__Group_7__1 ;
    public final void rule__KNeighborsClassifier__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6203:1: ( rule__KNeighborsClassifier__Group_7__0__Impl rule__KNeighborsClassifier__Group_7__1 )
            // InternalPerfectML.g:6204:2: rule__KNeighborsClassifier__Group_7__0__Impl rule__KNeighborsClassifier__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__KNeighborsClassifier__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_7__0"


    // $ANTLR start "rule__KNeighborsClassifier__Group_7__0__Impl"
    // InternalPerfectML.g:6211:1: rule__KNeighborsClassifier__Group_7__0__Impl : ( ( rule__KNeighborsClassifier__P_defAssignment_7_0 ) ) ;
    public final void rule__KNeighborsClassifier__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6215:1: ( ( ( rule__KNeighborsClassifier__P_defAssignment_7_0 ) ) )
            // InternalPerfectML.g:6216:1: ( ( rule__KNeighborsClassifier__P_defAssignment_7_0 ) )
            {
            // InternalPerfectML.g:6216:1: ( ( rule__KNeighborsClassifier__P_defAssignment_7_0 ) )
            // InternalPerfectML.g:6217:2: ( rule__KNeighborsClassifier__P_defAssignment_7_0 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getP_defAssignment_7_0()); 
            // InternalPerfectML.g:6218:2: ( rule__KNeighborsClassifier__P_defAssignment_7_0 )
            // InternalPerfectML.g:6218:3: rule__KNeighborsClassifier__P_defAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__P_defAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getP_defAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_7__0__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_7__1"
    // InternalPerfectML.g:6226:1: rule__KNeighborsClassifier__Group_7__1 : rule__KNeighborsClassifier__Group_7__1__Impl rule__KNeighborsClassifier__Group_7__2 ;
    public final void rule__KNeighborsClassifier__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6230:1: ( rule__KNeighborsClassifier__Group_7__1__Impl rule__KNeighborsClassifier__Group_7__2 )
            // InternalPerfectML.g:6231:2: rule__KNeighborsClassifier__Group_7__1__Impl rule__KNeighborsClassifier__Group_7__2
            {
            pushFollow(FOLLOW_18);
            rule__KNeighborsClassifier__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_7__1"


    // $ANTLR start "rule__KNeighborsClassifier__Group_7__1__Impl"
    // InternalPerfectML.g:6238:1: rule__KNeighborsClassifier__Group_7__1__Impl : ( '=' ) ;
    public final void rule__KNeighborsClassifier__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6242:1: ( ( '=' ) )
            // InternalPerfectML.g:6243:1: ( '=' )
            {
            // InternalPerfectML.g:6243:1: ( '=' )
            // InternalPerfectML.g:6244:2: '='
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_7_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_7__1__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_7__2"
    // InternalPerfectML.g:6253:1: rule__KNeighborsClassifier__Group_7__2 : rule__KNeighborsClassifier__Group_7__2__Impl ;
    public final void rule__KNeighborsClassifier__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6257:1: ( rule__KNeighborsClassifier__Group_7__2__Impl )
            // InternalPerfectML.g:6258:2: rule__KNeighborsClassifier__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_7__2"


    // $ANTLR start "rule__KNeighborsClassifier__Group_7__2__Impl"
    // InternalPerfectML.g:6264:1: rule__KNeighborsClassifier__Group_7__2__Impl : ( ( rule__KNeighborsClassifier__PAssignment_7_2 ) ) ;
    public final void rule__KNeighborsClassifier__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6268:1: ( ( ( rule__KNeighborsClassifier__PAssignment_7_2 ) ) )
            // InternalPerfectML.g:6269:1: ( ( rule__KNeighborsClassifier__PAssignment_7_2 ) )
            {
            // InternalPerfectML.g:6269:1: ( ( rule__KNeighborsClassifier__PAssignment_7_2 ) )
            // InternalPerfectML.g:6270:2: ( rule__KNeighborsClassifier__PAssignment_7_2 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getPAssignment_7_2()); 
            // InternalPerfectML.g:6271:2: ( rule__KNeighborsClassifier__PAssignment_7_2 )
            // InternalPerfectML.g:6271:3: rule__KNeighborsClassifier__PAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__PAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getPAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_7__2__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_8__0"
    // InternalPerfectML.g:6280:1: rule__KNeighborsClassifier__Group_8__0 : rule__KNeighborsClassifier__Group_8__0__Impl rule__KNeighborsClassifier__Group_8__1 ;
    public final void rule__KNeighborsClassifier__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6284:1: ( rule__KNeighborsClassifier__Group_8__0__Impl rule__KNeighborsClassifier__Group_8__1 )
            // InternalPerfectML.g:6285:2: rule__KNeighborsClassifier__Group_8__0__Impl rule__KNeighborsClassifier__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__KNeighborsClassifier__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_8__0"


    // $ANTLR start "rule__KNeighborsClassifier__Group_8__0__Impl"
    // InternalPerfectML.g:6292:1: rule__KNeighborsClassifier__Group_8__0__Impl : ( ( rule__KNeighborsClassifier__Metric_defAssignment_8_0 ) ) ;
    public final void rule__KNeighborsClassifier__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6296:1: ( ( ( rule__KNeighborsClassifier__Metric_defAssignment_8_0 ) ) )
            // InternalPerfectML.g:6297:1: ( ( rule__KNeighborsClassifier__Metric_defAssignment_8_0 ) )
            {
            // InternalPerfectML.g:6297:1: ( ( rule__KNeighborsClassifier__Metric_defAssignment_8_0 ) )
            // InternalPerfectML.g:6298:2: ( rule__KNeighborsClassifier__Metric_defAssignment_8_0 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getMetric_defAssignment_8_0()); 
            // InternalPerfectML.g:6299:2: ( rule__KNeighborsClassifier__Metric_defAssignment_8_0 )
            // InternalPerfectML.g:6299:3: rule__KNeighborsClassifier__Metric_defAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Metric_defAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getMetric_defAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_8__0__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_8__1"
    // InternalPerfectML.g:6307:1: rule__KNeighborsClassifier__Group_8__1 : rule__KNeighborsClassifier__Group_8__1__Impl rule__KNeighborsClassifier__Group_8__2 ;
    public final void rule__KNeighborsClassifier__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6311:1: ( rule__KNeighborsClassifier__Group_8__1__Impl rule__KNeighborsClassifier__Group_8__2 )
            // InternalPerfectML.g:6312:2: rule__KNeighborsClassifier__Group_8__1__Impl rule__KNeighborsClassifier__Group_8__2
            {
            pushFollow(FOLLOW_33);
            rule__KNeighborsClassifier__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_8__1"


    // $ANTLR start "rule__KNeighborsClassifier__Group_8__1__Impl"
    // InternalPerfectML.g:6319:1: rule__KNeighborsClassifier__Group_8__1__Impl : ( '=' ) ;
    public final void rule__KNeighborsClassifier__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6323:1: ( ( '=' ) )
            // InternalPerfectML.g:6324:1: ( '=' )
            {
            // InternalPerfectML.g:6324:1: ( '=' )
            // InternalPerfectML.g:6325:2: '='
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_8_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_8__1__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_8__2"
    // InternalPerfectML.g:6334:1: rule__KNeighborsClassifier__Group_8__2 : rule__KNeighborsClassifier__Group_8__2__Impl ;
    public final void rule__KNeighborsClassifier__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6338:1: ( rule__KNeighborsClassifier__Group_8__2__Impl )
            // InternalPerfectML.g:6339:2: rule__KNeighborsClassifier__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_8__2"


    // $ANTLR start "rule__KNeighborsClassifier__Group_8__2__Impl"
    // InternalPerfectML.g:6345:1: rule__KNeighborsClassifier__Group_8__2__Impl : ( ( rule__KNeighborsClassifier__MetricAssignment_8_2 ) ) ;
    public final void rule__KNeighborsClassifier__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6349:1: ( ( ( rule__KNeighborsClassifier__MetricAssignment_8_2 ) ) )
            // InternalPerfectML.g:6350:1: ( ( rule__KNeighborsClassifier__MetricAssignment_8_2 ) )
            {
            // InternalPerfectML.g:6350:1: ( ( rule__KNeighborsClassifier__MetricAssignment_8_2 ) )
            // InternalPerfectML.g:6351:2: ( rule__KNeighborsClassifier__MetricAssignment_8_2 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getMetricAssignment_8_2()); 
            // InternalPerfectML.g:6352:2: ( rule__KNeighborsClassifier__MetricAssignment_8_2 )
            // InternalPerfectML.g:6352:3: rule__KNeighborsClassifier__MetricAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__MetricAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getMetricAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_8__2__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_9__0"
    // InternalPerfectML.g:6361:1: rule__KNeighborsClassifier__Group_9__0 : rule__KNeighborsClassifier__Group_9__0__Impl rule__KNeighborsClassifier__Group_9__1 ;
    public final void rule__KNeighborsClassifier__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6365:1: ( rule__KNeighborsClassifier__Group_9__0__Impl rule__KNeighborsClassifier__Group_9__1 )
            // InternalPerfectML.g:6366:2: rule__KNeighborsClassifier__Group_9__0__Impl rule__KNeighborsClassifier__Group_9__1
            {
            pushFollow(FOLLOW_16);
            rule__KNeighborsClassifier__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_9__0"


    // $ANTLR start "rule__KNeighborsClassifier__Group_9__0__Impl"
    // InternalPerfectML.g:6373:1: rule__KNeighborsClassifier__Group_9__0__Impl : ( ( rule__KNeighborsClassifier__N_jobs_defAssignment_9_0 ) ) ;
    public final void rule__KNeighborsClassifier__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6377:1: ( ( ( rule__KNeighborsClassifier__N_jobs_defAssignment_9_0 ) ) )
            // InternalPerfectML.g:6378:1: ( ( rule__KNeighborsClassifier__N_jobs_defAssignment_9_0 ) )
            {
            // InternalPerfectML.g:6378:1: ( ( rule__KNeighborsClassifier__N_jobs_defAssignment_9_0 ) )
            // InternalPerfectML.g:6379:2: ( rule__KNeighborsClassifier__N_jobs_defAssignment_9_0 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getN_jobs_defAssignment_9_0()); 
            // InternalPerfectML.g:6380:2: ( rule__KNeighborsClassifier__N_jobs_defAssignment_9_0 )
            // InternalPerfectML.g:6380:3: rule__KNeighborsClassifier__N_jobs_defAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__N_jobs_defAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getN_jobs_defAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_9__0__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_9__1"
    // InternalPerfectML.g:6388:1: rule__KNeighborsClassifier__Group_9__1 : rule__KNeighborsClassifier__Group_9__1__Impl rule__KNeighborsClassifier__Group_9__2 ;
    public final void rule__KNeighborsClassifier__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6392:1: ( rule__KNeighborsClassifier__Group_9__1__Impl rule__KNeighborsClassifier__Group_9__2 )
            // InternalPerfectML.g:6393:2: rule__KNeighborsClassifier__Group_9__1__Impl rule__KNeighborsClassifier__Group_9__2
            {
            pushFollow(FOLLOW_18);
            rule__KNeighborsClassifier__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_9__1"


    // $ANTLR start "rule__KNeighborsClassifier__Group_9__1__Impl"
    // InternalPerfectML.g:6400:1: rule__KNeighborsClassifier__Group_9__1__Impl : ( '=' ) ;
    public final void rule__KNeighborsClassifier__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6404:1: ( ( '=' ) )
            // InternalPerfectML.g:6405:1: ( '=' )
            {
            // InternalPerfectML.g:6405:1: ( '=' )
            // InternalPerfectML.g:6406:2: '='
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_9_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getEqualsSignKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_9__1__Impl"


    // $ANTLR start "rule__KNeighborsClassifier__Group_9__2"
    // InternalPerfectML.g:6415:1: rule__KNeighborsClassifier__Group_9__2 : rule__KNeighborsClassifier__Group_9__2__Impl ;
    public final void rule__KNeighborsClassifier__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6419:1: ( rule__KNeighborsClassifier__Group_9__2__Impl )
            // InternalPerfectML.g:6420:2: rule__KNeighborsClassifier__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_9__2"


    // $ANTLR start "rule__KNeighborsClassifier__Group_9__2__Impl"
    // InternalPerfectML.g:6426:1: rule__KNeighborsClassifier__Group_9__2__Impl : ( ( rule__KNeighborsClassifier__N_jobsAssignment_9_2 ) ) ;
    public final void rule__KNeighborsClassifier__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6430:1: ( ( ( rule__KNeighborsClassifier__N_jobsAssignment_9_2 ) ) )
            // InternalPerfectML.g:6431:1: ( ( rule__KNeighborsClassifier__N_jobsAssignment_9_2 ) )
            {
            // InternalPerfectML.g:6431:1: ( ( rule__KNeighborsClassifier__N_jobsAssignment_9_2 ) )
            // InternalPerfectML.g:6432:2: ( rule__KNeighborsClassifier__N_jobsAssignment_9_2 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getN_jobsAssignment_9_2()); 
            // InternalPerfectML.g:6433:2: ( rule__KNeighborsClassifier__N_jobsAssignment_9_2 )
            // InternalPerfectML.g:6433:3: rule__KNeighborsClassifier__N_jobsAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__N_jobsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getN_jobsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Group_9__2__Impl"


    // $ANTLR start "rule__TrainingAmount__Group__0"
    // InternalPerfectML.g:6442:1: rule__TrainingAmount__Group__0 : rule__TrainingAmount__Group__0__Impl rule__TrainingAmount__Group__1 ;
    public final void rule__TrainingAmount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6446:1: ( rule__TrainingAmount__Group__0__Impl rule__TrainingAmount__Group__1 )
            // InternalPerfectML.g:6447:2: rule__TrainingAmount__Group__0__Impl rule__TrainingAmount__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__TrainingAmount__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingAmount__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__Group__0"


    // $ANTLR start "rule__TrainingAmount__Group__0__Impl"
    // InternalPerfectML.g:6454:1: rule__TrainingAmount__Group__0__Impl : ( 'with' ) ;
    public final void rule__TrainingAmount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6458:1: ( ( 'with' ) )
            // InternalPerfectML.g:6459:1: ( 'with' )
            {
            // InternalPerfectML.g:6459:1: ( 'with' )
            // InternalPerfectML.g:6460:2: 'with'
            {
             before(grammarAccess.getTrainingAmountAccess().getWithKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTrainingAmountAccess().getWithKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__Group__0__Impl"


    // $ANTLR start "rule__TrainingAmount__Group__1"
    // InternalPerfectML.g:6469:1: rule__TrainingAmount__Group__1 : rule__TrainingAmount__Group__1__Impl rule__TrainingAmount__Group__2 ;
    public final void rule__TrainingAmount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6473:1: ( rule__TrainingAmount__Group__1__Impl rule__TrainingAmount__Group__2 )
            // InternalPerfectML.g:6474:2: rule__TrainingAmount__Group__1__Impl rule__TrainingAmount__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__TrainingAmount__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingAmount__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__Group__1"


    // $ANTLR start "rule__TrainingAmount__Group__1__Impl"
    // InternalPerfectML.g:6481:1: rule__TrainingAmount__Group__1__Impl : ( ( rule__TrainingAmount__ValueAssignment_1 ) ) ;
    public final void rule__TrainingAmount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6485:1: ( ( ( rule__TrainingAmount__ValueAssignment_1 ) ) )
            // InternalPerfectML.g:6486:1: ( ( rule__TrainingAmount__ValueAssignment_1 ) )
            {
            // InternalPerfectML.g:6486:1: ( ( rule__TrainingAmount__ValueAssignment_1 ) )
            // InternalPerfectML.g:6487:2: ( rule__TrainingAmount__ValueAssignment_1 )
            {
             before(grammarAccess.getTrainingAmountAccess().getValueAssignment_1()); 
            // InternalPerfectML.g:6488:2: ( rule__TrainingAmount__ValueAssignment_1 )
            // InternalPerfectML.g:6488:3: rule__TrainingAmount__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TrainingAmount__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAmountAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__Group__1__Impl"


    // $ANTLR start "rule__TrainingAmount__Group__2"
    // InternalPerfectML.g:6496:1: rule__TrainingAmount__Group__2 : rule__TrainingAmount__Group__2__Impl rule__TrainingAmount__Group__3 ;
    public final void rule__TrainingAmount__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6500:1: ( rule__TrainingAmount__Group__2__Impl rule__TrainingAmount__Group__3 )
            // InternalPerfectML.g:6501:2: rule__TrainingAmount__Group__2__Impl rule__TrainingAmount__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__TrainingAmount__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingAmount__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__Group__2"


    // $ANTLR start "rule__TrainingAmount__Group__2__Impl"
    // InternalPerfectML.g:6508:1: rule__TrainingAmount__Group__2__Impl : ( ( rule__TrainingAmount__Alternatives_2 ) ) ;
    public final void rule__TrainingAmount__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6512:1: ( ( ( rule__TrainingAmount__Alternatives_2 ) ) )
            // InternalPerfectML.g:6513:1: ( ( rule__TrainingAmount__Alternatives_2 ) )
            {
            // InternalPerfectML.g:6513:1: ( ( rule__TrainingAmount__Alternatives_2 ) )
            // InternalPerfectML.g:6514:2: ( rule__TrainingAmount__Alternatives_2 )
            {
             before(grammarAccess.getTrainingAmountAccess().getAlternatives_2()); 
            // InternalPerfectML.g:6515:2: ( rule__TrainingAmount__Alternatives_2 )
            // InternalPerfectML.g:6515:3: rule__TrainingAmount__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__TrainingAmount__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAmountAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__Group__2__Impl"


    // $ANTLR start "rule__TrainingAmount__Group__3"
    // InternalPerfectML.g:6523:1: rule__TrainingAmount__Group__3 : rule__TrainingAmount__Group__3__Impl ;
    public final void rule__TrainingAmount__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6527:1: ( rule__TrainingAmount__Group__3__Impl )
            // InternalPerfectML.g:6528:2: rule__TrainingAmount__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainingAmount__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__Group__3"


    // $ANTLR start "rule__TrainingAmount__Group__3__Impl"
    // InternalPerfectML.g:6534:1: rule__TrainingAmount__Group__3__Impl : ( 'training' ) ;
    public final void rule__TrainingAmount__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6538:1: ( ( 'training' ) )
            // InternalPerfectML.g:6539:1: ( 'training' )
            {
            // InternalPerfectML.g:6539:1: ( 'training' )
            // InternalPerfectML.g:6540:2: 'training'
            {
             before(grammarAccess.getTrainingAmountAccess().getTrainingKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTrainingAmountAccess().getTrainingKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__Group__3__Impl"


    // $ANTLR start "rule__TrainingAmount__Group_2_1__0"
    // InternalPerfectML.g:6550:1: rule__TrainingAmount__Group_2_1__0 : rule__TrainingAmount__Group_2_1__0__Impl rule__TrainingAmount__Group_2_1__1 ;
    public final void rule__TrainingAmount__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6554:1: ( rule__TrainingAmount__Group_2_1__0__Impl rule__TrainingAmount__Group_2_1__1 )
            // InternalPerfectML.g:6555:2: rule__TrainingAmount__Group_2_1__0__Impl rule__TrainingAmount__Group_2_1__1
            {
            pushFollow(FOLLOW_36);
            rule__TrainingAmount__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingAmount__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__Group_2_1__0"


    // $ANTLR start "rule__TrainingAmount__Group_2_1__0__Impl"
    // InternalPerfectML.g:6562:1: rule__TrainingAmount__Group_2_1__0__Impl : ( 'lines' ) ;
    public final void rule__TrainingAmount__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6566:1: ( ( 'lines' ) )
            // InternalPerfectML.g:6567:1: ( 'lines' )
            {
            // InternalPerfectML.g:6567:1: ( 'lines' )
            // InternalPerfectML.g:6568:2: 'lines'
            {
             before(grammarAccess.getTrainingAmountAccess().getLinesKeyword_2_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getTrainingAmountAccess().getLinesKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__Group_2_1__0__Impl"


    // $ANTLR start "rule__TrainingAmount__Group_2_1__1"
    // InternalPerfectML.g:6577:1: rule__TrainingAmount__Group_2_1__1 : rule__TrainingAmount__Group_2_1__1__Impl ;
    public final void rule__TrainingAmount__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6581:1: ( rule__TrainingAmount__Group_2_1__1__Impl )
            // InternalPerfectML.g:6582:2: rule__TrainingAmount__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainingAmount__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__Group_2_1__1"


    // $ANTLR start "rule__TrainingAmount__Group_2_1__1__Impl"
    // InternalPerfectML.g:6588:1: rule__TrainingAmount__Group_2_1__1__Impl : ( 'of' ) ;
    public final void rule__TrainingAmount__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6592:1: ( ( 'of' ) )
            // InternalPerfectML.g:6593:1: ( 'of' )
            {
            // InternalPerfectML.g:6593:1: ( 'of' )
            // InternalPerfectML.g:6594:2: 'of'
            {
             before(grammarAccess.getTrainingAmountAccess().getOfKeyword_2_1_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getTrainingAmountAccess().getOfKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__Group_2_1__1__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group__0"
    // InternalPerfectML.g:6604:1: rule__ColumnDeclarations__Group__0 : rule__ColumnDeclarations__Group__0__Impl rule__ColumnDeclarations__Group__1 ;
    public final void rule__ColumnDeclarations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6608:1: ( rule__ColumnDeclarations__Group__0__Impl rule__ColumnDeclarations__Group__1 )
            // InternalPerfectML.g:6609:2: rule__ColumnDeclarations__Group__0__Impl rule__ColumnDeclarations__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ColumnDeclarations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group__0"


    // $ANTLR start "rule__ColumnDeclarations__Group__0__Impl"
    // InternalPerfectML.g:6616:1: rule__ColumnDeclarations__Group__0__Impl : ( () ) ;
    public final void rule__ColumnDeclarations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6620:1: ( ( () ) )
            // InternalPerfectML.g:6621:1: ( () )
            {
            // InternalPerfectML.g:6621:1: ( () )
            // InternalPerfectML.g:6622:2: ()
            {
             before(grammarAccess.getColumnDeclarationsAccess().getColumnDeclarationsAction_0()); 
            // InternalPerfectML.g:6623:2: ()
            // InternalPerfectML.g:6623:3: 
            {
            }

             after(grammarAccess.getColumnDeclarationsAccess().getColumnDeclarationsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group__0__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group__1"
    // InternalPerfectML.g:6631:1: rule__ColumnDeclarations__Group__1 : rule__ColumnDeclarations__Group__1__Impl rule__ColumnDeclarations__Group__2 ;
    public final void rule__ColumnDeclarations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6635:1: ( rule__ColumnDeclarations__Group__1__Impl rule__ColumnDeclarations__Group__2 )
            // InternalPerfectML.g:6636:2: rule__ColumnDeclarations__Group__1__Impl rule__ColumnDeclarations__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__ColumnDeclarations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group__1"


    // $ANTLR start "rule__ColumnDeclarations__Group__1__Impl"
    // InternalPerfectML.g:6643:1: rule__ColumnDeclarations__Group__1__Impl : ( 'Use' ) ;
    public final void rule__ColumnDeclarations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6647:1: ( ( 'Use' ) )
            // InternalPerfectML.g:6648:1: ( 'Use' )
            {
            // InternalPerfectML.g:6648:1: ( 'Use' )
            // InternalPerfectML.g:6649:2: 'Use'
            {
             before(grammarAccess.getColumnDeclarationsAccess().getUseKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getColumnDeclarationsAccess().getUseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group__1__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group__2"
    // InternalPerfectML.g:6658:1: rule__ColumnDeclarations__Group__2 : rule__ColumnDeclarations__Group__2__Impl rule__ColumnDeclarations__Group__3 ;
    public final void rule__ColumnDeclarations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6662:1: ( rule__ColumnDeclarations__Group__2__Impl rule__ColumnDeclarations__Group__3 )
            // InternalPerfectML.g:6663:2: rule__ColumnDeclarations__Group__2__Impl rule__ColumnDeclarations__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ColumnDeclarations__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group__2"


    // $ANTLR start "rule__ColumnDeclarations__Group__2__Impl"
    // InternalPerfectML.g:6670:1: rule__ColumnDeclarations__Group__2__Impl : ( 'columns' ) ;
    public final void rule__ColumnDeclarations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6674:1: ( ( 'columns' ) )
            // InternalPerfectML.g:6675:1: ( 'columns' )
            {
            // InternalPerfectML.g:6675:1: ( 'columns' )
            // InternalPerfectML.g:6676:2: 'columns'
            {
             before(grammarAccess.getColumnDeclarationsAccess().getColumnsKeyword_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getColumnDeclarationsAccess().getColumnsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group__2__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group__3"
    // InternalPerfectML.g:6685:1: rule__ColumnDeclarations__Group__3 : rule__ColumnDeclarations__Group__3__Impl rule__ColumnDeclarations__Group__4 ;
    public final void rule__ColumnDeclarations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6689:1: ( rule__ColumnDeclarations__Group__3__Impl rule__ColumnDeclarations__Group__4 )
            // InternalPerfectML.g:6690:2: rule__ColumnDeclarations__Group__3__Impl rule__ColumnDeclarations__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__ColumnDeclarations__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group__3"


    // $ANTLR start "rule__ColumnDeclarations__Group__3__Impl"
    // InternalPerfectML.g:6697:1: rule__ColumnDeclarations__Group__3__Impl : ( ':' ) ;
    public final void rule__ColumnDeclarations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6701:1: ( ( ':' ) )
            // InternalPerfectML.g:6702:1: ( ':' )
            {
            // InternalPerfectML.g:6702:1: ( ':' )
            // InternalPerfectML.g:6703:2: ':'
            {
             before(grammarAccess.getColumnDeclarationsAccess().getColonKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getColumnDeclarationsAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group__3__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group__4"
    // InternalPerfectML.g:6712:1: rule__ColumnDeclarations__Group__4 : rule__ColumnDeclarations__Group__4__Impl rule__ColumnDeclarations__Group__5 ;
    public final void rule__ColumnDeclarations__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6716:1: ( rule__ColumnDeclarations__Group__4__Impl rule__ColumnDeclarations__Group__5 )
            // InternalPerfectML.g:6717:2: rule__ColumnDeclarations__Group__4__Impl rule__ColumnDeclarations__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__ColumnDeclarations__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group__4"


    // $ANTLR start "rule__ColumnDeclarations__Group__4__Impl"
    // InternalPerfectML.g:6724:1: rule__ColumnDeclarations__Group__4__Impl : ( ( rule__ColumnDeclarations__Group_4__0 ) ) ;
    public final void rule__ColumnDeclarations__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6728:1: ( ( ( rule__ColumnDeclarations__Group_4__0 ) ) )
            // InternalPerfectML.g:6729:1: ( ( rule__ColumnDeclarations__Group_4__0 ) )
            {
            // InternalPerfectML.g:6729:1: ( ( rule__ColumnDeclarations__Group_4__0 ) )
            // InternalPerfectML.g:6730:2: ( rule__ColumnDeclarations__Group_4__0 )
            {
             before(grammarAccess.getColumnDeclarationsAccess().getGroup_4()); 
            // InternalPerfectML.g:6731:2: ( rule__ColumnDeclarations__Group_4__0 )
            // InternalPerfectML.g:6731:3: rule__ColumnDeclarations__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDeclarationsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group__4__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group__5"
    // InternalPerfectML.g:6739:1: rule__ColumnDeclarations__Group__5 : rule__ColumnDeclarations__Group__5__Impl ;
    public final void rule__ColumnDeclarations__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6743:1: ( rule__ColumnDeclarations__Group__5__Impl )
            // InternalPerfectML.g:6744:2: rule__ColumnDeclarations__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group__5"


    // $ANTLR start "rule__ColumnDeclarations__Group__5__Impl"
    // InternalPerfectML.g:6750:1: rule__ColumnDeclarations__Group__5__Impl : ( ( rule__ColumnDeclarations__Group_5__0 )? ) ;
    public final void rule__ColumnDeclarations__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6754:1: ( ( ( rule__ColumnDeclarations__Group_5__0 )? ) )
            // InternalPerfectML.g:6755:1: ( ( rule__ColumnDeclarations__Group_5__0 )? )
            {
            // InternalPerfectML.g:6755:1: ( ( rule__ColumnDeclarations__Group_5__0 )? )
            // InternalPerfectML.g:6756:2: ( rule__ColumnDeclarations__Group_5__0 )?
            {
             before(grammarAccess.getColumnDeclarationsAccess().getGroup_5()); 
            // InternalPerfectML.g:6757:2: ( rule__ColumnDeclarations__Group_5__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==52||(LA62_0>=108 && LA62_0<=109)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalPerfectML.g:6757:3: rule__ColumnDeclarations__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnDeclarations__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnDeclarationsAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group__5__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group_4__0"
    // InternalPerfectML.g:6766:1: rule__ColumnDeclarations__Group_4__0 : rule__ColumnDeclarations__Group_4__0__Impl rule__ColumnDeclarations__Group_4__1 ;
    public final void rule__ColumnDeclarations__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6770:1: ( rule__ColumnDeclarations__Group_4__0__Impl rule__ColumnDeclarations__Group_4__1 )
            // InternalPerfectML.g:6771:2: rule__ColumnDeclarations__Group_4__0__Impl rule__ColumnDeclarations__Group_4__1
            {
            pushFollow(FOLLOW_39);
            rule__ColumnDeclarations__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_4__0"


    // $ANTLR start "rule__ColumnDeclarations__Group_4__0__Impl"
    // InternalPerfectML.g:6778:1: rule__ColumnDeclarations__Group_4__0__Impl : ( ( rule__ColumnDeclarations__TargetAssignment_4_0 ) ) ;
    public final void rule__ColumnDeclarations__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6782:1: ( ( ( rule__ColumnDeclarations__TargetAssignment_4_0 ) ) )
            // InternalPerfectML.g:6783:1: ( ( rule__ColumnDeclarations__TargetAssignment_4_0 ) )
            {
            // InternalPerfectML.g:6783:1: ( ( rule__ColumnDeclarations__TargetAssignment_4_0 ) )
            // InternalPerfectML.g:6784:2: ( rule__ColumnDeclarations__TargetAssignment_4_0 )
            {
             before(grammarAccess.getColumnDeclarationsAccess().getTargetAssignment_4_0()); 
            // InternalPerfectML.g:6785:2: ( rule__ColumnDeclarations__TargetAssignment_4_0 )
            // InternalPerfectML.g:6785:3: rule__ColumnDeclarations__TargetAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__TargetAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDeclarationsAccess().getTargetAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_4__0__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group_4__1"
    // InternalPerfectML.g:6793:1: rule__ColumnDeclarations__Group_4__1 : rule__ColumnDeclarations__Group_4__1__Impl rule__ColumnDeclarations__Group_4__2 ;
    public final void rule__ColumnDeclarations__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6797:1: ( rule__ColumnDeclarations__Group_4__1__Impl rule__ColumnDeclarations__Group_4__2 )
            // InternalPerfectML.g:6798:2: rule__ColumnDeclarations__Group_4__1__Impl rule__ColumnDeclarations__Group_4__2
            {
            pushFollow(FOLLOW_40);
            rule__ColumnDeclarations__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_4__1"


    // $ANTLR start "rule__ColumnDeclarations__Group_4__1__Impl"
    // InternalPerfectML.g:6805:1: rule__ColumnDeclarations__Group_4__1__Impl : ( 'as' ) ;
    public final void rule__ColumnDeclarations__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6809:1: ( ( 'as' ) )
            // InternalPerfectML.g:6810:1: ( 'as' )
            {
            // InternalPerfectML.g:6810:1: ( 'as' )
            // InternalPerfectML.g:6811:2: 'as'
            {
             before(grammarAccess.getColumnDeclarationsAccess().getAsKeyword_4_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getColumnDeclarationsAccess().getAsKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_4__1__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group_4__2"
    // InternalPerfectML.g:6820:1: rule__ColumnDeclarations__Group_4__2 : rule__ColumnDeclarations__Group_4__2__Impl ;
    public final void rule__ColumnDeclarations__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6824:1: ( rule__ColumnDeclarations__Group_4__2__Impl )
            // InternalPerfectML.g:6825:2: rule__ColumnDeclarations__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_4__2"


    // $ANTLR start "rule__ColumnDeclarations__Group_4__2__Impl"
    // InternalPerfectML.g:6831:1: rule__ColumnDeclarations__Group_4__2__Impl : ( ( rule__ColumnDeclarations__Target_defAssignment_4_2 ) ) ;
    public final void rule__ColumnDeclarations__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6835:1: ( ( ( rule__ColumnDeclarations__Target_defAssignment_4_2 ) ) )
            // InternalPerfectML.g:6836:1: ( ( rule__ColumnDeclarations__Target_defAssignment_4_2 ) )
            {
            // InternalPerfectML.g:6836:1: ( ( rule__ColumnDeclarations__Target_defAssignment_4_2 ) )
            // InternalPerfectML.g:6837:2: ( rule__ColumnDeclarations__Target_defAssignment_4_2 )
            {
             before(grammarAccess.getColumnDeclarationsAccess().getTarget_defAssignment_4_2()); 
            // InternalPerfectML.g:6838:2: ( rule__ColumnDeclarations__Target_defAssignment_4_2 )
            // InternalPerfectML.g:6838:3: rule__ColumnDeclarations__Target_defAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Target_defAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnDeclarationsAccess().getTarget_defAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_4__2__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group_5__0"
    // InternalPerfectML.g:6847:1: rule__ColumnDeclarations__Group_5__0 : rule__ColumnDeclarations__Group_5__0__Impl rule__ColumnDeclarations__Group_5__1 ;
    public final void rule__ColumnDeclarations__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6851:1: ( rule__ColumnDeclarations__Group_5__0__Impl rule__ColumnDeclarations__Group_5__1 )
            // InternalPerfectML.g:6852:2: rule__ColumnDeclarations__Group_5__0__Impl rule__ColumnDeclarations__Group_5__1
            {
            pushFollow(FOLLOW_39);
            rule__ColumnDeclarations__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_5__0"


    // $ANTLR start "rule__ColumnDeclarations__Group_5__0__Impl"
    // InternalPerfectML.g:6859:1: rule__ColumnDeclarations__Group_5__0__Impl : ( ( rule__ColumnDeclarations__PredictiveAssignment_5_0 ) ) ;
    public final void rule__ColumnDeclarations__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6863:1: ( ( ( rule__ColumnDeclarations__PredictiveAssignment_5_0 ) ) )
            // InternalPerfectML.g:6864:1: ( ( rule__ColumnDeclarations__PredictiveAssignment_5_0 ) )
            {
            // InternalPerfectML.g:6864:1: ( ( rule__ColumnDeclarations__PredictiveAssignment_5_0 ) )
            // InternalPerfectML.g:6865:2: ( rule__ColumnDeclarations__PredictiveAssignment_5_0 )
            {
             before(grammarAccess.getColumnDeclarationsAccess().getPredictiveAssignment_5_0()); 
            // InternalPerfectML.g:6866:2: ( rule__ColumnDeclarations__PredictiveAssignment_5_0 )
            // InternalPerfectML.g:6866:3: rule__ColumnDeclarations__PredictiveAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__PredictiveAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDeclarationsAccess().getPredictiveAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_5__0__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group_5__1"
    // InternalPerfectML.g:6874:1: rule__ColumnDeclarations__Group_5__1 : rule__ColumnDeclarations__Group_5__1__Impl rule__ColumnDeclarations__Group_5__2 ;
    public final void rule__ColumnDeclarations__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6878:1: ( rule__ColumnDeclarations__Group_5__1__Impl rule__ColumnDeclarations__Group_5__2 )
            // InternalPerfectML.g:6879:2: rule__ColumnDeclarations__Group_5__1__Impl rule__ColumnDeclarations__Group_5__2
            {
            pushFollow(FOLLOW_41);
            rule__ColumnDeclarations__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_5__1"


    // $ANTLR start "rule__ColumnDeclarations__Group_5__1__Impl"
    // InternalPerfectML.g:6886:1: rule__ColumnDeclarations__Group_5__1__Impl : ( 'as' ) ;
    public final void rule__ColumnDeclarations__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6890:1: ( ( 'as' ) )
            // InternalPerfectML.g:6891:1: ( 'as' )
            {
            // InternalPerfectML.g:6891:1: ( 'as' )
            // InternalPerfectML.g:6892:2: 'as'
            {
             before(grammarAccess.getColumnDeclarationsAccess().getAsKeyword_5_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getColumnDeclarationsAccess().getAsKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_5__1__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group_5__2"
    // InternalPerfectML.g:6901:1: rule__ColumnDeclarations__Group_5__2 : rule__ColumnDeclarations__Group_5__2__Impl ;
    public final void rule__ColumnDeclarations__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6905:1: ( rule__ColumnDeclarations__Group_5__2__Impl )
            // InternalPerfectML.g:6906:2: rule__ColumnDeclarations__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_5__2"


    // $ANTLR start "rule__ColumnDeclarations__Group_5__2__Impl"
    // InternalPerfectML.g:6912:1: rule__ColumnDeclarations__Group_5__2__Impl : ( ( rule__ColumnDeclarations__Pred_defAssignment_5_2 ) ) ;
    public final void rule__ColumnDeclarations__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6916:1: ( ( ( rule__ColumnDeclarations__Pred_defAssignment_5_2 ) ) )
            // InternalPerfectML.g:6917:1: ( ( rule__ColumnDeclarations__Pred_defAssignment_5_2 ) )
            {
            // InternalPerfectML.g:6917:1: ( ( rule__ColumnDeclarations__Pred_defAssignment_5_2 ) )
            // InternalPerfectML.g:6918:2: ( rule__ColumnDeclarations__Pred_defAssignment_5_2 )
            {
             before(grammarAccess.getColumnDeclarationsAccess().getPred_defAssignment_5_2()); 
            // InternalPerfectML.g:6919:2: ( rule__ColumnDeclarations__Pred_defAssignment_5_2 )
            // InternalPerfectML.g:6919:3: rule__ColumnDeclarations__Pred_defAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Pred_defAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnDeclarationsAccess().getPred_defAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_5__2__Impl"


    // $ANTLR start "rule__ColumnSet__Group_0__0"
    // InternalPerfectML.g:6928:1: rule__ColumnSet__Group_0__0 : rule__ColumnSet__Group_0__0__Impl rule__ColumnSet__Group_0__1 ;
    public final void rule__ColumnSet__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6932:1: ( rule__ColumnSet__Group_0__0__Impl rule__ColumnSet__Group_0__1 )
            // InternalPerfectML.g:6933:2: rule__ColumnSet__Group_0__0__Impl rule__ColumnSet__Group_0__1
            {
            pushFollow(FOLLOW_38);
            rule__ColumnSet__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__0"


    // $ANTLR start "rule__ColumnSet__Group_0__0__Impl"
    // InternalPerfectML.g:6940:1: rule__ColumnSet__Group_0__0__Impl : ( ( rule__ColumnSet__OpAssignment_0_0 ) ) ;
    public final void rule__ColumnSet__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6944:1: ( ( ( rule__ColumnSet__OpAssignment_0_0 ) ) )
            // InternalPerfectML.g:6945:1: ( ( rule__ColumnSet__OpAssignment_0_0 ) )
            {
            // InternalPerfectML.g:6945:1: ( ( rule__ColumnSet__OpAssignment_0_0 ) )
            // InternalPerfectML.g:6946:2: ( rule__ColumnSet__OpAssignment_0_0 )
            {
             before(grammarAccess.getColumnSetAccess().getOpAssignment_0_0()); 
            // InternalPerfectML.g:6947:2: ( rule__ColumnSet__OpAssignment_0_0 )
            // InternalPerfectML.g:6947:3: rule__ColumnSet__OpAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__OpAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnSetAccess().getOpAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__0__Impl"


    // $ANTLR start "rule__ColumnSet__Group_0__1"
    // InternalPerfectML.g:6955:1: rule__ColumnSet__Group_0__1 : rule__ColumnSet__Group_0__1__Impl rule__ColumnSet__Group_0__2 ;
    public final void rule__ColumnSet__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6959:1: ( rule__ColumnSet__Group_0__1__Impl rule__ColumnSet__Group_0__2 )
            // InternalPerfectML.g:6960:2: rule__ColumnSet__Group_0__1__Impl rule__ColumnSet__Group_0__2
            {
            pushFollow(FOLLOW_42);
            rule__ColumnSet__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__1"


    // $ANTLR start "rule__ColumnSet__Group_0__1__Impl"
    // InternalPerfectML.g:6967:1: rule__ColumnSet__Group_0__1__Impl : ( ( rule__ColumnSet__ArgBin1Assignment_0_1 ) ) ;
    public final void rule__ColumnSet__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6971:1: ( ( ( rule__ColumnSet__ArgBin1Assignment_0_1 ) ) )
            // InternalPerfectML.g:6972:1: ( ( rule__ColumnSet__ArgBin1Assignment_0_1 ) )
            {
            // InternalPerfectML.g:6972:1: ( ( rule__ColumnSet__ArgBin1Assignment_0_1 ) )
            // InternalPerfectML.g:6973:2: ( rule__ColumnSet__ArgBin1Assignment_0_1 )
            {
             before(grammarAccess.getColumnSetAccess().getArgBin1Assignment_0_1()); 
            // InternalPerfectML.g:6974:2: ( rule__ColumnSet__ArgBin1Assignment_0_1 )
            // InternalPerfectML.g:6974:3: rule__ColumnSet__ArgBin1Assignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__ArgBin1Assignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnSetAccess().getArgBin1Assignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__1__Impl"


    // $ANTLR start "rule__ColumnSet__Group_0__2"
    // InternalPerfectML.g:6982:1: rule__ColumnSet__Group_0__2 : rule__ColumnSet__Group_0__2__Impl rule__ColumnSet__Group_0__3 ;
    public final void rule__ColumnSet__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6986:1: ( rule__ColumnSet__Group_0__2__Impl rule__ColumnSet__Group_0__3 )
            // InternalPerfectML.g:6987:2: rule__ColumnSet__Group_0__2__Impl rule__ColumnSet__Group_0__3
            {
            pushFollow(FOLLOW_43);
            rule__ColumnSet__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__2"


    // $ANTLR start "rule__ColumnSet__Group_0__2__Impl"
    // InternalPerfectML.g:6994:1: rule__ColumnSet__Group_0__2__Impl : ( ')' ) ;
    public final void rule__ColumnSet__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:6998:1: ( ( ')' ) )
            // InternalPerfectML.g:6999:1: ( ')' )
            {
            // InternalPerfectML.g:6999:1: ( ')' )
            // InternalPerfectML.g:7000:2: ')'
            {
             before(grammarAccess.getColumnSetAccess().getRightParenthesisKeyword_0_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__2__Impl"


    // $ANTLR start "rule__ColumnSet__Group_0__3"
    // InternalPerfectML.g:7009:1: rule__ColumnSet__Group_0__3 : rule__ColumnSet__Group_0__3__Impl rule__ColumnSet__Group_0__4 ;
    public final void rule__ColumnSet__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7013:1: ( rule__ColumnSet__Group_0__3__Impl rule__ColumnSet__Group_0__4 )
            // InternalPerfectML.g:7014:2: rule__ColumnSet__Group_0__3__Impl rule__ColumnSet__Group_0__4
            {
            pushFollow(FOLLOW_17);
            rule__ColumnSet__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__3"


    // $ANTLR start "rule__ColumnSet__Group_0__3__Impl"
    // InternalPerfectML.g:7021:1: rule__ColumnSet__Group_0__3__Impl : ( ( rule__ColumnSet__OpTypeAssignment_0_3 ) ) ;
    public final void rule__ColumnSet__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7025:1: ( ( ( rule__ColumnSet__OpTypeAssignment_0_3 ) ) )
            // InternalPerfectML.g:7026:1: ( ( rule__ColumnSet__OpTypeAssignment_0_3 ) )
            {
            // InternalPerfectML.g:7026:1: ( ( rule__ColumnSet__OpTypeAssignment_0_3 ) )
            // InternalPerfectML.g:7027:2: ( rule__ColumnSet__OpTypeAssignment_0_3 )
            {
             before(grammarAccess.getColumnSetAccess().getOpTypeAssignment_0_3()); 
            // InternalPerfectML.g:7028:2: ( rule__ColumnSet__OpTypeAssignment_0_3 )
            // InternalPerfectML.g:7028:3: rule__ColumnSet__OpTypeAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__OpTypeAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getColumnSetAccess().getOpTypeAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__3__Impl"


    // $ANTLR start "rule__ColumnSet__Group_0__4"
    // InternalPerfectML.g:7036:1: rule__ColumnSet__Group_0__4 : rule__ColumnSet__Group_0__4__Impl rule__ColumnSet__Group_0__5 ;
    public final void rule__ColumnSet__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7040:1: ( rule__ColumnSet__Group_0__4__Impl rule__ColumnSet__Group_0__5 )
            // InternalPerfectML.g:7041:2: rule__ColumnSet__Group_0__4__Impl rule__ColumnSet__Group_0__5
            {
            pushFollow(FOLLOW_38);
            rule__ColumnSet__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__4"


    // $ANTLR start "rule__ColumnSet__Group_0__4__Impl"
    // InternalPerfectML.g:7048:1: rule__ColumnSet__Group_0__4__Impl : ( '(' ) ;
    public final void rule__ColumnSet__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7052:1: ( ( '(' ) )
            // InternalPerfectML.g:7053:1: ( '(' )
            {
            // InternalPerfectML.g:7053:1: ( '(' )
            // InternalPerfectML.g:7054:2: '('
            {
             before(grammarAccess.getColumnSetAccess().getLeftParenthesisKeyword_0_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getLeftParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__4__Impl"


    // $ANTLR start "rule__ColumnSet__Group_0__5"
    // InternalPerfectML.g:7063:1: rule__ColumnSet__Group_0__5 : rule__ColumnSet__Group_0__5__Impl rule__ColumnSet__Group_0__6 ;
    public final void rule__ColumnSet__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7067:1: ( rule__ColumnSet__Group_0__5__Impl rule__ColumnSet__Group_0__6 )
            // InternalPerfectML.g:7068:2: rule__ColumnSet__Group_0__5__Impl rule__ColumnSet__Group_0__6
            {
            pushFollow(FOLLOW_42);
            rule__ColumnSet__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__5"


    // $ANTLR start "rule__ColumnSet__Group_0__5__Impl"
    // InternalPerfectML.g:7075:1: rule__ColumnSet__Group_0__5__Impl : ( ( rule__ColumnSet__ArgBin2Assignment_0_5 ) ) ;
    public final void rule__ColumnSet__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7079:1: ( ( ( rule__ColumnSet__ArgBin2Assignment_0_5 ) ) )
            // InternalPerfectML.g:7080:1: ( ( rule__ColumnSet__ArgBin2Assignment_0_5 ) )
            {
            // InternalPerfectML.g:7080:1: ( ( rule__ColumnSet__ArgBin2Assignment_0_5 ) )
            // InternalPerfectML.g:7081:2: ( rule__ColumnSet__ArgBin2Assignment_0_5 )
            {
             before(grammarAccess.getColumnSetAccess().getArgBin2Assignment_0_5()); 
            // InternalPerfectML.g:7082:2: ( rule__ColumnSet__ArgBin2Assignment_0_5 )
            // InternalPerfectML.g:7082:3: rule__ColumnSet__ArgBin2Assignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__ArgBin2Assignment_0_5();

            state._fsp--;


            }

             after(grammarAccess.getColumnSetAccess().getArgBin2Assignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__5__Impl"


    // $ANTLR start "rule__ColumnSet__Group_0__6"
    // InternalPerfectML.g:7090:1: rule__ColumnSet__Group_0__6 : rule__ColumnSet__Group_0__6__Impl ;
    public final void rule__ColumnSet__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7094:1: ( rule__ColumnSet__Group_0__6__Impl )
            // InternalPerfectML.g:7095:2: rule__ColumnSet__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__6"


    // $ANTLR start "rule__ColumnSet__Group_0__6__Impl"
    // InternalPerfectML.g:7101:1: rule__ColumnSet__Group_0__6__Impl : ( ')' ) ;
    public final void rule__ColumnSet__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7105:1: ( ( ')' ) )
            // InternalPerfectML.g:7106:1: ( ')' )
            {
            // InternalPerfectML.g:7106:1: ( ')' )
            // InternalPerfectML.g:7107:2: ')'
            {
             before(grammarAccess.getColumnSetAccess().getRightParenthesisKeyword_0_6()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getRightParenthesisKeyword_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_0__6__Impl"


    // $ANTLR start "rule__ColumnSet__Group_1__0"
    // InternalPerfectML.g:7117:1: rule__ColumnSet__Group_1__0 : rule__ColumnSet__Group_1__0__Impl rule__ColumnSet__Group_1__1 ;
    public final void rule__ColumnSet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7121:1: ( rule__ColumnSet__Group_1__0__Impl rule__ColumnSet__Group_1__1 )
            // InternalPerfectML.g:7122:2: rule__ColumnSet__Group_1__0__Impl rule__ColumnSet__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__ColumnSet__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_1__0"


    // $ANTLR start "rule__ColumnSet__Group_1__0__Impl"
    // InternalPerfectML.g:7129:1: rule__ColumnSet__Group_1__0__Impl : ( ( rule__ColumnSet__RangeAssignment_1_0 ) ) ;
    public final void rule__ColumnSet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7133:1: ( ( ( rule__ColumnSet__RangeAssignment_1_0 ) ) )
            // InternalPerfectML.g:7134:1: ( ( rule__ColumnSet__RangeAssignment_1_0 ) )
            {
            // InternalPerfectML.g:7134:1: ( ( rule__ColumnSet__RangeAssignment_1_0 ) )
            // InternalPerfectML.g:7135:2: ( rule__ColumnSet__RangeAssignment_1_0 )
            {
             before(grammarAccess.getColumnSetAccess().getRangeAssignment_1_0()); 
            // InternalPerfectML.g:7136:2: ( rule__ColumnSet__RangeAssignment_1_0 )
            // InternalPerfectML.g:7136:3: rule__ColumnSet__RangeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__RangeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnSetAccess().getRangeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_1__0__Impl"


    // $ANTLR start "rule__ColumnSet__Group_1__1"
    // InternalPerfectML.g:7144:1: rule__ColumnSet__Group_1__1 : rule__ColumnSet__Group_1__1__Impl rule__ColumnSet__Group_1__2 ;
    public final void rule__ColumnSet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7148:1: ( rule__ColumnSet__Group_1__1__Impl rule__ColumnSet__Group_1__2 )
            // InternalPerfectML.g:7149:2: rule__ColumnSet__Group_1__1__Impl rule__ColumnSet__Group_1__2
            {
            pushFollow(FOLLOW_44);
            rule__ColumnSet__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_1__1"


    // $ANTLR start "rule__ColumnSet__Group_1__1__Impl"
    // InternalPerfectML.g:7156:1: rule__ColumnSet__Group_1__1__Impl : ( ( rule__ColumnSet__ArgR1Assignment_1_1 ) ) ;
    public final void rule__ColumnSet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7160:1: ( ( ( rule__ColumnSet__ArgR1Assignment_1_1 ) ) )
            // InternalPerfectML.g:7161:1: ( ( rule__ColumnSet__ArgR1Assignment_1_1 ) )
            {
            // InternalPerfectML.g:7161:1: ( ( rule__ColumnSet__ArgR1Assignment_1_1 ) )
            // InternalPerfectML.g:7162:2: ( rule__ColumnSet__ArgR1Assignment_1_1 )
            {
             before(grammarAccess.getColumnSetAccess().getArgR1Assignment_1_1()); 
            // InternalPerfectML.g:7163:2: ( rule__ColumnSet__ArgR1Assignment_1_1 )
            // InternalPerfectML.g:7163:3: rule__ColumnSet__ArgR1Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__ArgR1Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnSetAccess().getArgR1Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_1__1__Impl"


    // $ANTLR start "rule__ColumnSet__Group_1__2"
    // InternalPerfectML.g:7171:1: rule__ColumnSet__Group_1__2 : rule__ColumnSet__Group_1__2__Impl rule__ColumnSet__Group_1__3 ;
    public final void rule__ColumnSet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7175:1: ( rule__ColumnSet__Group_1__2__Impl rule__ColumnSet__Group_1__3 )
            // InternalPerfectML.g:7176:2: rule__ColumnSet__Group_1__2__Impl rule__ColumnSet__Group_1__3
            {
            pushFollow(FOLLOW_18);
            rule__ColumnSet__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_1__2"


    // $ANTLR start "rule__ColumnSet__Group_1__2__Impl"
    // InternalPerfectML.g:7183:1: rule__ColumnSet__Group_1__2__Impl : ( 'to' ) ;
    public final void rule__ColumnSet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7187:1: ( ( 'to' ) )
            // InternalPerfectML.g:7188:1: ( 'to' )
            {
            // InternalPerfectML.g:7188:1: ( 'to' )
            // InternalPerfectML.g:7189:2: 'to'
            {
             before(grammarAccess.getColumnSetAccess().getToKeyword_1_2()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getToKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_1__2__Impl"


    // $ANTLR start "rule__ColumnSet__Group_1__3"
    // InternalPerfectML.g:7198:1: rule__ColumnSet__Group_1__3 : rule__ColumnSet__Group_1__3__Impl ;
    public final void rule__ColumnSet__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7202:1: ( rule__ColumnSet__Group_1__3__Impl )
            // InternalPerfectML.g:7203:2: rule__ColumnSet__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_1__3"


    // $ANTLR start "rule__ColumnSet__Group_1__3__Impl"
    // InternalPerfectML.g:7209:1: rule__ColumnSet__Group_1__3__Impl : ( ( rule__ColumnSet__ArgR2Assignment_1_3 ) ) ;
    public final void rule__ColumnSet__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7213:1: ( ( ( rule__ColumnSet__ArgR2Assignment_1_3 ) ) )
            // InternalPerfectML.g:7214:1: ( ( rule__ColumnSet__ArgR2Assignment_1_3 ) )
            {
            // InternalPerfectML.g:7214:1: ( ( rule__ColumnSet__ArgR2Assignment_1_3 ) )
            // InternalPerfectML.g:7215:2: ( rule__ColumnSet__ArgR2Assignment_1_3 )
            {
             before(grammarAccess.getColumnSetAccess().getArgR2Assignment_1_3()); 
            // InternalPerfectML.g:7216:2: ( rule__ColumnSet__ArgR2Assignment_1_3 )
            // InternalPerfectML.g:7216:3: rule__ColumnSet__ArgR2Assignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__ArgR2Assignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getColumnSetAccess().getArgR2Assignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_1__3__Impl"


    // $ANTLR start "rule__ColumnSet__Group_2__0"
    // InternalPerfectML.g:7225:1: rule__ColumnSet__Group_2__0 : rule__ColumnSet__Group_2__0__Impl rule__ColumnSet__Group_2__1 ;
    public final void rule__ColumnSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7229:1: ( rule__ColumnSet__Group_2__0__Impl rule__ColumnSet__Group_2__1 )
            // InternalPerfectML.g:7230:2: rule__ColumnSet__Group_2__0__Impl rule__ColumnSet__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__ColumnSet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_2__0"


    // $ANTLR start "rule__ColumnSet__Group_2__0__Impl"
    // InternalPerfectML.g:7237:1: rule__ColumnSet__Group_2__0__Impl : ( ( rule__ColumnSet__ListAssignment_2_0 ) ) ;
    public final void rule__ColumnSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7241:1: ( ( ( rule__ColumnSet__ListAssignment_2_0 ) ) )
            // InternalPerfectML.g:7242:1: ( ( rule__ColumnSet__ListAssignment_2_0 ) )
            {
            // InternalPerfectML.g:7242:1: ( ( rule__ColumnSet__ListAssignment_2_0 ) )
            // InternalPerfectML.g:7243:2: ( rule__ColumnSet__ListAssignment_2_0 )
            {
             before(grammarAccess.getColumnSetAccess().getListAssignment_2_0()); 
            // InternalPerfectML.g:7244:2: ( rule__ColumnSet__ListAssignment_2_0 )
            // InternalPerfectML.g:7244:3: rule__ColumnSet__ListAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__ListAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnSetAccess().getListAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_2__0__Impl"


    // $ANTLR start "rule__ColumnSet__Group_2__1"
    // InternalPerfectML.g:7252:1: rule__ColumnSet__Group_2__1 : rule__ColumnSet__Group_2__1__Impl rule__ColumnSet__Group_2__2 ;
    public final void rule__ColumnSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7256:1: ( rule__ColumnSet__Group_2__1__Impl rule__ColumnSet__Group_2__2 )
            // InternalPerfectML.g:7257:2: rule__ColumnSet__Group_2__1__Impl rule__ColumnSet__Group_2__2
            {
            pushFollow(FOLLOW_18);
            rule__ColumnSet__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_2__1"


    // $ANTLR start "rule__ColumnSet__Group_2__1__Impl"
    // InternalPerfectML.g:7264:1: rule__ColumnSet__Group_2__1__Impl : ( ( rule__ColumnSet__Group_2_1__0 )* ) ;
    public final void rule__ColumnSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7268:1: ( ( ( rule__ColumnSet__Group_2_1__0 )* ) )
            // InternalPerfectML.g:7269:1: ( ( rule__ColumnSet__Group_2_1__0 )* )
            {
            // InternalPerfectML.g:7269:1: ( ( rule__ColumnSet__Group_2_1__0 )* )
            // InternalPerfectML.g:7270:2: ( rule__ColumnSet__Group_2_1__0 )*
            {
             before(grammarAccess.getColumnSetAccess().getGroup_2_1()); 
            // InternalPerfectML.g:7271:2: ( rule__ColumnSet__Group_2_1__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_INT) ) {
                    int LA63_1 = input.LA(2);

                    if ( (LA63_1==54) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // InternalPerfectML.g:7271:3: rule__ColumnSet__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__ColumnSet__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getColumnSetAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_2__1__Impl"


    // $ANTLR start "rule__ColumnSet__Group_2__2"
    // InternalPerfectML.g:7279:1: rule__ColumnSet__Group_2__2 : rule__ColumnSet__Group_2__2__Impl rule__ColumnSet__Group_2__3 ;
    public final void rule__ColumnSet__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7283:1: ( rule__ColumnSet__Group_2__2__Impl rule__ColumnSet__Group_2__3 )
            // InternalPerfectML.g:7284:2: rule__ColumnSet__Group_2__2__Impl rule__ColumnSet__Group_2__3
            {
            pushFollow(FOLLOW_46);
            rule__ColumnSet__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_2__2"


    // $ANTLR start "rule__ColumnSet__Group_2__2__Impl"
    // InternalPerfectML.g:7291:1: rule__ColumnSet__Group_2__2__Impl : ( ( rule__ColumnSet__ArgListAssignment_2_2 ) ) ;
    public final void rule__ColumnSet__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7295:1: ( ( ( rule__ColumnSet__ArgListAssignment_2_2 ) ) )
            // InternalPerfectML.g:7296:1: ( ( rule__ColumnSet__ArgListAssignment_2_2 ) )
            {
            // InternalPerfectML.g:7296:1: ( ( rule__ColumnSet__ArgListAssignment_2_2 ) )
            // InternalPerfectML.g:7297:2: ( rule__ColumnSet__ArgListAssignment_2_2 )
            {
             before(grammarAccess.getColumnSetAccess().getArgListAssignment_2_2()); 
            // InternalPerfectML.g:7298:2: ( rule__ColumnSet__ArgListAssignment_2_2 )
            // InternalPerfectML.g:7298:3: rule__ColumnSet__ArgListAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__ArgListAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnSetAccess().getArgListAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_2__2__Impl"


    // $ANTLR start "rule__ColumnSet__Group_2__3"
    // InternalPerfectML.g:7306:1: rule__ColumnSet__Group_2__3 : rule__ColumnSet__Group_2__3__Impl ;
    public final void rule__ColumnSet__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7310:1: ( rule__ColumnSet__Group_2__3__Impl )
            // InternalPerfectML.g:7311:2: rule__ColumnSet__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_2__3"


    // $ANTLR start "rule__ColumnSet__Group_2__3__Impl"
    // InternalPerfectML.g:7317:1: rule__ColumnSet__Group_2__3__Impl : ( ']' ) ;
    public final void rule__ColumnSet__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7321:1: ( ( ']' ) )
            // InternalPerfectML.g:7322:1: ( ']' )
            {
            // InternalPerfectML.g:7322:1: ( ']' )
            // InternalPerfectML.g:7323:2: ']'
            {
             before(grammarAccess.getColumnSetAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_2__3__Impl"


    // $ANTLR start "rule__ColumnSet__Group_2_1__0"
    // InternalPerfectML.g:7333:1: rule__ColumnSet__Group_2_1__0 : rule__ColumnSet__Group_2_1__0__Impl rule__ColumnSet__Group_2_1__1 ;
    public final void rule__ColumnSet__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7337:1: ( rule__ColumnSet__Group_2_1__0__Impl rule__ColumnSet__Group_2_1__1 )
            // InternalPerfectML.g:7338:2: rule__ColumnSet__Group_2_1__0__Impl rule__ColumnSet__Group_2_1__1
            {
            pushFollow(FOLLOW_47);
            rule__ColumnSet__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_2_1__0"


    // $ANTLR start "rule__ColumnSet__Group_2_1__0__Impl"
    // InternalPerfectML.g:7345:1: rule__ColumnSet__Group_2_1__0__Impl : ( ( rule__ColumnSet__ArgListAssignment_2_1_0 ) ) ;
    public final void rule__ColumnSet__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7349:1: ( ( ( rule__ColumnSet__ArgListAssignment_2_1_0 ) ) )
            // InternalPerfectML.g:7350:1: ( ( rule__ColumnSet__ArgListAssignment_2_1_0 ) )
            {
            // InternalPerfectML.g:7350:1: ( ( rule__ColumnSet__ArgListAssignment_2_1_0 ) )
            // InternalPerfectML.g:7351:2: ( rule__ColumnSet__ArgListAssignment_2_1_0 )
            {
             before(grammarAccess.getColumnSetAccess().getArgListAssignment_2_1_0()); 
            // InternalPerfectML.g:7352:2: ( rule__ColumnSet__ArgListAssignment_2_1_0 )
            // InternalPerfectML.g:7352:3: rule__ColumnSet__ArgListAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__ArgListAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnSetAccess().getArgListAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_2_1__0__Impl"


    // $ANTLR start "rule__ColumnSet__Group_2_1__1"
    // InternalPerfectML.g:7360:1: rule__ColumnSet__Group_2_1__1 : rule__ColumnSet__Group_2_1__1__Impl ;
    public final void rule__ColumnSet__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7364:1: ( rule__ColumnSet__Group_2_1__1__Impl )
            // InternalPerfectML.g:7365:2: rule__ColumnSet__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnSet__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_2_1__1"


    // $ANTLR start "rule__ColumnSet__Group_2_1__1__Impl"
    // InternalPerfectML.g:7371:1: rule__ColumnSet__Group_2_1__1__Impl : ( ',' ) ;
    public final void rule__ColumnSet__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7375:1: ( ( ',' ) )
            // InternalPerfectML.g:7376:1: ( ',' )
            {
            // InternalPerfectML.g:7376:1: ( ',' )
            // InternalPerfectML.g:7377:2: ','
            {
             before(grammarAccess.getColumnSetAccess().getCommaKeyword_2_1_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getCommaKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__Group_2_1__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalPerfectML.g:7387:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7391:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalPerfectML.g:7392:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalPerfectML.g:7399:1: rule__FLOAT__Group__0__Impl : ( ( rule__FLOAT__IntPartAssignment_0 ) ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7403:1: ( ( ( rule__FLOAT__IntPartAssignment_0 ) ) )
            // InternalPerfectML.g:7404:1: ( ( rule__FLOAT__IntPartAssignment_0 ) )
            {
            // InternalPerfectML.g:7404:1: ( ( rule__FLOAT__IntPartAssignment_0 ) )
            // InternalPerfectML.g:7405:2: ( rule__FLOAT__IntPartAssignment_0 )
            {
             before(grammarAccess.getFLOATAccess().getIntPartAssignment_0()); 
            // InternalPerfectML.g:7406:2: ( rule__FLOAT__IntPartAssignment_0 )
            // InternalPerfectML.g:7406:3: rule__FLOAT__IntPartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__IntPartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getIntPartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalPerfectML.g:7414:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7418:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalPerfectML.g:7419:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__FLOAT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalPerfectML.g:7426:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7430:1: ( ( '.' ) )
            // InternalPerfectML.g:7431:1: ( '.' )
            {
            // InternalPerfectML.g:7431:1: ( '.' )
            // InternalPerfectML.g:7432:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__2"
    // InternalPerfectML.g:7441:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7445:1: ( rule__FLOAT__Group__2__Impl )
            // InternalPerfectML.g:7446:2: rule__FLOAT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2"


    // $ANTLR start "rule__FLOAT__Group__2__Impl"
    // InternalPerfectML.g:7452:1: rule__FLOAT__Group__2__Impl : ( ( rule__FLOAT__DecPartAssignment_2 ) ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7456:1: ( ( ( rule__FLOAT__DecPartAssignment_2 ) ) )
            // InternalPerfectML.g:7457:1: ( ( rule__FLOAT__DecPartAssignment_2 ) )
            {
            // InternalPerfectML.g:7457:1: ( ( rule__FLOAT__DecPartAssignment_2 ) )
            // InternalPerfectML.g:7458:2: ( rule__FLOAT__DecPartAssignment_2 )
            {
             before(grammarAccess.getFLOATAccess().getDecPartAssignment_2()); 
            // InternalPerfectML.g:7459:2: ( rule__FLOAT__DecPartAssignment_2 )
            // InternalPerfectML.g:7459:3: rule__FLOAT__DecPartAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__DecPartAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getDecPartAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2__Impl"


    // $ANTLR start "rule__PerfectMLFile__ProgramsAssignment_0"
    // InternalPerfectML.g:7468:1: rule__PerfectMLFile__ProgramsAssignment_0 : ( ruleProgram ) ;
    public final void rule__PerfectMLFile__ProgramsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7472:1: ( ( ruleProgram ) )
            // InternalPerfectML.g:7473:2: ( ruleProgram )
            {
            // InternalPerfectML.g:7473:2: ( ruleProgram )
            // InternalPerfectML.g:7474:3: ruleProgram
            {
             before(grammarAccess.getPerfectMLFileAccess().getProgramsProgramParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getPerfectMLFileAccess().getProgramsProgramParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerfectMLFile__ProgramsAssignment_0"


    // $ANTLR start "rule__Program__InputAssignment_0"
    // InternalPerfectML.g:7483:1: rule__Program__InputAssignment_0 : ( ruleInput ) ;
    public final void rule__Program__InputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7487:1: ( ( ruleInput ) )
            // InternalPerfectML.g:7488:2: ( ruleInput )
            {
            // InternalPerfectML.g:7488:2: ( ruleInput )
            // InternalPerfectML.g:7489:3: ruleInput
            {
             before(grammarAccess.getProgramAccess().getInputInputParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getInputInputParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__InputAssignment_0"


    // $ANTLR start "rule__Program__OutputAssignment_1"
    // InternalPerfectML.g:7498:1: rule__Program__OutputAssignment_1 : ( ruleOutput ) ;
    public final void rule__Program__OutputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7502:1: ( ( ruleOutput ) )
            // InternalPerfectML.g:7503:2: ( ruleOutput )
            {
            // InternalPerfectML.g:7503:2: ( ruleOutput )
            // InternalPerfectML.g:7504:3: ruleOutput
            {
             before(grammarAccess.getProgramAccess().getOutputOutputParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getOutputOutputParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__OutputAssignment_1"


    // $ANTLR start "rule__Program__AlgoAssignment_2"
    // InternalPerfectML.g:7513:1: rule__Program__AlgoAssignment_2 : ( ruleAlgorithm ) ;
    public final void rule__Program__AlgoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7517:1: ( ( ruleAlgorithm ) )
            // InternalPerfectML.g:7518:2: ( ruleAlgorithm )
            {
            // InternalPerfectML.g:7518:2: ( ruleAlgorithm )
            // InternalPerfectML.g:7519:3: ruleAlgorithm
            {
             before(grammarAccess.getProgramAccess().getAlgoAlgorithmParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgorithm();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getAlgoAlgorithmParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__AlgoAssignment_2"


    // $ANTLR start "rule__Program__NbtrainingAssignment_3"
    // InternalPerfectML.g:7528:1: rule__Program__NbtrainingAssignment_3 : ( ruleTrainingAmount ) ;
    public final void rule__Program__NbtrainingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7532:1: ( ( ruleTrainingAmount ) )
            // InternalPerfectML.g:7533:2: ( ruleTrainingAmount )
            {
            // InternalPerfectML.g:7533:2: ( ruleTrainingAmount )
            // InternalPerfectML.g:7534:3: ruleTrainingAmount
            {
             before(grammarAccess.getProgramAccess().getNbtrainingTrainingAmountParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTrainingAmount();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getNbtrainingTrainingAmountParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NbtrainingAssignment_3"


    // $ANTLR start "rule__Program__ColumnAssignment_4"
    // InternalPerfectML.g:7543:1: rule__Program__ColumnAssignment_4 : ( ruleColumnDeclarations ) ;
    public final void rule__Program__ColumnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7547:1: ( ( ruleColumnDeclarations ) )
            // InternalPerfectML.g:7548:2: ( ruleColumnDeclarations )
            {
            // InternalPerfectML.g:7548:2: ( ruleColumnDeclarations )
            // InternalPerfectML.g:7549:3: ruleColumnDeclarations
            {
             before(grammarAccess.getProgramAccess().getColumnColumnDeclarationsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnDeclarations();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getColumnColumnDeclarationsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ColumnAssignment_4"


    // $ANTLR start "rule__Input__PATHAssignment_4"
    // InternalPerfectML.g:7558:1: rule__Input__PATHAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Input__PATHAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7562:1: ( ( RULE_STRING ) )
            // InternalPerfectML.g:7563:2: ( RULE_STRING )
            {
            // InternalPerfectML.g:7563:2: ( RULE_STRING )
            // InternalPerfectML.g:7564:3: RULE_STRING
            {
             before(grammarAccess.getInputAccess().getPATHSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getPATHSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__PATHAssignment_4"


    // $ANTLR start "rule__Output__PATHAssignment_4"
    // InternalPerfectML.g:7573:1: rule__Output__PATHAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Output__PATHAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7577:1: ( ( RULE_STRING ) )
            // InternalPerfectML.g:7578:2: ( RULE_STRING )
            {
            // InternalPerfectML.g:7578:2: ( RULE_STRING )
            // InternalPerfectML.g:7579:3: RULE_STRING
            {
             before(grammarAccess.getOutputAccess().getPATHSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getPATHSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__PATHAssignment_4"


    // $ANTLR start "rule__MLPClassifier__Hidden_layer_sizes_defAssignment_3_0"
    // InternalPerfectML.g:7588:1: rule__MLPClassifier__Hidden_layer_sizes_defAssignment_3_0 : ( ( 'hidden_layer_sizes' ) ) ;
    public final void rule__MLPClassifier__Hidden_layer_sizes_defAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7592:1: ( ( ( 'hidden_layer_sizes' ) ) )
            // InternalPerfectML.g:7593:2: ( ( 'hidden_layer_sizes' ) )
            {
            // InternalPerfectML.g:7593:2: ( ( 'hidden_layer_sizes' ) )
            // InternalPerfectML.g:7594:3: ( 'hidden_layer_sizes' )
            {
             before(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizes_defHidden_layer_sizesKeyword_3_0_0()); 
            // InternalPerfectML.g:7595:3: ( 'hidden_layer_sizes' )
            // InternalPerfectML.g:7596:4: 'hidden_layer_sizes'
            {
             before(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizes_defHidden_layer_sizesKeyword_3_0_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizes_defHidden_layer_sizesKeyword_3_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizes_defHidden_layer_sizesKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Hidden_layer_sizes_defAssignment_3_0"


    // $ANTLR start "rule__MLPClassifier__Hidden_layer_sizesAssignment_3_3"
    // InternalPerfectML.g:7607:1: rule__MLPClassifier__Hidden_layer_sizesAssignment_3_3 : ( RULE_INT ) ;
    public final void rule__MLPClassifier__Hidden_layer_sizesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7611:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:7612:2: ( RULE_INT )
            {
            // InternalPerfectML.g:7612:2: ( RULE_INT )
            // InternalPerfectML.g:7613:3: RULE_INT
            {
             before(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizesINTTerminalRuleCall_3_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizesINTTerminalRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Hidden_layer_sizesAssignment_3_3"


    // $ANTLR start "rule__MLPClassifier__Hidden_layer_sizesAssignment_3_4_1"
    // InternalPerfectML.g:7622:1: rule__MLPClassifier__Hidden_layer_sizesAssignment_3_4_1 : ( RULE_INT ) ;
    public final void rule__MLPClassifier__Hidden_layer_sizesAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7626:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:7627:2: ( RULE_INT )
            {
            // InternalPerfectML.g:7627:2: ( RULE_INT )
            // InternalPerfectML.g:7628:3: RULE_INT
            {
             before(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizesINTTerminalRuleCall_3_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getHidden_layer_sizesINTTerminalRuleCall_3_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Hidden_layer_sizesAssignment_3_4_1"


    // $ANTLR start "rule__MLPClassifier__Activation_defAssignment_4_0"
    // InternalPerfectML.g:7637:1: rule__MLPClassifier__Activation_defAssignment_4_0 : ( ( 'activation' ) ) ;
    public final void rule__MLPClassifier__Activation_defAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7641:1: ( ( ( 'activation' ) ) )
            // InternalPerfectML.g:7642:2: ( ( 'activation' ) )
            {
            // InternalPerfectML.g:7642:2: ( ( 'activation' ) )
            // InternalPerfectML.g:7643:3: ( 'activation' )
            {
             before(grammarAccess.getMLPClassifierAccess().getActivation_defActivationKeyword_4_0_0()); 
            // InternalPerfectML.g:7644:3: ( 'activation' )
            // InternalPerfectML.g:7645:4: 'activation'
            {
             before(grammarAccess.getMLPClassifierAccess().getActivation_defActivationKeyword_4_0_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getActivation_defActivationKeyword_4_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getActivation_defActivationKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Activation_defAssignment_4_0"


    // $ANTLR start "rule__MLPClassifier__ActivationAssignment_4_2"
    // InternalPerfectML.g:7656:1: rule__MLPClassifier__ActivationAssignment_4_2 : ( ( rule__MLPClassifier__ActivationAlternatives_4_2_0 ) ) ;
    public final void rule__MLPClassifier__ActivationAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7660:1: ( ( ( rule__MLPClassifier__ActivationAlternatives_4_2_0 ) ) )
            // InternalPerfectML.g:7661:2: ( ( rule__MLPClassifier__ActivationAlternatives_4_2_0 ) )
            {
            // InternalPerfectML.g:7661:2: ( ( rule__MLPClassifier__ActivationAlternatives_4_2_0 ) )
            // InternalPerfectML.g:7662:3: ( rule__MLPClassifier__ActivationAlternatives_4_2_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getActivationAlternatives_4_2_0()); 
            // InternalPerfectML.g:7663:3: ( rule__MLPClassifier__ActivationAlternatives_4_2_0 )
            // InternalPerfectML.g:7663:4: rule__MLPClassifier__ActivationAlternatives_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__ActivationAlternatives_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getActivationAlternatives_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__ActivationAssignment_4_2"


    // $ANTLR start "rule__MLPClassifier__Solver_defAssignment_5_0"
    // InternalPerfectML.g:7671:1: rule__MLPClassifier__Solver_defAssignment_5_0 : ( ( 'solver' ) ) ;
    public final void rule__MLPClassifier__Solver_defAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7675:1: ( ( ( 'solver' ) ) )
            // InternalPerfectML.g:7676:2: ( ( 'solver' ) )
            {
            // InternalPerfectML.g:7676:2: ( ( 'solver' ) )
            // InternalPerfectML.g:7677:3: ( 'solver' )
            {
             before(grammarAccess.getMLPClassifierAccess().getSolver_defSolverKeyword_5_0_0()); 
            // InternalPerfectML.g:7678:3: ( 'solver' )
            // InternalPerfectML.g:7679:4: 'solver'
            {
             before(grammarAccess.getMLPClassifierAccess().getSolver_defSolverKeyword_5_0_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getSolver_defSolverKeyword_5_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getSolver_defSolverKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Solver_defAssignment_5_0"


    // $ANTLR start "rule__MLPClassifier__SolverAssignment_5_2"
    // InternalPerfectML.g:7690:1: rule__MLPClassifier__SolverAssignment_5_2 : ( ( rule__MLPClassifier__SolverAlternatives_5_2_0 ) ) ;
    public final void rule__MLPClassifier__SolverAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7694:1: ( ( ( rule__MLPClassifier__SolverAlternatives_5_2_0 ) ) )
            // InternalPerfectML.g:7695:2: ( ( rule__MLPClassifier__SolverAlternatives_5_2_0 ) )
            {
            // InternalPerfectML.g:7695:2: ( ( rule__MLPClassifier__SolverAlternatives_5_2_0 ) )
            // InternalPerfectML.g:7696:3: ( rule__MLPClassifier__SolverAlternatives_5_2_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getSolverAlternatives_5_2_0()); 
            // InternalPerfectML.g:7697:3: ( rule__MLPClassifier__SolverAlternatives_5_2_0 )
            // InternalPerfectML.g:7697:4: rule__MLPClassifier__SolverAlternatives_5_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__SolverAlternatives_5_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getSolverAlternatives_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__SolverAssignment_5_2"


    // $ANTLR start "rule__MLPClassifier__Alpha_defAssignment_6_0"
    // InternalPerfectML.g:7705:1: rule__MLPClassifier__Alpha_defAssignment_6_0 : ( ( 'alpha' ) ) ;
    public final void rule__MLPClassifier__Alpha_defAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7709:1: ( ( ( 'alpha' ) ) )
            // InternalPerfectML.g:7710:2: ( ( 'alpha' ) )
            {
            // InternalPerfectML.g:7710:2: ( ( 'alpha' ) )
            // InternalPerfectML.g:7711:3: ( 'alpha' )
            {
             before(grammarAccess.getMLPClassifierAccess().getAlpha_defAlphaKeyword_6_0_0()); 
            // InternalPerfectML.g:7712:3: ( 'alpha' )
            // InternalPerfectML.g:7713:4: 'alpha'
            {
             before(grammarAccess.getMLPClassifierAccess().getAlpha_defAlphaKeyword_6_0_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getAlpha_defAlphaKeyword_6_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getAlpha_defAlphaKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Alpha_defAssignment_6_0"


    // $ANTLR start "rule__MLPClassifier__AlphaAssignment_6_2"
    // InternalPerfectML.g:7724:1: rule__MLPClassifier__AlphaAssignment_6_2 : ( ruleFLOAT ) ;
    public final void rule__MLPClassifier__AlphaAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7728:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:7729:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:7729:2: ( ruleFLOAT )
            // InternalPerfectML.g:7730:3: ruleFLOAT
            {
             before(grammarAccess.getMLPClassifierAccess().getAlphaFLOATParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getAlphaFLOATParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__AlphaAssignment_6_2"


    // $ANTLR start "rule__MLPClassifier__Batch_size_defAssignment_7_0"
    // InternalPerfectML.g:7739:1: rule__MLPClassifier__Batch_size_defAssignment_7_0 : ( ( 'batch_size' ) ) ;
    public final void rule__MLPClassifier__Batch_size_defAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7743:1: ( ( ( 'batch_size' ) ) )
            // InternalPerfectML.g:7744:2: ( ( 'batch_size' ) )
            {
            // InternalPerfectML.g:7744:2: ( ( 'batch_size' ) )
            // InternalPerfectML.g:7745:3: ( 'batch_size' )
            {
             before(grammarAccess.getMLPClassifierAccess().getBatch_size_defBatch_sizeKeyword_7_0_0()); 
            // InternalPerfectML.g:7746:3: ( 'batch_size' )
            // InternalPerfectML.g:7747:4: 'batch_size'
            {
             before(grammarAccess.getMLPClassifierAccess().getBatch_size_defBatch_sizeKeyword_7_0_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getBatch_size_defBatch_sizeKeyword_7_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getBatch_size_defBatch_sizeKeyword_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Batch_size_defAssignment_7_0"


    // $ANTLR start "rule__MLPClassifier__Batch_sizeAssignment_7_2"
    // InternalPerfectML.g:7758:1: rule__MLPClassifier__Batch_sizeAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__MLPClassifier__Batch_sizeAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7762:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:7763:2: ( RULE_INT )
            {
            // InternalPerfectML.g:7763:2: ( RULE_INT )
            // InternalPerfectML.g:7764:3: RULE_INT
            {
             before(grammarAccess.getMLPClassifierAccess().getBatch_sizeINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getBatch_sizeINTTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Batch_sizeAssignment_7_2"


    // $ANTLR start "rule__MLPClassifier__Learning_rate_defAssignment_8_0"
    // InternalPerfectML.g:7773:1: rule__MLPClassifier__Learning_rate_defAssignment_8_0 : ( ( 'learning_rate' ) ) ;
    public final void rule__MLPClassifier__Learning_rate_defAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7777:1: ( ( ( 'learning_rate' ) ) )
            // InternalPerfectML.g:7778:2: ( ( 'learning_rate' ) )
            {
            // InternalPerfectML.g:7778:2: ( ( 'learning_rate' ) )
            // InternalPerfectML.g:7779:3: ( 'learning_rate' )
            {
             before(grammarAccess.getMLPClassifierAccess().getLearning_rate_defLearning_rateKeyword_8_0_0()); 
            // InternalPerfectML.g:7780:3: ( 'learning_rate' )
            // InternalPerfectML.g:7781:4: 'learning_rate'
            {
             before(grammarAccess.getMLPClassifierAccess().getLearning_rate_defLearning_rateKeyword_8_0_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getLearning_rate_defLearning_rateKeyword_8_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getLearning_rate_defLearning_rateKeyword_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Learning_rate_defAssignment_8_0"


    // $ANTLR start "rule__MLPClassifier__Learning_rateAssignment_8_2"
    // InternalPerfectML.g:7792:1: rule__MLPClassifier__Learning_rateAssignment_8_2 : ( ( rule__MLPClassifier__Learning_rateAlternatives_8_2_0 ) ) ;
    public final void rule__MLPClassifier__Learning_rateAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7796:1: ( ( ( rule__MLPClassifier__Learning_rateAlternatives_8_2_0 ) ) )
            // InternalPerfectML.g:7797:2: ( ( rule__MLPClassifier__Learning_rateAlternatives_8_2_0 ) )
            {
            // InternalPerfectML.g:7797:2: ( ( rule__MLPClassifier__Learning_rateAlternatives_8_2_0 ) )
            // InternalPerfectML.g:7798:3: ( rule__MLPClassifier__Learning_rateAlternatives_8_2_0 )
            {
             before(grammarAccess.getMLPClassifierAccess().getLearning_rateAlternatives_8_2_0()); 
            // InternalPerfectML.g:7799:3: ( rule__MLPClassifier__Learning_rateAlternatives_8_2_0 )
            // InternalPerfectML.g:7799:4: rule__MLPClassifier__Learning_rateAlternatives_8_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MLPClassifier__Learning_rateAlternatives_8_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMLPClassifierAccess().getLearning_rateAlternatives_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Learning_rateAssignment_8_2"


    // $ANTLR start "rule__MLPClassifier__Learning_rate_init_defAssignment_9_0"
    // InternalPerfectML.g:7807:1: rule__MLPClassifier__Learning_rate_init_defAssignment_9_0 : ( ( 'learning_rate_init' ) ) ;
    public final void rule__MLPClassifier__Learning_rate_init_defAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7811:1: ( ( ( 'learning_rate_init' ) ) )
            // InternalPerfectML.g:7812:2: ( ( 'learning_rate_init' ) )
            {
            // InternalPerfectML.g:7812:2: ( ( 'learning_rate_init' ) )
            // InternalPerfectML.g:7813:3: ( 'learning_rate_init' )
            {
             before(grammarAccess.getMLPClassifierAccess().getLearning_rate_init_defLearning_rate_initKeyword_9_0_0()); 
            // InternalPerfectML.g:7814:3: ( 'learning_rate_init' )
            // InternalPerfectML.g:7815:4: 'learning_rate_init'
            {
             before(grammarAccess.getMLPClassifierAccess().getLearning_rate_init_defLearning_rate_initKeyword_9_0_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getLearning_rate_init_defLearning_rate_initKeyword_9_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getLearning_rate_init_defLearning_rate_initKeyword_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Learning_rate_init_defAssignment_9_0"


    // $ANTLR start "rule__MLPClassifier__Learning_rate_initAssignment_9_2"
    // InternalPerfectML.g:7826:1: rule__MLPClassifier__Learning_rate_initAssignment_9_2 : ( ruleFLOAT ) ;
    public final void rule__MLPClassifier__Learning_rate_initAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7830:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:7831:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:7831:2: ( ruleFLOAT )
            // InternalPerfectML.g:7832:3: ruleFLOAT
            {
             before(grammarAccess.getMLPClassifierAccess().getLearning_rate_initFLOATParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getLearning_rate_initFLOATParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Learning_rate_initAssignment_9_2"


    // $ANTLR start "rule__MLPClassifier__Power_t_defAssignment_10_0"
    // InternalPerfectML.g:7841:1: rule__MLPClassifier__Power_t_defAssignment_10_0 : ( ( 'power_t' ) ) ;
    public final void rule__MLPClassifier__Power_t_defAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7845:1: ( ( ( 'power_t' ) ) )
            // InternalPerfectML.g:7846:2: ( ( 'power_t' ) )
            {
            // InternalPerfectML.g:7846:2: ( ( 'power_t' ) )
            // InternalPerfectML.g:7847:3: ( 'power_t' )
            {
             before(grammarAccess.getMLPClassifierAccess().getPower_t_defPower_tKeyword_10_0_0()); 
            // InternalPerfectML.g:7848:3: ( 'power_t' )
            // InternalPerfectML.g:7849:4: 'power_t'
            {
             before(grammarAccess.getMLPClassifierAccess().getPower_t_defPower_tKeyword_10_0_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getPower_t_defPower_tKeyword_10_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getPower_t_defPower_tKeyword_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Power_t_defAssignment_10_0"


    // $ANTLR start "rule__MLPClassifier__Power_tAssignment_10_2"
    // InternalPerfectML.g:7860:1: rule__MLPClassifier__Power_tAssignment_10_2 : ( ruleFLOAT ) ;
    public final void rule__MLPClassifier__Power_tAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7864:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:7865:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:7865:2: ( ruleFLOAT )
            // InternalPerfectML.g:7866:3: ruleFLOAT
            {
             before(grammarAccess.getMLPClassifierAccess().getPower_tFLOATParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getPower_tFLOATParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Power_tAssignment_10_2"


    // $ANTLR start "rule__MLPClassifier__Max_iteer_defAssignment_11_0"
    // InternalPerfectML.g:7875:1: rule__MLPClassifier__Max_iteer_defAssignment_11_0 : ( ( 'max_iter' ) ) ;
    public final void rule__MLPClassifier__Max_iteer_defAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7879:1: ( ( ( 'max_iter' ) ) )
            // InternalPerfectML.g:7880:2: ( ( 'max_iter' ) )
            {
            // InternalPerfectML.g:7880:2: ( ( 'max_iter' ) )
            // InternalPerfectML.g:7881:3: ( 'max_iter' )
            {
             before(grammarAccess.getMLPClassifierAccess().getMax_iteer_defMax_iterKeyword_11_0_0()); 
            // InternalPerfectML.g:7882:3: ( 'max_iter' )
            // InternalPerfectML.g:7883:4: 'max_iter'
            {
             before(grammarAccess.getMLPClassifierAccess().getMax_iteer_defMax_iterKeyword_11_0_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getMax_iteer_defMax_iterKeyword_11_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getMax_iteer_defMax_iterKeyword_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Max_iteer_defAssignment_11_0"


    // $ANTLR start "rule__MLPClassifier__Max_iterAssignment_11_2"
    // InternalPerfectML.g:7894:1: rule__MLPClassifier__Max_iterAssignment_11_2 : ( ruleFLOAT ) ;
    public final void rule__MLPClassifier__Max_iterAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7898:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:7899:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:7899:2: ( ruleFLOAT )
            // InternalPerfectML.g:7900:3: ruleFLOAT
            {
             before(grammarAccess.getMLPClassifierAccess().getMax_iterFLOATParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getMax_iterFLOATParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Max_iterAssignment_11_2"


    // $ANTLR start "rule__MLPClassifier__Shuffle_defAssignment_12_0"
    // InternalPerfectML.g:7909:1: rule__MLPClassifier__Shuffle_defAssignment_12_0 : ( ( 'shuffle' ) ) ;
    public final void rule__MLPClassifier__Shuffle_defAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7913:1: ( ( ( 'shuffle' ) ) )
            // InternalPerfectML.g:7914:2: ( ( 'shuffle' ) )
            {
            // InternalPerfectML.g:7914:2: ( ( 'shuffle' ) )
            // InternalPerfectML.g:7915:3: ( 'shuffle' )
            {
             before(grammarAccess.getMLPClassifierAccess().getShuffle_defShuffleKeyword_12_0_0()); 
            // InternalPerfectML.g:7916:3: ( 'shuffle' )
            // InternalPerfectML.g:7917:4: 'shuffle'
            {
             before(grammarAccess.getMLPClassifierAccess().getShuffle_defShuffleKeyword_12_0_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getShuffle_defShuffleKeyword_12_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getShuffle_defShuffleKeyword_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Shuffle_defAssignment_12_0"


    // $ANTLR start "rule__MLPClassifier__ShuffleAssignment_12_2"
    // InternalPerfectML.g:7928:1: rule__MLPClassifier__ShuffleAssignment_12_2 : ( ruleBOOL ) ;
    public final void rule__MLPClassifier__ShuffleAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7932:1: ( ( ruleBOOL ) )
            // InternalPerfectML.g:7933:2: ( ruleBOOL )
            {
            // InternalPerfectML.g:7933:2: ( ruleBOOL )
            // InternalPerfectML.g:7934:3: ruleBOOL
            {
             before(grammarAccess.getMLPClassifierAccess().getShuffleBOOLParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getShuffleBOOLParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__ShuffleAssignment_12_2"


    // $ANTLR start "rule__MLPClassifier__Random_state_defAssignment_13_0"
    // InternalPerfectML.g:7943:1: rule__MLPClassifier__Random_state_defAssignment_13_0 : ( ( 'random_state' ) ) ;
    public final void rule__MLPClassifier__Random_state_defAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7947:1: ( ( ( 'random_state' ) ) )
            // InternalPerfectML.g:7948:2: ( ( 'random_state' ) )
            {
            // InternalPerfectML.g:7948:2: ( ( 'random_state' ) )
            // InternalPerfectML.g:7949:3: ( 'random_state' )
            {
             before(grammarAccess.getMLPClassifierAccess().getRandom_state_defRandom_stateKeyword_13_0_0()); 
            // InternalPerfectML.g:7950:3: ( 'random_state' )
            // InternalPerfectML.g:7951:4: 'random_state'
            {
             before(grammarAccess.getMLPClassifierAccess().getRandom_state_defRandom_stateKeyword_13_0_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getRandom_state_defRandom_stateKeyword_13_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getRandom_state_defRandom_stateKeyword_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Random_state_defAssignment_13_0"


    // $ANTLR start "rule__MLPClassifier__Random_stateAssignment_13_2"
    // InternalPerfectML.g:7962:1: rule__MLPClassifier__Random_stateAssignment_13_2 : ( RULE_INT ) ;
    public final void rule__MLPClassifier__Random_stateAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7966:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:7967:2: ( RULE_INT )
            {
            // InternalPerfectML.g:7967:2: ( RULE_INT )
            // InternalPerfectML.g:7968:3: RULE_INT
            {
             before(grammarAccess.getMLPClassifierAccess().getRandom_stateINTTerminalRuleCall_13_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getRandom_stateINTTerminalRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Random_stateAssignment_13_2"


    // $ANTLR start "rule__MLPClassifier__Tolerance_defAssignment_14_0"
    // InternalPerfectML.g:7977:1: rule__MLPClassifier__Tolerance_defAssignment_14_0 : ( ( 'tolerance' ) ) ;
    public final void rule__MLPClassifier__Tolerance_defAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:7981:1: ( ( ( 'tolerance' ) ) )
            // InternalPerfectML.g:7982:2: ( ( 'tolerance' ) )
            {
            // InternalPerfectML.g:7982:2: ( ( 'tolerance' ) )
            // InternalPerfectML.g:7983:3: ( 'tolerance' )
            {
             before(grammarAccess.getMLPClassifierAccess().getTolerance_defToleranceKeyword_14_0_0()); 
            // InternalPerfectML.g:7984:3: ( 'tolerance' )
            // InternalPerfectML.g:7985:4: 'tolerance'
            {
             before(grammarAccess.getMLPClassifierAccess().getTolerance_defToleranceKeyword_14_0_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getTolerance_defToleranceKeyword_14_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getTolerance_defToleranceKeyword_14_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Tolerance_defAssignment_14_0"


    // $ANTLR start "rule__MLPClassifier__ToleranceAssignment_14_2"
    // InternalPerfectML.g:7996:1: rule__MLPClassifier__ToleranceAssignment_14_2 : ( ruleFLOAT ) ;
    public final void rule__MLPClassifier__ToleranceAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8000:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:8001:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:8001:2: ( ruleFLOAT )
            // InternalPerfectML.g:8002:3: ruleFLOAT
            {
             before(grammarAccess.getMLPClassifierAccess().getToleranceFLOATParserRuleCall_14_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getToleranceFLOATParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__ToleranceAssignment_14_2"


    // $ANTLR start "rule__MLPClassifier__Verbose_defAssignment_15_0"
    // InternalPerfectML.g:8011:1: rule__MLPClassifier__Verbose_defAssignment_15_0 : ( ( 'verbose' ) ) ;
    public final void rule__MLPClassifier__Verbose_defAssignment_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8015:1: ( ( ( 'verbose' ) ) )
            // InternalPerfectML.g:8016:2: ( ( 'verbose' ) )
            {
            // InternalPerfectML.g:8016:2: ( ( 'verbose' ) )
            // InternalPerfectML.g:8017:3: ( 'verbose' )
            {
             before(grammarAccess.getMLPClassifierAccess().getVerbose_defVerboseKeyword_15_0_0()); 
            // InternalPerfectML.g:8018:3: ( 'verbose' )
            // InternalPerfectML.g:8019:4: 'verbose'
            {
             before(grammarAccess.getMLPClassifierAccess().getVerbose_defVerboseKeyword_15_0_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getVerbose_defVerboseKeyword_15_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getVerbose_defVerboseKeyword_15_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Verbose_defAssignment_15_0"


    // $ANTLR start "rule__MLPClassifier__VerboseAssignment_15_2"
    // InternalPerfectML.g:8030:1: rule__MLPClassifier__VerboseAssignment_15_2 : ( ruleBOOL ) ;
    public final void rule__MLPClassifier__VerboseAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8034:1: ( ( ruleBOOL ) )
            // InternalPerfectML.g:8035:2: ( ruleBOOL )
            {
            // InternalPerfectML.g:8035:2: ( ruleBOOL )
            // InternalPerfectML.g:8036:3: ruleBOOL
            {
             before(grammarAccess.getMLPClassifierAccess().getVerboseBOOLParserRuleCall_15_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getVerboseBOOLParserRuleCall_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__VerboseAssignment_15_2"


    // $ANTLR start "rule__MLPClassifier__Warm_start_defAssignment_16_0"
    // InternalPerfectML.g:8045:1: rule__MLPClassifier__Warm_start_defAssignment_16_0 : ( ( 'warm_start' ) ) ;
    public final void rule__MLPClassifier__Warm_start_defAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8049:1: ( ( ( 'warm_start' ) ) )
            // InternalPerfectML.g:8050:2: ( ( 'warm_start' ) )
            {
            // InternalPerfectML.g:8050:2: ( ( 'warm_start' ) )
            // InternalPerfectML.g:8051:3: ( 'warm_start' )
            {
             before(grammarAccess.getMLPClassifierAccess().getWarm_start_defWarm_startKeyword_16_0_0()); 
            // InternalPerfectML.g:8052:3: ( 'warm_start' )
            // InternalPerfectML.g:8053:4: 'warm_start'
            {
             before(grammarAccess.getMLPClassifierAccess().getWarm_start_defWarm_startKeyword_16_0_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getWarm_start_defWarm_startKeyword_16_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getWarm_start_defWarm_startKeyword_16_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Warm_start_defAssignment_16_0"


    // $ANTLR start "rule__MLPClassifier__Warm_startAssignment_16_2"
    // InternalPerfectML.g:8064:1: rule__MLPClassifier__Warm_startAssignment_16_2 : ( ruleBOOL ) ;
    public final void rule__MLPClassifier__Warm_startAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8068:1: ( ( ruleBOOL ) )
            // InternalPerfectML.g:8069:2: ( ruleBOOL )
            {
            // InternalPerfectML.g:8069:2: ( ruleBOOL )
            // InternalPerfectML.g:8070:3: ruleBOOL
            {
             before(grammarAccess.getMLPClassifierAccess().getWarm_startBOOLParserRuleCall_16_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getWarm_startBOOLParserRuleCall_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Warm_startAssignment_16_2"


    // $ANTLR start "rule__MLPClassifier__Momentum_defAssignment_17_0"
    // InternalPerfectML.g:8079:1: rule__MLPClassifier__Momentum_defAssignment_17_0 : ( ( 'momentum' ) ) ;
    public final void rule__MLPClassifier__Momentum_defAssignment_17_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8083:1: ( ( ( 'momentum' ) ) )
            // InternalPerfectML.g:8084:2: ( ( 'momentum' ) )
            {
            // InternalPerfectML.g:8084:2: ( ( 'momentum' ) )
            // InternalPerfectML.g:8085:3: ( 'momentum' )
            {
             before(grammarAccess.getMLPClassifierAccess().getMomentum_defMomentumKeyword_17_0_0()); 
            // InternalPerfectML.g:8086:3: ( 'momentum' )
            // InternalPerfectML.g:8087:4: 'momentum'
            {
             before(grammarAccess.getMLPClassifierAccess().getMomentum_defMomentumKeyword_17_0_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getMomentum_defMomentumKeyword_17_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getMomentum_defMomentumKeyword_17_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Momentum_defAssignment_17_0"


    // $ANTLR start "rule__MLPClassifier__MomentumAssignment_17_2"
    // InternalPerfectML.g:8098:1: rule__MLPClassifier__MomentumAssignment_17_2 : ( ruleFLOAT ) ;
    public final void rule__MLPClassifier__MomentumAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8102:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:8103:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:8103:2: ( ruleFLOAT )
            // InternalPerfectML.g:8104:3: ruleFLOAT
            {
             before(grammarAccess.getMLPClassifierAccess().getMomentumFLOATParserRuleCall_17_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getMomentumFLOATParserRuleCall_17_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__MomentumAssignment_17_2"


    // $ANTLR start "rule__MLPClassifier__Nesterovs_momentum_defAssignment_18_0"
    // InternalPerfectML.g:8113:1: rule__MLPClassifier__Nesterovs_momentum_defAssignment_18_0 : ( ( 'nesterovs_momentum' ) ) ;
    public final void rule__MLPClassifier__Nesterovs_momentum_defAssignment_18_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8117:1: ( ( ( 'nesterovs_momentum' ) ) )
            // InternalPerfectML.g:8118:2: ( ( 'nesterovs_momentum' ) )
            {
            // InternalPerfectML.g:8118:2: ( ( 'nesterovs_momentum' ) )
            // InternalPerfectML.g:8119:3: ( 'nesterovs_momentum' )
            {
             before(grammarAccess.getMLPClassifierAccess().getNesterovs_momentum_defNesterovs_momentumKeyword_18_0_0()); 
            // InternalPerfectML.g:8120:3: ( 'nesterovs_momentum' )
            // InternalPerfectML.g:8121:4: 'nesterovs_momentum'
            {
             before(grammarAccess.getMLPClassifierAccess().getNesterovs_momentum_defNesterovs_momentumKeyword_18_0_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getNesterovs_momentum_defNesterovs_momentumKeyword_18_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getNesterovs_momentum_defNesterovs_momentumKeyword_18_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Nesterovs_momentum_defAssignment_18_0"


    // $ANTLR start "rule__MLPClassifier__Nesterovs_momentumAssignment_18_2"
    // InternalPerfectML.g:8132:1: rule__MLPClassifier__Nesterovs_momentumAssignment_18_2 : ( ruleBOOL ) ;
    public final void rule__MLPClassifier__Nesterovs_momentumAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8136:1: ( ( ruleBOOL ) )
            // InternalPerfectML.g:8137:2: ( ruleBOOL )
            {
            // InternalPerfectML.g:8137:2: ( ruleBOOL )
            // InternalPerfectML.g:8138:3: ruleBOOL
            {
             before(grammarAccess.getMLPClassifierAccess().getNesterovs_momentumBOOLParserRuleCall_18_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getNesterovs_momentumBOOLParserRuleCall_18_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Nesterovs_momentumAssignment_18_2"


    // $ANTLR start "rule__MLPClassifier__Early_stopping_defAssignment_19_0"
    // InternalPerfectML.g:8147:1: rule__MLPClassifier__Early_stopping_defAssignment_19_0 : ( ( 'early_stopping' ) ) ;
    public final void rule__MLPClassifier__Early_stopping_defAssignment_19_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8151:1: ( ( ( 'early_stopping' ) ) )
            // InternalPerfectML.g:8152:2: ( ( 'early_stopping' ) )
            {
            // InternalPerfectML.g:8152:2: ( ( 'early_stopping' ) )
            // InternalPerfectML.g:8153:3: ( 'early_stopping' )
            {
             before(grammarAccess.getMLPClassifierAccess().getEarly_stopping_defEarly_stoppingKeyword_19_0_0()); 
            // InternalPerfectML.g:8154:3: ( 'early_stopping' )
            // InternalPerfectML.g:8155:4: 'early_stopping'
            {
             before(grammarAccess.getMLPClassifierAccess().getEarly_stopping_defEarly_stoppingKeyword_19_0_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEarly_stopping_defEarly_stoppingKeyword_19_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getEarly_stopping_defEarly_stoppingKeyword_19_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Early_stopping_defAssignment_19_0"


    // $ANTLR start "rule__MLPClassifier__Early_stoppingAssignment_19_2"
    // InternalPerfectML.g:8166:1: rule__MLPClassifier__Early_stoppingAssignment_19_2 : ( ruleBOOL ) ;
    public final void rule__MLPClassifier__Early_stoppingAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8170:1: ( ( ruleBOOL ) )
            // InternalPerfectML.g:8171:2: ( ruleBOOL )
            {
            // InternalPerfectML.g:8171:2: ( ruleBOOL )
            // InternalPerfectML.g:8172:3: ruleBOOL
            {
             before(grammarAccess.getMLPClassifierAccess().getEarly_stoppingBOOLParserRuleCall_19_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getEarly_stoppingBOOLParserRuleCall_19_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Early_stoppingAssignment_19_2"


    // $ANTLR start "rule__MLPClassifier__Validation_fraction_defAssignment_20_0"
    // InternalPerfectML.g:8181:1: rule__MLPClassifier__Validation_fraction_defAssignment_20_0 : ( ( 'validation_fraction' ) ) ;
    public final void rule__MLPClassifier__Validation_fraction_defAssignment_20_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8185:1: ( ( ( 'validation_fraction' ) ) )
            // InternalPerfectML.g:8186:2: ( ( 'validation_fraction' ) )
            {
            // InternalPerfectML.g:8186:2: ( ( 'validation_fraction' ) )
            // InternalPerfectML.g:8187:3: ( 'validation_fraction' )
            {
             before(grammarAccess.getMLPClassifierAccess().getValidation_fraction_defValidation_fractionKeyword_20_0_0()); 
            // InternalPerfectML.g:8188:3: ( 'validation_fraction' )
            // InternalPerfectML.g:8189:4: 'validation_fraction'
            {
             before(grammarAccess.getMLPClassifierAccess().getValidation_fraction_defValidation_fractionKeyword_20_0_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getValidation_fraction_defValidation_fractionKeyword_20_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getValidation_fraction_defValidation_fractionKeyword_20_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Validation_fraction_defAssignment_20_0"


    // $ANTLR start "rule__MLPClassifier__Validation_fractionAssignment_20_2"
    // InternalPerfectML.g:8200:1: rule__MLPClassifier__Validation_fractionAssignment_20_2 : ( ruleFLOAT ) ;
    public final void rule__MLPClassifier__Validation_fractionAssignment_20_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8204:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:8205:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:8205:2: ( ruleFLOAT )
            // InternalPerfectML.g:8206:3: ruleFLOAT
            {
             before(grammarAccess.getMLPClassifierAccess().getValidation_fractionFLOATParserRuleCall_20_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getValidation_fractionFLOATParserRuleCall_20_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Validation_fractionAssignment_20_2"


    // $ANTLR start "rule__MLPClassifier__Beta_1_defAssignment_21_0"
    // InternalPerfectML.g:8215:1: rule__MLPClassifier__Beta_1_defAssignment_21_0 : ( ( 'beta_1' ) ) ;
    public final void rule__MLPClassifier__Beta_1_defAssignment_21_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8219:1: ( ( ( 'beta_1' ) ) )
            // InternalPerfectML.g:8220:2: ( ( 'beta_1' ) )
            {
            // InternalPerfectML.g:8220:2: ( ( 'beta_1' ) )
            // InternalPerfectML.g:8221:3: ( 'beta_1' )
            {
             before(grammarAccess.getMLPClassifierAccess().getBeta_1_defBeta_1Keyword_21_0_0()); 
            // InternalPerfectML.g:8222:3: ( 'beta_1' )
            // InternalPerfectML.g:8223:4: 'beta_1'
            {
             before(grammarAccess.getMLPClassifierAccess().getBeta_1_defBeta_1Keyword_21_0_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getBeta_1_defBeta_1Keyword_21_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getBeta_1_defBeta_1Keyword_21_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Beta_1_defAssignment_21_0"


    // $ANTLR start "rule__MLPClassifier__Beta_1Assignment_21_2"
    // InternalPerfectML.g:8234:1: rule__MLPClassifier__Beta_1Assignment_21_2 : ( ruleFLOAT ) ;
    public final void rule__MLPClassifier__Beta_1Assignment_21_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8238:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:8239:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:8239:2: ( ruleFLOAT )
            // InternalPerfectML.g:8240:3: ruleFLOAT
            {
             before(grammarAccess.getMLPClassifierAccess().getBeta_1FLOATParserRuleCall_21_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getBeta_1FLOATParserRuleCall_21_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Beta_1Assignment_21_2"


    // $ANTLR start "rule__MLPClassifier__Beta_2_defAssignment_22_0"
    // InternalPerfectML.g:8249:1: rule__MLPClassifier__Beta_2_defAssignment_22_0 : ( ( 'beta_2' ) ) ;
    public final void rule__MLPClassifier__Beta_2_defAssignment_22_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8253:1: ( ( ( 'beta_2' ) ) )
            // InternalPerfectML.g:8254:2: ( ( 'beta_2' ) )
            {
            // InternalPerfectML.g:8254:2: ( ( 'beta_2' ) )
            // InternalPerfectML.g:8255:3: ( 'beta_2' )
            {
             before(grammarAccess.getMLPClassifierAccess().getBeta_2_defBeta_2Keyword_22_0_0()); 
            // InternalPerfectML.g:8256:3: ( 'beta_2' )
            // InternalPerfectML.g:8257:4: 'beta_2'
            {
             before(grammarAccess.getMLPClassifierAccess().getBeta_2_defBeta_2Keyword_22_0_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getBeta_2_defBeta_2Keyword_22_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getBeta_2_defBeta_2Keyword_22_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Beta_2_defAssignment_22_0"


    // $ANTLR start "rule__MLPClassifier__Beta_2Assignment_22_2"
    // InternalPerfectML.g:8268:1: rule__MLPClassifier__Beta_2Assignment_22_2 : ( ruleFLOAT ) ;
    public final void rule__MLPClassifier__Beta_2Assignment_22_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8272:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:8273:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:8273:2: ( ruleFLOAT )
            // InternalPerfectML.g:8274:3: ruleFLOAT
            {
             before(grammarAccess.getMLPClassifierAccess().getBeta_2FLOATParserRuleCall_22_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getBeta_2FLOATParserRuleCall_22_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Beta_2Assignment_22_2"


    // $ANTLR start "rule__MLPClassifier__Epsilon_defAssignment_23_0"
    // InternalPerfectML.g:8283:1: rule__MLPClassifier__Epsilon_defAssignment_23_0 : ( ( 'epsilon' ) ) ;
    public final void rule__MLPClassifier__Epsilon_defAssignment_23_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8287:1: ( ( ( 'epsilon' ) ) )
            // InternalPerfectML.g:8288:2: ( ( 'epsilon' ) )
            {
            // InternalPerfectML.g:8288:2: ( ( 'epsilon' ) )
            // InternalPerfectML.g:8289:3: ( 'epsilon' )
            {
             before(grammarAccess.getMLPClassifierAccess().getEpsilon_defEpsilonKeyword_23_0_0()); 
            // InternalPerfectML.g:8290:3: ( 'epsilon' )
            // InternalPerfectML.g:8291:4: 'epsilon'
            {
             before(grammarAccess.getMLPClassifierAccess().getEpsilon_defEpsilonKeyword_23_0_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getEpsilon_defEpsilonKeyword_23_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getEpsilon_defEpsilonKeyword_23_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Epsilon_defAssignment_23_0"


    // $ANTLR start "rule__MLPClassifier__EpsilonAssignment_23_2"
    // InternalPerfectML.g:8302:1: rule__MLPClassifier__EpsilonAssignment_23_2 : ( ruleFLOAT ) ;
    public final void rule__MLPClassifier__EpsilonAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8306:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:8307:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:8307:2: ( ruleFLOAT )
            // InternalPerfectML.g:8308:3: ruleFLOAT
            {
             before(grammarAccess.getMLPClassifierAccess().getEpsilonFLOATParserRuleCall_23_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMLPClassifierAccess().getEpsilonFLOATParserRuleCall_23_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__EpsilonAssignment_23_2"


    // $ANTLR start "rule__MLPClassifier__N_iter_no_change_defAssignment_24_0"
    // InternalPerfectML.g:8317:1: rule__MLPClassifier__N_iter_no_change_defAssignment_24_0 : ( ( 'n_iter_no_change' ) ) ;
    public final void rule__MLPClassifier__N_iter_no_change_defAssignment_24_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8321:1: ( ( ( 'n_iter_no_change' ) ) )
            // InternalPerfectML.g:8322:2: ( ( 'n_iter_no_change' ) )
            {
            // InternalPerfectML.g:8322:2: ( ( 'n_iter_no_change' ) )
            // InternalPerfectML.g:8323:3: ( 'n_iter_no_change' )
            {
             before(grammarAccess.getMLPClassifierAccess().getN_iter_no_change_defN_iter_no_changeKeyword_24_0_0()); 
            // InternalPerfectML.g:8324:3: ( 'n_iter_no_change' )
            // InternalPerfectML.g:8325:4: 'n_iter_no_change'
            {
             before(grammarAccess.getMLPClassifierAccess().getN_iter_no_change_defN_iter_no_changeKeyword_24_0_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getN_iter_no_change_defN_iter_no_changeKeyword_24_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getN_iter_no_change_defN_iter_no_changeKeyword_24_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__N_iter_no_change_defAssignment_24_0"


    // $ANTLR start "rule__MLPClassifier__N_iter_no_changeAssignment_24_2"
    // InternalPerfectML.g:8336:1: rule__MLPClassifier__N_iter_no_changeAssignment_24_2 : ( RULE_INT ) ;
    public final void rule__MLPClassifier__N_iter_no_changeAssignment_24_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8340:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:8341:2: ( RULE_INT )
            {
            // InternalPerfectML.g:8341:2: ( RULE_INT )
            // InternalPerfectML.g:8342:3: RULE_INT
            {
             before(grammarAccess.getMLPClassifierAccess().getN_iter_no_changeINTTerminalRuleCall_24_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getN_iter_no_changeINTTerminalRuleCall_24_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__N_iter_no_changeAssignment_24_2"


    // $ANTLR start "rule__MLPClassifier__Max_fun_defAssignment_25_0"
    // InternalPerfectML.g:8351:1: rule__MLPClassifier__Max_fun_defAssignment_25_0 : ( ( 'max_fun' ) ) ;
    public final void rule__MLPClassifier__Max_fun_defAssignment_25_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8355:1: ( ( ( 'max_fun' ) ) )
            // InternalPerfectML.g:8356:2: ( ( 'max_fun' ) )
            {
            // InternalPerfectML.g:8356:2: ( ( 'max_fun' ) )
            // InternalPerfectML.g:8357:3: ( 'max_fun' )
            {
             before(grammarAccess.getMLPClassifierAccess().getMax_fun_defMax_funKeyword_25_0_0()); 
            // InternalPerfectML.g:8358:3: ( 'max_fun' )
            // InternalPerfectML.g:8359:4: 'max_fun'
            {
             before(grammarAccess.getMLPClassifierAccess().getMax_fun_defMax_funKeyword_25_0_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getMax_fun_defMax_funKeyword_25_0_0()); 

            }

             after(grammarAccess.getMLPClassifierAccess().getMax_fun_defMax_funKeyword_25_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Max_fun_defAssignment_25_0"


    // $ANTLR start "rule__MLPClassifier__Max_funAssignment_25_2"
    // InternalPerfectML.g:8370:1: rule__MLPClassifier__Max_funAssignment_25_2 : ( RULE_INT ) ;
    public final void rule__MLPClassifier__Max_funAssignment_25_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8374:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:8375:2: ( RULE_INT )
            {
            // InternalPerfectML.g:8375:2: ( RULE_INT )
            // InternalPerfectML.g:8376:3: RULE_INT
            {
             before(grammarAccess.getMLPClassifierAccess().getMax_funINTTerminalRuleCall_25_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMLPClassifierAccess().getMax_funINTTerminalRuleCall_25_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLPClassifier__Max_funAssignment_25_2"


    // $ANTLR start "rule__SVC__C_defAssignment_3_0"
    // InternalPerfectML.g:8385:1: rule__SVC__C_defAssignment_3_0 : ( ( 'C' ) ) ;
    public final void rule__SVC__C_defAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8389:1: ( ( ( 'C' ) ) )
            // InternalPerfectML.g:8390:2: ( ( 'C' ) )
            {
            // InternalPerfectML.g:8390:2: ( ( 'C' ) )
            // InternalPerfectML.g:8391:3: ( 'C' )
            {
             before(grammarAccess.getSVCAccess().getC_defCKeyword_3_0_0()); 
            // InternalPerfectML.g:8392:3: ( 'C' )
            // InternalPerfectML.g:8393:4: 'C'
            {
             before(grammarAccess.getSVCAccess().getC_defCKeyword_3_0_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getC_defCKeyword_3_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getC_defCKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__C_defAssignment_3_0"


    // $ANTLR start "rule__SVC__CAssignment_3_2"
    // InternalPerfectML.g:8404:1: rule__SVC__CAssignment_3_2 : ( ruleFLOAT ) ;
    public final void rule__SVC__CAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8408:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:8409:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:8409:2: ( ruleFLOAT )
            // InternalPerfectML.g:8410:3: ruleFLOAT
            {
             before(grammarAccess.getSVCAccess().getCFLOATParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSVCAccess().getCFLOATParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__CAssignment_3_2"


    // $ANTLR start "rule__SVC__Kernel_defAssignment_4_0"
    // InternalPerfectML.g:8419:1: rule__SVC__Kernel_defAssignment_4_0 : ( ( 'kernel' ) ) ;
    public final void rule__SVC__Kernel_defAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8423:1: ( ( ( 'kernel' ) ) )
            // InternalPerfectML.g:8424:2: ( ( 'kernel' ) )
            {
            // InternalPerfectML.g:8424:2: ( ( 'kernel' ) )
            // InternalPerfectML.g:8425:3: ( 'kernel' )
            {
             before(grammarAccess.getSVCAccess().getKernel_defKernelKeyword_4_0_0()); 
            // InternalPerfectML.g:8426:3: ( 'kernel' )
            // InternalPerfectML.g:8427:4: 'kernel'
            {
             before(grammarAccess.getSVCAccess().getKernel_defKernelKeyword_4_0_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getKernel_defKernelKeyword_4_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getKernel_defKernelKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Kernel_defAssignment_4_0"


    // $ANTLR start "rule__SVC__KernelAssignment_4_2"
    // InternalPerfectML.g:8438:1: rule__SVC__KernelAssignment_4_2 : ( ( rule__SVC__KernelAlternatives_4_2_0 ) ) ;
    public final void rule__SVC__KernelAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8442:1: ( ( ( rule__SVC__KernelAlternatives_4_2_0 ) ) )
            // InternalPerfectML.g:8443:2: ( ( rule__SVC__KernelAlternatives_4_2_0 ) )
            {
            // InternalPerfectML.g:8443:2: ( ( rule__SVC__KernelAlternatives_4_2_0 ) )
            // InternalPerfectML.g:8444:3: ( rule__SVC__KernelAlternatives_4_2_0 )
            {
             before(grammarAccess.getSVCAccess().getKernelAlternatives_4_2_0()); 
            // InternalPerfectML.g:8445:3: ( rule__SVC__KernelAlternatives_4_2_0 )
            // InternalPerfectML.g:8445:4: rule__SVC__KernelAlternatives_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__KernelAlternatives_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getKernelAlternatives_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__KernelAssignment_4_2"


    // $ANTLR start "rule__SVC__Degree_defAssignment_5_0"
    // InternalPerfectML.g:8453:1: rule__SVC__Degree_defAssignment_5_0 : ( ( 'degree' ) ) ;
    public final void rule__SVC__Degree_defAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8457:1: ( ( ( 'degree' ) ) )
            // InternalPerfectML.g:8458:2: ( ( 'degree' ) )
            {
            // InternalPerfectML.g:8458:2: ( ( 'degree' ) )
            // InternalPerfectML.g:8459:3: ( 'degree' )
            {
             before(grammarAccess.getSVCAccess().getDegree_defDegreeKeyword_5_0_0()); 
            // InternalPerfectML.g:8460:3: ( 'degree' )
            // InternalPerfectML.g:8461:4: 'degree'
            {
             before(grammarAccess.getSVCAccess().getDegree_defDegreeKeyword_5_0_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getDegree_defDegreeKeyword_5_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getDegree_defDegreeKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Degree_defAssignment_5_0"


    // $ANTLR start "rule__SVC__DegreeAssignment_5_2"
    // InternalPerfectML.g:8472:1: rule__SVC__DegreeAssignment_5_2 : ( RULE_INT ) ;
    public final void rule__SVC__DegreeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8476:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:8477:2: ( RULE_INT )
            {
            // InternalPerfectML.g:8477:2: ( RULE_INT )
            // InternalPerfectML.g:8478:3: RULE_INT
            {
             before(grammarAccess.getSVCAccess().getDegreeINTTerminalRuleCall_5_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getDegreeINTTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__DegreeAssignment_5_2"


    // $ANTLR start "rule__SVC__Gamma_defAssignment_6_0"
    // InternalPerfectML.g:8487:1: rule__SVC__Gamma_defAssignment_6_0 : ( ( 'gamma' ) ) ;
    public final void rule__SVC__Gamma_defAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8491:1: ( ( ( 'gamma' ) ) )
            // InternalPerfectML.g:8492:2: ( ( 'gamma' ) )
            {
            // InternalPerfectML.g:8492:2: ( ( 'gamma' ) )
            // InternalPerfectML.g:8493:3: ( 'gamma' )
            {
             before(grammarAccess.getSVCAccess().getGamma_defGammaKeyword_6_0_0()); 
            // InternalPerfectML.g:8494:3: ( 'gamma' )
            // InternalPerfectML.g:8495:4: 'gamma'
            {
             before(grammarAccess.getSVCAccess().getGamma_defGammaKeyword_6_0_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getGamma_defGammaKeyword_6_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getGamma_defGammaKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Gamma_defAssignment_6_0"


    // $ANTLR start "rule__SVC__GammaAssignment_6_2"
    // InternalPerfectML.g:8506:1: rule__SVC__GammaAssignment_6_2 : ( ( rule__SVC__GammaAlternatives_6_2_0 ) ) ;
    public final void rule__SVC__GammaAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8510:1: ( ( ( rule__SVC__GammaAlternatives_6_2_0 ) ) )
            // InternalPerfectML.g:8511:2: ( ( rule__SVC__GammaAlternatives_6_2_0 ) )
            {
            // InternalPerfectML.g:8511:2: ( ( rule__SVC__GammaAlternatives_6_2_0 ) )
            // InternalPerfectML.g:8512:3: ( rule__SVC__GammaAlternatives_6_2_0 )
            {
             before(grammarAccess.getSVCAccess().getGammaAlternatives_6_2_0()); 
            // InternalPerfectML.g:8513:3: ( rule__SVC__GammaAlternatives_6_2_0 )
            // InternalPerfectML.g:8513:4: rule__SVC__GammaAlternatives_6_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__GammaAlternatives_6_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getGammaAlternatives_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__GammaAssignment_6_2"


    // $ANTLR start "rule__SVC__Coef0_defAssignment_7_0"
    // InternalPerfectML.g:8521:1: rule__SVC__Coef0_defAssignment_7_0 : ( ( 'coef0' ) ) ;
    public final void rule__SVC__Coef0_defAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8525:1: ( ( ( 'coef0' ) ) )
            // InternalPerfectML.g:8526:2: ( ( 'coef0' ) )
            {
            // InternalPerfectML.g:8526:2: ( ( 'coef0' ) )
            // InternalPerfectML.g:8527:3: ( 'coef0' )
            {
             before(grammarAccess.getSVCAccess().getCoef0_defCoef0Keyword_7_0_0()); 
            // InternalPerfectML.g:8528:3: ( 'coef0' )
            // InternalPerfectML.g:8529:4: 'coef0'
            {
             before(grammarAccess.getSVCAccess().getCoef0_defCoef0Keyword_7_0_0()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getCoef0_defCoef0Keyword_7_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getCoef0_defCoef0Keyword_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Coef0_defAssignment_7_0"


    // $ANTLR start "rule__SVC__Coef0Assignment_7_2"
    // InternalPerfectML.g:8540:1: rule__SVC__Coef0Assignment_7_2 : ( ruleFLOAT ) ;
    public final void rule__SVC__Coef0Assignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8544:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:8545:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:8545:2: ( ruleFLOAT )
            // InternalPerfectML.g:8546:3: ruleFLOAT
            {
             before(grammarAccess.getSVCAccess().getCoef0FLOATParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSVCAccess().getCoef0FLOATParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Coef0Assignment_7_2"


    // $ANTLR start "rule__SVC__Shrinking_defAssignment_8_0"
    // InternalPerfectML.g:8555:1: rule__SVC__Shrinking_defAssignment_8_0 : ( ( 'shrinking' ) ) ;
    public final void rule__SVC__Shrinking_defAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8559:1: ( ( ( 'shrinking' ) ) )
            // InternalPerfectML.g:8560:2: ( ( 'shrinking' ) )
            {
            // InternalPerfectML.g:8560:2: ( ( 'shrinking' ) )
            // InternalPerfectML.g:8561:3: ( 'shrinking' )
            {
             before(grammarAccess.getSVCAccess().getShrinking_defShrinkingKeyword_8_0_0()); 
            // InternalPerfectML.g:8562:3: ( 'shrinking' )
            // InternalPerfectML.g:8563:4: 'shrinking'
            {
             before(grammarAccess.getSVCAccess().getShrinking_defShrinkingKeyword_8_0_0()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getShrinking_defShrinkingKeyword_8_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getShrinking_defShrinkingKeyword_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Shrinking_defAssignment_8_0"


    // $ANTLR start "rule__SVC__ShrinkingAssignment_8_2"
    // InternalPerfectML.g:8574:1: rule__SVC__ShrinkingAssignment_8_2 : ( ruleBOOL ) ;
    public final void rule__SVC__ShrinkingAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8578:1: ( ( ruleBOOL ) )
            // InternalPerfectML.g:8579:2: ( ruleBOOL )
            {
            // InternalPerfectML.g:8579:2: ( ruleBOOL )
            // InternalPerfectML.g:8580:3: ruleBOOL
            {
             before(grammarAccess.getSVCAccess().getShrinkingBOOLParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getSVCAccess().getShrinkingBOOLParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__ShrinkingAssignment_8_2"


    // $ANTLR start "rule__SVC__Probability_defAssignment_9_0"
    // InternalPerfectML.g:8589:1: rule__SVC__Probability_defAssignment_9_0 : ( ( 'probability' ) ) ;
    public final void rule__SVC__Probability_defAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8593:1: ( ( ( 'probability' ) ) )
            // InternalPerfectML.g:8594:2: ( ( 'probability' ) )
            {
            // InternalPerfectML.g:8594:2: ( ( 'probability' ) )
            // InternalPerfectML.g:8595:3: ( 'probability' )
            {
             before(grammarAccess.getSVCAccess().getProbability_defProbabilityKeyword_9_0_0()); 
            // InternalPerfectML.g:8596:3: ( 'probability' )
            // InternalPerfectML.g:8597:4: 'probability'
            {
             before(grammarAccess.getSVCAccess().getProbability_defProbabilityKeyword_9_0_0()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getProbability_defProbabilityKeyword_9_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getProbability_defProbabilityKeyword_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Probability_defAssignment_9_0"


    // $ANTLR start "rule__SVC__ProbabilityAssignment_9_2"
    // InternalPerfectML.g:8608:1: rule__SVC__ProbabilityAssignment_9_2 : ( ruleBOOL ) ;
    public final void rule__SVC__ProbabilityAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8612:1: ( ( ruleBOOL ) )
            // InternalPerfectML.g:8613:2: ( ruleBOOL )
            {
            // InternalPerfectML.g:8613:2: ( ruleBOOL )
            // InternalPerfectML.g:8614:3: ruleBOOL
            {
             before(grammarAccess.getSVCAccess().getProbabilityBOOLParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getSVCAccess().getProbabilityBOOLParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__ProbabilityAssignment_9_2"


    // $ANTLR start "rule__SVC__Tol_defAssignment_10_0"
    // InternalPerfectML.g:8623:1: rule__SVC__Tol_defAssignment_10_0 : ( ( 'tolerance' ) ) ;
    public final void rule__SVC__Tol_defAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8627:1: ( ( ( 'tolerance' ) ) )
            // InternalPerfectML.g:8628:2: ( ( 'tolerance' ) )
            {
            // InternalPerfectML.g:8628:2: ( ( 'tolerance' ) )
            // InternalPerfectML.g:8629:3: ( 'tolerance' )
            {
             before(grammarAccess.getSVCAccess().getTol_defToleranceKeyword_10_0_0()); 
            // InternalPerfectML.g:8630:3: ( 'tolerance' )
            // InternalPerfectML.g:8631:4: 'tolerance'
            {
             before(grammarAccess.getSVCAccess().getTol_defToleranceKeyword_10_0_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getTol_defToleranceKeyword_10_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getTol_defToleranceKeyword_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Tol_defAssignment_10_0"


    // $ANTLR start "rule__SVC__TolAssignment_10_2"
    // InternalPerfectML.g:8642:1: rule__SVC__TolAssignment_10_2 : ( ruleFLOAT ) ;
    public final void rule__SVC__TolAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8646:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:8647:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:8647:2: ( ruleFLOAT )
            // InternalPerfectML.g:8648:3: ruleFLOAT
            {
             before(grammarAccess.getSVCAccess().getTolFLOATParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSVCAccess().getTolFLOATParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__TolAssignment_10_2"


    // $ANTLR start "rule__SVC__Cache_size_defAssignment_11_0"
    // InternalPerfectML.g:8657:1: rule__SVC__Cache_size_defAssignment_11_0 : ( ( 'cache_size' ) ) ;
    public final void rule__SVC__Cache_size_defAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8661:1: ( ( ( 'cache_size' ) ) )
            // InternalPerfectML.g:8662:2: ( ( 'cache_size' ) )
            {
            // InternalPerfectML.g:8662:2: ( ( 'cache_size' ) )
            // InternalPerfectML.g:8663:3: ( 'cache_size' )
            {
             before(grammarAccess.getSVCAccess().getCache_size_defCache_sizeKeyword_11_0_0()); 
            // InternalPerfectML.g:8664:3: ( 'cache_size' )
            // InternalPerfectML.g:8665:4: 'cache_size'
            {
             before(grammarAccess.getSVCAccess().getCache_size_defCache_sizeKeyword_11_0_0()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getCache_size_defCache_sizeKeyword_11_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getCache_size_defCache_sizeKeyword_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Cache_size_defAssignment_11_0"


    // $ANTLR start "rule__SVC__Cache_sizeAssignment_11_2"
    // InternalPerfectML.g:8676:1: rule__SVC__Cache_sizeAssignment_11_2 : ( ruleFLOAT ) ;
    public final void rule__SVC__Cache_sizeAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8680:1: ( ( ruleFLOAT ) )
            // InternalPerfectML.g:8681:2: ( ruleFLOAT )
            {
            // InternalPerfectML.g:8681:2: ( ruleFLOAT )
            // InternalPerfectML.g:8682:3: ruleFLOAT
            {
             before(grammarAccess.getSVCAccess().getCache_sizeFLOATParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSVCAccess().getCache_sizeFLOATParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Cache_sizeAssignment_11_2"


    // $ANTLR start "rule__SVC__Verbose_defAssignment_12_0"
    // InternalPerfectML.g:8691:1: rule__SVC__Verbose_defAssignment_12_0 : ( ( 'verbose' ) ) ;
    public final void rule__SVC__Verbose_defAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8695:1: ( ( ( 'verbose' ) ) )
            // InternalPerfectML.g:8696:2: ( ( 'verbose' ) )
            {
            // InternalPerfectML.g:8696:2: ( ( 'verbose' ) )
            // InternalPerfectML.g:8697:3: ( 'verbose' )
            {
             before(grammarAccess.getSVCAccess().getVerbose_defVerboseKeyword_12_0_0()); 
            // InternalPerfectML.g:8698:3: ( 'verbose' )
            // InternalPerfectML.g:8699:4: 'verbose'
            {
             before(grammarAccess.getSVCAccess().getVerbose_defVerboseKeyword_12_0_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getVerbose_defVerboseKeyword_12_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getVerbose_defVerboseKeyword_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Verbose_defAssignment_12_0"


    // $ANTLR start "rule__SVC__VerboseAssignment_12_2"
    // InternalPerfectML.g:8710:1: rule__SVC__VerboseAssignment_12_2 : ( ruleBOOL ) ;
    public final void rule__SVC__VerboseAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8714:1: ( ( ruleBOOL ) )
            // InternalPerfectML.g:8715:2: ( ruleBOOL )
            {
            // InternalPerfectML.g:8715:2: ( ruleBOOL )
            // InternalPerfectML.g:8716:3: ruleBOOL
            {
             before(grammarAccess.getSVCAccess().getVerboseBOOLParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getSVCAccess().getVerboseBOOLParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__VerboseAssignment_12_2"


    // $ANTLR start "rule__SVC__Max_iter_defAssignment_13_0"
    // InternalPerfectML.g:8725:1: rule__SVC__Max_iter_defAssignment_13_0 : ( ( 'max_iter' ) ) ;
    public final void rule__SVC__Max_iter_defAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8729:1: ( ( ( 'max_iter' ) ) )
            // InternalPerfectML.g:8730:2: ( ( 'max_iter' ) )
            {
            // InternalPerfectML.g:8730:2: ( ( 'max_iter' ) )
            // InternalPerfectML.g:8731:3: ( 'max_iter' )
            {
             before(grammarAccess.getSVCAccess().getMax_iter_defMax_iterKeyword_13_0_0()); 
            // InternalPerfectML.g:8732:3: ( 'max_iter' )
            // InternalPerfectML.g:8733:4: 'max_iter'
            {
             before(grammarAccess.getSVCAccess().getMax_iter_defMax_iterKeyword_13_0_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getMax_iter_defMax_iterKeyword_13_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getMax_iter_defMax_iterKeyword_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Max_iter_defAssignment_13_0"


    // $ANTLR start "rule__SVC__Max_iterAssignment_13_2"
    // InternalPerfectML.g:8744:1: rule__SVC__Max_iterAssignment_13_2 : ( RULE_INT ) ;
    public final void rule__SVC__Max_iterAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8748:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:8749:2: ( RULE_INT )
            {
            // InternalPerfectML.g:8749:2: ( RULE_INT )
            // InternalPerfectML.g:8750:3: RULE_INT
            {
             before(grammarAccess.getSVCAccess().getMax_iterINTTerminalRuleCall_13_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getMax_iterINTTerminalRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Max_iterAssignment_13_2"


    // $ANTLR start "rule__SVC__Decision_function_shape_defAssignment_14_0"
    // InternalPerfectML.g:8759:1: rule__SVC__Decision_function_shape_defAssignment_14_0 : ( ( 'decision_function_shape' ) ) ;
    public final void rule__SVC__Decision_function_shape_defAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8763:1: ( ( ( 'decision_function_shape' ) ) )
            // InternalPerfectML.g:8764:2: ( ( 'decision_function_shape' ) )
            {
            // InternalPerfectML.g:8764:2: ( ( 'decision_function_shape' ) )
            // InternalPerfectML.g:8765:3: ( 'decision_function_shape' )
            {
             before(grammarAccess.getSVCAccess().getDecision_function_shape_defDecision_function_shapeKeyword_14_0_0()); 
            // InternalPerfectML.g:8766:3: ( 'decision_function_shape' )
            // InternalPerfectML.g:8767:4: 'decision_function_shape'
            {
             before(grammarAccess.getSVCAccess().getDecision_function_shape_defDecision_function_shapeKeyword_14_0_0()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getDecision_function_shape_defDecision_function_shapeKeyword_14_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getDecision_function_shape_defDecision_function_shapeKeyword_14_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Decision_function_shape_defAssignment_14_0"


    // $ANTLR start "rule__SVC__Decision_function_shapeAssignment_14_2"
    // InternalPerfectML.g:8778:1: rule__SVC__Decision_function_shapeAssignment_14_2 : ( ( rule__SVC__Decision_function_shapeAlternatives_14_2_0 ) ) ;
    public final void rule__SVC__Decision_function_shapeAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8782:1: ( ( ( rule__SVC__Decision_function_shapeAlternatives_14_2_0 ) ) )
            // InternalPerfectML.g:8783:2: ( ( rule__SVC__Decision_function_shapeAlternatives_14_2_0 ) )
            {
            // InternalPerfectML.g:8783:2: ( ( rule__SVC__Decision_function_shapeAlternatives_14_2_0 ) )
            // InternalPerfectML.g:8784:3: ( rule__SVC__Decision_function_shapeAlternatives_14_2_0 )
            {
             before(grammarAccess.getSVCAccess().getDecision_function_shapeAlternatives_14_2_0()); 
            // InternalPerfectML.g:8785:3: ( rule__SVC__Decision_function_shapeAlternatives_14_2_0 )
            // InternalPerfectML.g:8785:4: rule__SVC__Decision_function_shapeAlternatives_14_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SVC__Decision_function_shapeAlternatives_14_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSVCAccess().getDecision_function_shapeAlternatives_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Decision_function_shapeAssignment_14_2"


    // $ANTLR start "rule__SVC__Break_ties_defAssignment_15_0"
    // InternalPerfectML.g:8793:1: rule__SVC__Break_ties_defAssignment_15_0 : ( ( 'break_ties' ) ) ;
    public final void rule__SVC__Break_ties_defAssignment_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8797:1: ( ( ( 'break_ties' ) ) )
            // InternalPerfectML.g:8798:2: ( ( 'break_ties' ) )
            {
            // InternalPerfectML.g:8798:2: ( ( 'break_ties' ) )
            // InternalPerfectML.g:8799:3: ( 'break_ties' )
            {
             before(grammarAccess.getSVCAccess().getBreak_ties_defBreak_tiesKeyword_15_0_0()); 
            // InternalPerfectML.g:8800:3: ( 'break_ties' )
            // InternalPerfectML.g:8801:4: 'break_ties'
            {
             before(grammarAccess.getSVCAccess().getBreak_ties_defBreak_tiesKeyword_15_0_0()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getBreak_ties_defBreak_tiesKeyword_15_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getBreak_ties_defBreak_tiesKeyword_15_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Break_ties_defAssignment_15_0"


    // $ANTLR start "rule__SVC__Break_tiesAssignment_15_2"
    // InternalPerfectML.g:8812:1: rule__SVC__Break_tiesAssignment_15_2 : ( ruleBOOL ) ;
    public final void rule__SVC__Break_tiesAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8816:1: ( ( ruleBOOL ) )
            // InternalPerfectML.g:8817:2: ( ruleBOOL )
            {
            // InternalPerfectML.g:8817:2: ( ruleBOOL )
            // InternalPerfectML.g:8818:3: ruleBOOL
            {
             before(grammarAccess.getSVCAccess().getBreak_tiesBOOLParserRuleCall_15_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getSVCAccess().getBreak_tiesBOOLParserRuleCall_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Break_tiesAssignment_15_2"


    // $ANTLR start "rule__SVC__Random_state_defAssignment_16_0"
    // InternalPerfectML.g:8827:1: rule__SVC__Random_state_defAssignment_16_0 : ( ( 'random_state' ) ) ;
    public final void rule__SVC__Random_state_defAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8831:1: ( ( ( 'random_state' ) ) )
            // InternalPerfectML.g:8832:2: ( ( 'random_state' ) )
            {
            // InternalPerfectML.g:8832:2: ( ( 'random_state' ) )
            // InternalPerfectML.g:8833:3: ( 'random_state' )
            {
             before(grammarAccess.getSVCAccess().getRandom_state_defRandom_stateKeyword_16_0_0()); 
            // InternalPerfectML.g:8834:3: ( 'random_state' )
            // InternalPerfectML.g:8835:4: 'random_state'
            {
             before(grammarAccess.getSVCAccess().getRandom_state_defRandom_stateKeyword_16_0_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getRandom_state_defRandom_stateKeyword_16_0_0()); 

            }

             after(grammarAccess.getSVCAccess().getRandom_state_defRandom_stateKeyword_16_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Random_state_defAssignment_16_0"


    // $ANTLR start "rule__SVC__Random_stateAssignment_16_2"
    // InternalPerfectML.g:8846:1: rule__SVC__Random_stateAssignment_16_2 : ( RULE_INT ) ;
    public final void rule__SVC__Random_stateAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8850:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:8851:2: ( RULE_INT )
            {
            // InternalPerfectML.g:8851:2: ( RULE_INT )
            // InternalPerfectML.g:8852:3: RULE_INT
            {
             before(grammarAccess.getSVCAccess().getRandom_stateINTTerminalRuleCall_16_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSVCAccess().getRandom_stateINTTerminalRuleCall_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVC__Random_stateAssignment_16_2"


    // $ANTLR start "rule__KNeighborsClassifier__N_neighbors_defAssignment_3_0"
    // InternalPerfectML.g:8861:1: rule__KNeighborsClassifier__N_neighbors_defAssignment_3_0 : ( ( 'n_neighbors' ) ) ;
    public final void rule__KNeighborsClassifier__N_neighbors_defAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8865:1: ( ( ( 'n_neighbors' ) ) )
            // InternalPerfectML.g:8866:2: ( ( 'n_neighbors' ) )
            {
            // InternalPerfectML.g:8866:2: ( ( 'n_neighbors' ) )
            // InternalPerfectML.g:8867:3: ( 'n_neighbors' )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getN_neighbors_defN_neighborsKeyword_3_0_0()); 
            // InternalPerfectML.g:8868:3: ( 'n_neighbors' )
            // InternalPerfectML.g:8869:4: 'n_neighbors'
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getN_neighbors_defN_neighborsKeyword_3_0_0()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getN_neighbors_defN_neighborsKeyword_3_0_0()); 

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getN_neighbors_defN_neighborsKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__N_neighbors_defAssignment_3_0"


    // $ANTLR start "rule__KNeighborsClassifier__N_neighborsAssignment_3_2"
    // InternalPerfectML.g:8880:1: rule__KNeighborsClassifier__N_neighborsAssignment_3_2 : ( RULE_INT ) ;
    public final void rule__KNeighborsClassifier__N_neighborsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8884:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:8885:2: ( RULE_INT )
            {
            // InternalPerfectML.g:8885:2: ( RULE_INT )
            // InternalPerfectML.g:8886:3: RULE_INT
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getN_neighborsINTTerminalRuleCall_3_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getN_neighborsINTTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__N_neighborsAssignment_3_2"


    // $ANTLR start "rule__KNeighborsClassifier__Weights_defAssignment_4_0"
    // InternalPerfectML.g:8895:1: rule__KNeighborsClassifier__Weights_defAssignment_4_0 : ( ( 'weights' ) ) ;
    public final void rule__KNeighborsClassifier__Weights_defAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8899:1: ( ( ( 'weights' ) ) )
            // InternalPerfectML.g:8900:2: ( ( 'weights' ) )
            {
            // InternalPerfectML.g:8900:2: ( ( 'weights' ) )
            // InternalPerfectML.g:8901:3: ( 'weights' )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getWeights_defWeightsKeyword_4_0_0()); 
            // InternalPerfectML.g:8902:3: ( 'weights' )
            // InternalPerfectML.g:8903:4: 'weights'
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getWeights_defWeightsKeyword_4_0_0()); 
            match(input,99,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getWeights_defWeightsKeyword_4_0_0()); 

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getWeights_defWeightsKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Weights_defAssignment_4_0"


    // $ANTLR start "rule__KNeighborsClassifier__WeightsAssignment_4_2"
    // InternalPerfectML.g:8914:1: rule__KNeighborsClassifier__WeightsAssignment_4_2 : ( ( rule__KNeighborsClassifier__WeightsAlternatives_4_2_0 ) ) ;
    public final void rule__KNeighborsClassifier__WeightsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8918:1: ( ( ( rule__KNeighborsClassifier__WeightsAlternatives_4_2_0 ) ) )
            // InternalPerfectML.g:8919:2: ( ( rule__KNeighborsClassifier__WeightsAlternatives_4_2_0 ) )
            {
            // InternalPerfectML.g:8919:2: ( ( rule__KNeighborsClassifier__WeightsAlternatives_4_2_0 ) )
            // InternalPerfectML.g:8920:3: ( rule__KNeighborsClassifier__WeightsAlternatives_4_2_0 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getWeightsAlternatives_4_2_0()); 
            // InternalPerfectML.g:8921:3: ( rule__KNeighborsClassifier__WeightsAlternatives_4_2_0 )
            // InternalPerfectML.g:8921:4: rule__KNeighborsClassifier__WeightsAlternatives_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__WeightsAlternatives_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getWeightsAlternatives_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__WeightsAssignment_4_2"


    // $ANTLR start "rule__KNeighborsClassifier__Algorithm_defAssignment_5_0"
    // InternalPerfectML.g:8929:1: rule__KNeighborsClassifier__Algorithm_defAssignment_5_0 : ( ( 'algorithm' ) ) ;
    public final void rule__KNeighborsClassifier__Algorithm_defAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8933:1: ( ( ( 'algorithm' ) ) )
            // InternalPerfectML.g:8934:2: ( ( 'algorithm' ) )
            {
            // InternalPerfectML.g:8934:2: ( ( 'algorithm' ) )
            // InternalPerfectML.g:8935:3: ( 'algorithm' )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getAlgorithm_defAlgorithmKeyword_5_0_0()); 
            // InternalPerfectML.g:8936:3: ( 'algorithm' )
            // InternalPerfectML.g:8937:4: 'algorithm'
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getAlgorithm_defAlgorithmKeyword_5_0_0()); 
            match(input,100,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getAlgorithm_defAlgorithmKeyword_5_0_0()); 

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getAlgorithm_defAlgorithmKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Algorithm_defAssignment_5_0"


    // $ANTLR start "rule__KNeighborsClassifier__AlgorithmAssignment_5_2"
    // InternalPerfectML.g:8948:1: rule__KNeighborsClassifier__AlgorithmAssignment_5_2 : ( ( rule__KNeighborsClassifier__AlgorithmAlternatives_5_2_0 ) ) ;
    public final void rule__KNeighborsClassifier__AlgorithmAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8952:1: ( ( ( rule__KNeighborsClassifier__AlgorithmAlternatives_5_2_0 ) ) )
            // InternalPerfectML.g:8953:2: ( ( rule__KNeighborsClassifier__AlgorithmAlternatives_5_2_0 ) )
            {
            // InternalPerfectML.g:8953:2: ( ( rule__KNeighborsClassifier__AlgorithmAlternatives_5_2_0 ) )
            // InternalPerfectML.g:8954:3: ( rule__KNeighborsClassifier__AlgorithmAlternatives_5_2_0 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getAlgorithmAlternatives_5_2_0()); 
            // InternalPerfectML.g:8955:3: ( rule__KNeighborsClassifier__AlgorithmAlternatives_5_2_0 )
            // InternalPerfectML.g:8955:4: rule__KNeighborsClassifier__AlgorithmAlternatives_5_2_0
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__AlgorithmAlternatives_5_2_0();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getAlgorithmAlternatives_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__AlgorithmAssignment_5_2"


    // $ANTLR start "rule__KNeighborsClassifier__Leaf_size_defAssignment_6_0"
    // InternalPerfectML.g:8963:1: rule__KNeighborsClassifier__Leaf_size_defAssignment_6_0 : ( ( 'leaf_size' ) ) ;
    public final void rule__KNeighborsClassifier__Leaf_size_defAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8967:1: ( ( ( 'leaf_size' ) ) )
            // InternalPerfectML.g:8968:2: ( ( 'leaf_size' ) )
            {
            // InternalPerfectML.g:8968:2: ( ( 'leaf_size' ) )
            // InternalPerfectML.g:8969:3: ( 'leaf_size' )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getLeaf_size_defLeaf_sizeKeyword_6_0_0()); 
            // InternalPerfectML.g:8970:3: ( 'leaf_size' )
            // InternalPerfectML.g:8971:4: 'leaf_size'
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getLeaf_size_defLeaf_sizeKeyword_6_0_0()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getLeaf_size_defLeaf_sizeKeyword_6_0_0()); 

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getLeaf_size_defLeaf_sizeKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Leaf_size_defAssignment_6_0"


    // $ANTLR start "rule__KNeighborsClassifier__Leaf_sizeAssignment_6_2"
    // InternalPerfectML.g:8982:1: rule__KNeighborsClassifier__Leaf_sizeAssignment_6_2 : ( RULE_INT ) ;
    public final void rule__KNeighborsClassifier__Leaf_sizeAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:8986:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:8987:2: ( RULE_INT )
            {
            // InternalPerfectML.g:8987:2: ( RULE_INT )
            // InternalPerfectML.g:8988:3: RULE_INT
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getLeaf_sizeINTTerminalRuleCall_6_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getLeaf_sizeINTTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Leaf_sizeAssignment_6_2"


    // $ANTLR start "rule__KNeighborsClassifier__P_defAssignment_7_0"
    // InternalPerfectML.g:8997:1: rule__KNeighborsClassifier__P_defAssignment_7_0 : ( ( 'p' ) ) ;
    public final void rule__KNeighborsClassifier__P_defAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9001:1: ( ( ( 'p' ) ) )
            // InternalPerfectML.g:9002:2: ( ( 'p' ) )
            {
            // InternalPerfectML.g:9002:2: ( ( 'p' ) )
            // InternalPerfectML.g:9003:3: ( 'p' )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getP_defPKeyword_7_0_0()); 
            // InternalPerfectML.g:9004:3: ( 'p' )
            // InternalPerfectML.g:9005:4: 'p'
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getP_defPKeyword_7_0_0()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getP_defPKeyword_7_0_0()); 

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getP_defPKeyword_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__P_defAssignment_7_0"


    // $ANTLR start "rule__KNeighborsClassifier__PAssignment_7_2"
    // InternalPerfectML.g:9016:1: rule__KNeighborsClassifier__PAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__KNeighborsClassifier__PAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9020:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:9021:2: ( RULE_INT )
            {
            // InternalPerfectML.g:9021:2: ( RULE_INT )
            // InternalPerfectML.g:9022:3: RULE_INT
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getPINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getPINTTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__PAssignment_7_2"


    // $ANTLR start "rule__KNeighborsClassifier__Metric_defAssignment_8_0"
    // InternalPerfectML.g:9031:1: rule__KNeighborsClassifier__Metric_defAssignment_8_0 : ( ( 'metric' ) ) ;
    public final void rule__KNeighborsClassifier__Metric_defAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9035:1: ( ( ( 'metric' ) ) )
            // InternalPerfectML.g:9036:2: ( ( 'metric' ) )
            {
            // InternalPerfectML.g:9036:2: ( ( 'metric' ) )
            // InternalPerfectML.g:9037:3: ( 'metric' )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getMetric_defMetricKeyword_8_0_0()); 
            // InternalPerfectML.g:9038:3: ( 'metric' )
            // InternalPerfectML.g:9039:4: 'metric'
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getMetric_defMetricKeyword_8_0_0()); 
            match(input,103,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getMetric_defMetricKeyword_8_0_0()); 

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getMetric_defMetricKeyword_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__Metric_defAssignment_8_0"


    // $ANTLR start "rule__KNeighborsClassifier__MetricAssignment_8_2"
    // InternalPerfectML.g:9050:1: rule__KNeighborsClassifier__MetricAssignment_8_2 : ( ( rule__KNeighborsClassifier__MetricAlternatives_8_2_0 ) ) ;
    public final void rule__KNeighborsClassifier__MetricAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9054:1: ( ( ( rule__KNeighborsClassifier__MetricAlternatives_8_2_0 ) ) )
            // InternalPerfectML.g:9055:2: ( ( rule__KNeighborsClassifier__MetricAlternatives_8_2_0 ) )
            {
            // InternalPerfectML.g:9055:2: ( ( rule__KNeighborsClassifier__MetricAlternatives_8_2_0 ) )
            // InternalPerfectML.g:9056:3: ( rule__KNeighborsClassifier__MetricAlternatives_8_2_0 )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getMetricAlternatives_8_2_0()); 
            // InternalPerfectML.g:9057:3: ( rule__KNeighborsClassifier__MetricAlternatives_8_2_0 )
            // InternalPerfectML.g:9057:4: rule__KNeighborsClassifier__MetricAlternatives_8_2_0
            {
            pushFollow(FOLLOW_2);
            rule__KNeighborsClassifier__MetricAlternatives_8_2_0();

            state._fsp--;


            }

             after(grammarAccess.getKNeighborsClassifierAccess().getMetricAlternatives_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__MetricAssignment_8_2"


    // $ANTLR start "rule__KNeighborsClassifier__N_jobs_defAssignment_9_0"
    // InternalPerfectML.g:9065:1: rule__KNeighborsClassifier__N_jobs_defAssignment_9_0 : ( ( 'n_jobs' ) ) ;
    public final void rule__KNeighborsClassifier__N_jobs_defAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9069:1: ( ( ( 'n_jobs' ) ) )
            // InternalPerfectML.g:9070:2: ( ( 'n_jobs' ) )
            {
            // InternalPerfectML.g:9070:2: ( ( 'n_jobs' ) )
            // InternalPerfectML.g:9071:3: ( 'n_jobs' )
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getN_jobs_defN_jobsKeyword_9_0_0()); 
            // InternalPerfectML.g:9072:3: ( 'n_jobs' )
            // InternalPerfectML.g:9073:4: 'n_jobs'
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getN_jobs_defN_jobsKeyword_9_0_0()); 
            match(input,104,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getN_jobs_defN_jobsKeyword_9_0_0()); 

            }

             after(grammarAccess.getKNeighborsClassifierAccess().getN_jobs_defN_jobsKeyword_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__N_jobs_defAssignment_9_0"


    // $ANTLR start "rule__KNeighborsClassifier__N_jobsAssignment_9_2"
    // InternalPerfectML.g:9084:1: rule__KNeighborsClassifier__N_jobsAssignment_9_2 : ( RULE_INT ) ;
    public final void rule__KNeighborsClassifier__N_jobsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9088:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:9089:2: ( RULE_INT )
            {
            // InternalPerfectML.g:9089:2: ( RULE_INT )
            // InternalPerfectML.g:9090:3: RULE_INT
            {
             before(grammarAccess.getKNeighborsClassifierAccess().getN_jobsINTTerminalRuleCall_9_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getKNeighborsClassifierAccess().getN_jobsINTTerminalRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KNeighborsClassifier__N_jobsAssignment_9_2"


    // $ANTLR start "rule__TrainingAmount__ValueAssignment_1"
    // InternalPerfectML.g:9099:1: rule__TrainingAmount__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__TrainingAmount__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9103:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:9104:2: ( RULE_INT )
            {
            // InternalPerfectML.g:9104:2: ( RULE_INT )
            // InternalPerfectML.g:9105:3: RULE_INT
            {
             before(grammarAccess.getTrainingAmountAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTrainingAmountAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__ValueAssignment_1"


    // $ANTLR start "rule__TrainingAmount__PercentAssignment_2_0"
    // InternalPerfectML.g:9114:1: rule__TrainingAmount__PercentAssignment_2_0 : ( ( '%' ) ) ;
    public final void rule__TrainingAmount__PercentAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9118:1: ( ( ( '%' ) ) )
            // InternalPerfectML.g:9119:2: ( ( '%' ) )
            {
            // InternalPerfectML.g:9119:2: ( ( '%' ) )
            // InternalPerfectML.g:9120:3: ( '%' )
            {
             before(grammarAccess.getTrainingAmountAccess().getPercentPercentSignKeyword_2_0_0()); 
            // InternalPerfectML.g:9121:3: ( '%' )
            // InternalPerfectML.g:9122:4: '%'
            {
             before(grammarAccess.getTrainingAmountAccess().getPercentPercentSignKeyword_2_0_0()); 
            match(input,105,FOLLOW_2); 
             after(grammarAccess.getTrainingAmountAccess().getPercentPercentSignKeyword_2_0_0()); 

            }

             after(grammarAccess.getTrainingAmountAccess().getPercentPercentSignKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingAmount__PercentAssignment_2_0"


    // $ANTLR start "rule__ColumnDeclarations__TargetAssignment_4_0"
    // InternalPerfectML.g:9133:1: rule__ColumnDeclarations__TargetAssignment_4_0 : ( ruleColumnSet ) ;
    public final void rule__ColumnDeclarations__TargetAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9137:1: ( ( ruleColumnSet ) )
            // InternalPerfectML.g:9138:2: ( ruleColumnSet )
            {
            // InternalPerfectML.g:9138:2: ( ruleColumnSet )
            // InternalPerfectML.g:9139:3: ruleColumnSet
            {
             before(grammarAccess.getColumnDeclarationsAccess().getTargetColumnSetParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnSet();

            state._fsp--;

             after(grammarAccess.getColumnDeclarationsAccess().getTargetColumnSetParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__TargetAssignment_4_0"


    // $ANTLR start "rule__ColumnDeclarations__Target_defAssignment_4_2"
    // InternalPerfectML.g:9148:1: rule__ColumnDeclarations__Target_defAssignment_4_2 : ( ( 'target' ) ) ;
    public final void rule__ColumnDeclarations__Target_defAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9152:1: ( ( ( 'target' ) ) )
            // InternalPerfectML.g:9153:2: ( ( 'target' ) )
            {
            // InternalPerfectML.g:9153:2: ( ( 'target' ) )
            // InternalPerfectML.g:9154:3: ( 'target' )
            {
             before(grammarAccess.getColumnDeclarationsAccess().getTarget_defTargetKeyword_4_2_0()); 
            // InternalPerfectML.g:9155:3: ( 'target' )
            // InternalPerfectML.g:9156:4: 'target'
            {
             before(grammarAccess.getColumnDeclarationsAccess().getTarget_defTargetKeyword_4_2_0()); 
            match(input,106,FOLLOW_2); 
             after(grammarAccess.getColumnDeclarationsAccess().getTarget_defTargetKeyword_4_2_0()); 

            }

             after(grammarAccess.getColumnDeclarationsAccess().getTarget_defTargetKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Target_defAssignment_4_2"


    // $ANTLR start "rule__ColumnDeclarations__PredictiveAssignment_5_0"
    // InternalPerfectML.g:9167:1: rule__ColumnDeclarations__PredictiveAssignment_5_0 : ( ruleColumnSet ) ;
    public final void rule__ColumnDeclarations__PredictiveAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9171:1: ( ( ruleColumnSet ) )
            // InternalPerfectML.g:9172:2: ( ruleColumnSet )
            {
            // InternalPerfectML.g:9172:2: ( ruleColumnSet )
            // InternalPerfectML.g:9173:3: ruleColumnSet
            {
             before(grammarAccess.getColumnDeclarationsAccess().getPredictiveColumnSetParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnSet();

            state._fsp--;

             after(grammarAccess.getColumnDeclarationsAccess().getPredictiveColumnSetParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__PredictiveAssignment_5_0"


    // $ANTLR start "rule__ColumnDeclarations__Pred_defAssignment_5_2"
    // InternalPerfectML.g:9182:1: rule__ColumnDeclarations__Pred_defAssignment_5_2 : ( ( 'predictive' ) ) ;
    public final void rule__ColumnDeclarations__Pred_defAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9186:1: ( ( ( 'predictive' ) ) )
            // InternalPerfectML.g:9187:2: ( ( 'predictive' ) )
            {
            // InternalPerfectML.g:9187:2: ( ( 'predictive' ) )
            // InternalPerfectML.g:9188:3: ( 'predictive' )
            {
             before(grammarAccess.getColumnDeclarationsAccess().getPred_defPredictiveKeyword_5_2_0()); 
            // InternalPerfectML.g:9189:3: ( 'predictive' )
            // InternalPerfectML.g:9190:4: 'predictive'
            {
             before(grammarAccess.getColumnDeclarationsAccess().getPred_defPredictiveKeyword_5_2_0()); 
            match(input,107,FOLLOW_2); 
             after(grammarAccess.getColumnDeclarationsAccess().getPred_defPredictiveKeyword_5_2_0()); 

            }

             after(grammarAccess.getColumnDeclarationsAccess().getPred_defPredictiveKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Pred_defAssignment_5_2"


    // $ANTLR start "rule__ColumnSet__OpAssignment_0_0"
    // InternalPerfectML.g:9201:1: rule__ColumnSet__OpAssignment_0_0 : ( ( '(' ) ) ;
    public final void rule__ColumnSet__OpAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9205:1: ( ( ( '(' ) ) )
            // InternalPerfectML.g:9206:2: ( ( '(' ) )
            {
            // InternalPerfectML.g:9206:2: ( ( '(' ) )
            // InternalPerfectML.g:9207:3: ( '(' )
            {
             before(grammarAccess.getColumnSetAccess().getOpLeftParenthesisKeyword_0_0_0()); 
            // InternalPerfectML.g:9208:3: ( '(' )
            // InternalPerfectML.g:9209:4: '('
            {
             before(grammarAccess.getColumnSetAccess().getOpLeftParenthesisKeyword_0_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getOpLeftParenthesisKeyword_0_0_0()); 

            }

             after(grammarAccess.getColumnSetAccess().getOpLeftParenthesisKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__OpAssignment_0_0"


    // $ANTLR start "rule__ColumnSet__ArgBin1Assignment_0_1"
    // InternalPerfectML.g:9220:1: rule__ColumnSet__ArgBin1Assignment_0_1 : ( ruleColumnSet ) ;
    public final void rule__ColumnSet__ArgBin1Assignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9224:1: ( ( ruleColumnSet ) )
            // InternalPerfectML.g:9225:2: ( ruleColumnSet )
            {
            // InternalPerfectML.g:9225:2: ( ruleColumnSet )
            // InternalPerfectML.g:9226:3: ruleColumnSet
            {
             before(grammarAccess.getColumnSetAccess().getArgBin1ColumnSetParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnSet();

            state._fsp--;

             after(grammarAccess.getColumnSetAccess().getArgBin1ColumnSetParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__ArgBin1Assignment_0_1"


    // $ANTLR start "rule__ColumnSet__OpTypeAssignment_0_3"
    // InternalPerfectML.g:9235:1: rule__ColumnSet__OpTypeAssignment_0_3 : ( ruleBinop ) ;
    public final void rule__ColumnSet__OpTypeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9239:1: ( ( ruleBinop ) )
            // InternalPerfectML.g:9240:2: ( ruleBinop )
            {
            // InternalPerfectML.g:9240:2: ( ruleBinop )
            // InternalPerfectML.g:9241:3: ruleBinop
            {
             before(grammarAccess.getColumnSetAccess().getOpTypeBinopParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBinop();

            state._fsp--;

             after(grammarAccess.getColumnSetAccess().getOpTypeBinopParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__OpTypeAssignment_0_3"


    // $ANTLR start "rule__ColumnSet__ArgBin2Assignment_0_5"
    // InternalPerfectML.g:9250:1: rule__ColumnSet__ArgBin2Assignment_0_5 : ( ruleColumnSet ) ;
    public final void rule__ColumnSet__ArgBin2Assignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9254:1: ( ( ruleColumnSet ) )
            // InternalPerfectML.g:9255:2: ( ruleColumnSet )
            {
            // InternalPerfectML.g:9255:2: ( ruleColumnSet )
            // InternalPerfectML.g:9256:3: ruleColumnSet
            {
             before(grammarAccess.getColumnSetAccess().getArgBin2ColumnSetParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnSet();

            state._fsp--;

             after(grammarAccess.getColumnSetAccess().getArgBin2ColumnSetParserRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__ArgBin2Assignment_0_5"


    // $ANTLR start "rule__ColumnSet__RangeAssignment_1_0"
    // InternalPerfectML.g:9265:1: rule__ColumnSet__RangeAssignment_1_0 : ( ( 'From' ) ) ;
    public final void rule__ColumnSet__RangeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9269:1: ( ( ( 'From' ) ) )
            // InternalPerfectML.g:9270:2: ( ( 'From' ) )
            {
            // InternalPerfectML.g:9270:2: ( ( 'From' ) )
            // InternalPerfectML.g:9271:3: ( 'From' )
            {
             before(grammarAccess.getColumnSetAccess().getRangeFromKeyword_1_0_0()); 
            // InternalPerfectML.g:9272:3: ( 'From' )
            // InternalPerfectML.g:9273:4: 'From'
            {
             before(grammarAccess.getColumnSetAccess().getRangeFromKeyword_1_0_0()); 
            match(input,108,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getRangeFromKeyword_1_0_0()); 

            }

             after(grammarAccess.getColumnSetAccess().getRangeFromKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__RangeAssignment_1_0"


    // $ANTLR start "rule__ColumnSet__ArgR1Assignment_1_1"
    // InternalPerfectML.g:9284:1: rule__ColumnSet__ArgR1Assignment_1_1 : ( RULE_INT ) ;
    public final void rule__ColumnSet__ArgR1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9288:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:9289:2: ( RULE_INT )
            {
            // InternalPerfectML.g:9289:2: ( RULE_INT )
            // InternalPerfectML.g:9290:3: RULE_INT
            {
             before(grammarAccess.getColumnSetAccess().getArgR1INTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getArgR1INTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__ArgR1Assignment_1_1"


    // $ANTLR start "rule__ColumnSet__ArgR2Assignment_1_3"
    // InternalPerfectML.g:9299:1: rule__ColumnSet__ArgR2Assignment_1_3 : ( RULE_INT ) ;
    public final void rule__ColumnSet__ArgR2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9303:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:9304:2: ( RULE_INT )
            {
            // InternalPerfectML.g:9304:2: ( RULE_INT )
            // InternalPerfectML.g:9305:3: RULE_INT
            {
             before(grammarAccess.getColumnSetAccess().getArgR2INTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getArgR2INTTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__ArgR2Assignment_1_3"


    // $ANTLR start "rule__ColumnSet__ListAssignment_2_0"
    // InternalPerfectML.g:9314:1: rule__ColumnSet__ListAssignment_2_0 : ( ( '[' ) ) ;
    public final void rule__ColumnSet__ListAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9318:1: ( ( ( '[' ) ) )
            // InternalPerfectML.g:9319:2: ( ( '[' ) )
            {
            // InternalPerfectML.g:9319:2: ( ( '[' ) )
            // InternalPerfectML.g:9320:3: ( '[' )
            {
             before(grammarAccess.getColumnSetAccess().getListLeftSquareBracketKeyword_2_0_0()); 
            // InternalPerfectML.g:9321:3: ( '[' )
            // InternalPerfectML.g:9322:4: '['
            {
             before(grammarAccess.getColumnSetAccess().getListLeftSquareBracketKeyword_2_0_0()); 
            match(input,109,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getListLeftSquareBracketKeyword_2_0_0()); 

            }

             after(grammarAccess.getColumnSetAccess().getListLeftSquareBracketKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__ListAssignment_2_0"


    // $ANTLR start "rule__ColumnSet__ArgListAssignment_2_1_0"
    // InternalPerfectML.g:9333:1: rule__ColumnSet__ArgListAssignment_2_1_0 : ( RULE_INT ) ;
    public final void rule__ColumnSet__ArgListAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9337:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:9338:2: ( RULE_INT )
            {
            // InternalPerfectML.g:9338:2: ( RULE_INT )
            // InternalPerfectML.g:9339:3: RULE_INT
            {
             before(grammarAccess.getColumnSetAccess().getArgListINTTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getArgListINTTerminalRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__ArgListAssignment_2_1_0"


    // $ANTLR start "rule__ColumnSet__ArgListAssignment_2_2"
    // InternalPerfectML.g:9348:1: rule__ColumnSet__ArgListAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__ColumnSet__ArgListAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9352:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:9353:2: ( RULE_INT )
            {
            // InternalPerfectML.g:9353:2: ( RULE_INT )
            // InternalPerfectML.g:9354:3: RULE_INT
            {
             before(grammarAccess.getColumnSetAccess().getArgListINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getArgListINTTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSet__ArgListAssignment_2_2"


    // $ANTLR start "rule__Binop__TypeAssignment_0"
    // InternalPerfectML.g:9363:1: rule__Binop__TypeAssignment_0 : ( ( 'and' ) ) ;
    public final void rule__Binop__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9367:1: ( ( ( 'and' ) ) )
            // InternalPerfectML.g:9368:2: ( ( 'and' ) )
            {
            // InternalPerfectML.g:9368:2: ( ( 'and' ) )
            // InternalPerfectML.g:9369:3: ( 'and' )
            {
             before(grammarAccess.getBinopAccess().getTypeAndKeyword_0_0()); 
            // InternalPerfectML.g:9370:3: ( 'and' )
            // InternalPerfectML.g:9371:4: 'and'
            {
             before(grammarAccess.getBinopAccess().getTypeAndKeyword_0_0()); 
            match(input,110,FOLLOW_2); 
             after(grammarAccess.getBinopAccess().getTypeAndKeyword_0_0()); 

            }

             after(grammarAccess.getBinopAccess().getTypeAndKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binop__TypeAssignment_0"


    // $ANTLR start "rule__Binop__TypeAssignment_1"
    // InternalPerfectML.g:9382:1: rule__Binop__TypeAssignment_1 : ( ( 'except' ) ) ;
    public final void rule__Binop__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9386:1: ( ( ( 'except' ) ) )
            // InternalPerfectML.g:9387:2: ( ( 'except' ) )
            {
            // InternalPerfectML.g:9387:2: ( ( 'except' ) )
            // InternalPerfectML.g:9388:3: ( 'except' )
            {
             before(grammarAccess.getBinopAccess().getTypeExceptKeyword_1_0()); 
            // InternalPerfectML.g:9389:3: ( 'except' )
            // InternalPerfectML.g:9390:4: 'except'
            {
             before(grammarAccess.getBinopAccess().getTypeExceptKeyword_1_0()); 
            match(input,111,FOLLOW_2); 
             after(grammarAccess.getBinopAccess().getTypeExceptKeyword_1_0()); 

            }

             after(grammarAccess.getBinopAccess().getTypeExceptKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binop__TypeAssignment_1"


    // $ANTLR start "rule__FLOAT__IntPartAssignment_0"
    // InternalPerfectML.g:9401:1: rule__FLOAT__IntPartAssignment_0 : ( RULE_INT ) ;
    public final void rule__FLOAT__IntPartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9405:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:9406:2: ( RULE_INT )
            {
            // InternalPerfectML.g:9406:2: ( RULE_INT )
            // InternalPerfectML.g:9407:3: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getIntPartINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getIntPartINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__IntPartAssignment_0"


    // $ANTLR start "rule__FLOAT__DecPartAssignment_2"
    // InternalPerfectML.g:9416:1: rule__FLOAT__DecPartAssignment_2 : ( RULE_INT ) ;
    public final void rule__FLOAT__DecPartAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9420:1: ( ( RULE_INT ) )
            // InternalPerfectML.g:9421:2: ( RULE_INT )
            {
            // InternalPerfectML.g:9421:2: ( RULE_INT )
            // InternalPerfectML.g:9422:3: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getDecPartINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getDecPartINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__DecPartAssignment_2"


    // $ANTLR start "rule__BOOL__ValueAssignment_0"
    // InternalPerfectML.g:9431:1: rule__BOOL__ValueAssignment_0 : ( ( 'True' ) ) ;
    public final void rule__BOOL__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9435:1: ( ( ( 'True' ) ) )
            // InternalPerfectML.g:9436:2: ( ( 'True' ) )
            {
            // InternalPerfectML.g:9436:2: ( ( 'True' ) )
            // InternalPerfectML.g:9437:3: ( 'True' )
            {
             before(grammarAccess.getBOOLAccess().getValueTrueKeyword_0_0()); 
            // InternalPerfectML.g:9438:3: ( 'True' )
            // InternalPerfectML.g:9439:4: 'True'
            {
             before(grammarAccess.getBOOLAccess().getValueTrueKeyword_0_0()); 
            match(input,112,FOLLOW_2); 
             after(grammarAccess.getBOOLAccess().getValueTrueKeyword_0_0()); 

            }

             after(grammarAccess.getBOOLAccess().getValueTrueKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL__ValueAssignment_0"


    // $ANTLR start "rule__BOOL__ValueAssignment_1"
    // InternalPerfectML.g:9450:1: rule__BOOL__ValueAssignment_1 : ( ( 'False' ) ) ;
    public final void rule__BOOL__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerfectML.g:9454:1: ( ( ( 'False' ) ) )
            // InternalPerfectML.g:9455:2: ( ( 'False' ) )
            {
            // InternalPerfectML.g:9455:2: ( ( 'False' ) )
            // InternalPerfectML.g:9456:3: ( 'False' )
            {
             before(grammarAccess.getBOOLAccess().getValueFalseKeyword_1_0()); 
            // InternalPerfectML.g:9457:3: ( 'False' )
            // InternalPerfectML.g:9458:4: 'False'
            {
             before(grammarAccess.getBOOLAccess().getValueFalseKeyword_1_0()); 
            match(input,113,FOLLOW_2); 
             after(grammarAccess.getBOOLAccess().getValueFalseKeyword_1_0()); 

            }

             after(grammarAccess.getBOOLAccess().getValueFalseKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0182000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000FFFFFEL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x00000003FF003A00L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x000001FC00000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000708000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000003F800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});

}