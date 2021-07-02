package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DrinkDispenser cliffDispenser = new DrinkDispenser(5, 8, 12);

        cliffDispenser.small.refill(20);
        cliffDispenser.medium.refill(15);
        cliffDispenser.large.refill(12);


        cliffDispenser.addSyrup(new Syrup("Purple", 1000));
        cliffDispenser.addSyrup("Blue Drink",600 );
        cliffDispenser.addSyrup(new Syrup("Orange", 750));
        cliffDispenser.addSyrup("Dr. cliff", 1000);

        System.out.printf("m cup: %d\tdrink 3 vol: %d\n", cliffDispenser.medium.qty, cliffDispenser.syrups.get(3).getVol());
        cliffDispenser.serveDrink("M", 3);
        System.out.printf("m cups: %d\tdrink 3 vol: %d\n", cliffDispenser.medium.qty, cliffDispenser.syrups.get(3).getVol());
        System.out.println(cliffDispenser.lowSyrups(100));
        cliffDispenser.serveDrink("L", 3);
        System.out.println(cliffDispenser.lowSyrups(100));





    }
}
