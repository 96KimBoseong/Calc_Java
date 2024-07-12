package com.exaple;

public class Calculator {

    private AbstractOperation abstractOperation;
    public Calculator(
        AbstractOperation abstractOperation
    ) {
        this.abstractOperation = abstractOperation;
    }
    public void setAbstractOperation(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }

    public double calculate( int firstNumber, int secondNumber) {
        double result = 0;

        return result = abstractOperation.operate(firstNumber, secondNumber);
    }
}
