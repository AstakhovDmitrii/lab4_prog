package com.company;

import java.sql.SQLOutput;

public class Dad extends Сharacters {
    public Dad(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return " папа ";
    }
    public void Hear(String minute){
        System.out.print(minute+this.toString()+" услышал, как ");
    }
}
