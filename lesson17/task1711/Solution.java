package com.javarush.task.task17.task1711;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat formDateOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 2; i < args.length; i += 3) {
                        if (args[i].equals("м")) {
                            Date date = dateFormat.parse(args[i + 1]);
                            allPeople.add(Person.createMale(args[i - 1], date));
                            System.out.println(allPeople.size() - 1);
                        } else if (args[i].equals("ж")) {
                            Date date = dateFormat.parse(args[i + 1]);
                            allPeople.add(Person.createFemale(args[i - 1], date));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;
                }

            case "-u":
                synchronized (allPeople) {
                    for (int i = 3; i < args.length; i += 4) {
                        if (args[i].equals("ж")) {
                            Date date = dateFormat.parse(args[i + 1]);
                            int n = Integer.parseInt(args[i - 2]);
                            allPeople.get(n).setName(args[i - 1]);
                            allPeople.get(n).setSex(Sex.FEMALE);
                            allPeople.get(n).setBirthDay(date);
                        } else if (args[i].equals("м")) {
                            Date date = dateFormat.parse(args[i + 1]);
                            int n = Integer.parseInt(args[i - 2]);
                            allPeople.get(n).setName(args[i - 1]);
                            allPeople.get(n).setSex(Sex.MALE);
                            allPeople.get(n).setBirthDay(date);
                        }
                    }
                    break;
                }

            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int n = Integer.parseInt(args[i]);
                        allPeople.get(n).setName(null);
                        allPeople.get(n).setBirthDay(null);
                        allPeople.get(n).setSex(null);
                    }
                    break;
                }


            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int n = Integer.parseInt(args[i]);
                        String date = formDateOut.format(allPeople.get(n).getBirthDay());
                        String  s;
                        if (allPeople.get(n).getSex().equals(Sex.FEMALE))
                            s = "ж";
                        else s = "м";
                        System.out.print(allPeople.get(n).getName() + " " + s + " " + date);
                        System.out.println();
                    }
                    break;
                }


        }



    }
}
