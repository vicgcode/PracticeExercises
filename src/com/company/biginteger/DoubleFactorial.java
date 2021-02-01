package com.company.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Implement a method to compute the double factorial.
 * It is the product of natural numbers of the same parity, not exceeding a given number.
 * For example:
 * 7!!=7⋅5⋅3⋅1
 * 8!!=8⋅6⋅4⋅2
 *
 * The method calcDoubleFactorial() argument can be any non-negative integer.
 */

class DoubleFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calcDoubleFactorial(scanner.nextBigInteger()));
    }

    public static BigInteger calcDoubleFactorial(BigInteger number) {
        int res = number.compareTo(BigInteger.ONE);
        if (res == 0 || res == -1) {
            return BigInteger.ONE;
        } else {
            return number.multiply(calcDoubleFactorial(number.subtract(BigInteger.TWO)));
        }
    }
}
