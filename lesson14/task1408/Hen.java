package com.javarush.task.task14.task1408;

/**
 * Created by Vladimir on 08.08.2017.
 */
public abstract class Hen implements Country {
    abstract int getCountOfEggsPerMonth();
     String getDescription() {
        return "Я - курица.";
    }
}
