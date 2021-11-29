package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Use source data :'", "'\\n'", "'Use algorithm'", "'with\\n'", "'Use parameters :\\n'", "'Use columns :\\n'", "'as'", "'values'", "'('", "')'", "'From'", "'to'", "'['", "']'", "','", "'.'", "'and'", "'except'", "'target'", "'predictive'", "'true'", "'false'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleProgram EOF )
            // InternalMyDsl.g:55:1: ruleProgram EOF
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
    // InternalMyDsl.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Program__Group__0 )
            // InternalMyDsl.g:69:4: rule__Program__Group__0
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


    // $ANTLR start "entryRuleFile"
    // InternalMyDsl.g:78:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleFile EOF )
            // InternalMyDsl.g:80:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalMyDsl.g:87:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__File__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__File__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__File__Group__0 )
            // InternalMyDsl.g:94:4: rule__File__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleAlgorithm"
    // InternalMyDsl.g:103:1: entryRuleAlgorithm : ruleAlgorithm EOF ;
    public final void entryRuleAlgorithm() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleAlgorithm EOF )
            // InternalMyDsl.g:105:1: ruleAlgorithm EOF
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
    // InternalMyDsl.g:112:1: ruleAlgorithm : ( ( rule__Algorithm__Group__0 ) ) ;
    public final void ruleAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Algorithm__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Algorithm__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Algorithm__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Algorithm__Group__0 )
            {
             before(grammarAccess.getAlgorithmAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Algorithm__Group__0 )
            // InternalMyDsl.g:119:4: rule__Algorithm__Group__0
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


    // $ANTLR start "entryRuleParameterDeclaration"
    // InternalMyDsl.g:128:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleParameterDeclaration EOF )
            // InternalMyDsl.g:130:1: ruleParameterDeclaration EOF
            {
             before(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationRule()); 
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
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // InternalMyDsl.g:137:1: ruleParameterDeclaration : ( ( rule__ParameterDeclaration__Group__0 ) ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__ParameterDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__ParameterDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__ParameterDeclaration__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__ParameterDeclaration__Group__0 )
            {
             before(grammarAccess.getParameterDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__ParameterDeclaration__Group__0 )
            // InternalMyDsl.g:144:4: rule__ParameterDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleColumnDeclarations"
    // InternalMyDsl.g:153:1: entryRuleColumnDeclarations : ruleColumnDeclarations EOF ;
    public final void entryRuleColumnDeclarations() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleColumnDeclarations EOF )
            // InternalMyDsl.g:155:1: ruleColumnDeclarations EOF
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
    // InternalMyDsl.g:162:1: ruleColumnDeclarations : ( ( rule__ColumnDeclarations__Group__0 ) ) ;
    public final void ruleColumnDeclarations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__ColumnDeclarations__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__ColumnDeclarations__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__ColumnDeclarations__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__ColumnDeclarations__Group__0 )
            {
             before(grammarAccess.getColumnDeclarationsAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__ColumnDeclarations__Group__0 )
            // InternalMyDsl.g:169:4: rule__ColumnDeclarations__Group__0
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


    // $ANTLR start "entryRuleAlgoDeclaration"
    // InternalMyDsl.g:178:1: entryRuleAlgoDeclaration : ruleAlgoDeclaration EOF ;
    public final void entryRuleAlgoDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAlgoDeclaration EOF )
            // InternalMyDsl.g:180:1: ruleAlgoDeclaration EOF
            {
             before(grammarAccess.getAlgoDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgoDeclaration();

            state._fsp--;

             after(grammarAccess.getAlgoDeclarationRule()); 
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
    // $ANTLR end "entryRuleAlgoDeclaration"


    // $ANTLR start "ruleAlgoDeclaration"
    // InternalMyDsl.g:187:1: ruleAlgoDeclaration : ( ( rule__AlgoDeclaration__Group__0 ) ) ;
    public final void ruleAlgoDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__AlgoDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__AlgoDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__AlgoDeclaration__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__AlgoDeclaration__Group__0 )
            {
             before(grammarAccess.getAlgoDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__AlgoDeclaration__Group__0 )
            // InternalMyDsl.g:194:4: rule__AlgoDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AlgoDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlgoDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgoDeclaration"


    // $ANTLR start "entryRuleParaDeclaration"
    // InternalMyDsl.g:203:1: entryRuleParaDeclaration : ruleParaDeclaration EOF ;
    public final void entryRuleParaDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleParaDeclaration EOF )
            // InternalMyDsl.g:205:1: ruleParaDeclaration EOF
            {
             before(grammarAccess.getParaDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleParaDeclaration();

            state._fsp--;

             after(grammarAccess.getParaDeclarationRule()); 
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
    // $ANTLR end "entryRuleParaDeclaration"


    // $ANTLR start "ruleParaDeclaration"
    // InternalMyDsl.g:212:1: ruleParaDeclaration : ( ( rule__ParaDeclaration__Group__0 ) ) ;
    public final void ruleParaDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__ParaDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__ParaDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__ParaDeclaration__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__ParaDeclaration__Group__0 )
            {
             before(grammarAccess.getParaDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__ParaDeclaration__Group__0 )
            // InternalMyDsl.g:219:4: rule__ParaDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParaDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParaDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParaDeclaration"


    // $ANTLR start "entryRuleColumnDeclaration"
    // InternalMyDsl.g:228:1: entryRuleColumnDeclaration : ruleColumnDeclaration EOF ;
    public final void entryRuleColumnDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleColumnDeclaration EOF )
            // InternalMyDsl.g:230:1: ruleColumnDeclaration EOF
            {
             before(grammarAccess.getColumnDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnDeclaration();

            state._fsp--;

             after(grammarAccess.getColumnDeclarationRule()); 
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
    // $ANTLR end "entryRuleColumnDeclaration"


    // $ANTLR start "ruleColumnDeclaration"
    // InternalMyDsl.g:237:1: ruleColumnDeclaration : ( ( rule__ColumnDeclaration__Group__0 ) ) ;
    public final void ruleColumnDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__ColumnDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__ColumnDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__ColumnDeclaration__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__ColumnDeclaration__Group__0 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__ColumnDeclaration__Group__0 )
            // InternalMyDsl.g:244:4: rule__ColumnDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnDeclaration"


    // $ANTLR start "entryRuleColumnSet"
    // InternalMyDsl.g:253:1: entryRuleColumnSet : ruleColumnSet EOF ;
    public final void entryRuleColumnSet() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleColumnSet EOF )
            // InternalMyDsl.g:255:1: ruleColumnSet EOF
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
    // InternalMyDsl.g:262:1: ruleColumnSet : ( ( rule__ColumnSet__Alternatives ) ) ;
    public final void ruleColumnSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__ColumnSet__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__ColumnSet__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__ColumnSet__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__ColumnSet__Alternatives )
            {
             before(grammarAccess.getColumnSetAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__ColumnSet__Alternatives )
            // InternalMyDsl.g:269:4: rule__ColumnSet__Alternatives
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
    // InternalMyDsl.g:278:1: entryRuleBinop : ruleBinop EOF ;
    public final void entryRuleBinop() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleBinop EOF )
            // InternalMyDsl.g:280:1: ruleBinop EOF
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
    // InternalMyDsl.g:287:1: ruleBinop : ( ( rule__Binop__Alternatives ) ) ;
    public final void ruleBinop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Binop__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Binop__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Binop__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__Binop__Alternatives )
            {
             before(grammarAccess.getBinopAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__Binop__Alternatives )
            // InternalMyDsl.g:294:4: rule__Binop__Alternatives
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


    // $ANTLR start "entryRuleTargetPredictive"
    // InternalMyDsl.g:303:1: entryRuleTargetPredictive : ruleTargetPredictive EOF ;
    public final void entryRuleTargetPredictive() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleTargetPredictive EOF )
            // InternalMyDsl.g:305:1: ruleTargetPredictive EOF
            {
             before(grammarAccess.getTargetPredictiveRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetPredictive();

            state._fsp--;

             after(grammarAccess.getTargetPredictiveRule()); 
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
    // $ANTLR end "entryRuleTargetPredictive"


    // $ANTLR start "ruleTargetPredictive"
    // InternalMyDsl.g:312:1: ruleTargetPredictive : ( ( rule__TargetPredictive__Alternatives ) ) ;
    public final void ruleTargetPredictive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__TargetPredictive__Alternatives ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__TargetPredictive__Alternatives ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__TargetPredictive__Alternatives ) )
            // InternalMyDsl.g:318:3: ( rule__TargetPredictive__Alternatives )
            {
             before(grammarAccess.getTargetPredictiveAccess().getAlternatives()); 
            // InternalMyDsl.g:319:3: ( rule__TargetPredictive__Alternatives )
            // InternalMyDsl.g:319:4: rule__TargetPredictive__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TargetPredictive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTargetPredictiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetPredictive"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:328:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleValue EOF )
            // InternalMyDsl.g:330:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:337:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Value__Alternatives ) )
            // InternalMyDsl.g:343:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMyDsl.g:344:3: ( rule__Value__Alternatives )
            // InternalMyDsl.g:344:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMyDsl.g:353:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleFLOAT EOF )
            // InternalMyDsl.g:355:1: ruleFLOAT EOF
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
    // InternalMyDsl.g:362:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__FLOAT__Group__0 )
            // InternalMyDsl.g:369:4: rule__FLOAT__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleBOOL : ruleBOOL EOF ;
    public final void entryRuleBOOL() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleBOOL EOF )
            // InternalMyDsl.g:380:1: ruleBOOL EOF
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
    // InternalMyDsl.g:387:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__BOOL__Alternatives ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__BOOL__Alternatives ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__BOOL__Alternatives ) )
            // InternalMyDsl.g:393:3: ( rule__BOOL__Alternatives )
            {
             before(grammarAccess.getBOOLAccess().getAlternatives()); 
            // InternalMyDsl.g:394:3: ( rule__BOOL__Alternatives )
            // InternalMyDsl.g:394:4: rule__BOOL__Alternatives
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


    // $ANTLR start "rule__ColumnSet__Alternatives"
    // InternalMyDsl.g:402:1: rule__ColumnSet__Alternatives : ( ( ( rule__ColumnSet__Group_0__0 ) ) | ( ( rule__ColumnSet__Group_1__0 ) ) | ( ( rule__ColumnSet__Group_2__0 ) ) );
    public final void rule__ColumnSet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:406:1: ( ( ( rule__ColumnSet__Group_0__0 ) ) | ( ( rule__ColumnSet__Group_1__0 ) ) | ( ( rule__ColumnSet__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:407:2: ( ( rule__ColumnSet__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:407:2: ( ( rule__ColumnSet__Group_0__0 ) )
                    // InternalMyDsl.g:408:3: ( rule__ColumnSet__Group_0__0 )
                    {
                     before(grammarAccess.getColumnSetAccess().getGroup_0()); 
                    // InternalMyDsl.g:409:3: ( rule__ColumnSet__Group_0__0 )
                    // InternalMyDsl.g:409:4: rule__ColumnSet__Group_0__0
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
                    // InternalMyDsl.g:413:2: ( ( rule__ColumnSet__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:413:2: ( ( rule__ColumnSet__Group_1__0 ) )
                    // InternalMyDsl.g:414:3: ( rule__ColumnSet__Group_1__0 )
                    {
                     before(grammarAccess.getColumnSetAccess().getGroup_1()); 
                    // InternalMyDsl.g:415:3: ( rule__ColumnSet__Group_1__0 )
                    // InternalMyDsl.g:415:4: rule__ColumnSet__Group_1__0
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
                    // InternalMyDsl.g:419:2: ( ( rule__ColumnSet__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:419:2: ( ( rule__ColumnSet__Group_2__0 ) )
                    // InternalMyDsl.g:420:3: ( rule__ColumnSet__Group_2__0 )
                    {
                     before(grammarAccess.getColumnSetAccess().getGroup_2()); 
                    // InternalMyDsl.g:421:3: ( rule__ColumnSet__Group_2__0 )
                    // InternalMyDsl.g:421:4: rule__ColumnSet__Group_2__0
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
    // InternalMyDsl.g:429:1: rule__Binop__Alternatives : ( ( ( rule__Binop__TypeAssignment_0 ) ) | ( ( rule__Binop__TypeAssignment_1 ) ) );
    public final void rule__Binop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:433:1: ( ( ( rule__Binop__TypeAssignment_0 ) ) | ( ( rule__Binop__TypeAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:434:2: ( ( rule__Binop__TypeAssignment_0 ) )
                    {
                    // InternalMyDsl.g:434:2: ( ( rule__Binop__TypeAssignment_0 ) )
                    // InternalMyDsl.g:435:3: ( rule__Binop__TypeAssignment_0 )
                    {
                     before(grammarAccess.getBinopAccess().getTypeAssignment_0()); 
                    // InternalMyDsl.g:436:3: ( rule__Binop__TypeAssignment_0 )
                    // InternalMyDsl.g:436:4: rule__Binop__TypeAssignment_0
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
                    // InternalMyDsl.g:440:2: ( ( rule__Binop__TypeAssignment_1 ) )
                    {
                    // InternalMyDsl.g:440:2: ( ( rule__Binop__TypeAssignment_1 ) )
                    // InternalMyDsl.g:441:3: ( rule__Binop__TypeAssignment_1 )
                    {
                     before(grammarAccess.getBinopAccess().getTypeAssignment_1()); 
                    // InternalMyDsl.g:442:3: ( rule__Binop__TypeAssignment_1 )
                    // InternalMyDsl.g:442:4: rule__Binop__TypeAssignment_1
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


    // $ANTLR start "rule__TargetPredictive__Alternatives"
    // InternalMyDsl.g:450:1: rule__TargetPredictive__Alternatives : ( ( ( rule__TargetPredictive__TypeAssignment_0 ) ) | ( ( rule__TargetPredictive__TypeAssignment_1 ) ) );
    public final void rule__TargetPredictive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:454:1: ( ( ( rule__TargetPredictive__TypeAssignment_0 ) ) | ( ( rule__TargetPredictive__TypeAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:455:2: ( ( rule__TargetPredictive__TypeAssignment_0 ) )
                    {
                    // InternalMyDsl.g:455:2: ( ( rule__TargetPredictive__TypeAssignment_0 ) )
                    // InternalMyDsl.g:456:3: ( rule__TargetPredictive__TypeAssignment_0 )
                    {
                     before(grammarAccess.getTargetPredictiveAccess().getTypeAssignment_0()); 
                    // InternalMyDsl.g:457:3: ( rule__TargetPredictive__TypeAssignment_0 )
                    // InternalMyDsl.g:457:4: rule__TargetPredictive__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TargetPredictive__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTargetPredictiveAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:461:2: ( ( rule__TargetPredictive__TypeAssignment_1 ) )
                    {
                    // InternalMyDsl.g:461:2: ( ( rule__TargetPredictive__TypeAssignment_1 ) )
                    // InternalMyDsl.g:462:3: ( rule__TargetPredictive__TypeAssignment_1 )
                    {
                     before(grammarAccess.getTargetPredictiveAccess().getTypeAssignment_1()); 
                    // InternalMyDsl.g:463:3: ( rule__TargetPredictive__TypeAssignment_1 )
                    // InternalMyDsl.g:463:4: rule__TargetPredictive__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TargetPredictive__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTargetPredictiveAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__TargetPredictive__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalMyDsl.g:471:1: rule__Value__Alternatives : ( ( ( rule__Value__IntAssignment_0 ) ) | ( ( rule__Value__StrAssignment_1 ) ) | ( ( rule__Value__FloatAssignment_2 ) ) | ( ( rule__Value__BoolAssignment_3 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:475:1: ( ( ( rule__Value__IntAssignment_0 ) ) | ( ( rule__Value__StrAssignment_1 ) ) | ( ( rule__Value__FloatAssignment_2 ) ) | ( ( rule__Value__BoolAssignment_3 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==26) ) {
                    alt4=3;
                }
                else if ( (LA4_1==EOF||LA4_1==12) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case 31:
            case 32:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:476:2: ( ( rule__Value__IntAssignment_0 ) )
                    {
                    // InternalMyDsl.g:476:2: ( ( rule__Value__IntAssignment_0 ) )
                    // InternalMyDsl.g:477:3: ( rule__Value__IntAssignment_0 )
                    {
                     before(grammarAccess.getValueAccess().getIntAssignment_0()); 
                    // InternalMyDsl.g:478:3: ( rule__Value__IntAssignment_0 )
                    // InternalMyDsl.g:478:4: rule__Value__IntAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__IntAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getIntAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:482:2: ( ( rule__Value__StrAssignment_1 ) )
                    {
                    // InternalMyDsl.g:482:2: ( ( rule__Value__StrAssignment_1 ) )
                    // InternalMyDsl.g:483:3: ( rule__Value__StrAssignment_1 )
                    {
                     before(grammarAccess.getValueAccess().getStrAssignment_1()); 
                    // InternalMyDsl.g:484:3: ( rule__Value__StrAssignment_1 )
                    // InternalMyDsl.g:484:4: rule__Value__StrAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__StrAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getStrAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:488:2: ( ( rule__Value__FloatAssignment_2 ) )
                    {
                    // InternalMyDsl.g:488:2: ( ( rule__Value__FloatAssignment_2 ) )
                    // InternalMyDsl.g:489:3: ( rule__Value__FloatAssignment_2 )
                    {
                     before(grammarAccess.getValueAccess().getFloatAssignment_2()); 
                    // InternalMyDsl.g:490:3: ( rule__Value__FloatAssignment_2 )
                    // InternalMyDsl.g:490:4: rule__Value__FloatAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__FloatAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getFloatAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:494:2: ( ( rule__Value__BoolAssignment_3 ) )
                    {
                    // InternalMyDsl.g:494:2: ( ( rule__Value__BoolAssignment_3 ) )
                    // InternalMyDsl.g:495:3: ( rule__Value__BoolAssignment_3 )
                    {
                     before(grammarAccess.getValueAccess().getBoolAssignment_3()); 
                    // InternalMyDsl.g:496:3: ( rule__Value__BoolAssignment_3 )
                    // InternalMyDsl.g:496:4: rule__Value__BoolAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__BoolAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getBoolAssignment_3()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__BOOL__Alternatives"
    // InternalMyDsl.g:504:1: rule__BOOL__Alternatives : ( ( ( rule__BOOL__ValueAssignment_0 ) ) | ( ( rule__BOOL__ValueAssignment_1 ) ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:508:1: ( ( ( rule__BOOL__ValueAssignment_0 ) ) | ( ( rule__BOOL__ValueAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==32) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:509:2: ( ( rule__BOOL__ValueAssignment_0 ) )
                    {
                    // InternalMyDsl.g:509:2: ( ( rule__BOOL__ValueAssignment_0 ) )
                    // InternalMyDsl.g:510:3: ( rule__BOOL__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBOOLAccess().getValueAssignment_0()); 
                    // InternalMyDsl.g:511:3: ( rule__BOOL__ValueAssignment_0 )
                    // InternalMyDsl.g:511:4: rule__BOOL__ValueAssignment_0
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
                    // InternalMyDsl.g:515:2: ( ( rule__BOOL__ValueAssignment_1 ) )
                    {
                    // InternalMyDsl.g:515:2: ( ( rule__BOOL__ValueAssignment_1 ) )
                    // InternalMyDsl.g:516:3: ( rule__BOOL__ValueAssignment_1 )
                    {
                     before(grammarAccess.getBOOLAccess().getValueAssignment_1()); 
                    // InternalMyDsl.g:517:3: ( rule__BOOL__ValueAssignment_1 )
                    // InternalMyDsl.g:517:4: rule__BOOL__ValueAssignment_1
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


    // $ANTLR start "rule__Program__Group__0"
    // InternalMyDsl.g:525:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:529:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMyDsl.g:530:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:537:1: rule__Program__Group__0__Impl : ( ( rule__Program__BlocsFileAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:1: ( ( ( rule__Program__BlocsFileAssignment_0 ) ) )
            // InternalMyDsl.g:542:1: ( ( rule__Program__BlocsFileAssignment_0 ) )
            {
            // InternalMyDsl.g:542:1: ( ( rule__Program__BlocsFileAssignment_0 ) )
            // InternalMyDsl.g:543:2: ( rule__Program__BlocsFileAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getBlocsFileAssignment_0()); 
            // InternalMyDsl.g:544:2: ( rule__Program__BlocsFileAssignment_0 )
            // InternalMyDsl.g:544:3: rule__Program__BlocsFileAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__BlocsFileAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getBlocsFileAssignment_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:552:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalMyDsl.g:557:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:564:1: rule__Program__Group__1__Impl : ( ( rule__Program__BlocsAlgoAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:568:1: ( ( ( rule__Program__BlocsAlgoAssignment_1 ) ) )
            // InternalMyDsl.g:569:1: ( ( rule__Program__BlocsAlgoAssignment_1 ) )
            {
            // InternalMyDsl.g:569:1: ( ( rule__Program__BlocsAlgoAssignment_1 ) )
            // InternalMyDsl.g:570:2: ( rule__Program__BlocsAlgoAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getBlocsAlgoAssignment_1()); 
            // InternalMyDsl.g:571:2: ( rule__Program__BlocsAlgoAssignment_1 )
            // InternalMyDsl.g:571:3: rule__Program__BlocsAlgoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__BlocsAlgoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getBlocsAlgoAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:579:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalMyDsl.g:584:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:591:1: rule__Program__Group__2__Impl : ( ( rule__Program__BlocsParaAssignment_2 ) ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( ( ( rule__Program__BlocsParaAssignment_2 ) ) )
            // InternalMyDsl.g:596:1: ( ( rule__Program__BlocsParaAssignment_2 ) )
            {
            // InternalMyDsl.g:596:1: ( ( rule__Program__BlocsParaAssignment_2 ) )
            // InternalMyDsl.g:597:2: ( rule__Program__BlocsParaAssignment_2 )
            {
             before(grammarAccess.getProgramAccess().getBlocsParaAssignment_2()); 
            // InternalMyDsl.g:598:2: ( rule__Program__BlocsParaAssignment_2 )
            // InternalMyDsl.g:598:3: rule__Program__BlocsParaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Program__BlocsParaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getBlocsParaAssignment_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:606:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( rule__Program__Group__3__Impl )
            // InternalMyDsl.g:611:2: rule__Program__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__3__Impl();

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
    // InternalMyDsl.g:617:1: rule__Program__Group__3__Impl : ( ( rule__Program__BlocsColuAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( ( rule__Program__BlocsColuAssignment_3 ) ) )
            // InternalMyDsl.g:622:1: ( ( rule__Program__BlocsColuAssignment_3 ) )
            {
            // InternalMyDsl.g:622:1: ( ( rule__Program__BlocsColuAssignment_3 ) )
            // InternalMyDsl.g:623:2: ( rule__Program__BlocsColuAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getBlocsColuAssignment_3()); 
            // InternalMyDsl.g:624:2: ( rule__Program__BlocsColuAssignment_3 )
            // InternalMyDsl.g:624:3: rule__Program__BlocsColuAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Program__BlocsColuAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getBlocsColuAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__File__Group__0"
    // InternalMyDsl.g:633:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalMyDsl.g:638:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__1();

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
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // InternalMyDsl.g:645:1: rule__File__Group__0__Impl : ( 'Use source data :' ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( ( 'Use source data :' ) )
            // InternalMyDsl.g:650:1: ( 'Use source data :' )
            {
            // InternalMyDsl.g:650:1: ( 'Use source data :' )
            // InternalMyDsl.g:651:2: 'Use source data :'
            {
             before(grammarAccess.getFileAccess().getUseSourceDataKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getUseSourceDataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // InternalMyDsl.g:660:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // InternalMyDsl.g:665:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__File__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__2();

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
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // InternalMyDsl.g:672:1: rule__File__Group__1__Impl : ( ( rule__File__PATHAssignment_1 ) ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:676:1: ( ( ( rule__File__PATHAssignment_1 ) ) )
            // InternalMyDsl.g:677:1: ( ( rule__File__PATHAssignment_1 ) )
            {
            // InternalMyDsl.g:677:1: ( ( rule__File__PATHAssignment_1 ) )
            // InternalMyDsl.g:678:2: ( rule__File__PATHAssignment_1 )
            {
             before(grammarAccess.getFileAccess().getPATHAssignment_1()); 
            // InternalMyDsl.g:679:2: ( rule__File__PATHAssignment_1 )
            // InternalMyDsl.g:679:3: rule__File__PATHAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__File__PATHAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getPATHAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__File__Group__2"
    // InternalMyDsl.g:687:1: rule__File__Group__2 : rule__File__Group__2__Impl ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:1: ( rule__File__Group__2__Impl )
            // InternalMyDsl.g:692:2: rule__File__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__2__Impl();

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
    // $ANTLR end "rule__File__Group__2"


    // $ANTLR start "rule__File__Group__2__Impl"
    // InternalMyDsl.g:698:1: rule__File__Group__2__Impl : ( '\\n' ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( '\\n' ) )
            // InternalMyDsl.g:703:1: ( '\\n' )
            {
            // InternalMyDsl.g:703:1: ( '\\n' )
            // InternalMyDsl.g:704:2: '\\n'
            {
             before(grammarAccess.getFileAccess().getLineFeedKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getLineFeedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2__Impl"


    // $ANTLR start "rule__Algorithm__Group__0"
    // InternalMyDsl.g:714:1: rule__Algorithm__Group__0 : rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 ;
    public final void rule__Algorithm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:718:1: ( rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 )
            // InternalMyDsl.g:719:2: rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:726:1: rule__Algorithm__Group__0__Impl : ( () ) ;
    public final void rule__Algorithm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( ( () ) )
            // InternalMyDsl.g:731:1: ( () )
            {
            // InternalMyDsl.g:731:1: ( () )
            // InternalMyDsl.g:732:2: ()
            {
             before(grammarAccess.getAlgorithmAccess().getAlgorithmAction_0()); 
            // InternalMyDsl.g:733:2: ()
            // InternalMyDsl.g:733:3: 
            {
            }

             after(grammarAccess.getAlgorithmAccess().getAlgorithmAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__0__Impl"


    // $ANTLR start "rule__Algorithm__Group__1"
    // InternalMyDsl.g:741:1: rule__Algorithm__Group__1 : rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2 ;
    public final void rule__Algorithm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:745:1: ( rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2 )
            // InternalMyDsl.g:746:2: rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Algorithm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__2();

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
    // InternalMyDsl.g:753:1: rule__Algorithm__Group__1__Impl : ( 'Use algorithm' ) ;
    public final void rule__Algorithm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:757:1: ( ( 'Use algorithm' ) )
            // InternalMyDsl.g:758:1: ( 'Use algorithm' )
            {
            // InternalMyDsl.g:758:1: ( 'Use algorithm' )
            // InternalMyDsl.g:759:2: 'Use algorithm'
            {
             before(grammarAccess.getAlgorithmAccess().getUseAlgorithmKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getUseAlgorithmKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Algorithm__Group__2"
    // InternalMyDsl.g:768:1: rule__Algorithm__Group__2 : rule__Algorithm__Group__2__Impl rule__Algorithm__Group__3 ;
    public final void rule__Algorithm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( rule__Algorithm__Group__2__Impl rule__Algorithm__Group__3 )
            // InternalMyDsl.g:773:2: rule__Algorithm__Group__2__Impl rule__Algorithm__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Algorithm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__3();

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
    // $ANTLR end "rule__Algorithm__Group__2"


    // $ANTLR start "rule__Algorithm__Group__2__Impl"
    // InternalMyDsl.g:780:1: rule__Algorithm__Group__2__Impl : ( ( rule__Algorithm__NameAssignment_2 ) ) ;
    public final void rule__Algorithm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( ( ( rule__Algorithm__NameAssignment_2 ) ) )
            // InternalMyDsl.g:785:1: ( ( rule__Algorithm__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:785:1: ( ( rule__Algorithm__NameAssignment_2 ) )
            // InternalMyDsl.g:786:2: ( rule__Algorithm__NameAssignment_2 )
            {
             before(grammarAccess.getAlgorithmAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:787:2: ( rule__Algorithm__NameAssignment_2 )
            // InternalMyDsl.g:787:3: rule__Algorithm__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__2__Impl"


    // $ANTLR start "rule__Algorithm__Group__3"
    // InternalMyDsl.g:795:1: rule__Algorithm__Group__3 : rule__Algorithm__Group__3__Impl rule__Algorithm__Group__4 ;
    public final void rule__Algorithm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( rule__Algorithm__Group__3__Impl rule__Algorithm__Group__4 )
            // InternalMyDsl.g:800:2: rule__Algorithm__Group__3__Impl rule__Algorithm__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Algorithm__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__4();

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
    // $ANTLR end "rule__Algorithm__Group__3"


    // $ANTLR start "rule__Algorithm__Group__3__Impl"
    // InternalMyDsl.g:807:1: rule__Algorithm__Group__3__Impl : ( 'with\\n' ) ;
    public final void rule__Algorithm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:811:1: ( ( 'with\\n' ) )
            // InternalMyDsl.g:812:1: ( 'with\\n' )
            {
            // InternalMyDsl.g:812:1: ( 'with\\n' )
            // InternalMyDsl.g:813:2: 'with\\n'
            {
             before(grammarAccess.getAlgorithmAccess().getWithKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__3__Impl"


    // $ANTLR start "rule__Algorithm__Group__4"
    // InternalMyDsl.g:822:1: rule__Algorithm__Group__4 : rule__Algorithm__Group__4__Impl ;
    public final void rule__Algorithm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( rule__Algorithm__Group__4__Impl )
            // InternalMyDsl.g:827:2: rule__Algorithm__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__4__Impl();

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
    // $ANTLR end "rule__Algorithm__Group__4"


    // $ANTLR start "rule__Algorithm__Group__4__Impl"
    // InternalMyDsl.g:833:1: rule__Algorithm__Group__4__Impl : ( ( rule__Algorithm__Group_4__0 )* ) ;
    public final void rule__Algorithm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( ( rule__Algorithm__Group_4__0 )* ) )
            // InternalMyDsl.g:838:1: ( ( rule__Algorithm__Group_4__0 )* )
            {
            // InternalMyDsl.g:838:1: ( ( rule__Algorithm__Group_4__0 )* )
            // InternalMyDsl.g:839:2: ( rule__Algorithm__Group_4__0 )*
            {
             before(grammarAccess.getAlgorithmAccess().getGroup_4()); 
            // InternalMyDsl.g:840:2: ( rule__Algorithm__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:840:3: rule__Algorithm__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Algorithm__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAlgorithmAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__4__Impl"


    // $ANTLR start "rule__Algorithm__Group_4__0"
    // InternalMyDsl.g:849:1: rule__Algorithm__Group_4__0 : rule__Algorithm__Group_4__0__Impl rule__Algorithm__Group_4__1 ;
    public final void rule__Algorithm__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( rule__Algorithm__Group_4__0__Impl rule__Algorithm__Group_4__1 )
            // InternalMyDsl.g:854:2: rule__Algorithm__Group_4__0__Impl rule__Algorithm__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Algorithm__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_4__1();

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
    // $ANTLR end "rule__Algorithm__Group_4__0"


    // $ANTLR start "rule__Algorithm__Group_4__0__Impl"
    // InternalMyDsl.g:861:1: rule__Algorithm__Group_4__0__Impl : ( ( rule__Algorithm__BlocAssignment_4_0 ) ) ;
    public final void rule__Algorithm__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:865:1: ( ( ( rule__Algorithm__BlocAssignment_4_0 ) ) )
            // InternalMyDsl.g:866:1: ( ( rule__Algorithm__BlocAssignment_4_0 ) )
            {
            // InternalMyDsl.g:866:1: ( ( rule__Algorithm__BlocAssignment_4_0 ) )
            // InternalMyDsl.g:867:2: ( rule__Algorithm__BlocAssignment_4_0 )
            {
             before(grammarAccess.getAlgorithmAccess().getBlocAssignment_4_0()); 
            // InternalMyDsl.g:868:2: ( rule__Algorithm__BlocAssignment_4_0 )
            // InternalMyDsl.g:868:3: rule__Algorithm__BlocAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__BlocAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getBlocAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_4__0__Impl"


    // $ANTLR start "rule__Algorithm__Group_4__1"
    // InternalMyDsl.g:876:1: rule__Algorithm__Group_4__1 : rule__Algorithm__Group_4__1__Impl ;
    public final void rule__Algorithm__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:880:1: ( rule__Algorithm__Group_4__1__Impl )
            // InternalMyDsl.g:881:2: rule__Algorithm__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group_4__1__Impl();

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
    // $ANTLR end "rule__Algorithm__Group_4__1"


    // $ANTLR start "rule__Algorithm__Group_4__1__Impl"
    // InternalMyDsl.g:887:1: rule__Algorithm__Group_4__1__Impl : ( '\\n' ) ;
    public final void rule__Algorithm__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( ( '\\n' ) )
            // InternalMyDsl.g:892:1: ( '\\n' )
            {
            // InternalMyDsl.g:892:1: ( '\\n' )
            // InternalMyDsl.g:893:2: '\\n'
            {
             before(grammarAccess.getAlgorithmAccess().getLineFeedKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getLineFeedKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group_4__1__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__0"
    // InternalMyDsl.g:903:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // InternalMyDsl.g:908:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__Group__1();

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
    // $ANTLR end "rule__ParameterDeclaration__Group__0"


    // $ANTLR start "rule__ParameterDeclaration__Group__0__Impl"
    // InternalMyDsl.g:915:1: rule__ParameterDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:919:1: ( ( () ) )
            // InternalMyDsl.g:920:1: ( () )
            {
            // InternalMyDsl.g:920:1: ( () )
            // InternalMyDsl.g:921:2: ()
            {
             before(grammarAccess.getParameterDeclarationAccess().getParameterDeclarationAction_0()); 
            // InternalMyDsl.g:922:2: ()
            // InternalMyDsl.g:922:3: 
            {
            }

             after(grammarAccess.getParameterDeclarationAccess().getParameterDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__1"
    // InternalMyDsl.g:930:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:934:1: ( rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 )
            // InternalMyDsl.g:935:2: rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ParameterDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__Group__2();

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
    // $ANTLR end "rule__ParameterDeclaration__Group__1"


    // $ANTLR start "rule__ParameterDeclaration__Group__1__Impl"
    // InternalMyDsl.g:942:1: rule__ParameterDeclaration__Group__1__Impl : ( 'Use parameters :\\n' ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( ( 'Use parameters :\\n' ) )
            // InternalMyDsl.g:947:1: ( 'Use parameters :\\n' )
            {
            // InternalMyDsl.g:947:1: ( 'Use parameters :\\n' )
            // InternalMyDsl.g:948:2: 'Use parameters :\\n'
            {
             before(grammarAccess.getParameterDeclarationAccess().getUseParametersKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getParameterDeclarationAccess().getUseParametersKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__2"
    // InternalMyDsl.g:957:1: rule__ParameterDeclaration__Group__2 : rule__ParameterDeclaration__Group__2__Impl ;
    public final void rule__ParameterDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:961:1: ( rule__ParameterDeclaration__Group__2__Impl )
            // InternalMyDsl.g:962:2: rule__ParameterDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__ParameterDeclaration__Group__2"


    // $ANTLR start "rule__ParameterDeclaration__Group__2__Impl"
    // InternalMyDsl.g:968:1: rule__ParameterDeclaration__Group__2__Impl : ( ( rule__ParameterDeclaration__Group_2__0 )* ) ;
    public final void rule__ParameterDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( ( ( rule__ParameterDeclaration__Group_2__0 )* ) )
            // InternalMyDsl.g:973:1: ( ( rule__ParameterDeclaration__Group_2__0 )* )
            {
            // InternalMyDsl.g:973:1: ( ( rule__ParameterDeclaration__Group_2__0 )* )
            // InternalMyDsl.g:974:2: ( rule__ParameterDeclaration__Group_2__0 )*
            {
             before(grammarAccess.getParameterDeclarationAccess().getGroup_2()); 
            // InternalMyDsl.g:975:2: ( rule__ParameterDeclaration__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:975:3: rule__ParameterDeclaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ParameterDeclaration__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getParameterDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group_2__0"
    // InternalMyDsl.g:984:1: rule__ParameterDeclaration__Group_2__0 : rule__ParameterDeclaration__Group_2__0__Impl rule__ParameterDeclaration__Group_2__1 ;
    public final void rule__ParameterDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( rule__ParameterDeclaration__Group_2__0__Impl rule__ParameterDeclaration__Group_2__1 )
            // InternalMyDsl.g:989:2: rule__ParameterDeclaration__Group_2__0__Impl rule__ParameterDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ParameterDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__Group_2__1();

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
    // $ANTLR end "rule__ParameterDeclaration__Group_2__0"


    // $ANTLR start "rule__ParameterDeclaration__Group_2__0__Impl"
    // InternalMyDsl.g:996:1: rule__ParameterDeclaration__Group_2__0__Impl : ( ( rule__ParameterDeclaration__BlocAssignment_2_0 ) ) ;
    public final void rule__ParameterDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( ( ( rule__ParameterDeclaration__BlocAssignment_2_0 ) ) )
            // InternalMyDsl.g:1001:1: ( ( rule__ParameterDeclaration__BlocAssignment_2_0 ) )
            {
            // InternalMyDsl.g:1001:1: ( ( rule__ParameterDeclaration__BlocAssignment_2_0 ) )
            // InternalMyDsl.g:1002:2: ( rule__ParameterDeclaration__BlocAssignment_2_0 )
            {
             before(grammarAccess.getParameterDeclarationAccess().getBlocAssignment_2_0()); 
            // InternalMyDsl.g:1003:2: ( rule__ParameterDeclaration__BlocAssignment_2_0 )
            // InternalMyDsl.g:1003:3: rule__ParameterDeclaration__BlocAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__BlocAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclarationAccess().getBlocAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group_2__1"
    // InternalMyDsl.g:1011:1: rule__ParameterDeclaration__Group_2__1 : rule__ParameterDeclaration__Group_2__1__Impl ;
    public final void rule__ParameterDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1015:1: ( rule__ParameterDeclaration__Group_2__1__Impl )
            // InternalMyDsl.g:1016:2: rule__ParameterDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__Group_2__1__Impl();

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
    // $ANTLR end "rule__ParameterDeclaration__Group_2__1"


    // $ANTLR start "rule__ParameterDeclaration__Group_2__1__Impl"
    // InternalMyDsl.g:1022:1: rule__ParameterDeclaration__Group_2__1__Impl : ( '\\n' ) ;
    public final void rule__ParameterDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( ( '\\n' ) )
            // InternalMyDsl.g:1027:1: ( '\\n' )
            {
            // InternalMyDsl.g:1027:1: ( '\\n' )
            // InternalMyDsl.g:1028:2: '\\n'
            {
             before(grammarAccess.getParameterDeclarationAccess().getLineFeedKeyword_2_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getParameterDeclarationAccess().getLineFeedKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group__0"
    // InternalMyDsl.g:1038:1: rule__ColumnDeclarations__Group__0 : rule__ColumnDeclarations__Group__0__Impl rule__ColumnDeclarations__Group__1 ;
    public final void rule__ColumnDeclarations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( rule__ColumnDeclarations__Group__0__Impl rule__ColumnDeclarations__Group__1 )
            // InternalMyDsl.g:1043:2: rule__ColumnDeclarations__Group__0__Impl rule__ColumnDeclarations__Group__1
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
    // InternalMyDsl.g:1050:1: rule__ColumnDeclarations__Group__0__Impl : ( () ) ;
    public final void rule__ColumnDeclarations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( ( () ) )
            // InternalMyDsl.g:1055:1: ( () )
            {
            // InternalMyDsl.g:1055:1: ( () )
            // InternalMyDsl.g:1056:2: ()
            {
             before(grammarAccess.getColumnDeclarationsAccess().getColumnDeclarationsAction_0()); 
            // InternalMyDsl.g:1057:2: ()
            // InternalMyDsl.g:1057:3: 
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
    // InternalMyDsl.g:1065:1: rule__ColumnDeclarations__Group__1 : rule__ColumnDeclarations__Group__1__Impl rule__ColumnDeclarations__Group__2 ;
    public final void rule__ColumnDeclarations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( rule__ColumnDeclarations__Group__1__Impl rule__ColumnDeclarations__Group__2 )
            // InternalMyDsl.g:1070:2: rule__ColumnDeclarations__Group__1__Impl rule__ColumnDeclarations__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1077:1: rule__ColumnDeclarations__Group__1__Impl : ( 'Use columns :\\n' ) ;
    public final void rule__ColumnDeclarations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1081:1: ( ( 'Use columns :\\n' ) )
            // InternalMyDsl.g:1082:1: ( 'Use columns :\\n' )
            {
            // InternalMyDsl.g:1082:1: ( 'Use columns :\\n' )
            // InternalMyDsl.g:1083:2: 'Use columns :\\n'
            {
             before(grammarAccess.getColumnDeclarationsAccess().getUseColumnsKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getColumnDeclarationsAccess().getUseColumnsKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1092:1: rule__ColumnDeclarations__Group__2 : rule__ColumnDeclarations__Group__2__Impl ;
    public final void rule__ColumnDeclarations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( rule__ColumnDeclarations__Group__2__Impl )
            // InternalMyDsl.g:1097:2: rule__ColumnDeclarations__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group__2__Impl();

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
    // InternalMyDsl.g:1103:1: rule__ColumnDeclarations__Group__2__Impl : ( ( rule__ColumnDeclarations__Group_2__0 )* ) ;
    public final void rule__ColumnDeclarations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( ( ( rule__ColumnDeclarations__Group_2__0 )* ) )
            // InternalMyDsl.g:1108:1: ( ( rule__ColumnDeclarations__Group_2__0 )* )
            {
            // InternalMyDsl.g:1108:1: ( ( rule__ColumnDeclarations__Group_2__0 )* )
            // InternalMyDsl.g:1109:2: ( rule__ColumnDeclarations__Group_2__0 )*
            {
             before(grammarAccess.getColumnDeclarationsAccess().getGroup_2()); 
            // InternalMyDsl.g:1110:2: ( rule__ColumnDeclarations__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19||LA8_0==21||LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1110:3: rule__ColumnDeclarations__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ColumnDeclarations__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getColumnDeclarationsAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ColumnDeclarations__Group_2__0"
    // InternalMyDsl.g:1119:1: rule__ColumnDeclarations__Group_2__0 : rule__ColumnDeclarations__Group_2__0__Impl rule__ColumnDeclarations__Group_2__1 ;
    public final void rule__ColumnDeclarations__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( rule__ColumnDeclarations__Group_2__0__Impl rule__ColumnDeclarations__Group_2__1 )
            // InternalMyDsl.g:1124:2: rule__ColumnDeclarations__Group_2__0__Impl rule__ColumnDeclarations__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ColumnDeclarations__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group_2__1();

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
    // $ANTLR end "rule__ColumnDeclarations__Group_2__0"


    // $ANTLR start "rule__ColumnDeclarations__Group_2__0__Impl"
    // InternalMyDsl.g:1131:1: rule__ColumnDeclarations__Group_2__0__Impl : ( ( rule__ColumnDeclarations__BlocAssignment_2_0 ) ) ;
    public final void rule__ColumnDeclarations__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1135:1: ( ( ( rule__ColumnDeclarations__BlocAssignment_2_0 ) ) )
            // InternalMyDsl.g:1136:1: ( ( rule__ColumnDeclarations__BlocAssignment_2_0 ) )
            {
            // InternalMyDsl.g:1136:1: ( ( rule__ColumnDeclarations__BlocAssignment_2_0 ) )
            // InternalMyDsl.g:1137:2: ( rule__ColumnDeclarations__BlocAssignment_2_0 )
            {
             before(grammarAccess.getColumnDeclarationsAccess().getBlocAssignment_2_0()); 
            // InternalMyDsl.g:1138:2: ( rule__ColumnDeclarations__BlocAssignment_2_0 )
            // InternalMyDsl.g:1138:3: rule__ColumnDeclarations__BlocAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__BlocAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDeclarationsAccess().getBlocAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_2__0__Impl"


    // $ANTLR start "rule__ColumnDeclarations__Group_2__1"
    // InternalMyDsl.g:1146:1: rule__ColumnDeclarations__Group_2__1 : rule__ColumnDeclarations__Group_2__1__Impl ;
    public final void rule__ColumnDeclarations__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( rule__ColumnDeclarations__Group_2__1__Impl )
            // InternalMyDsl.g:1151:2: rule__ColumnDeclarations__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclarations__Group_2__1__Impl();

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
    // $ANTLR end "rule__ColumnDeclarations__Group_2__1"


    // $ANTLR start "rule__ColumnDeclarations__Group_2__1__Impl"
    // InternalMyDsl.g:1157:1: rule__ColumnDeclarations__Group_2__1__Impl : ( '\\n' ) ;
    public final void rule__ColumnDeclarations__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1161:1: ( ( '\\n' ) )
            // InternalMyDsl.g:1162:1: ( '\\n' )
            {
            // InternalMyDsl.g:1162:1: ( '\\n' )
            // InternalMyDsl.g:1163:2: '\\n'
            {
             before(grammarAccess.getColumnDeclarationsAccess().getLineFeedKeyword_2_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getColumnDeclarationsAccess().getLineFeedKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__Group_2__1__Impl"


    // $ANTLR start "rule__AlgoDeclaration__Group__0"
    // InternalMyDsl.g:1173:1: rule__AlgoDeclaration__Group__0 : rule__AlgoDeclaration__Group__0__Impl rule__AlgoDeclaration__Group__1 ;
    public final void rule__AlgoDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( rule__AlgoDeclaration__Group__0__Impl rule__AlgoDeclaration__Group__1 )
            // InternalMyDsl.g:1178:2: rule__AlgoDeclaration__Group__0__Impl rule__AlgoDeclaration__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AlgoDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlgoDeclaration__Group__1();

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
    // $ANTLR end "rule__AlgoDeclaration__Group__0"


    // $ANTLR start "rule__AlgoDeclaration__Group__0__Impl"
    // InternalMyDsl.g:1185:1: rule__AlgoDeclaration__Group__0__Impl : ( ( rule__AlgoDeclaration__NameAssignment_0 ) ) ;
    public final void rule__AlgoDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1189:1: ( ( ( rule__AlgoDeclaration__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1190:1: ( ( rule__AlgoDeclaration__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1190:1: ( ( rule__AlgoDeclaration__NameAssignment_0 ) )
            // InternalMyDsl.g:1191:2: ( rule__AlgoDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getAlgoDeclarationAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1192:2: ( rule__AlgoDeclaration__NameAssignment_0 )
            // InternalMyDsl.g:1192:3: rule__AlgoDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AlgoDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAlgoDeclarationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgoDeclaration__Group__0__Impl"


    // $ANTLR start "rule__AlgoDeclaration__Group__1"
    // InternalMyDsl.g:1200:1: rule__AlgoDeclaration__Group__1 : rule__AlgoDeclaration__Group__1__Impl rule__AlgoDeclaration__Group__2 ;
    public final void rule__AlgoDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( rule__AlgoDeclaration__Group__1__Impl rule__AlgoDeclaration__Group__2 )
            // InternalMyDsl.g:1205:2: rule__AlgoDeclaration__Group__1__Impl rule__AlgoDeclaration__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AlgoDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlgoDeclaration__Group__2();

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
    // $ANTLR end "rule__AlgoDeclaration__Group__1"


    // $ANTLR start "rule__AlgoDeclaration__Group__1__Impl"
    // InternalMyDsl.g:1212:1: rule__AlgoDeclaration__Group__1__Impl : ( 'as' ) ;
    public final void rule__AlgoDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( ( 'as' ) )
            // InternalMyDsl.g:1217:1: ( 'as' )
            {
            // InternalMyDsl.g:1217:1: ( 'as' )
            // InternalMyDsl.g:1218:2: 'as'
            {
             before(grammarAccess.getAlgoDeclarationAccess().getAsKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAlgoDeclarationAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgoDeclaration__Group__1__Impl"


    // $ANTLR start "rule__AlgoDeclaration__Group__2"
    // InternalMyDsl.g:1227:1: rule__AlgoDeclaration__Group__2 : rule__AlgoDeclaration__Group__2__Impl ;
    public final void rule__AlgoDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( rule__AlgoDeclaration__Group__2__Impl )
            // InternalMyDsl.g:1232:2: rule__AlgoDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlgoDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__AlgoDeclaration__Group__2"


    // $ANTLR start "rule__AlgoDeclaration__Group__2__Impl"
    // InternalMyDsl.g:1238:1: rule__AlgoDeclaration__Group__2__Impl : ( ( rule__AlgoDeclaration__ValueAssignment_2 ) ) ;
    public final void rule__AlgoDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( ( rule__AlgoDeclaration__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:1243:1: ( ( rule__AlgoDeclaration__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:1243:1: ( ( rule__AlgoDeclaration__ValueAssignment_2 ) )
            // InternalMyDsl.g:1244:2: ( rule__AlgoDeclaration__ValueAssignment_2 )
            {
             before(grammarAccess.getAlgoDeclarationAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:1245:2: ( rule__AlgoDeclaration__ValueAssignment_2 )
            // InternalMyDsl.g:1245:3: rule__AlgoDeclaration__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AlgoDeclaration__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlgoDeclarationAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgoDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ParaDeclaration__Group__0"
    // InternalMyDsl.g:1254:1: rule__ParaDeclaration__Group__0 : rule__ParaDeclaration__Group__0__Impl rule__ParaDeclaration__Group__1 ;
    public final void rule__ParaDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( rule__ParaDeclaration__Group__0__Impl rule__ParaDeclaration__Group__1 )
            // InternalMyDsl.g:1259:2: rule__ParaDeclaration__Group__0__Impl rule__ParaDeclaration__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ParaDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParaDeclaration__Group__1();

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
    // $ANTLR end "rule__ParaDeclaration__Group__0"


    // $ANTLR start "rule__ParaDeclaration__Group__0__Impl"
    // InternalMyDsl.g:1266:1: rule__ParaDeclaration__Group__0__Impl : ( ( rule__ParaDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ParaDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( ( ( rule__ParaDeclaration__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1271:1: ( ( rule__ParaDeclaration__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1271:1: ( ( rule__ParaDeclaration__NameAssignment_0 ) )
            // InternalMyDsl.g:1272:2: ( rule__ParaDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getParaDeclarationAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1273:2: ( rule__ParaDeclaration__NameAssignment_0 )
            // InternalMyDsl.g:1273:3: rule__ParaDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParaDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParaDeclarationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParaDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ParaDeclaration__Group__1"
    // InternalMyDsl.g:1281:1: rule__ParaDeclaration__Group__1 : rule__ParaDeclaration__Group__1__Impl rule__ParaDeclaration__Group__2 ;
    public final void rule__ParaDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( rule__ParaDeclaration__Group__1__Impl rule__ParaDeclaration__Group__2 )
            // InternalMyDsl.g:1286:2: rule__ParaDeclaration__Group__1__Impl rule__ParaDeclaration__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ParaDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParaDeclaration__Group__2();

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
    // $ANTLR end "rule__ParaDeclaration__Group__1"


    // $ANTLR start "rule__ParaDeclaration__Group__1__Impl"
    // InternalMyDsl.g:1293:1: rule__ParaDeclaration__Group__1__Impl : ( 'values' ) ;
    public final void rule__ParaDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1297:1: ( ( 'values' ) )
            // InternalMyDsl.g:1298:1: ( 'values' )
            {
            // InternalMyDsl.g:1298:1: ( 'values' )
            // InternalMyDsl.g:1299:2: 'values'
            {
             before(grammarAccess.getParaDeclarationAccess().getValuesKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParaDeclarationAccess().getValuesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParaDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ParaDeclaration__Group__2"
    // InternalMyDsl.g:1308:1: rule__ParaDeclaration__Group__2 : rule__ParaDeclaration__Group__2__Impl ;
    public final void rule__ParaDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( rule__ParaDeclaration__Group__2__Impl )
            // InternalMyDsl.g:1313:2: rule__ParaDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParaDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__ParaDeclaration__Group__2"


    // $ANTLR start "rule__ParaDeclaration__Group__2__Impl"
    // InternalMyDsl.g:1319:1: rule__ParaDeclaration__Group__2__Impl : ( ( rule__ParaDeclaration__ValueAssignment_2 ) ) ;
    public final void rule__ParaDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1323:1: ( ( ( rule__ParaDeclaration__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:1324:1: ( ( rule__ParaDeclaration__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:1324:1: ( ( rule__ParaDeclaration__ValueAssignment_2 ) )
            // InternalMyDsl.g:1325:2: ( rule__ParaDeclaration__ValueAssignment_2 )
            {
             before(grammarAccess.getParaDeclarationAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:1326:2: ( rule__ParaDeclaration__ValueAssignment_2 )
            // InternalMyDsl.g:1326:3: rule__ParaDeclaration__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParaDeclaration__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParaDeclarationAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParaDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ColumnDeclaration__Group__0"
    // InternalMyDsl.g:1335:1: rule__ColumnDeclaration__Group__0 : rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1 ;
    public final void rule__ColumnDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1339:1: ( rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1 )
            // InternalMyDsl.g:1340:2: rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ColumnDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__Group__1();

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
    // $ANTLR end "rule__ColumnDeclaration__Group__0"


    // $ANTLR start "rule__ColumnDeclaration__Group__0__Impl"
    // InternalMyDsl.g:1347:1: rule__ColumnDeclaration__Group__0__Impl : ( ( rule__ColumnDeclaration__ColumnsAssignment_0 ) ) ;
    public final void rule__ColumnDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( ( ( rule__ColumnDeclaration__ColumnsAssignment_0 ) ) )
            // InternalMyDsl.g:1352:1: ( ( rule__ColumnDeclaration__ColumnsAssignment_0 ) )
            {
            // InternalMyDsl.g:1352:1: ( ( rule__ColumnDeclaration__ColumnsAssignment_0 ) )
            // InternalMyDsl.g:1353:2: ( rule__ColumnDeclaration__ColumnsAssignment_0 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getColumnsAssignment_0()); 
            // InternalMyDsl.g:1354:2: ( rule__ColumnDeclaration__ColumnsAssignment_0 )
            // InternalMyDsl.g:1354:3: rule__ColumnDeclaration__ColumnsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__ColumnsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDeclarationAccess().getColumnsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ColumnDeclaration__Group__1"
    // InternalMyDsl.g:1362:1: rule__ColumnDeclaration__Group__1 : rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2 ;
    public final void rule__ColumnDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1366:1: ( rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2 )
            // InternalMyDsl.g:1367:2: rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ColumnDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__Group__2();

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
    // $ANTLR end "rule__ColumnDeclaration__Group__1"


    // $ANTLR start "rule__ColumnDeclaration__Group__1__Impl"
    // InternalMyDsl.g:1374:1: rule__ColumnDeclaration__Group__1__Impl : ( 'as' ) ;
    public final void rule__ColumnDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( ( 'as' ) )
            // InternalMyDsl.g:1379:1: ( 'as' )
            {
            // InternalMyDsl.g:1379:1: ( 'as' )
            // InternalMyDsl.g:1380:2: 'as'
            {
             before(grammarAccess.getColumnDeclarationAccess().getAsKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getColumnDeclarationAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ColumnDeclaration__Group__2"
    // InternalMyDsl.g:1389:1: rule__ColumnDeclaration__Group__2 : rule__ColumnDeclaration__Group__2__Impl ;
    public final void rule__ColumnDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( rule__ColumnDeclaration__Group__2__Impl )
            // InternalMyDsl.g:1394:2: rule__ColumnDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__ColumnDeclaration__Group__2"


    // $ANTLR start "rule__ColumnDeclaration__Group__2__Impl"
    // InternalMyDsl.g:1400:1: rule__ColumnDeclaration__Group__2__Impl : ( ( rule__ColumnDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ColumnDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( ( ( rule__ColumnDeclaration__TypeAssignment_2 ) ) )
            // InternalMyDsl.g:1405:1: ( ( rule__ColumnDeclaration__TypeAssignment_2 ) )
            {
            // InternalMyDsl.g:1405:1: ( ( rule__ColumnDeclaration__TypeAssignment_2 ) )
            // InternalMyDsl.g:1406:2: ( rule__ColumnDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:1407:2: ( rule__ColumnDeclaration__TypeAssignment_2 )
            // InternalMyDsl.g:1407:3: rule__ColumnDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnDeclarationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ColumnSet__Group_0__0"
    // InternalMyDsl.g:1416:1: rule__ColumnSet__Group_0__0 : rule__ColumnSet__Group_0__0__Impl rule__ColumnSet__Group_0__1 ;
    public final void rule__ColumnSet__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( rule__ColumnSet__Group_0__0__Impl rule__ColumnSet__Group_0__1 )
            // InternalMyDsl.g:1421:2: rule__ColumnSet__Group_0__0__Impl rule__ColumnSet__Group_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1428:1: rule__ColumnSet__Group_0__0__Impl : ( '(' ) ;
    public final void rule__ColumnSet__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1432:1: ( ( '(' ) )
            // InternalMyDsl.g:1433:1: ( '(' )
            {
            // InternalMyDsl.g:1433:1: ( '(' )
            // InternalMyDsl.g:1434:2: '('
            {
             before(grammarAccess.getColumnSetAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1443:1: rule__ColumnSet__Group_0__1 : rule__ColumnSet__Group_0__1__Impl rule__ColumnSet__Group_0__2 ;
    public final void rule__ColumnSet__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( rule__ColumnSet__Group_0__1__Impl rule__ColumnSet__Group_0__2 )
            // InternalMyDsl.g:1448:2: rule__ColumnSet__Group_0__1__Impl rule__ColumnSet__Group_0__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1455:1: rule__ColumnSet__Group_0__1__Impl : ( ( rule__ColumnSet__ArgBin1Assignment_0_1 ) ) ;
    public final void rule__ColumnSet__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1459:1: ( ( ( rule__ColumnSet__ArgBin1Assignment_0_1 ) ) )
            // InternalMyDsl.g:1460:1: ( ( rule__ColumnSet__ArgBin1Assignment_0_1 ) )
            {
            // InternalMyDsl.g:1460:1: ( ( rule__ColumnSet__ArgBin1Assignment_0_1 ) )
            // InternalMyDsl.g:1461:2: ( rule__ColumnSet__ArgBin1Assignment_0_1 )
            {
             before(grammarAccess.getColumnSetAccess().getArgBin1Assignment_0_1()); 
            // InternalMyDsl.g:1462:2: ( rule__ColumnSet__ArgBin1Assignment_0_1 )
            // InternalMyDsl.g:1462:3: rule__ColumnSet__ArgBin1Assignment_0_1
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
    // InternalMyDsl.g:1470:1: rule__ColumnSet__Group_0__2 : rule__ColumnSet__Group_0__2__Impl rule__ColumnSet__Group_0__3 ;
    public final void rule__ColumnSet__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1474:1: ( rule__ColumnSet__Group_0__2__Impl rule__ColumnSet__Group_0__3 )
            // InternalMyDsl.g:1475:2: rule__ColumnSet__Group_0__2__Impl rule__ColumnSet__Group_0__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1482:1: rule__ColumnSet__Group_0__2__Impl : ( ')' ) ;
    public final void rule__ColumnSet__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1486:1: ( ( ')' ) )
            // InternalMyDsl.g:1487:1: ( ')' )
            {
            // InternalMyDsl.g:1487:1: ( ')' )
            // InternalMyDsl.g:1488:2: ')'
            {
             before(grammarAccess.getColumnSetAccess().getRightParenthesisKeyword_0_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1497:1: rule__ColumnSet__Group_0__3 : rule__ColumnSet__Group_0__3__Impl rule__ColumnSet__Group_0__4 ;
    public final void rule__ColumnSet__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1501:1: ( rule__ColumnSet__Group_0__3__Impl rule__ColumnSet__Group_0__4 )
            // InternalMyDsl.g:1502:2: rule__ColumnSet__Group_0__3__Impl rule__ColumnSet__Group_0__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1509:1: rule__ColumnSet__Group_0__3__Impl : ( ( rule__ColumnSet__OpTypeAssignment_0_3 ) ) ;
    public final void rule__ColumnSet__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1513:1: ( ( ( rule__ColumnSet__OpTypeAssignment_0_3 ) ) )
            // InternalMyDsl.g:1514:1: ( ( rule__ColumnSet__OpTypeAssignment_0_3 ) )
            {
            // InternalMyDsl.g:1514:1: ( ( rule__ColumnSet__OpTypeAssignment_0_3 ) )
            // InternalMyDsl.g:1515:2: ( rule__ColumnSet__OpTypeAssignment_0_3 )
            {
             before(grammarAccess.getColumnSetAccess().getOpTypeAssignment_0_3()); 
            // InternalMyDsl.g:1516:2: ( rule__ColumnSet__OpTypeAssignment_0_3 )
            // InternalMyDsl.g:1516:3: rule__ColumnSet__OpTypeAssignment_0_3
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
    // InternalMyDsl.g:1524:1: rule__ColumnSet__Group_0__4 : rule__ColumnSet__Group_0__4__Impl rule__ColumnSet__Group_0__5 ;
    public final void rule__ColumnSet__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1528:1: ( rule__ColumnSet__Group_0__4__Impl rule__ColumnSet__Group_0__5 )
            // InternalMyDsl.g:1529:2: rule__ColumnSet__Group_0__4__Impl rule__ColumnSet__Group_0__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1536:1: rule__ColumnSet__Group_0__4__Impl : ( '(' ) ;
    public final void rule__ColumnSet__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1540:1: ( ( '(' ) )
            // InternalMyDsl.g:1541:1: ( '(' )
            {
            // InternalMyDsl.g:1541:1: ( '(' )
            // InternalMyDsl.g:1542:2: '('
            {
             before(grammarAccess.getColumnSetAccess().getLeftParenthesisKeyword_0_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:1551:1: rule__ColumnSet__Group_0__5 : rule__ColumnSet__Group_0__5__Impl rule__ColumnSet__Group_0__6 ;
    public final void rule__ColumnSet__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1555:1: ( rule__ColumnSet__Group_0__5__Impl rule__ColumnSet__Group_0__6 )
            // InternalMyDsl.g:1556:2: rule__ColumnSet__Group_0__5__Impl rule__ColumnSet__Group_0__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1563:1: rule__ColumnSet__Group_0__5__Impl : ( ( rule__ColumnSet__ArgBin2Assignment_0_5 ) ) ;
    public final void rule__ColumnSet__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1567:1: ( ( ( rule__ColumnSet__ArgBin2Assignment_0_5 ) ) )
            // InternalMyDsl.g:1568:1: ( ( rule__ColumnSet__ArgBin2Assignment_0_5 ) )
            {
            // InternalMyDsl.g:1568:1: ( ( rule__ColumnSet__ArgBin2Assignment_0_5 ) )
            // InternalMyDsl.g:1569:2: ( rule__ColumnSet__ArgBin2Assignment_0_5 )
            {
             before(grammarAccess.getColumnSetAccess().getArgBin2Assignment_0_5()); 
            // InternalMyDsl.g:1570:2: ( rule__ColumnSet__ArgBin2Assignment_0_5 )
            // InternalMyDsl.g:1570:3: rule__ColumnSet__ArgBin2Assignment_0_5
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
    // InternalMyDsl.g:1578:1: rule__ColumnSet__Group_0__6 : rule__ColumnSet__Group_0__6__Impl ;
    public final void rule__ColumnSet__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1582:1: ( rule__ColumnSet__Group_0__6__Impl )
            // InternalMyDsl.g:1583:2: rule__ColumnSet__Group_0__6__Impl
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
    // InternalMyDsl.g:1589:1: rule__ColumnSet__Group_0__6__Impl : ( ')' ) ;
    public final void rule__ColumnSet__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( ')' ) )
            // InternalMyDsl.g:1594:1: ( ')' )
            {
            // InternalMyDsl.g:1594:1: ( ')' )
            // InternalMyDsl.g:1595:2: ')'
            {
             before(grammarAccess.getColumnSetAccess().getRightParenthesisKeyword_0_6()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1605:1: rule__ColumnSet__Group_1__0 : rule__ColumnSet__Group_1__0__Impl rule__ColumnSet__Group_1__1 ;
    public final void rule__ColumnSet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( rule__ColumnSet__Group_1__0__Impl rule__ColumnSet__Group_1__1 )
            // InternalMyDsl.g:1610:2: rule__ColumnSet__Group_1__0__Impl rule__ColumnSet__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1617:1: rule__ColumnSet__Group_1__0__Impl : ( 'From' ) ;
    public final void rule__ColumnSet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1621:1: ( ( 'From' ) )
            // InternalMyDsl.g:1622:1: ( 'From' )
            {
            // InternalMyDsl.g:1622:1: ( 'From' )
            // InternalMyDsl.g:1623:2: 'From'
            {
             before(grammarAccess.getColumnSetAccess().getFromKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getFromKeyword_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1632:1: rule__ColumnSet__Group_1__1 : rule__ColumnSet__Group_1__1__Impl rule__ColumnSet__Group_1__2 ;
    public final void rule__ColumnSet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( rule__ColumnSet__Group_1__1__Impl rule__ColumnSet__Group_1__2 )
            // InternalMyDsl.g:1637:2: rule__ColumnSet__Group_1__1__Impl rule__ColumnSet__Group_1__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1644:1: rule__ColumnSet__Group_1__1__Impl : ( ( rule__ColumnSet__ArgR1Assignment_1_1 ) ) ;
    public final void rule__ColumnSet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1648:1: ( ( ( rule__ColumnSet__ArgR1Assignment_1_1 ) ) )
            // InternalMyDsl.g:1649:1: ( ( rule__ColumnSet__ArgR1Assignment_1_1 ) )
            {
            // InternalMyDsl.g:1649:1: ( ( rule__ColumnSet__ArgR1Assignment_1_1 ) )
            // InternalMyDsl.g:1650:2: ( rule__ColumnSet__ArgR1Assignment_1_1 )
            {
             before(grammarAccess.getColumnSetAccess().getArgR1Assignment_1_1()); 
            // InternalMyDsl.g:1651:2: ( rule__ColumnSet__ArgR1Assignment_1_1 )
            // InternalMyDsl.g:1651:3: rule__ColumnSet__ArgR1Assignment_1_1
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
    // InternalMyDsl.g:1659:1: rule__ColumnSet__Group_1__2 : rule__ColumnSet__Group_1__2__Impl rule__ColumnSet__Group_1__3 ;
    public final void rule__ColumnSet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( rule__ColumnSet__Group_1__2__Impl rule__ColumnSet__Group_1__3 )
            // InternalMyDsl.g:1664:2: rule__ColumnSet__Group_1__2__Impl rule__ColumnSet__Group_1__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1671:1: rule__ColumnSet__Group_1__2__Impl : ( 'to' ) ;
    public final void rule__ColumnSet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1675:1: ( ( 'to' ) )
            // InternalMyDsl.g:1676:1: ( 'to' )
            {
            // InternalMyDsl.g:1676:1: ( 'to' )
            // InternalMyDsl.g:1677:2: 'to'
            {
             before(grammarAccess.getColumnSetAccess().getToKeyword_1_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1686:1: rule__ColumnSet__Group_1__3 : rule__ColumnSet__Group_1__3__Impl ;
    public final void rule__ColumnSet__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( rule__ColumnSet__Group_1__3__Impl )
            // InternalMyDsl.g:1691:2: rule__ColumnSet__Group_1__3__Impl
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
    // InternalMyDsl.g:1697:1: rule__ColumnSet__Group_1__3__Impl : ( ( rule__ColumnSet__ArgR2Assignment_1_3 ) ) ;
    public final void rule__ColumnSet__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1701:1: ( ( ( rule__ColumnSet__ArgR2Assignment_1_3 ) ) )
            // InternalMyDsl.g:1702:1: ( ( rule__ColumnSet__ArgR2Assignment_1_3 ) )
            {
            // InternalMyDsl.g:1702:1: ( ( rule__ColumnSet__ArgR2Assignment_1_3 ) )
            // InternalMyDsl.g:1703:2: ( rule__ColumnSet__ArgR2Assignment_1_3 )
            {
             before(grammarAccess.getColumnSetAccess().getArgR2Assignment_1_3()); 
            // InternalMyDsl.g:1704:2: ( rule__ColumnSet__ArgR2Assignment_1_3 )
            // InternalMyDsl.g:1704:3: rule__ColumnSet__ArgR2Assignment_1_3
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
    // InternalMyDsl.g:1713:1: rule__ColumnSet__Group_2__0 : rule__ColumnSet__Group_2__0__Impl rule__ColumnSet__Group_2__1 ;
    public final void rule__ColumnSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1717:1: ( rule__ColumnSet__Group_2__0__Impl rule__ColumnSet__Group_2__1 )
            // InternalMyDsl.g:1718:2: rule__ColumnSet__Group_2__0__Impl rule__ColumnSet__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1725:1: rule__ColumnSet__Group_2__0__Impl : ( '[' ) ;
    public final void rule__ColumnSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1729:1: ( ( '[' ) )
            // InternalMyDsl.g:1730:1: ( '[' )
            {
            // InternalMyDsl.g:1730:1: ( '[' )
            // InternalMyDsl.g:1731:2: '['
            {
             before(grammarAccess.getColumnSetAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getColumnSetAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1740:1: rule__ColumnSet__Group_2__1 : rule__ColumnSet__Group_2__1__Impl rule__ColumnSet__Group_2__2 ;
    public final void rule__ColumnSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( rule__ColumnSet__Group_2__1__Impl rule__ColumnSet__Group_2__2 )
            // InternalMyDsl.g:1745:2: rule__ColumnSet__Group_2__1__Impl rule__ColumnSet__Group_2__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1752:1: rule__ColumnSet__Group_2__1__Impl : ( ( rule__ColumnSet__Group_2_1__0 )* ) ;
    public final void rule__ColumnSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( ( ( rule__ColumnSet__Group_2_1__0 )* ) )
            // InternalMyDsl.g:1757:1: ( ( rule__ColumnSet__Group_2_1__0 )* )
            {
            // InternalMyDsl.g:1757:1: ( ( rule__ColumnSet__Group_2_1__0 )* )
            // InternalMyDsl.g:1758:2: ( rule__ColumnSet__Group_2_1__0 )*
            {
             before(grammarAccess.getColumnSetAccess().getGroup_2_1()); 
            // InternalMyDsl.g:1759:2: ( rule__ColumnSet__Group_2_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==25) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1759:3: rule__ColumnSet__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ColumnSet__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMyDsl.g:1767:1: rule__ColumnSet__Group_2__2 : rule__ColumnSet__Group_2__2__Impl rule__ColumnSet__Group_2__3 ;
    public final void rule__ColumnSet__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1771:1: ( rule__ColumnSet__Group_2__2__Impl rule__ColumnSet__Group_2__3 )
            // InternalMyDsl.g:1772:2: rule__ColumnSet__Group_2__2__Impl rule__ColumnSet__Group_2__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:1779:1: rule__ColumnSet__Group_2__2__Impl : ( ( rule__ColumnSet__ArgListAssignment_2_2 ) ) ;
    public final void rule__ColumnSet__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1783:1: ( ( ( rule__ColumnSet__ArgListAssignment_2_2 ) ) )
            // InternalMyDsl.g:1784:1: ( ( rule__ColumnSet__ArgListAssignment_2_2 ) )
            {
            // InternalMyDsl.g:1784:1: ( ( rule__ColumnSet__ArgListAssignment_2_2 ) )
            // InternalMyDsl.g:1785:2: ( rule__ColumnSet__ArgListAssignment_2_2 )
            {
             before(grammarAccess.getColumnSetAccess().getArgListAssignment_2_2()); 
            // InternalMyDsl.g:1786:2: ( rule__ColumnSet__ArgListAssignment_2_2 )
            // InternalMyDsl.g:1786:3: rule__ColumnSet__ArgListAssignment_2_2
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
    // InternalMyDsl.g:1794:1: rule__ColumnSet__Group_2__3 : rule__ColumnSet__Group_2__3__Impl ;
    public final void rule__ColumnSet__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( rule__ColumnSet__Group_2__3__Impl )
            // InternalMyDsl.g:1799:2: rule__ColumnSet__Group_2__3__Impl
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
    // InternalMyDsl.g:1805:1: rule__ColumnSet__Group_2__3__Impl : ( ']' ) ;
    public final void rule__ColumnSet__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1809:1: ( ( ']' ) )
            // InternalMyDsl.g:1810:1: ( ']' )
            {
            // InternalMyDsl.g:1810:1: ( ']' )
            // InternalMyDsl.g:1811:2: ']'
            {
             before(grammarAccess.getColumnSetAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1821:1: rule__ColumnSet__Group_2_1__0 : rule__ColumnSet__Group_2_1__0__Impl rule__ColumnSet__Group_2_1__1 ;
    public final void rule__ColumnSet__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1825:1: ( rule__ColumnSet__Group_2_1__0__Impl rule__ColumnSet__Group_2_1__1 )
            // InternalMyDsl.g:1826:2: rule__ColumnSet__Group_2_1__0__Impl rule__ColumnSet__Group_2_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:1833:1: rule__ColumnSet__Group_2_1__0__Impl : ( ( rule__ColumnSet__ArgListAssignment_2_1_0 ) ) ;
    public final void rule__ColumnSet__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1837:1: ( ( ( rule__ColumnSet__ArgListAssignment_2_1_0 ) ) )
            // InternalMyDsl.g:1838:1: ( ( rule__ColumnSet__ArgListAssignment_2_1_0 ) )
            {
            // InternalMyDsl.g:1838:1: ( ( rule__ColumnSet__ArgListAssignment_2_1_0 ) )
            // InternalMyDsl.g:1839:2: ( rule__ColumnSet__ArgListAssignment_2_1_0 )
            {
             before(grammarAccess.getColumnSetAccess().getArgListAssignment_2_1_0()); 
            // InternalMyDsl.g:1840:2: ( rule__ColumnSet__ArgListAssignment_2_1_0 )
            // InternalMyDsl.g:1840:3: rule__ColumnSet__ArgListAssignment_2_1_0
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
    // InternalMyDsl.g:1848:1: rule__ColumnSet__Group_2_1__1 : rule__ColumnSet__Group_2_1__1__Impl ;
    public final void rule__ColumnSet__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( rule__ColumnSet__Group_2_1__1__Impl )
            // InternalMyDsl.g:1853:2: rule__ColumnSet__Group_2_1__1__Impl
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
    // InternalMyDsl.g:1859:1: rule__ColumnSet__Group_2_1__1__Impl : ( ',' ) ;
    public final void rule__ColumnSet__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1863:1: ( ( ',' ) )
            // InternalMyDsl.g:1864:1: ( ',' )
            {
            // InternalMyDsl.g:1864:1: ( ',' )
            // InternalMyDsl.g:1865:2: ','
            {
             before(grammarAccess.getColumnSetAccess().getCommaKeyword_2_1_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1875:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMyDsl.g:1880:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:1887:1: rule__FLOAT__Group__0__Impl : ( ( rule__FLOAT__IntPartAssignment_0 ) ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1891:1: ( ( ( rule__FLOAT__IntPartAssignment_0 ) ) )
            // InternalMyDsl.g:1892:1: ( ( rule__FLOAT__IntPartAssignment_0 ) )
            {
            // InternalMyDsl.g:1892:1: ( ( rule__FLOAT__IntPartAssignment_0 ) )
            // InternalMyDsl.g:1893:2: ( rule__FLOAT__IntPartAssignment_0 )
            {
             before(grammarAccess.getFLOATAccess().getIntPartAssignment_0()); 
            // InternalMyDsl.g:1894:2: ( rule__FLOAT__IntPartAssignment_0 )
            // InternalMyDsl.g:1894:3: rule__FLOAT__IntPartAssignment_0
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
    // InternalMyDsl.g:1902:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1906:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalMyDsl.g:1907:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1914:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1918:1: ( ( '.' ) )
            // InternalMyDsl.g:1919:1: ( '.' )
            {
            // InternalMyDsl.g:1919:1: ( '.' )
            // InternalMyDsl.g:1920:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1929:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( rule__FLOAT__Group__2__Impl )
            // InternalMyDsl.g:1934:2: rule__FLOAT__Group__2__Impl
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
    // InternalMyDsl.g:1940:1: rule__FLOAT__Group__2__Impl : ( ( rule__FLOAT__DecPartAssignment_2 ) ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1944:1: ( ( ( rule__FLOAT__DecPartAssignment_2 ) ) )
            // InternalMyDsl.g:1945:1: ( ( rule__FLOAT__DecPartAssignment_2 ) )
            {
            // InternalMyDsl.g:1945:1: ( ( rule__FLOAT__DecPartAssignment_2 ) )
            // InternalMyDsl.g:1946:2: ( rule__FLOAT__DecPartAssignment_2 )
            {
             before(grammarAccess.getFLOATAccess().getDecPartAssignment_2()); 
            // InternalMyDsl.g:1947:2: ( rule__FLOAT__DecPartAssignment_2 )
            // InternalMyDsl.g:1947:3: rule__FLOAT__DecPartAssignment_2
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


    // $ANTLR start "rule__Program__BlocsFileAssignment_0"
    // InternalMyDsl.g:1956:1: rule__Program__BlocsFileAssignment_0 : ( ruleFile ) ;
    public final void rule__Program__BlocsFileAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1960:1: ( ( ruleFile ) )
            // InternalMyDsl.g:1961:2: ( ruleFile )
            {
            // InternalMyDsl.g:1961:2: ( ruleFile )
            // InternalMyDsl.g:1962:3: ruleFile
            {
             before(grammarAccess.getProgramAccess().getBlocsFileFileParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getBlocsFileFileParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__BlocsFileAssignment_0"


    // $ANTLR start "rule__Program__BlocsAlgoAssignment_1"
    // InternalMyDsl.g:1971:1: rule__Program__BlocsAlgoAssignment_1 : ( ruleAlgorithm ) ;
    public final void rule__Program__BlocsAlgoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( ( ruleAlgorithm ) )
            // InternalMyDsl.g:1976:2: ( ruleAlgorithm )
            {
            // InternalMyDsl.g:1976:2: ( ruleAlgorithm )
            // InternalMyDsl.g:1977:3: ruleAlgorithm
            {
             before(grammarAccess.getProgramAccess().getBlocsAlgoAlgorithmParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgorithm();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getBlocsAlgoAlgorithmParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__BlocsAlgoAssignment_1"


    // $ANTLR start "rule__Program__BlocsParaAssignment_2"
    // InternalMyDsl.g:1986:1: rule__Program__BlocsParaAssignment_2 : ( ruleParameterDeclaration ) ;
    public final void rule__Program__BlocsParaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1990:1: ( ( ruleParameterDeclaration ) )
            // InternalMyDsl.g:1991:2: ( ruleParameterDeclaration )
            {
            // InternalMyDsl.g:1991:2: ( ruleParameterDeclaration )
            // InternalMyDsl.g:1992:3: ruleParameterDeclaration
            {
             before(grammarAccess.getProgramAccess().getBlocsParaParameterDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getBlocsParaParameterDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__BlocsParaAssignment_2"


    // $ANTLR start "rule__Program__BlocsColuAssignment_3"
    // InternalMyDsl.g:2001:1: rule__Program__BlocsColuAssignment_3 : ( ruleColumnDeclarations ) ;
    public final void rule__Program__BlocsColuAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2005:1: ( ( ruleColumnDeclarations ) )
            // InternalMyDsl.g:2006:2: ( ruleColumnDeclarations )
            {
            // InternalMyDsl.g:2006:2: ( ruleColumnDeclarations )
            // InternalMyDsl.g:2007:3: ruleColumnDeclarations
            {
             before(grammarAccess.getProgramAccess().getBlocsColuColumnDeclarationsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnDeclarations();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getBlocsColuColumnDeclarationsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__BlocsColuAssignment_3"


    // $ANTLR start "rule__File__PATHAssignment_1"
    // InternalMyDsl.g:2016:1: rule__File__PATHAssignment_1 : ( RULE_STRING ) ;
    public final void rule__File__PATHAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2020:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2021:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2021:2: ( RULE_STRING )
            // InternalMyDsl.g:2022:3: RULE_STRING
            {
             before(grammarAccess.getFileAccess().getPATHSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getPATHSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__PATHAssignment_1"


    // $ANTLR start "rule__Algorithm__NameAssignment_2"
    // InternalMyDsl.g:2031:1: rule__Algorithm__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Algorithm__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2035:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2036:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2036:2: ( RULE_ID )
            // InternalMyDsl.g:2037:3: RULE_ID
            {
             before(grammarAccess.getAlgorithmAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__NameAssignment_2"


    // $ANTLR start "rule__Algorithm__BlocAssignment_4_0"
    // InternalMyDsl.g:2046:1: rule__Algorithm__BlocAssignment_4_0 : ( ruleAlgoDeclaration ) ;
    public final void rule__Algorithm__BlocAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( ( ruleAlgoDeclaration ) )
            // InternalMyDsl.g:2051:2: ( ruleAlgoDeclaration )
            {
            // InternalMyDsl.g:2051:2: ( ruleAlgoDeclaration )
            // InternalMyDsl.g:2052:3: ruleAlgoDeclaration
            {
             before(grammarAccess.getAlgorithmAccess().getBlocAlgoDeclarationParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgoDeclaration();

            state._fsp--;

             after(grammarAccess.getAlgorithmAccess().getBlocAlgoDeclarationParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__BlocAssignment_4_0"


    // $ANTLR start "rule__ParameterDeclaration__BlocAssignment_2_0"
    // InternalMyDsl.g:2061:1: rule__ParameterDeclaration__BlocAssignment_2_0 : ( ruleParaDeclaration ) ;
    public final void rule__ParameterDeclaration__BlocAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2065:1: ( ( ruleParaDeclaration ) )
            // InternalMyDsl.g:2066:2: ( ruleParaDeclaration )
            {
            // InternalMyDsl.g:2066:2: ( ruleParaDeclaration )
            // InternalMyDsl.g:2067:3: ruleParaDeclaration
            {
             before(grammarAccess.getParameterDeclarationAccess().getBlocParaDeclarationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParaDeclaration();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationAccess().getBlocParaDeclarationParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__BlocAssignment_2_0"


    // $ANTLR start "rule__ColumnDeclarations__BlocAssignment_2_0"
    // InternalMyDsl.g:2076:1: rule__ColumnDeclarations__BlocAssignment_2_0 : ( ruleColumnDeclaration ) ;
    public final void rule__ColumnDeclarations__BlocAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2080:1: ( ( ruleColumnDeclaration ) )
            // InternalMyDsl.g:2081:2: ( ruleColumnDeclaration )
            {
            // InternalMyDsl.g:2081:2: ( ruleColumnDeclaration )
            // InternalMyDsl.g:2082:3: ruleColumnDeclaration
            {
             before(grammarAccess.getColumnDeclarationsAccess().getBlocColumnDeclarationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnDeclaration();

            state._fsp--;

             after(grammarAccess.getColumnDeclarationsAccess().getBlocColumnDeclarationParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclarations__BlocAssignment_2_0"


    // $ANTLR start "rule__AlgoDeclaration__NameAssignment_0"
    // InternalMyDsl.g:2091:1: rule__AlgoDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AlgoDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2095:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2096:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2096:2: ( RULE_ID )
            // InternalMyDsl.g:2097:3: RULE_ID
            {
             before(grammarAccess.getAlgoDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlgoDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgoDeclaration__NameAssignment_0"


    // $ANTLR start "rule__AlgoDeclaration__ValueAssignment_2"
    // InternalMyDsl.g:2106:1: rule__AlgoDeclaration__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__AlgoDeclaration__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2110:1: ( ( ruleValue ) )
            // InternalMyDsl.g:2111:2: ( ruleValue )
            {
            // InternalMyDsl.g:2111:2: ( ruleValue )
            // InternalMyDsl.g:2112:3: ruleValue
            {
             before(grammarAccess.getAlgoDeclarationAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAlgoDeclarationAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgoDeclaration__ValueAssignment_2"


    // $ANTLR start "rule__ParaDeclaration__NameAssignment_0"
    // InternalMyDsl.g:2121:1: rule__ParaDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ParaDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2125:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2126:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2126:2: ( RULE_ID )
            // InternalMyDsl.g:2127:3: RULE_ID
            {
             before(grammarAccess.getParaDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParaDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParaDeclaration__NameAssignment_0"


    // $ANTLR start "rule__ParaDeclaration__ValueAssignment_2"
    // InternalMyDsl.g:2136:1: rule__ParaDeclaration__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__ParaDeclaration__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2140:1: ( ( ruleValue ) )
            // InternalMyDsl.g:2141:2: ( ruleValue )
            {
            // InternalMyDsl.g:2141:2: ( ruleValue )
            // InternalMyDsl.g:2142:3: ruleValue
            {
             before(grammarAccess.getParaDeclarationAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getParaDeclarationAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParaDeclaration__ValueAssignment_2"


    // $ANTLR start "rule__ColumnDeclaration__ColumnsAssignment_0"
    // InternalMyDsl.g:2151:1: rule__ColumnDeclaration__ColumnsAssignment_0 : ( ruleColumnSet ) ;
    public final void rule__ColumnDeclaration__ColumnsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2155:1: ( ( ruleColumnSet ) )
            // InternalMyDsl.g:2156:2: ( ruleColumnSet )
            {
            // InternalMyDsl.g:2156:2: ( ruleColumnSet )
            // InternalMyDsl.g:2157:3: ruleColumnSet
            {
             before(grammarAccess.getColumnDeclarationAccess().getColumnsColumnSetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnSet();

            state._fsp--;

             after(grammarAccess.getColumnDeclarationAccess().getColumnsColumnSetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__ColumnsAssignment_0"


    // $ANTLR start "rule__ColumnDeclaration__TypeAssignment_2"
    // InternalMyDsl.g:2166:1: rule__ColumnDeclaration__TypeAssignment_2 : ( ruleTargetPredictive ) ;
    public final void rule__ColumnDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( ( ruleTargetPredictive ) )
            // InternalMyDsl.g:2171:2: ( ruleTargetPredictive )
            {
            // InternalMyDsl.g:2171:2: ( ruleTargetPredictive )
            // InternalMyDsl.g:2172:3: ruleTargetPredictive
            {
             before(grammarAccess.getColumnDeclarationAccess().getTypeTargetPredictiveParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetPredictive();

            state._fsp--;

             after(grammarAccess.getColumnDeclarationAccess().getTypeTargetPredictiveParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__TypeAssignment_2"


    // $ANTLR start "rule__ColumnSet__ArgBin1Assignment_0_1"
    // InternalMyDsl.g:2181:1: rule__ColumnSet__ArgBin1Assignment_0_1 : ( ruleColumnSet ) ;
    public final void rule__ColumnSet__ArgBin1Assignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( ( ruleColumnSet ) )
            // InternalMyDsl.g:2186:2: ( ruleColumnSet )
            {
            // InternalMyDsl.g:2186:2: ( ruleColumnSet )
            // InternalMyDsl.g:2187:3: ruleColumnSet
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
    // InternalMyDsl.g:2196:1: rule__ColumnSet__OpTypeAssignment_0_3 : ( ruleBinop ) ;
    public final void rule__ColumnSet__OpTypeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2200:1: ( ( ruleBinop ) )
            // InternalMyDsl.g:2201:2: ( ruleBinop )
            {
            // InternalMyDsl.g:2201:2: ( ruleBinop )
            // InternalMyDsl.g:2202:3: ruleBinop
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
    // InternalMyDsl.g:2211:1: rule__ColumnSet__ArgBin2Assignment_0_5 : ( ruleColumnSet ) ;
    public final void rule__ColumnSet__ArgBin2Assignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( ( ruleColumnSet ) )
            // InternalMyDsl.g:2216:2: ( ruleColumnSet )
            {
            // InternalMyDsl.g:2216:2: ( ruleColumnSet )
            // InternalMyDsl.g:2217:3: ruleColumnSet
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


    // $ANTLR start "rule__ColumnSet__ArgR1Assignment_1_1"
    // InternalMyDsl.g:2226:1: rule__ColumnSet__ArgR1Assignment_1_1 : ( RULE_INT ) ;
    public final void rule__ColumnSet__ArgR1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2231:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2231:2: ( RULE_INT )
            // InternalMyDsl.g:2232:3: RULE_INT
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
    // InternalMyDsl.g:2241:1: rule__ColumnSet__ArgR2Assignment_1_3 : ( RULE_INT ) ;
    public final void rule__ColumnSet__ArgR2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2245:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2246:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2246:2: ( RULE_INT )
            // InternalMyDsl.g:2247:3: RULE_INT
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


    // $ANTLR start "rule__ColumnSet__ArgListAssignment_2_1_0"
    // InternalMyDsl.g:2256:1: rule__ColumnSet__ArgListAssignment_2_1_0 : ( RULE_INT ) ;
    public final void rule__ColumnSet__ArgListAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2260:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2261:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2261:2: ( RULE_INT )
            // InternalMyDsl.g:2262:3: RULE_INT
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
    // InternalMyDsl.g:2271:1: rule__ColumnSet__ArgListAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__ColumnSet__ArgListAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2275:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2276:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2276:2: ( RULE_INT )
            // InternalMyDsl.g:2277:3: RULE_INT
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
    // InternalMyDsl.g:2286:1: rule__Binop__TypeAssignment_0 : ( ( 'and' ) ) ;
    public final void rule__Binop__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2290:1: ( ( ( 'and' ) ) )
            // InternalMyDsl.g:2291:2: ( ( 'and' ) )
            {
            // InternalMyDsl.g:2291:2: ( ( 'and' ) )
            // InternalMyDsl.g:2292:3: ( 'and' )
            {
             before(grammarAccess.getBinopAccess().getTypeAndKeyword_0_0()); 
            // InternalMyDsl.g:2293:3: ( 'and' )
            // InternalMyDsl.g:2294:4: 'and'
            {
             before(grammarAccess.getBinopAccess().getTypeAndKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2305:1: rule__Binop__TypeAssignment_1 : ( ( 'except' ) ) ;
    public final void rule__Binop__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2309:1: ( ( ( 'except' ) ) )
            // InternalMyDsl.g:2310:2: ( ( 'except' ) )
            {
            // InternalMyDsl.g:2310:2: ( ( 'except' ) )
            // InternalMyDsl.g:2311:3: ( 'except' )
            {
             before(grammarAccess.getBinopAccess().getTypeExceptKeyword_1_0()); 
            // InternalMyDsl.g:2312:3: ( 'except' )
            // InternalMyDsl.g:2313:4: 'except'
            {
             before(grammarAccess.getBinopAccess().getTypeExceptKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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


    // $ANTLR start "rule__TargetPredictive__TypeAssignment_0"
    // InternalMyDsl.g:2324:1: rule__TargetPredictive__TypeAssignment_0 : ( ( 'target' ) ) ;
    public final void rule__TargetPredictive__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2328:1: ( ( ( 'target' ) ) )
            // InternalMyDsl.g:2329:2: ( ( 'target' ) )
            {
            // InternalMyDsl.g:2329:2: ( ( 'target' ) )
            // InternalMyDsl.g:2330:3: ( 'target' )
            {
             before(grammarAccess.getTargetPredictiveAccess().getTypeTargetKeyword_0_0()); 
            // InternalMyDsl.g:2331:3: ( 'target' )
            // InternalMyDsl.g:2332:4: 'target'
            {
             before(grammarAccess.getTargetPredictiveAccess().getTypeTargetKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTargetPredictiveAccess().getTypeTargetKeyword_0_0()); 

            }

             after(grammarAccess.getTargetPredictiveAccess().getTypeTargetKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPredictive__TypeAssignment_0"


    // $ANTLR start "rule__TargetPredictive__TypeAssignment_1"
    // InternalMyDsl.g:2343:1: rule__TargetPredictive__TypeAssignment_1 : ( ( 'predictive' ) ) ;
    public final void rule__TargetPredictive__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( ( ( 'predictive' ) ) )
            // InternalMyDsl.g:2348:2: ( ( 'predictive' ) )
            {
            // InternalMyDsl.g:2348:2: ( ( 'predictive' ) )
            // InternalMyDsl.g:2349:3: ( 'predictive' )
            {
             before(grammarAccess.getTargetPredictiveAccess().getTypePredictiveKeyword_1_0()); 
            // InternalMyDsl.g:2350:3: ( 'predictive' )
            // InternalMyDsl.g:2351:4: 'predictive'
            {
             before(grammarAccess.getTargetPredictiveAccess().getTypePredictiveKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTargetPredictiveAccess().getTypePredictiveKeyword_1_0()); 

            }

             after(grammarAccess.getTargetPredictiveAccess().getTypePredictiveKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPredictive__TypeAssignment_1"


    // $ANTLR start "rule__Value__IntAssignment_0"
    // InternalMyDsl.g:2362:1: rule__Value__IntAssignment_0 : ( RULE_INT ) ;
    public final void rule__Value__IntAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2367:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2367:2: ( RULE_INT )
            // InternalMyDsl.g:2368:3: RULE_INT
            {
             before(grammarAccess.getValueAccess().getIntINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getIntINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__IntAssignment_0"


    // $ANTLR start "rule__Value__StrAssignment_1"
    // InternalMyDsl.g:2377:1: rule__Value__StrAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Value__StrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2381:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2382:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2382:2: ( RULE_STRING )
            // InternalMyDsl.g:2383:3: RULE_STRING
            {
             before(grammarAccess.getValueAccess().getStrSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getStrSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__StrAssignment_1"


    // $ANTLR start "rule__Value__FloatAssignment_2"
    // InternalMyDsl.g:2392:1: rule__Value__FloatAssignment_2 : ( ruleFLOAT ) ;
    public final void rule__Value__FloatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2396:1: ( ( ruleFLOAT ) )
            // InternalMyDsl.g:2397:2: ( ruleFLOAT )
            {
            // InternalMyDsl.g:2397:2: ( ruleFLOAT )
            // InternalMyDsl.g:2398:3: ruleFLOAT
            {
             before(grammarAccess.getValueAccess().getFloatFLOATParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getValueAccess().getFloatFLOATParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__FloatAssignment_2"


    // $ANTLR start "rule__Value__BoolAssignment_3"
    // InternalMyDsl.g:2407:1: rule__Value__BoolAssignment_3 : ( ruleBOOL ) ;
    public final void rule__Value__BoolAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2411:1: ( ( ruleBOOL ) )
            // InternalMyDsl.g:2412:2: ( ruleBOOL )
            {
            // InternalMyDsl.g:2412:2: ( ruleBOOL )
            // InternalMyDsl.g:2413:3: ruleBOOL
            {
             before(grammarAccess.getValueAccess().getBoolBOOLParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getValueAccess().getBoolBOOLParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__BoolAssignment_3"


    // $ANTLR start "rule__FLOAT__IntPartAssignment_0"
    // InternalMyDsl.g:2422:1: rule__FLOAT__IntPartAssignment_0 : ( RULE_INT ) ;
    public final void rule__FLOAT__IntPartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2426:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2427:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2427:2: ( RULE_INT )
            // InternalMyDsl.g:2428:3: RULE_INT
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
    // InternalMyDsl.g:2437:1: rule__FLOAT__DecPartAssignment_2 : ( RULE_INT ) ;
    public final void rule__FLOAT__DecPartAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2441:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2442:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2442:2: ( RULE_INT )
            // InternalMyDsl.g:2443:3: RULE_INT
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
    // InternalMyDsl.g:2452:1: rule__BOOL__ValueAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__BOOL__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2456:1: ( ( ( 'true' ) ) )
            // InternalMyDsl.g:2457:2: ( ( 'true' ) )
            {
            // InternalMyDsl.g:2457:2: ( ( 'true' ) )
            // InternalMyDsl.g:2458:3: ( 'true' )
            {
             before(grammarAccess.getBOOLAccess().getValueTrueKeyword_0_0()); 
            // InternalMyDsl.g:2459:3: ( 'true' )
            // InternalMyDsl.g:2460:4: 'true'
            {
             before(grammarAccess.getBOOLAccess().getValueTrueKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2471:1: rule__BOOL__ValueAssignment_1 : ( ( 'false' ) ) ;
    public final void rule__BOOL__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2475:1: ( ( ( 'false' ) ) )
            // InternalMyDsl.g:2476:2: ( ( 'false' ) )
            {
            // InternalMyDsl.g:2476:2: ( ( 'false' ) )
            // InternalMyDsl.g:2477:3: ( 'false' )
            {
             before(grammarAccess.getBOOLAccess().getValueFalseKeyword_1_0()); 
            // InternalMyDsl.g:2478:3: ( 'false' )
            // InternalMyDsl.g:2479:4: 'false'
            {
             before(grammarAccess.getBOOLAccess().getValueFalseKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000A80000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000A80002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000180000050L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});

}