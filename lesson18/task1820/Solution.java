package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        String s = new String();
        while (fileReader.ready()) {
            s = fileReader.readLine();
        }
        String[] strings = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(String s1 : strings){
            double d = Double.parseDouble(s1);
            list.add((int) Math.round(d));
        }


        for (Integer i : list) {
            fileWriter.write(i.toString());
            fileWriter.write(" ");
        }
        fileReader.close();
        reader.close();
        fileWriter.close();

    }
}
