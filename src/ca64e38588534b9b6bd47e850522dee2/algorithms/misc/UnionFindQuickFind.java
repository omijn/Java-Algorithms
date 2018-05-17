package ca64e38588534b9b6bd47e850522dee2.algorithms.misc;

/**
 * Created by omijn on 5/13/18.
 */
public class UnionFindQuickFind {

    private int[] id;

    public UnionFindQuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int element1Index, int element2Index) {
        return id[element1Index] == id[element2Index];  // quickfind
    }

    public void union(int element1Index, int element2Index) {

        int componentIdOfElement1 = id[element1Index];
        int componentIdOfElement2 = id[element2Index];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == componentIdOfElement1) {
                id[i] = componentIdOfElement2;
            }
        }
    }

}
