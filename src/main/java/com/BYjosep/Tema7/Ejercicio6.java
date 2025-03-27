package com.BYjosep.Tema7;

import com.BYjosep.Tema7.lib.ANSI;

import java.util.Arrays;

public class Ejercicio6 {

    public static void main(String[] args) {
        int dividendo = 2;
        int[] divisor = {-1, -2, 0, 1, 2};
        System.out.println(Arrays.toString(dividirEntreArrayC(dividendo, divisor)));
    }


    public static int[] dividirEntreArrayB(int dividendo, int[] divisor) {
        int[] resultado = new int[divisor.length];

        for (int i = 0; i < divisor.length; i++) {

             try {
                resultado[i]= dividendo/ divisor[i];

             }catch (ArithmeticException ae){
                  System.out.println("No se puede dividir entre 0");
                  resultado[i] = 0;
             }

        }
        return resultado;
    }


    public static int[] dividirEntreArrayC(int dividendo, int[] divisor) {
        int[] resultado = new int[divisor.length];

        for (int i = 0; i < divisor.length; i++) {

            // try {
            if (divisor[i] != 0) {
                resultado[i] = dividendo / (divisor[i]);
            } else {
                ANSI.printf("El divisor no puede ser zero\n", false, ANSI.Color.RED, ANSI.Color.BLACK);
                resultado[i] = 0;
            }

            // }catch (ArithmeticException ae){
            //      System.out.println("No se puede dividir entre 0");
            //  }

        }
        return resultado;
    }
}
