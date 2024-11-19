import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static String palabras[] = {
            "helada",
            "mesa",
            "patata"
    };
    static char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    static char sopaLetras[][] = new char[10][10];
    static char sopaLetrasCopia[][] = new char[10][10];
    static Random ale = new Random();

    static void RellenarMatriz() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int numAle = ale.nextInt(26);
                sopaLetras[i][j] = letras[numAle];
            }
        }
    }

    static void RellenarMatrizCopia() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sopaLetrasCopia[i][j] = '0';
            }
        }
    }
    static void imprimirMatriz (){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopaLetras[i][j] + " ");

            }
            System.out.println();
        }

    }
    static void ImprimirMatrizCopia(){

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopaLetrasCopia[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RellenarMatrizCopia();


        System.out.println();
        RellenarMatriz();


        for (int i = 0; i < palabras.length; i++) {
            //cuantas palabras HAY EN EL ARRAY?
            //1) Buscar posicion libre
            int filaAl = 0;
            int ColuAl = 0;
            // 1ª CASILLA INICIAL LIBRE
            do {
                filaAl = ale.nextInt(10);
                ColuAl = ale.nextInt(10);
            } while (sopaLetrasCopia[filaAl][ColuAl] != '0');
            //
            // 2) No superar limites
            // LIMITE --> DERECHA, columna
            if (ColuAl + (palabras[i].length() - 1) > 10) {  // 5 + 5
                i--;
            } else {
                boolean isLibre = true;
                int max = ColuAl + (palabras[i].length() - 1);
                for (int z = ColuAl; z <= max; z++) {
                    if (sopaLetrasCopia[filaAl][z] != '0') {
                        isLibre = false;
                        break;

                    }
                }
                if (isLibre) {  // PUEDO EMPEZAR A ESCRIBIR !!
                    int contador = 0;
                    for (int z = ColuAl; z <= max; z++) {
                        sopaLetras[filaAl][z] = palabras[i].charAt(contador); //helada
                        sopaLetrasCopia [filaAl][z] = palabras[i].charAt(contador);
                        contador++;

                        }
                    }
                }
            }
        imprimirMatriz();
        System.out.println();
        ImprimirMatrizCopia();
        }
    }
