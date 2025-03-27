package com.BYjosep.Tema7;

import com.BYjosep.Tema7.lib.ANSI;

public class Ejercicio7 {
    public static void main(String[] args) {
        String[] nombres = {"apiojdfs", null, "djlksz", null, "sdfhulo", null, "ljñkds", null};
        System.out.println(mostrarCadenasArray(nombres));
    }

    public static String mostrarCadenasArray(String[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {

            if (array[i] == null) {
                ANSI.printf("La posicion %d no puede ser añadida por ser nula\n",
                        false, ANSI.Color.RED, ANSI.Color.NONE, i);

                if (i == array.length - 1) {
                    sb.delete(sb.length() - 2, sb.length());
                } else sb.delete(sb.length() - 1, sb.length()).append(' ');
            } else {
                sb.append(array[i].charAt(0));
                if (i != array.length - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
