package parser;

import java.util.ArrayList;
import java.util.Stack;

public class Method extends Elemento {
    private ArrayList<ArrayList<String>> returnValue;
    private Stack<SyTable> symbolTable;

    public Method(String name, ArrayList<ArrayList<String>> signature, ArrayList<ArrayList<String>> returnValue, Stack<SyTable> symbolTable) {
        super(name, signature);
        this.returnValue = returnValue;
        this.symbolTable = symbolTable;
    }

    public ArrayList<ArrayList<String>> getReturnValue() {
        return returnValue;
    }

    public Stack<SyTable> getSymbolTable() {
        return symbolTable;
    }
}
