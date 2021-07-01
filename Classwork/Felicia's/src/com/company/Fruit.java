package com.company;

public class Fruit {
    // instance variable
    public String name;
    public String color;
    public double price;
    int quantity;

    // constructor

    public Fruit(String name, String color, double price){
        name = name.toString();
        color = color.toString();
        price = price;
        quantity = quantity;
    }

    public String toString(){
        String diFruits = "Name:" + name + "\ncolor:" + color + "\nprice: $" + price + "quantity:" + quantity;
        return diFruits;
    }


}
