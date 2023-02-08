package Ejercicio2;

public class SegundoEjer {
    public static void main(String[] args) {
        segundoEjercicio();
    }
    //Crea un array bidimensional de
    // enteros y recórrelo, mostrando la
    // posición y el valor de cada elemento
    // en ambas dimensiones.

    static void segundoEjercicio(){
        int num[][] = new int[2][5];
        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;
        num[0][3] = 4;
        num[0][4] = 5;

        num[1][0] = 6;
        num[1][1] = 7;
        num[1][2] = 8;
        num[1][3] = 9;
        num[1][4] = 10;


        //Recorremos el array bidimencional
        for (int i=0; i<num.length; i++){
            System.out.println("Estamos en la "+ i + " fila");

            for (int j=0; j<num[1].length; j++){
                System.out.println("Valor de i="+ i + " Valor de j="+ j);
                System.out.println(num[i][j]);
            }
        }
    }

}
