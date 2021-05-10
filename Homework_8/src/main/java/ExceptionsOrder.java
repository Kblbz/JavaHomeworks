/**
 * 4. Fix the program to make it work:
 * public static void main(String[] args) {
 *         try {
 *             int a = 0;
 *             int b = 4 / a;
 *         } catch (Exception e) {
 *             e.printStackTrace();
 *         } catch (ArithmeticException e) {
 *             e.printStackTrace();
 *         }
 * }
 */

public class ExceptionsOrder {

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
