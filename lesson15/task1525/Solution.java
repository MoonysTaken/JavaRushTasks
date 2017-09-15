package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {

    public static List<String> lines = new ArrayList<String>();
    static {
        try {
            File file = new File("C:\\Users\\Vladimir\\Desktop\\Javavavava\\Test1.txt");
            BufferedReader filereader = new BufferedReader(new FileReader(file));
            while (filereader.ready()) {
                lines.add(filereader.readLine());
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
