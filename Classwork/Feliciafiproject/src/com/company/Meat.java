package com.company;

public class Meat extends Product{
    public String weight;
    public Meat(String name, String color, double price, int quantity, String weight){
        super(name, color, price, quantity);
        this.weight = weight;

    }
        public Meat (){
        super();
        }

}
