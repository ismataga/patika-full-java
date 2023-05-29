package com.udemy.enums;

public enum Day {
    MONDAY(1),

    TUESDAY(1),

    WEDNESDAY(1),

    THRUSDAY(1),

    FRIDAY(1),

    SATURDAY(1),

    SUNDAY(1);

    private int day;

    Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
