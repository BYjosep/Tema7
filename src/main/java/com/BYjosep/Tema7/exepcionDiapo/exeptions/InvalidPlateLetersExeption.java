package com.BYjosep.Tema7.exepcionDiapo.exeptions;

import java.util.InvalidPropertiesFormatException;

 class InvalidPlateLetersExeption extends InvalidPropertiesFormatException {
     InvalidPlateLetersExeption(String message) {
        super(message);
    }
}
