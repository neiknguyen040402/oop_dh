package com.hus.homework1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = in.next();
        int inStrLen = inStr.length();
        System.out.print("The reverse of the String " + inStr + " is ");
        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
            System.out.print(inStr.charAt(charIdx));
        }
        System.out.println();
    }
}
