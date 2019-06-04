/**
 * An object meant to wrap and sort an array of Comparable objects.
 *
 * Subclasses should provide implementations of the sortArray() method.
 *
 * @author Matt
 * @version 1.0
 */
public abstract class AbstractSorter {

    protected Comparable[] array;

    /**
     * Constructs a new Sorter, wrapping the given Comparable array.
     *
     * @param Comparable[] the array we will sort
     */
    public AbstractSorter(Comparable[] arr) {
        this.array = arr;
    }

    /**
     * Sorts the array stored in the instance variable array.
     */
    public abstract void sortArray();

    /**
     * Returns the array in whatever state it is presently in.
     */
    public Comparable[] getArray() {
        return array;
    }
    /**
     * Swaps two elements in the array
     * @param posA, the position of the first element to be swapped
     * @param posB, the position of the second element to be swapped
     */
    public void swap(int posA, int posB) {
        Comparable c = array[posA];
        array[posA] = array[posB];
        array[posB] = c;
    }
}
