package com.company.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Speeds {
    public static void main(String[] args) {
        int[] array = new int[100000];
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Measure the execution time of an array:");
        measureTimeOfArray(array);
        System.out.println("Measure the execution time of an ArrayList:");
        measureTimeOfList(arrayList);
        System.out.println("Measure the execution time of an LinkedList:");
        measureTimeOfList(linkedList);
    }

    public static void measureTimeOfArray(int[] array) {
        System.out.println("Fill: " + fill(array));
        System.out.println("Read elements: " + get(array));
    }

    public static void measureTimeOfList(List<Integer> list) {
        System.out.println("Fill: " + fill(list));
        System.out.println("Add to the beginning: " + addWithShift(list));
        System.out.println("Read elements: " + get(list));
    }

    public static long fill(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long fill(int[] array) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            array[i] = i;
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }


    public static long addWithShift(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long get(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long get(int[] array) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int temp = array[i];
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
