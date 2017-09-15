package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        byte[] bytes = new byte[inputStream.available()];
        while (inputStream.available() > 0) {
            inputStream.read(bytes);
        }
        Arrays.sort(bytes);
        int count = 0;
        int size = 1;
        HashSet<Byte> set = new HashSet<>();

        for (int i = 0; i < bytes.length; i++) {
            set.add(bytes[i]);
            if(set.size() > size){
                size++;
                System.out.println((char) bytes[i - 1] + " " + count);
                count = 1;
            }
            else count++;
            if (i == bytes.length - 1)
                System.out.println((char)bytes[i] + " " + count);
        }
        inputStream.close();
    }
}
