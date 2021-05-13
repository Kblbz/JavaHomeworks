public class Rectangle extends Figure {
    double width;
    double height;

    public Rectangle (double width, double height) {
          this.width = width;
          this.height = height;
    }

    @Override
    double calculateArea () {
        return width * height;
    }
}