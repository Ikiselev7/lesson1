package ru.kiselev.lesson1;

/**
 * Created by kiselev_ia on 22.08.2017.
 */
public abstract class BinaryOperation {
    int firstOperand;
    int secondOperand;


    public BinaryOperation(String... operands)throws NumberFormatException, OperandException{

            if (operands.length < 2) {
                throw new OperandException("I don't have enough operands for this");
            } else if (operands.length > 2) {
                throw new OperandException("Too much operands");
            }
            firstOperand = Integer.parseInt(operands[0]);
            secondOperand = Integer.parseInt(operands[1]);

    }

    public abstract int calculate() throws IllegalArgumentException;

}
