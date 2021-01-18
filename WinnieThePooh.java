package com.company;

import java.sql.SQLOutput;

public class WinnieThePooh extends Сharacters {
    boolean IsGoOut;
    boolean WTPNotEatSweets;
    public WinnieThePooh(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Винни Пух";
    }
    public void SmoothyGoToGround(){
        System.out.print(this.toString()+" плавно опустился на Землю. ");
    }

    public void CouldNotMove(String week){
        System.out.print(week+this.toString()+" не могу поешевелить лапками. ");
    }
    public void GoUpLadder(){
        System.out.print(this.toString()+" поднимается по лесенке. ");
    }
    public void GoOutHouse(String oneday){
        System.out.print(oneday+this.toString()+" вышел из дома и ");
        IsGoOut=true;
    }
    public void WalkingInTheForest() throws WTPIsNotReadyException{
        System.out.print(" не спеша прогуливался по Лесу с довольно важным видом");
        if (IsGoOut){
            System.out.println(" Как прекрасен утренний лес!");}
        else {throw new WTPIsNotReadyException("Для начала Винни Пуху нужно выйти из дома");
        }

    }
    public void Sing(String news){
        System.out.print(", напевая себе под нос"+news+" песенку. ");
    };
    public void ProudHimself(String tm, String me){
        System.out.print(this.toString()+" было чем гордиться - "+this.toString()+" придумал эту песенку сам "+tm+me);
    }
    public void NotEatSweats(){
        System.out.print(this.toString()+" не ел сладкого и ");
        WTPNotEatSweets = true;
    }
    public void WantLoseWeight() throws NotEatSweetsException{
        System.out.print("очень хотел поскорее ");
        if (WTPNotEatSweets) {
            System.out.print("похудеть. ");
        }
        else {
            System.out.print("Для начала надо перестать есть сладкое!");
        }
    }
    public void GotUpOnHisToes(){
        System.out.print(this.toString()+" поднимался на носки, вытягивался изо всех сил. ");
    }
    public void Incline(String then){
        System.out.print(then+this.toString()+" наклонсялся и бормотал себе что-то под нос.");
    }
    public void Repeat(String ab, String learn){
        System.out.print(ab+this.toString()+" постоянно повторял ее, пока не"+learn);
    }



}
