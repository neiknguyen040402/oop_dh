package com.hus.homework1;

import java.util.Scanner;
public class TestPalindromic {
    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int strLen = clean.length();
        int fIdx = 0;
        int  bIdx = strLen - 1;
        while (bIdx > fIdx) {
            char forwardChar = clean.charAt(fIdx);
            fIdx++;
            char backwardChar = clean.charAt(bIdx);
            bIdx--;
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inStr = in.next();
        if (isPalindrome(inStr)) {
            System.out.println(inStr + " is a palindrome");
        } else {
            System.out.println(inStr + " isn't a palindrome");
        }
    }
}




























































































































