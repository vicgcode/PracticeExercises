package com.company.random;

import java.util.Random;
import java.util.Scanner;

/**
 * You are given three numbers: n, a and b.
 *
 * Your task is to output the sum of the first n random numbers in a range from a to b inclusively.
 * The seed of the generator should be set as a + b.
 *
 * The input contains numbers: n, a, b.
 */

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sumRandom(n, a, b));
    }

    /**
     * @param n number of random numbers
     * @param a start of range
     * @param b end of range
     * @return sum of random numbers in range
     */
    public static int sumRandom(int n, int a,  int b) {
        Random random = new Random(a + b);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += random.nextInt(b - a + 1) + a;
        }
        return sum;
    }
}
