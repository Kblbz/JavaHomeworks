/**
 * 5. Create a simple class with a bunch of constructors.
 * All these constructors should take different number of parameters.
 * Demonstrate in your class, how we can call one constructor from another.
 */

public class Snowboard {
    String brand;
    int length;
    String rockerType;
    String shape;

    public Snowboard (String brand) {
        this.brand = brand;
        System.out.println("Snowboard brand");
    }

    public Snowboard (String brand, int length) {
        this(brand);
        this.length = length;
        System.out.println("Snowboard brand and length");
    }

    public Snowboard (String brand, int length, String rockerType) {
        this(brand, length);
        this.rockerType = rockerType;
        System.out.println("Snowboard brand, length and rocker type");
    }

    public Snowboard (String brand, int length, String rockerType, String shape) {
        this(brand, length, rockerType);
        this.shape = shape;
        System.out.println("Snowboard brand, length, rocker type and shape");
    }
}