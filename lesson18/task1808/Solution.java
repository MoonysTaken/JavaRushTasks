package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStream3 = new FileOutputStream(fileName3);

        byte[] buffer = new byte[fileInputStream.available()];
        if (fileInputStream.available() > 0)
        {
            fileInputStream.read(buffer);
        }

        byte[] buffer2;
        byte[] buffer3 = new byte[buffer.length/2];

        if (buffer.length % 2 == 0) {
            buffer2 = new byte[buffer.length/2];
            System.arraycopy(buffer, 0, buffer2, 0, buffer2.length);
            System.arraycopy(buffer, buffer.length / 2, buffer3, 0, buffer.length / 2);
        } else {
            buffer2 = new byte[buffer.length/2+1];
            System.arraycopy(buffer, 0, buffer2, 0, buffer2.length);
            for (int i = buffer.length/2+1; i<buffer.length; i++)
                buffer3[i-buffer.length/2-1] = buffer[i];
        }
        fileOutputStream2.write(buffer2);
        fileOutputStream3.write(buffer3);

        bufferedReader.close();
        fileInputStream.close();
        fileOutputStream2.close();
        fileOutputStream3.close();
    }
    }

