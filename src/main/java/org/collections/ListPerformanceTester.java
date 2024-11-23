package org.collections;

import java.util.List;

/**
 * A class for testing the performance of various list operations.
 */
public class ListPerformanceTester {

    /**
     * Tests the performance of adding elements to a list.
     *
     * @param list       the list to which elements will be added.
     * @param iterations the number of iterations for adding elements.
     * @return the time taken to perform the add operation in nanoseconds.
     */
    public long testAdd(List<Integer> list, int iterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * Tests the performance of getting elements from a list.
     *
     * @param list       the list from which elements will be retrieved.
     * @param iterations the number of iterations for retrieving elements.
     * @return the time taken to perform the get operation in nanoseconds.
     */
    public long testGet(List<Integer> list, int iterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.get(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * Tests the performance of removing elements from a list.
     *
     * @param list       the list from which elements will be removed.
     * @param iterations the number of iterations for removing elements.
     * @return the time taken to perform the remove operation in nanoseconds.
     */
    public long testRemove(List<Integer> list, int iterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.remove(0);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
