/**
 * 4. Given two strings. Check if they start with "The".
 *
 *    Task: word1 = "The End", word2="End The";
 */

public class CompareStrings {
    public static void main(String[] args) {
        String theEnd = "The End";
        String endThe = "End the";
        System.out.println(theEnd.startsWith("The"));
        System.out.println(endThe.startsWith("The"));
    }
}
