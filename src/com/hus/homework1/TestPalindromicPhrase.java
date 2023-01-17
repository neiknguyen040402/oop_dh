package com.hus.homework1;

import java.util.Scanner;

public class TestPalindromicPhrase {

    public static void main(String[] args) {
        isPalindromicPhrase("Madam, I'm Adam");
        isPalindromicPhrase("A man, a plan, a canal - Panama!");

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a phrase to test it for palindromic: ");
        String phrase = in.nextLine();
        isPalindromicPhrase(phrase);
    }

    public static void isPalindromicPhrase(String phrase) {
        String phraseLeftToRight = sanitizeString(phrase);
        String phraseRightToLeft = "";
        for (int i = phraseLeftToRight.length() - 1; i >= 0; i--) {
            phraseRightToLeft += phraseLeftToRight.charAt(i);
        }

        if (phraseLeftToRight.toLowerCase().equals(phraseRightToLeft.toLowerCase())) {
            System.out.printf("\"%1$s\" is a palindrome.\n", phrase);
        } else {
            System.out.printf("\"%1$s\" is not a palindrome.\n", phrase);
        }
    }

    public static String sanitizeString(String inStr) {
        String str = "";
        for (int i = 0; i < inStr.length(); i++) {
            switch (inStr.charAt(i)) {
                case '.':
                case ',':
                case ' ':
                case '-':
                case '\'':
                case '!':
                case '?':
                    break;
                default:
                    str += inStr.charAt(i);
                    break;
            }
        }
        return str;
    }
}

