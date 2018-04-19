package Principal;

import ParMaterial.decafBaseVisitor;
import ParMaterial.decafParser;
import parser.*;

import java.security.interfaces.ECKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class
Visitador extends decafBaseVisitor<String> {
    private Stack<SyTable> verificadorAmbitos = new Stack();
    private ArrayList<String> argSignature = new ArrayList<>();
    private ArrayList<String> argType = new ArrayList<>();
    private String type;
    private String error = "";
    private Elemento objeto;
    private String locationID;

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInitProgram(decafParser.InitProgramContext ctx) { return visitChildren(ctx); }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDeclaraionStruct(decafParser.DeclaraionStructContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDeclarationVar(decafParser.DeclarationVarContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDeclarationMethod(decafParser.DeclarationMethodContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitNotValuedVar(decafParser.NotValuedVarContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitNotValuedList(decafParser.NotValuedListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStructDecl(decafParser.StructDeclContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitIntVar(decafParser.IntVarContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCharVar(decafParser.CharVarContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBoolVar(decafParser.BoolVarContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStructVar(decafParser.StructVarContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStructDeclVar(decafParser.StructDeclVarContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitVoidVar(decafParser.VoidVarContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitMethodDecl(decafParser.MethodDeclContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitIntMeth(decafParser.IntMethContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCharMeth(decafParser.CharMethContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBoolMeth(decafParser.BoolMethContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitVoidMeth(decafParser.VoidMethContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitParamType(decafParser.ParamTypeContext ctx) {

        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitParamListType(decafParser.ParamListTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitIntParam(decafParser.IntParamContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCharParam(decafParser.CharParamContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBoolParam(decafParser.BoolParamContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBlockDecl(decafParser.BlockDeclContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitIfDeclStm(decafParser.IfDeclStmContext ctx) {
        String stm = visit(ctx.expression());
        if(type.equals("boolean")){
            if(stm.equals("true")){
                visit(ctx.block());
                type = "void";
            }
        }
        else{
            //Error, el tipo de expression no es booleano
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                    ". " + ctx.expression().getText()+ " no es una expression de tipo 'boolean'.\n";
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitIfElseDeclStm(decafParser.IfElseDeclStmContext ctx) {
        String stm = visit(ctx.expression());
        if(type.equals("boolean")){
            if(stm.equals("true")){
                visit(ctx.block(0));
                type = "void";
            }
            else{
                visit(ctx.block(1));
                type = "void";
            }
        }
        else{
            //Error, el tipo de expression no es booleano
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                    ". " + ctx.expression().getText()+ " no es una expression de tipo 'boolean'.\n";
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitWhileDeclStm(decafParser.WhileDeclStmContext ctx) {
        String stm = visit(ctx.expression());
        if(type.equals("boolean")){
            while(stm.equals("true")){
                visit(ctx.block());
                type = "void";
            }
        }
        else{
            //Error, el tipo de expression no es booleano
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                    ". " + ctx.expression().getText()+ " no es una expression de tipo 'boolean'.\n";
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitReturnStm(decafParser.ReturnStmContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitReturnTypeStm(decafParser.ReturnTypeStmContext ctx) {
        String stm = visit(ctx.expression());
        return stm;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCallMethodStm(decafParser.CallMethodStmContext ctx) {return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBlockStm(decafParser.BlockStmContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAssignStm(decafParser.AssignStmContext ctx) {
        //Identificar quienes son los dos involucrados, en terminos de ID
        //Luego ver si, tienen el mismo tipo de dato
        //Realizar la asignacion

        String returnValue = visit(ctx.location());
        String locationType = type;


        String returnExpression = visit(ctx.expression());
        String expressionType = type;




        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitEndStm(decafParser.EndStmContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpressionStm(decafParser.ExpressionStmContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    @Override public String visitSimpleLoc(decafParser.SimpleLocContext ctx) {
        //Revisar si el ID existe y pertenece a un simbolo.
        String id = ctx.ID().getText();
        boolean revision = revisarExistencia(id);
        if(revision){
            if(objeto instanceof Symbol){
                return id;
            }
            else if (objeto instanceof Method){
                type = "null";
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                        ". " + id + " Debe de ser una lista o un simbolo, no un metodo.\n";
            }
            else{
                type = "null";
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                        ". " + id + " no es un symbolo o una lista.\n";
            }

        }
        else{
            //Error, ID no existente
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                    ". " + id + " no ha sido declarado.\n";


        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSimpleLocExpr(decafParser.SimpleLocExprContext ctx) {
        //Revisar si el ID existe y pertenece a un simbolo.
        String id = ctx.ID().getText();
        boolean revision = revisarExistencia(id);
        if(revision){
            if(objeto instanceof Symbol){
                String tipoSymbol = type;
                Symbol temporal = (Symbol) objeto;
                boolean structurado = false;
                if(temporal.isStruct()){
                    String deepening = visit(ctx.location());
                    structurado = true;
                }
                if(structurado && type.equals("null")){
                    type = "null";
                    return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                            ". " + ctx.getText() + " es de tipo 'null'.\n";

                }
                else{
                    //No es Struct, no puede obtener un ID.location
                    type = "null";
                    return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                            ". " + id + " no es un Struct, no puede obtenerse la " +
                            "condicion de atributo por medio de '.' .\n";
                }
            }
            else{
                //No es symbol, fijo es method o List
                type = "null";
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                        ". " + id + " no es un Symbol, es una Lista o un Method :D.\n";
            }

        }
        else{
            //Error, ID no existente
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                    ". " + id + " no ha sido declarado.\n";

        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitListLocExpr(decafParser.ListLocExprContext ctx) {
        //Revisar si el ID existe y pertenece a un simbolo.
        String id = ctx.ID().getText();
        boolean revision = revisarExistencia(id);
        if(revision){
            if(objeto instanceof Conjunto){
                Conjunto lista = (Conjunto) objeto;
                if(lista.isStruct()){
                    //Si se puede desarrollar lo de location con punto
                }
                else{
                    //Contenido de la lista no es struct, marcar error.
                }

            }
            else{
                //Error, no es una lista, la estructura esta mal
            }

        }
        else{
            //Error, ID no existente

        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitListLoc(decafParser.ListLocContext ctx) {
        //Revisar si el ID existe y pertenece a un simbolo.
        String id = ctx.ID().getText();
        boolean revision = revisarExistencia(id);
        if(revision){
            if(objeto instanceof List){
                String tipoLista = type;
                visit(ctx.expression());
                if(type.equals("int")){
                    //Obtener la instancia de Line
                    Conjunto temporal = (Conjunto) objeto;
                    try{
                        int indice = Integer.parseInt(visit(ctx.expression()));
                        String value = "" + temporal.getContenido().get(indice);
                        type = tipoLista;
                        return value;

                    }catch (Exception e ){
                        type = "null";
                        return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                                ". " + ctx.ID().getText() + " IndexOutOfBounds, posee:  "+ temporal.getCantElementos()+
                                " elementos, se pidio el elemento " + ctx.expression().getText()+ ".\n";

                    }

                }
                else{
                    //Expr no es de tipo int
                    type = "null";
                    return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                            ". " + ctx.expression().getText() + " no es de tipo 'int'.\n";
                }

            }
            else{
                //error, no es instancia de una lista
                type = "null";
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                        ". " + id + " No es una instancia de Lista.\n";
            }


        }
        else{
            //Error, ID no existente
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                    ". " + id + " no ha sido declarado.\n";

        }
    }
  /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRelOpExp(decafParser.RelOpExpContext ctx) {
        String operation = ctx.op.getText();
        String exp1 =  visit(ctx.expression(0));
        if(type.equals("int")){
            String exp2 = visit(ctx.expression(1));
            if(type.equals("int")){
                type = "boolean";
                if(operation.equals("<")){
                    if(Integer.parseInt(exp1) < Integer.parseInt(exp2)){
                        return "true";
                    }
                    else{
                        return "false";
                    }

                }
                else if(operation.equals(">")){
                    if(Integer.parseInt(exp1) > Integer.parseInt(exp2)){
                        return "true";
                    }
                    else{
                        return "false";
                    }

                }
                else if(operation.equals("<=")){
                    if(Integer.parseInt(exp1) <= Integer.parseInt(exp2)){
                        return "true";
                    }
                    else{
                        return "false";
                    }

                }
                else if(operation.equals(">=")){
                    if(Integer.parseInt(exp1) >= Integer.parseInt(exp2)){
                        return "true";
                    }
                    else{
                        return "false";
                    }
                }
                else{
                    //No es ningun signo esperado
                    return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                            ". " + ctx.expression(1).getText()+ " no es una expression de tipo 'int'.\n";

                }
            }
            else{
                //La segunda expresion no es tipo int
                type = "null";
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                        ". " + ctx.expression(1).getText()+ " no es una expression de tipo 'int'.\n";
            }
        }
        else{
            //Error porque no es tipo int
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                    ". " + ctx.expression(0).getText()+ " no es una expression de tipo 'int'.\n";
        }
    }
    /**
     * {@inheritDoc
     * }
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDashExp(decafParser.DashExpContext ctx) {
        String value = ctx.expression().getText();
        if(type.equals("int")){
            String posibleDash = value.substring(0,1);
            if(posibleDash.equals("-")){
                type = "int";
                String rialValue = value.substring(1,value.length());
                return rialValue;

            }
            else{
                type = "int";
                return "-" + value;

            }

        }
        else{
            //valor no es de tipo int, no se puede hacer dash;
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                    ". " + ctx.expression().getText() + " no es una expression de tipo 'int'.\n";

        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLiteralExp(decafParser.LiteralExpContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCondOpExp(decafParser.CondOpExpContext ctx) {
        String operaton = ctx.op.getText();
        if(operaton.equals("&&") || operaton.equals("||")){
            String exp1 = visit(ctx.expression(0));
            if(type.equals("boolean")){
                String exp2 = visit(ctx.expression(1));
                if(type.equals("boolean")){
                    //2 expresiones booleanas
                    type = "boolean";
                    if(operaton.equals("&&")){
                        if(exp1.equals(exp2) && exp1.equals("false")){
                            return "false";
                        }
                        else if(exp1.equals(exp2) && exp1.equals("true")){
                            return "true";
                        }
                        else{
                            //valores diferentes
                            return "false";
                        }

                    }
                    else{
                        if(exp1.equals(exp2) && exp1.equals("false")){
                            return "false";
                        }
                        else if(exp1.equals(exp2) && exp1.equals("true")){
                            return "true";
                        }
                        else{
                            //valores diferentes
                            return "true";
                        }

                    }
                }
                else{
                    //Expression 2 no es booleana
                    type = "null";
                    return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                            ". " + ctx.expression(1).getText()+ " no es una expression booleana.\n";
                }
            }
            else{
                //Expression 1 no es booleana
                type = "null";
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                        ". " + ctx.expression(0).getText()+ " no es una expression booleana.\n";
            }


        }
        else{
            //Esto mostrara error porque la operacion que esta enmedio no es
            //una condicional
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Se esperaba signo '&&' o '||'.\n";
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLocationExp(decafParser.LocationExpContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitMethodExp(decafParser.MethodExpContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitParentExp(decafParser.ParentExpContext ctx) {
        visit(ctx.expression());
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitEqOpExp(decafParser.EqOpExpContext ctx) {
        String operation = ctx.op.getText();
        String exp1 = visit(ctx.expression(0));
        String exp2 = visit(ctx.expression(1));
        if(operation.equals("==")){
            type = "boolean";
            if(exp1.equals(exp2)){
                return "true";
            }
            else{
                return "false";
            }


        }
        else if (operation.equals("!=")){
            type = "boolean";
            if(exp1.equals(exp2)){
                return "false";
            }
            else{
                return "true";
            }
        }
        else{
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Se esperaba signo '==' o '!='.\n";
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitNotExp(decafParser.NotExpContext ctx) {
        String value = visit(ctx.expression());
        if(type.equals("boolean")){
            if(value.equals("false")){
                type = "boolean";
                return "true";

            }
            else if(value.equals("true")){
                type = "boolean";
                return "false";

            }
            else{
                //Error porque no tiene ninguno de los valores booleanos esperados
                type = "null";
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Valor booleano esperado.\n";
            }
        }
        else{
            //Mostrar error porque lo que se quiere negar no es un booleano
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Valor booleano esperado.\n";
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFirstArithOpExp(decafParser.FirstArithOpExpContext ctx) {
        String opearation = ctx.op.getText();
        if(opearation.equals("*") ||opearation.equals("/") ||opearation.equals("%") ){
            String exp1 = visit(ctx.expression(0));
            if(type.equals("int")){
                String exp2 = visit(ctx.expression(1));
                if(type.equals("int")){
                    type = "int";
                    if(opearation.equals("*")){
                        int value = Integer.parseInt(exp1) * Integer.parseInt(exp2);
                        return "" + value;

                    }
                    else if(opearation.equals("/")){
                        int value = Integer.parseInt(exp1) / Integer.parseInt(exp2);
                        return "" + value;

                    }
                    else{
                        int value = Integer.parseInt(exp1) % Integer.parseInt(exp2);
                        return ""  + value;

                    }
                }
                else{
                    //Exp2 no es de tipo int
                    type = "null";
                    return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()
                            + ". Second expression type = "+ type +", expected 'int'\n";
                }
            }
            else{
                //exp1 no es de tipo int
                type = "null";
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()
                        + ". First expression type = "+ type +", expected 'int'\n";
            }

        }
        else{
            //No es ninguno de los operadores esperados
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()
                    + ". Expected '*', '/', '%' operators, got "+ opearation +" opearator\n";
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSecondArithOpExp(decafParser.SecondArithOpExpContext ctx) {
        String operation = ctx.op.getText();
        if(operation.equals("+") || operation.equals("-")){
            String exp1 = visit(ctx.expression(0));
            if(type.equals("int")){
                String exp2 = visit(ctx.expression(1));
                if(type.equals("int")){
                    if(operation.equals("+")){
                        type = "int";
                        int resultado = Integer.parseInt(exp1) + Integer.parseInt(exp2);
                        return "" + resultado;

                    }
                    else{
                        type = "int";
                        int resultado = Integer.parseInt(exp1) - Integer.parseInt(exp2);
                        return "" + resultado;

                    }
                }
                else{
                    //exp2 no es de tipo int
                    type = "null";
                    return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()
                            + ". Expected 'int', second expression type =. "+ type +"\n";

                }
            }
            else if (type.equals("char")){
                String exp2 = visit(ctx.expression(1));
                if(type.equals("char")){
                    if(operation.equals("+")){
                        type = "char";
                        return exp1 + exp2;
                    }
                    else{
                        //No se puede hacer resta de char :D solo concatenacion
                        type = "null";
                        return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()
                                + ". Non exisitent substraction of 'char'\n";
                    }

                }
                else{
                    //Exp 2 no es de tipo char cuando exp 1 si es char
                    type = "null";
                    return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()
                            + ". Expected 'char', first expression type = 'char', second expression type =. "+ type +"\n";
                }

            }
            else{
                //No se puede hacer la operacion, exp1 no es int ni char
                type = "null";
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()
                        + ". Expected 'int' or 'char', first expression type = "+ type +"\n";
            }
        }
        else{
            //Error, el signo ingresado no es ninguno de los esperados
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()
                    + ". Expected '+' or '-', recieved "+ operation+ "\n";
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitMethodCallDecl(decafParser.MethodCallDeclContext ctx) {
        //Chequear primero que existe el metodo
        String identificador = ctx.ID().getText();
        SyTable ambitoActual = verificadorAmbitos.peek();

        boolean existente = revisarExistencia(identificador);
        if(objeto instanceof Method){
            Method temporal = (Method) objeto;
            if(existente){
                //Si existe el metodo, crear una lista de strings con le tipo de datos que es cada uno
                //Verificar si ese tipo de datos es parte del signature del metodo
                List<decafParser.ArgContext> argumentos = ctx.arg();
                for(decafParser.ArgContext a: argumentos){
                    String value = visit(a);
                    argSignature.add(value);
                    argType.add(type);
                }
                boolean firmaExistente = false;
                for(ArrayList<String> ar: temporal.getTypeValue()){
                    if(ar.equals(argType)){
                        firmaExistente = true;
                        type = temporal.getType();
                    }
                }
                if(!firmaExistente){
                    //Mostrar error porque del metodo, no existe con esa combinacion de parametros
                    type = "null";
                    return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". "+ ctx.ID().getText() +": Firma no existente.\n";
                }
            }
            else{
                //Mostrar error porque el metodo no existe
                type = "null";
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\" , Method unexistent.\n";
            }
        }
        else{
            //Error, se esperaba un metodo
            type = "null";
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". "+ ctx.ID().getText() +": Method expected.\n";
        }


        /**
         * Tipo en Type = tipo del metodo.**/

        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpressionArg(decafParser.ExpressionArgContext ctx) {
        //Expresion de argumento, determinara el valor del argumento y el tipo del mismo
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLiteralInt(decafParser.LiteralIntContext ctx) {
        //Valor Numerico: NUM
        type = "int";
        return ctx.NUM().getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLiteralChar(decafParser.LiteralCharContext ctx) {
        //Valor String: CHAR
        type  = "char";
        return ctx.CHAR().getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String  visitLiteralTrue(decafParser.LiteralTrueContext ctx) {
        //Valor booleano: Verdadero
        type = "boolean";
        return "true";
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String  visitLiteralFalse(decafParser.LiteralFalseContext ctx) {
        //Valor booleano: Falso
        type = "boolean";
        return "false";

    }

    public boolean revisarExistencia (String id){
        //verificar que el metodo, lista, struct o symbolo exista en la tabla de simbolos
        for(SyTable st: verificadorAmbitos){
            for(Tuplas t: st.getTablaDeSimbolos()){
                if(t.getNombre().equals(id)){
                    objeto = t.getElemento();
                    type.equals(objeto.getType());

                    return true;
                }

            }
        }
        return  false;
    }



}
