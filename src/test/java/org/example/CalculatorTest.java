package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void plus() {
        double expected = 15;
        double result = new Calculator().plus(10, 5);
        assertEquals(expected, result, 0.001);

        double expected2 = 150;
        double result2 = new Calculator().plus(100, 50);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    void minus() {
        double expected = 15;
        double result = new Calculator().minus(25, 10);
        assertEquals(expected, result, 0.001);

        double expected2 = 150;
        double result2 = new Calculator().minus(200, 50);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    void div() {
        double expected = 20;
        double result = new Calculator().div(40, 2);
        assertEquals(expected, result, 0.001);

        double expected2 = 7;
        double result2 = new Calculator().div(14, 2);
        assertEquals(expected2, result2, 0.001);

        double expected3 = 0;
        double result3 = new Calculator().div(14, 0);
        assertEquals(expected3, result3, 0.001);
    }

    @Test
    void mul() {
        double expected = 30;
        double result = new Calculator().mul(2, 15);
        assertEquals(expected, result, 0.001);

        double expected2 = 150;
        double result2 = new Calculator().mul(75, 2);
        assertEquals(expected2, result2, 0.001);
    }
}