package com.BYjosep.Tema7;

import com.BYjosep.Tema7.exeptions.ArrayNoCreadoExeption;
import com.BYjosep.Tema7.exeptions.InvalidDivisionExeption;
import com.BYjosep.Tema7.exeptions.OutOfRangeException;
import com.BYjosep.Tema7.lib.ANSI;
import com.BYjosep.Tema7.lib.LibRandoms;

public class Ejercicio9 {
    public static void main(String[] args) {
        exepcionA(0);
        int[] numeros = null;
        exepcionB(numeros);
        numeros = new int[]{10, 3, 4, 34, 6, 21, 76, 3, 6, 65, 9, 564, 546, 76, 654, 34, 623};
        exepcionC(numeros);
    }

    private static void exepcionA(int divisor) {
        try {
            if (divisor == 0) {
                throw new InvalidDivisionExeption("Esta division tiende al infinito por lo que no se pude hacer\n");
            }
            int numero = LibRandoms.ran(Integer.MIN_VALUE + 10000000, Integer.MAX_VALUE - 10000000);
            System.out.println(numero / divisor);
        } catch (InvalidDivisionExeption ide) {
            ANSI.printf(ide.getMessage(), false, ANSI.Color.RED, ANSI.Color.NONE);
        }
    }

    private static void exepcionB(int[] numeros) {

        try {
            if (numeros == null) {
                throw new ArrayNoCreadoExeption("El array no se ha creado");
            }
            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }
        } catch (ArrayNoCreadoExeption ance) {
            ANSI.printf(ance.getMessage() + "\n", false, ANSI.Color.RED, ANSI.Color.NONE);
        }

    }

    private static void exepcionC(int[] numeros) {
        int contador = 0;
        while (true) {

            try {
                if (contador >= numeros.length) {
                    throw new OutOfRangeException("No se pueden mostrar mas numeros, se ha sobrepasado la longitud del array.\n");
                }
                System.out.println(numeros[contador]);
                contador++;
            } catch (OutOfRangeException oore) {
                ANSI.printf(oore.getMessage(), false, ANSI.Color.RED, ANSI.Color.NONE);
                break;
            }
        }
    }
}
/*
 Modifica el programa anterior y crea 3 clases de excepciones personalizadas, haciendo uso de la
palabra reservada extends, para los 3 tipos de excepciones anteriores. Cuando se produzca una
excepción de los 3 tipos anteriores deberemos lanzar nuestra propia excepción y mostrar un
mensaje personalizado.
 */
