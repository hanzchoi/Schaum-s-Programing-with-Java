package com.nyc.personabe1984.chapter3;

import java.util.Random;

/**
 * 3.9
 * Write a program that generates a random integer in the range 2 to 600 inclusive and then uses nested if..else
 * statements to determine whether it is divisible by 2, 3, 5, 6, 10, 15, and/or 30.
 */
public class I {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 2 + random.nextInt(599);
        System.out.println("n = " + n);
        System.out.print("n is ");

        if(n%2 == 0){
            if(n%3 == 0){
                if(n%5 == 0){
                    System.out.println("divisible by 30");
                }else{
                    System.out.println("divisible by 6 but not 5");
                }
            }else{
                if(n%5 == 0){
                    System.out.println("divisible by 10 but not 2");
                }else{
                    System.out.println("divisible by 2 but not 3 or 5");
                }
            }
        }else{
            if(n%3 == 0){
                if(n%5 ==0){
                    System.out.println("divisible by 15 but not 2");
                }else{
                    System.out.println("divisible by 3 but not 2 or 5");
                }
            }else{
                if(n%5 == 0){
                    System.out.println("divisible by 5 but not 6");
                }else{
                    System.out.println("not divisible by 2, 3, or 5");
                }
            }
        }
    }
}
