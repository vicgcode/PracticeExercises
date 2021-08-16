package com.company.sorts;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] test = {1, 1500, -2, 700, 57, 80, 22, 45, 90, -45};
        int[] result = sort(test, 0, test.length - 1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] array, int begin, int end) {
        if (begin >= end) {
            return array;
        }
        int partitionIndex = partition(array, begin, end);
        array = sort(array, begin, partitionIndex - 1);
        array = sort(array, partitionIndex, end);
        return array;
    }

    public static int partition(int[] array, int begin, int end) {
        int pivot = array[begin + (end - begin) / 2];
        while (begin <= end) {
            while (array[begin] < pivot) {
                begin++;
            }
            while (array[end] > pivot) {
                end--;
            }

            if (begin <= end) {
                int temp = array[begin];
                array[begin] = array[end];
                array[end] = temp;
                begin++;
                end--;
            }
        }
        return begin;
    }
}
