package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        BufferedReader buffer = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));

        //Считываем строку, разбиваем на отдельные слова и записываем через пробел только те, которые состоят только из цифр
        while (buffer.ready()){
            String[] numInLine = buffer.readLine().split(" ");
            for (String tmp : numInLine){
                if (tmp.matches("^\\d+$")){
                    writer.write(tmp);
                    writer.write(32);
                }
            }
        }
        //Закрываем потоки и молимся чтобы компилятор не нашел какую-нибудь фигню
        buffer.close();
        writer.close();
        reader.close();

    }
}
