package com.exaple;

import java.text.ParseException;
import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";
    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception {
       if (!Pattern.matches(NUMBER_REG,firstInput)) {
            throw new BadInputException("정수값");
       }
        this.calculator.setFirstNumber(Integer.parseInt(firstInput));

        return this;
    }

    public Parser parseSecondNum(String secondInput) throws Exception {
        if (!Pattern.matches(NUMBER_REG,secondInput)) {
            throw new BadInputException("정수값");
        }
        this.calculator.setSecondNumber(Integer.parseInt(secondInput));
        return this;
    }

    public Parser parseOperator(String operationInput)throws Exception{

        if (!Pattern.matches(OPERATION_REG,operationInput)) {
            throw new BadInputException("사칙연산기호");
        }
        switch (operationInput) {
            case"+":
                this.calculator.setAbstractOperation(new Add());
                break;

            case"-":
                this.calculator.setAbstractOperation(new Subtract());
                break;
            case"*":
                this.calculator.setAbstractOperation(new Multiply());
                break;
            case"/":
                this.calculator.setAbstractOperation(new Divide());
                break;
            case"%":
                this.calculator.setAbstractOperation(new Remainder());
                break;
        }
        return this;
    }

    public double executeCalculator() throws BadInputException {
        return calculator.calculate();
    }
}
