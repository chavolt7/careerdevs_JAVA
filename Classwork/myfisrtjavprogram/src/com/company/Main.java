package com.company;

//public class Main {

//    public static void main(String[] args) {
//	// write your code here
//        String word = "Hello world";
//        int number1 = 0;
//        System.out.println(word);// console.log
//        System.out.println(number1);
//    }
//}

class Calc {
    public static int sumTotal(int n){


    //sum all number from 1 up to n
    // let total = 0
    int total = 0;
     for(int i = 1; i <= n; System.out.println(i);{
    //total += i

        total += i++;
    }
     return total;

}

public static int sumTotal(int n){

// use a while loop
    int total = 0, i = 0;
    total = i =0;
    while (i <= n ){
        total += i++;
    }
    return  total;
}

public static int sumEvens(int n){
    // sum all even number from 2 to n
    // to test if even n % 2 == 0
    int total = 0;
    for (int i = 2; i <= n; i++){
        if (i % 2 == 0){
            total += i;
        }
    }
    return  total;
}
public  class Main {
    public  static   void  main(String[] args){
        System.out.println(Calc.sumEvens( n: 10));
    }
}