package com.hus.lab2;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = in.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = in.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }

    public static double exponent(int base, int exp) {
        double result = 1;
        if (exp < 0) {
            for (int idx = 0; idx < -exp; idx++) {
                result *= (1.0 / base);
            }
        } else {
            for (int idx = 0; idx < exp; idx++) {
                result *= base;
            }
        }
        return result;
    }


}
