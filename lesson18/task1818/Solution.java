package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileOutputStream file1OutputStream = new FileOutputStream(fileName1);
        FileInputStream file2InputStream = new FileInputStream(fileName2);
        FileInputStream file3InputStream = new FileInputStream(fileName3);
        byte[] buffer = new byte[1000];
        while (file2InputStream.available() > 0) {
            int count = file2InputStream.read(buffer);
            file1OutputStream.write(buffer, 0, count);
        }
        while (file3InputStream.available() > 0) {
            int count = file3InputStream.read(buffer);
            file1OutputStream.write(buffer, 0, count);
        }
        reader.close();
        file1OutputStream.close();
        file3InputStream.close();
        file2InputStream.close();
    }
}
