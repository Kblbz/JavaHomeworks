/**
 *     8. Create an array of 5 doubles. Get the first and the last element of the array and write them to variables.
 */


public class DoubleArray {
    public static void main(String[] args) {
        double [] justDoubles = {25.01, 7.02, 11.03, 3.04, 33.05};
        double a = justDoubles[0];
        double b = justDoubles[4];
        System.out.println("First - " + a + ", Last - " + b);

        // Вариант нормальный, но последний элемент массива лучше вынимать не по конкретному индексу, а через его размер
        double first = justDoubles[0];
        double last = justDoubles[justDoubles.length - 1];
    }
}
