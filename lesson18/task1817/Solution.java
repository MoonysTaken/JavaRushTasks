package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int count = 0;
        int countSpaces = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if(data == 32) {
                count++;
                countSpaces++;
            }
            else count++;
        }
        double templateDouble = countSpaces * 1.0 / count * 100;
        double formattedResult = Math.round(templateDouble * 100.0) / 100.0;
        inputStream.close();
        System.out.println(formattedResult);
    }
}
