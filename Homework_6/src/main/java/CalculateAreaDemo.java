public class CalculateAreaDemo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10.0, 8.5);
        Rectangle rectangle = new Rectangle(54.0, 36.0);
        Circle circle = new Circle(12.7);

        System.out.println(triangle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());
    }
}
