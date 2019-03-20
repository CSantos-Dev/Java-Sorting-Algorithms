package algorithms.sorting;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Implementation of Heap Sort algorithm.
 *
 * This algorithm makes uses of the heap structure to sort the elements in ASC order.
 * In this case, the built-in {@link PriorityQueue} from JDK is used. For a simple custom
 * min-heap implementation, check -> https://github.com/CSantos-Dev/Java-Data-Structures
 *
 * @author csantos
 */
public class HeapSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        PriorityQueue<Integer> intHeap = new PriorityQueue<>();
        Arrays.stream(array).forEach(intHeap::add);

        for (int i = 0; i < array.length; i++) {
            array[i] = intHeap.poll();
        }
    }
}
