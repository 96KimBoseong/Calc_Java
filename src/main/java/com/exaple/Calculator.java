package com.exaple;

public class Calculator {

    private final Add add;
    private final Subtract  subtract;
    private final Multiply multiply;
    private final Divide divide;
    private final Remainder remainder;

    public Calculator(
            Add add,
            Subtract subtract,
            Multiply multiply,
            Divide divide,
            Remainder remainder
    ) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
        this.remainder = remainder;

    }

    public double calculate(String operator , int firstNumber, int secondNumber) {
        double result = 0;



        if (operator.equals("+")) {
            result = add.add(firstNumber, secondNumber);
        } else if (operator.equals("-")) {
            result = subtract.subtract(firstNumber, secondNumber);
        } else if (operator.equals("*")) {
            result = multiply.multiply(firstNumber, secondNumber);
        } else if (operator.equals("/")) {
            result =  divide.divide(firstNumber, secondNumber);
        }else if (operator.equals("%")) {
            result = remainder.remainder(firstNumber, secondNumber);
        }
        return result;
    }
}
