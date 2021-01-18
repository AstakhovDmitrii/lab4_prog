package com.company;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws WTPIsNotReadyException {
        Pyatochok P = new Pyatochok("Пяточок");
        ThisTime tt = new ThisTime("На этот раз");
        WinnieThePooh WTP = new WinnieThePooh("Винни Пух");
        Week week = new Week("Целую неделю после этого");
        Fly fly = new Fly("Муха");
        KrisRob KR = new KrisRob("Кристофер Робин");
        Dad dad = new Dad("папа");
        Minute min = new Minute("Минута");
        OneDay od = new OneDay("Одним днем");
        ThisMorning tm = new ThisMorning("Этим утром");
        MorningExcersises me = new MorningExcersises();
        OldOrNew news = OldOrNew.NEW;
        Then then = new Then("А потом");
        AfterBreakfast ab = new AfterBreakfast("После завтрака");
        Learn learn = new Learn();
        Song song = new Song();
        Balloon balloon = new Balloon();
        Balloon.Air air = new Balloon.Air();
        SayPuh h = new SayPuh() {
            @Override
            public void say() {
                System.out.print("Пых!Пых!");
            }
        };
        KrisRob.KrisRobsDad KrisRobsDad = new KrisRob("Кристофер Робин").new KrisRobsDad();





        P.DidNotMiss(tt.toString());
        air.AirOut();
        balloon.deflate();
        WTP.SmoothyGoToGround();
        WTP.CouldNotMove(week.toString());
        fly.SitOnANose(WTP.toString());
        h.say();
        KR.Nod();
        KR.BreathedDeeply(); KR.TakeWTP(); KR.TrudgedOff();
        KR.TurnAround();KR.Nod();KR.Quit();
        KrisRobsDad.DadHear(min.toString());
        WTP.GoUpLadder();
        WTP.GoOutHouse(od.toString());
        try {
            WTP.WalkingInTheForest();
        } catch (WTPIsNotReadyException e){
            System.out.println(e.getMessage());
        }
        WTP.Sing(news.getTranslation());
        WTP.ProudHimself(tm.toString(), me.toString());
        WTP.NotEatSweats();
        WTP.WantLoseWeight();
        WTP.GotUpOnHisToes();
        WTP.Incline(then.toString());
        song.Born();
        WTP.Repeat(ab.toString(), learn.toString());
        Song.Singing();



    }
}