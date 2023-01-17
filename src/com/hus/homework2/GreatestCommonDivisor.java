package com.hus.homework2;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println("gcd(27, 9)     = " + gcd(27, 9));
        System.out.println("gcd(56, 88)    = " + gcd(56, 88));
        System.out.println("gcd(27, 9)     = " + gcdRecursive(27, 9));
        System.out.println("gcd(56, 88)    = " + gcdRecursive(56, 88));
    }
    public static int gcd(int numberFirst, int numberSecond) {
        int temp;
        if (numberFirst < numberSecond) {
            temp = numberFirst;
            numberFirst = numberSecond;
            numberSecond = temp;
        }

        while (numberSecond != 0) {
            temp = numberSecond;
            numberSecond = numberFirst % numberSecond;
            numberFirst = temp;
        }
        return numberFirst;
    }
    public static int gcdRecursive(int numberFirst, int numberSecond) {
        if (numberSecond == 0) {
            return numberFirst;
        }
        int temp;
        if (numberFirst < numberSecond) {
            temp = numberFirst;
            numberFirst = numberSecond;
            numberSecond = temp;
        }
        temp = numberSecond;
        numberSecond = numberFirst % numberSecond;
        numberFirst = temp;
        return gcdRecursive(numberFirst, numberSecond);
    }
}
