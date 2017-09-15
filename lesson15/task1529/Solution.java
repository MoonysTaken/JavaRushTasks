package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        try {
            reset();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Flyable result;

    public static void reset() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int count;
        if ("helicopter".equals(s))
            result = new Helicopter();
        else if ("plane".equals(s)) {
            count = Integer.parseInt(reader.readLine());
            result = new Plane(count);
        }
        reader.close();
    }
}
