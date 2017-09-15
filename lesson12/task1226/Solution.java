package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {
    interface Run {
        void run();
    }
    interface Climb {
        void climb();
    }
    interface Fly {
        void fly();
    }

    public class Cat implements Run, Climb {
        public void run() {}
        public void climb() {}
    }

    public class Dog implements Run {
        public void run() {}
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Fly, Run {
        public void run() {}
        public void fly(){}
    }
}
