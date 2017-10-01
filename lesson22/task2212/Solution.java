package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {

    public static void main(String[] args) {

    }

    public static boolean checkTelNumber(String telNumber) {
        if (telNumber.charAt(0) == '+') {
            boolean bRightDigitsCount = (telNumber.length() - 12) == telNumber.replaceAll("\\d", "").length();
            //System.out.println("digit count: " + bRightDigitsCount);
            return bRightDigitsCount && telNumber.matches("\\+(\\d{12}|\\d{1,2}\\(\\d{3}\\)(\\d{7,8}|\\d+-\\d+|\\d+-\\d+-\\d+))");
        }
        else {
            boolean bRightDigitsCount = (telNumber.length() - 10) == telNumber.replaceAll("\\d", "").length();
            return bRightDigitsCount && telNumber.matches("(\\d{10}|\\(\\d{3}\\)(\\d{7}|\\d+-\\d+|\\d+-\\d+-\\d+))");
        }
    }
}