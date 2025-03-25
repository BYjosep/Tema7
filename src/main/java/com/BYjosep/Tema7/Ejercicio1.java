package com.BYjosep.Tema7;



import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public static double[] PonerNumerosEnArray(String mensaje) {
        ArrayList<Double> numeros = new ArrayList<>();
        System.out.println(mensaje);
        double numero;
        int contador = 1;
         do {
             try {
                 System.out.printf("Indica el numero %d:\n",contador++);
                 numero = Double.parseDouble(scanner.nextLine());
                 if (numero>=0){
                     numeros.add(numero);
                 }
             }catch (NumberFormatException nfe) {
                 System.err.println("Solo numeros por favor");
                numero= 1;
             }
         }while (numero >= 0);

    //return (Double[]) (numeros.toArray());

    double[] valores = new double[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            valores[i] = numeros.get(i);
        }
    return valores;
    }



}
