package Ejercicio3y4;

import java.util.Vector;

public class VectorEjer {
    public static void main(String[] args) {
        vectorList();
    }


    //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.//
    static void vectorList(){
        Vector<String> vector1 = new Vector<>();
            vector1.add("Coco");
            vector1.add("Hayley");
            vector1.add("Sunflower");
            vector1.add("Totis");
            vector1.add("Fibi");

        System.out.println(vector1);

        System.out.println("Eliminando gatos");

        vector1.remove(2);
        vector1.remove(3);

        System.out.println(vector1);
    }
}
