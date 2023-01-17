package com.hus.homework3.themylineandmypoint;

public class TestMainLinePoint {
    public static void main(String[] args) {
        MyPoint begin = new MyPoint(4, 5 );
        MyPoint end = new MyPoint(3, 2);

        System.out.println("begin point is: " + begin);
        System.out.println("end point is: " + end);

        MyLine myLine = new MyLine(begin, end);
        System.out.println(myLine);

        myLine.setBeginX(6);
        myLine.setBeginY(7);
        myLine.setEndX(8);
        myLine.setEndY(9);
        System.out.println(myLine);

        System.out.println(myLine.getLength());
        System.out.println(myLine.getGradient());
    }
}
