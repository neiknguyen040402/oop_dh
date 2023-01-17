package com.hus.homework2;

import java.util.Scanner;

public class LengthOfNumberSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("S(" + i + ") = " + toString(i) + " length is: " + length(i));
        }
    }

    public static String toString(int number) {
        String str = "";
        for (int i = 1; i <= number; i++) {
            str = str.concat(String.valueOf(i));
        }
        return str;
    }

    public static int numOfDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int length(int number) {
        if (number == 1) {
            return 1;
        }
        return length(number - 1) + numOfDigits(number);
    }
}
