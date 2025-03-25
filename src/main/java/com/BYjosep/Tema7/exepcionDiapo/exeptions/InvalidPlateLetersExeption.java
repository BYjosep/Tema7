package com.BYjosep.Tema7.exepcionDiapo.exeptions;

import java.util.InvalidPropertiesFormatException;

 public class InvalidPlateLetersExeption extends InvalidPropertiesFormatException {
     public InvalidPlateLetersExeption(String message) {
        super(message);
    }
}
