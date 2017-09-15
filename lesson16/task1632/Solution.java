package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }
    public static void main(String[] args) {

    }
    public static class Thread1 extends Thread {
        public void run() {
            while (true) {

            }
        }
    }
    public static class Thread2 extends Thread {
        public void run() {
          try {
             Thread.sleep(1000);
          }
          catch (InterruptedException e) {
              System.out.println("InterruptedException");
          }

        }

    }
    public static class Thread3 extends Thread {
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);

                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static class Thread4 extends Thread implements Message {
        public void showWarning(){

        }
        public void run(){

        }
    }
    public static class Thread5 extends Thread {
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int numb;
                int sum = 0;
                while (true) {
                    String s = reader.readLine();
                    if (s.equals("N"))
                        break;
                    try {
                        numb = Integer.parseInt(s);
                        sum += numb;
                    }
                    catch (NumberFormatException e) {

                    }
                }
                System.out.println(sum);
                reader.close();
            }
            catch (IOException e) {
            }
        }
    }
}