package org.collections;
import java.util.List;

public class ListPerformanceTester {

    public long testAdd(List<Integer> list, int iterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long testGet(List<Integer> list, int iterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.get(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long testRemove(List<Integer> list, int iterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.remove(0);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
