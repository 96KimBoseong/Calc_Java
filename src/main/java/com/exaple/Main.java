package com.exaple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;
        while (!calculateEnded) {
            try {
               calculateEnded = CalculatorApp.start();
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }


    }
}