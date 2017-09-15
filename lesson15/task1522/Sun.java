package com.javarush.task.task15.task1522;

/**
 * Created by Vladimir on 13.08.2017.
 */
public class Sun implements Planet {
    private Sun() {
    }
    private static Sun instance;
    public static Sun getInstance() {
        if (instance == null)
            instance = new Sun();
        return instance;
    }
}
