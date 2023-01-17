package com.hus.homework2;

public class FibonacciInt {
    public static void main(String[] args) {
        //fibonacciInt();
        tribonacciInt();
    }

    public static void fibonacciInt() {
        int temp1 = 0;
        int temp2 = 1;
        int fibo = 1;
        int count = 2;
        System.out.println("F(" + temp1 + ") = " + temp1);
        System.out.println("F(" + temp2 + ") = " + temp2);
        while (true) {
            temp1 = temp2;
            temp2 = fibo;
            fibo = temp1 + temp2;
            System.out.println("F(" + count + ") = " + fibo);
            count++;
            if (Integer.MAX_VALUE - fibo < fibo - temp2) {
                System.out.println("F(" + count + ") is out of range of int");
                break;
            }
        }
    }

    public static void tribonacciInt() {
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 1;
        int tribo = 1;
        int count = 3;
        System.out.println("F(" + 0 + ") = " + temp1);
        System.out.println("F(" + 1 + ") = " + (temp2 + 1));
        System.out.println("F(" + 2 + ") = " + temp3);

        while (true) {
            temp1 = temp2;
            temp2 = temp3;
            temp3 = tribo;
            tribo = temp1 + temp2 + temp3;
            System.out.println("F(" + count + ") = " + tribo);
            count++;
            if (Integer.MAX_VALUE - tribo - (tribo - temp3) < tribo - temp3 - temp2) {
                System.out.println("F(" + count + ") is out of range of int");
                break;
            }
        }
    }
}