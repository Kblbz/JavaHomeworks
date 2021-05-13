public class Triangle extends Figure {
    double width;
    double height;

    public Triangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea () {
        return width * height/2;
    }
}
