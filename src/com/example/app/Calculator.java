package com.example.app;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public boolean isPositive(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void unusedMethod() {
        int x = 42;
    }
}

