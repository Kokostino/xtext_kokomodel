package koko.logmodel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import koko.logmodel.services.LogDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LogPackage'", "'BaseEntity'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
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

        public InternalLogDslParser(TokenStream input, LogDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LogDocument";
       	}

       	@Override
       	protected LogDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLogDocument"
    // InternalLogDsl.g:64:1: entryRuleLogDocument returns [EObject current=null] : iv_ruleLogDocument= ruleLogDocument EOF ;
    public final EObject entryRuleLogDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogDocument = null;


        try {
            // InternalLogDsl.g:64:52: (iv_ruleLogDocument= ruleLogDocument EOF )
            // InternalLogDsl.g:65:2: iv_ruleLogDocument= ruleLogDocument EOF
            {
             newCompositeNode(grammarAccess.getLogDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogDocument=ruleLogDocument();

            state._fsp--;

             current =iv_ruleLogDocument; 
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
    // $ANTLR end "entryRuleLogDocument"


    // $ANTLR start "ruleLogDocument"
    // InternalLogDsl.g:71:1: ruleLogDocument returns [EObject current=null] : ( () otherlv_1= 'LogPackage' ( (lv_name_2_0= ruleQName ) ) ( (lv_baseentities_3_0= ruleBaseEntity ) ) ) ;
    public final EObject ruleLogDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_baseentities_3_0 = null;



        	enterRule();

        try {
            // InternalLogDsl.g:77:2: ( ( () otherlv_1= 'LogPackage' ( (lv_name_2_0= ruleQName ) ) ( (lv_baseentities_3_0= ruleBaseEntity ) ) ) )
            // InternalLogDsl.g:78:2: ( () otherlv_1= 'LogPackage' ( (lv_name_2_0= ruleQName ) ) ( (lv_baseentities_3_0= ruleBaseEntity ) ) )
            {
            // InternalLogDsl.g:78:2: ( () otherlv_1= 'LogPackage' ( (lv_name_2_0= ruleQName ) ) ( (lv_baseentities_3_0= ruleBaseEntity ) ) )
            // InternalLogDsl.g:79:3: () otherlv_1= 'LogPackage' ( (lv_name_2_0= ruleQName ) ) ( (lv_baseentities_3_0= ruleBaseEntity ) )
            {
            // InternalLogDsl.g:79:3: ()
            // InternalLogDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogDocumentAccess().getLogDocumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLogDocumentAccess().getLogPackageKeyword_1());
            		
            // InternalLogDsl.g:90:3: ( (lv_name_2_0= ruleQName ) )
            // InternalLogDsl.g:91:4: (lv_name_2_0= ruleQName )
            {
            // InternalLogDsl.g:91:4: (lv_name_2_0= ruleQName )
            // InternalLogDsl.g:92:5: lv_name_2_0= ruleQName
            {

            					newCompositeNode(grammarAccess.getLogDocumentAccess().getNameQNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogDocumentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"koko.logmodel.LogDsl.QName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLogDsl.g:109:3: ( (lv_baseentities_3_0= ruleBaseEntity ) )
            // InternalLogDsl.g:110:4: (lv_baseentities_3_0= ruleBaseEntity )
            {
            // InternalLogDsl.g:110:4: (lv_baseentities_3_0= ruleBaseEntity )
            // InternalLogDsl.g:111:5: lv_baseentities_3_0= ruleBaseEntity
            {

            					newCompositeNode(grammarAccess.getLogDocumentAccess().getBaseentitiesBaseEntityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_baseentities_3_0=ruleBaseEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogDocumentRule());
            					}
            					add(
            						current,
            						"baseentities",
            						lv_baseentities_3_0,
            						"koko.logmodel.LogDsl.BaseEntity");
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
    // $ANTLR end "ruleLogDocument"


    // $ANTLR start "entryRuleBaseEntity"
    // InternalLogDsl.g:132:1: entryRuleBaseEntity returns [EObject current=null] : iv_ruleBaseEntity= ruleBaseEntity EOF ;
    public final EObject entryRuleBaseEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseEntity = null;


        try {
            // InternalLogDsl.g:132:51: (iv_ruleBaseEntity= ruleBaseEntity EOF )
            // InternalLogDsl.g:133:2: iv_ruleBaseEntity= ruleBaseEntity EOF
            {
             newCompositeNode(grammarAccess.getBaseEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseEntity=ruleBaseEntity();

            state._fsp--;

             current =iv_ruleBaseEntity; 
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
    // $ANTLR end "entryRuleBaseEntity"


    // $ANTLR start "ruleBaseEntity"
    // InternalLogDsl.g:139:1: ruleBaseEntity returns [EObject current=null] : ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleBaseEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalLogDsl.g:145:2: ( ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalLogDsl.g:146:2: ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalLogDsl.g:146:2: ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= ruleEString ) ) )
            // InternalLogDsl.g:147:3: () otherlv_1= 'BaseEntity' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalLogDsl.g:147:3: ()
            // InternalLogDsl.g:148:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseEntityAccess().getBaseEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseEntityAccess().getBaseEntityKeyword_1());
            		
            // InternalLogDsl.g:158:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLogDsl.g:159:4: (lv_name_2_0= ruleEString )
            {
            // InternalLogDsl.g:159:4: (lv_name_2_0= ruleEString )
            // InternalLogDsl.g:160:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBaseEntityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBaseEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"koko.logmodel.LogDsl.EString");
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
    // $ANTLR end "ruleBaseEntity"


    // $ANTLR start "entryRuleQName"
    // InternalLogDsl.g:181:1: entryRuleQName returns [String current=null] : iv_ruleQName= ruleQName EOF ;
    public final String entryRuleQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQName = null;


        try {
            // InternalLogDsl.g:181:45: (iv_ruleQName= ruleQName EOF )
            // InternalLogDsl.g:182:2: iv_ruleQName= ruleQName EOF
            {
             newCompositeNode(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQName=ruleQName();

            state._fsp--;

             current =iv_ruleQName.getText(); 
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
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // InternalLogDsl.g:188:1: ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLogDsl.g:194:2: ( ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) )
            // InternalLogDsl.g:195:2: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            {
            // InternalLogDsl.g:195:2: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            // InternalLogDsl.g:196:3: (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID
            {
            // InternalLogDsl.g:196:3: (this_ID_0= RULE_ID kw= '.' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==13) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalLogDsl.g:197:4: this_ID_0= RULE_ID kw= '.'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				current.merge(this_ID_0);
            	    			

            	    				newLeafNode(this_ID_0, grammarAccess.getQNameAccess().getIDTerminalRuleCall_0_0());
            	    			
            	    kw=(Token)match(input,13,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQNameAccess().getFullStopKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getQNameAccess().getIDTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleEString"
    // InternalLogDsl.g:221:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalLogDsl.g:221:47: (iv_ruleEString= ruleEString EOF )
            // InternalLogDsl.g:222:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalLogDsl.g:228:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalLogDsl.g:234:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalLogDsl.g:235:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalLogDsl.g:235:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLogDsl.g:236:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLogDsl.g:244:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});

}