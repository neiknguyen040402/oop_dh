package com.hus.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ExercisesEquals {
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
        if (equals(array1, array2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == null || array2 == null || array1.length != array2.length) {
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int idx = 0; idx < array1.length; idx++) {
            if (array1[idx] != array2[idx])
                return false;
        }
        return true;
    }
}
