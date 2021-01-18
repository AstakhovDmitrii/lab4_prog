
package com.company;

public abstract class Actions {
    public Actions() {
    }

    public abstract String toString();

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}