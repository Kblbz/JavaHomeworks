/**
 * 5. Throw a NullPointerException from the method iCanThrowException();
 * Handle it in the main method.
 * public class Main {
 *
 * public static void main(String[] args) {
 * iCanThrowException();
 * }
 *
 * public static void iCanThrowException() {
 *
 * }
 *
 * }
 */


public class CanThrowException {
    static String object;

    public static void main(String[] args) throws NullPointerException {
        try {
            iCanThrowException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred");
        }
    }

    public static void iCanThrowException() {

        if (object.equals("LSP-88")) {
            System.out.println("Same objects");
        } else {
            System.out.println("Different Objects");
        }
    }

}
