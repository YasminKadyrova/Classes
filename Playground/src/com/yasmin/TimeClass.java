package com.yasmin;

public class TimeClass {
    private int hour;
    private int minute;
    private int second;

    public TimeClass(int currentHour, int currentMinute, int currentSecond){
        this.hour=currentHour;
        this.minute=currentMinute;
        this.second=currentSecond;
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

    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    @Override
    public String toString() {
        return "TimeClass{"+
                hour +
                ":" + minute +
                ":" + second +
                '}';
    }

    public TimeClass nextSecond(){
        return new TimeClass(hour, minute, ++second);
    }

    public TimeClass previousSecond(){
        return new TimeClass(hour, minute, --second);
    }

}
