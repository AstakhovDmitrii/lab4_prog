package com.company;

import java.sql.SQLOutput;

public class Fly extends Сharacters {
    public Fly(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "муха";
    }
    public void SitOnANose(String wtp){
        System.out.println("Когда "+this.toString()+" садилась на нос "+wtp+", "+wtp+" приходилось сдувать ее и говорить: ");
    }
}
