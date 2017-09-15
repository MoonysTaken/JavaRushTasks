package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat formDateOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        SimpleDateFormat defFormat = new SimpleDateFormat();

        if (args[0].equals("-c") && args[2].equals("м")) {
            Date date = dateFormat.parse(args[3]);
            allPeople.add(Person.createMale(args[1], date ));
            System.out.println(allPeople.size() - 1);
            }
        else if (args[0].equals("-c") && args[2].equals("ж")) {
            Date date = dateFormat.parse(args[3]);
            allPeople.add(Person.createFemale(args[1], date));
            System.out.println(allPeople.size() - 1);
        }


        if(args[0].equals("-u") && args[3].equals("ж")) {
            Date date = dateFormat.parse(args[4]);
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(date);
        }
        else if (args[0].equals("-u") && args[3].equals("м")) {
            Date date = dateFormat.parse(args[4]);
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(date);
        }

        if (args[0].equals("-d")) {
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
        }

        if (args[0].equals("-i")) {
            String date = formDateOut.format(allPeople.get(Integer.parseInt(args[1])).getBirthDay());
          String  s;
          if (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.FEMALE))
              s = "ж";
          else s = "м";
            System.out.print(allPeople.get(Integer.parseInt(args[1])).getName() + " " + s + " " + date);
        }

        }
    }



