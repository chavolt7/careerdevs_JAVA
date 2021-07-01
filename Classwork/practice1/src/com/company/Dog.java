package com.company;



public class Dog {
    public String name;
    public  int legs = 4;
    public  String hair;


    public Dog(String hair, String name){
        this.hair = hair;
        this.name = name;
    }
    public Dog(String hair, int legs){
        this.hair = hair;
        this.legs = legs;
    }

    public String speak(){
        return "A-woof";
    }
    public  String toString(){
       return "{name: " + name + ", legs" + legs +", hair" + hair + "}";
    }
}
