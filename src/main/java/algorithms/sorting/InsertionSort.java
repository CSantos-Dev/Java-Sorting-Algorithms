package algorithms.sorting;

/**
 * Implementation of Insertion Sort algorithm
 *
 * This algorithm starts from the second position of the array (the first position is considered already sorted)
 * and it compares the element in that position to the previous elements, inserting it in the right position and shifting
 * the larger elements one place to the right
 *
 * @author csantos
 */
public class InsertionSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i ++) {
            int current = array[i];
            int previousPosition = i - 1;

            while (previousPosition >= 0 && current < array[previousPosition]) {
                array[previousPosition + 1] = array[previousPosition];
                previousPosition --;
            }

            array[previousPosition + 1] = current;
        }
    }
}
