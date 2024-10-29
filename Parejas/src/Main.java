// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int MAX_FILA_TABLERO = 4;
    static final int MAX_COLUMNA_TABLERO = 4;
    static final int[][] tablero = new int[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];



   static  Random aleatorio = new Random();

    public static void main(String[] args) {
        // Tablero 4x4 de pareajas del 1 al 8, usuario mete coordenadas y las compara



        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                tablero[i][j] = 0;


                }

        }
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <2 ; j++) {

                int FilaRandom;
                int ColumnaRandom;

                do {
                    FilaRandom = aleatorio.nextInt(MAX_FILA_TABLERO);
                    ColumnaRandom = aleatorio.nextInt(MAX_FILA_TABLERO);
                }while(tablero[FilaRandom][ColumnaRandom]!=0);
                tablero[FilaRandom][ColumnaRandom] =(i+1);

            }

        }
        for (int i = 0; i <MAX_FILA_TABLERO; i++) {
            for (int j = 0; j <MAX_COLUMNA_TABLERO; j++) {
                System.out.print(tablero[i][j] + " ");

            }
            System.out.println();

        }
        int intento = 10;
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("OPORTUNIDADES " +intento);
            System.out.println("MANIN GIVE THE FIRST POSITION PLS");
            System.out.println("FILA");
            int Fila1 = leer.nextInt();
            System.out.println("COLUMNA");
            int Columna1 = leer.nextInt();
            System.out.println("DAME LA POSTION TWO MAMAHUEVASOO");
            System.out.println("FILA");
            int Fila2 = leer.nextInt();
            System.out.println("COLUMNA");
            int Columna2 = leer.nextInt();

            if (tablero[Fila1][Columna1] == tablero[Fila2][Columna2]) {
                System.out.println("OLE CARECHIMBA HAS ACERTAU");
                tablero[Fila1][Columna1] = 0;
                tablero[Fila2][Columna2] = 0;
            } else{
                System.out.println("MONGOLICO HAS FALLAU");
                intento--;
            }
            for (int i = 0; i <MAX_FILA_TABLERO; i++) {
                for (int j = 0; j <MAX_COLUMNA_TABLERO; j++) {
                    System.out.print(tablero[i][j] + " ");

                }
                System.out.println();



            }
        }while (intento < 10 );




    }
}