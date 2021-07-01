package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        DecimalFormat roundingOnePlace = new DecimalFormat(".#");
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";



        /* Declare second integer, double, and String variables. */
        int secondInteger;
        double secondDouble;
        String  secondString;
        Scanner input = new Scanner(System.in);// input statement


        secondInteger = input.nextInt();// when you type put here
        secondDouble = input.nextDouble();
        input.next();
        secondString = input.nextLine();


        int sumInteger = secondInteger + i;
        String sumDouble = roundingOnePlace.format(secondDouble + d);
        String sumString = s + secondString;

        System.out.println( sumInteger);
        System.out.println( sumDouble);
        System.out.println( sumString);

        /* Read and save an integer, double, and String to your variables.*/

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */


        input.close();
    }
}