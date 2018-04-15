package parser;

import java.util.ArrayList;

/**
 * Created by Diego Castaneda on 14/04/2018.
 */
public class List extends Elemento {
    private int cantElementos;
    private ArrayList<Object> contenido = new ArrayList<>();

    public List(String name, String type, ArrayList<ArrayList<String>> signature, int cantElementos) {
        super(name, type, null);
        this.cantElementos = cantElementos;

    }

    public int getCantElementos() {
        return cantElementos;
    }

    public void addElement(Object value){
        contenido.add(value);
    }
}
