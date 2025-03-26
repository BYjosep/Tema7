package com.BYjosep.Tema7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[5];
        String mensaje = "Introduzca numeros enteros";
        rellenarArray(array, mensaje);
        System.out.println(Arrays.toString(array));
        int[] array2 = null;

        try {
            rellenarArray(array2, mensaje);

        } catch (NullPointerException npe) {
            System.err.println(npe.getMessage());
        }
    }

    private static void rellenarArray(int[] array, String mensaje) throws NullPointerException {
        int numero;
        int contador = 0;
        if (array == null) {
            throw new NullPointerException("El array esta vacio");
        }
        System.out.println(mensaje);
        do {
            try {
                System.out.printf("Introduzca el numero de la posicion %d: ", contador);
                numero = Integer.parseInt(scanner.nextLine());
                array[contador] = numero;
                contador++;
            } catch (NumberFormatException nfe) {
                System.out.println("\u001B[31mSolo se permiten numeros\u001B[0m");


            } catch (ArrayIndexOutOfBoundsException aiob) {
                System.out.println("\u001B[31mNo se pueden ingresar más numeros\u001B[0m");
                break;
            }
        } while (true);

    }
}
