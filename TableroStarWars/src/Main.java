import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static int fila = 10;
    private static int columna = 10;

    private static Random aleatorio = new Random();

    private static final char[][] tablero1 = new char[fila][columna];
    private static final char[][] tablero2 = new char[fila][columna];

    //Personajes tablero 1
    private static char YODA = 'Y';
    private static char DARTH = 'D';

    //Personajes tablero 2
    private static char DARTH_VADER = 'V';
    private static char R2D2 = 'R';

    //objetos tablero
    private static char MURO = 'M';
    private static char LIBRE = 'L';
    private static char FINAL = 'F';

    private static int filaYoda = 0;
    private static int columnaYoda = 0;

    private static int filaVader = 0;
    private static int columnaVader = 0;


    private static void RellenarTableroYoda() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tablero1[i][j] = 'L';
            }
        }
    }

    private static void RellenarTableroVader() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tablero2[i][j] = 'L';

            }
        }
    }

    private static void ImprimirTableroYoda() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(tablero1[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void ImprimirTableroVader() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(tablero2[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void ColocarPersonajeATablero1(char personaje) {
        filaYoda = aleatorio.nextInt(fila);
        columnaYoda = aleatorio.nextInt(columna);

        tablero1[filaYoda][columnaYoda] = personaje;

    }

    private static void ColocarPersonajeATablero2(char personaje) {
        filaVader = aleatorio.nextInt(fila);
        columnaVader = aleatorio.nextInt(columna);

        tablero2[filaVader][columnaVader] = personaje;
    }

    private static void ColocarObjetostablero1(char objeto, int numRepeticiones) {
        int filaAleatorioYoda = 0;
        int columnaAleatorioYoda = 0;
        for (int i = 0; i < numRepeticiones; i++) {
            do {
                filaAleatorioYoda = aleatorio.nextInt(fila);
                columnaAleatorioYoda = aleatorio.nextInt(columna);

            } while (tablero1[filaAleatorioYoda][columnaAleatorioYoda] != 'L');
            tablero1[filaAleatorioYoda][columnaAleatorioYoda] = objeto;

        }
    }

    private static void ColocarObjetostablero2(char objeto, int numRepeticiones) {
        int filaAleatoriaVader = 0;
        int columnaAleatoriaVader = 0;

        for (int i = 0; i < numRepeticiones; i++) {
            do {
                filaAleatoriaVader = aleatorio.nextInt(fila);
                columnaAleatoriaVader = aleatorio.nextInt(columna);

            } while (tablero2[filaAleatoriaVader][columnaAleatoriaVader] != 'L');
            tablero2[filaAleatoriaVader][columnaAleatoriaVader] = objeto;
        }
    }


    public static void main(String[] args) {
        RellenarTableroYoda();
        ColocarPersonajeATablero1(YODA);
        ColocarObjetostablero1(MURO, 10);
        ColocarObjetostablero1(DARTH, 10);
        tablero1[9][9] = FINAL;
        RellenarTableroVader();
        ColocarPersonajeATablero2(DARTH_VADER);
        ColocarObjetostablero2(MURO, 10);
        ColocarObjetostablero2(R2D2, 10);
        tablero2[9][9] = FINAL;


        int vidasTablero1 = 3;
        int vidasTablero2 = 3;

        int contador = 0;

        while (vidasTablero1 >= 0 || vidasTablero2 >= 0) {
            System.out.println();

            if (contador % 2 == 0) {
                ImprimirTableroYoda();
                System.out.println("ingresa movimientos del tablero 1");
                System.out.println("Vidas" + vidasTablero1);
            } else {
                ImprimirTableroVader();
                System.out.println("ingresa movimientos del tablero 2");
                System.out.println("Vidas" + vidasTablero2);

            }
            Scanner teclado = new Scanner(System.in);

            Scanner mov = new Scanner(System.in);

            String movimiento = teclado.nextLine();

            int numMov = teclado.nextInt();
            if (contador % 2 == 0) {
                switch (movimiento) {
                    case "W", "w":  // Movimiento hacia arriba
                        if ((filaYoda - numMov) >= 0) {
                            filaYoda = filaYoda - numMov;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - numMov;
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda + numMov][columnaYoda] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda + numMov][columnaYoda] = LIBRE;
                                    break;
                                case 'M':
                                    filaYoda = filaYoda + numMov;
                                    break;
                            }
                        }
                        break;

                    case "S", "s":  // Movimiento hacia arriba
                        if ((filaYoda + numMov) <tablero1.length) {
                            filaYoda = filaYoda + numMov;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - numMov;
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda - numMov][columnaYoda] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda - numMov][columnaYoda] = LIBRE;
                                    break;
                                case 'M':
                                    filaYoda = filaYoda - numMov;
                                    break;
                            }
                        }
                        break;
                    case "A", "a":  // Movimiento hacia arriba
                        if ((columnaYoda - numMov) >=0) {
                            columnaYoda = columnaYoda - numMov;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - numMov;
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda][columnaYoda + numMov] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda][columnaYoda + numMov] = LIBRE;
                                    break;
                                case 'M':
                                    columnaYoda = columnaYoda + numMov;
                                    break;
                            }
                        }
                        break;
                    case "D","d":
                        if ((columnaYoda + numMov) < tablero1[0].length) {
                            columnaYoda = columnaYoda + numMov;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - numMov;
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda][columnaYoda - numMov] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda][columnaYoda - numMov] = LIBRE;
                                    break;
                                case 'M':
                                    columnaYoda = columnaYoda - numMov;
                                    break;
                            }
                        }
                        break;
                    case "Q", "q":  // Movimiento en diagonal hacia arriba a la izquierda
                        if ((filaYoda - numMov) >= 0 && (columnaYoda - numMov) >= 0) {
                            filaYoda = filaYoda - numMov;
                            columnaYoda = columnaYoda - numMov;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - numMov;
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda + 1][columnaYoda + numMov] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda + numMov][columnaYoda + numMov] = LIBRE;
                                    break;
                                case 'M':
                                    filaYoda = filaYoda + numMov;
                                    columnaYoda = columnaYoda + numMov;
                                    break;
                            }
                        }
                        break;

                    case "E", "e":  // Movimiento en diagonal hacia arriba a la izquierda
                        if ((filaYoda - numMov) >= 0 && (columnaYoda + numMov) < tablero1[0].length) {
                            filaYoda = filaYoda - numMov;
                            columnaYoda = columnaYoda + numMov;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - numMov;
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda + numMov][columnaYoda - numMov] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda + numMov][columnaYoda - numMov] = LIBRE;
                                    break;
                                case 'M':
                                    filaYoda = filaYoda + numMov;
                                    columnaYoda = columnaYoda - numMov;
                                    break;
                            }
                        }
                        break;
                    case "Z", "z":  // Movimiento en diagonal hacia arriba a la izquierda
                        if ((filaYoda + numMov) < tablero1.length && (columnaYoda - numMov) >= 0){
                            filaYoda = filaYoda + numMov;
                            columnaYoda = columnaYoda - numMov;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - numMov;
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda - numMov][columnaYoda + numMov] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda - numMov][columnaYoda + numMov] = LIBRE;
                                    break;
                                case 'M':
                                    filaYoda = filaYoda - numMov;
                                    columnaYoda = columnaYoda + numMov;
                                    break;
                            }
                        }
                        break;
                    case "X", "x":  // Movimiento en diagonal hacia arriba a la izquierda
                        if ((filaYoda + numMov) < tablero1.length && (columnaYoda + numMov) < tablero1[0].length) {
                            filaYoda = filaYoda + numMov;
                            columnaYoda = columnaYoda + numMov;
                            switch (tablero1[filaYoda][columnaYoda]) {
                                case 'D':
                                    vidasTablero1 = vidasTablero1 - numMov;
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda - numMov][columnaYoda - numMov] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero1[filaYoda][columnaYoda] = YODA;
                                    tablero1[filaYoda - numMov][columnaYoda - numMov] = LIBRE;
                                    break;
                                case 'M':
                                    filaYoda = filaYoda - numMov;
                                    columnaYoda = columnaYoda + numMov;
                                    break;
                            }
                        }
                        break;
                }
                ImprimirTableroYoda();

            }else{
                switch (movimiento){
                    case "W", "w":  // Movimiento hacia arriba
                        if ((filaVader - numMov) >= 0) {
                            filaVader = filaVader - numMov;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - numMov;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader + numMov][columnaVader] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader + numMov][columnaVader] = LIBRE;
                                    break;
                                case 'M':
                                    filaVader = filaVader + numMov;
                                    break;
                            }
                        }
                        break;

                    case "S", "s":  // Movimiento hacia abajo
                        if ((filaVader + numMov) < tablero2.length) {
                            filaVader= filaVader + numMov;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - numMov;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader - numMov][columnaVader] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader - numMov][columnaVader] = LIBRE;
                                    break;
                                case 'M':
                                    filaVader = filaVader - numMov;
                                    break;
                            }
                        }
                        break;

                    case "A", "a":  // Movimiento hacia la izquierda
                        if ((columnaVader - numMov) >= 0) {
                            columnaVader = columnaVader - numMov;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - numMov;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero1[filaVader][columnaVader + numMov] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader][columnaVader + numMov] = LIBRE;
                                    break;
                                case 'M':
                                    columnaVader = columnaVader + numMov;
                                    break;
                            }
                        }
                        break;

                    case "D", "d":  // Movimiento hacia la derecha
                        if ((columnaVader + numMov) < tablero2[0].length) {
                            columnaVader = columnaVader + numMov;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - numMov;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader][columnaVader - numMov] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader][columnaVader - numMov] = LIBRE;
                                    break;
                                case 'M':
                                    columnaVader = columnaVader - numMov;
                                    break;
                            }
                        }
                        break;
                    case "Q", "q":  // Movimiento en diagonal hacia arriba a la izquierda
                        if ((columnaVader - numMov) >= 0 && (columnaVader - numMov) >= 0) {
                            filaVader = filaVader - numMov;
                            columnaVader = columnaVader - numMov;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - numMov;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader + numMov][columnaVader + numMov] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader + numMov][columnaVader + numMov] = LIBRE;
                                    break;
                                case 'M':
                                    filaVader = filaVader + numMov;
                                    columnaVader = columnaVader + numMov;
                                    break;
                            }
                        }
                        break;

                    case "E", "e":  // Movimiento en diagonal hacia arriba a la derecha
                        if ((filaVader - numMov) >= 0 && (columnaVader + numMov) < tablero2[0].length) {
                            filaVader = filaVader - numMov;
                            columnaVader = columnaVader + numMov;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - numMov;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader + numMov][columnaVader - numMov] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader + numMov][columnaVader - numMov] = LIBRE;
                                    break;
                                case 'M':
                                    filaVader = filaVader + numMov;
                                    columnaVader = columnaVader - numMov;
                                    break;
                            }
                        }
                        break;

                    case "Z", "z":  // Movimiento en diagonal hacia abajo a la izquierda
                        if ((filaVader + numMov) < tablero2.length && (columnaVader - numMov) >= 0) {
                            filaVader = filaVader + numMov;
                            columnaVader = columnaVader - numMov;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - numMov;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader - numMov][columnaVader + numMov] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader - numMov][columnaVader + numMov] = LIBRE;
                                    break;
                                case 'M':
                                    filaVader = filaVader - numMov;
                                    columnaVader = columnaVader + numMov;
                                    break;
                            }
                        }
                        break;

                    case "X", "x":  // Movimiento en diagonal hacia abajo a la derecha
                        if ((filaVader + numMov) < tablero2.length && (columnaVader + numMov) < tablero2[0].length) {
                            filaVader = filaVader + numMov;
                            columnaVader = columnaVader + numMov;
                            switch (tablero2[filaVader][columnaVader]) {
                                case 'R':
                                    vidasTablero2 = vidasTablero2 - numMov;
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader - numMov][columnaVader - numMov] = LIBRE;
                                    System.out.println("Has Perdido Una Vida");
                                    break;
                                case 'L':
                                    tablero2[filaVader][columnaVader] = DARTH_VADER;
                                    tablero2[filaVader - numMov][columnaVader - numMov] = LIBRE;
                                    break;
                                case 'M':
                                    filaVader = filaVader - numMov;
                                    columnaVader = columnaVader - numMov;
                                    break;
                                case 'F':
                                    vidasTablero1 = 0;
                                    break;
                            }
                        }
                        break;
                }
                ImprimirTableroVader();
            }
            System.out.println("===================");
            numMov = 0;
            contador ++;
        }

    }
}