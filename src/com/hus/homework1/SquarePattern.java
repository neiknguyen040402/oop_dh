package com.hus.homework1;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        printSquarePatternForLoop(size);
        System.out.println();
        printSquarePatternWhileLoop(size);
    }

    public static void printSquarePatternForLoop(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println("");
        }
    }

    public static void printSquarePatternWhileLoop(int size) {
        int row = 1;
        int col = 1;
        while (row <= size) {
            while (col <= size) {
                System.out.print("# ");
                col++;
            }
            System.out.println("");
            row++;
            col = 1;
        }
    }

}
