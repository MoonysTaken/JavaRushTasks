package com.javarush.task.task14.task1420;


import java.io.BufferedReader;
import java.io.InputStreamReader;
/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if ((a <=0 )||(b <= 0) ) throw new Exception();
        System.out.println(nod(a,b));
    }

    public static int nod (int a, int b){
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }
}
