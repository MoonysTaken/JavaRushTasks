package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        String sub;
            if (string == null || string.isEmpty())
                throw new TooShortStringException();
            int firstTab = string.indexOf("\t");
            if(firstTab == -1 || string.indexOf("\t", firstTab + 1) == -1 || firstTab == string.indexOf("\t", firstTab + 1))
                throw new TooShortStringException();

            int secondTab = string.indexOf("\t", firstTab + 1);
            sub = string.substring(firstTab + 1, secondTab);


        return sub;
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
