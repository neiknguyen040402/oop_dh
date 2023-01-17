package com.hus.homework1;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        System.out.println("a)");
        printTriangularPatternA(size);
        System.out.println("b)");
        printTriangularPatternB(size);
        System.out.println("c)");
        printTriangularPatternC(size);
        System.out.println("d)");
        printTriangularPatternD(size);

    }

    public static void printTriangularPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void printTriangularPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void printTriangularPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printTriangularPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
