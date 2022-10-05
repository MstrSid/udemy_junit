package org.example;

public class Calculator {
    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else return 0;

    }

    public double mul(double a, double b) {
        return a * b;
    }
}
