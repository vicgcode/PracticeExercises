package com.company.arrays;

import java.util.Scanner;

/**
 * Implement a method to fill a two-dimensional array with values.
 * Given the number n, not greater than 100.
 * Create the matrix of size n×n.
 * Numbers 0 should be stored on the primary (main) diagonal.
 * The two diagonals, adjacent to the primary one, should contain numbers 1.
 * The next two diagonals should contain numbers 2. Etc
 */

class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = fillMatrix(n);
        printMatrix(array);
    }

    public static int[][] fillMatrix(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            int[] arrayInside = array[i];
            for (int j = 0; j < arrayInside.length; j++) {
                arrayInside[j] = Math.abs(i - j);
            }
        }
        return array;
    }

    public static void printMatrix(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}