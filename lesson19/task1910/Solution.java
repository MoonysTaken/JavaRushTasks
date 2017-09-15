package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        String line = "";
        while (fileReader.ready()){
            line += fileReader.readLine();
        }
        String newLine = line.replaceAll("\\p{Punct}", "");
        fileWriter.write(newLine);
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
