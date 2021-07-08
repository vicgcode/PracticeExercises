package com.company.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CubicEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's find coefficients of cubic equation ax^3+bx^2+cx+d=0" + "\n" +
                "Enter the equation coefficients: a, b, c, d");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        for (Integer result : calc(a, b, c, d)) {
            System.out.println(result);
        }
    }

    /**
     * Implementation of Horner's method
     */
    public static List<Integer> calc(double a, double b, double c, double d) {
        List<Integer> dividers = new ArrayList<>();
        List<Integer> roots = new ArrayList<>();
        for (int i = 1; i <= Math.abs(d); i++) {
            if (Math.abs(d) % i == 0) {
                dividers.add(i);
                dividers.add(-i);
            }
        }
        for (int possibleRoot : dividers) {
            double temp = a * Math.pow(possibleRoot, 3) + b * Math.pow(possibleRoot, 2) + c * possibleRoot + d;
            if (temp == 0.0) {
                roots.add(possibleRoot);
            }
        }
        return roots;
    }
}
