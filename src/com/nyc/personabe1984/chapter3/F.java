package com.nyc.personabe1984.chapter3;

import java.util.Random;

/**
 * 3.6
 * Write and run a program that generates a random integer and reports whether it is divisible by 2, by 3,or by 5
 * hint: n is divisible by d if the remainder from dividing n by d is 0
 */

public class F {

    public static void main(String[] args){
        Random random = new Random();
        int randomInteger = random.nextInt();
        System.out.println("The integer value is " + randomInteger);
        if(randomInteger % 2 ==0){
            System.out.println(randomInteger + " is divisible by 2");
        }else if(randomInteger % 3 == 0){
            System.out.println(randomInteger + " is divisible by 3");
        }else if(randomInteger % 5 == 0){
            System.out.println(randomInteger + " is divisible by 5");
        }else{
            System.out.println(randomInteger + " is not divisible by 2, 3, or 5");
        }
    }
}
