package calculator.tester;

public class Calculator {

    //Metodi
    //addizione
    public float add(float num1,float num2){
        if (Float.isNaN(num1) || Float.isNaN(num2)){
            throw new NumberFormatException("One or both parameters are not valid float numbers");
        }
        return num1 + num2;
    }
    //sottrazione
    public float substract(float num1,float num2){
        if (Float.isNaN(num1) || Float.isNaN(num2)){
            throw new NumberFormatException("One or both parameters are not valid float numbers");
        }
        return num1 - num2;
    }
    //Divisione
    public float divide(float num1, float num2){
        if (num2 == 0 || Float.isNaN(num1) || Float.isNaN(num2)){
            throw new ArithmeticException("The divisor must not be zero");
        }
        return num1 / num2;
    }
    //Moltiplicazione
    public float multiply(float num1, float num2){
        return num1 * num2;
    }
}
