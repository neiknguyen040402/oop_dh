package com.hus.homework2;

import java.util.Scanner;

public class GCDExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number to find GCD: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number to find GCD: ");
        int number2 = scanner.nextInt();

        System.out.println("GCD of two numbers " + number1 + " and "
                + number2 + " is :" + findGCD(number1, number2));
    }
    public static int findGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return findGCD(number2, number1 % number2);
    }
}