package com.javarush.task.task13.task1326;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        while (fileReader.ready()) {
            int i = Integer.parseInt(fileReader.readLine());
            if (i % 2 == 0)
            list.add(i);
        }
        Collections.sort(list);
       for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
       fileReader.close();
       reader.close();
    }
}
