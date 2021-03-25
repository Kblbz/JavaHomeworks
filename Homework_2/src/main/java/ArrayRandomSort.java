/**
 * 9. Create an array of any length and fill it with random integers. Using loops and conditions sort this array and print
 *     it out to the console. You can use any sorting algorithm you want. Do not use build-in methods to sort the array.
 */

public class ArrayRandomSort {
    public static void main(String[] args) {
        int[] randomIntegers = new int[7];
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] =  (int)(Math.random() * 100);
            System.out.print(randomIntegers[i] + "  ");
        }
        System.out.print("\n");
        heapSort(randomIntegers);
        for(int i = 0; i <  randomIntegers.length; i++) {
            System.out.print(randomIntegers[i] + "  ");
        }
    }


   static void heapify(int[] array, int length, int i) {
       int leftChild = 2*i+1;
       int rightChild = 2*i+2;
       int largest = i;

       // if the left child is larger than parent
       if (leftChild < length && array[leftChild] > array[largest]) {
           largest = leftChild;
       }

       // if the right child is larger than parent
       if (rightChild < length && array[rightChild] > array[largest]) {
           largest = rightChild;
       }

       // if a swap needs to occur
       if (largest != i) {
           int temp = array[i];
           array[i] = array[largest];
           array[largest] = temp;
           heapify(array, length, largest);
       }
   }

    public static void heapSort(int[] array) {
        if (array.length == 0) return;

        // Building the heap
        int length = array.length;
        // we're going from the first non-leaf to the root
        for (int i = length / 2-1; i >= 0; i--)
            heapify(array, length, i);

        for (int i = length-1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }
}