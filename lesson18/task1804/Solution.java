package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileReader = new FileInputStream(fileName);
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int count = 1;
        int min = 128;
        while (fileReader.available() > 0) {
            int data = fileReader.read();
            list.add(data);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && i != j)
                    count++;
                else if (count < min)
                    min = count;
            }
            count = 1;
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j)) && i != j)
                    count++;
            }
            if (count == min)
                set.add(list.get(i));
            count = 1;
        }

        for (Integer i : set)
            System.out.print(i + " ");


        fileReader.close();
        reader.close();
    }
}


