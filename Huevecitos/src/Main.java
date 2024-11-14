import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Scanner lector = new Scanner(System.in);
    private static int MAX_HUEVOS = 10000;
    private static int MAX_CANTIDAD = 1000;


    public static void main(String[] args) {
        System.out.println("CUANTOS CASOS DE PRUEBA QUERES");
        int CasosDePrueba = lector.nextInt();

        for (int i = 0; i < CasosDePrueba; i++) {
            System.out.println("DIME CUANTOS HUEVOS QUERES COCER");
            int huevos = lector.nextInt();
            System.out.println("DIME LA CAPACIDAD DE HUEVOS");
            int CapacidadDeOvos = lector.nextInt();

            if (huevos <= 0 && CapacidadDeOvos <= 0) {
                System.out.println("no puede ser menor de cero");
            }
            if ((1 < huevos && huevos < MAX_HUEVOS) && (1 < CapacidadDeOvos && CapacidadDeOvos < MAX_CANTIDAD)) {


                int ciclos = (huevos + CapacidadDeOvos - 1) / CapacidadDeOvos;
                int minutosCocion = ciclos * 10;

                System.out.println("minimo de minutos " + (minutosCocion));


            }
        }
    }
}