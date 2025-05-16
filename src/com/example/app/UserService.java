package com.example.app;
public class UserService {

    public void processUser(String name) {
        System.out.println("User: " + name.toUpperCase());
    }

    public void doNothing() {
        // Método vacío
    }

    public void longMethod() {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        for (int i = 0; i < 10; i++) {
            total += i;
        }
    }
}

