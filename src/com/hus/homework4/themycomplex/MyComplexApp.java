package com.hus.homework4.themycomplex;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        MyComplex complex1 = new MyComplex(in.nextDouble(),in.nextDouble());

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        MyComplex complex2 = new MyComplex(in.nextDouble(),in.nextDouble());

        System.out.println();
        System.out.println("Number 1 is: (" + complex1 + ")");
        System.out.println("(" + complex1 + ") is " + (complex1.isReal() ? "" : "NOT") + " a pure real number");
        System.out.println("(" + complex1 + ") is " + (complex1.isImaginary() ? "" : "NOT") + " a pure imaginary number");

        System.out.println("Number 2 is: (" + complex2 + ")");
        System.out.println("(" + complex2 + ") is " + (complex2.isReal() ? "" : "NOT") + " a pure real number");
        System.out.println("(" + complex2 + ") is " + (complex2.isImaginary() ? "" : "NOT") + " a pure imaginary number");

        System.out.println("(" + complex1 + ") is " + ((complex1.equals(complex2)) ? "" : "NOT") + " equal to (" + complex2 + ")" );
        System.out.println("(" + complex1 + ") + (" + complex2 + ") = (" + complex1.add(complex2) + ")");
        System.out.println("(" + complex1 + ") - (" + complex2 + ") = (" + complex1.subtract(complex2) + ")");
        System.out.println("(" + complex1 + ") x (" + complex2 + ") = (" + complex1.multiply(complex2) + ")");
        System.out.println("(" + complex1 + ") / (" + complex2 + ") = (" + complex1.divide(complex2) + ")");

        System.out.println(complex1.argument());
        System.out.println(complex1 + " magnitude : " + complex1.magnitude());
        System.out.println(complex1 + " conjugate : " + complex1.conjugate());


    }
}
