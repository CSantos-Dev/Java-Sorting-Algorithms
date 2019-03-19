package algorithms.sorting;


/**
 * Implementation of Bubble Sort algorithm.
 *
 * This algorithm repeatedly steps through the array comparing adjacent pairs
 * and swapping them if they are in the wrong order.
 *
 * @author csantos
 */
public class BubbleSort implements SortingAlgorithm{

    public void sort(int[] array) {
        boolean sorted = false;
        
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    swapPositions(array, i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    private static void swapPositions(int[] array, int p1, int p2) {
        int tmp = array[p2];
        array[p2] = array[p1];
        array[p1] = tmp;
    }
}
