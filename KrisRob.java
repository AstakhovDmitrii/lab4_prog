package com.company;

import java.sql.SQLOutput;

public class KrisRob extends Сharacters {
    public KrisRob(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Кристофер Робин";
    }

    public void Nod() {
        System.out.print(this.toString() + " кивнул ");
    }

    public void BreathedDeeply() {
        System.out.print(this.toString() + " глубоко всдохнул,");
    }

    public void TakeWTP() {
        System.out.print(" взял медвежонка за заднюю лапу и ");
    }

    public void TrudgedOff() {
        System.out.print("поплелся к двери.");
    }

    public void TurnAround() {
        System.out.print("У порога " + this.toString() + " обернулся и сказал ");
    }

    public void Quit() {
        System.out.println("и вышел, и");
    }

    public class KrisRobsDad {
        public void DadHear(String minute) {
            System.out.print(minute + " папа услышал, как ");
        }
    }
}
