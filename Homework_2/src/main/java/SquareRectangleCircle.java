/**
 2. Create a simple program that calculates and prints the square of a rectangle and a circle. Import and use Math class.
 */


public class SquareRectangleCircle {
     public static void main(String[] args) {
         int length = 7;
         double width = 2.5;
         double radius = 11;

         double rectangleSquare = length * width;
         double circleArea = Math.PI * (radius * radius);
      System.out.println("Circle area: " + circleArea + " cm2");
      System.out.println("Rectangle square: " + rectangleSquare + " cm2");


     }

}
