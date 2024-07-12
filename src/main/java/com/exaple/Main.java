package com.exaple;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(
                new Add(),
                new Subtract(),
                new Multiply(),
                new Divide(),
                new Remainder()

        );

        System.out.println(calculator.calculate("+",10,30));
        System.out.println(calculator.calculate("-",10,30));
        System.out.println(calculator.calculate("*",10,30));
        System.out.println(calculator.calculate("/",10,30));
        System.out.println(calculator.calculate("%",10,30));
    }
}