public class DemoAB {
    public static void main(String[] args) {
        B b = new B(5, 10);
        B b1 = new B(0.25);
        A a = new A(5, 10);
        A a1 = new A(0.25);

        b.percentageCalculation(5, 0.25);
        b1.simpleCalculation(5, 10);

        a.percentageCalculation(5, 0.25);
        a1.simpleCalculation(5, 10);
    }
}
