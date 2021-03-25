import java.util.Arrays;

/**
 4. Create an array of 10 integers. Find the square root of each element and put the to result array. Print the result
    array to the console.
 */



public class ArrayWithSquareRoot {
    public static void main(String[] args) {
        int [] tenIntegers = {9,25,1156,81,256,121,1,289,36,4};
        for (int i=0; i<tenIntegers.length; i++) {
            tenIntegers[i] = (int) Math.sqrt(tenIntegers[i]);
        }
        int [] squareRoots = Arrays.copyOf(tenIntegers, tenIntegers.length);
        System.out.println(Arrays.toString(squareRoots));
    }
}