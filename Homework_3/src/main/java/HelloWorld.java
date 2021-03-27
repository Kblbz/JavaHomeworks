import java.util.ArrayList;
import java.util.Arrays;

/**
 * 10. Write a program which prints "Hello world" to the console using methods transformIntToChar and printList only.
 * public class Main {
 *
 *     public static void main(String[] args) {
 *     // write your code here
 *     }
 *
 *     private static ArrayList<Character> transformIntToChar(int... values) {
 *         ArrayList<Character> buffer = new ArrayList<>();
 *         for (int i: values) {
 *             buffer.add(((char) i));
 *         }
 *         return buffer;
 *     }
 *
 *     private static void printList(ArrayList<Character> characters) {
 *         for (char c: characters) {
 *             System.out.print(c);
 *         }
 *     }
 *
 * }
 */

public class HelloWorld {
    public static void main(String[] args) {
        int [] helloWorld = {72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100};
        ArrayList <Character> toPrint = transformIntToChar(helloWorld);
        printList(toPrint);
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }

}


