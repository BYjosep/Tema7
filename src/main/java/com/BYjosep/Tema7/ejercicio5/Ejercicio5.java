package com.BYjosep.Tema7.ejercicio5;

import com.BYjosep.Tema7.lib.LibDate;

import java.time.LocalDate;

public class Ejercicio5 {
    public static void main(String[] args) {
        String nombre ="test";
        float altura = 1.5f;
        LocalDate fechaNacimiento = LibDate.IngresarFecha();
        Alumno alumno = new Alumno(nombre,altura,fechaNacimiento);
        System.out.println(alumno.getEdad());
    }
}
