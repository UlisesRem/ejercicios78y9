package Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicoSeis {
    public static void main(String[] args) {
        ejercicio();
    }

    //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
    // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
    // Por último, vuelve a recorrerlo y muestra el ArrayList final.
    // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno. //

    static void ejercicio(){
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.println("Ingrese un digito");
            numeros.add(scanner.nextInt());

            for (int num=0; num<numeros.size(); num++){
                if (numeros.get(num) % 2==0){
                    numeros.remove(num);
                }
            }
        }
        System.out.println(numeros);
    }
}
