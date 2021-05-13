/**
 * 4) Create a class A. Add several fields, two methods and parameterized constructors to it. Create a class B that extends
 * class A.
 * Demonstrate in you program how class's B constructor should call class's A constructor to create a new object. Override
 * one method of the class A to fully change it's behavior. Override another method to add some extra functionality to it,
 * but it should then call class's A method. Create a test class and create several objects of class A and class B and call
 * their methods.
 */

public class A {
    private int a;
    private int b;
    private double percentage;


    public A (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public A (double percentage) {
        this.percentage = percentage;
    }

    public int simpleCalculation (int a, int b) {
      //  System.out.println("Sum of a and b is" + (a+b));
        return a + b;
    }

    public double percentageCalculation (int a, double percent) {
        return a*percent;
    }
}