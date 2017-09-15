package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;

/* 
User, Looser, Coder and Proger
*/

public class Solution implements Person {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

         while (true)
        {
            key = reader.readLine();
            if (key.equals("user")) {
                person = new User();
                doWork(person);
            }
            else if (key.equals("loser")) {
                person = new Loser();
                doWork(person);
            }
            else if (key.equals("coder")) {
                person = new Coder();
                doWork(person);
            }
            else if (key.equals("proger")) {
                person = new Proger();
                doWork(person);
            }
            else break;
        }
    }

    public static void doWork(Person person) {
        if (person instanceof User)
            ((User) person).live();
        if (person instanceof Loser)
            ((Loser) person).doNothing();
        if (person instanceof Coder)
            ((Coder) person).coding();
        if (person instanceof Proger)
            ((Proger) person).enjoy();
    }
}
