/**
 *    3. Create an integer variable "a". Try to assign a value to it that doesn't match the allowed range. What happened?
 *    Find in your favorite search engine the explanation.
 *
 *  - Integer.MAX_VALUE + 1 == Integer.MIN_VALUE
 *  - Integer.MIN_VALUE - 1 == Integer.MAX_VALUE
 *  - Overflow occurs when you increment an integer beyond it's max value and it wraps around to the Integer.MIN_VALUE - max negative value
 *  - and if you decrement integer beyond it's minimum value - you get Integer.MAX_VALUE
 */


public class IntegerOutOfRange {
    public static void main(String[] args){
        int a = 2147483647;
        a++;
        System.out.println(a);

        int b = -2147483648;
        b--;
        System.out.println(b);
    }
}