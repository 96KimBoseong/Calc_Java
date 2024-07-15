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

    public double calculate( int firstNumber, int secondNumber) throws OurBadException {
        double result = 0;
        if (firstNumber == 0 && secondNumber == 0 ) {
            throw new OurBadException();
        }
        return result = abstractOperation.operate(firstNumber, secondNumber);
    }
}
