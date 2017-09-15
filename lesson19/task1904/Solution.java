package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            ArrayList<String> list = new ArrayList<>();
            while (fileScanner.hasNext()){
                list.add(fileScanner.next());
            }
            String lastName = list.get(0);
            String firstName = list.get(1);
            String middleName = list.get(2);
            int day = Integer.parseInt(list.get(3));
            int month = Integer.parseInt(list.get(4));
            month -= 1;
            int year = Integer.parseInt(list.get(5));
            year -= 1900;
            Date date = new Date(year, month, day);
            return new Person(firstName, middleName, lastName, date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
