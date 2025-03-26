package com.BYjosep.Tema7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double[] numeros = ponerNumerosEnArray("Ingrese numeros. Para salir pulse otro caracter.");
        try{
            System.out.println(verNumeroMasAltoDeUnArrayDeDoubles(numeros));

        }catch(ArrayIndexOutOfBoundsException aioobe){
            System.err.println(aioobe.getMessage());
        }
    }

    public static double verNumeroMasAltoDeUnArrayDeDoubles(double[] numero) {
        double valorMaximo = Double.MIN_VALUE;
        if (numero.length == 0) {
            throw new ArrayIndexOutOfBoundsException("No se han introducido numeros");
        }
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > valorMaximo) {
                valorMaximo = numero[i];
            }
        }
        return valorMaximo;
    }


    public static double[] ponerNumerosEnArray(String mensaje) {
        ArrayList<Double> numeros = new ArrayList<>();
        System.out.println(mensaje);
        boolean validation = true;
        do {
            try{
                numeros.add(comprobarSiEsNumero());

            }catch (NumberFormatException nfe){
                System.out.println(nfe.getMessage());
                validation = false;
            }

        }while (validation);

        double[] valores = new double[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            valores[i] = numeros.get(i);
        }
        return valores;
    }


    private static double comprobarSiEsNumero() {
        double numero ;
        try {
            System.out.print("Indica el numero:");
            numero = Double.parseDouble(scanner.nextLine());

        }catch (NumberFormatException nfe){

            throw new NumberFormatException("Saliendo...");
        }

        return numero;
    }
}