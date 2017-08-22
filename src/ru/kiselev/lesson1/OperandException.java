package ru.kiselev.lesson1;

import java.io.IOException;

/**
 * Created by kiselev_ia on 22.08.2017.
 */
public class OperandException extends IOException {
    public OperandException(String message) {
        super(message);
    }
}
