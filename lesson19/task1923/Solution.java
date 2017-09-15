package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        while (reader.ready()){
            String[] s = reader.readLine().split(" ");
            for(int i = 0; i < s.length; i++){
                if(s[i].matches("[\\D]*?[\\d]+[\\D]*?"))
                    writer.write(s[i] + " ");
            }
        }
        writer.close();
        reader.close();
    }
}
