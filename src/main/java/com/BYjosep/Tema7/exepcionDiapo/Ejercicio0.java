package com.BYjosep.Tema7.exepcionDiapo;

import java.util.Scanner;

public class Ejercicio0 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String matricula = "r";
        if (validarMatricula(matricula)) {
            System.out.println("La matricula es correcta");
        } else throw new Exception("Matricula no valida");

    }


    public static boolean validarMatricula(String matricula) {
        int i;
        if (matricula.length() != 8) {
            return false;
        }
        for (i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }
        if (!Character.isWhitespace(matricula.charAt(i++))) {
            return false;
        }
        for (int j = i; j < matricula.length(); j++) {
            if (!Character.isLetter(matricula.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}