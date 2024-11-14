import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Leer el número de habitantes
            int n = sc.nextInt();
            if (n == 0) break; // Termina cuando n es 0

            // Leer las edades reales
            int[] edadesReales = new int[n];
            for (int i = 0; i < n; i++) {
                edadesReales[i] = sc.nextInt();
            }

            // Variable para almacenar el desorden total
            long desordenTotal = 0;

            // Calcular el desorden temporal
            for (int i = 0; i < n; i++) {
                // Para cada persona, contar cuántos tienen menos días pero están antes en el orden
                for (int j = 0; j < i; j++) {
                    if (edadesReales[j] < edadesReales[i]) {
                        desordenTotal++;
                    }
                }
            }

            // Imprimir el resultado del desorden temporal total
            System.out.println(desordenTotal);
        }

        sc.close();
    }
}
