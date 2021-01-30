package com.company;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Implement a method to compute the double factorial.
 * It is the product of natural numbers of the same parity, not exceeding a given number.
 * For example:
 * 7!!=7⋅5⋅3⋅1
 * 8!!=8⋅6⋅4⋅2
 *
 * The function argument can be any non-negative integer.
 */

class DoubleFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calcDoubleFactorial(scanner.nextInt()));
    }

    public static BigInteger calcDoubleFactorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        boolean isEven = n % 2 == 0 ? true : false;
        BigInteger a = BigInteger.valueOf(n);
        if (isEven) {
            return calcEvenDoubleFactorial(a);
        } else {
            return calcOddDoubleFactorial(a);
        }
    }

    public static BigInteger calcEvenDoubleFactorial(BigInteger n) {
        int res = n.compareTo(BigInteger.TWO);
        if (res == 0 || res == -1) {
            return BigInteger.TWO;
        } else {
            return n.multiply(calcEvenDoubleFactorial(n.subtract(BigInteger.TWO)));
        }
    }

    public static BigInteger calcOddDoubleFactorial(BigInteger n) {
        int res = n.compareTo(BigInteger.ONE);
        if (res == 0 || res == -1) {
            return BigInteger.ONE;
        } else {
            return n.multiply(calcOddDoubleFactorial(n.subtract(BigInteger.TWO)));
        }
    }
}
