package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileInputStream inputStream1 = new FileInputStream(fileName1);
        FileInputStream inputStream2 = new FileInputStream(fileName2);
        ArrayList<Byte> list = new ArrayList<>();

        while (inputStream1.available() > 0)
            list.add((byte) inputStream1.read());

        FileOutputStream outputStream1 = new FileOutputStream(fileName1);
        int size = list.size();
        while (inputStream2.available() > 0)
            list.add(list.size() - size, (byte) inputStream2.read());

        byte[] buffer = new byte[list.size()];
        int i = 0;

        for (Byte b: list)
            buffer[i++] = b;


        outputStream1.write(buffer);
        inputStream1.close();
        inputStream2.close();
        outputStream1.close();
        reader.close();
    }
}
