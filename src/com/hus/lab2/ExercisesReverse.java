package com.hus.lab2;

import java.util.Scanner;

public class ExercisesReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = in.nextInt();
        }
        reverse(arr);
    }

    public static void reverse(int[] array) {
        if (array == null) {
            System.out.println("The array is empty.");
        } else {
            int[] revArr = new int[array.length];
            int num = array.length;
            for (int idx = 0; idx < array.length; idx++) {
                revArr[num - 1] = array[idx];
                num -= 1;
            }
            System.out.println("Reversed array is: ");
            for (int k = 0; k < array.length; k++) {
                System.out.print(revArr[k] + " ");
            }
            System.out.println();
        }
    }
}
