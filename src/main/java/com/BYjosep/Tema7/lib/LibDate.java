package com.BYjosep.Tema7.lib;

import java.time.LocalDate;
import java.util.Scanner;

public class LibDate {
    private static Scanner scanner = new Scanner(System.in);
    public static LocalDate IngresarFecha(){
        LocalDate fecha;
        int dia, mes, ano;
        do {
            try {

                mes= LibInInts.ingresarUnNumero("Ingresa el mes:"
                        ,1,12);

                switch (mes){

                    case 1,3,5,7,8,10,12->dia=LibInInts.ingresarUnNumero("Ingresa el dia:",1,31);
                    case 2->dia=LibInInts.ingresarUnNumero("Ingresa el dia:",1,28);
                    case 4,6,9,11->dia=LibInInts.ingresarUnNumero("Ingresa el dia:",1,30);
                    default -> System.err.println("Aqui no debe de llegar");
                }

                System.out.println("Ingresa el dia:");
                dia= Integer.parseInt(scanner.nextLine());

                System.out.println("Ingresa el año:");
                ano= Integer.parseInt(scanner.nextLine());


                break;
            }catch (NumberFormatException nfe){
                System.err.println("solo numeros:");
            }

        }while (true);
        fecha = LocalDate.of(ano,mes,dia);
        return fecha;
    }
}
