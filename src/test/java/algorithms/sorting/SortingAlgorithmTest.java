package algorithms.sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for different sorting algorithm implementations
 *
 * @author csantos
 */
public class SortingAlgorithmTest {

    private int[] numbersOne;
    private int[] numbersTwo;

    private SortingAlgorithm bubbleSort = new BubbleSort();
    private SortingAlgorithm selectionSort = new SelectionSort();
    private SortingAlgorithm insertionSort = new InsertionSort();
    private SortingAlgorithm mergeSort = new MergeSort();
    private SortingAlgorithm quickSort = new QuickSort();

    @Before
    public void initialize() {
        numbersOne = new int[] {5, 2, 1, 10};
        numbersTwo = new int[] {1, 2, 4, 4, -8, 0, 15, 90, 102};
    }

    @Test
    public void bubbleSort() {
        bubbleSort.sort(numbersOne);
        bubbleSort.sort(numbersTwo);

        assertNumbersOneIsSorted(numbersOne);
        assertNumbersTwoIsSorted(numbersTwo);
    }

    @Test
    public void selectionSort() {
        selectionSort.sort(numbersOne);
        selectionSort.sort(numbersTwo);

        assertNumbersOneIsSorted(numbersOne);
        assertNumbersTwoIsSorted(numbersTwo);
    }

    @Test
    public void insertionSort() {
        insertionSort.sort(numbersOne);
        insertionSort.sort(numbersTwo);

        assertNumbersOneIsSorted(numbersOne);
        assertNumbersTwoIsSorted(numbersTwo);
    }

    @Test
    public void mergeSort() {
        mergeSort.sort(numbersOne);
        mergeSort.sort(numbersTwo);

        assertNumbersOneIsSorted(numbersOne);
        assertNumbersTwoIsSorted(numbersTwo);
    }

    @Test
    public void quickSort() {
        quickSort.sort(numbersOne);
        quickSort.sort(numbersTwo);

        assertNumbersOneIsSorted(numbersOne);
        assertNumbersTwoIsSorted(numbersTwo);
    }

    private void assertNumbersOneIsSorted(int[] numbers) {
        assertEquals(1, numbers[0]);
        assertEquals(2, numbers[1]);
        assertEquals(5, numbers[2]);
        assertEquals(10, numbers[3]);
    }

    private void assertNumbersTwoIsSorted(int[] numbers) {
        assertEquals(-8, numbers[0]);
        assertEquals(0, numbers[1]);
        assertEquals(1, numbers[2]);
        assertEquals(2, numbers[3]);
        assertEquals(4, numbers[4]);
        assertEquals(4, numbers[5]);
        assertEquals(15, numbers[6]);
        assertEquals(90, numbers[7]);
        assertEquals(102, numbers[8]);
    }
}
