/**
 *   6. Create a simple program with several constants. Try to reassign a value for any of them and compile you program.
 *      What happened?
 *      - java: cannot assign a value to final variable GRAMS_PER_CUP
 */


public class ConstantsReassign {
    public static void main(String[] args) {
        final int GRAMS_PER_CUP = 10;
        final int COFFECUPS_PER_DAY = 2;
        System.out.println("Coffee daily portion for 1 person: "+ GRAMS_PER_CUP * COFFECUPS_PER_DAY + " grams");

        //GRAMS_PER_CUP = 15;
    }
}
