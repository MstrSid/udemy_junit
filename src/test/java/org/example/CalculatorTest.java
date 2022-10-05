package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        int expected = 15;
        int result = new Calculator().sum(10, 5);
        assertEquals(expected, result);

        int expected2 = 150;
        int result2 = new Calculator().sum(100, 50);
        assertEquals(expected2, result2);
    }
}