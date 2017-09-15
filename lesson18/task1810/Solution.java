package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<FileInputStream> files = new ArrayList<FileInputStream>();
        String fileName;
        while ((fileName = sc.nextLine()) != null) {
            FileInputStream f = new FileInputStream(fileName);
            files.add(f);
            if (f.available() < 1000) {
                for (FileInputStream tf : files) {
                    tf.close();
                    throw new DownloadException();
                }
            }
        }
    }

    public static class DownloadException extends Exception{

    }
}