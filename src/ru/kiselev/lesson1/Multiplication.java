package ru.kiselev.lesson1;

/**
 * Created by kiselev_ia on 22.08.2017.
 */
public class Multiplication extends BinaryOperation {

    @Override
    public int calculate() {
        return firstOperand*secondOperand;
    }

    public static void main(String[] args) {
        try {
            Multiplication multp = new Multiplication();
            if(multp.isCorrect(args)){
                System.out.println(multp.calculate());
            }
        } catch (NumberFormatException e){
            System.out.println("Arguments include not integer");
        }catch (OperandException e) {
            System.out.println(e.getMessage());
        }
    }
}
