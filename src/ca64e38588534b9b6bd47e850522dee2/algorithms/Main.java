package ca64e38588534b9b6bd47e850522dee2.algorithms;

import ca64e38588534b9b6bd47e850522dee2.algorithms.misc.*;

import java.util.Scanner;

public class Main {

    private static void unionFindQuickFind() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        UnionFindQuickFind uf = new UnionFindQuickFind(N);

        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();

            if (!uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println(p + " joined to " + q);
            } else {
                System.out.println(p + " and " + q + " are already connected");
            }
        }
    }

    private static void unionFindQuickUnion() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        UnionFindQuickUnion uf = new UnionFindQuickUnion(N);

        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();

            if (!uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println(p + " joined to " + q);
            } else {
                System.out.println(p + " and " + q + " are already connected");
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println("Running unionFindQuickFind.");  unionFindQuickFind();
        System.out.println("Running unionFindQuickUnion."); unionFindQuickUnion();

    }
}
