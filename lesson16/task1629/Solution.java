package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

   public static class Read3Strings extends Thread {
        private String s;
        private String[] s1 = new String[3];
        public void run() {
            for (int i = 0; i < 3; i++) {
                try {
                    s = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                s1[i] = s;
            }
        }
        public void printResult() {
            for (int i = 0; i < 3; i++)
                System.out.print(s1[i] + " ");
            System.out.println();
        }
   }
}
