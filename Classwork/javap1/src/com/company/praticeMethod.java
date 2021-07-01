package com.company;

public class praticeMethod {
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

    public static boolean isLeapYear(int year){

        boolean answer = false;

        if((year % 4 == 0)){ // if year is divisiable by 4 is leap year => else is false leap year
            if((year % 100 == 0)){ // if this is divisiable by 4 and divisible by 100 is NOT leap year => else is true leap year
                if((year % 400 == 0)){ // if is divisible by  4  and  100 and  400 its true
                    answer = true;
                }
            }
            else{ //Not divisiable by 100 which makes it good
                answer = true;
            }
        }
        else{//Not divisible by 4 not leap year
            answer = false;
        }
        return answer;
    }
}

