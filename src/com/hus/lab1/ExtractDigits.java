package com.hus.lab1;

public class ExtractDigits {
    public static void main(String[] args) {
        int number = 15423;
        int digit;
        while (number > 0) {
            digit = number % 10;
            System.out.print(digit + " "); // print digit
            number = number / 10;
        }
        System.out.println();
    }
}
