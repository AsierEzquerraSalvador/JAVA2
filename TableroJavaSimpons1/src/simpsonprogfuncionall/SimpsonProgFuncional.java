package simpsonprogfuncionall;

import java.util.Random;

public class SimpsonProgFuncional {
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    private static char[][] tablero;
    public static void main (String [] args) {
        // 1ª Inicializar mi matriz tablero
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];

        // 2ª Rellenar el tablero 'L'
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                //[0,0][0,1][0,2][0,3],ETC
                tablero[i][j] = 'L';

            }
        }
        //3ª Imprimir tablero
        imprimirTablero();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //Asignar a bart
        Random aleatorio = new Random();
        int filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO) ; // Genera numeros aleatorios de 0-9
        int columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO) ; // Genera numeros aleatorios de 0-9

        tablero[filaAleatorio][columnaAleatorio] = 'B';

        //5ª Imprimir tablero de nuevo, si no no se verian los cambios
        imprimirTablero();
        // 6º Repartir 10 homer dentro del tablero
        int filaAleatorioHomer;
        int columnaAleatorioHomer;
        for (int i = 0; i <10 ; i++) {
            do {

                filaAleatorioHomer = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaAleatorioHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            }while (tablero[filaAleatorioHomer][columnaAleatorioHomer]!='L');
            // No se pueden reescribir los homers
            tablero[filaAleatorioHomer][columnaAleatorioHomer]= 'H';
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //7ª Imprimir tablero de nuevo, si no no se verian los cambios
        imprimirTablero();
        int filaAleatorioMuro;
        int columnaAleatorioMuro;
        for (int i = 0; i <10 ; i++) {
            do {

                filaAleatorioMuro = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaAleatorioMuro = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            }while (tablero[filaAleatorioMuro][columnaAleatorioMuro]!='L');
            // No se pueden reescribir los homers
            tablero[filaAleatorioMuro][columnaAleatorioMuro]= 'M';
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        imprimirTablero();
        tablero[MAX_FILA_TABLERO-1][MAX_COLUMNA_TABLERO-1] = 'F';
        System.out.println("");
        System.out.println("");
        System.out.println("");

        imprimirTablero();

    }
    private static void imprimirTablero(){for (int i = 0; i < MAX_FILA_TABLERO; i++) {
        for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
            //[0,0][0,1][0,2][0,3],ETC
            System.out.print(tablero[i][j] + " ");

        }
        System.out.println(""); //Para que este la matriz en filas y columnas
    }

    }
}
