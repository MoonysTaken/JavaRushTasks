package com.javarush.task.task15.task1518;

/* 
Статики и котики
. В классе Solution создай класс Cat с публичным полем name типа String.
2. В статическом блоке создай объект типа Cat и присвой его переменной cat(не забудь инициализировать поле name).
3. В классе Cat не создавай конструкторы с параметрами.
4. В статическом блоке выведи имя созданного кота на экран.
*/

public class Solution {

    public static Cat cat;
    static {
        Cat hui = new Cat();
        cat = hui;
        cat.name = "Pes";
        System.out.println(cat.name);
    }
    static class Cat {
        public String name;

    }

    public static void main(String[] args) {

    }
}
