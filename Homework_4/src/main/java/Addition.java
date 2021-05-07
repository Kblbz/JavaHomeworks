/**
 * 10. Create a simple class with overloaded methods. Write another class to demonstrate the concept of methods overloading.
 */

public class Addition {
    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public double add(double a, double b){
        double sum = a + b;
        return sum;
    }

    public double add(int a, double b){
        double sum = a + b;
        return sum;
    }
}
