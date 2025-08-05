package com.amway.interview.calculator;

import java.text.DecimalFormat;
import java.util.Stack;

public class Calculator {
    public Validator validator;
    public Calculator(){

    }
    public Calculator(Validator validator){
        this.validator = validator;
    }
    private static final Stack<String> lifoStack  = new Stack<>();
    public double add(double a,double b){
        boolean isOverLimit = validator.isOverMaxValue(a) || validator.isOverMinValue(a) || validator.isOverMaxValue(b) || validator.isOverMinValue(b);
        if(isOverLimit){
            throw new IllegalArgumentException("The input value is over limit.");
        }
        return a + b;
    }
    public double substract(double a, double b){
        boolean isOverLimit = validator.isOverMaxValue(a) || validator.isOverMinValue(a) || validator.isOverMaxValue(b) || validator.isOverMinValue(b);
        if(isOverLimit){
            throw new IllegalArgumentException("The input value is over limit.");
        }
        return a - b;
    }
    public double multiply(double a, double b){
        boolean isOverLimit = validator.isOverMaxValue(a) || validator.isOverMinValue(a) || validator.isOverMaxValue(b) || validator.isOverMinValue(b);
        if(isOverLimit){
            throw new IllegalArgumentException("The input value is over limit.");
        }
        return a * b;
    }
    public double divide(double divisor,double dividend){
        boolean isOverLimit = validator.isOverMaxValue(divisor) || validator.isOverMinValue(divisor) || validator.isOverMaxValue(dividend) || validator.isOverMinValue(dividend);
        if(isOverLimit){
            throw new IllegalArgumentException("The input value is over limit.");
        }
        return divisor / dividend;
    }
    public String displayResult(double result){
        return lifoStack.push(getFormatedAmount(result));
    }
    public void clear(){
        lifoStack.clear();
    }
    public String undo(){
        if(lifoStack.isEmpty()){
            throw new RuntimeException("No operation can be undo.");
        }
        int lastIndex = lifoStack.size() - 1;
        return lifoStack.get(lastIndex - 1);
    }
    public String redo(){
        return lifoStack.peek();
    }
    private String getFormatedAmount(double amount){
        DecimalFormat df = new DecimalFormat("#.######");
        return df.format(amount);
    }
}
