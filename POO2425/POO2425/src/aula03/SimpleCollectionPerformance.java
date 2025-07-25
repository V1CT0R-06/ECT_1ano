package aula03;

import java.util.*;

public class SimpleCollectionPerformance {
    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 20000, 40000, 100000};

        // Collections to test
        List<Collection<Integer>> collections = Arrays.asList(
            new ArrayList<>(),
            new LinkedList<>(),
            new HashSet<>(),
            new TreeSet<>()
        );

        for (Collection<Integer> col : collections) {
            System.out.println("Testing " + col.getClass().getSimpleName());
            for (int size : sizes) {
                System.out.println("Size: " + size);
                testPerformance(col, size);
                System.out.println();
            }
        }
    }

    private static void testPerformance(Collection<Integer> col, int size) {
        double start, stop, delta;

        // Add elements
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            col.add(i);
        }
        stop = System.nanoTime();
        delta = (stop - start) / 1e6;
        System.out.println("Add: " + delta + " ms");

        // Search for an element
        start = System.nanoTime();
        col.contains(size / 2);
        stop = System.nanoTime();
        delta = (stop - start) / 1e6;
        System.out.println("Search: " + delta + " ms");

        // Remove elements
        start = System.nanoTime();
        col.clear();
        stop = System.nanoTime();
        delta = (stop - start) / 1e6;
        System.out.println("Remove: " + delta + " ms");
    }
}

