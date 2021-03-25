/**
 * Write a program which creates and initializes all primitive data types. Remark: There are 8 primitive data types.
 */

public class PrimitiveDataTypes {
    public static void main(String[] args){
        byte b = 17;
        short s = -32768;
        int i = 10000;
        long l = 654897865132135l;
        float f = 2.04f;
        double d = 1.02;
        char c = 'a';
        boolean isBoolean = true;
        System.out.println("Integers are: " + b + ", " + s + ", " + i + ", " + l);
        System.out.println("Floating-Point are: " + f + " and " + d);
        System.out.println("Is c = " + c + "? -> " + isBoolean);
    }
}
