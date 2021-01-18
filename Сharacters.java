package com.company;

public abstract class Сharacters {
    public String name;

    public Сharacters(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String toString();

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }

}
