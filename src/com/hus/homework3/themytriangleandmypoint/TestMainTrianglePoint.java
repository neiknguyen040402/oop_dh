package com.hus.homework3.themytriangleandmypoint;

public class TestMainTrianglePoint {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint(3, 4);
        MyPoint myPoint2 = new MyPoint(5, 1);
        MyPoint myPoint3 = new MyPoint(8, 2);

        MyTriangle myTriangle = new MyTriangle(myPoint1, myPoint2, myPoint3);
        System.out.println(myTriangle);

        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.printType());
    }
}
