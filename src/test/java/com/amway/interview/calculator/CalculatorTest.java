package com.amway.interview.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void add() {
    }

    @Test
    void substract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void clear() {
    }

    @Test
    void undo() {
        Calculator calculator = new Calculator();
        double num1 = 6.5d;
        double num2 = 3.5d;
        double calculate1 = calculator.add(num1,num2);
        String cal1Result1 = calculator.equals(calculate1);
        System.out.println("calculator.equals(cal1Result1) = " + cal1Result1);
        double num3 = 2.0d;
        double num4 = 16.0d;
        double calculate2 = calculator.multiply(num3, num4);
        String calResult2  = calculator.equals(calculate2);
        System.out.println("calculator.equals(result2) = " + calResult2);
        String undoResult = calculator.undo();
        assertEquals(undoResult, cal1Result1);
    }

    @Test
    void redo() {
    }

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        double result = calculator.add(1d, 1d);
        assertEquals("2", calculator.equals(result), "1 + 1 should equal 2");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "5.38927,    1.928983,   7.318253",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void testAdd(double first, double second, String expectedResult) {
        Calculator calculator = new Calculator();
        double result = calculator.add(first, second);
        assertEquals(expectedResult, calculator.equals(result),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}