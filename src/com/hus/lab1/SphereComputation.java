package com.hus.lab1;

import java.util.Scanner;

public class SphereComputation {
    public static double surfaceArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    public static double volume(double radius) {
        return 4/3 * (Math.PI * Math.pow(radius,3));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius = in.nextDouble();
        System.out.printf("SurfaceArea is : %.2f%n ", surfaceArea(radius));
        System.out.printf("Volume is : %.2f%n", volume(radius));
    }
}