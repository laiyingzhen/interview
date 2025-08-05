package com.amway.interview.calculator;

public class Validator {
    public boolean isOverMaxValue(double number){
        boolean result = false;
        if(number >= Double.MAX_VALUE){
            result = true;
        }
        return result;
    }
    public boolean isOverMinValue(double number){
        boolean result = false;
        if(number <= Double.MIN_VALUE){
            result = true;
        }
        return result;
    }
}
