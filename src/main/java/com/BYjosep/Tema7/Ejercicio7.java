package com.BYjosep.Tema7;

public class Ejercicio7 {
    public static void main(String[] args) {
        String[] nombres = {"apiojdfs", null, "djlksz", "sdfhulo", "ljñkds", null};
        mostrarCadenasArray(nombres);
    }

    public static String mostrarCadenasArray(String[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            try {
                sb.append(array[i].charAt(0));
                if (i != array.length - 1) {
                    sb.append(", ");
                }
            } catch (NullPointerException npe) {
                System.out.printf("La posicion %d no puede ser añadida por ser nula\n", i);
                if (i == array.length - 1) {
                    sb.delete(sb.length() - 2, sb.length());
                } else sb.delete(sb.length() - 1, sb.length()).append(' ');
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
/*
Escribe un método, de nombre mostrarCadenasArray, que reciba como parámetro un array de
    cadenas de caracteres. El método mostrará por pantalla el primer carácter de cada una de las
    cadenas contenidas en la array.

 a) Se debe evitar que se produzca una excepción NullPointerException si alguna de las posiciones
del array contiene una referencia no inicializada (null).
 */