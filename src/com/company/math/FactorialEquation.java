package com.company.math;

import java.util.Scanner;

public class FactorialEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I can solve that!\n" +
                "1 + (1/2!) + (1/3!) + (1/4!) + ... + (1/n!)\n" +
                "Enter n:");
        int numberForEquation = scanner.nextInt();
        System.out.println(solveEquation(numberForEquation));
    }

    /**
     * Implement a method that finds a solution to the equation:
     * 1 + (1/2!) + (1/3!) + (1/4!) + ... + (1/n!)
     */
    public static double solveEquation(int n) {
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result += (double) 1/factorize(i);
        }
        return result;
    }

    public static long factorize(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorize(n - 1);
    }
}
