package Ejercicio7;

import java.util.Scanner;

public class siete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los numeros a dividir");
        System.out.println("Numero 1: ");
        int a = scanner.nextInt();
        System.out.println("Numero 2: ");
        int b = scanner.nextInt();
        try {
            System.out.println("Resultado: "+ DividePorCero(a, b));
        } catch (ArithmeticException e){
            System.out.println("Esto no púede hacerse");
        } finally {
            System.out.println("Demo de codigo");
        }

    }
    //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
    // ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
    // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
    // Finalmente, mostraremos en cualquier caso: "Demo de código".//

    static int DividePorCero(int a, int b) throws ArithmeticException {
        return a / b;
            }
    }
