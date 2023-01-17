package com.hus.homework2;

public class FactorialInt {
    public static void main(String[] args) {
        //printFactorialLong();
        printFactorialInt();
    }

    public static void printFactorialInt() {
        int i = 1;
        int fact = 1;
        while (true) {
            fact *= i;
            System.out.println("The factorial of " + i + " is " + fact);
            i++;
            if (Integer.MAX_VALUE / fact < i + 1) {
                System.out.println("The factorial of " + i + " is out of range");
                break;
            }
        }
    }

    public static void printFactorialLong() {
        int i = 1;
        long fact = 1;
        while (true) {
            fact *= i;
            System.out.println("The factorial of " + i + " is " + fact);
            i++;
            if (Long.MAX_VALUE / fact < i + 1) {
                System.out.println("The factorial of " + i + " is out of range");
                break;
            }
        }
    }
}
