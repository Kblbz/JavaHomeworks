/**
 * 3) Answer the question: What is a package-private access? Create a simple program to demonstrate the package-private access.
 * Tips:
 *  - Create two different packages
 *  - Create 3 classes. 2 classes should be in the first package, 3rd class - in the second package.
 *  - Create in one of the classes some package-private members(fields or methods).
 *  - In another two classes create objects of the class with package-private members and try to access its members.
 */

package mypackage1;

class Notepad {
    int pagesQuantity;
    public Notepad() {

    }

    void keepNotes (Note note) {
        System.out.println("Notepad keeps note: " + note.note);
    }

}
