package org.example;

import java.util.Stack;

public class Main {

    public static boolean checkForPalindrome(String text) {
        Stack<Character> stack = new Stack<>();
        String cleanedText = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                cleanedText += Character.toLowerCase(ch);
            }
        }

        for (int i = 0; i < cleanedText.length(); i++) {
            stack.push(cleanedText.charAt(i));
        }

        for (int i = 0; i < cleanedText.length(); i++) {
            if (cleanedText.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static String convertDecimalToBinary(int number) {
        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }

        String result = "";

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}