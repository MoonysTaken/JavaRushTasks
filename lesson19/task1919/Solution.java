package com.javarush.task.task19.task1919;

/*
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        //Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        //sc.close();

        SortedMap<String, Double> map = new TreeMap<String, Double>();
        String s = null;
        while ((s = in.readLine()) != null) {
            String key = s.split(" ")[0];
            System.out.println(s.split(" ")[1]);
            Double value = Double.parseDouble(s.split(" ")[1]);
            Double currentValue = map.get(key);
            if (currentValue == null) currentValue = 0.0;
            map.put(key, value + currentValue);
        }
        in.close();

        Iterator<SortedMap.Entry<String, Double>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            SortedMap.Entry<String, Double> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}