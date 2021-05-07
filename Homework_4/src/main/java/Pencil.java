/**
 * 6. Create a simple class with any 3 fields.
 * Demonstrate in your class how we can use "this" keyword to refer to the object,
 * from which a constructor or a method was invoked.
 */

public class Pencil {
    String hardness;
    String manufacturer;
    String shape;

    public Pencil (String hardness, String manufacturer, String shape) {
        this.hardness = hardness;
        this.manufacturer = manufacturer;
        this.shape = shape;
    }
}