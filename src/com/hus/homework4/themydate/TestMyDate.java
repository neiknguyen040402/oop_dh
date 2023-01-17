package com.hus.homework4.themydate;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2012, 2, 28);
        System.out.println(date1);
        System.out.println(date1.nextDay());
        System.out.println(date1.nextDay().nextDay());
        System.out.println(date1.nextMonth());
        System.out.println(date1.nextYear());
        System.out.println();

        MyDate date2 = new MyDate(2012, 3, 2);
        System.out.println(date2);
        System.out.println(date2.previousDay());
        System.out.println(date2.previousDay().previousDay());
        System.out.println(date2.previousMonth());
        System.out.println(date2.previousYear());
        System.out.println();

        MyDate date3 = new MyDate(2012, 2, 29);
        System.out.println(date3);
        System.out.println(date3.nextDay());
        System.out.println(date3.previousYear());
        System.out.println();

        MyDate date4 = new MyDate(2099, 11, 31);
        System.out.println(date4);
    }
}
