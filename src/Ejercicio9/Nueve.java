package Ejercicio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Nueve {
    public static void main(String[] args) {
        mapa();
    }

    // REGISTRO DE LIBROS CON SU AUTOR MEDIANTE UN HASHMAP E INGRESO DE DATOS MEDIANTE SCANNER
    static void mapa(){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> mapita = new HashMap<>(2);
        for (int i=0; i<2; i++){
            System.out.println("Ingresa el autor: ");
            String autor = scanner.next();
            System.out.println("Ingresa el libro");
            String libro = scanner.next();
            mapita.put(autor, libro);


            }
        for (Map.Entry elemento : mapita.entrySet()){
            System.out.println("Autor: "+ elemento.getKey());
            System.out.println("Libro: "+ elemento.getValue());
            System.out.println("___________________________________________");
        }
        }
    }