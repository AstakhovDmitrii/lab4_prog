package com.company;

public class ThisMorning extends Time {
    public ThisMorning(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return " сегодня утром ";
    }
}
