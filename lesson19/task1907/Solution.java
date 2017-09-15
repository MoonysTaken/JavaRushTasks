package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileReader fileReader = new FileReader(fileName);
        StringBuilder line = new StringBuilder();
        while (fileReader.ready()){
            line.append((char) fileReader.read());
        }
        System.out.println(line.toString().split("[\\W]world[\\W]").length);
            reader.close();
        fileReader.close();
    }
}
