package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileReader = new FileInputStream(fileName);
        int max = 99999;
        while (fileReader.available() > 0) {
            int data = fileReader.read();
            if(data < max)
                max = data;
        }
        System.out.println(max);
        fileReader.close();
        reader.close();
    }
}
