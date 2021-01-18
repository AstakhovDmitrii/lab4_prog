package com.company;

import java.sql.SQLOutput;

public class Pyatochok extends Сharacters {
    public Pyatochok(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Пяточок";
    }
    public void DidNotMiss(String thistime){
        System.out.print(thistime+this.toString()+" не промахнулся. ");
    }
}
