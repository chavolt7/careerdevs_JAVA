package com.company;

public class Dog {

    public String breed;
    public String snoutLength;
    // chipid isHousebroken, isServiceDog, energylevel,
    public String chipId;
    public Dog(
            int legs,
            String size,
            boolean isFixed,
            String name,
            double weight,
            String breed,
            String snoutLength,
            String chipId

    ){
        super(legs, size, isFixed, weight);
    }
    public static void main(String[] args) {
        // write your code here
    }
}
