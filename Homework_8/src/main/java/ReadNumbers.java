/*6. Write a program that will read numbers from the keyboard.
        The code for reading numbers from the keyboard must be in the readData method.
        The code inside the readData is wrapped in a try..catch.
        If the user entered some text, instead of a number, this method should catch the exception and display all
        previously entered numbers as a result. Each number should be printed from a new line preserving the order of the input.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            while (scanner.hasNextInt())
                numbers.add(scanner.nextInt());
            /*System.out.println("Entered numbers are:");
            for (int i : numbers) {
                System.out.println(i);
            }*/
        } catch (Exception e) {
            System.out.println("You've entered invalid value");
            System.out.println(e.getMessage());
            /*System.out.println("Entered numbers are:");
            for (int i : numbers) {
                System.out.println(i);
            }*/
        } finally {
            scanner.close();
            System.out.println("Entered numbers are:");
            for (int i : numbers) {
                System.out.println(i);
            }
        }
    }
}