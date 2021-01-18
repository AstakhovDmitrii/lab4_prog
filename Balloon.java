package com.company;

import java.sql.SQLOutput;

public class Balloon {
    public String toString() {
        return "шарик";
    }
    public static class Air {
      public void AirOut() {System.out.print(" Воздух начал медленно выходить из шарика,");}
    }
    public void deflate(){
        System.out.print(this.toString()+" начал сдуваться и ");
    }

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}
