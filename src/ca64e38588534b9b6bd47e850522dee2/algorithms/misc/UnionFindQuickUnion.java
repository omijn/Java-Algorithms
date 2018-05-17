package ca64e38588534b9b6bd47e850522dee2.algorithms.misc;

/**
 * Created by omijn on 5/17/18.
 */
public class UnionFindQuickUnion {

    private int[] id;

    public UnionFindQuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        int pRoot = findRoot(p);
        int qRoot = findRoot(q);
        if (pRoot == qRoot) {
            return true;
        } else {
            return false;
        }
    }

    public void union(int p, int q) {
        // find the root of p and set its parent to be root of q
        int pRoot = findRoot(p);
        int qRoot = findRoot(q);
        id[pRoot] = qRoot;
    }

    private int findRoot(int element) {
        int root = element;
        while (id[root] != root) {
            root = id[root];
        }

        return root;
    }

    private void displayArray() {
        for (int element : id) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
