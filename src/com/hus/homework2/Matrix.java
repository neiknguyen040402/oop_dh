package com.hus.homework2;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows of the first matrix: ");
        int row1 = in.nextInt();
        System.out.print("Enter the number of columns of the first matrix: ");
        int col1 = in.nextInt();
        int[][] matrix1 = new int[row1][col1];
        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = in.nextInt();
            }
        }
        System.out.print("Enter the number of rows of the second matrix: ");
        int row2 = in.nextInt();
        System.out.print("Enter the number of rows of the second matrix: ");
        int col2 = in.nextInt();
        int[][] matrix2 = new int[row2][col2];
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = in.nextInt();
            }
        }

//        int row1 = in.nextInt();
//        int col1 = in.nextInt();
//        double[][] matrix1 = new double[row1][col1];
//        for (int i = 0; i < row1; i++) {
//            for (int j = 0; j < col1; j++) {
//                matrix1[i][j] = in.nextDouble();
//            }
//        }
//        int row2 = in.nextInt();
//        int col2 = in.nextInt();
//        double[][] matrix2 = new double[row2][col2];
//        for (int i = 0; i < row2; i++) {
//            for (int j = 0; j < col2; j++) {
//                matrix2[i][j] = in.nextDouble();
//            }
//        }


        System.out.println("First matrix: ");
        print(matrix1);
        System.out.println("Second matrix: ");
        print(matrix2);
        if (haveSameDimension(matrix1, matrix2)) {
            System.out.println("Add matrix 1 to matrix 2: ");
            print(add(matrix1, matrix2));
            System.out.println("subtract: ");
            print(subtract(matrix1, matrix2));
        }
        System.out.println("Multiply matrix A and B:");
        print(multiply(matrix1, matrix2));

    }


    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null || matrix1.length != matrix2.length) {
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length == matrix2[i].length) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null || matrix1.length != matrix2.length) {
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length == matrix2[i].length) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] newMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                newMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return newMatrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] newMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                newMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return newMatrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] newMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                newMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return newMatrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] newMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                newMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return newMatrix;
    }

    public static boolean haveAllowedDimension(int[][] m1, int[][] m2) {
        int maxLengthM1 = 0;
        for (int[] a : m1) {
            maxLengthM1 = (maxLengthM1 <= a.length) ? a.length : maxLengthM1;
        }
        for (int[] a : m1) {
            if (maxLengthM1 == a.length) {
                continue;
            }
            return false;
        }
        int maxLengthM2 = 0;
        for (int[] b : m2) {
            maxLengthM2 = (maxLengthM2 <= b.length) ? b.length : maxLengthM2;
        }
        for (int[] b : m2) {
            if (maxLengthM2 == b.length) {
                continue;
            }
            return false;
        }
        return m1[0].length == m2.length;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        if (col1 != row2) {
            return null;
        }
        int[][] newMatrix = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                newMatrix[i][j] = 0;
                for (int k = 0; k < col1; k++) {
                    newMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return newMatrix;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        if (col1 != row2) {
            return null;
        }

        double[][] newMatrix = new double[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                newMatrix[i][j] = 0;
                for (int k = 0; k < col1; k++) {
                    newMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return newMatrix;
    }
}
