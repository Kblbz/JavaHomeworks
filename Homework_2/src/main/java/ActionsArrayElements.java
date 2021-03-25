/**
 * 7. Create an array of 10 integers. Calculate and print the sum of all its elements except the first one and the last one.
 */

public class ActionsArrayElements {
    public static void main(String[] args) {
        int sum = 0;
        int [] someIntegers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i=1; i<someIntegers.length-1; i++){
            sum +=someIntegers[i];
        }
        System.out.println(sum);
    }
}
