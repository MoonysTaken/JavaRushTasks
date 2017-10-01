package com.javarush.task.task22.task2202;

/*
Найти подстроку
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty()) {
            throw new TooShortStringException();
        }
        int firstSpace = string.indexOf(" ") + 1;
        char[] chars = string.toCharArray();
        int spacesCounter = 0;
        int indexOfLastSpace = 0;
        for (int i = 0; i < string.length(); i++) {
            if (chars[i] == ' ') {
                spacesCounter++;
                if (spacesCounter == 4) {
                    indexOfLastSpace = string.length();
                }
                else if (spacesCounter == 5) {
                    indexOfLastSpace = i;
                    break;
                }
            }
        }
        if (spacesCounter < 4) {
            throw new TooShortStringException();
        }
        return string.substring(firstSpace, indexOfLastSpace);

    }

    public static void main(String[] args) throws Exception{
        System.out.println(getPartOfString("JavaRush - лучший сервис о"));
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
