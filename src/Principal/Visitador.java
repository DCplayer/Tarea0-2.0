package Principal;

import ParMaterial.decafBaseVisitor;
import ParMaterial.decafParser;
import parser.Method;
import parser.SyTable;
import parser.Tuplas;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Visitador extends decafBaseVisitor<String> {
    private Stack verificadorAmbitos = new Stack();
    private ArrayList<String> argSignature = new ArrayList<>();
    private ArrayList<String> argType = new ArrayList<>();
    private String type;
    private String error = "";

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
    @Override public String visitIfDeclStm(decafParser.IfDeclStmContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitIfElseDeclStm(decafParser.IfElseDeclStmContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitWhileDeclStm(decafParser.WhileDeclStmContext ctx) { return visitChildren(ctx); }
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
    @Override public String visitReturnTypeStm(decafParser.ReturnTypeStmContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCallMethodStm(decafParser.CallMethodStmContext ctx) { return visitChildren(ctx); }
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
    @Override public String visitAssignStm(decafParser.AssignStmContext ctx) { return visitChildren(ctx); }
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
    @Override public String visitExpressionLoc(decafParser.ExpressionLocContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpressionLocLoc(decafParser.ExpressionLocLocContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRelOpExp(decafParser.RelOpExpContext ctx) {
<<<<<<< HEAD
        type = "boolean";
        return visitChildren(ctx);
    }

=======
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
>>>>>>> origin/master
    /**
     * {@inheritDoc
     * }
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDashExp(decafParser.DashExpContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLiteralExp(decafParser.LiteralExpContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCondOpExp(decafParser.CondOpExpContext ctx) {
<<<<<<< HEAD
        type = "boolean";
        return visitChildren(ctx);
=======
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
>>>>>>> origin/master
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLocationExp(decafParser.LocationExpContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitMethodExp(decafParser.MethodExpContext ctx) { return visitChildren(ctx); }
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
<<<<<<< HEAD
        type = "boolean";
        return visitChildren(ctx);
=======
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

>>>>>>> origin/master
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
    @Override public String visitFirstArithOpExp(decafParser.FirstArithOpExpContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSecondArithOpExp(decafParser.SecondArithOpExpContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitMethodCallDecl(decafParser.MethodCallDeclContext ctx) {
        //Chequear primero que existe el metodo
        String identificador = ctx.ID().getText();
        SyTable ambitoActual = (SyTable) verificadorAmbitos.peek();

        boolean existente = false;
        Method temporal = new Method(null, null, null, null, null, null);
        for (Tuplas t: ambitoActual.getTablaDeSimbolos()){
            if(t.getNombre().equals(identificador)){
                existente = true;
                temporal = (Method) t.getElemento();

            }
        }
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
        /**
         * Tipo en Type = tipo del metodo.**/
        type = temporal.getType();
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



}
