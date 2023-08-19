// Generated from /Users/grayjack/Documents/Sources/JavaProjects/compiladores-2023/src/main/antlr/IsidroLangParser.g4 by ANTLR 4.12.0
package interpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IsidroLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_DECLARE=1, KW_PROGRAMA=2, KW_FIMPROG=3, KW_INICIO=4, KW_FIM=5, KW_LEIA=6, 
		KW_ESCREVA=7, KW_ESCREVALINHA=8, KW_SE=9, KW_SENAO=10, KW_VERDADE=11, 
		KW_FALSO=12, KW_ENQUANTO=13, KW_PARE=14, KW_CONTINUE=15, KW_FACA=16, KW_TY_INT=17, 
		KW_TY_REAL=18, KW_TY_TXT=19, KW_TY_BOOL=20, KW_E=21, KW_OU=22, KW_NEG=23, 
		LINE_COMMENT=24, INT_LITERAL=25, FLOAT_LITERAL=26, STR_LITERAL=27, DEC_LITERAL=28, 
		HEX_LITERAL=29, OCT_LITERAL=30, BIN_LITERAL=31, PLUS=32, MINUS=33, STAR=34, 
		SLASH=35, DOT=36, COLON=37, COLONCOLON=38, COMMA=39, SEMI=40, EQ=41, NOTEQ=42, 
		MAIOR=43, MENOR=44, MAIOREQ=45, MENOREQ=46, ATTR=47, LPAREN=48, RPAREN=49, 
		LCURLY=50, RCURLY=51, ID=52, WS=53;
	public static final int
		RULE_prog = 0, RULE_bloco = 1, RULE_sttm = 2, RULE_declareSttm = 3, RULE_declareUmSttm = 4, 
		RULE_tipo = 5, RULE_seSttm = 6, RULE_enquantoSttm = 7, RULE_facaEnquantoSttm = 8, 
		RULE_leiaSttm = 9, RULE_escrevaSttm = 10, RULE_escrevaLinhaSttm = 11, 
		RULE_attrSttm = 12, RULE_exprSttm = 13, RULE_expr = 14, RULE_literalExpr = 15, 
		RULE_compoundExpr = 16, RULE_negExpr = 17, RULE_cmpOp = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "bloco", "sttm", "declareSttm", "declareUmSttm", "tipo", "seSttm", 
			"enquantoSttm", "facaEnquantoSttm", "leiaSttm", "escrevaSttm", "escrevaLinhaSttm", 
			"attrSttm", "exprSttm", "expr", "literalExpr", "compoundExpr", "negExpr", 
			"cmpOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'declare'", "'programa'", "'fimprog'", "'inicio'", "'fim'", "'leia'", 
			"'escreva'", "'escrevaLinha'", "'se'", "'senao'", "'verdade'", "'falso'", 
			"'enquanto'", "'pare'", "'continue'", "'fa\\u00E7a'", "'int'", "'real'", 
			"'txt'", "'bool'", "'e'", "'ou'", "'neg'", null, null, null, null, null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'.'", "':'", "'::'", "','", 
			"';'", "'='", "'!='", "'>'", "'<'", "'>='", "'<='", "':='", "'('", "')'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW_DECLARE", "KW_PROGRAMA", "KW_FIMPROG", "KW_INICIO", "KW_FIM", 
			"KW_LEIA", "KW_ESCREVA", "KW_ESCREVALINHA", "KW_SE", "KW_SENAO", "KW_VERDADE", 
			"KW_FALSO", "KW_ENQUANTO", "KW_PARE", "KW_CONTINUE", "KW_FACA", "KW_TY_INT", 
			"KW_TY_REAL", "KW_TY_TXT", "KW_TY_BOOL", "KW_E", "KW_OU", "KW_NEG", "LINE_COMMENT", 
			"INT_LITERAL", "FLOAT_LITERAL", "STR_LITERAL", "DEC_LITERAL", "HEX_LITERAL", 
			"OCT_LITERAL", "BIN_LITERAL", "PLUS", "MINUS", "STAR", "SLASH", "DOT", 
			"COLON", "COLONCOLON", "COMMA", "SEMI", "EQ", "NOTEQ", "MAIOR", "MENOR", 
			"MAIOREQ", "MENOREQ", "ATTR", "LPAREN", "RPAREN", "LCURLY", "RCURLY", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "IsidroLangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IsidroLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode KW_PROGRAMA() { return getToken(IsidroLangParser.KW_PROGRAMA, 0); }
		public TerminalNode KW_FIMPROG() { return getToken(IsidroLangParser.KW_FIMPROG, 0); }
		public List<SttmContext> sttm() {
			return getRuleContexts(SttmContext.class);
		}
		public SttmContext sttm(int i) {
			return getRuleContext(SttmContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(KW_PROGRAMA);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143566957506L) != 0)) {
				{
				{
				setState(39);
				sttm();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(KW_FIMPROG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(IsidroLangParser.COLON, 0); }
		public TerminalNode KW_FIM() { return getToken(IsidroLangParser.KW_FIM, 0); }
		public List<SttmContext> sttm() {
			return getRuleContexts(SttmContext.class);
		}
		public SttmContext sttm(int i) {
			return getRuleContext(SttmContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(COLON);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143566957506L) != 0)) {
				{
				{
				setState(48);
				sttm();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(KW_FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SttmContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(IsidroLangParser.DOT, 0); }
		public DeclareUmSttmContext declareUmSttm() {
			return getRuleContext(DeclareUmSttmContext.class,0);
		}
		public DeclareSttmContext declareSttm() {
			return getRuleContext(DeclareSttmContext.class,0);
		}
		public SeSttmContext seSttm() {
			return getRuleContext(SeSttmContext.class,0);
		}
		public FacaEnquantoSttmContext facaEnquantoSttm() {
			return getRuleContext(FacaEnquantoSttmContext.class,0);
		}
		public EnquantoSttmContext enquantoSttm() {
			return getRuleContext(EnquantoSttmContext.class,0);
		}
		public LeiaSttmContext leiaSttm() {
			return getRuleContext(LeiaSttmContext.class,0);
		}
		public EscrevaSttmContext escrevaSttm() {
			return getRuleContext(EscrevaSttmContext.class,0);
		}
		public EscrevaLinhaSttmContext escrevaLinhaSttm() {
			return getRuleContext(EscrevaLinhaSttmContext.class,0);
		}
		public AttrSttmContext attrSttm() {
			return getRuleContext(AttrSttmContext.class,0);
		}
		public ExprSttmContext exprSttm() {
			return getRuleContext(ExprSttmContext.class,0);
		}
		public TerminalNode KW_CONTINUE() { return getToken(IsidroLangParser.KW_CONTINUE, 0); }
		public TerminalNode KW_PARE() { return getToken(IsidroLangParser.KW_PARE, 0); }
		public SttmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sttm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterSttm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitSttm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitSttm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SttmContext sttm() throws RecognitionException {
		SttmContext _localctx = new SttmContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sttm);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				declareUmSttm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				declareSttm();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				seSttm();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				facaEnquantoSttm();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				enquantoSttm();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(62);
				leiaSttm();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				escrevaSttm();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(64);
				escrevaLinhaSttm();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(65);
				attrSttm();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(66);
				exprSttm();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(67);
				match(KW_CONTINUE);
				setState(68);
				match(DOT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(69);
				match(KW_PARE);
				setState(70);
				match(DOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareSttmContext extends ParserRuleContext {
		public TerminalNode KW_DECLARE() { return getToken(IsidroLangParser.KW_DECLARE, 0); }
		public List<TerminalNode> ID() { return getTokens(IsidroLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsidroLangParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(IsidroLangParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IsidroLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IsidroLangParser.COMMA, i);
		}
		public TerminalNode ATTR() { return getToken(IsidroLangParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclareSttmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareSttm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterDeclareSttm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitDeclareSttm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitDeclareSttm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareSttmContext declareSttm() throws RecognitionException {
		DeclareSttmContext _localctx = new DeclareSttmContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declareSttm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(KW_DECLARE);
			setState(74);
			match(ID);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				match(ID);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTR) {
				{
				setState(82);
				match(ATTR);
				setState(83);
				expr(0);
				}
			}

			setState(86);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareUmSttmContext extends ParserRuleContext {
		public TerminalNode KW_DECLARE() { return getToken(IsidroLangParser.KW_DECLARE, 0); }
		public TerminalNode ID() { return getToken(IsidroLangParser.ID, 0); }
		public TerminalNode DOT() { return getToken(IsidroLangParser.DOT, 0); }
		public TerminalNode COLONCOLON() { return getToken(IsidroLangParser.COLONCOLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ATTR() { return getToken(IsidroLangParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclareUmSttmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareUmSttm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterDeclareUmSttm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitDeclareUmSttm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitDeclareUmSttm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareUmSttmContext declareUmSttm() throws RecognitionException {
		DeclareUmSttmContext _localctx = new DeclareUmSttmContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declareUmSttm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(KW_DECLARE);
			setState(89);
			match(ID);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLONCOLON) {
				{
				setState(90);
				match(COLONCOLON);
				setState(91);
				tipo();
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTR) {
				{
				setState(94);
				match(ATTR);
				setState(95);
				expr(0);
				}
			}

			setState(98);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode KW_TY_BOOL() { return getToken(IsidroLangParser.KW_TY_BOOL, 0); }
		public TerminalNode KW_TY_INT() { return getToken(IsidroLangParser.KW_TY_INT, 0); }
		public TerminalNode KW_TY_REAL() { return getToken(IsidroLangParser.KW_TY_REAL, 0); }
		public TerminalNode KW_TY_TXT() { return getToken(IsidroLangParser.KW_TY_TXT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeSttmContext extends ParserRuleContext {
		public TerminalNode KW_SE() { return getToken(IsidroLangParser.KW_SE, 0); }
		public TerminalNode LPAREN() { return getToken(IsidroLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IsidroLangParser.RPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(IsidroLangParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(IsidroLangParser.COLON, i);
		}
		public List<SttmContext> sttm() {
			return getRuleContexts(SttmContext.class);
		}
		public SttmContext sttm(int i) {
			return getRuleContext(SttmContext.class,i);
		}
		public List<TerminalNode> KW_SENAO() { return getTokens(IsidroLangParser.KW_SENAO); }
		public TerminalNode KW_SENAO(int i) {
			return getToken(IsidroLangParser.KW_SENAO, i);
		}
		public List<TerminalNode> KW_FIM() { return getTokens(IsidroLangParser.KW_FIM); }
		public TerminalNode KW_FIM(int i) {
			return getToken(IsidroLangParser.KW_FIM, i);
		}
		public List<SeSttmContext> seSttm() {
			return getRuleContexts(SeSttmContext.class);
		}
		public SeSttmContext seSttm(int i) {
			return getRuleContext(SeSttmContext.class,i);
		}
		public SeSttmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seSttm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterSeSttm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitSeSttm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitSeSttm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeSttmContext seSttm() throws RecognitionException {
		SeSttmContext _localctx = new SeSttmContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_seSttm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(KW_SE);
			setState(103);
			match(LPAREN);
			setState(104);
			expr(0);
			setState(105);
			match(RPAREN);
			setState(106);
			match(COLON);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					sttm();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(126);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_SENAO:
						{
						setState(113);
						match(KW_SENAO);
						setState(123);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case COLON:
							{
							setState(114);
							match(COLON);
							setState(118);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143566957506L) != 0)) {
								{
								{
								setState(115);
								sttm();
								}
								}
								setState(120);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(121);
							match(KW_FIM);
							}
							break;
						case KW_SE:
							{
							setState(122);
							seSttm();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case KW_FIM:
						{
						setState(125);
						match(KW_FIM);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoSttmContext extends ParserRuleContext {
		public TerminalNode KW_ENQUANTO() { return getToken(IsidroLangParser.KW_ENQUANTO, 0); }
		public TerminalNode LPAREN() { return getToken(IsidroLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IsidroLangParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(IsidroLangParser.COLON, 0); }
		public TerminalNode KW_FIM() { return getToken(IsidroLangParser.KW_FIM, 0); }
		public List<SttmContext> sttm() {
			return getRuleContexts(SttmContext.class);
		}
		public SttmContext sttm(int i) {
			return getRuleContext(SttmContext.class,i);
		}
		public EnquantoSttmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquantoSttm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterEnquantoSttm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitEnquantoSttm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitEnquantoSttm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnquantoSttmContext enquantoSttm() throws RecognitionException {
		EnquantoSttmContext _localctx = new EnquantoSttmContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enquantoSttm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(KW_ENQUANTO);
			setState(132);
			match(LPAREN);
			setState(133);
			expr(0);
			setState(134);
			match(RPAREN);
			setState(135);
			match(COLON);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143566957506L) != 0)) {
				{
				{
				setState(136);
				sttm();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(KW_FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FacaEnquantoSttmContext extends ParserRuleContext {
		public TerminalNode KW_FACA() { return getToken(IsidroLangParser.KW_FACA, 0); }
		public TerminalNode COLON() { return getToken(IsidroLangParser.COLON, 0); }
		public TerminalNode KW_FIM() { return getToken(IsidroLangParser.KW_FIM, 0); }
		public TerminalNode KW_ENQUANTO() { return getToken(IsidroLangParser.KW_ENQUANTO, 0); }
		public TerminalNode LPAREN() { return getToken(IsidroLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IsidroLangParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(IsidroLangParser.DOT, 0); }
		public List<SttmContext> sttm() {
			return getRuleContexts(SttmContext.class);
		}
		public SttmContext sttm(int i) {
			return getRuleContext(SttmContext.class,i);
		}
		public FacaEnquantoSttmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facaEnquantoSttm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterFacaEnquantoSttm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitFacaEnquantoSttm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitFacaEnquantoSttm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacaEnquantoSttmContext facaEnquantoSttm() throws RecognitionException {
		FacaEnquantoSttmContext _localctx = new FacaEnquantoSttmContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_facaEnquantoSttm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(KW_FACA);
			setState(145);
			match(COLON);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143566957506L) != 0)) {
				{
				{
				setState(146);
				sttm();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(KW_FIM);
			setState(153);
			match(KW_ENQUANTO);
			setState(154);
			match(LPAREN);
			setState(155);
			expr(0);
			setState(156);
			match(RPAREN);
			setState(157);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeiaSttmContext extends ParserRuleContext {
		public TerminalNode KW_LEIA() { return getToken(IsidroLangParser.KW_LEIA, 0); }
		public TerminalNode LPAREN() { return getToken(IsidroLangParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(IsidroLangParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(IsidroLangParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(IsidroLangParser.DOT, 0); }
		public LeiaSttmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leiaSttm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterLeiaSttm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitLeiaSttm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitLeiaSttm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeiaSttmContext leiaSttm() throws RecognitionException {
		LeiaSttmContext _localctx = new LeiaSttmContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_leiaSttm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(KW_LEIA);
			setState(160);
			match(LPAREN);
			setState(161);
			match(ID);
			setState(162);
			match(RPAREN);
			setState(163);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscrevaSttmContext extends ParserRuleContext {
		public TerminalNode KW_ESCREVA() { return getToken(IsidroLangParser.KW_ESCREVA, 0); }
		public TerminalNode LPAREN() { return getToken(IsidroLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IsidroLangParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(IsidroLangParser.DOT, 0); }
		public EscrevaSttmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrevaSttm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterEscrevaSttm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitEscrevaSttm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitEscrevaSttm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscrevaSttmContext escrevaSttm() throws RecognitionException {
		EscrevaSttmContext _localctx = new EscrevaSttmContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_escrevaSttm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(KW_ESCREVA);
			setState(166);
			match(LPAREN);
			setState(167);
			expr(0);
			setState(168);
			match(RPAREN);
			setState(169);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscrevaLinhaSttmContext extends ParserRuleContext {
		public TerminalNode KW_ESCREVALINHA() { return getToken(IsidroLangParser.KW_ESCREVALINHA, 0); }
		public TerminalNode LPAREN() { return getToken(IsidroLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IsidroLangParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(IsidroLangParser.DOT, 0); }
		public EscrevaLinhaSttmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrevaLinhaSttm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterEscrevaLinhaSttm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitEscrevaLinhaSttm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitEscrevaLinhaSttm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscrevaLinhaSttmContext escrevaLinhaSttm() throws RecognitionException {
		EscrevaLinhaSttmContext _localctx = new EscrevaLinhaSttmContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_escrevaLinhaSttm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(KW_ESCREVALINHA);
			setState(172);
			match(LPAREN);
			setState(173);
			expr(0);
			setState(174);
			match(RPAREN);
			setState(175);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrSttmContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsidroLangParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(IsidroLangParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(IsidroLangParser.DOT, 0); }
		public AttrSttmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrSttm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterAttrSttm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitAttrSttm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitAttrSttm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrSttmContext attrSttm() throws RecognitionException {
		AttrSttmContext _localctx = new AttrSttmContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attrSttm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(178);
			match(ATTR);
			setState(179);
			expr(0);
			setState(180);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprSttmContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(IsidroLangParser.DOT, 0); }
		public ExprSttmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSttm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterExprSttm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitExprSttm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitExprSttm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSttmContext exprSttm() throws RecognitionException {
		ExprSttmContext _localctx = new ExprSttmContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprSttm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			expr(0);
			setState(183);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public LiteralExprContext literalExpr() {
			return getRuleContext(LiteralExprContext.class,0);
		}
		public NegExprContext negExpr() {
			return getRuleContext(NegExprContext.class,0);
		}
		public CompoundExprContext compoundExpr() {
			return getRuleContext(CompoundExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(IsidroLangParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(IsidroLangParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(IsidroLangParser.SLASH, 0); }
		public TerminalNode PLUS() { return getToken(IsidroLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(IsidroLangParser.MINUS, 0); }
		public CmpOpContext cmpOp() {
			return getRuleContext(CmpOpContext.class,0);
		}
		public TerminalNode KW_E() { return getToken(IsidroLangParser.KW_E, 0); }
		public TerminalNode KW_OU() { return getToken(IsidroLangParser.KW_OU, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_VERDADE:
			case KW_FALSO:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STR_LITERAL:
				{
				setState(186);
				literalExpr();
				}
				break;
			case KW_NEG:
				{
				setState(187);
				negExpr();
				}
				break;
			case LPAREN:
				{
				setState(188);
				compoundExpr();
				}
				break;
			case ID:
				{
				setState(189);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(193);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==SLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(196);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(199);
						cmpOp();
						setState(200);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(202);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(203);
						match(KW_E);
						setState(204);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(206);
						match(KW_OU);
						setState(207);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(IsidroLangParser.FLOAT_LITERAL, 0); }
		public TerminalNode INT_LITERAL() { return getToken(IsidroLangParser.INT_LITERAL, 0); }
		public TerminalNode STR_LITERAL() { return getToken(IsidroLangParser.STR_LITERAL, 0); }
		public TerminalNode KW_VERDADE() { return getToken(IsidroLangParser.KW_VERDADE, 0); }
		public TerminalNode KW_FALSO() { return getToken(IsidroLangParser.KW_FALSO, 0); }
		public LiteralExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralExprContext literalExpr() throws RecognitionException {
		LiteralExprContext _localctx = new LiteralExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234887168L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(IsidroLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IsidroLangParser.RPAREN, 0); }
		public CompoundExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterCompoundExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitCompoundExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitCompoundExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundExprContext compoundExpr() throws RecognitionException {
		CompoundExprContext _localctx = new CompoundExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compoundExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(LPAREN);
			setState(216);
			expr(0);
			setState(217);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegExprContext extends ParserRuleContext {
		public TerminalNode KW_NEG() { return getToken(IsidroLangParser.KW_NEG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterNegExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitNegExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitNegExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegExprContext negExpr() throws RecognitionException {
		NegExprContext _localctx = new NegExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_negExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(KW_NEG);
			setState(220);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmpOpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(IsidroLangParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(IsidroLangParser.NOTEQ, 0); }
		public TerminalNode MAIOR() { return getToken(IsidroLangParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(IsidroLangParser.MENOR, 0); }
		public TerminalNode MAIOREQ() { return getToken(IsidroLangParser.MAIOREQ, 0); }
		public TerminalNode MENOREQ() { return getToken(IsidroLangParser.MENOREQ, 0); }
		public CmpOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).enterCmpOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsidroLangParserListener ) ((IsidroLangParserListener)listener).exitCmpOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsidroLangParserVisitor ) return ((IsidroLangParserVisitor<? extends T>)visitor).visitCmpOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpOpContext cmpOp() throws RecognitionException {
		CmpOpContext _localctx = new CmpOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmpOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 138538465099776L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u00e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u00012\b\u0001"+
		"\n\u0001\f\u00015\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003N\b\u0003\n\u0003\f\u0003Q\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004a\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006m\b\u0006\n\u0006\f\u0006p\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006u\b\u0006\n\u0006\f\u0006x\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006|\b\u0006\u0001\u0006\u0005\u0006"+
		"\u007f\b\u0006\n\u0006\f\u0006\u0082\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u008a\b\u0007\n"+
		"\u0007\f\u0007\u008d\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u0094\b\b\n\b\f\b\u0097\t\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00bf\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00d1\b\u000e\n\u000e\f\u000e"+
		"\u00d4\t\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0000\u0001\u001c\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0005\u0001"+
		"\u0000\u0011\u0014\u0001\u0000\"#\u0001\u0000 !\u0002\u0000\u000b\f\u0019"+
		"\u001b\u0001\u0000).\u00ee\u0000&\u0001\u0000\u0000\u0000\u0002/\u0001"+
		"\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000"+
		"\u0000\bX\u0001\u0000\u0000\u0000\nd\u0001\u0000\u0000\u0000\ff\u0001"+
		"\u0000\u0000\u0000\u000e\u0083\u0001\u0000\u0000\u0000\u0010\u0090\u0001"+
		"\u0000\u0000\u0000\u0012\u009f\u0001\u0000\u0000\u0000\u0014\u00a5\u0001"+
		"\u0000\u0000\u0000\u0016\u00ab\u0001\u0000\u0000\u0000\u0018\u00b1\u0001"+
		"\u0000\u0000\u0000\u001a\u00b6\u0001\u0000\u0000\u0000\u001c\u00be\u0001"+
		"\u0000\u0000\u0000\u001e\u00d5\u0001\u0000\u0000\u0000 \u00d7\u0001\u0000"+
		"\u0000\u0000\"\u00db\u0001\u0000\u0000\u0000$\u00de\u0001\u0000\u0000"+
		"\u0000&*\u0005\u0002\u0000\u0000\')\u0003\u0004\u0002\u0000(\'\u0001\u0000"+
		"\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		"-.\u0005\u0003\u0000\u0000.\u0001\u0001\u0000\u0000\u0000/3\u0005%\u0000"+
		"\u000002\u0003\u0004\u0002\u000010\u0001\u0000\u0000\u000025\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0005\u0005\u0000\u0000"+
		"7\u0003\u0001\u0000\u0000\u00008H\u0005$\u0000\u00009H\u0003\b\u0004\u0000"+
		":H\u0003\u0006\u0003\u0000;H\u0003\f\u0006\u0000<H\u0003\u0010\b\u0000"+
		"=H\u0003\u000e\u0007\u0000>H\u0003\u0012\t\u0000?H\u0003\u0014\n\u0000"+
		"@H\u0003\u0016\u000b\u0000AH\u0003\u0018\f\u0000BH\u0003\u001a\r\u0000"+
		"CD\u0005\u000f\u0000\u0000DH\u0005$\u0000\u0000EF\u0005\u000e\u0000\u0000"+
		"FH\u0005$\u0000\u0000G8\u0001\u0000\u0000\u0000G9\u0001\u0000\u0000\u0000"+
		"G:\u0001\u0000\u0000\u0000G;\u0001\u0000\u0000\u0000G<\u0001\u0000\u0000"+
		"\u0000G=\u0001\u0000\u0000\u0000G>\u0001\u0000\u0000\u0000G?\u0001\u0000"+
		"\u0000\u0000G@\u0001\u0000\u0000\u0000GA\u0001\u0000\u0000\u0000GB\u0001"+
		"\u0000\u0000\u0000GC\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"H\u0005\u0001\u0000\u0000\u0000IJ\u0005\u0001\u0000\u0000JO\u00054\u0000"+
		"\u0000KL\u0005\'\u0000\u0000LN\u00054\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PT\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005"+
		"/\u0000\u0000SU\u0003\u001c\u000e\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005$\u0000\u0000W\u0007"+
		"\u0001\u0000\u0000\u0000XY\u0005\u0001\u0000\u0000Y\\\u00054\u0000\u0000"+
		"Z[\u0005&\u0000\u0000[]\u0003\n\u0005\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^_\u0005/\u0000\u0000"+
		"_a\u0003\u001c\u000e\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bc\u0005$\u0000\u0000c\t\u0001\u0000\u0000"+
		"\u0000de\u0007\u0000\u0000\u0000e\u000b\u0001\u0000\u0000\u0000fg\u0005"+
		"\t\u0000\u0000gh\u00050\u0000\u0000hi\u0003\u001c\u000e\u0000ij\u0005"+
		"1\u0000\u0000jn\u0005%\u0000\u0000km\u0003\u0004\u0002\u0000lk\u0001\u0000"+
		"\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000o\u0080\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000q{\u0005\n\u0000\u0000rv\u0005%\u0000\u0000su\u0003\u0004\u0002"+
		"\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000y|\u0005\u0005\u0000\u0000z|\u0003\f\u0006\u0000{r\u0001"+
		"\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}\u007f\u0005\u0005\u0000\u0000~q\u0001\u0000\u0000\u0000~}\u0001"+
		"\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\r\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0005\r\u0000\u0000"+
		"\u0084\u0085\u00050\u0000\u0000\u0085\u0086\u0003\u001c\u000e\u0000\u0086"+
		"\u0087\u00051\u0000\u0000\u0087\u008b\u0005%\u0000\u0000\u0088\u008a\u0003"+
		"\u0004\u0002\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u0005\u0000\u0000\u008f\u000f\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005\u0010\u0000\u0000\u0091\u0095\u0005"+
		"%\u0000\u0000\u0092\u0094\u0003\u0004\u0002\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0005"+
		"\u0000\u0000\u0099\u009a\u0005\r\u0000\u0000\u009a\u009b\u00050\u0000"+
		"\u0000\u009b\u009c\u0003\u001c\u000e\u0000\u009c\u009d\u00051\u0000\u0000"+
		"\u009d\u009e\u0005$\u0000\u0000\u009e\u0011\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005\u0006\u0000\u0000\u00a0\u00a1\u00050\u0000\u0000\u00a1\u00a2"+
		"\u00054\u0000\u0000\u00a2\u00a3\u00051\u0000\u0000\u00a3\u00a4\u0005$"+
		"\u0000\u0000\u00a4\u0013\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0007"+
		"\u0000\u0000\u00a6\u00a7\u00050\u0000\u0000\u00a7\u00a8\u0003\u001c\u000e"+
		"\u0000\u00a8\u00a9\u00051\u0000\u0000\u00a9\u00aa\u0005$\u0000\u0000\u00aa"+
		"\u0015\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\b\u0000\u0000\u00ac\u00ad"+
		"\u00050\u0000\u0000\u00ad\u00ae\u0003\u001c\u000e\u0000\u00ae\u00af\u0005"+
		"1\u0000\u0000\u00af\u00b0\u0005$\u0000\u0000\u00b0\u0017\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u00054\u0000\u0000\u00b2\u00b3\u0005/\u0000\u0000\u00b3"+
		"\u00b4\u0003\u001c\u000e\u0000\u00b4\u00b5\u0005$\u0000\u0000\u00b5\u0019"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003\u001c\u000e\u0000\u00b7\u00b8"+
		"\u0005$\u0000\u0000\u00b8\u001b\u0001\u0000\u0000\u0000\u00b9\u00ba\u0006"+
		"\u000e\uffff\uffff\u0000\u00ba\u00bf\u0003\u001e\u000f\u0000\u00bb\u00bf"+
		"\u0003\"\u0011\u0000\u00bc\u00bf\u0003 \u0010\u0000\u00bd\u00bf\u0005"+
		"4\u0000\u0000\u00be\u00b9\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00d2\u0001\u0000\u0000\u0000\u00c0\u00c1\n\u0007\u0000"+
		"\u0000\u00c1\u00c2\u0007\u0001\u0000\u0000\u00c2\u00d1\u0003\u001c\u000e"+
		"\b\u00c3\u00c4\n\u0006\u0000\u0000\u00c4\u00c5\u0007\u0002\u0000\u0000"+
		"\u00c5\u00d1\u0003\u001c\u000e\u0007\u00c6\u00c7\n\u0005\u0000\u0000\u00c7"+
		"\u00c8\u0003$\u0012\u0000\u00c8\u00c9\u0003\u001c\u000e\u0006\u00c9\u00d1"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\n\u0004\u0000\u0000\u00cb\u00cc\u0005"+
		"\u0015\u0000\u0000\u00cc\u00d1\u0003\u001c\u000e\u0005\u00cd\u00ce\n\u0003"+
		"\u0000\u0000\u00ce\u00cf\u0005\u0016\u0000\u0000\u00cf\u00d1\u0003\u001c"+
		"\u000e\u0004\u00d0\u00c0\u0001\u0000\u0000\u0000\u00d0\u00c3\u0001\u0000"+
		"\u0000\u0000\u00d0\u00c6\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u001d\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0007\u0003\u0000\u0000\u00d6\u001f\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u00050\u0000\u0000\u00d8\u00d9\u0003\u001c\u000e"+
		"\u0000\u00d9\u00da\u00051\u0000\u0000\u00da!\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0005\u0017\u0000\u0000\u00dc\u00dd\u0003\u001c\u000e\u0000\u00dd"+
		"#\u0001\u0000\u0000\u0000\u00de\u00df\u0007\u0004\u0000\u0000\u00df%\u0001"+
		"\u0000\u0000\u0000\u0011*3GOT\\`nv{~\u0080\u008b\u0095\u00be\u00d0\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}