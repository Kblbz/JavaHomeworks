/**
 *  4. Answer the question: What the difference between integers and floating-point numbers?
 *     - Floating-point numbers have a fractional component while integers haven't.
 *
 *
 * 5. Read about ASCII. Write Unicode for all characters in a word "Hello".
*/

public class HelloUnicode {
    public static void main(String[] args) {
        String hello = "Hello";
        for (int i = 0; i < hello.length(); i++){
            System.out.println((int) hello.charAt(i));
        }
    }
}