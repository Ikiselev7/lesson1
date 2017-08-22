package ru.kiselev.lesson1;

/**
 * Created by kiselev_ia on 22.08.2017.
 */
public abstract class BinaryOperation {
    protected int firstOperand;
    protected int secondOperand;


    public boolean isCorrect(String... operands)throws OperandException{

            if (operands.length < 2) {
                throw new OperandException("I don't have enough operands for this");
            } else if (operands.length > 2) {
                throw new OperandException("Too much operands");
            }
            firstOperand = Integer.parseInt(operands[0]);
            secondOperand = Integer.parseInt(operands[1]);
            return true;
    }

    public abstract int calculate() throws IllegalArgumentException;





















































    protected String massage = "                               ________________\n" +
            "                          ____/ (  (    )   )  \\___\n" +
            "                         /( (  (  )   _    ))  )   )\\\n" +
            "                       ((     (   )(    )  )   (   )  )\n" +
            "                     ((/  ( _(   )   (   _) ) (  () )  )\n" +
            "                    ( (  ( (_)   ((    (   )  .((_ ) .  )_\n" +
            "                   ( (  )    (      (  )    )   ) . ) (   )\n" +
            "                  (  (   (  (   ) (  _  ( _) ).  ) . ) ) ( )\n" +
            "                  ( (  (   ) (  )   (  ))     ) _)(   )  )  )\n" +
            "                 ( (  ( \\ ) (    (_  ( ) ( )  )   ) )  )) ( )\n" +
            "                  (  (   (  (   (_ ( ) ( _    )  ) (  )  )   )\n" +
            "                 ( (  ( (  (  )     (_  )  ) )  _)   ) _( ( )\n" +
            "                  ((  (   )(    (     _    )   _) _(_ (  (_ )\n" +
            "                   (_((__(_(__(( ( ( |  ) ) ) )_))__))_)___)\n" +
            "                   ((__)        \\\\||lll|l||///          \\_))\n" +
            "                            (   /(/ (  )  ) )\\   )\n" +
            "                          (    ( ( ( | | ) ) )\\   )\n" +
            "                           (   /(| / ( )) ) ) )) )\n" +
            "                         (     ( ((((_(|)_)))))     )\n" +
            "                          (      ||\\(|(|)|/||     )\n" +
            "                        (        |(||(||)||||        )\n" +
            "                          (     //|/l|||)|\\\\ \\     )\n" +
            "                        (/ / //  /|//||||\\\\  \\ \\  \\ _)\n" +
            "-------------------------------------------------------------------------------";
}
