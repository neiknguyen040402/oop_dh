package com.hus.lab2;

import java.util.Scanner;

public class ExercisesContainsSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 5;
        System.out.print("Enter the length of the array: ");
        int NUM_ITEMS = in.nextInt();
        int[] items = new int[NUM_ITEMS];
        System.out.print("Enter the elements of the array: ");
        for (int idx = 0; idx < items.length; idx++) {
            items[idx] = in.nextInt();
        }
        if (contains(items, key)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("Element found at position: " + search(items, key));
    }

    public static boolean contains(int[] array, int key) {
        if (array == null) {
            return false;
        }

        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return true;
            }
        }
        return false;
    }

    public static int search(int[] array, int key) {
        if (array == null) {
            return -1;
        }
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return idx;
            }
        }
        return -1;
    }
}
