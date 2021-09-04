/*
 * generated by Xtext 2.25.0
 */
package koko.logmodel.services;

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
public class LogDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class LogDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "koko.logmodel.LogDsl.LogDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLogDocumentAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLogPackageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameQNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cBaseentitiesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBaseentitiesBaseEntityParserRuleCall_3_0 = (RuleCall)cBaseentitiesAssignment_3.eContents().get(0);
		
		////This is the start rule
		//LogDocument returns LogDocument:
		//    {LogDocument}
		//    'LogPackage' name=QName
		////    importcontainer=ImportContainer
		//    baseentities+=BaseEntity
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//    {LogDocument}
		//    'LogPackage' name=QName
		////    importcontainer=ImportContainer
		//    baseentities+=BaseEntity
		public Group getGroup() { return cGroup; }
		
		//{LogDocument}
		public Action getLogDocumentAction_0() { return cLogDocumentAction_0; }
		
		//'LogPackage'
		public Keyword getLogPackageKeyword_1() { return cLogPackageKeyword_1; }
		
		//name=QName
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//QName
		public RuleCall getNameQNameParserRuleCall_2_0() { return cNameQNameParserRuleCall_2_0; }
		
		////    importcontainer=ImportContainer
		//    baseentities+=BaseEntity
		public Assignment getBaseentitiesAssignment_3() { return cBaseentitiesAssignment_3; }
		
		//BaseEntity
		public RuleCall getBaseentitiesBaseEntityParserRuleCall_3_0() { return cBaseentitiesBaseEntityParserRuleCall_3_0; }
	}
	public class BaseEntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "koko.logmodel.LogDsl.BaseEntity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBaseEntityAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBaseEntityKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//BaseEntity returns BaseEntity:
		//    {BaseEntity}
		//    'BaseEntity'
		//    name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{BaseEntity}
		//'BaseEntity'
		//name=EString
		public Group getGroup() { return cGroup; }
		
		//{BaseEntity}
		public Action getBaseEntityAction_0() { return cBaseEntityAction_0; }
		
		//'BaseEntity'
		public Keyword getBaseEntityKeyword_1() { return cBaseEntityKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}
	public class QNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "koko.logmodel.LogDsl.QName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cFullStopKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		////ImportContainer returns kokoworld::ImportContainer:
		////    {
		////        (kokoworld::ImportContainer)
		////    (imports+=Import)*
		////}
		////;
		////
		////Import returns kokoworld::Import:
		////    {
		////        (kokoworld::Import)
		////        'import' item=QName
		////    }
		////;
		////-----------------------
		////DataTypes
		////-----------------------
		//QName:
		//    (ID'.')* ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(ID'.')* ID
		public Group getGroup() { return cGroup; }
		
		//(ID'.')*
		public Group getGroup_0() { return cGroup_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_0() { return cIDTerminalRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_0_1() { return cFullStopKeyword_0_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "koko.logmodel.LogDsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "koko.logmodel.LogDsl.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt returns ecore::EInt:
		//    '-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "koko.logmodel.LogDsl.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean returns ecore::EBoolean:
		//    'true' | 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	
	
	private final LogDocumentElements pLogDocument;
	private final BaseEntityElements pBaseEntity;
	private final QNameElements pQName;
	private final EStringElements pEString;
	private final EIntElements pEInt;
	private final EBooleanElements pEBoolean;
	private final TerminalRule tID;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LogDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pLogDocument = new LogDocumentElements();
		this.pBaseEntity = new BaseEntityElements();
		this.pQName = new QNameElements();
		this.pEString = new EStringElements();
		this.pEInt = new EIntElements();
		this.pEBoolean = new EBooleanElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "koko.logmodel.LogDsl.ID");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("koko.logmodel.LogDsl".equals(grammar.getName())) {
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

	
	////This is the start rule
	//LogDocument returns LogDocument:
	//    {LogDocument}
	//    'LogPackage' name=QName
	////    importcontainer=ImportContainer
	//    baseentities+=BaseEntity
	//    ;
	public LogDocumentElements getLogDocumentAccess() {
		return pLogDocument;
	}
	
	public ParserRule getLogDocumentRule() {
		return getLogDocumentAccess().getRule();
	}
	
	//BaseEntity returns BaseEntity:
	//    {BaseEntity}
	//    'BaseEntity'
	//    name=EString;
	public BaseEntityElements getBaseEntityAccess() {
		return pBaseEntity;
	}
	
	public ParserRule getBaseEntityRule() {
		return getBaseEntityAccess().getRule();
	}
	
	////ImportContainer returns kokoworld::ImportContainer:
	////    {
	////        (kokoworld::ImportContainer)
	////    (imports+=Import)*
	////}
	////;
	////
	////Import returns kokoworld::Import:
	////    {
	////        (kokoworld::Import)
	////        'import' item=QName
	////    }
	////;
	////-----------------------
	////DataTypes
	////-----------------------
	//QName:
	//    (ID'.')* ID
	//;
	public QNameElements getQNameAccess() {
		return pQName;
	}
	
	public ParserRule getQNameRule() {
		return getQNameAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EInt returns ecore::EInt:
	//    '-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EBoolean returns ecore::EBoolean:
	//    'true' | 'false';
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	////-----------------------
	////Terminals
	////-----------------------
	//@Override
	//terminal ID:
	//    '^'?('a'..'z'|'A'..'Z'|'_'|'�'|'�') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'�'|'�')*
	//;
	public TerminalRule getIDRule() {
		return tID;
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
