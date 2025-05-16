package com.example.app;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    public int sum(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            LOGGER.log(Level.WARNING, "Error: División por cero no permitida.");
            return 0;
        }
        return a / b;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public void unusedMethod() {
        int x = 42;
        LOGGER.log(Level.INFO, "Valor de x: {0}", x);
    }
}
