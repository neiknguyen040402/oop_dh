package com.hus.homework3.themycirclemypoint;

public class TestMainCirclePoint {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(3, 5);
        System.out.println(myPoint);

        MyCircle myCircle = new MyCircle(myPoint, 3);
        System.out.println("Area is: " + myCircle.getArea());
        System.out.println("Circumference is: " + myCircle.getCircumference());

        MyCircle myCircle1 = new MyCircle(5, 8 ,4 );
        System.out.println(myCircle.distance(myCircle1));

        System.out.println(myCircle1);
    }
}
