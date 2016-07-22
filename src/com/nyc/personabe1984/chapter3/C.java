package com.nyc.personabe1984.chapter3;

import java.util.Random;

/**
 * 3.3
 * Write and run a program that generates four random integers, determines their maximum, and prints it.
 */
public class C {

    public static void main(String[] args) {
        int[] fourRandomInt = new int[4];

        Random random = new Random();

        for(int i = 0; i < fourRandomInt.length; i++){
            fourRandomInt[i] = random.nextInt();
            System.out.println(fourRandomInt[i]);
        }

        int max = 0;
        for(int i = 0; i < fourRandomInt.length; i++){
            if(max < fourRandomInt[i]){
                max = fourRandomInt[i];
            }
        }

        System.out.println("Maximum is :" + max);


    }
}
