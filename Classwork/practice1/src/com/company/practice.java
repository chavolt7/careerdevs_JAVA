package com.company;

public class practice {
    public static int getNum(){
        return 2;
    }
    public static int fib (int number){

        int a = 0;
        int b = 1;
        int c = a + b;
        if (number == 1){
            return number;
        }
        for (int i = 1; i < number; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;

    }
}

//public static boolean isleapYear(int year){
//    if (year % 4 != 0){
//}
//}