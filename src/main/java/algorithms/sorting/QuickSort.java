package algorithms.sorting;

/**
 * Implementation of Quick Sort algorithm.
 *
 * This algorithm uses divide and conquer principle to divide the input array into
 * two subArrays by a pivot element (The last index in this case) storing the smaller elements
 * in the left subArray and the larger in the right subArray. All sorted subArrays are merged
 * at the end to form the final sorted array.
 *
 * @author csantos
 */
public class QuickSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        quickSort(array, firstIndex, lastIndex);
    }

    private void quickSort(int[] array, int firstIndex, int lastIndex) {
        if (lastIndex > firstIndex) {
            int partitionIndex = partition(array, firstIndex, lastIndex);

            quickSort(array, firstIndex, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, lastIndex);
        }
    }

    private int partition(int[] array, int firstIndex, int lastIndex) {
        int pivot = array[lastIndex];
        int currentIndex = firstIndex - 1;

        for (int i = firstIndex; i <= lastIndex; i++) {
            if(array[i] < pivot) {
                currentIndex++;
                swap(array, currentIndex, i);
            }
        }

        currentIndex++;
        swap(array, currentIndex, lastIndex);

        return currentIndex;

    }

    private void swap(int[] array, int indexOne, int indexTwo) {
        int tmp = array[indexTwo];
        array[indexTwo] = array[indexOne];
        array[indexOne] = tmp;
    }
}
