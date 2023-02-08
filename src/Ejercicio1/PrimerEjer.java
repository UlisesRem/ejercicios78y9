package Ejercicio1;

public class PrimerEjer {
    public static void main(String[] args) {
    Ejer1();
    }

    static void Ejer1(){
        //Crea un array unidimensional de Strings
        // y recórrelo, mostrando únicamente sus valores. //

        String gatos[] = {"Calixto", "Pancho", "Mango"};

        for (String recorrido:gatos) {
            System.out.println(recorrido);
        }
    }
}
