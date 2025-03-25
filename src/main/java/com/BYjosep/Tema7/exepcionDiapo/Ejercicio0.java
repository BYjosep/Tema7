package com.BYjosep.Tema7.exepcionDiapo;

import com.BYjosep.Tema7.exepcionDiapo.exeptions.InvalidPlateLengthExeption;
import com.BYjosep.Tema7.exepcionDiapo.exeptions.InvalidPlateLetersExeption;
import com.BYjosep.Tema7.exepcionDiapo.exeptions.InvalidPlateNumberExeption;
import com.BYjosep.Tema7.exepcionDiapo.exeptions.InvlidPlateExeption;

import java.util.Scanner;

public class Ejercicio0 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String matricula;
        matricula = scanner.nextLine();

        try {
            validarMatricula(matricula);

        }catch (InvlidPlateExeption ipe){
            System.out.println(ipe);
        } catch (InvalidPlateNumberExeption ipne) {
            throw new RuntimeException(ipne);
        } catch (InvalidPlateLetersExeption iple) {
            throw new RuntimeException(iple);
        } catch (InvalidPlateLengthExeption e) {
            throw new RuntimeException(e);
        }
    }

    /*
    public static void parseMatricula(String matricula) throws InvlidPlateExeption {
        if (!validarMatricula(matricula)) {
            throw new InvlidPlateExeption("La matricula no es válida");
        }
    }*/


    public static boolean validarMatricula(String matricula) throws InvlidPlateExeption, InvalidPlateNumberExeption, InvalidPlateLetersExeption, InvalidPlateLengthExeption {
        int i;
        if (matricula.length() != 8) {
            throw new InvalidPlateLengthExeption("La matricula debe de tener 8 caracteres");
        }
        for (i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                throw new InvalidPlateNumberExeption("La matricula debe de tener 4 numeros");
            }
        }
        if (!Character.isWhitespace(matricula.charAt(i++))) {
            throw new InvlidPlateExeption("La matrícula debe tener un espacio entre los numeros y las letras");
        }
        for (int j = i; j < matricula.length(); j++) {
            if (!Character.isLetter(matricula.charAt(j))) {
                throw new InvalidPlateLetersExeption("La matrícula debe de tener 3 letras");
            }
        }
        return true;
    }
}