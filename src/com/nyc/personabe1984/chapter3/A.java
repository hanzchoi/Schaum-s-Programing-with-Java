package com.nyc.personabe1984.chapter3;

import java.util.Random;

/**
 * Write and run a Java program that generate a random integer, test whether it is positive, and reports
 * if it is.
 */

public class A {

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt();
        System.out.printf("The random number is %s" , n);
        if(n > 0){
            System.out.println(n + " is a positive number");
        }else {
            System.out.println(n + " is a negative number");
        }
    }
}
