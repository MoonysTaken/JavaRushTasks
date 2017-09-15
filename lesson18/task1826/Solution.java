package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);
        ArrayList<Byte> list = new ArrayList<>();
        byte[] bytes = new byte[inputStream.available()];
        if(args[0].equals("-e")){
            while (inputStream.available() > 0){
                list.add((byte) ( inputStream.read() + 1));
            }


            for(int i = 0; i < list.size(); i++){
                bytes[i] = list.get(i);
            }
            outputStream.write(bytes);
        }
        if(args[0].equals("-d")){
            while (inputStream.available() > 0){
                list.add((byte) (inputStream.read() - 1));
            }

            for(int i = 0; i < list.size(); i++){
                bytes[i] = list.get(i);
            }
            outputStream.write(bytes);
        }
        inputStream.close();
        outputStream.close();
    }

}
