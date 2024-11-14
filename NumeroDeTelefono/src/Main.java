import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creamos un scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Vamos a leer cada número de teléfono en formato romano, uno por uno
        while (sc.hasNext()) {
            String telefono = sc.nextLine();  // Leemos el número de teléfono

            // Calculamos y mostramos las formas posibles de interpretar el número
            int resultado = contarFormas(telefono);
            System.out.println(resultado);
        }

        sc.close();  // Cerramos el scanner
    }

    // Función que cuenta cuántas formas podemos interpretar el número
    public static int contarFormas(String telefono) {
        // Variable para guardar el número de formas posibles
        int formas = 0;

        // Vamos a revisar cada subcadena de longitud 1, 2 y 3
        // (porque los números romanos tienen entre 1 y 3 caracteres)
        for (int i = 0; i < telefono.length(); i++) {
            // Revisamos subcadenas de longitud 1
            if (esRomanoValido(telefono.substring(i, i + 1))) {
                formas++;  // Si es válido, contamos una forma
            }

            // Revisamos subcadenas de longitud 2 (si no nos salimos del tamaño del string)
            if (i + 1 < telefono.length() && esRomanoValido(telefono.substring(i, i + 2))) {
                formas++;
            }

            // Revisamos subcadenas de longitud 3 (si no nos salimos del tamaño del string)
            if (i + 2 < telefono.length() && esRomanoValido(telefono.substring(i, i + 3))) {
                formas++;
            }
        }

        return formas;  // Devolvemos el número de formas válidas encontradas
    }

    // Función que comprueba si una subcadena es un número romano válido
    public static boolean esRomanoValido(String subcadena) {
        // Comprobamos si la subcadena es uno de los números romanos válidos
        if (subcadena.equals("I") || subcadena.equals("II") || subcadena.equals("III") ||
                subcadena.equals("IV") || subcadena.equals("V") || subcadena.equals("VI") ||
                subcadena.equals("VII") || subcadena.equals("VIII") || subcadena.equals("IX") ||
                subcadena.equals("X")) {
            return true;  // Si es válido, devolvemos true
        }
        return false;  // Si no es válido, devolvemos false
    }
}
