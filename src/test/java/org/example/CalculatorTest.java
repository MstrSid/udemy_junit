package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    void when10Plus5ThenResult15() {
        double expected = 15;
        double result = calculator.plus(10, 5);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when10Plus5AsStringThenResult15() {
        double expected = 15;
        double result = calculator.plus("10", "5");
        assertEquals(expected, result, 0.001);
    }

    @Test()
    void whenInputIncorrectValueThenThrowException() {
        assertThrows(NumberFormatException.class, () -> calculator.plus("sdsdsd", "5"));
    }

    @Test
    void when100Plus50ThenResult150() {
        double expected = 150;
        double result = calculator.plus(100, 50);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when25Minus10ThenResult15() {
        double expected = 15;
        double result = calculator.minus(25, 10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when200Minus50ThenResult150() {
        double expected = 150;
        double result = calculator.minus(200, 50);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when40Divide2ThenResult20() {
        double expected = 20;
        double result = calculator.div(40, 2);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when14Divide2ThenResult7() {
        double expected = 7;
        double result = calculator.div(14, 2);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when14Divide0ThenThrowException() {
        if (((int) calculator.div(14.0, 0.0)) == 0)
            assertThrows(ArithmeticException.class, () -> calculator.div(14.0, 0.0));
    }

    @Test
    void when2Multiple15ThenResult30() {
        double expected = 30;
        double result = calculator.mul(2, 15);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when75Multiple2ThenResult150() {
        double expected2 = 150;
        double result2 = calculator.mul(75, 2);
        assertEquals(expected2, result2, 0.001);
    }

    @AfterEach
    public void close() {
        calculator = null;
    }
}