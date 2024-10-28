import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // DECLARO EL ESCANER
        Scanner leectura = new Scanner(System.in);
        System.out.println("CUANTOS CASOS DE PRUEBA QUIERES ");

        int Numero = leer.nextInt(); // HAGO UN FOR QUE SE REPITA CUANTAS VECES YO LE DIGA EL NÚMERO
        {
            int numero;
            do {
                System.out.print("Ingrese un número entre -10000 y 10000: ");
                numero = leectura.nextInt();
                //SI ESTA FUERA DE RANGO ME LO DICE
                if (numero < -10000 || numero > 10000) {
                    System.out.println("EL NÚMERO DEBE ESTAR ENTRE -10000 Y 10000.");
                }
            } while (numero < -10000 || numero > 10000);

        }
        for (int i = 0; i < Numero; i++) {
            int A = leer.nextInt();
            int B = leer.nextInt();
            int C = leer.nextInt();

            int DistanciaA = Math.abs(B - A); // CALCULO LAS DISTANCIAS
            int DistanciaC = Math.abs(B - C);

            if (DistanciaC < DistanciaA) {
                System.out.println("LA DISTANCIA DE C está más cerca de: " + B);
                System.out.println("DISTANCIA DE C;" + C);
            } else if (DistanciaA < DistanciaC) {
                System.out.println("LA DISTANCIA DE A está más cerca de: " + B);
                System.out.println("DISTANCIA DE A;" + A);
            } else {
                System.out.println("EMPATE");
            }
        }
        // APLICO LOS MÁXIMOS Y MÍNIMOS

    }
}
