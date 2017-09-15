package com.javarush.task.task14.task1417;

/**
 * Created by Vladimir on 09.08.2017.
 */
public class Hrivna extends Money {
    public Hrivna(double amount) {
        super(amount);
    }

    public String getCurrencyName(){
        return "HRN";

    }
}
