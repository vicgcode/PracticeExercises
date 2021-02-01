package com.company.math;

import java.util.Scanner;

public class Heron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println(calcAreaTriangle(a, b, c));
    }

    /**
     * @param a side length of triangle
     * @param b side length of triangle
     * @param c side length of triangle
     * @return area of triangle
     */
    public static double calcAreaTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
