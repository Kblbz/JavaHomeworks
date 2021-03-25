/**
 *    b)  ********
 *        *      *
 *        *      *
 *        *      *
 *        ********
 */

public class PrintEmptyRectangle {
    public static void main(String[] args) {
        int length = 8;
        int height = 8;
        for (int i=0; i<length; i++) {
            for (int j=0; j<height; j++){
                if(i==0 || i == length-1){
                    System.out.print("*");
                } else {
                    if (j == 0 || j == height -1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}