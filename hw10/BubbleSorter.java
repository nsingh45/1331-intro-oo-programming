/**
 * Implements a Bubble Sort algorithm to sort an array
 * @author Neha
 * @version 1.0
 */
public class BubbleSorter extends AbstractSorter {
    /**
     * Constructor: Creates a new Bubblesort object and
     * passes the parent class an array of Comparable objects
     * @param toSort, the array to be sorted
     */
    public BubbleSorter(Comparable[] toSort) {
        super(toSort);
    }
    /**
     * Sorts the array, swapping each pair of objects in the array so that
     * smaller elements move left and larger elements move right
     */
    public void sortArray() {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i <= array.length - 1; i++) {
                if (((array[i - 1]).compareTo(array[i])) > 0) {
                    swap(i - 1, i);
                    swapped = true;
                }
            }
        }
    }

}
