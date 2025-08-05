package com.amway.interview;

import com.amway.interview.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double a = 10.0898132d;
        double b = 23.2489134d;
        Calculator calculator = new Calculator();
        double addResult = calculator.add(a,b);
        System.out.println("result = " + calculator.displayResult(addResult));
        double substractResult = calculator.substract(a,b);
        System.out.println("substractResult = " + calculator.displayResult(substractResult));
        double multiplyResult = calculator.multiply(a,b);
        System.out.println("multiplyResult = " + calculator.displayResult(multiplyResult));
        double divideResult = calculator.divide(a,b);
        System.out.println("divideResult = " + calculator.displayResult(divideResult));

    }
}