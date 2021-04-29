package com.company.tasks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Implement a method that checks for the correct sequence of brackets.
 * There are 3 kinds of brackets: (), [], {}.
 */

public class CorrectBracketSequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringToCheck = scanner.nextLine();
        if (isCorrect(stringToCheck))
            System.out.println("the bracket sequence is correct");
        else
            System.out.println("the bracket sequence isn't correct");
    }

    public static boolean isCorrect(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);

            if (current==')' || current==']' || current=='}') {
                if (stack.empty()) {
                    return false;
                } else {
                    switch (current) {
                        case ')':
                            if (stack.peek() == '(')
                                stack.pop();
                            break;
                        case ']':
                            if (stack.peek() == '[')
                                stack.pop();
                            break;
                        case '}':
                            if (stack.peek() == '{')
                                stack.pop();
                            break;
                        default:
                            return false;
                    }
                }
            } else if (current=='(' || current=='[' || current=='{') {
                stack.push(current);
            }
        }
        return stack.empty();
    }
}
