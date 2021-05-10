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

public class Item {
    public int maxWidth;
    public int maxHeight;
    public int maxLength;
    String action;


    public Item(int maxWidth,int maxHeight, int maxLength) {
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    public void putItemIntoBox (Box box) {
        if (isItemLessThanBox(box)) {
            action = "Put item into box";
        } else {
            action = "Find another box";
        }
        System.out.println(action);
    }

    private boolean isItemLessThanBox(Box box) {
        return maxWidth < box.width && maxHeight < box.height && maxLength < box.length;
    }
}