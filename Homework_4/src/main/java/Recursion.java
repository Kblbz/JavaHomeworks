/**
 * 9. Write your own example of the recursive function. You can find a lot of examples on the Internet.
 */

public class Recursion {
    static int numberOfBoxes=0;
    static void giftInsideBox (){
        numberOfBoxes++;
        if(numberOfBoxes<=4) {
            System.out.println("To find your gift open another box "+ numberOfBoxes);
            giftInsideBox();
        } else {
            System.out.println("Here is your gift");
        }
    }

    public static void main(String[] args) {
        giftInsideBox();
    }
}