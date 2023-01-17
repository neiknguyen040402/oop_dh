package com.hus.homework1;

import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();

        System.out.println("a)");
        printBoxPatternA(size);
        System.out.println("b)");
        printBoxPatternB(size);
        System.out.println("c)");
        printBoxPatternC(size);
        System.out.println("d)");
        printBoxPatternD(size);
    }

    public static void printBoxPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || col == 1 || row == size || col == size) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void printBoxPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || col == row || row == size) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void printBoxPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || col + row == size + 1 || row == size) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void printBoxPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || col + row == size + 1 || row == size || row == col) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }

}


