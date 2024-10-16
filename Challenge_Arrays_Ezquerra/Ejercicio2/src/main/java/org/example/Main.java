package org.example;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Random;
// array de 10 dimensiones con n aleatorios
public class Main {
    static Random aleatorio= new Random();

    public static  int generarAleatorio (int semilla){
        int numAle= aleatorio.nextInt(semilla);
        return numAle;

    }
    public static void main(String [] args){
        int [][] arrayNumAleatorio= new int[10][10]; //dimension
        for (int i = 0; i < arrayNumAleatorio.length; i++){
            for (int j = 0; j < arrayNumAleatorio.length; j++){
                arrayNumAleatorio[i][j]=generarAleatorio(100);
            }
        }
        for (int i = 0; i < arrayNumAleatorio.length; i++){
            for (int j = 0; j < arrayNumAleatorio.length; j++){
                System.out.print(arrayNumAleatorio[i][j] + " ");
            }
            System.out.println("");
    }
}
}



//Matriz 10 * 10 nº aleatorios