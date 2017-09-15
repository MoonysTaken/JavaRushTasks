package com.javarush.task.task20.task2003;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        load(inputStream);
        reader.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties tmp_properties = new Properties();
        for (Map.Entry<String, String> stringStringEntry : properties.entrySet()) {
            tmp_properties.put(stringStringEntry.getKey(), stringStringEntry.getValue());
        }
        tmp_properties.save(outputStream, null);
        outputStream.flush();
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties tmp_properties = new Properties();
        tmp_properties.load(inputStream);
        for (Map.Entry<Object, Object> objectObjectEntry : tmp_properties.entrySet()) {
            properties.put((String)objectObjectEntry.getKey(), (String)objectObjectEntry.getValue());
        }
    }
}
