package com.company.math;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's find coefficients of quadratic equation ax^2+bx+c=0" + "\n" +
                "Enter the equation coefficients: a, b, c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println(calc(a, b, c));
    }

    public static String  calc(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - 4.0 * a * c;
        if (0.0 < discriminant) {
            double root1 = (- b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (- b - Math.sqrt(discriminant)) / (2 * a);
            return "The 1st root is: " + root1 + ", The 2nd root is: " + root2;
        } if (0.0 == discriminant) {
            double root = - b / (2 * a);
            return "The root is: " + root;
        } else {
            return "There are no real roots";
        }
    }
}
