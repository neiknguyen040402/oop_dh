package com.hus.lab2;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int NUM_ITEMS = in.nextInt();
        if (NUM_ITEMS > 0) {
            System.out.print("Enter array elements: ");
            int[] items = new int[NUM_ITEMS];
            //double[] items = new double[NUM_ITEMS];
            //[] items = new float[NUM_ITEMS];
            if (items.length > 0) {
                for (int idx = 0; idx < items.length; idx++) {
                    items[idx] = in.nextInt();
                    //items[idx] = in.nextDouble();
                    //items[idx] = in.nextFloat();

                }
            }
            print(items);
        } else {
            System.err.println("empty array!!!");
        }
    }

    public static void print(int[] array) {
        if (array == null) {
            System.out.println("array null");
        } else {
            for (int idx = 0; idx < array.length; idx++) {
                if (idx == 0) {
                    System.out.print("[" + array[0]);
                } else {
                    System.out.print(", " + array[idx]);
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public static void print(double[] array) {
        if (array == null) {
            System.out.println("array null");
        } else {
            for (int idx = 0; idx < array.length; idx++) {
                if (idx == 0) {
                    System.out.print("[" + array[0]);
                } else {
                    System.out.print(", " + array[idx]);
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public static void print(float[] array) {
        if (array == null) {
            System.out.println("array null");
        } else {
            for (int idx = 0; idx < array.length; idx++) {
                if (idx == 0) {
                    System.out.print("[" + array[0]);
                } else {
                    System.out.print(", " + array[idx]);
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
