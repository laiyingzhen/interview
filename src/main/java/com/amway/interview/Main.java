package com.amway.interview;

import com.amway.interview.calculator.Calculator;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double a = 10.0898132d;
        double b = 23.2489134d;
        DecimalFormat df = new DecimalFormat("#.######");

        Calculator calculator = new Calculator();
        double addResult = calculator.add(a,b);
        System.out.println("result = " + df.format(addResult));
        double substractResult = calculator.substract(a,b);
        System.out.println("substractResult = " + df.format(substractResult));
        double multiplyResult = calculator.multiply(a,b);
        System.out.println("multiplyResult = " + df.format(multiplyResult));
        double divideResult = calculator.divide(a,b);
        System.out.println("divideResult = " + df.format(divideResult));

    }
}