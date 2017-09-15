package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        SortedMap<String, Double> map = new TreeMap<String, Double>();
        String s;
        while ((s = in.readLine()) != null) {
            String key = s.split(" ")[0];
            Double value = Double.parseDouble(s.split(" ")[1]);
            Double currentValue = map.get(key);
            if (currentValue == null) currentValue = 0.0;
            map.put(key, value + currentValue);
        }
        in.close();

        double max = 0.0;
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if(pair.getValue() > max)
                max = pair.getValue();
        }
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if(pair.getValue().equals(max))
                System.out.println(pair.getKey());
        }

    }
    }


