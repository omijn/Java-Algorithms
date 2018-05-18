package ca64e38588534b9b6bd47e850522dee2.algorithms;

import ca64e38588534b9b6bd47e850522dee2.algorithms.misc.*;
import ca64e38588534b9b6bd47e850522dee2.algorithms.search.BinarySearch;

import java.util.Scanner;

public class Main {
    private static int[] getIntArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

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

    private static void binarySearch() {
        int[] array = getIntArray();
        BinarySearch bs = new BinarySearch(array);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an element to search for: ");
        int element = scanner.nextInt();

        int pos = bs.search(element);
        if (pos == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at position " + pos);
        }

    }

    public static void main(String[] args) {
//        System.out.println("Running unionFindQuickFind.");  unionFindQuickFind();
//        System.out.println("Running unionFindQuickUnion."); unionFindQuickUnion();
        System.out.println("Running binarySearch."); binarySearch();

    }
}
