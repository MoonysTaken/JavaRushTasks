package com.javarush.task.task14.task1421;

/**
 * Created by Vladimir on 09.08.2017.
 */
abstract class Singleton {
    private static Singleton instance;
   public static Singleton getInstance() {
        return instance;
    }
}
