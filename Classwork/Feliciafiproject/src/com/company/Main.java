package com.company;

import java.util.ArrayList;

public class Main {
    //properties variables
    public static ArrayList<Product> productList = new ArrayList<>();

    // methods

    public static void displayProducts (ArrayList<Product> productList){
        for (int i = 0; i < productList.size(); i++){

            System.out.println(productList.get(i));
        }
    }
    public static void displayProducts (ArrayList<Product> productList, String type){
        for (int i = 0; i < productList.size(); i++) {


//            if (type.equals("Fruit")) {
//                if(productList.get(i) instanceof Fruit){
//                    System.out.println(productList.get(i));
//                }
//
//            } else if (type.equals("Meat")) {
//                if(productList.get(i) instanceof Meat){
//                    System.out.println(productList.get(i));
//                }
//
//            } else {
//                System.out.println("error");
//                return;
//            }
            switch (type){
                case "Fruit":
                    switch (String.valueOf (productList.get(i) instanceof Fruit)){
                        case "true":
                            System.out.println(productList.get(i));
                            break;


                    }
                    break;

                case "Meat":
                    switch (String.valueOf (productList.get(i) instanceof Meat)){
                        case "true":
                            System.out.println(productList.get(i));
                            break;
                    }
                    break;


            }
        }
    }
    public static void displayProducts (ArrayList<Product> productList, int i){
        System.out.println(productList.get(i));
    }

    public static void main(String[] args) {
	// write your code here

        //instance variable
        int num = 0;
        Fruit mango = new Fruit("mango", "yellow", 5, 56, "small");
        Fruit banana = new Fruit("banana", "green", 6, 8, "medium");
        Fruit orange = new Fruit("orange","grey", 9, 90, "large");


        Meat beef = new Meat("beef", "red", 8, 56, "heavy");
        Meat stake = new Meat("stake", "red", 9, 70, "light");
        Meat chicken = new Meat("chicken", "white", 5, 56, "feather");


        productList.add(mango);
        productList.add(banana);
        productList.add(orange);


        productList.add(beef);
        productList.add(stake);
        productList.add(chicken);

//        displayProducts(productList);
//        displayProducts(productList,"Meat");
        displayProducts(productList,2);


    }

    }





