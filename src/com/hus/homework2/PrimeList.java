package com.hus.homework2;

import java.util.Scanner;

public class PrimeList {

    public static void main(String[] args) {
        System.out.print("Enter the upper bound (positive integer): ");
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) {
            System.out.println("Upper bound not valid. Please try again.");
            return;
        }
        int upperBound = in.nextInt();
        printPrimes(upperBound);
    }

    public static boolean isPrime(int posInt) {
        for (int i = 2; i <= Math.sqrt(posInt); i++) {
            if (posInt % i != 0) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void printPrimes(int upperBound) {
        int countPrimes = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (!isPrime(i)) {
                continue;
            }
            System.out.println(i);
            countPrimes++;
        }
        System.out.printf("\n[%1$d primes found (%2$.2f%%)]\n"
                , countPrimes, ((double) 100 * countPrimes / upperBound)
        );
    }

}