package com.nyc.personabe1984.chapter3;


import java.util.Random;

/**
 * 3.15
 * write a program that generates two random integers in the range 0 to 99 inclusive,
 * determine their and maximum and print it.
 */
public class O {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(98);
        int m = random.nextInt(98);

        System.out.println("n = " + n);
        System.out.println("m = " + m);

        if(n > m){
            System.out.println("The max is " + n);
        }else{
            System.out.println("The max is " + m);
        }

    }
}
