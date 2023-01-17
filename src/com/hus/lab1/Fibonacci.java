package com.hus.lab1;

public class Fibonacci {
    public static void main(String[] args) {
        printFiboncci(12);
        printTribonacci(12);
    }

    public static void printFiboncci(int number) {
        long fb1 = 1;
        long fb2 = 1;
        long fbn;
        long sum = 0;

        if (number <= 0) {
            System.out.println("Please correct number of items and try again.");
            return;
        }

        System.out.println("The first " + number + " Fibonacci numbers are:");
        System.out.print(fb1 + " " + fb2 + " ");
        for (int i = 3; i <= number; i++) {
            fbn = fb1 + fb2;
            fb1 = fb2;
            fb2 = fbn;
            sum += fbn;

            System.out.print(fbn + " ");
        }
        System.out.println();
        System.out.printf("The sum is %1$d \n", sum);
        System.out.printf("The average is %.4f \n", (double) sum / number);
    }

    public static void printTribonacci(int number) {
        long tb1 = 1;
        long tb2 = 1;
        long tb3 = 2;
        long tbn;
        long sum = 0;

        if (number <= 0) {
            System.out.println("Please correct number of items and try again.");
            return;
        }

        System.out.println("The first " + number + " Tribonacci numbers are:");
        System.out.print(tb1 + " " + tb2 + " " + tb3 + " ");
        for (int i = 4; i <= number; i++) {
            tbn = tb1 + tb2 + tb3;
            tb1 = tb2;
            tb2 = tb3;
            tb3 = tbn;
            sum += tbn;

            System.out.print(tbn + " ");
        }
        System.out.println();
        System.out.printf("The average is %.4f \n", (double) sum / number);
    }
}
