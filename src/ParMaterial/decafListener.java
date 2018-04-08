// Generated from decaf.g4 by ANTLR 4.7.1
package ParMaterial;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link decafParser}.
 */
public interface decafListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code initProgram}
	 * labeled alternative in {@link decafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterInitProgram(decafParser.InitProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initProgram}
	 * labeled alternative in {@link decafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitInitProgram(decafParser.InitProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaraionStruct}
	 * labeled alternative in {@link decafParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraionStruct(decafParser.DeclaraionStructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaraionStruct}
	 * labeled alternative in {@link decafParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraionStruct(decafParser.DeclaraionStructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationVar}
	 * labeled alternative in {@link decafParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationVar(decafParser.DeclarationVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationVar}
	 * labeled alternative in {@link decafParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationVar(decafParser.DeclarationVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationMethod}
	 * labeled alternative in {@link decafParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationMethod(decafParser.DeclarationMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationMethod}
	 * labeled alternative in {@link decafParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationMethod(decafParser.DeclarationMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notValuedVar}
	 * labeled alternative in {@link decafParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNotValuedVar(decafParser.NotValuedVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notValuedVar}
	 * labeled alternative in {@link decafParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNotValuedVar(decafParser.NotValuedVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notValuedList}
	 * labeled alternative in {@link decafParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNotValuedList(decafParser.NotValuedListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notValuedList}
	 * labeled alternative in {@link decafParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNotValuedList(decafParser.NotValuedListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structDecl}
	 * labeled alternative in {@link decafParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDecl(decafParser.StructDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structDecl}
	 * labeled alternative in {@link decafParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDecl(decafParser.StructDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intVar}
	 * labeled alternative in {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterIntVar(decafParser.IntVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intVar}
	 * labeled alternative in {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitIntVar(decafParser.IntVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charVar}
	 * labeled alternative in {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterCharVar(decafParser.CharVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charVar}
	 * labeled alternative in {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitCharVar(decafParser.CharVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolVar}
	 * labeled alternative in {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterBoolVar(decafParser.BoolVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolVar}
	 * labeled alternative in {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitBoolVar(decafParser.BoolVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structVar}
	 * labeled alternative in {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterStructVar(decafParser.StructVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structVar}
	 * labeled alternative in {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitStructVar(decafParser.StructVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structDeclVar}
	 * labeled alternative in {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclVar(decafParser.StructDeclVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structDeclVar}
	 * labeled alternative in {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclVar(decafParser.StructDeclVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidVar}
	 * labeled alternative in {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVoidVar(decafParser.VoidVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidVar}
	 * labeled alternative in {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVoidVar(decafParser.VoidVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link decafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(decafParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link decafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(decafParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intMeth}
	 * labeled alternative in {@link decafParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterIntMeth(decafParser.IntMethContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intMeth}
	 * labeled alternative in {@link decafParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitIntMeth(decafParser.IntMethContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charMeth}
	 * labeled alternative in {@link decafParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterCharMeth(decafParser.CharMethContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charMeth}
	 * labeled alternative in {@link decafParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitCharMeth(decafParser.CharMethContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolMeth}
	 * labeled alternative in {@link decafParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterBoolMeth(decafParser.BoolMethContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolMeth}
	 * labeled alternative in {@link decafParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitBoolMeth(decafParser.BoolMethContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidMeth}
	 * labeled alternative in {@link decafParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterVoidMeth(decafParser.VoidMethContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidMeth}
	 * labeled alternative in {@link decafParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitVoidMeth(decafParser.VoidMethContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramType}
	 * labeled alternative in {@link decafParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParamType(decafParser.ParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramType}
	 * labeled alternative in {@link decafParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParamType(decafParser.ParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramListType}
	 * labeled alternative in {@link decafParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParamListType(decafParser.ParamListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramListType}
	 * labeled alternative in {@link decafParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParamListType(decafParser.ParamListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intParam}
	 * labeled alternative in {@link decafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterIntParam(decafParser.IntParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intParam}
	 * labeled alternative in {@link decafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitIntParam(decafParser.IntParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charParam}
	 * labeled alternative in {@link decafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterCharParam(decafParser.CharParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charParam}
	 * labeled alternative in {@link decafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitCharParam(decafParser.CharParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolParam}
	 * labeled alternative in {@link decafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterBoolParam(decafParser.BoolParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolParam}
	 * labeled alternative in {@link decafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitBoolParam(decafParser.BoolParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockDecl}
	 * labeled alternative in {@link decafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockDecl(decafParser.BlockDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockDecl}
	 * labeled alternative in {@link decafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockDecl(decafParser.BlockDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifDeclStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfDeclStm(decafParser.IfDeclStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifDeclStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfDeclStm(decafParser.IfDeclStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseDeclStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseDeclStm(decafParser.IfElseDeclStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseDeclStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseDeclStm(decafParser.IfElseDeclStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileDeclStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileDeclStm(decafParser.WhileDeclStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileDeclStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileDeclStm(decafParser.WhileDeclStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStm(decafParser.ReturnStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStm(decafParser.ReturnStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnTypeStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnTypeStm(decafParser.ReturnTypeStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnTypeStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnTypeStm(decafParser.ReturnTypeStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callMethodStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallMethodStm(decafParser.CallMethodStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callMethodStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallMethodStm(decafParser.CallMethodStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStm(decafParser.BlockStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStm(decafParser.BlockStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStm(decafParser.AssignStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStm(decafParser.AssignStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code endStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEndStm(decafParser.EndStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code endStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEndStm(decafParser.EndStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStm(decafParser.ExpressionStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStm}
	 * labeled alternative in {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStm(decafParser.ExpressionStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionLoc}
	 * labeled alternative in {@link decafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLoc(decafParser.ExpressionLocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionLoc}
	 * labeled alternative in {@link decafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLoc(decafParser.ExpressionLocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionLocLoc}
	 * labeled alternative in {@link decafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLocLoc(decafParser.ExpressionLocLocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionLocLoc}
	 * labeled alternative in {@link decafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLocLoc(decafParser.ExpressionLocLocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relOpExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelOpExp(decafParser.RelOpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relOpExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelOpExp(decafParser.RelOpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dashExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDashExp(decafParser.DashExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dashExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDashExp(decafParser.DashExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExp(decafParser.LiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExp(decafParser.LiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condOpExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCondOpExp(decafParser.CondOpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condOpExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCondOpExp(decafParser.CondOpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code locationExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLocationExp(decafParser.LocationExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code locationExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLocationExp(decafParser.LocationExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodExp(decafParser.MethodExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodExp(decafParser.MethodExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentExp(decafParser.ParentExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentExp(decafParser.ParentExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqOpExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqOpExp(decafParser.EqOpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqOpExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqOpExp(decafParser.EqOpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(decafParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(decafParser.NotExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code firstArithOpExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFirstArithOpExp(decafParser.FirstArithOpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code firstArithOpExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFirstArithOpExp(decafParser.FirstArithOpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code secondArithOpExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSecondArithOpExp(decafParser.SecondArithOpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code secondArithOpExp}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSecondArithOpExp(decafParser.SecondArithOpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodWithParam}
	 * labeled alternative in {@link decafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodWithParam(decafParser.MethodWithParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodWithParam}
	 * labeled alternative in {@link decafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodWithParam(decafParser.MethodWithParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodNoParam}
	 * labeled alternative in {@link decafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodNoParam(decafParser.MethodNoParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodNoParam}
	 * labeled alternative in {@link decafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodNoParam(decafParser.MethodNoParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionArg}
	 * labeled alternative in {@link decafParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterExpressionArg(decafParser.ExpressionArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionArg}
	 * labeled alternative in {@link decafParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitExpressionArg(decafParser.ExpressionArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link decafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralInt(decafParser.LiteralIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link decafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralInt(decafParser.LiteralIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalChar}
	 * labeled alternative in {@link decafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralChar(decafParser.LiteralCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalChar}
	 * labeled alternative in {@link decafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralChar(decafParser.LiteralCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalBool}
	 * labeled alternative in {@link decafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralBool(decafParser.LiteralBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalBool}
	 * labeled alternative in {@link decafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralBool(decafParser.LiteralBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalIntDef}
	 * labeled alternative in {@link decafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralIntDef(decafParser.LiteralIntDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalIntDef}
	 * labeled alternative in {@link decafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralIntDef(decafParser.LiteralIntDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalCharDef}
	 * labeled alternative in {@link decafParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralCharDef(decafParser.LiteralCharDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalCharDef}
	 * labeled alternative in {@link decafParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralCharDef(decafParser.LiteralCharDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueLiteralBoolDef}
	 * labeled alternative in {@link decafParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteralBoolDef(decafParser.TrueLiteralBoolDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueLiteralBoolDef}
	 * labeled alternative in {@link decafParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteralBoolDef(decafParser.TrueLiteralBoolDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseLiteralBoolDef}
	 * labeled alternative in {@link decafParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteralBoolDef(decafParser.FalseLiteralBoolDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseLiteralBoolDef}
	 * labeled alternative in {@link decafParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteralBoolDef(decafParser.FalseLiteralBoolDefContext ctx);
}