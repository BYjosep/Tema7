package com.BYjosep.Tema7.exeptions;

import java.util.InvalidPropertiesFormatException;

public class InvlidPlateExeption extends InvalidPropertiesFormatException {
    public InvlidPlateExeption(String message) {
        super(message);
    }
}
