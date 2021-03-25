import java.util.Arrays;

/**
 * 6. Create a program that print to the console following figures. Use loops, asterisks("*") and spaces (" ").
 *  a)  ********
 *      ********
 *      ********
 *      ********
 *      ********
 *      ********
 *      ********
 *      ********
 */


public class PrintRectangle {
    public static void main(String[] args) {
        int length = 8;
        int height = 8;
        for (int i=0; i<length; i++) {
            for (int j=0; j<height; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


