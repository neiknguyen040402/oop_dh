package com.hus.homework2;

public class LinearSearchExercise {
    public static void main(String[] args) {
        int array[] = {30, 14, 18, 26, 29, 34, 65, 87, 43, 22};
        int key = 26;

        int result = linearSearchIndex(array, key);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index = " + result);
    }

    public static boolean linearSearch(int[] array, int key) {
        if (array == null) {
            System.out.println("Empty array");
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        if (array == null) {
            System.out.println("Empty array");
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
