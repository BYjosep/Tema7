package com.BYjosep.Tema7;

import java.util.Arrays;

public class Ejercicio6 {

    public static void main(String[] args) {
        int dividendo = 2;
        int[] divisor = {-1, -2, 0, 1, 2};
        System.out.println(Arrays.toString(dividirEntreArray(dividendo, divisor)));
    }

    public static int[] dividirEntreArray(int dividendo, int[] divisor) {
        int[] resultado = new int[divisor.length];

        for (int i = 0; i < divisor.length; i++) {

            // try {
            if (divisor[i] != 0) {
                resultado[i] = dividendo / (divisor[i]);
            } else {
                System.out.println("El divisor no puede ser zero");
                resultado[i] = 0;
            }

            // }catch (ArithmeticException ae){
            //      System.out.println("No se puede dividir entre 0");
            //  }

        }
        return resultado;
    }
}
