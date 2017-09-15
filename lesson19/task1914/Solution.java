package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();
        String[] strings = result.split(" ");
        if(strings[1].equals("+"))
            result += Integer.parseInt(strings[0]) + Integer.parseInt(strings[2]);
        else if (strings[1].equals("-"))
            result += Integer.parseInt(strings[0]) - Integer.parseInt(strings[2]);
        else if (strings[1].equals("*"))
            result += Integer.parseInt(strings[0]) * Integer.parseInt(strings[2]);
        //Возвращаем все как было
        System.setOut(consoleStream);
        System.out.print(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

