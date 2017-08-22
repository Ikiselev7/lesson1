package ru.kiselev.lesson1;

/**
 * Created by kiselev_ia on 22.08.2017.
 */
public class Division extends BinaryOperation {

    public Division(String... operands) throws NumberFormatException, OperandException {
        super(operands);
    }

    @Override
    public int calculate() throws IllegalArgumentException {

        if(secondOperand==0){
            throw new IllegalArgumentException("Oh my God, you divide by zero!");
        }


        return firstOperand/secondOperand;
    }

    public static void main(String[] args) {
        try {
            Division division = new Division(args);
            System.out.println(division.calculate());
        } catch (NumberFormatException e){
            System.out.println("Arguments include not integer");
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (OperandException e) {
            System.out.println(e.getMessage());
        }
    }
}
