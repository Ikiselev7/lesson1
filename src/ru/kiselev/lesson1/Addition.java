package ru.kiselev.lesson1;

/**
 * Created by kiselev_ia on 22.08.2017.
 */
public class Addition extends BinaryOperation {

    public Addition(String... operands) throws NumberFormatException, OperandException {
        super(operands);
    }

    @Override
    public int calculate() {
        return firstOperand+secondOperand;
    }

    public static void main(String[] args) {
        try {
            Addition add = new Addition(args);
            System.out.println(add.calculate());
        } catch (NumberFormatException e){
            System.out.println("Arguments include not integer");
        }catch (OperandException e) {
            System.out.println(e.getMessage());
        }
    }
}
