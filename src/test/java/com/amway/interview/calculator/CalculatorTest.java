package com.amway.interview.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CalculatorTest {

    @Test
    void testUndo() {
        Calculator calculator = new Calculator();
        double num1 = 6.5d;
        double num2 = 3.5d;
        String expectedResult1 = "10";
        double calculate1 = calculator.add(num1,num2);
        String cal1Result1 = calculator.displayResult(calculate1);
        assertEquals(expectedResult1, cal1Result1, num1 + " + " + num2 + " should equal " + expectedResult1);
        double num3 = 2.0d;
        double num4 = 16.0d;
        String expectedResult2 = "32";
        double calculate2 = calculator.multiply(num3, num4);
        String calResult2  = calculator.displayResult(calculate2);
        assertEquals(expectedResult2, calResult2, num3 + " * " + num4 + " should equal " + expectedResult2);
        String undoResult = calculator.undo();
        assertEquals(expectedResult1, undoResult, "Undo result should equal " + expectedResult1);
    }

    @Test
    void testRedo() {
        Calculator calculator = new Calculator();
        double num1 = 6.5d;
        double num2 = 3.5d;
        String expectedResult1 = "10";
        double calculate1 = calculator.add(num1,num2);
        String cal1Result1 = calculator.displayResult(calculate1);
        assertEquals(expectedResult1, cal1Result1, num1 + " + " + num2 + " should equal " + expectedResult1);
        double num3 = 2.0d;
        double num4 = 16.0d;
        String expectedResult2 = "32";
        double calculate2 = calculator.multiply(num3, num4);
        String calResult2  = calculator.displayResult(calculate2);
        assertEquals(expectedResult2, calResult2, num3 + " * " + num4 + " should equal " + expectedResult2);
        String undoResult = calculator.undo();
        assertEquals(expectedResult1, undoResult, "Undo result should equal " + expectedResult1);
        String redoResult = calculator.redo();
        assertEquals(expectedResult2, redoResult, "Redo result should equal " + expectedResult2);
    }

    @Test
    @DisplayName("241271.982201d + 59021.013952d = 300292.996153")
    void testAdds() {
        Calculator calculator = new Calculator();
        double result = calculator.add(241271.982201d, 59021.013952d);
        assertEquals("300292.996153", calculator.displayResult(result));
    }

    @ParameterizedTest
    @MethodSource("testSubstractData")
    void testSubstract(double num1, double num2, String expecedResult) {
        Calculator calculator = new Calculator();
        double result = calculator.substract(num1, num2);
        assertEquals(expecedResult, calculator.displayResult(result), num1 + "-" + num2 + "should equal " + expecedResult);
    }

    @ParameterizedTest
    @MethodSource("testMultiplyData")
    void testMultiply(double num1, double num2, String expecedResult) {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(num1, num2);
        assertEquals(expecedResult, calculator.displayResult(result), num1 + "*" + num2 + "should equal " + expecedResult);
    }

    @ParameterizedTest
    @MethodSource("testDivideData")
    void testDivide(double num1, double num2, String expecedResult) {
        Calculator calculator = new Calculator();
        double result = calculator.divide(num1, num2);
        assertEquals(expecedResult, calculator.displayResult(result), num1 + "/" + num2 + "should equal " + expecedResult);
    }

    static Stream<Arguments> testSubstractData(){
        return Stream.of(
                arguments(5.38927, 1.928983, "3.460287")
        );
    }

    static Stream<Arguments> testMultiplyData(){
        return Stream.of(
                arguments(5d, 15d, "75")
        );
    }

    static Stream<Arguments> testDivideData(){
        return Stream.of(
                arguments(100d, 5d, "20")
        );
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "5.38927,    1.928983,   7.318253",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void testAddWithParameterizedTest(double first, double second, String expectedResult) {
        Calculator calculator = new Calculator();
        double result = calculator.add(first, second);
        assertEquals(expectedResult, calculator.equals(result),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
    @Test
    void testDoubleLimit(){
        double num1 = 50.0d;
        double num2 = 0d;
        Calculator calculator = new Calculator();
        double calculatorNum = calculator.divide(num2, num1);
        System.out.println("calculatorNum = " + calculatorNum);
//        String result = calculator.displayResult(calculatorNum);
//        assertThrows(RuntimeException.class, () -> {
//            calculator.displayResult(calculatorNum);
//        });
    }
}