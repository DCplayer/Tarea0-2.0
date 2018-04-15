package parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Symbol extends Elemento {
    private String returnValue;
    private boolean isStruct;
    private Stack<SyTable> symbolTable;
    private boolean isList;
    private List<Object> list;
    private int cantElementos;


    public Symbol(String name, String type, ArrayList<ArrayList<String>> signature, String returnValue, boolean isStruct, Stack<SyTable> symbolTable) {
        super(name, type, signature);
        this.returnValue = returnValue;
        this.isStruct = isStruct;
        this.symbolTable = symbolTable;
    }

    public Symbol(String name, String type, int cantElement){
        super(name, type, null);
        isList = true;
        this.cantElementos = cantElement;

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

