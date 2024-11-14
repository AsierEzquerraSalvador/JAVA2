import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static void ConjugacionAR(String verbo, String Tiempos) {
        String palabra = verbo.substring(0, verbo.length() - 2);
        switch (Tiempos) {
            case "A":
                System.out.println("YO " + palabra + "o");
                System.out.println("TU " + palabra + "as");
                System.out.println("EL " + palabra + "a");
                System.out.println("NOSOTROS " + palabra + "amos");
                System.out.println("VOSOTROS " + palabra + "ais");
                System.out.println("ELLOS " + palabra + "aran");
                break;
            case "P":
                System.out.println("YO " + palabra + "é");
                System.out.println("TÚ " + palabra + "aste");
                System.out.println("ÉL/ELLA/USTED " + palabra + "ó");
                System.out.println("NOSOTROS " + palabra + "amos");
                System.out.println("VOSOTROS " + palabra + "asteis");
                System.out.println("ELLOS/ELLAS/USTEDES " + palabra + "aron");
                break;
            case "F":
                System.out.println("YO " + palabra + "aré");    // Yo hablaré
                System.out.println("TÚ " + palabra + "arás");   // Tú hablarás
                System.out.println("ÉL/ELLA/USTED " + palabra + "ará");  // Él/Ella/Usted hablará
                System.out.println("NOSOTROS " + palabra + "aremos");  // Nosotros hablaremos
                System.out.println("VOSOTROS " + palabra + "aréis");  // Vosotros hablaréis
                System.out.println("ELLOS/ELLAS/USTEDES " + palabra + "arán");  // Ellos/Ellas/Ustedes hablarán
                break;
            default:
                System.out.println("TU NO PONER TIEMPO VALIDO");
                break;


        }
    }

    private static void ConjugacionER(String verbo, String Tiempos) {
        String palabra = verbo.substring(0, verbo.length() - 2);
        switch (Tiempos) {
            case "A":
                System.out.println("YO" + palabra + "o");
                System.out.println("TU" + palabra + "es");
                System.out.println("EL" + palabra + "e");
                System.out.println("NOSOTROS" + palabra + "emos");
                System.out.println("VOSOTROS" + palabra + "eis");
                System.out.println("ELLOS" + palabra + "men");
                break;
            case "P":
                System.out.println("YO " + palabra + "i");
                System.out.println("TÚ " + palabra + "iste");
                System.out.println("ÉL/ELLA/USTED " + palabra + "ió");
                System.out.println("NOSOTROS " + palabra + "imos");
                System.out.println("VOSOTROS " + palabra + "isteis");
                System.out.println("ELLOS/ELLAS/USTEDES " + palabra + "ieron");
                break;
            case "F":
                System.out.println("YO " + palabra + "eré");    // Yo hablaré
                System.out.println("TÚ " + palabra + "erás");   // Tú hablarás
                System.out.println("ÉL/ELLA/USTED " + palabra + "era");  // Él/Ella/Usted hablará
                System.out.println("NOSOTROS " + palabra + "eremos");  // Nosotros hablaremos
                System.out.println("VOSOTROS " + palabra + "eréis");  // Vosotros hablaréis
                System.out.println("ELLOS/ELLAS/USTEDES " + palabra + "erán");  // Ellos/Ellas/Ustedes hablarán
                break;
            default:
                System.out.println("TU NO PONER TIEMPO VALIDO,MONO TONTO");
                break;

        }
    }

    private static void ConjugacionIR(String verbo, String Tiempos) {
        String palabra = verbo.substring(0, verbo.length() - 2);
        switch (Tiempos) {
            case "A":
                System.out.println("YO" + palabra + "o");
                System.out.println("TU" + palabra + "es");
                System.out.println("EL" + palabra + "e");
                System.out.println("NOSOTROS" + palabra + "imos");
                System.out.println("VOSOTROS" + palabra + "is");
                System.out.println("ELLOS" + palabra + "en");
                break;
            case "P":
                System.out.println("YO " + palabra + "í");
                System.out.println("TÚ " + palabra + "iste");
                System.out.println("ÉL/ELLA/USTED " + palabra + "ió");
                System.out.println("NOSOTROS " + palabra + "imos");
                System.out.println("VOSOTROS " + palabra + "isteis");
                System.out.println("ELLOS/ELLAS/USTEDES " + palabra + "ieron");
                break;
            case "F":
                System.out.println("YO " + palabra + "ieré");    // Yo hablaré
                System.out.println("TÚ " + palabra + "irás");   // Tú hablarás
                System.out.println("ÉL/ELLA/USTED " + palabra + "ira");  // Él/Ella/Usted hablará
                System.out.println("NOSOTROS " + palabra + "iremos");  // Nosotros hablaremos
                System.out.println("VOSOTROS " + palabra + "iréis");  // Vosotros hablaréis
                System.out.println("ELLOS/ELLAS/USTEDES " + palabra + "irán");  // Ellos/Ellas/Ustedes hablarán
                break;
            default:
                System.out.println("TU NO PONER TIEMPO VALIDO,MONO TONTO");
                break;
            }
        }
        private static final String[] Tiempos = {"A", "P", "F"};
        public static void main (String[]args){
            Arrays.toString(Tiempos);

            System.out.println("CUANTOS CASOS DE PRUEBA QUERES");
            int CasosDePrueba = Integer.parseInt(scanner.nextLine());


            for (int i = 0; i < CasosDePrueba; i++) {
                System.out.println("DAME UN VERBO PORFIS");
                String Verbo = scanner.nextLine();
                System.out.println("DAME UN TIEMPO VERBAL");
                String Tiempos = scanner.nextLine();

                if (Verbo.endsWith("AR") || Verbo.endsWith("ar")) {
                    ConjugacionAR(Verbo, Tiempos);
                } else if (Verbo.endsWith("ER") || Verbo.endsWith("er")) {
                    ConjugacionER(Verbo, Tiempos);
                } else if (Verbo.endsWith("IR") || Verbo.endsWith("ir")) {
                    ConjugacionIR(Verbo, Tiempos);

                }
            }

        }

    }
