package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random aleatorio = new Random();

    public static int generarAleatorio(int semilla) {
        return aleatorio.nextInt(semilla);
    }

    public static void main(String[] args) {
        int[] arrayNumAleatorio = new int[6]; // dimensión
        for (int i = 0; i < arrayNumAleatorio.length; i++) {
            arrayNumAleatorio[i] = generarAleatorio(100);
        }

        // Mostrar el array original
        for (int num : arrayNumAleatorio) {
            System.out.print(num + " ");
        }
        System.out.println("");

        Scanner leer = new Scanner(System.in);

        // Preguntar al usuario 3 veces
        for (int i = 0; i < 3; i++) {
            System.out.println("Dime un número:");
            int numeroIngresado = leer.nextInt();

            // Verificar si el número está en el array y reemplazarlo por 'X'
            for (int j = 0; j < arrayNumAleatorio.length; j++) {
                if (arrayNumAleatorio[j] == numeroIngresado) {
                    arrayNumAleatorio[j] = -1; // Usamos -1 como marcador
                }
            }

            // Mostrar el array actualizado
            for (int num : arrayNumAleatorio) {
                if (num == -1) {
                    System.out.print("X ");
                } else {
                    System.out.print(num + " ");
                }
            }
            System.out.println("");
        }

        leer.close();
    }
}
