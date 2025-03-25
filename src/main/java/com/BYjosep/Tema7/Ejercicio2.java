package com.BYjosep.Tema7;


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
     introducirNumero();

}

    public static void introducirNumero() {
        double[] numeros = new double[10];
        int errors = 0;
        double maximoValor = Double.MIN_VALUE;
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
        scanner.close();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximoValor) {
                maximoValor = numeros[i];
            }
        }
        System.out.printf("Han habido %d Errores\n",errors);
        System.out.printf("El valor mas alto es: %.2f\n",maximoValor);
    }


}
