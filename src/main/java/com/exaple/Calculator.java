package com.exaple;

public class Calculator {
    public double calculate(String operator , int firstNumber, int secondNumber) {
        double result = 0;
        if (operator.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operator.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (operator.equals("/")) {
            result = firstNumber / secondNumber;
        }
        return result;
    }
}
