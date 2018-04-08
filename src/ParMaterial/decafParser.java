// Generated from decaf.g4 by ANTLR 4.7.1
package ParMaterial;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class decafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		ID=39, NUM=40, CHAR=41, WS=42;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_varDeclaration = 2, RULE_structDeclaration = 3, 
		RULE_varType = 4, RULE_methodDeclaration = 5, RULE_methodType = 6, RULE_parameter = 7, 
		RULE_parameterType = 8, RULE_block = 9, RULE_statement = 10, RULE_location = 11, 
		RULE_expression = 12, RULE_methodCall = 13, RULE_arg = 14, RULE_literal = 15, 
		RULE_int_literal = 16, RULE_char_literal = 17, RULE_bool_literal = 18;
	public static final String[] ruleNames = {
		"program", "declaration", "varDeclaration", "structDeclaration", "varType", 
		"methodDeclaration", "methodType", "parameter", "parameterType", "block", 
		"statement", "location", "expression", "methodCall", "arg", "literal", 
		"int_literal", "char_literal", "bool_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'Program'", "'{'", "'}'", "';'", "'['", "']'", "'struct'", 
		"'int'", "'char'", "'boolean'", "'void'", "'('", "')'", "'if'", "'else'", 
		"'while'", "'return'", "'='", "'.'", "'*'", "'/'", "'%'", "'+'", "'-'", 
		"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", "','", 
		"'''", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ID", "NUM", "CHAR", "WS"
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

	@Override
	public String getGrammarFileName() { return "decaf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public decafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitProgramContext extends ProgramContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public InitProgramContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitInitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new InitProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			match(T__1);
			setState(40);
			match(T__2);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(41);
				declaration();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(T__3);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationMethodContext extends DeclarationContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public DeclarationMethodContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitDeclarationMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaraionStructContext extends DeclarationContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public DeclaraionStructContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitDeclaraionStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationVarContext extends DeclarationContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public DeclarationVarContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitDeclarationVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new DeclaraionStructContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				structDeclaration();
				}
				break;
			case 2:
				_localctx = new DeclarationVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				varDeclaration();
				}
				break;
			case 3:
				_localctx = new DeclarationMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				methodDeclaration();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotValuedListContext extends VarDeclarationContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(decafParser.ID, 0); }
		public TerminalNode NUM() { return getToken(decafParser.NUM, 0); }
		public NotValuedListContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitNotValuedList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotValuedVarContext extends VarDeclarationContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(decafParser.ID, 0); }
		public NotValuedVarContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitNotValuedVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new NotValuedVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				varType();
				setState(55);
				match(ID);
				setState(56);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new NotValuedListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				varType();
				setState(59);
				match(ID);
				setState(60);
				match(T__5);
				setState(61);
				match(NUM);
				setState(62);
				match(T__6);
				setState(63);
				match(T__4);
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	 
		public StructDeclarationContext() { }
		public void copyFrom(StructDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructDeclContext extends StructDeclarationContext {
		public TerminalNode ID() { return getToken(decafParser.ID, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public StructDeclContext(StructDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitStructDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structDeclaration);
		int _la;
		try {
			_localctx = new StructDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__7);
			setState(68);
			match(ID);
			setState(69);
			match(T__2);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(70);
				varDeclaration();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(T__3);
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

	public static class VarTypeContext extends ParserRuleContext {
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
	 
		public VarTypeContext() { }
		public void copyFrom(VarTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructDeclVarContext extends VarTypeContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public StructDeclVarContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitStructDeclVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolVarContext extends VarTypeContext {
		public BoolVarContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitBoolVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntVarContext extends VarTypeContext {
		public IntVarContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitIntVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidVarContext extends VarTypeContext {
		public VoidVarContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitVoidVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharVarContext extends VarTypeContext {
		public CharVarContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitCharVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructVarContext extends VarTypeContext {
		public TerminalNode ID() { return getToken(decafParser.ID, 0); }
		public StructVarContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitStructVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varType);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IntVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new CharVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new BoolVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(T__10);
				}
				break;
			case 4:
				_localctx = new StructVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match(T__7);
				setState(82);
				match(ID);
				}
				break;
			case 5:
				_localctx = new StructDeclVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				structDeclaration();
				}
				break;
			case 6:
				_localctx = new VoidVarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				match(T__11);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDeclContext extends MethodDeclarationContext {
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(decafParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public MethodDeclContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			_localctx = new MethodDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			methodType();
			setState(88);
			match(ID);
			setState(89);
			match(T__12);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				{
				setState(90);
				parameter();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__13);
			setState(97);
			block();
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

	public static class MethodTypeContext extends ParserRuleContext {
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
	 
		public MethodTypeContext() { }
		public void copyFrom(MethodTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VoidMethContext extends MethodTypeContext {
		public VoidMethContext(MethodTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitVoidMeth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntMethContext extends MethodTypeContext {
		public IntMethContext(MethodTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitIntMeth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolMethContext extends MethodTypeContext {
		public BoolMethContext(MethodTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitBoolMeth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharMethContext extends MethodTypeContext {
		public CharMethContext(MethodTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitCharMeth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodType);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new IntMethContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new CharMethContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new BoolMethContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(T__10);
				}
				break;
			case T__11:
				_localctx = new VoidMethContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamTypeContext extends ParameterContext {
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(decafParser.ID, 0); }
		public ParamTypeContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitParamType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamListTypeContext extends ParameterContext {
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(decafParser.ID, 0); }
		public ParamListTypeContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitParamListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ParamTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				parameterType();
				setState(106);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamListTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				parameterType();
				setState(109);
				match(ID);
				setState(110);
				match(T__5);
				setState(111);
				match(T__6);
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

	public static class ParameterTypeContext extends ParserRuleContext {
		public ParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterType; }
	 
		public ParameterTypeContext() { }
		public void copyFrom(ParameterTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolParamContext extends ParameterTypeContext {
		public BoolParamContext(ParameterTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitBoolParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharParamContext extends ParameterTypeContext {
		public CharParamContext(ParameterTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitCharParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntParamContext extends ParameterTypeContext {
		public IntParamContext(ParameterTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitIntParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeContext parameterType() throws RecognitionException {
		ParameterTypeContext _localctx = new ParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterType);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new IntParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new CharParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new BoolParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockDeclContext extends BlockContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockDeclContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitBlockDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			_localctx = new BlockDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__2);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(121);
				varDeclaration();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__24) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(127);
				statement();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(T__3);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignStmContext extends StatementContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitAssignStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfDeclStmContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfDeclStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitIfDeclStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndStmContext extends StatementContext {
		public EndStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitEndStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnTypeStmContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnTypeStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitReturnTypeStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileDeclStmContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileDeclStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitWhileDeclStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallMethodStmContext extends StatementContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public CallMethodStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitCallMethodStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseDeclStmContext extends StatementContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfElseDeclStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitIfElseDeclStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitBlockStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStmContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitExpressionStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmContext extends StatementContext {
		public ReturnStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitReturnStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new IfDeclStmContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__14);
				setState(136);
				match(T__12);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__24) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(137);
					expression(0);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(T__13);
				setState(144);
				block();
				}
				break;
			case 2:
				_localctx = new IfElseDeclStmContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__14);
				setState(146);
				match(T__12);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__24) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(147);
					expression(0);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__13);
				setState(154);
				block();
				setState(155);
				match(T__15);
				setState(156);
				block();
				}
				break;
			case 3:
				_localctx = new WhileDeclStmContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(T__16);
				setState(159);
				match(T__12);
				setState(160);
				expression(0);
				setState(161);
				match(T__13);
				setState(162);
				block();
				}
				break;
			case 4:
				_localctx = new ReturnStmContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(T__17);
				setState(165);
				match(T__4);
				}
				break;
			case 5:
				_localctx = new ReturnTypeStmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(T__17);
				setState(167);
				expression(0);
				setState(168);
				match(T__4);
				}
				break;
			case 6:
				_localctx = new CallMethodStmContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				methodCall();
				setState(171);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new BlockStmContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				block();
				}
				break;
			case 8:
				_localctx = new AssignStmContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				location();
				setState(175);
				match(T__18);
				setState(176);
				expression(0);
				}
				break;
			case 9:
				_localctx = new EndStmContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(178);
				match(T__4);
				}
				break;
			case 10:
				_localctx = new ExpressionStmContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(179);
				expression(0);
				setState(180);
				match(T__4);
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

	public static class LocationContext extends ParserRuleContext {
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
	 
		public LocationContext() { }
		public void copyFrom(LocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionLocContext extends LocationContext {
		public TerminalNode ID() { return getToken(decafParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionLocContext(LocationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitExpressionLoc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionLocLocContext extends LocationContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode ID() { return getToken(decafParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionLocLocContext(LocationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitExpressionLocLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_location);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ExpressionLocContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(184);
					match(ID);
					}
					break;
				case 2:
					{
					setState(185);
					match(ID);
					setState(186);
					match(T__5);
					setState(187);
					expression(0);
					setState(188);
					match(T__6);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ExpressionLocLocContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(192);
					match(ID);
					}
					break;
				case 2:
					{
					setState(193);
					match(ID);
					setState(194);
					match(T__5);
					setState(195);
					expression(0);
					setState(196);
					match(T__6);
					}
					break;
				}
				setState(200);
				match(T__19);
				setState(201);
				location();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelOpExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelOpExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitRelOpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DashExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DashExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitDashExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitLiteralExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondOpExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CondOpExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitCondOpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocationExpContext extends ExpressionContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public LocationExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitLocationExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodExpContext extends ExpressionContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitMethodExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParentExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitParentExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqOpExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqOpExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitEqOpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitNotExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstArithOpExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FirstArithOpExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitFirstArithOpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SecondArithOpExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SecondArithOpExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitSecondArithOpExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new LocationExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(205);
				location();
				}
				break;
			case 2:
				{
				_localctx = new MethodExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				methodCall();
				}
				break;
			case 3:
				{
				_localctx = new LiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				literal();
				}
				break;
			case 4:
				{
				_localctx = new DashExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(T__24);
				setState(209);
				expression(3);
				}
				break;
			case 5:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(T__33);
				setState(211);
				expression(2);
				}
				break;
			case 6:
				{
				_localctx = new ParentExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(T__12);
				setState(213);
				expression(0);
				setState(214);
				match(T__13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(233);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new FirstArithOpExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(219);
						((FirstArithOpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
							((FirstArithOpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(220);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new SecondArithOpExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(222);
						((SecondArithOpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((SecondArithOpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(223);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new RelOpExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(225);
						((RelOpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
							((RelOpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new EqOpExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(228);
						((EqOpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
							((EqOpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new CondOpExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(231);
						((CondOpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((CondOpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class MethodCallContext extends ParserRuleContext {
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
	 
		public MethodCallContext() { }
		public void copyFrom(MethodCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodNoParamContext extends MethodCallContext {
		public TerminalNode ID() { return getToken(decafParser.ID, 0); }
		public MethodNoParamContext(MethodCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitMethodNoParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodWithParamContext extends MethodCallContext {
		public TerminalNode ID() { return getToken(decafParser.ID, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public MethodWithParamContext(MethodCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitMethodWithParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodCall);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new MethodWithParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(ID);
				setState(239);
				match(T__12);
				setState(240);
				arg();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__34) {
					{
					{
					setState(241);
					match(T__34);
					setState(242);
					arg();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				match(T__13);
				}
				break;
			case 2:
				_localctx = new MethodNoParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(ID);
				setState(251);
				match(T__12);
				setState(252);
				match(T__13);
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

	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionArgContext extends ArgContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitExpressionArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arg);
		try {
			_localctx = new ExpressionArgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			expression(0);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralCharContext extends LiteralContext {
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public LiteralCharContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitLiteralChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralBoolContext extends LiteralContext {
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public LiteralBoolContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitLiteralBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralIntContext extends LiteralContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public LiteralIntContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitLiteralInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new LiteralIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				int_literal();
				}
				break;
			case T__35:
				_localctx = new LiteralCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				char_literal();
				}
				break;
			case T__36:
			case T__37:
				_localctx = new LiteralBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				bool_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Int_literalContext extends ParserRuleContext {
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
	 
		public Int_literalContext() { }
		public void copyFrom(Int_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralIntDefContext extends Int_literalContext {
		public TerminalNode NUM() { return getToken(decafParser.NUM, 0); }
		public LiteralIntDefContext(Int_literalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitLiteralIntDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_int_literal);
		try {
			_localctx = new LiteralIntDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(NUM);
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

	public static class Char_literalContext extends ParserRuleContext {
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
	 
		public Char_literalContext() { }
		public void copyFrom(Char_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralCharDefContext extends Char_literalContext {
		public TerminalNode CHAR() { return getToken(decafParser.CHAR, 0); }
		public LiteralCharDefContext(Char_literalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitLiteralCharDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_char_literal);
		try {
			_localctx = new LiteralCharDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__35);
			setState(265);
			match(CHAR);
			setState(266);
			match(T__35);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
	 
		public Bool_literalContext() { }
		public void copyFrom(Bool_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FalseLiteralBoolDefContext extends Bool_literalContext {
		public FalseLiteralBoolDefContext(Bool_literalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitFalseLiteralBoolDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueLiteralBoolDefContext extends Bool_literalContext {
		public TrueLiteralBoolDefContext(Bool_literalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof decafVisitor ) return ((decafVisitor<? extends T>)visitor).visitTrueLiteralBoolDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bool_literal);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				_localctx = new TrueLiteralBoolDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(T__36);
				}
				break;
			case T__37:
				_localctx = new FalseLiteralBoolDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(T__37);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4D\n\4\3\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6X\n\6\3\7\3\7\3\7\3\7\7\7^\n\7\f\7\16\7a\13\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\5\bj\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n"+
		"\t\3\n\3\n\3\n\5\ny\n\n\3\13\3\13\7\13}\n\13\f\13\16\13\u0080\13\13\3"+
		"\13\7\13\u0083\n\13\f\13\16\13\u0086\13\13\3\13\3\13\3\f\3\f\3\f\7\f\u008d"+
		"\n\f\f\f\16\f\u0090\13\f\3\f\3\f\3\f\3\f\3\f\7\f\u0097\n\f\f\f\16\f\u009a"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b9\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00c1\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c9\n"+
		"\r\3\r\3\r\5\r\u00cd\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00db\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ec\n\16\f\16\16\16\u00ef\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\7\17\u00f6\n\17\f\17\16\17\u00f9\13\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0100\n\17\3\20\3\20\3\21\3\21\3\21\5\21"+
		"\u0107\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u0111\n\24\3"+
		"\24\2\3\32\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\7\3\2\27\31"+
		"\3\2\32\33\3\2\34\37\3\2 !\3\2\"#\2\u012f\2(\3\2\2\2\4\66\3\2\2\2\6C\3"+
		"\2\2\2\bE\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16i\3\2\2\2\20s\3\2\2\2\22x\3"+
		"\2\2\2\24z\3\2\2\2\26\u00b8\3\2\2\2\30\u00cc\3\2\2\2\32\u00da\3\2\2\2"+
		"\34\u00ff\3\2\2\2\36\u0101\3\2\2\2 \u0106\3\2\2\2\"\u0108\3\2\2\2$\u010a"+
		"\3\2\2\2&\u0110\3\2\2\2()\7\3\2\2)*\7\4\2\2*.\7\5\2\2+-\5\4\3\2,+\3\2"+
		"\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\6"+
		"\2\2\62\3\3\2\2\2\63\67\5\b\5\2\64\67\5\6\4\2\65\67\5\f\7\2\66\63\3\2"+
		"\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\5\3\2\2\289\5\n\6\29:\7)\2\2:;\7\7"+
		"\2\2;D\3\2\2\2<=\5\n\6\2=>\7)\2\2>?\7\b\2\2?@\7*\2\2@A\7\t\2\2AB\7\7\2"+
		"\2BD\3\2\2\2C8\3\2\2\2C<\3\2\2\2D\7\3\2\2\2EF\7\n\2\2FG\7)\2\2GK\7\5\2"+
		"\2HJ\5\6\4\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2"+
		"\2NO\7\6\2\2O\t\3\2\2\2PX\7\13\2\2QX\7\f\2\2RX\7\r\2\2ST\7\n\2\2TX\7)"+
		"\2\2UX\5\b\5\2VX\7\16\2\2WP\3\2\2\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WU\3"+
		"\2\2\2WV\3\2\2\2X\13\3\2\2\2YZ\5\16\b\2Z[\7)\2\2[_\7\17\2\2\\^\5\20\t"+
		"\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\20"+
		"\2\2cd\5\24\13\2d\r\3\2\2\2ej\7\13\2\2fj\7\f\2\2gj\7\r\2\2hj\7\16\2\2"+
		"ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\17\3\2\2\2kl\5\22\n\2lm\7)\2"+
		"\2mt\3\2\2\2no\5\22\n\2op\7)\2\2pq\7\b\2\2qr\7\t\2\2rt\3\2\2\2sk\3\2\2"+
		"\2sn\3\2\2\2t\21\3\2\2\2uy\7\13\2\2vy\7\f\2\2wy\7\r\2\2xu\3\2\2\2xv\3"+
		"\2\2\2xw\3\2\2\2y\23\3\2\2\2z~\7\5\2\2{}\5\6\4\2|{\3\2\2\2}\u0080\3\2"+
		"\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0084\3\2\2\2\u0080~\3\2\2\2\u0081\u0083"+
		"\5\26\f\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088"+
		"\7\6\2\2\u0088\25\3\2\2\2\u0089\u008a\7\21\2\2\u008a\u008e\7\17\2\2\u008b"+
		"\u008d\5\32\16\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\7\20\2\2\u0092\u00b9\5\24\13\2\u0093\u0094\7\21\2\2\u0094\u0098"+
		"\7\17\2\2\u0095\u0097\5\32\16\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2"+
		"\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009c\7\20\2\2\u009c\u009d\5\24\13\2\u009d\u009e\7\22\2"+
		"\2\u009e\u009f\5\24\13\2\u009f\u00b9\3\2\2\2\u00a0\u00a1\7\23\2\2\u00a1"+
		"\u00a2\7\17\2\2\u00a2\u00a3\5\32\16\2\u00a3\u00a4\7\20\2\2\u00a4\u00a5"+
		"\5\24\13\2\u00a5\u00b9\3\2\2\2\u00a6\u00a7\7\24\2\2\u00a7\u00b9\7\7\2"+
		"\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\5\32\16\2\u00aa\u00ab\7\7\2\2\u00ab"+
		"\u00b9\3\2\2\2\u00ac\u00ad\5\34\17\2\u00ad\u00ae\7\7\2\2\u00ae\u00b9\3"+
		"\2\2\2\u00af\u00b9\5\24\13\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\7\25\2\2"+
		"\u00b2\u00b3\5\32\16\2\u00b3\u00b9\3\2\2\2\u00b4\u00b9\7\7\2\2\u00b5\u00b6"+
		"\5\32\16\2\u00b6\u00b7\7\7\2\2\u00b7\u00b9\3\2\2\2\u00b8\u0089\3\2\2\2"+
		"\u00b8\u0093\3\2\2\2\u00b8\u00a0\3\2\2\2\u00b8\u00a6\3\2\2\2\u00b8\u00a8"+
		"\3\2\2\2\u00b8\u00ac\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8"+
		"\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\27\3\2\2\2\u00ba\u00c1\7)\2\2"+
		"\u00bb\u00bc\7)\2\2\u00bc\u00bd\7\b\2\2\u00bd\u00be\5\32\16\2\u00be\u00bf"+
		"\7\t\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c1"+
		"\u00cd\3\2\2\2\u00c2\u00c9\7)\2\2\u00c3\u00c4\7)\2\2\u00c4\u00c5\7\b\2"+
		"\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\7\t\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c2\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\26"+
		"\2\2\u00cb\u00cd\5\30\r\2\u00cc\u00c0\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd"+
		"\31\3\2\2\2\u00ce\u00cf\b\16\1\2\u00cf\u00db\5\30\r\2\u00d0\u00db\5\34"+
		"\17\2\u00d1\u00db\5 \21\2\u00d2\u00d3\7\33\2\2\u00d3\u00db\5\32\16\5\u00d4"+
		"\u00d5\7$\2\2\u00d5\u00db\5\32\16\4\u00d6\u00d7\7\17\2\2\u00d7\u00d8\5"+
		"\32\16\2\u00d8\u00d9\7\20\2\2\u00d9\u00db\3\2\2\2\u00da\u00ce\3\2\2\2"+
		"\u00da\u00d0\3\2\2\2\u00da\u00d1\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d4"+
		"\3\2\2\2\u00da\u00d6\3\2\2\2\u00db\u00ed\3\2\2\2\u00dc\u00dd\f\n\2\2\u00dd"+
		"\u00de\t\2\2\2\u00de\u00ec\5\32\16\13\u00df\u00e0\f\t\2\2\u00e0\u00e1"+
		"\t\3\2\2\u00e1\u00ec\5\32\16\n\u00e2\u00e3\f\b\2\2\u00e3\u00e4\t\4\2\2"+
		"\u00e4\u00ec\5\32\16\t\u00e5\u00e6\f\7\2\2\u00e6\u00e7\t\5\2\2\u00e7\u00ec"+
		"\5\32\16\b\u00e8\u00e9\f\6\2\2\u00e9\u00ea\t\6\2\2\u00ea\u00ec\5\32\16"+
		"\7\u00eb\u00dc\3\2\2\2\u00eb\u00df\3\2\2\2\u00eb\u00e2\3\2\2\2\u00eb\u00e5"+
		"\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\33\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7)\2\2"+
		"\u00f1\u00f2\7\17\2\2\u00f2\u00f7\5\36\20\2\u00f3\u00f4\7%\2\2\u00f4\u00f6"+
		"\5\36\20\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb"+
		"\7\20\2\2\u00fb\u0100\3\2\2\2\u00fc\u00fd\7)\2\2\u00fd\u00fe\7\17\2\2"+
		"\u00fe\u0100\7\20\2\2\u00ff\u00f0\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\35"+
		"\3\2\2\2\u0101\u0102\5\32\16\2\u0102\37\3\2\2\2\u0103\u0107\5\"\22\2\u0104"+
		"\u0107\5$\23\2\u0105\u0107\5&\24\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0105\3\2\2\2\u0107!\3\2\2\2\u0108\u0109\7*\2\2\u0109#\3\2"+
		"\2\2\u010a\u010b\7&\2\2\u010b\u010c\7+\2\2\u010c\u010d\7&\2\2\u010d%\3"+
		"\2\2\2\u010e\u0111\7\'\2\2\u010f\u0111\7(\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\'\3\2\2\2\32.\66CKW_isx~\u0084\u008e\u0098\u00b8"+
		"\u00c0\u00c8\u00cc\u00da\u00eb\u00ed\u00f7\u00ff\u0106\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}