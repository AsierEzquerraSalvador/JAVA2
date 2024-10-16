package org.example;

import java.util.Random;
// array de 10 dimensiones con n aleatorios
public class Main {
    static random aleatorio= new random();

    public static  int generarAleatorio (int semilla){
        int numAle= aleatorio.nextInt(semilla);
        return numAle;

    }
    public static void main(String [] args){
        int [] arrayNumAleatorio= new int[10]; //dimension
        for (int i = 0; i < arrayNumAleatorio.length; i++){
            arrayNumAleatorio[i]=generarAleatorio(100);
        }
    }
}