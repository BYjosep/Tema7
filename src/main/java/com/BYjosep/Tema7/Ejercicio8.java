package com.BYjosep.Tema7;

import com.BYjosep.Tema7.lib.ANSI;
import com.BYjosep.Tema7.lib.LibRandoms;

public class Ejercicio8 {

    public static void main(String[] args) {
        exepcionA(0);
        int[] numeros = null;
        exepcionB(numeros);
        numeros = new int[]{10, 3, 4, 34, 6, 21, 76, 3, 6, 65, 9, 564, 546, 76, 654, 34, 623};
        exepcionC(numeros);
    }

    /**
     * Introduces un valor para que divida entre un random
     * @param divisor valor a actuar como divisor
     */
    private static void exepcionA(int divisor) {
        try {
            int numero = LibRandoms.ran(Integer.MIN_VALUE + 10000000, Integer.MAX_VALUE - 10000000);
            System.out.println(numero / divisor);
        } catch (ArithmeticException ae) {
            ANSI.printf("No se puede dividir entre %d\n",
                    false, ANSI.Color.RED, ANSI.Color.NONE, divisor);
        }
    }


    /**
     *
     * @param numeros array de numeros como test se le esta introduciendo un nullPointer
     */
    private static void exepcionB(int[] numeros) {

        try {
            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }
        } catch (NullPointerException npe) {
            ANSI.printf("El array ingresado esta vacio.\n", false, ANSI.Color.RED, ANSI.Color.NONE);
        }

    }


    /**
     *
     * @param numeros se introduce un array
     *                para este caso se hace un while tru para provocar
     *                ArrayIndexOutOfBoundsException
     */
    private static void exepcionC(int[] numeros) {
        int contador = 0;
        while (true) {

            try {
                System.out.println(numeros[contador]);
                contador++;
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                ANSI.printf("No se pueden mostrar mas numeros, se ha sobrepasado la longitud del array.\n", false, ANSI.Color.RED, ANSI.Color.NONE);
                break;
            }
        }
    }

}

