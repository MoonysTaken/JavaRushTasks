package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] m = new int[5];
            m[6] = 4;
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
           throw new IOException();
        }
        catch (Exception e){
            exceptions.add(e);
        }
        try {
            throw new NullPointerException();
        }
        catch (Exception e){
            exceptions.add(e);
        }
        try {
            throw new ArrayStoreException();
        }
        catch (Exception e){
            exceptions.add(e);
        }
        try {
            throw new ClassCastException();
        }
        catch (Exception e){
            exceptions.add(e);
        }
        try {
            throw new ClassNotFoundException();
        }
        catch (Exception e){
            exceptions.add(e);
        }
        try {
            throw new IllegalAccessException();
        }
        catch (Exception e){
            exceptions.add(e);
        }
        try {
            throw new IllegalArgumentException();
        }
        catch (Exception e){
            exceptions.add(e);
        }
        try {
            throw new IllegalThreadStateException();
        }
        catch (Exception e){
            exceptions.add(e);
        }


    }
}
