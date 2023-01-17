package com.hus.lab2;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {

        System.out.print("Enter the number of items: ");
        Scanner in = new Scanner(System.in);
        int NUM_ITEMS = in.nextInt();
        System.out.print("Enter the value of all items: ");
        int[] items = new int[NUM_ITEMS];
        if (items.length > 0) {
            for (int idx = 0; idx < items.length; idx++) {
                items[idx] = in.nextInt();
            }
        }
        System.out.print("The value are: ");
        for (int idx = 0; idx < items.length; idx++) {
            if (idx == 0) {
                System.out.print("["+ items[0]);
            } else {
                System.out.print(", " + items[idx]);
            }
            // or, using a one liner
            //System.out.print((idx == 0) ? items[0] : ", " + items[idx]);
        }
        System.out.println("]");
    }
}
