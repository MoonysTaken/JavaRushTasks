package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        ArrayList<String> list = new ArrayList<>();
        while (reader.ready()){
            String[] s1 = reader.readLine().split(" ");
            for(int i = 0; i < s1.length; i++){
                String[] s2 = s1[i].split("");
                if(s2.length > 6 )
                    list.add(s1[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1)
                writer.write(list.get(i));
            else
                writer.write(list.get(i) + ",");
        }
        reader.close();
        writer.close();
    }
}
