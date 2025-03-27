package com.BYjosep.Tema7.lib.Int;

import java.util.Scanner;

public class LibInInts {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * cerrar {@link Scanner Scanner}
     */
    public static void cerrarScaner() {
        scanner.close();
    }


    /**
     * Ingresar text.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link Character char}
     */
    public static int ingresarUnNumero(String texto) {
        System.out.println(texto);

        return Integer.parseInt(scanner.nextLine());
    }


    /**
     * Ingresar un número con un valor minimo.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link Character char}
     */
    public static int ingresarUnNumero(String texto, int min) {
        int numero;
        do {
            System.out.println(texto);
            numero = Integer.parseInt(scanner.nextLine());

        } while (numero < min);

        return numero;
    }


    /**
     * Ingresar número con valor minimo y maximo.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve el número de la opcion seleccionada
     */
    public static int ingresarUnNumero(String texto, int min, int max) {
        String error = "Numero no valido. Solo puede ingresar numeros entre " + min + " y " + max + ".";
        return ingresarUnNumero(texto, min, max, error);
    }


    /**
     * Ingresar número con valor minimo y maximo.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve el número de la opcion seleccionada
     */
    public static int ingresarUnNumero(String texto, int min, int max, String error) {
        int numero = Integer.MIN_VALUE;
        boolean valido = false;
        do {

            try {
                System.out.println(texto);
                numero = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException nfe) {
                System.err.println("No se ha ingresado un numero");
            }

            if (numero <= min || numero >= max) {
                System.out.println(error);
            } else {
                valido = true;
            }

        } while (!valido);

        return numero;
    }


}
