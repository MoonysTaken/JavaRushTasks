package com.javarush.task.task14.task1408;

/**
 * Created by Vladimir on 08.08.2017.
 */
public class MoldovanHen extends Hen{
    public int getCountOfEggsPerMonth() {
       int  a = (int)(Math.random() * 11);
        return a;
    }
     String getDescription() {
        return (super.getDescription() + " Моя страна - " +  MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
