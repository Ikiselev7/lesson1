package ru.kiselev.lesson1;

/**
 * Created by kiselev_ia on 22.08.2017.
 */
public class Division extends BinaryOperation {

    @Override
    public boolean isCorrect(String... operands) throws OperandException, IllegalArgumentException {
        super.isCorrect(operands);
        if(secondOperand==0){
            throw new IllegalArgumentException("Oh my God, you divided by zero!\n"+massage);
        }
        return true;
    }

    @Override
    public int calculate()  {
        return firstOperand/secondOperand;
    }

    public static void main(String[] args) {
        try {
            Division division = new Division();
            if(division.isCorrect(args)){
                System.out.println(division.calculate());
            }
        } catch (NumberFormatException e){
            System.out.println("Arguments include not integer");
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (OperandException e) {
            System.out.println(e.getMessage());
        }
    }
}
