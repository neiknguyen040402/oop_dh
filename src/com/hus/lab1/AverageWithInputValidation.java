package com.hus.lab1;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int NUM_STUDENTS = 3;
        int numberIn;
        boolean isValid;
        int sum = 0;
        for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
            isValid = false;
            do {
                System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                numberIn = in.nextInt();
                if (numberIn <= 100 && numberIn >= 0) {
                    isValid = true;
                } else {
                    System.out.println("inValid Input , try again ...");
                }
            } while (!isValid);
            sum += numberIn;
        }
        System.out.printf("Average score of 3 students: %.2f%n", (double) sum / NUM_STUDENTS);
    }
}
