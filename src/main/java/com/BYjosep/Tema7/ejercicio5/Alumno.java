package com.BYjosep.Tema7.ejercicio5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

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

    public float getAltura() {
        return altura;
    }

    public String getNombre() {
        return nombre;
    }

    public Alumno whoIsOlder(Alumno alumno) {
        if (fechaNacimiento.isBefore(alumno.fechaNacimiento)) {
            return this;
        } else {
            return alumno;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Float.compare(altura, alumno.altura) == 0 && Objects.equals(nombre, alumno.nombre) && Objects.equals(fechaNacimiento, alumno.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, altura, fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", edad=" + getEdad() +
                '}';
    }
}
