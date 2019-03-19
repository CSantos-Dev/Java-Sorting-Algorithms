package algorithms.sorting;

/**
 * Implementation of Selection Sort algorithm.
 *
 *
 *
 * @author csantos
 */
public class SelectionSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        int currentIndex = 0;
        int arrayLength = array.length;

        while (currentIndex < arrayLength) {
            int minIndex = currentIndex;
            for(int i = currentIndex; i < arrayLength; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }

            swap(array, currentIndex, minIndex);
            currentIndex++;
        }
    }

    private void swap(int[] array, int currentIndex, int minIndex) {
        int tmp = array[currentIndex];
        array[currentIndex] = array[minIndex];
        array[minIndex] = tmp;
    }
}
