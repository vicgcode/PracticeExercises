package com.company.random;

import java.util.Random;
import java.util.Scanner;

/**
 * For the given numbers K, N, and M
 * find the first seed that is greater than or equal to K
 * where each of N Gaussian numbers is less than or equal to M.
 *
 * The input contains numbers K, N, M.
 *
 * You should output the seed.
 */

public class GaussianRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        System.out.println(getSeed(k, n, m));
    }

    /**
     * @param k seed up
     * @param n number of Gaussian numbers
     * @param m ceiling of numbers
     * @return seed
     */
    public static int getSeed(int k, int n, double m) {
        while (true) {
            Random random = new Random(k);
            int count = 0;
            for (int i = 0; i < n; i++) {
                double number = random.nextGaussian();
                if (number >= m) {
                    break;
                } else {
                    count++;
                }
            }
            if (count == n) {
                break;
            } else {
                k++;
            }
        }
        return k;
    }
}
