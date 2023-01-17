package com.hus.lab1;

import java.util.Scanner;

public class CylinderComputation {
    public static double baseArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double surfaceArea(double radius, double basearea) {
        return 2.0 * Math.PI * radius + 2.0 * basearea;
    }

    public static double volume(double basearea, double height) {
        return basearea * height;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius = in.nextDouble();
        System.out.print("Enter the height : ");
        double height = in.nextDouble();
        System.out.printf("Diameter is : %.2f%n", baseArea(radius));
        System.out.printf("Area is : %.2f%n ", surfaceArea(radius, baseArea(radius)));
        System.out.printf("Circumference is : %.2f%n", volume(baseArea(radius), height));
    }
}
