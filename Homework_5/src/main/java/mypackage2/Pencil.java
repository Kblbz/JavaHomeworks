/**
 * 3) Answer the question: What is a package-private access? Create a simple program to demonstrate the package-private access.
 * Tips:
 *  - Create two different packages
 *  - Create 3 classes. 2 classes should be in the first package, 3rd class - in the second package.
 *  - Create in one of the classes some package-private members(fields or methods).
 *  - In another two classes create objects of the class with package-private members and try to access its members.
 */

 // I'm sorry for lazy copy paste of an answer from the lecture: Default access has no keyword, and is
// commonly called package access (sometimes “friendly”). It means that all the other classes in the current package
// have access to that member. To all the classes outside of this package, the member appears as private.

package mypackage2;

import mypackage1.Note;

public class Pencil {
    Note note = new Note();

    public void editNote () {
     //   System.out.println("Edit " + Note.note); //- cannot access package-private member
        System.out.println("Edit " + (note.getNote())); //- can access via getter method

    }
}
