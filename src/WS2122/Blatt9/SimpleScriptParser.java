// Generated from src/name/panitz/util/SimpleScript.g4 by ANTLR 4.9.1

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=1, DO=2, IF=3, THEN=4, ELSE=5, VARIABLE=6, NUMBER=7, LPAREN=8, RPAREN=9, 
		LBRACE=10, RBRACE=11, SEMICOLON=12, ADD=13, SUB=14, MULT=15, DIV=16, MOD=17, 
		EQ=18, LINE_COMMENT=19, COMMENT=20, WS=21;
	public static final int
		RULE_script = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"script"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'do'", "'if'", "'then'", "'else'", null, null, "'('", 
			"')'", "'{'", "'}'", "';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHILE", "DO", "IF", "THEN", "ELSE", "VARIABLE", "NUMBER", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "SEMICOLON", "ADD", "SUB", "MULT", "DIV", 
			"MOD", "EQ", "LINE_COMMENT", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SimpleScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SimpleScriptParser.VARIABLE, 0); }
		public TerminalNode EQ() { return getToken(SimpleScriptParser.EQ, 0); }
		public List<ScriptContext> script() {
			return getRuleContexts(ScriptContext.class);
		}
		public ScriptContext script(int i) {
			return getRuleContext(ScriptContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(SimpleScriptParser.NUMBER, 0); }
		public TerminalNode IF() { return getToken(SimpleScriptParser.IF, 0); }
		public TerminalNode THEN() { return getToken(SimpleScriptParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(SimpleScriptParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(SimpleScriptParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(SimpleScriptParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(SimpleScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleScriptParser.RBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleScriptParser.RPAREN, 0); }
		public TerminalNode MULT() { return getToken(SimpleScriptParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(SimpleScriptParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SimpleScriptParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(SimpleScriptParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SimpleScriptParser.SUB, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleScriptVisitor ) return ((SimpleScriptVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		return script(0);
	}

	private ScriptContext script(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ScriptContext _localctx = new ScriptContext(_ctx, _parentState);
		ScriptContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_script, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(3);
				match(VARIABLE);
				setState(4);
				match(EQ);
				setState(5);
				script(7);
				}
				break;
			case 2:
				{
				setState(6);
				match(VARIABLE);
				}
				break;
			case 3:
				{
				setState(7);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(8);
				match(IF);
				setState(9);
				script(0);
				setState(10);
				match(THEN);
				setState(11);
				script(0);
				setState(12);
				match(ELSE);
				setState(13);
				script(4);
				}
				break;
			case 5:
				{
				setState(15);
				match(WHILE);
				setState(16);
				script(0);
				setState(17);
				match(DO);
				setState(18);
				script(3);
				}
				break;
			case 6:
				{
				setState(20);
				match(LBRACE);
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(21);
					script(0);
					}
					}
					setState(24); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << VARIABLE) | (1L << NUMBER) | (1L << LPAREN) | (1L << LBRACE))) != 0) );
				setState(26);
				match(RBRACE);
				}
				break;
			case 7:
				{
				setState(28);
				match(LPAREN);
				setState(29);
				script(0);
				setState(30);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(40);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ScriptContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_script);
						setState(34);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(35);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(36);
						script(10);
						}
						break;
					case 2:
						{
						_localctx = new ScriptContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_script);
						setState(37);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(38);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(39);
						script(9);
						}
						break;
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return script_sempred((ScriptContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean script_sempred(ScriptContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\60\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\3\2\3\2\3\2\3\2\5\2#\n\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\2\3\2\3\2\2\4\3\2\21\23\3"+
		"\2\17\20\2\67\2\"\3\2\2\2\4\5\b\2\1\2\5\6\7\b\2\2\6\7\7\24\2\2\7#\5\2"+
		"\2\t\b#\7\b\2\2\t#\7\t\2\2\n\13\7\5\2\2\13\f\5\2\2\2\f\r\7\6\2\2\r\16"+
		"\5\2\2\2\16\17\7\7\2\2\17\20\5\2\2\6\20#\3\2\2\2\21\22\7\3\2\2\22\23\5"+
		"\2\2\2\23\24\7\4\2\2\24\25\5\2\2\5\25#\3\2\2\2\26\30\7\f\2\2\27\31\5\2"+
		"\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2"+
		"\2\2\34\35\7\r\2\2\35#\3\2\2\2\36\37\7\n\2\2\37 \5\2\2\2 !\7\13\2\2!#"+
		"\3\2\2\2\"\4\3\2\2\2\"\b\3\2\2\2\"\t\3\2\2\2\"\n\3\2\2\2\"\21\3\2\2\2"+
		"\"\26\3\2\2\2\"\36\3\2\2\2#,\3\2\2\2$%\f\13\2\2%&\t\2\2\2&+\5\2\2\f\'"+
		"(\f\n\2\2()\t\3\2\2)+\5\2\2\13*$\3\2\2\2*\'\3\2\2\2+.\3\2\2\2,*\3\2\2"+
		"\2,-\3\2\2\2-\3\3\2\2\2.,\3\2\2\2\6\32\"*,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}