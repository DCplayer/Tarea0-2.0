package parser;

import java.util.ArrayList;
import java.util.Stack;

public class Method extends Elemento {
    private ArrayList<ArrayList<String>> returnValue;
    private ArrayList<ArrayList<String>> typeValue;
    private Stack<SyTable> symbolTable;

    public Method(String name, String type, ArrayList<ArrayList<String>> signature, ArrayList<ArrayList<String>> returnValue, ArrayList<ArrayList<String>> typeValue ,Stack<SyTable> symbolTable) {
        super(name, type, signature);
        this.returnValue = returnValue;
        this.symbolTable = symbolTable;
        this.typeValue = typeValue;
    }

    public ArrayList<ArrayList<String>> getReturnValue() {
        return returnValue;
    }

    public Stack<SyTable> getSymbolTable() {
        return symbolTable;
    }

    public ArrayList<ArrayList<String>> getTypeValue() {
        return typeValue;
    }
}
