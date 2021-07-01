package com.company;

public class Fruit extends Product{
    public String size;
//constructor
    public Fruit(String name, String color, double price, int quantity, String size) {
        super(name, color, price, quantity);
        this.size = size;

    }
    public Fruit (){
        super();
    }

}

