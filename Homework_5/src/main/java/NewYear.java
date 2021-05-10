/**
 * 11) Create a class with two different methods and two fields. One of methods should be static, another - non-static.
 * The same thing should be done with class fields(first - static, second - non-static).
 * These two methods should change the corresponding fields of the class when called.
 * Create another class with main method to test your code.
 *
 * Example:
 *
 * class MyClass {
 *
 *    static int staticField;
 *    int dynamicField;
 *
 *    static void change(int value) {
 *        // should change corresponding field
 *    }
 *
 *    void anotherChange(int value) {
 *        // should change corresponding field
 *    }
 * }
 */


public class NewYear {
    static int year;
    int days;

    static void changeYear(int year) {
        System.out.println("New Year is: " + year++);
    }

    void daysTillNewYear(int days) {
        System.out.println(days-- + " days left till New Year");
    }

}
