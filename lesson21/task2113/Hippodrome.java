package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladimir on 15.09.2017.
 */
public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public Horse getWinner(){
      if (horses.get(0).getDistance() > horses.get(1).getDistance() &&  horses.get(0).getDistance() > horses.get(2).getDistance() )
          return horses.get(0);
      else if (horses.get(1).getDistance() > horses.get(0).getDistance() &&  horses.get(1).getDistance() > horses.get(2).getDistance() )
          return horses.get(1);
      else return horses.get(2);
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public void run() throws InterruptedException {
        for(int i = 0; i < 100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for (int i = 0; i < horses.size(); i++)
            getHorses().get(i).move();
    }

    public void print(){
        for (int i = 0; i < horses.size(); i++)
            horses.get(i).print();
        for (int i = 0; i < 10; i++)
            System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> list = new ArrayList<>(); //?Array?
        list.add(new Horse("horse1", 3, 0));
        list.add(new Horse("horse2", 3, 0));
        list.add(new Horse("horse3", 3, 0));
        game = new Hippodrome(list);
        game.run();
        game.printWinner();
    }

}
