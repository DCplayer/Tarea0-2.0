package parser;

import java.util.ArrayList;
import java.util.Stack;

public class Symbol extends Elemento {
    private String returnValue;
    private boolean isStruct;
    private Stack<SyTable> symbolTable;

    public Symbol(String name, ArrayList<ArrayList<String>> signature, String returnValue, boolean isStruct, Stack<SyTable> symbolTable) {
        super(name, signature);
        this.returnValue = returnValue;
        this.isStruct = isStruct;
        this.symbolTable = symbolTable;
    }

    public String getReturnValue() {
        return returnValue;
    }

    public boolean isStruct() {
        return isStruct;
    }

    public Stack<SyTable> getSymbolTable() {
        return symbolTable;
    }
}

