package com.company.sorts;

import java.util.Arrays;

public class SimpleSorts {
    public static void main(String[] args) {
        int[] test = {1,1500, -2, 700, 57, 80, 22, 45, 90, -45};
        System.out.println("Bubble sort: " + Arrays.toString(bubbleSort(test)));
        System.out.println("Insertion sort: " + Arrays.toString(insertionSort(test)));
        System.out.println("Selection sort: " + Arrays.toString(selectionSort(test)));
    }

    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minID = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minID = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minID] = temp;
        }
        return array;
    }
}
