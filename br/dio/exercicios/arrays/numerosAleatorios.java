package br.dio.exercicios.arrays;

import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i ++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.print("Sucessores dos numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero+1) + " ");
        }

        System.out.print("Antecessores dos numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero-1) + " ");
        }
    }
}
