package com.udemy.enums;

public class Gun {

    public static final Gun MONDAY= new Gun(1);
    public static final Gun TUESDAY= new Gun(1);
    public static final Gun WEDNESDAY= new Gun(1);
    public static final Gun THRUSDAY= new Gun(1);
    public static final Gun FRIDAY= new Gun(1);
    public static final Gun SATURDAY= new Gun(1);
    public static final Gun SUNDAY= new Gun(1);
    private int day;

    public Gun(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
