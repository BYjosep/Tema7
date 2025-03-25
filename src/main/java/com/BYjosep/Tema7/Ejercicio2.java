package com.BYjosep.Tema7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
    double[] numero = introducirNumero();
    scanner.close();
    System.out.println(Arrays.toString(numero));
}

    public static double[] introducirNumero() {
        double[] numeros = new double[10];
        int errors = 0;
        double numero;
        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println("Introduce el numero: ");
                numero = Double.parseDouble(scanner.nextLine());
                numeros[i] = numero;
            }catch (NumberFormatException nfe){
                System.err.println("Solo se permiten numeros");
                --i;
                errors++;
            }
        }
        System.out.println(errors);
        return numeros;
    }


}
