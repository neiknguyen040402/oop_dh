package com.hus.lab1;

/**
 * Compute the sum and average of running integers from a lowerbound to
 * an upperbound using loop.
 */
public class SumAverageRunningInt {
    public static void main(String[] args) {
        calculateUsingFor();
//        calculateUsingWhileLoop();
//        calculateUsingDoWhileLoop();
        calculateUsingCount();
        calculateSumSquare();
        calculateTry6();
    }

    public static void calculateUsingFor() {
        int sum = 0;    //The accumulated sum, init to 0
        double average;
        final int LOEWRBOUND = 1;
        final int UPPERBOUND = 100;

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = LOEWRBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 100
            sum += number;  // same as "sum = sum + number"
        }
        average = sum / UPPERBOUND;

        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average);
    }

    public static void calculateUsingWhileLoop() {
        int sum = 0;    //The accumulated sum, init to 0
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            sum += number;
            ++number;
        }
        average = sum / UPPERBOUND;
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average);
    }

    public static void calculateUsingDoWhileLoop() {
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int sum = 0;
        int number = LOWERBOUND;
        do {
            sum += number;
            ++number;
        } while (number <= UPPERBOUND);
        average = sum / UPPERBOUND;
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average);
    }

    public static void calculateUsingCount() {
        double average;
        final int LOWERBOUND = 111;
        final int UPPERBOUND = 8899;
        int count = 0;
        int sum = 0;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
            ++count;
        }
        average = sum / count;
        System.out.println("The sum of 111 to 8899 is " + sum);
        System.out.println("The average is " + average);
    }

    public static void calculateSumSquare() {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        int sumSquares = 0;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sumSquares += number * number;
        }
        System.out.println("The sum of the square of all the numbers from 1 to 100 is " + sumSquares);
    }

    public static void calculateTry6() {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            if (number % 2 == 1) {
                sumOdd += number;
            } else {
                sumEven += number;
            }
        }
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }

        System.out.println("sum of even numbers is " + sumEven);
        System.out.println("sum of odd numbers is " + sumOdd);
        System.out.println("their absolute difference is " + absDiff);
    }
}



