package com.hus.homework3.thetime;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if (isValitime()) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public String toString() {
        String str = String.valueOf(hour) + ":";
        if (hour < 10)
            str = "0" + str;
        if (minute < 10)
            str = str + "0";
        str = str + String.valueOf(minute) + ":";
        if (second < 10)
            str = str + "0";
        return str + String.valueOf(second);
    }

    public Time nextSecond() {
        if (this.second < 59) {
            this.second += 1;
            return this;
        }
        this.second = 0;
        this.minute++;
        if (this.minute < 59) {
            return this;
        }
        this.minute = 0;
        this.hour++;
        if (this.hour < 23) {
            return this;
        }
        this.hour = 0;
        return this;
    }

    public Time previousSecond() {
        if (hour == 0 && minute == 0 && second == 0) {
            hour = 23;
            minute = 59;
            second = 59;
            return this;
        }
        if (minute == 0 && second == 0) {
            hour--;
            minute = 59;
            second = 59;
            return this;
        }
        if (second == 0) {
            minute--;
            second = 59;
            return this;
        }
        second--;
        return this;
    }

    public boolean isValitime() {
        if (!(hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && minute >= 0 && minute <= 59)) {
            return false;
        }
        return true;
    }
}
