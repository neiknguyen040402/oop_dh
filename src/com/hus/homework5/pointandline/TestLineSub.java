package com.hus.homework5.pointandline;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub lineSub = new LineSub(1, 1 , 4, 5);
        System.out.println(lineSub);

        Point point1 = new Point(1, 2);
        Point point2 = new Point(10, 10);
        LineSub lineSub12 = new LineSub(point1, point2);

        System.out.println(lineSub12);
        System.out.println("Length: " + lineSub12.getLength());
        System.out.println("gradient: " + lineSub12.getGradient());
    }
}
