package com.hus.lab2;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number items: ");
        int NUM_ITEMS = in.nextInt();
        System.out.print("Enter the value of all items: ");
        int[] items = new int[NUM_ITEMS];
        for (int idx = 0; idx < items.length; idx++) {
            items[idx] = in.nextInt();
        }
        for (int idx = 0; idx < items.length; idx++) {
            System.out.print(idx + ": ");
            for (int starNO = 1; starNO <= items[idx]; starNO++) {
                System.out.print("*");
            }
            System.out.println("(" + items[idx] + ")");
        }
    }
}
