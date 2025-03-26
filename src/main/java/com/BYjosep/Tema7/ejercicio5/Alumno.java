package com.BYjosep.Tema7.ejercicio5;

import java.time.LocalDate;
import java.time.Period;

public class Alumno {
    private final String nombre;
    private final float altura;
    private final LocalDate fechaNacimiento;

    Alumno(String nombre, float altura, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.altura = altura;
        this.fechaNacimiento = fechaNacimiento;
    }

    int getEdad(){
        Period period = Period.between(fechaNacimiento, LocalDate.now());
        return period.getYears();
    }
}
