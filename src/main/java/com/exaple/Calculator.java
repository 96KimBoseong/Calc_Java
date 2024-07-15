package com.exaple;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private AbstractOperation abstractOperation;
    public Calculator(){}

    public Calculator(
        AbstractOperation abstractOperation
    ) {
        this.abstractOperation = abstractOperation;
    }
    public void setAbstractOperation(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculate() throws BadInputException {
        double result = 0;
        result = abstractOperation.operate(this.firstNumber, this.secondNumber);
        return result;
    }




}
