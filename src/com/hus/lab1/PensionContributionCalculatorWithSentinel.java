package com.hus.lab1;

import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;
        int contributableSalary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly salary (or -1 to end): $");
        int salary = sc.nextInt();
        while (salary != -1) {
            System.out.print("Enter the age : ");
            int age = sc.nextInt();
            if (salary >= SALARY_CEILING) {
                contributableSalary = 6000;
            } else {
                contributableSalary = salary;
            }
            if (age <= 55) {
                System.out.printf("The employee's contribution is : $%.2f%n", contributableSalary * EMPLOYEE_RATE_55_AND_BELOW);
                System.out.printf("The employer's contribution is : $%.2f%n", contributableSalary * EMPLOYER_RATE_55_AND_BELOW);
                System.out.printf("The total contribution is : $%.2f%n", (contributableSalary * EMPLOYEE_RATE_55_AND_BELOW + contributableSalary * EMPLOYER_RATE_55_AND_BELOW));
            } else if (age <= 60) {
                System.out.printf("The employee's contribution is : $%.2f%n", contributableSalary * EMPLOYEE_RATE_55_TO_60);
                System.out.printf("The employer's contribution is : $%.2f%n", contributableSalary * EMPLOYER_RATE_55_TO_60);
                System.out.printf("The total contribution is : $%.2f%n", (contributableSalary * EMPLOYEE_RATE_55_TO_60 + contributableSalary * EMPLOYER_RATE_55_TO_60));

            } else if (age <= 65) {
                System.out.printf("The employee's contribution is : $%.2f%n", contributableSalary * EMPLOYEE_RATE_60_TO_65);
                System.out.printf("The employer's contribution is : $%.2f%n", contributableSalary * EMPLOYER_RATE_60_TO_65);
                System.out.printf("The total contribution is : $%.2f%n", (contributableSalary * EMPLOYEE_RATE_60_TO_65 + contributableSalary * EMPLOYER_RATE_60_TO_65));

            } else {
                System.out.printf("The employee's contribution is : $%.2f%n", contributableSalary * EMPLOYEE_RATE_65_ABOVE);
                System.out.printf("The employer's contribution is : $%.2f%n", contributableSalary * EMPLOYER_RATE_65_ABOVE);
                System.out.printf("The total contribution is : $%.2f%n", (contributableSalary * EMPLOYEE_RATE_65_ABOVE + contributableSalary * EMPLOYER_RATE_65_ABOVE));

            }
            System.out.print("Enter the monthly salary (or -1 to end): $");
            salary = sc.nextInt();
        }
    }
}
