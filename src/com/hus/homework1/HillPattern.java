package com.hus.homework1;

import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int numRows = in.nextInt();
        System.out.println("(a)");
        printHillPatternA(numRows);

        System.out.println("(b)");
        printHillPatternB(numRows);

        System.out.println("(c)");
        printHillPatternC(numRows);

        System.out.println("(d)");
        printHillPatternD(numRows);
    }

    public static void printHillPatternA(int numRows) {
        int numCol = 2 * numRows - 1;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numCol; col++) {
                if (row + col >= numRows + 1 && row >= col - numRows + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printHillPatternB(int numRows) {
        int numCol = 2 * numRows - 1;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numCol; col++) {
                if (row <= col && col + row <= 2 * numRows) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printHillPatternC(int numRows) {
        int count = numRows - 1;

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= count; col++)
                System.out.print("  ");
            count--;
            for (int col = 1; col <= 2 * row - 1; col++)
                System.out.print("# ");
            System.out.println();
        }
        count = 1;

        for (int row = 1; row <= numRows - 1; row++) {
            for (int col = 1; col <= count; col++)
                System.out.print("  ");
            count++;
            for (int col = 1; col <= 2 * (numRows - row) - 1; col++)
                System.out.print("# ");
            System.out.println();
        }
    }

    public static void printHillPatternD(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= (numRows + 1) - i; j++) {
                System.out.print("# ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("    ");   // two spaces
            }
            for (int j = 1; j <= (numRows + 1) - i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        for (int i = 2; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            for (int k = 1; k <= numRows - i; k++) {
                System.out.print("    ");   // two spaces
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
