/**
 * 4. Create a class StaticCalculator. It should have three fields: double firstValue, double secondValue and String operation.
 * Create all required constructors to properly initialize your object.
 * Consider the case when user does not provide any parameters when creates a new object.
 * Write a method "calculate" that takes these two values and return the result of the calculation according to the operation.
 * Write the test class which contains the main method.
 * In this main method you should create your StaticCalculator object and do some calculation to test your code,
 * by calling your "calculate" method.
 * Print all results to the console.
 */

import java.util.ArrayList;

/**
 *                                    !!!!!!   A T T E N T I O N   !!!!!!
 *
 * For those who saw calculator from Dmytro's repo -> Create a Calculator that keeps history
 */

public class StaticCalculator {
    double firstValue;
    double secondValue;
    String operation;

    public StaticCalculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }
    //   public static double calcu(double firstValue, double secondValue, String operation) {
    //      if (operation.equals("+")){
    //          return firstValue + secondValue;
    //       } else if (operation.equals("-")){
    //           return firstValue - secondValue;
    //       } else if (operation.equals("*")){
//            return firstValue * secondValue;
    //       } else if (operation.equals("/")){
    //           return firstValue / secondValue;
    //       } else return 0;
    //   }
    public double calculate() {
        switch (operation) {
            case "+":
                return firstValue + secondValue;
            case "-":
                return firstValue - secondValue;
            case "*":
                return firstValue * secondValue;
            case "/":
                return secondValue != 0 ? firstValue / secondValue : 0;
            default:
                return 0.0;
        }
    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String  operation) {
        this.operation = operation;
    }
}

