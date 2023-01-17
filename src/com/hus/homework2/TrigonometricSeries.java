package com.hus.homework2;

public class TrigonometricSeries {
    public static void main(String[] args) {
        System.out.println(sin(Math.PI / 6, 100));
        System.out.println(Math.sin(Math.PI / 6));

        System.out.println(cos(Math.PI / 6, 100));
        System.out.println(Math.cos(Math.PI / 6));
    }

    public static double sin(double x, int numTerm) {
        double term = x;
        double sum = x;
        for (int i = 1; i <= numTerm; i++) {
            term = (term * (-1) * x * x) / (2 * i * (2 *i +1));
            sum += term;
        }
        return sum;
    }

    public static double cos(double x, int numTerm) {
        double term = 1;
        double sum = 1;
        for (int i = 1; i <= numTerm; i++) {
            term *= ((-1) * x * x) / ((2 * i - 1) * 2 * i);
            sum = sum + term;
        }
        return sum;
    }

}
