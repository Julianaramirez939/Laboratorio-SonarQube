package com.example.app;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;

        // Usar Logger con formato para evitar error SonarQube
        LOGGER.log(Level.INFO, "Sum: {0}", calculator.sum(a, b));

        try {
            int divisionResult = calculator.divide(a, b);
            LOGGER.log(Level.INFO, "Division: {0}", divisionResult);
        } catch (ArithmeticException e) {
            LOGGER.log(Level.WARNING, "Error en la división: {0}", e.getMessage());
        }

        for (int i = 0; i < 6; i++) {
            LOGGER.log(Level.INFO, "Iteration {0}", i % 3);
        }

        UserService userService = new UserService();
        try {
            userService.processUser(null);
        } catch (NullPointerException e) {
            LOGGER.log(Level.WARNING, "UserService processUser recibió un valor nulo.");
        }

        try (Scanner scanner = new Scanner(System.in)) {
            LOGGER.log(Level.INFO, "Enter a number:");

        }
    }
}
