package com.company;

public class ThisTime extends Time {
    public ThisTime(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "На этот раз ";
    }
}
