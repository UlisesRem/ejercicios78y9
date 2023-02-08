package Ejercicio5;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArreglosLink {
    public static void main(String[] args) {
        linkeo();
    }

    //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.//
    static void linkeo(){
        ArrayList<Integer> digitos = new ArrayList<Integer>();
        digitos.add(1);
        digitos.add(2);
        digitos.add(3);
        digitos.add(4);

        LinkedList<Integer> digitos2 = new LinkedList<Integer>(digitos);

        for (int recorr:digitos2) {
            System.out.println("Datos: "+ recorr);
        }
    }
}
