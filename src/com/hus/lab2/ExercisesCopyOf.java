package com.hus.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ExercisesCopyOf {
    public static void main(String[] args) {
        int newLenght = 5;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int idx = 0; idx < array.length; idx++) {
            array[idx] = in.nextInt();
        }

        int[] arrayCopy = copyOf(array);
        System.out.println(Arrays.toString(arrayCopy));

        int[] newArray = copyOf(array, newLenght);
        for (int idx = 0; idx < newArray.length; idx++) {
            System.out.print(newArray[idx] + " ");
        }
        System.out.println();

        /** check for null value **/
//        int[] arr = null;
//        int[] arrCp = copyOf(arr);

    }

    public static int[] copyOf(int[] array) {
        if (array == null) {
            System.out.println("The array is empty.");
            return new int[0];
        }

        int[] newArray = new int[array.length];
        for (int idx = 0; idx < array.length; idx++) {
            newArray[idx] = array[idx];
        }
        return newArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        if (array == null) {
            System.out.println("The array is empty.");
            return new int[0];
        }
        int[] newArray = new int[newLength];
        if (newLength <= array.length) {
            for (int idx = 0; idx < newLength; idx++) {
                newArray[idx] = array[idx];
            }
        } else {
            for (int idx = 0; idx < array.length; idx++) {
                newArray[idx] = array[idx];
            }
            for (int idx = array.length; idx < newLength; idx++) {
                newArray[idx] = 0;
            }
        }
        return newArray;
    }
}



