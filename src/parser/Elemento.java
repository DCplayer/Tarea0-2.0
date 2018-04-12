package parser;

import java.util.ArrayList;

public class Elemento {
    private String name;
    private String type;
    private ArrayList<ArrayList<String>> signature;

    public Elemento(String name, String type, ArrayList<ArrayList<String>> signature) {
        this.name = name;
        this.type = type;
        this.signature = signature;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ArrayList<String>> getSignature() {
        return signature;
    }

    public String getType() {
        return type;
    }
}
