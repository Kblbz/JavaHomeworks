import java.util.ArrayList;

public class TestStaticCalculator {
    public static void main(String[] args) {
        StaticCalculator calculator = new StaticCalculator(10, 5, "+");
        ArrayList<String> history = new ArrayList<String>();
    //    System.out.println(calculator.calculate());
        history.add(String.valueOf(calculator.calculate()));
        calculator.setOperation("-");
        history.add(String.valueOf(calculator.calculate()));
    //    System.out.println(calculator.calculate());
        calculator.setFirstValue(20);
        calculator.setOperation("*");
        history.add(String.valueOf(calculator.calculate()));
        
    //    System.out.println(calculator.calculate());
        System.out.println(history);
    }
}
