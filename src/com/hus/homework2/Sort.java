package com.hus.homework2;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        bubbleSort(array);
        //selectionSort(array);
        //insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] array) {
        if (array == null) {
            System.out.println("Empty array!!");
        } else {
            int len = array.length;
            boolean swapped;
            do {
                swapped = false;
                for (int i = 1; i < len; i++) {
                    if (array[i - 1] > array[i]) {
                        int temp = array[i - 1];
                        array[i - 1] = array[i];
                        array[i] = temp;
                        swapped = true;
                    }
                }
                len--;
            } while (swapped);
        }
    }

    public static void selectionSort(int[] array) {
        if (array == null) {
            System.out.println("Empty array!!");
        } else {
            int len = array.length;
            for (int i = 0; i < len - 1; i++) {
                int min_idx = i;
                for (int j = i + 1; j < len; j++)
                    if (array[j] < array[min_idx])
                        min_idx = j;
                int temp = array[min_idx];
                array[min_idx] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] array) {
        if (array == null) {
            System.out.println("Empty array!!");
        } else {
            int len = array.length;
            for (int i = 1; i < len; ++i) {
                int key = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = key;
            }
        }
    }
}
