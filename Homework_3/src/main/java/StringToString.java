/**
 * 2. Given a string. Write a code that will create a new string made of the first two characters of the initial string.
 * If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
 *
 * For example:
 * "AE_1381" -> "AE"
 * "A" -> "A"
 * "" -> ""
 */

public class StringToString {
    public static void main(String[] args) {
        String a = "";
        int length = a.length();
        if (length < 2)
            System.out.println(a);
        else
            System.out.println(a.substring(0, 2));
    }
}