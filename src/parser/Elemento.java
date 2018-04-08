package parser;

import java.util.ArrayList;

public class Elemento {
    private String name;
    private ArrayList<ArrayList<String>> signature;

    public Elemento(String name, ArrayList<ArrayList<String>> signature) {
        this.name = name;
        this.signature = signature;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ArrayList<String>> getSignature() {
        return signature;
    }
}
