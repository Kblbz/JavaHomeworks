/**
 * 4) Answer the question: What is a public access? Create a simple program to demonstrate the public access.
 * You can use tips from the task 3.
 *
 *
 * Public modifier should be used to grant public access to a class or at the member level (field or method).
 * Public means that class or its member is visible to all classes without any regard to a package.
 */

package mypackage1;

public class Box {
    public int width;
    public int height;
    public int length;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
}
