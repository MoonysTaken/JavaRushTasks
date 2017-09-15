package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException, CorruptedDataException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        BufferedReader fileReader1 = new BufferedReader(new FileReader(name1));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(name2));
        while (fileReader1.ready()) {
            allLines.add(fileReader1.readLine());
        }
        while (fileReader2.ready()) {
            forRemoveLines.add(fileReader2.readLine());
        }
        solution.joinData();
        reader.close();
        fileReader1.close();
        fileReader2.close();

    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
