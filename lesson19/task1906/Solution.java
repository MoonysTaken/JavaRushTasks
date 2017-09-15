package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileReader fileReader = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);
        ArrayList<Character> list = new ArrayList<>();
        while (fileReader.ready()){
            list.add((char) fileReader.read());
        }
        for(int i = 1; i < list.size(); i += 2){
            fileWriter.write(list.get(i));
        }
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
