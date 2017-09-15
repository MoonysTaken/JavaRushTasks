package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
        static {
            labels.put(1d,"kek");
            labels.put(2d,"kek");
            labels.put(3d,"kek");
            labels.put(4d,"kek");
            labels.put(5d,"kek");
        }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
