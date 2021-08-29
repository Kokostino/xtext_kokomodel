package koko.logmodel.ide.contentassist.antlr.internal;

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
import koko.logmodel.services.LogDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LogPackage'", "'BaseEntity'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalLogDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLogDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLogDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLogDsl.g"; }


    	private LogDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(LogDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleLogDocument"
    // InternalLogDsl.g:53:1: entryRuleLogDocument : ruleLogDocument EOF ;
    public final void entryRuleLogDocument() throws RecognitionException {
        try {
            // InternalLogDsl.g:54:1: ( ruleLogDocument EOF )
            // InternalLogDsl.g:55:1: ruleLogDocument EOF
            {
             before(grammarAccess.getLogDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleLogDocument();

            state._fsp--;

             after(grammarAccess.getLogDocumentRule()); 
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
    // $ANTLR end "entryRuleLogDocument"


    // $ANTLR start "ruleLogDocument"
    // InternalLogDsl.g:62:1: ruleLogDocument : ( ( rule__LogDocument__Group__0 ) ) ;
    public final void ruleLogDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:66:2: ( ( ( rule__LogDocument__Group__0 ) ) )
            // InternalLogDsl.g:67:2: ( ( rule__LogDocument__Group__0 ) )
            {
            // InternalLogDsl.g:67:2: ( ( rule__LogDocument__Group__0 ) )
            // InternalLogDsl.g:68:3: ( rule__LogDocument__Group__0 )
            {
             before(grammarAccess.getLogDocumentAccess().getGroup()); 
            // InternalLogDsl.g:69:3: ( rule__LogDocument__Group__0 )
            // InternalLogDsl.g:69:4: rule__LogDocument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogDocument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogDocumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogDocument"


    // $ANTLR start "entryRuleBaseEntity"
    // InternalLogDsl.g:78:1: entryRuleBaseEntity : ruleBaseEntity EOF ;
    public final void entryRuleBaseEntity() throws RecognitionException {
        try {
            // InternalLogDsl.g:79:1: ( ruleBaseEntity EOF )
            // InternalLogDsl.g:80:1: ruleBaseEntity EOF
            {
             before(grammarAccess.getBaseEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseEntity();

            state._fsp--;

             after(grammarAccess.getBaseEntityRule()); 
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
    // $ANTLR end "entryRuleBaseEntity"


    // $ANTLR start "ruleBaseEntity"
    // InternalLogDsl.g:87:1: ruleBaseEntity : ( ( rule__BaseEntity__Group__0 ) ) ;
    public final void ruleBaseEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:91:2: ( ( ( rule__BaseEntity__Group__0 ) ) )
            // InternalLogDsl.g:92:2: ( ( rule__BaseEntity__Group__0 ) )
            {
            // InternalLogDsl.g:92:2: ( ( rule__BaseEntity__Group__0 ) )
            // InternalLogDsl.g:93:3: ( rule__BaseEntity__Group__0 )
            {
             before(grammarAccess.getBaseEntityAccess().getGroup()); 
            // InternalLogDsl.g:94:3: ( rule__BaseEntity__Group__0 )
            // InternalLogDsl.g:94:4: rule__BaseEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BaseEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseEntity"


    // $ANTLR start "entryRuleQName"
    // InternalLogDsl.g:103:1: entryRuleQName : ruleQName EOF ;
    public final void entryRuleQName() throws RecognitionException {
        try {
            // InternalLogDsl.g:104:1: ( ruleQName EOF )
            // InternalLogDsl.g:105:1: ruleQName EOF
            {
             before(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQNameRule()); 
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
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // InternalLogDsl.g:112:1: ruleQName : ( ( rule__QName__Group__0 ) ) ;
    public final void ruleQName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:116:2: ( ( ( rule__QName__Group__0 ) ) )
            // InternalLogDsl.g:117:2: ( ( rule__QName__Group__0 ) )
            {
            // InternalLogDsl.g:117:2: ( ( rule__QName__Group__0 ) )
            // InternalLogDsl.g:118:3: ( rule__QName__Group__0 )
            {
             before(grammarAccess.getQNameAccess().getGroup()); 
            // InternalLogDsl.g:119:3: ( rule__QName__Group__0 )
            // InternalLogDsl.g:119:4: rule__QName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleEString"
    // InternalLogDsl.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalLogDsl.g:129:1: ( ruleEString EOF )
            // InternalLogDsl.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalLogDsl.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalLogDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalLogDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalLogDsl.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalLogDsl.g:144:3: ( rule__EString__Alternatives )
            // InternalLogDsl.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalLogDsl.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLogDsl.g:157:2: ( RULE_STRING )
                    {
                    // InternalLogDsl.g:157:2: ( RULE_STRING )
                    // InternalLogDsl.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogDsl.g:163:2: ( RULE_ID )
                    {
                    // InternalLogDsl.g:163:2: ( RULE_ID )
                    // InternalLogDsl.g:164:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__LogDocument__Group__0"
    // InternalLogDsl.g:173:1: rule__LogDocument__Group__0 : rule__LogDocument__Group__0__Impl rule__LogDocument__Group__1 ;
    public final void rule__LogDocument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:177:1: ( rule__LogDocument__Group__0__Impl rule__LogDocument__Group__1 )
            // InternalLogDsl.g:178:2: rule__LogDocument__Group__0__Impl rule__LogDocument__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LogDocument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogDocument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__Group__0"


    // $ANTLR start "rule__LogDocument__Group__0__Impl"
    // InternalLogDsl.g:185:1: rule__LogDocument__Group__0__Impl : ( () ) ;
    public final void rule__LogDocument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:189:1: ( ( () ) )
            // InternalLogDsl.g:190:1: ( () )
            {
            // InternalLogDsl.g:190:1: ( () )
            // InternalLogDsl.g:191:2: ()
            {
             before(grammarAccess.getLogDocumentAccess().getLogDocumentAction_0()); 
            // InternalLogDsl.g:192:2: ()
            // InternalLogDsl.g:192:3: 
            {
            }

             after(grammarAccess.getLogDocumentAccess().getLogDocumentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__Group__0__Impl"


    // $ANTLR start "rule__LogDocument__Group__1"
    // InternalLogDsl.g:200:1: rule__LogDocument__Group__1 : rule__LogDocument__Group__1__Impl rule__LogDocument__Group__2 ;
    public final void rule__LogDocument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:204:1: ( rule__LogDocument__Group__1__Impl rule__LogDocument__Group__2 )
            // InternalLogDsl.g:205:2: rule__LogDocument__Group__1__Impl rule__LogDocument__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LogDocument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogDocument__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__Group__1"


    // $ANTLR start "rule__LogDocument__Group__1__Impl"
    // InternalLogDsl.g:212:1: rule__LogDocument__Group__1__Impl : ( 'LogPackage' ) ;
    public final void rule__LogDocument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:216:1: ( ( 'LogPackage' ) )
            // InternalLogDsl.g:217:1: ( 'LogPackage' )
            {
            // InternalLogDsl.g:217:1: ( 'LogPackage' )
            // InternalLogDsl.g:218:2: 'LogPackage'
            {
             before(grammarAccess.getLogDocumentAccess().getLogPackageKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLogDocumentAccess().getLogPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__Group__1__Impl"


    // $ANTLR start "rule__LogDocument__Group__2"
    // InternalLogDsl.g:227:1: rule__LogDocument__Group__2 : rule__LogDocument__Group__2__Impl rule__LogDocument__Group__3 ;
    public final void rule__LogDocument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:231:1: ( rule__LogDocument__Group__2__Impl rule__LogDocument__Group__3 )
            // InternalLogDsl.g:232:2: rule__LogDocument__Group__2__Impl rule__LogDocument__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__LogDocument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogDocument__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__Group__2"


    // $ANTLR start "rule__LogDocument__Group__2__Impl"
    // InternalLogDsl.g:239:1: rule__LogDocument__Group__2__Impl : ( ( rule__LogDocument__NameAssignment_2 ) ) ;
    public final void rule__LogDocument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:243:1: ( ( ( rule__LogDocument__NameAssignment_2 ) ) )
            // InternalLogDsl.g:244:1: ( ( rule__LogDocument__NameAssignment_2 ) )
            {
            // InternalLogDsl.g:244:1: ( ( rule__LogDocument__NameAssignment_2 ) )
            // InternalLogDsl.g:245:2: ( rule__LogDocument__NameAssignment_2 )
            {
             before(grammarAccess.getLogDocumentAccess().getNameAssignment_2()); 
            // InternalLogDsl.g:246:2: ( rule__LogDocument__NameAssignment_2 )
            // InternalLogDsl.g:246:3: rule__LogDocument__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogDocument__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogDocumentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__Group__2__Impl"


    // $ANTLR start "rule__LogDocument__Group__3"
    // InternalLogDsl.g:254:1: rule__LogDocument__Group__3 : rule__LogDocument__Group__3__Impl ;
    public final void rule__LogDocument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:258:1: ( rule__LogDocument__Group__3__Impl )
            // InternalLogDsl.g:259:2: rule__LogDocument__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogDocument__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__Group__3"


    // $ANTLR start "rule__LogDocument__Group__3__Impl"
    // InternalLogDsl.g:265:1: rule__LogDocument__Group__3__Impl : ( ( rule__LogDocument__BaseentitiesAssignment_3 ) ) ;
    public final void rule__LogDocument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:269:1: ( ( ( rule__LogDocument__BaseentitiesAssignment_3 ) ) )
            // InternalLogDsl.g:270:1: ( ( rule__LogDocument__BaseentitiesAssignment_3 ) )
            {
            // InternalLogDsl.g:270:1: ( ( rule__LogDocument__BaseentitiesAssignment_3 ) )
            // InternalLogDsl.g:271:2: ( rule__LogDocument__BaseentitiesAssignment_3 )
            {
             before(grammarAccess.getLogDocumentAccess().getBaseentitiesAssignment_3()); 
            // InternalLogDsl.g:272:2: ( rule__LogDocument__BaseentitiesAssignment_3 )
            // InternalLogDsl.g:272:3: rule__LogDocument__BaseentitiesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LogDocument__BaseentitiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLogDocumentAccess().getBaseentitiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__Group__3__Impl"


    // $ANTLR start "rule__BaseEntity__Group__0"
    // InternalLogDsl.g:281:1: rule__BaseEntity__Group__0 : rule__BaseEntity__Group__0__Impl rule__BaseEntity__Group__1 ;
    public final void rule__BaseEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:285:1: ( rule__BaseEntity__Group__0__Impl rule__BaseEntity__Group__1 )
            // InternalLogDsl.g:286:2: rule__BaseEntity__Group__0__Impl rule__BaseEntity__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BaseEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseEntity__Group__0"


    // $ANTLR start "rule__BaseEntity__Group__0__Impl"
    // InternalLogDsl.g:293:1: rule__BaseEntity__Group__0__Impl : ( () ) ;
    public final void rule__BaseEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:297:1: ( ( () ) )
            // InternalLogDsl.g:298:1: ( () )
            {
            // InternalLogDsl.g:298:1: ( () )
            // InternalLogDsl.g:299:2: ()
            {
             before(grammarAccess.getBaseEntityAccess().getBaseEntityAction_0()); 
            // InternalLogDsl.g:300:2: ()
            // InternalLogDsl.g:300:3: 
            {
            }

             after(grammarAccess.getBaseEntityAccess().getBaseEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseEntity__Group__0__Impl"


    // $ANTLR start "rule__BaseEntity__Group__1"
    // InternalLogDsl.g:308:1: rule__BaseEntity__Group__1 : rule__BaseEntity__Group__1__Impl rule__BaseEntity__Group__2 ;
    public final void rule__BaseEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:312:1: ( rule__BaseEntity__Group__1__Impl rule__BaseEntity__Group__2 )
            // InternalLogDsl.g:313:2: rule__BaseEntity__Group__1__Impl rule__BaseEntity__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__BaseEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseEntity__Group__1"


    // $ANTLR start "rule__BaseEntity__Group__1__Impl"
    // InternalLogDsl.g:320:1: rule__BaseEntity__Group__1__Impl : ( 'BaseEntity' ) ;
    public final void rule__BaseEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:324:1: ( ( 'BaseEntity' ) )
            // InternalLogDsl.g:325:1: ( 'BaseEntity' )
            {
            // InternalLogDsl.g:325:1: ( 'BaseEntity' )
            // InternalLogDsl.g:326:2: 'BaseEntity'
            {
             before(grammarAccess.getBaseEntityAccess().getBaseEntityKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBaseEntityAccess().getBaseEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseEntity__Group__1__Impl"


    // $ANTLR start "rule__BaseEntity__Group__2"
    // InternalLogDsl.g:335:1: rule__BaseEntity__Group__2 : rule__BaseEntity__Group__2__Impl ;
    public final void rule__BaseEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:339:1: ( rule__BaseEntity__Group__2__Impl )
            // InternalLogDsl.g:340:2: rule__BaseEntity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseEntity__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseEntity__Group__2"


    // $ANTLR start "rule__BaseEntity__Group__2__Impl"
    // InternalLogDsl.g:346:1: rule__BaseEntity__Group__2__Impl : ( ( rule__BaseEntity__NameAssignment_2 ) ) ;
    public final void rule__BaseEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:350:1: ( ( ( rule__BaseEntity__NameAssignment_2 ) ) )
            // InternalLogDsl.g:351:1: ( ( rule__BaseEntity__NameAssignment_2 ) )
            {
            // InternalLogDsl.g:351:1: ( ( rule__BaseEntity__NameAssignment_2 ) )
            // InternalLogDsl.g:352:2: ( rule__BaseEntity__NameAssignment_2 )
            {
             before(grammarAccess.getBaseEntityAccess().getNameAssignment_2()); 
            // InternalLogDsl.g:353:2: ( rule__BaseEntity__NameAssignment_2 )
            // InternalLogDsl.g:353:3: rule__BaseEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BaseEntity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBaseEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseEntity__Group__2__Impl"


    // $ANTLR start "rule__QName__Group__0"
    // InternalLogDsl.g:362:1: rule__QName__Group__0 : rule__QName__Group__0__Impl rule__QName__Group__1 ;
    public final void rule__QName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:366:1: ( rule__QName__Group__0__Impl rule__QName__Group__1 )
            // InternalLogDsl.g:367:2: rule__QName__Group__0__Impl rule__QName__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__QName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QName__Group__0"


    // $ANTLR start "rule__QName__Group__0__Impl"
    // InternalLogDsl.g:374:1: rule__QName__Group__0__Impl : ( ( rule__QName__Group_0__0 )* ) ;
    public final void rule__QName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:378:1: ( ( ( rule__QName__Group_0__0 )* ) )
            // InternalLogDsl.g:379:1: ( ( rule__QName__Group_0__0 )* )
            {
            // InternalLogDsl.g:379:1: ( ( rule__QName__Group_0__0 )* )
            // InternalLogDsl.g:380:2: ( rule__QName__Group_0__0 )*
            {
             before(grammarAccess.getQNameAccess().getGroup_0()); 
            // InternalLogDsl.g:381:2: ( rule__QName__Group_0__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==13) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalLogDsl.g:381:3: rule__QName__Group_0__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__QName__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getQNameAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QName__Group__0__Impl"


    // $ANTLR start "rule__QName__Group__1"
    // InternalLogDsl.g:389:1: rule__QName__Group__1 : rule__QName__Group__1__Impl ;
    public final void rule__QName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:393:1: ( rule__QName__Group__1__Impl )
            // InternalLogDsl.g:394:2: rule__QName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QName__Group__1"


    // $ANTLR start "rule__QName__Group__1__Impl"
    // InternalLogDsl.g:400:1: rule__QName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:404:1: ( ( RULE_ID ) )
            // InternalLogDsl.g:405:1: ( RULE_ID )
            {
            // InternalLogDsl.g:405:1: ( RULE_ID )
            // InternalLogDsl.g:406:2: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QName__Group__1__Impl"


    // $ANTLR start "rule__QName__Group_0__0"
    // InternalLogDsl.g:416:1: rule__QName__Group_0__0 : rule__QName__Group_0__0__Impl rule__QName__Group_0__1 ;
    public final void rule__QName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:420:1: ( rule__QName__Group_0__0__Impl rule__QName__Group_0__1 )
            // InternalLogDsl.g:421:2: rule__QName__Group_0__0__Impl rule__QName__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__QName__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QName__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QName__Group_0__0"


    // $ANTLR start "rule__QName__Group_0__0__Impl"
    // InternalLogDsl.g:428:1: rule__QName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:432:1: ( ( RULE_ID ) )
            // InternalLogDsl.g:433:1: ( RULE_ID )
            {
            // InternalLogDsl.g:433:1: ( RULE_ID )
            // InternalLogDsl.g:434:2: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QName__Group_0__0__Impl"


    // $ANTLR start "rule__QName__Group_0__1"
    // InternalLogDsl.g:443:1: rule__QName__Group_0__1 : rule__QName__Group_0__1__Impl ;
    public final void rule__QName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:447:1: ( rule__QName__Group_0__1__Impl )
            // InternalLogDsl.g:448:2: rule__QName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QName__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QName__Group_0__1"


    // $ANTLR start "rule__QName__Group_0__1__Impl"
    // InternalLogDsl.g:454:1: rule__QName__Group_0__1__Impl : ( '.' ) ;
    public final void rule__QName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:458:1: ( ( '.' ) )
            // InternalLogDsl.g:459:1: ( '.' )
            {
            // InternalLogDsl.g:459:1: ( '.' )
            // InternalLogDsl.g:460:2: '.'
            {
             before(grammarAccess.getQNameAccess().getFullStopKeyword_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getQNameAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QName__Group_0__1__Impl"


    // $ANTLR start "rule__LogDocument__NameAssignment_2"
    // InternalLogDsl.g:470:1: rule__LogDocument__NameAssignment_2 : ( ruleQName ) ;
    public final void rule__LogDocument__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:474:1: ( ( ruleQName ) )
            // InternalLogDsl.g:475:2: ( ruleQName )
            {
            // InternalLogDsl.g:475:2: ( ruleQName )
            // InternalLogDsl.g:476:3: ruleQName
            {
             before(grammarAccess.getLogDocumentAccess().getNameQNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getLogDocumentAccess().getNameQNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__NameAssignment_2"


    // $ANTLR start "rule__LogDocument__BaseentitiesAssignment_3"
    // InternalLogDsl.g:485:1: rule__LogDocument__BaseentitiesAssignment_3 : ( ruleBaseEntity ) ;
    public final void rule__LogDocument__BaseentitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:489:1: ( ( ruleBaseEntity ) )
            // InternalLogDsl.g:490:2: ( ruleBaseEntity )
            {
            // InternalLogDsl.g:490:2: ( ruleBaseEntity )
            // InternalLogDsl.g:491:3: ruleBaseEntity
            {
             before(grammarAccess.getLogDocumentAccess().getBaseentitiesBaseEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseEntity();

            state._fsp--;

             after(grammarAccess.getLogDocumentAccess().getBaseentitiesBaseEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__BaseentitiesAssignment_3"


    // $ANTLR start "rule__BaseEntity__NameAssignment_2"
    // InternalLogDsl.g:500:1: rule__BaseEntity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BaseEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:504:1: ( ( ruleEString ) )
            // InternalLogDsl.g:505:2: ( ruleEString )
            {
            // InternalLogDsl.g:505:2: ( ruleEString )
            // InternalLogDsl.g:506:3: ruleEString
            {
             before(grammarAccess.getBaseEntityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseEntityAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseEntity__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});

}