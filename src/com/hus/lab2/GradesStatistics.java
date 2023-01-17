package com.hus.lab2;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberStudens = in.nextInt();
        int[] grades = new int[numberStudens];
        int i = 0;
        while (i < numberStudens) {
            System.out.printf("Enter the grade for student %1$d: ", (i + 1));
            int grade = in.nextInt();
            if (0 <= grade && grade <= 100) {
                grades[i] = grade;
                i++;
            } else {
                System.out.println("Error! Grade must be integer between 0 and 100!");
            }
        }
        System.out.printf("The average is %1$.2f\n", average(grades));
        System.out.printf("The minimum is %1$d\n", min(grades));
        System.out.printf("The maximum is %1$d\n", max(grades));
    }

    public static double average(int[] grades) {
        if (grades.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (sum / grades.length);
    }

    public static int min(int[] grades) {
        if (grades.length == 0) {
            return 0;
        }
        int min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            min = (min > grades[i]) ? grades[i] : min;
        }
        return min;
    }

    public static int max(int[] grades) {
        if (grades.length == 0) {
            return 0;
        }
        int max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            max = (max < grades[i]) ? grades[i] : max;
        }
        return max;
    }
}