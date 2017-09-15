package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        while (fileReader.ready()){
           String[] s = fileReader.readLine().split("");
           for(int i = s.length - 1; i > -1; i--){
               System.out.print(s[i]);
           }
            System.out.println();
        }
        fileReader.close();
    }
}
