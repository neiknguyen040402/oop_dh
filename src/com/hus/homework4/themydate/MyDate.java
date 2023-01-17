package com.hus.homework4.themydate;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public final static String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};

    public static int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (!(day > 0 && day < 32 && month > 0 && month < 13 && year > 0 && year < 10000)) {
            return false;
        }
        int day_num;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                day_num = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    day_num = 29;
                } else {
                    day_num = 28;
                }
                break;
            default:
                day_num = 31;
        }
        if (day > day_num) {
            return false;
        }
        return true;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int magicYearNumber = lastTwoDigitsOfYear / 4;
        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];
        int magicDayNumber = day;

        return (magicCenturyNumber + lastTwoDigitsOfYear + magicYearNumber + magicMonthNumber + magicDayNumber) % 7;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        this.day++;
        if (isLeapYear(year) && month == 2) {
            if (!(this.day >= 1 && this.day <= 29)) {
                this.day = 1;
                this.month++;
            }
        } else {
            if (!(this.day >= 1 && this.day <= DAYS_IN_MONTHS[month - 1])) {
                this.day = 1;
                this.month++;
            }
        }
        if (!(this.month >= 1 && this.month <= 12)) {
            this.month = 1;
            this.year++;
        }
        if (!(this.year >= 1 && this.year <= 9999)) {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate nextMonth() {
        this.month++;
        if (!(this.month >= 1 && this.month <= 12)) {
            this.month = 1;
            this.year++;
        }
        if (!(this.year >= 1 && this.year <= 9999)) {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate nextYear() {
        this.year++;
        if (!(this.year >= 1 && this.year <= 9999)) {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate previousDay() {
        this.day--;
        if (isLeapYear(year) && month == 3) {
            if (this.day == 0) {
                this.day = 29;
                this.month--;
            }
        } else {
            if (this.day == 0) {
                this.day = DAYS_IN_MONTHS[this.month - 1];
                this.month--;
            }
        }
        if (!(this.month >= 1 && this.month <= 12)) {
            this.month = 12;
            this.year--;
        }
        if (!(this.year >= 1 && this.year <= 9999)) {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate previousMonth() {
        this.month--;
        if (!(this.month >= 1 && this.month <= 12)) {
            this.month = 12;
            this.year--;
        }
        if (!(this.year >= 1 && this.year <= 9999)) {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate previousYear() {
        this.year--;
        if (!(this.year >= 1 && this.year <= 9999)) {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }
}
