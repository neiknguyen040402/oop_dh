package com.hus.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatisticsUpdate {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.println("");
        System.out.printf("The average is: %.2f\n", average(grades));
        System.out.printf("The median is: %.2f\n", median(grades));
        System.out.println("The minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.printf("The standard deviation is %.2f\n", stdDev(grades));

    }

    public static void readGrades() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberStudens = in.nextInt();
        grades = new int[numberStudens];
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
    }

    public static void print(int[] array) {
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == 0) {
                System.out.print("[" + array[0]);
            } else {
                System.out.print(", " + array[idx]);
            }
        }
        System.out.print("]");
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int idx = 0; idx < array.length; idx++) {
            sum += array[idx];
        }
        return (double) sum / array.length;
    }

    public static double median(int[] array) {
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0) {
            median = ((double) array[array.length / 2] + (double) array[(array.length / 2) - 1]) / 2;
        } else {
            median = array[array.length / 2];
        }
        return median;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] > max) {
                max = array[idx];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] < min) {
                min = array[idx];
            }
        }
        return min;
    }

    public static double stdDev(int[] array) {
        double sum = 0.0;
        double standardDeviation = 0.0;
        int length = array.length;
        for (double num : array) {
            sum += num;
        }
        double mean = sum / length;
        for (double num : array) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation / length);
    }
}
