package com.BYjosep.Tema7;

import java.util.Scanner;

public class Ejercicio2 {
    private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
    double[] numero = introducirNumero();

}

    public static double[] introducirNumero() {
        double[] numeros = new double[10];
        double numero;
        for (int i = 0; i < numeros.length; i++) {
            try {
                numero = Double.parseDouble(scanner.nextLine());
                numeros[i] = numero;
            }catch (NumberFormatException nfe){
                System.err.println("Solo se permiten numeros");
            }
        }

        return numeros;
    }

}
