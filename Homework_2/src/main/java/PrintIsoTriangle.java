/**
 *    d)      *
 *           ***
 *          *****
 *         *******
 *        *********
 */

public class PrintIsoTriangle {
    public static void main(String[] args) {
        int height = 5;
        int width = 9;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == height-1)
                    System.out.print("*");
                else {
                    if (j < width/2-i || j > width/2 + i){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
