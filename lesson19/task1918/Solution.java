package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String tegStart = "<" + args[0];
        String tegEnd = "</" + args[0] + ">";
        int flag = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        StringBuilder line = new StringBuilder();
        while (fileReader.ready()){
            //if (!String.valueOf(fileReader.read()).equals("\n"))
                line.append(fileReader.readLine());
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < line.length(); i++){
        }

    }
}
