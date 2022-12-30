// Generated from src/name/panitz/util/SimpleScript.g4 by ANTLR 4.9.1

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=1, DO=2, IF=3, THEN=4, ELSE=5, VARIABLE=6, NUMBER=7, LPAREN=8, RPAREN=9, 
		LBRACE=10, RBRACE=11, SEMICOLON=12, ADD=13, SUB=14, MULT=15, DIV=16, MOD=17, 
		EQ=18, LINE_COMMENT=19, COMMENT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHILE", "DO", "IF", "THEN", "ELSE", "VARIABLE", "VALID_ID_START", "VALID_ID_CHAR", 
			"NUMBER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", "ADD", 
			"SUB", "MULT", "DIV", "MOD", "EQ", "LINE_COMMENT", "COMMENT", "WS"
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


	public SimpleScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\5\bP\n\b\3\t\3\t\5"+
		"\tT\n\t\3\n\3\n\7\nX\n\n\f\n\16\n[\13\n\3\n\5\n^\n\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\7\26z\n\26\f\26\16\26}\13\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0087\n\27\f\27\16\27\u008a"+
		"\13\27\3\27\3\27\3\27\3\27\3\27\3\30\6\30\u0092\n\30\r\30\16\30\u0093"+
		"\3\30\3\30\4{\u0088\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\t\25\n"+
		"\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\3\2\4\5"+
		"\2C\\aac|\5\2\13\f\17\17\"\"\2\u009b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\3\61\3\2\2\2\5\67\3\2\2\2\7:\3\2\2\2\t=\3\2\2\2\13B\3\2\2"+
		"\2\rG\3\2\2\2\17O\3\2\2\2\21S\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27a\3\2"+
		"\2\2\31c\3\2\2\2\33e\3\2\2\2\35g\3\2\2\2\37i\3\2\2\2!k\3\2\2\2#m\3\2\2"+
		"\2%o\3\2\2\2\'q\3\2\2\2)s\3\2\2\2+u\3\2\2\2-\u0082\3\2\2\2/\u0091\3\2"+
		"\2\2\61\62\7y\2\2\62\63\7j\2\2\63\64\7k\2\2\64\65\7n\2\2\65\66\7g\2\2"+
		"\66\4\3\2\2\2\678\7f\2\289\7q\2\29\6\3\2\2\2:;\7k\2\2;<\7h\2\2<\b\3\2"+
		"\2\2=>\7v\2\2>?\7j\2\2?@\7g\2\2@A\7p\2\2A\n\3\2\2\2BC\7g\2\2CD\7n\2\2"+
		"DE\7u\2\2EF\7g\2\2F\f\3\2\2\2GK\5\17\b\2HJ\5\21\t\2IH\3\2\2\2JM\3\2\2"+
		"\2KI\3\2\2\2KL\3\2\2\2L\16\3\2\2\2MK\3\2\2\2NP\t\2\2\2ON\3\2\2\2P\20\3"+
		"\2\2\2QT\5\17\b\2RT\4\62;\2SQ\3\2\2\2SR\3\2\2\2T\22\3\2\2\2UY\4\63;\2"+
		"VX\4\62;\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z^\3\2\2\2[Y\3\2\2\2"+
		"\\^\7\62\2\2]U\3\2\2\2]\\\3\2\2\2^\24\3\2\2\2_`\7*\2\2`\26\3\2\2\2ab\7"+
		"+\2\2b\30\3\2\2\2cd\7}\2\2d\32\3\2\2\2ef\7\177\2\2f\34\3\2\2\2gh\7=\2"+
		"\2h\36\3\2\2\2ij\7-\2\2j \3\2\2\2kl\7/\2\2l\"\3\2\2\2mn\7,\2\2n$\3\2\2"+
		"\2op\7\61\2\2p&\3\2\2\2qr\7\'\2\2r(\3\2\2\2st\7?\2\2t*\3\2\2\2uv\7\61"+
		"\2\2vw\7\61\2\2w{\3\2\2\2xz\13\2\2\2yx\3\2\2\2z}\3\2\2\2{|\3\2\2\2{y\3"+
		"\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\f\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\b\26\2\2\u0081,\3\2\2\2\u0082\u0083\7\61\2\2\u0083\u0084\7,\2\2\u0084"+
		"\u0088\3\2\2\2\u0085\u0087\13\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\7,\2\2\u008c\u008d\7\61\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\b\27\2\2\u008f.\3\2\2\2\u0090\u0092\t\3\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\b\30\2\2\u0096\60\3\2\2\2\13\2KOSY]{\u0088"+
		"\u0093\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}