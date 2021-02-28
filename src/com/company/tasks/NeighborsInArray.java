package com.company.tasks;

import java.util.Scanner;

public class NeighborsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(isNeighbors(array, n, m));
    }

    /**
     * @return true if n and m occur next to each other in array; otherwise, return false
     */
    public static boolean isNeighbors(int[] array, int n, int m) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == n && array[i] == m || array[i - 1] == m && array[i] == n) {
                return true;
            }
        }
        return false;
    }
}
