import java.util.Random;
import java.util.Scanner;

// Prueba dia 24/10/2024 Asier Ezquerra
public class Main {
    private static int fila_Tablero = 10;
    private static int columna_tablero = 10;


    private static void ImprimirTablero() {
        for (int i = 0; i < fila_Tablero; i++) {
            for (int j = 0; j < columna_tablero; j++) {
                System.out.print(tablero[i][j] + " ");

            }
            System.out.println(" ");

        }
    }


    private static char[][] tablero;

    public static void main(String[] args) {

        tablero = new char[fila_Tablero][columna_tablero];
        for (int i = 0; i < fila_Tablero; i++) {
            for (int j = 0; j < columna_tablero; j++) {
                tablero[i][j] = 'X';
            }
        }
        ImprimirTablero();
        System.out.println();
        System.out.println();
        System.out.println();


        int filas = 10;
        int columnas = 10;
        int[][] tablero1 = new int[filas][columnas];
        Random aletorio = new Random();
        for (int k = 0; k < filas; k++) {
            for (int l = 0; l < columnas; l++) {
                tablero1[k][l] = aletorio.nextInt(90)+10;
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero1[i][j] + " ");

            }
            System.out.println();
        }
        int intentos;
        intentos = 10;
        do {
            System.out.println("DAME UN NUMERO");

            System.out.println("TIENES " + intentos);
            Scanner leer = new Scanner(System.in);
            int NumIntroducido = leer.nextInt();
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (tablero1[i][j] == (NumIntroducido)) {
                        tablero1[i][j] = 0;
                    }
                }
            } for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(tablero1[i][j] + " ");

                }
                System.out.println();
            }
            intentos --;

        } while (intentos > 0);
    }
}