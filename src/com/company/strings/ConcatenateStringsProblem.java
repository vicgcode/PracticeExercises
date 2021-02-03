package com.company.strings;

import java.util.Scanner;

/**
 * Implement a method to concatenate all strings from the given array to a single long string.
 * You must skip all digits inside the input strings.
 *
 * Use StringBuilder to solve the problem
 */

class ConcatenateStringsProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        System.out.println(concatenateStringsWithoutDigits(strings));
    }

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder sb = new StringBuilder();
        StringBuilder[] sbArray = new StringBuilder[strings.length];
        for (int i = 0; i < sbArray.length; i++) {
            sbArray[i] = new StringBuilder(strings[i]);
            for (int j = 0; j < sbArray[i].length(); ) {
                if (Character.isDigit(sbArray[i].charAt(j))) {
                    sbArray[i].deleteCharAt(j);
                } else {
                    j++;
                }
            }
            sb.append(sbArray[i]);
        }
        return sb.toString();
    }
}
