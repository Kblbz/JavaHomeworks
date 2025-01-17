/**
 * 3. Finish the program to handle all the possible exceptions:
 * public class Main {
 *
 * public static void main(String[] args) {
 * int a = args.length;
 * System.out.println(a);
 *
 * int b = 10 / a;
 * int[] c = {1};
 * System.out.println(c[1]);
 * }
 * }
 *
 * Print the cause of the exception to the console.
 */

public class ExceptionsHandling {

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);
        try {
            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero/ " + e.getCause());
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}


