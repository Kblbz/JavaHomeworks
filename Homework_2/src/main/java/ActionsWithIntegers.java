/**
 1. Create a simple program, that creates two integers and print the result of calculation of their addition,
    substruction, multiplication and division.
 */


public class ActionsWithIntegers {
    public static void main(String[] args) {
        int a = 5;
        int b = 50;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        System.out.println("Sum: " + c);
        System.out.println("Difference: " + d);
        System.out.println("Product: " + e);
        System.out.println("Quotient: " + b/a);
    }
}