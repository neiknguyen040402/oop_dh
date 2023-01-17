package com.hus.homework1;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = in.next();
        String testStr = inStr.toLowerCase();
        int countVowels = 0;
        int countDigits = 0;
        for (int charIdx = 0; charIdx < testStr.length(); charIdx++) {
            if (testStr.charAt(charIdx) == 'a' || testStr.charAt(charIdx) == 'e' || testStr.charAt(charIdx) == 'i'
                    || testStr.charAt(charIdx) == 'o' || testStr.charAt(charIdx) == 'u') {
                countVowels++;
            }
        }
        System.out.printf("Number of vowels: %d (%.2f%%)\n", countVowels, countVowels * 100 / (double) testStr.length());

        for (int charIdx = 0; charIdx < testStr.length(); charIdx++) {
            if (Character.isDigit(testStr.charAt(charIdx))) {
                countDigits++;
            }
        }
        System.out.printf("Number of gidits: %d (%.2f%%)\n", countDigits, countDigits * 100 / (double) testStr.length());

    }
}
