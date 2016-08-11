package com.nyc.personabe1984.chapter3;


import java.util.Random;

/**
 * 3.14
 * write a program that generates a random integer in the range 0 to 99 inclusive,
 * and then tests and report whether it is even or not
 */
public class N {

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(98);

        System.out.println("n = " + n);
        if(n%2 == 0){
            System.out.println("n is even");
        }else{
            System.out.println("n is not even");
        }
    }
}
