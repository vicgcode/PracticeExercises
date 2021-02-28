package com.company.tasks;

import java.util.Scanner;

public class VowelOrNot {
    public static boolean isVowel(char ch) {
        char[] vowels = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
        boolean isVowel = false;
        for (int i : vowels) {
            isVowel = i == ch;
            if (isVowel)
                break;
        }
        return isVowel;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
