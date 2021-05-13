public class B extends A {

    public B (int a, int b) {
        super(a, b);
    }

    public B (double percentage) {
        super(percentage);
    }

    @Override
    public int simpleCalculation (int a, int b) {
        System.out.println("Multiplication result of a and b is " + (a+b));
        return a * (int)Math.pow(b, 2);
    }

    @Override
    public double percentageCalculation (int a, double percentage) {
        double result;
        result = super.percentageCalculation(a, percentage)*100;
        System.out.println("Result multiplied by 100 is " + result);
        return result;
    }
}
