package ru.kiselev.lesson1;

/**
 * Created by kiselev_ia on 22.08.2017.
 */
public class Subtraction extends BinaryOperation {

    @Override
    public int calculate(){
        return firstOperand-secondOperand;
    }

    public static void main(String[] args) {
        try {
            Subtraction sub = new Subtraction();
            if(sub.isCorrect(args)){
                System.out.println(sub.calculate());
            }
        }catch (NumberFormatException e){
            System.out.println("Arguments include not integer");
        }catch (OperandException e) {
            System.out.println(e.getMessage());
        }

    }
}
