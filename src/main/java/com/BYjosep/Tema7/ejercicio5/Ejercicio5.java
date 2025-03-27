package com.BYjosep.Tema7.ejercicio5;

import com.BYjosep.Tema7.lib.LibDate;
import com.BYjosep.Tema7.lib.LibFloats;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio5 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Alumno alumno1 = crearAlumno();
        System.out.println(alumno1);

        Alumno alumno2 = crearAlumno();
        System.out.println(alumno2);
        System.out.println("El alumno más mayor es: " + alumno1.queAlumnoEsMayor(alumno2));

    }

    private static Alumno crearAlumno() {
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        float altura = LibFloats.ingresarUnNumero("Ingresa la altura: ", 0f, 3f);
        LocalDate fechaNacimiento = LibDate.IngresarFecha();
        return new Alumno(nombre, altura, fechaNacimiento);
    }
}
