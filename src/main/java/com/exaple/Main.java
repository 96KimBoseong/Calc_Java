package com.exaple;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws OurBadException {
        Calculator calculator = new Calculator(new Add());
        System.out.println(calculator.calculate(10, 20));
        Calculator calculator2 = new Calculator(new Subtract());
        System.out.println(calculator2.calculate(10, 20));
        Calculator calculator3 = new Calculator(new Multiply());
        System.out.println(calculator3.calculate(10, 20));
        Calculator calculator4 = new Calculator(new Divide());
        System.out.println(calculator4.calculate(10, 20));
        Calculator calculator5 = new Calculator(new Subtract());
        System.out.println(calculator5.calculate(10, 20));
    }
}