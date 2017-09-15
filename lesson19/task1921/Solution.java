package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static class PersonScannerAdapter {
        private BufferedReader reader;
        public PersonScannerAdapter(BufferedReader reader) {
            this.reader = reader;
        }

        public Person read(String line) throws IOException {
            //if (!scanner.hasNext()) return new Person(null, null, null, null);
            String[] values = line.split(" ");
            String name = values[0];
            for (int i = 1; i < values.length - 3; i++) {
                name += " " + values[i];
            }
            GregorianCalendar calendar = new GregorianCalendar(Integer.parseInt(values[values.length - 1]), Integer.parseInt(values[values.length - 2]) - 1, Integer.parseInt(values[values.length - 3]));
            Person person = new Person(name, calendar.getTime());
            return person;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        PersonScannerAdapter ps = new PersonScannerAdapter(reader);
        String s;
        while ((s = reader.readLine()) != null)
            PEOPLE.add(ps.read(s));
        reader.close();
    }

}