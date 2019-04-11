// Generated from ProyectoFinal/ProyectoFinal/ProyectoFinal.g4 by ANTLR 4.5.1
package ProyectoFinal.ProyectoFinal;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProyectoFinalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IMPORT=4, PROGRAM=5, MAIN=6, INT=7, FLOAT=8, BOOLEAN=9, 
		CHAR=10, STRING=11, PRINT=12, END=13, WS=14, CARACTERES=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
		"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
		"Y", "Z", "IMPORT", "PROGRAM", "MAIN", "INT", "FLOAT", "BOOLEAN", "CHAR", 
		"STRING", "PRINT", "END", "WS", "CARACTERES"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'0'", "'9'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "IMPORT", "PROGRAM", "MAIN", "INT", "FLOAT", "BOOLEAN", 
		"CHAR", "STRING", "PRINT", "END", "WS", "CARACTERES"
	};
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


	public ProyectoFinalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProyectoFinal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u00d9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&"+
		"\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\6)\u00cd\n)\r)"+
		"\16)\u00ce\3)\3)\3*\3*\7*\u00d5\n*\f*\16*\u00d8\13*\2\2+\3\3\5\4\7\5\t"+
		"\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2"+
		")\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17"+
		"Q\20S\21\3\2\37\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2II"+
		"ii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\u00c0\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3"+
		"\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2"+
		"\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13"+
		"]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21c\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27"+
		"i\3\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#u"+
		"\3\2\2\2%w\3\2\2\2\'y\3\2\2\2){\3\2\2\2+}\3\2\2\2-\177\3\2\2\2/\u0081"+
		"\3\2\2\2\61\u0083\3\2\2\2\63\u0085\3\2\2\2\65\u0087\3\2\2\2\67\u0089\3"+
		"\2\2\29\u008b\3\2\2\2;\u008d\3\2\2\2=\u008f\3\2\2\2?\u0096\3\2\2\2A\u009e"+
		"\3\2\2\2C\u00a3\3\2\2\2E\u00a7\3\2\2\2G\u00ad\3\2\2\2I\u00b5\3\2\2\2K"+
		"\u00ba\3\2\2\2M\u00c1\3\2\2\2O\u00c7\3\2\2\2Q\u00cc\3\2\2\2S\u00d2\3\2"+
		"\2\2UV\7?\2\2V\4\3\2\2\2WX\7\62\2\2X\6\3\2\2\2YZ\7;\2\2Z\b\3\2\2\2[\\"+
		"\t\2\2\2\\\n\3\2\2\2]^\t\3\2\2^\f\3\2\2\2_`\t\4\2\2`\16\3\2\2\2ab\t\5"+
		"\2\2b\20\3\2\2\2cd\t\6\2\2d\22\3\2\2\2ef\t\7\2\2f\24\3\2\2\2gh\t\b\2\2"+
		"h\26\3\2\2\2ij\t\t\2\2j\30\3\2\2\2kl\t\n\2\2l\32\3\2\2\2mn\t\13\2\2n\34"+
		"\3\2\2\2op\t\f\2\2p\36\3\2\2\2qr\t\r\2\2r \3\2\2\2st\t\16\2\2t\"\3\2\2"+
		"\2uv\t\17\2\2v$\3\2\2\2wx\t\20\2\2x&\3\2\2\2yz\t\21\2\2z(\3\2\2\2{|\t"+
		"\22\2\2|*\3\2\2\2}~\t\23\2\2~,\3\2\2\2\177\u0080\t\24\2\2\u0080.\3\2\2"+
		"\2\u0081\u0082\t\25\2\2\u0082\60\3\2\2\2\u0083\u0084\t\26\2\2\u0084\62"+
		"\3\2\2\2\u0085\u0086\t\27\2\2\u0086\64\3\2\2\2\u0087\u0088\t\30\2\2\u0088"+
		"\66\3\2\2\2\u0089\u008a\t\31\2\2\u008a8\3\2\2\2\u008b\u008c\t\32\2\2\u008c"+
		":\3\2\2\2\u008d\u008e\t\33\2\2\u008e<\3\2\2\2\u008f\u0090\5\31\r\2\u0090"+
		"\u0091\5!\21\2\u0091\u0092\5\'\24\2\u0092\u0093\5%\23\2\u0093\u0094\5"+
		"+\26\2\u0094\u0095\5/\30\2\u0095>\3\2\2\2\u0096\u0097\5\'\24\2\u0097\u0098"+
		"\5+\26\2\u0098\u0099\5%\23\2\u0099\u009a\5\25\13\2\u009a\u009b\5+\26\2"+
		"\u009b\u009c\5\t\5\2\u009c\u009d\5!\21\2\u009d@\3\2\2\2\u009e\u009f\5"+
		"!\21\2\u009f\u00a0\5\t\5\2\u00a0\u00a1\5\31\r\2\u00a1\u00a2\5#\22\2\u00a2"+
		"B\3\2\2\2\u00a3\u00a4\5\31\r\2\u00a4\u00a5\5#\22\2\u00a5\u00a6\5/\30\2"+
		"\u00a6D\3\2\2\2\u00a7\u00a8\5\23\n\2\u00a8\u00a9\5\37\20\2\u00a9\u00aa"+
		"\5%\23\2\u00aa\u00ab\5\t\5\2\u00ab\u00ac\5/\30\2\u00acF\3\2\2\2\u00ad"+
		"\u00ae\5\13\6\2\u00ae\u00af\5%\23\2\u00af\u00b0\5%\23\2\u00b0\u00b1\5"+
		"\37\20\2\u00b1\u00b2\5\21\t\2\u00b2\u00b3\5\t\5\2\u00b3\u00b4\5#\22\2"+
		"\u00b4H\3\2\2\2\u00b5\u00b6\5\r\7\2\u00b6\u00b7\5\27\f\2\u00b7\u00b8\5"+
		"\t\5\2\u00b8\u00b9\5+\26\2\u00b9J\3\2\2\2\u00ba\u00bb\5-\27\2\u00bb\u00bc"+
		"\5/\30\2\u00bc\u00bd\5+\26\2\u00bd\u00be\5\31\r\2\u00be\u00bf\5#\22\2"+
		"\u00bf\u00c0\5\25\13\2\u00c0L\3\2\2\2\u00c1\u00c2\5\'\24\2\u00c2\u00c3"+
		"\5+\26\2\u00c3\u00c4\5\31\r\2\u00c4\u00c5\5#\22\2\u00c5\u00c6\5/\30\2"+
		"\u00c6N\3\2\2\2\u00c7\u00c8\5\21\t\2\u00c8\u00c9\5#\22\2\u00c9\u00ca\5"+
		"\17\b\2\u00caP\3\2\2\2\u00cb\u00cd\t\34\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\b)\2\2\u00d1R\3\2\2\2\u00d2\u00d6\t\35\2\2\u00d3\u00d5"+
		"\t\36\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7T\3\2\2\2\u00d8\u00d6\3\2\2\2\5\2\u00ce\u00d6"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}