package ca64e38588534b9b6bd47e850522dee2.algorithms.misc;

import ca64e38588534b9b6bd47e850522dee2.algorithms.search.BinarySearch;

/**
 * Created by omijn on 5/17/18.
 */
public class ThreeSum {

    private int[] array;
    private BinarySearch bs;

    public ThreeSum(int[] array) {
        this.array = array;
    }

    public int simpleSolution() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public int optimizedSolution() {
        bs = new BinarySearch(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int inverseElement = -1 * (array[i] + array[j]);
                if (bs.search(inverseElement) != -1 && (array[i] < array[j] && array[j] < inverseElement)) {
                    count++;
                }
            }
        }

        return count;
    }

}
