package com.company.strings;

import java.util.Scanner;

/**
 * Write a program that finds the frequency of occurrences of a substring in a given string.
 *
 * The first input line contains a string, the second one contains a substring.
 */

public class SubstringFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String main = scanner.nextLine();
        String sub = scanner.nextLine();
        System.out.println(calcSubstringFrequency(main, sub));
    }

    public static int calcSubstringFrequency(String main, String sub) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder(main);
        while (true) {
            int index = stringBuilder.indexOf(sub);
            if (index != -1) {
                stringBuilder.delete(index, index + sub.length());
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
