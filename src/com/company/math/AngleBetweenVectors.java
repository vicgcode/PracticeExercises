package com.company.math;

import java.util.Scanner;

/**
 * You are given two 2D vectors. Find the angle (in degrees) between them.
 * Input data: two components of each vector.
 *
 * Calculate scalar product by vector
 * Calculate the length of the first vector
 * Calculate the length of the second vector
 * Calculate the product of vector lengths
 * Divide the scalar product of vectors by the product of vector lengths
 */

public class AngleBetweenVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double u1 = scanner.nextDouble();
        double u2 = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double v2 = scanner.nextDouble();
        System.out.println(calcAngle(u1, u2, v1, v2));
    }

    /**
     * @param u1 component of first vector
     * @param u2 component of first vector
     * @param v1 component of second vector
     * @param v2 component of second vector
     * @return angle between two vectors
     */
    public static double calcAngle(double u1, double u2, double v1, double v2) {
        double scalarProduct = u1 * v1 + u2 * v2;
        double firstVectorLength = Math.sqrt(Math.pow(u1, 2) + Math.pow(u2, 2));
        double secVectorLength = Math.sqrt(Math.pow(v1, 2) + Math.pow(v2, 2));
        return Math.toDegrees(Math.acos(scalarProduct / (firstVectorLength * secVectorLength)));
    }
}
