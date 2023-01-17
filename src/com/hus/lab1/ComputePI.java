package com.hus.lab1;

public class ComputePI {
    public static void main(String[] args) {
        computePIDenominator();
        System.out.println();
        computePITerm();
    }

    public static void computePIDenominator() {
        double sum = 0.0;
        int MAX_DENOMINATOR = 10000;
        for (double denom = 1; denom <= MAX_DENOMINATOR; denom += 2) {
            if (denom % 4 == 1) {
                sum += 1 / denom;
            } else if (denom % 4 == 3) {
                sum -= 1 / denom;
            } else {
                System.out.println("Impossible!!!");
            }
        }
        sum *= 4;
        System.out.println("The value of PI = " + sum);
    }

    public static void computePITerm() {
        int MAX_TERM = 10000; //try 1000000, 1000,100000
        double sum = 0.0;
        for (int i = 1; i <= MAX_TERM; i++) {
            if (i % 2 == 1) {
                sum += 1.0 / (i * 2 - 1);
            } else {
                sum -= 1.0 / (i * 2 - 1);
            }
        }
        System.out.printf("PI : %f \n", 4 * sum);
        // percents of Math.PI
        System.out.println();
        System.out.println("(piComputed / Math.PI) * 100 = " + (4 * sum / Math.PI) * 100);
    }
}
