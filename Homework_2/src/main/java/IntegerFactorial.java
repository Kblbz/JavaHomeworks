/**
 * 5. Create a program that calculates the factorial of an integer value n.
 */

public class IntegerFactorial {
    public static void main(String[] args) {
        int value = 7;
        long factorial = 1;
        for (int i = 1; i < value; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + value + " is " + factorial);
    }
}