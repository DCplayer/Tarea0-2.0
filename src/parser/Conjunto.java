package parser;

import java.util.ArrayList;

/**
 * Created by Christian12 on 16/04/2018.
 */
public class Conjunto extends Elemento{

    private int cantElementos;
    private ArrayList<Object> contenido = new ArrayList<>();

    public Conjunto(String name, String type, ArrayList<ArrayList<String>> signature, int cantElementos) {
        super(name, type, null);
        this.cantElementos = cantElementos;

    }

    public int getCantElementos() {
        return cantElementos;
    }

    public void addElement(Object value){
        contenido.add(value);
    }

    public ArrayList<Object> getContenido() {
        return contenido;
    }
}
