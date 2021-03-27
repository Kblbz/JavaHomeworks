/**
 * 9. Given some random string s. Verify if that string ends with ".". If so, leave this string as is. If not - add it.
 * Test strings create on your own.
 */

public class EndsWithDote {
    public static void main(String[] args) {
        String a = "All just wanna have fun!";
        if (a.endsWith("."))
            System.out.println(a);
        else
            System.out.println(a.replaceAll("[?|,|!]", "."));
    }
}
