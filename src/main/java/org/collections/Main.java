package org.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int iterations = 1000;
        ListPerformanceTester tester = new ListPerformanceTester();

        List<Integer> arrayList = new ArrayList<>();
        long arrayListAddTime = tester.testAdd(arrayList, iterations);
        long arrayListGetTime = tester.testGet(arrayList, iterations);
        arrayList = new ArrayList<>(); // Сброс списка для теста remove
        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
        }
        long arrayListRemoveTime = tester.testRemove(arrayList, iterations);

        List<Integer> linkedList = new LinkedList<>();
        long linkedListAddTime = tester.testAdd(linkedList, iterations);
        long linkedListGetTime = tester.testGet(linkedList, iterations);
        linkedList = new LinkedList<>();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(i);
        }
        long linkedListRemoveTime = tester.testRemove(linkedList, iterations);

        System.out.println("Метод\t\tКоллекция\tКоличество выполнений\tВремя выполнения (нс)");
        System.out.println("add\t\t\tArrayList\t" + iterations + "\t\t\t\t\t" + arrayListAddTime);
        System.out.println("get\t\t\tArrayList\t" + iterations + "\t\t\t\t\t" + arrayListGetTime);
        System.out.println("remove\t\tArrayList\t" + iterations + "\t\t\t\t\t" + arrayListRemoveTime);
        System.out.println("add\t\t\tLinkedList\t" + iterations + "\t\t\t\t\t" + linkedListAddTime);
        System.out.println("get\t\t\tLinkedList\t" + iterations + "\t\t\t\t\t" + linkedListGetTime);
        System.out.println("remove\t\tLinkedList\t" + iterations + "\t\t\t\t\t" + linkedListRemoveTime);
    }
}
