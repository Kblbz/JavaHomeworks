/**
 * 8. Print all the numbers from 1 to 100 that are divisible by 3 or divisible by 5, but not divisible by 2.
 */


public class OddIntegers {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.print(i + " ");
            } else {
                if (i % 5 == 0 && i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();

        // Тут все таки лучше использовать логические операторы
        for (int i = 0; i <= 100; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}