package com.nyc.personabe1984.chapter3;

import java.util.Random;

/**
 * Write and run a java program that generates two random integers, determines their minimum, and prints it.
 */
public class B {

    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();
        int j = random.nextInt();

        System.out.printf("i = %s and j = %s %n", i, j);
        if(i < j){
            System.out.println("\ti is the min");
        }else {
            System.out.println("\tj is the min");
        }
    }
}
