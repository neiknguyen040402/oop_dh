package com.hus.lab2;

import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int NUM_ITEMS = in.nextInt();
        int[] items = new int[NUM_ITEMS];
        System.out.println("enter array elements: ");
        for (int idx = 0; idx < items.length; idx++) {
            items[idx] = in.nextInt();
        }

        System.out.println(arrayToString(items));
    }

    public static String arrayToString(int[] array) {
        if (array == null) {
            return "Null !!!";
        }
        String strRet = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                strRet += Integer.toString(array[i]);
            } else {
                strRet += ", ";
                strRet += Integer.toString(array[i]);
            }
        }
        strRet += "]";
        return strRet;
    }

}


