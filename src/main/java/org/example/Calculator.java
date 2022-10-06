package org.example;

public class Calculator {
    public double plus(double a, double b) {
        return a + b;
    }

    public double plus(String a, String b) {
        return Double.parseDouble(a) + Double.parseDouble(b);
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double mul(double a, double b) {
        return a * b;
    }
}
