package com.hus.lab2;

import java.util.Scanner;

public class SwappingTwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array1: ");
        int NUM_ARRAY1 = in.nextInt();
        int[] array1 = new int[NUM_ARRAY1];
        System.out.print("Enter the elements of the array1: ");
        for (int idx = 0; idx < array1.length; idx++) {
            array1[idx] = in.nextInt();
        }
        System.out.print("Enter the length of the array2: ");
        int NUM_ARRAY2 = in.nextInt();
        int[] array2 = new int[NUM_ARRAY2];
        System.out.print("Enter the elements of the array2: ");
        for (int idx = 0; idx < array2.length; idx++) {
            array2[idx] = in.nextInt();
        }
        System.out.println(swap(array1, array2));

        // check for null value
        int[] arr = null;
        //System.out.println(swap(array1, arr));
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1 == null || array2 == null || array1.length != array2.length) {
            System.err.println("Error!!!");
            return false;
        } else {
            int size = array1.length;
            int[] temp = new int[size];
            System.out.println("Before Swapping");
            System.out.print("First Array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array1[i] + " ");
            }
            System.out.print("\nSecond Array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array2[i] + " ");
            }

            for (int i = 0; i < size; i++) {
                temp[i] = array1[i];
                array1[i] = array2[i];
                array2[i] = temp[i];
            }
            System.out.println("\nArrays after Swapping");
            System.out.println("First Array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array1[i] + " ");
            }
            System.out.println("\nSecond Array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array2[i] + " ");
            }
            System.out.println("");
        }
        return true;
    }
}