/**
 * Implements a Selection Sort algorithm to sort an array
 * @author Neha
 * @version 1.0
 */
public class SelectionSorter extends AbstractSorter {
    /**
     * Constructor: Creates a new SelectionSort object and
     * passes the parent class an array of Comparable objects
     * @param toSort, the array to be sorted
     */
    public SelectionSorter(Comparable[] toSort) {
        super(toSort);
    }
    /**
     * Sorts the array: finds the minimum element, puts it at the beginning
     * of the array, looks for the next smallest element in the remainder
     * of the array, and repeats the process until the array is sorted
     */
    public void sortArray() {
        for (int i = 0; i <= array.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j <= array.length - 1; j++) {
                if ((array[minIndex].compareTo(array[j])) > 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(minIndex, i);
            }
        }
    }

}
