package com.hus.lab1;
import java.util.Scanner;

public class SumProductMinMax3 {
    public static int sum(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        return sum;
    }

    public static int product(int number1, int number2, int number3) {
        int product = number1 * number2 * number3;
        return product;
    }

    public static int min(int number1, int number2, int number3) {
        return Math.min(number1, Math.min(number2, number3));
    }

    public static int max(int number1, int number2, int number3) {
        return Math.max(number1, Math.max(number2, number3));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int number1 = in.nextInt();
        System.out.print("Enter 2nd integer: ");
        int number2 = in.nextInt();
        System.out.print("Enter 3rd integer: ");
        int number3 = in.nextInt();
        System.out.println("The sum is : " + sum(number1, number2, number3));
        System.out.println("The product is : " + product(number1, number2, number3));
        System.out.println("The min is : " + min(number1, number2, number3));
        System.out.println("The max is : " + max(number1, number2, number3));

    }
}
