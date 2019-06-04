/**
 * Implements an Insertion Sort algorithm to sort an array
 * @author Neha
 * @version 1.0
 */
public class InsertionSorter extends AbstractSorter {
    /**
     * Constructor: Creates a new InsertionSort object and passes
     * the parent class an array of Comparable objects
     * @param toSort, the array to be sorted
     */
    public InsertionSorter(Comparable[] toSort) {
        super(toSort);
    }
    /**
     * Sorts the array: Takes each element in sequence and inserts it after an
     * element smaller than it; continues until the array is sorted
     */
    public void sortArray() {
        int j;
        for (int i = 1; i <= array.length - 1; i++) {
            j = i;
            while ((j > 0) && (array[j - 1].compareTo(array[j])) > 0) {
                swap(j, j - 1);
                j--;
            }
        }
    }

}
