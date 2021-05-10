/**
 * 1) Create 2 classes with the same name, but put them in different packages. For example, com.domainname.modulename.
 * Create a third class with the main method.
 * In the main method create two different objects of your classes specifying the full name of the classes (including packages).
 */

public class SameNameClassDemo {
    public static void main(String[] args) {
        mypackage1.SameNameClass snClass1 = new mypackage1.SameNameClass();
        mypackage2.SameNameClass snClass2 = new mypackage2.SameNameClass();
        snClass1.salutation();
        snClass2.salutation();
    }
}
