package com.company.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Speeds {
    public static void main(String[] args) {
        int[] array = new int[1000000];
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Fill an array");
        fill(array);
        System.out.println("Fill an ArrayList");
        fill(arrayList);
        System.out.println("Fill a LinkedList");
        fill(linkedList);
        System.out.println("Add in center of array");
        add(array);
        System.out.println("Add in center of ArrayList");
        add(arrayList);
        System.out.println("Add in center of LinkedList");
        add(linkedList);

    }

    public static void fill(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Done! Execution time: " + (finish - start));
    }

    public static void fill(int[] array) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            array[i] = i;
        }
        long finish = System.currentTimeMillis();
        System.out.println("Done! Execution time: " + (finish - start));
    }


    public static void add(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 500000; i < 1000000; i++) {
            list.add(i + i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Done! Execution time: " + (finish - start));
    }

    public static void add(int[] array) {
        long start = System.currentTimeMillis();
        for (int i = 500000; i < 1000000; i++) {
            array[i] = i + i;
        }
        long finish = System.currentTimeMillis();
        System.out.println("Done! Execution time: " + (finish - start));
    }

}
