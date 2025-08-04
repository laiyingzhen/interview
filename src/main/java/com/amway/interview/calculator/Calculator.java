package com.amway.interview.calculator;

import java.text.DecimalFormat;
import java.util.Stack;

public class Calculator {
    public Calculator(){

    }
    private static final Stack<String> lifoStack  = new Stack<>();
    public double add(double a,double b){
        return a + b;
    }
    public double substract(double a, double b){
        return a - b;
    }
    public double multiply(double a, double b){
        return a * b;
    }
    public double divide(double a,double b){
        return a / b;
    }
    public String displayResult(double result){
        return lifoStack.push(getFormatedAmount(result));
    }
    public void clear(){
        lifoStack.clear();
    }
    public String undo(){
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
