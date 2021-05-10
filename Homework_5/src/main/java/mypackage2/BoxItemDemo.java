/**
 * 4) Answer the question: What is a public access? Create a simple program to demonstrate the public access.
 * You can use tips from the task 3.
 *
 *
 * Public modifier should be used to grant public access to a class or at the member level (field or method).
 * Public means that class or its member is visible to all classes without any regard to a package.
 */
package mypackage2;

import mypackage1.Box;

public class BoxItemDemo {
    public static void main(String[] args) {
        Item item = new Item(3,4,5);
        Box box = new Box (5,6,7);
        item.putItemIntoBox(box);

        Item item1 = new Item(10,10,10);
        Box box1 = new Box(5, 6, 8);
        item1.putItemIntoBox(box1);
    }
}
