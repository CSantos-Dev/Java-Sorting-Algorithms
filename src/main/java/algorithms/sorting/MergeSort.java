package algorithms.sorting;

/**
 * Implementation of Merge Sort algorithm.
 *
 * This algorithms uses divide and conquer approach to divide the array in two groups recursively
 * until we have n groups of 1 element. Then it keeps merging the subArrays into sorted arrays
 * by comparing the elements from both subArrays until we have the final sorted array.
 *
 * @author csantos
 */
public class MergeSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        mergeSort(array, leftIndex, rightIndex);
    }

    private void mergeSort(int[] array, int leftIndex, int rightIndex) {
        if (rightIndex > leftIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;

            mergeSort(array, leftIndex, middleIndex);
            mergeSort(array, middleIndex + 1, rightIndex);
            merge(array, leftIndex, middleIndex, rightIndex);
        }
    }

    private void merge(int[] array, int leftIndex, int middleIndex, int rightIndex) {
        // Create two subArrays and fill them with the data from the original array
        int subArrayLeftLength = (middleIndex - leftIndex) + 1;
        int subArrayRightLength = (rightIndex - middleIndex);
        int[] subArrayLeft = new int[subArrayLeftLength];
        int[] subArrayRight = new int[subArrayRightLength];

        for(int i = 0; i < subArrayLeftLength; i++) {
            subArrayLeft[i] = array[leftIndex + i];
        }

        for (int i = 0; i < subArrayRightLength; i++) {
            subArrayRight[i] = array[middleIndex + 1 + i];
        }

        // Iterate through both subArrays, comparing the values and inserting them in right order in the original array
        int l = 0;
        int r = 0;
        int merged = leftIndex;

        while (l < subArrayLeftLength && r < subArrayRightLength) {
            if(subArrayLeft[l] <= subArrayRight[r]) {
                array[merged] = subArrayLeft[l];
                l++;
            } else {
                array[merged] = subArrayRight[r];
                r++;
            }

            merged++;
        }

        // If there are any remaining items on any of the subArrays, copy them to the original array
        while (l < subArrayLeftLength) {
            array[merged] = subArrayLeft[l];
            l++;
            merged++;
        }

        while (l < subArrayRightLength) {
            array[merged] = subArrayRight[r];
            r++;
            merged++;
        }
    }
}
