package com.amway.interview;

import com.amway.interview.calculator.Calculator;
import com.amway.interview.calculator.Validator;

public class Main {
    public static void main(String[] args) {
        double a = 10.0898132d;
        double b = 23.2489134d;
        Calculator calculator = new Calculator(new Validator());
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