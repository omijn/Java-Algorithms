package ca64e38588534b9b6bd47e850522dee2.algorithms.search;

import java.util.Arrays;

/**
 * Created by omijn on 5/17/18.
 */
public class BinarySearch {

    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
        sort();
    }

    private void sort() {
        Arrays.sort(array);
    }

    public int search(int element) {
        int mid, high, low, found;
        low = 0;
        high = array.length - 1;
        found = -1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (element < array[mid]) {
                high = mid - 1;
            } else if (element > array[mid]) {
                low = mid + 1;
            } else {
                found = mid;
                break;
            }
        }

        return found;
    }
}
