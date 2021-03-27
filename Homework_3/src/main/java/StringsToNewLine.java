/**
 * 8. Given a string "Den, John, Will, Kate, Adam, Robin". Print all the names from the following string each from a new line.
 *    Example:
 *    Den
 *    John
 *    Will
 *    Kate
 *    ...
 */

public class StringsToNewLine {
    public static void main(String[] args) {
        String s = "Den, John, Will, Kate, Adam, Robin";
        System.out.println(s.replaceAll(",", "\n"));
     }
}


