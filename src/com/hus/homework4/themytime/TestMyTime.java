package com.hus.homework4.themytime;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(23, 59, 59);
        System.out.println(myTime);
        System.out.println(myTime.nextMinute().nextMinute());

        myTime.setTime(23, 59, 58);
        System.out.println(myTime);
        System.out.println(myTime.nextSecond().nextSecond());
        System.out.println(myTime.nextHour());

        System.out.println();
        System.out.println(myTime.previousMinute().previousSecond());
        System.out.println(myTime.previousSecond().previousSecond());
    }
}
