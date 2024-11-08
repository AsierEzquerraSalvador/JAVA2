import java.util.Random;

public class Main {
    // Nombres de las variables con camelCase
    private static int filaTablero = 10;
    private static int columnaTablero = 10;
    private static int filaTablero1 = 10;
    private static int columnaTablero1 = 10;

    private static char[][] tablero;
    private static char[][] tablero1;

    public static void main(String[] args) {
        // Inicializamos los tableros
        inicializarTablero();

        // Colocamos las letras aleatorias en los tableros
        colocarElementosAleatorios();

        // Imprimimos ambos tableros
        System.out.println("Tablero 1:");
        imprimirTablero(tablero);  // Imprime el tablero con 'L' y una 'Y' aleatoria
        System.out.println("Tablero 2:");
        imprimirTablero(tablero1);  // Imprime el tablero con 'l' y las letras aleatorias
    }

    // Función para inicializar los tableros con 'L' y 'l'
    private static void inicializarTablero() {
        tablero = new char[filaTablero][columnaTablero];
        tablero1 = new char[filaTablero1][columnaTablero1];

        // Rellenamos el Tablero 1 con 'L' (mayúscula)
        for (int i = 0; i < filaTablero; i++) {
            for (int j = 0; j < columnaTablero; j++) {
                tablero[i][j] = 'L';  // Asignamos 'L' al tablero 1
            }
        }

        // Rellenamos el Tablero 2 con 'l' (minúscula)
        for (int i = 0; i < filaTablero1; i++) {
            for (int j = 0; j < columnaTablero1; j++) {
                tablero1[i][j] = 'l';  // Asignamos 'l' al tablero 2
            }
        }
    }

    // Función para colocar los elementos aleatorios en los tableros
    private static void colocarElementosAleatorios() {
        Random aleatorio = new Random();

        // Colocamos la 'Y' en una posición aleatoria en el Tablero 1
        int filaAleatorio = aleatorio.nextInt(filaTablero);
        int columnaAleatorio = aleatorio.nextInt(columnaTablero);
        tablero[filaAleatorio][columnaAleatorio] = 'Y';

        // Colocamos la 'V' en una posición aleatoria en el Tablero 2
        int filaAleatorio1 = aleatorio.nextInt(filaTablero1);
        int columnaAleatorio1 = aleatorio.nextInt(columnaTablero1);
        tablero1[filaAleatorio1][columnaAleatorio1] = 'V';

        // Colocamos 5 letras 'D' en el Tablero 1
        for (int i = 0; i < 5; i++) {
            int FilaAleatorioMaul;
            int ColumnaAleatorioMaul;
            do {
                FilaAleatorioMaul = aleatorio.nextInt(filaTablero);
                ColumnaAleatorioMaul = aleatorio.nextInt(columnaTablero);
            } while (tablero[FilaAleatorioMaul][ColumnaAleatorioMaul] != 'L');
            tablero[FilaAleatorioMaul][ColumnaAleatorioMaul] = 'D'; // Colocamos la 'D' en el Tablero 1
        }

        // Colocamos 5 letras 'V' en el Tablero 2
        for (int i = 0; i < 5; i++) {
            int FilaAleatorioVader;
            int ColumnaAleatorioVader;
            do {
                FilaAleatorioVader = aleatorio.nextInt(filaTablero1);
                ColumnaAleatorioVader = aleatorio.nextInt(columnaTablero1);
            } while (tablero1[FilaAleatorioVader][ColumnaAleatorioVader] != 'l');
            tablero1[FilaAleatorioVader][ColumnaAleatorioVader] = 'V'; // Colocamos la 'V' en el Tablero 2
        }

        // Colocamos 5 letras 'M' en el Tablero 1
        for (int i = 0; i < 5; i++) {
            int FilaAleatorioMuro;
            int ColumnaAleatorioMuro;
            do {
                FilaAleatorioMuro = aleatorio.nextInt(filaTablero);  // Usamos filaTablero
                ColumnaAleatorioMuro = aleatorio.nextInt(columnaTablero); // Usamos columnaTablero
            } while (tablero[FilaAleatorioMuro][ColumnaAleatorioMuro] != 'L');  // Verificamos en Tablero 1
            tablero[FilaAleatorioMuro][ColumnaAleatorioMuro] = 'M'; // Colocamos la 'M' en el Tablero 1
        }

        // Colocamos 5 letras 'M' en el Tablero 2
        for (int i = 0; i < 5; i++) {
            int FilaAleatorioMuro;
            int ColumnaAleatorioMuro;
            do {
                FilaAleatorioMuro = aleatorio.nextInt(filaTablero1); // Usamos filaTablero1
                ColumnaAleatorioMuro = aleatorio.nextInt(columnaTablero1); // Usamos columnaTablero1
            } while (tablero1[FilaAleatorioMuro][ColumnaAleatorioMuro] != 'l'); // Verificamos en Tablero 2
            tablero1[FilaAleatorioMuro][ColumnaAleatorioMuro] = 'M'; // Colocamos la 'M' en el Tablero 2
        }

        // Colocamos la 'F' en las posiciones de las esquinas de ambos tableros
        tablero[filaTablero - 1][columnaTablero - 1] = 'F';
        tablero1[filaTablero1 - 1][columnaTablero1 - 1] = 'F';
    }

    // Función para imprimir cualquier tablero
    private static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();  // Salto de línea después de cada fila
        }
    }
}
