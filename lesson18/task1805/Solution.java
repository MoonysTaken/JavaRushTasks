package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileReader = new FileInputStream(fileName);
        TreeSet<Integer> treeSet = new TreeSet();

        while (fileReader.available() > 0) {
            int data = fileReader.read();
            treeSet.add(data);
        }

        for (Integer i : treeSet)
            System.out.print(i + " ");

        fileReader.close();
        reader.close();
    }
}
