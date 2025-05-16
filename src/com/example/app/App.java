package com.example.app;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;
        System.out.println("Sum: " + calculator.sum(a, b));
        System.out.println("Division: " + calculator.divide(a, b)); // División por cero

        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration " + i);
        }

        for (int i = 0; i < 3; i++) { // Código duplicado
            System.out.println("Iteration " + i);
        }

        UserService userService = new UserService();
        userService.processUser(null); // Posible NPE

        Scanner scanner = new Scanner(System.in); // Recurso no cerrado
        System.out.println("Enter a number:");
        int input = scanner.nextInt();
    }
}
