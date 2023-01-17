package com.hus.homework2;

import java.util.Scanner;

public class BinarySearchExercise {
    public static void main(String[] args) {
        int[] array = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = in.nextInt();
        System.out.print("Enter the first Index: ");
        int first = in.nextInt();
        System.out.print("Enter the second Index: ");
        int second = in.nextInt();
        if (binarySearch(array, key, first, second)) {
            System.out.println("Key is found between a and b!");
        } else {
            System.out.println("Key was not found between a and b!");
        }
    }

    public static boolean binarySearch(int array[], int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return true;
            } else {
                return false;
            }
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return true;

            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
                binarySearch(array, key, fromIdx, toIdx);
            } else {
                fromIdx = middleIdx + 1;
                binarySearch(array, key, fromIdx, toIdx);
            }
        }
        return false;
    }

    public static boolean binarySearch(int array[], int key) {
        int firstIdx = 0;
        int lastIdx = array.length - 1;
        if (firstIdx == lastIdx - 1) {
            if (key == array[firstIdx]) {
                return true;
            } else {
                return false;
            }
        } else {
            int middleIdx = (firstIdx + lastIdx) / 2;
            if (key == array[middleIdx]) {
                return true;

            } else if (key < array[middleIdx]) {
                lastIdx = middleIdx;
                binarySearch(array, key, firstIdx, lastIdx);
            } else {
                firstIdx = middleIdx + 1;
                binarySearch(array, key, firstIdx, lastIdx);
            }
        }
        return false;
    }
}
