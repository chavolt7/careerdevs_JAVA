package com.company;

public class Product {
    // instance variable
    public String name;
    public String color;
    public double price;
    public int quantity;

    // constructor

    public Product (String name, String color, double price, int quantity){
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(){
        this.name = "";
        this.color = "";
        this.price = 0.0;
        this.quantity = 0;
    }


    public String toString(){
        String diFruits = "Name:" + name + "\t\tcolor:" + color + "\t\tprice: $" + price + "\t\tquantity:" + quantity;
        return diFruits;
    }


}
