/**
 * 7. Create a simple class with some fields.
 * Demonstrate in your class how we can use initialization blocks.
 */

public class Wakeboard {
    String brand;
    int length;
    String rockerType;
    String type;
    {
        System.out.println("Please provide more filters for better choice");
    }

    public Wakeboard () {
        System.out.println("Wakeboard without filters");
    }

    public Wakeboard (String brand) {
        this.brand = brand;
        System.out.println("Wakeboard with brand filter");
    }

    public Wakeboard (String brand, int length) {
        this.brand = brand;
        this.length = length;
        System.out.println("Wakeboard with brand and length filter");
    }

    public Wakeboard (String brand, int length, String rockerType) {
        this.brand = brand;
        this.length = length;
        this.rockerType = rockerType;
        System.out.println("Wakeboard with brand, length and rocker type filter");
    }

    public Wakeboard (String brand, int length, String rockerType, String type) {
        this.brand = brand;
        this.length = length;
        this.rockerType = rockerType;
        this.type = type;
        System.out.println("Wakeboard with brand, length, rocker type and  board type filter");
    }
}

