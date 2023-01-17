package com.hus.homework3.thedate;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        if (isValidate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public String toString() {
        String str = String.valueOf(day) + "/";
        if (day < 10)
            str = "0" + str;
        if (month < 10)
            str = str + "0";
        str = str + String.valueOf(month) + "/";
        return str + String.valueOf(year);
    }

    public static boolean isValidate(int day, int month, int year) {
        if (!(day > 0 && day < 32 && month > 0 && month < 13 && year > 0 && year < 10000))
            return false;
        int day_num ;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                day_num = 30;
                break;
            case 2:
                if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
                    day_num = 29;
                else day_num = 28;
                break;
            default:
                day_num = 31;
        }
        if (day > day_num) return false;
        return true;
    }
}
