package com.BYjosep.Tema7.exepcionDiapo.exeptions;

import java.util.InvalidPropertiesFormatException;

public class InvalidPlateNumberExeption extends InvalidPropertiesFormatException {
    public InvalidPlateNumberExeption(String message) {
        super(message);
    }
}
