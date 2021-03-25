import java.util.Random;

/**
 3. Create an array of 10 integers. Fill this array using for-loop with random numbers. Print all the elements of this
 array to the console. Each element from the new line.
*/


 public class FillArrayWIthNumbers {

     public static void main(String[] args) {
         Random r = new Random();
         int[] randomNumbers = new int[10];
         for (int i = 0; i < randomNumbers.length; i++) {
             randomNumbers[i] = r.nextInt(61);
         }

         for (int n : randomNumbers) {
         System.out.println(n);
         }
    }

/** Or:
    public static void main(String[] args) {
        Random r = new Random();
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(r.nextInt(61));
        }
    }
 */

}