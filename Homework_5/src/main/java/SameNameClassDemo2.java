/**
 * 2) Take the classes from the task 1. Create a new test class.
 * Import everything (*) from your created packages.
 * Now try to create objects of your classes without specifying the packages in front of the class names.
 *  What happened? How can we avoid this?
 */
import mypackage1.*;
import mypackage2.*;

/**
public class SameNameClassDemo2 {
    SameNameClass sameNameClass = new SameNameClass;
    SameNameClass sameNameClass2 = new SameNameClass;
}
 */

// Those references are not clear to JAva and when creating the object it is uncertain to which package
// class to refer.
//
// To avoid this we need to specify package name before Class, just as we did that in Task 1.

public class SameNameClassDemo2 {
    public static void main(String[] args) {
        mypackage1.SameNameClass sameNameClass = new mypackage1.SameNameClass();
        mypackage2.SameNameClass sameNameClass2 = new mypackage2.SameNameClass();
    }

}
