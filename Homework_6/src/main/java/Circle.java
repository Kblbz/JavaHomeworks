public class Circle extends Figure {
    double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (Math.pow(radius, 2.0)) * 3.14;   
    }
}
