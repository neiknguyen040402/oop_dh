package com.hus.homework2;

import java.util.Scanner;

public class SpecialSeries {

    public static double sumOfSeries(double x, int numTerms) {
        double sum = 0.0;
        if (x > -1 && x < 1) {
            sum = x;
            for (int k = 1; k < numTerms; k++) {
                double uk = Math.pow(x, 2 * k + 1) / (double) (2 * k + 1);
                for (int i = 2 * k - 1; i > 0; i -= 2) {
                    uk *= i / (double) (i + 1);
                }
                sum += uk;
            }
        } else {
            sum = Double.NaN;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter double x: ");
        double x = in.nextDouble();
        while (x > 1 || x < -1) {
            System.out.print("Out of range! Re-enter x: ");
            x = in.nextDouble();
        }
        System.out.print("Enter the numTerms: ");
        int numTerms = in.nextInt();
        System.out.println("Sum of Special Series: " + sumOfSeries(x, numTerms));
    }
}