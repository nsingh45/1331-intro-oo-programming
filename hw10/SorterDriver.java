
public class SorterDriver {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 14;
        arr[3] = 2;
        arr[4] = 8;
        SelectionSorter ss = new SelectionSorter(arr);
        ss.sortArray();
    }
}
