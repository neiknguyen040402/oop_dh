package com.hus.homework4.themytime;
public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
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

    public MyTime nextSecond() {
        this.second++;
        if (this.second == 60) {
            this.second = 0;
            this.minute++;
        }
        if (this.minute == 60) {
            this.minute = 0;
            this.hour++;
        }
        if (this.hour == 24) {
            this.hour = 0;
        }
        return this;
    }

    public MyTime nextMinute() {
        this.minute++;
        if (this.minute == 60) {
            this.minute = 0;
            this.hour++;
        }
        if (this.hour == 24) {
            this.hour = 0;
        }
        return this;
    }

    public MyTime nextHour() {
        this.hour++;
        if (this.hour == 24) {
            this.hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        this.second--;
        if (this.second == -1) {
            this.second = 59;
            this.minute--;
        }
        if (this.minute == -1) {
            this.minute = 59;
            this.hour--;
        }
        if (this.hour == -1) {
            this.hour = 23;
        }
        return this;
    }

    public MyTime previousMinute() {
        this.minute--;
        if (this.minute == -1) {
            this.minute = 59;
            this.hour--;
        }
        if (this.hour == -1) {
            this.hour = 23;
        }
        return this;
    }

    public MyTime previousHour() {
        this.hour--;
        if (this.hour == -1) {
            this.hour = 23;
        }
        return this;
    }
}
