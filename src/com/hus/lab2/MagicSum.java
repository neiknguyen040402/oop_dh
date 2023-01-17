package com.hus.lab2;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SENTINEL = -1;
        System.out.print("Enter a positive integer (or -1 to end): ");
        int number = in.nextInt();
        int sum = 0;
        while (number != SENTINEL) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }
        System.out.println("The magic sum is: " + sum);
    }

    public static boolean hasEight(int number) {
        while (number > 0) {
            if (number % 10 == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
