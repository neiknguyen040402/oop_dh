package com.hus.homework3.themyrectanglemypoint;

import java.util.Scanner;

public class TestMainRectanglePoint {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the top left point: ");
        System.out.print("x = ");
        int startX = in.nextInt();
        System.out.print("y = ");
        int startY = in.nextInt();
        MyPoint topLeftPoint = new MyPoint(startX, startY);
        System.out.println(topLeftPoint);

        System.out.println("Enter the bottom right point: ");
        System.out.print("x = ");
        int endX = in.nextInt();
        System.out.print("y = ");
        int endY = in.nextInt();
        MyPoint bottomRightPoint = new MyPoint(endX, endY);
        System.out.println(bottomRightPoint);

        MyRectangle myRectangle = new MyRectangle(topLeftPoint, bottomRightPoint);
        System.out.println(myRectangle);
        System.out.println("The area of the rectangle is " + myRectangle.getArea());
        System.out.println("The perimeter of the rectangle is " + myRectangle.getPerimeter());

    }
}
