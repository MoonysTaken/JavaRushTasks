package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* 
Чтение файла
*/

public class Solution  {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        while (inputStream.available() > 0)
            System.out.print((char) inputStream.read());

        System.out.println();
        inputStream.close();
        reader.close();
    }
}