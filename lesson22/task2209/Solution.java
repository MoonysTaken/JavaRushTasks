package com.javarush.task.task22.task2209;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        try (
                Scanner sc = new Scanner(System.in);
                BufferedReader r = new BufferedReader(new FileReader(sc.nextLine()));
        ){
            ArrayList<String> list = new ArrayList<>();
            while (r.ready())
                list.addAll(Arrays.asList(r.readLine().split(" ")));
            String[] strings = new String[list.size()];
            strings = list.toArray(strings);
            StringBuilder result = getLine(strings);
            System.out.println(result.toString());
        }
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder sb = new StringBuilder();
        if (words.length == 0) return sb;
        sb.append(words[0]);
        for (int j = 1; j < words.length; j++) {
            for (int i = 1; i < words.length; i++) {
                String word = words[i];
                if (word != null && word.toLowerCase().charAt(0) == sb.charAt(sb.length() - 1)) {
                    sb.append(" " + word);
                    words[i] = null;
                } else if (word != null && word.toUpperCase().charAt(word.length() - 1) == sb.charAt(0)) {
                    sb.insert(0, word + " ");
                }
            }
        }
        return sb;
    }
}
