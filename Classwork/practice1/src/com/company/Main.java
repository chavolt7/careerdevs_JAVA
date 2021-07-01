package com.company;
import  java.util.*;
public class Main {

    public static void main(String[] args) {
//       practice.getNum();
//        System.out.println(practice.getNum());
//        // write your code here
//        System.out.println(practice.fib( 10));

        int[] arr = new int[4];
        arr[3] = 3;
        List<Integer> list = new ArrayList<>();
        List<Dog> myDogs = new ArrayList<>();

        list.add(8);
        list.add(3);
        list.add(42);
        list.add(3000);
        System.out.println(list);

        myDogs.add(new Dog("Short", "Rufus"));
        myDogs.add(new Dog("Long", "Fito"));
        myDogs.add(new Dog("Medium", "Holy"));
        myDogs.add(new Poodle("White", "Poodle"));
        System.out.println(myDogs);

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }
        for (Dog dog : myDogs){
          System.out.println(dog.details());
          if (dog instanceof Poodle){
              System.out.println(((Poodle) dog).dance());
          }
        }
    }
}
