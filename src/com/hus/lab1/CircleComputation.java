package com.hus.lab1;

import java.util.Scanner;

public class CircleComputation {
    public static double diameter(double radius) {
        return radius * 2.0;
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double circumference(double radius) {
        return 2.0 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius = in.nextDouble();
        System.out.printf("Diameter is : %.2f%n", diameter(radius));
        System.out.printf("Area is : %.2f%n ", area(radius));
        System.out.printf("Circumference is : %.2f%n", circumference(radius));
    }
}
