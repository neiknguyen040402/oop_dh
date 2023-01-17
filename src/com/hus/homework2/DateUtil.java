package com.hus.homework2;

public class DateUtil {

    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static String[] strDays   = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};

    public static void main(String[] args) {
        int year = 2023;
        int month = 2;
        int day = 29;
        System.out.println(isLeapYear(year));
        System.out.println(isValidDate(year, month, day));
        System.out.println(getDayOfWeek(year, month, day)+ ": " + strDays[getDayOfWeek(year,month,day)]);
        System.out.println(toString(year,month,day));
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        int MIN_YEAR = 1;
        int MAX_YEAR = 9999;
        if (year < MIN_YEAR || year > MAX_YEAR) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int monthDays = daysInMonths[month - 1];
        if (month == 2 && isLeapYear(year)) {
            monthDays++;
        }
        return 1 <= day && day <= monthDays;
    }

    public static int getDayOfWeek(int year, int month, int day) {

        // 1. Based on the first two digit of the year, get the number from the "century" table.
        int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);

        // 2. Add to the last two digit of the year.
        int lastTwoDigitsOfYear = year % 100;

        // 3. Add to "the last two digit of the year divide by 4, truncate the fractional part".
        int magicYearNumber = lastTwoDigitsOfYear / 4;

        // 4. Add to the number obtained from the month table.
        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];

        // 5. Add to the day.
        int magicDayNumber = day;

        // 6. The sum modulus 7 gives the day of the week, where 0 for SUN, 1 for MON, ..., 6 for SAT.
        return (magicCenturyNumber + lastTwoDigitsOfYear + magicYearNumber + magicMonthNumber + magicDayNumber) % 7;
    }
        public static String toString(int year, int month, int day) {
            if ( ! isValidDate(year, month, day)) {
                return "Not a valid date!";
            }
            int d = getDayOfWeek(year, month, day);
            return strDays[d] + " " + day + " " + strMonths[month-1] + " " + year;
        }
    }

