package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;

    static  {

        try {
            int x = 1 / 0;
        } catch (ArithmeticException ae) {
            throw new ExceptionInInitializerError(ae);
        }
    }

    public static int B = 5;

    public static void main(String[] args)  {
        System.out.println(B);
    }
}
