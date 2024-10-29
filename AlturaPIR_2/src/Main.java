import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int bloquesUser = leer.nextInt();


        int nivel = 1;
        int bloquesAcumulados = 1;
        int multBloques = 1;
        //9
        while (bloquesUser > bloquesAcumulados) {
            nivel = nivel + 1;
            multBloques= multBloques + 2;
            bloquesAcumulados = bloquesAcumulados + (multBloques*multBloques);

        }
        System.out.println(nivel);
    }
}