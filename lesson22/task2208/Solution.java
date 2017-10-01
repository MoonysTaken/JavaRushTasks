package com.javarush.task.task22.task2208;

import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        int size = params.size();
        for(Map.Entry<String, String> pair : params.entrySet()){
            if(!(pair.getValue() == null) && size != 1)
                sb.append(pair.getKey() + " = '" + pair.getValue() + "' and ");
            else if(!(pair.getValue() == null))
                sb.append(pair.getKey() + " = '" + pair.getValue() + "'");
            size--;
        }
        return sb.toString();
    }
}
