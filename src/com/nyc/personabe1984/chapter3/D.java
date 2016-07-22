package com.nyc.personabe1984.chapter3;

import java.util.Random;

/**
 * 3.4
 * Write a program that generates a random double, determine which quintile of the unit internal it is in,
 * and report it. A quintile is one of the five equal sized pieces of the whole. The quintile of unit interval are
 * 0 to 1/5, 1/5 to 2/5, 2/5 to 3/5, 3/5 to 4/5, and 4/5 to 1.
 */

public class D {

    public static void main(String[] args) {
        Random random = new Random();
        double n = random.nextDouble();

        if(n >= 0 && n<= 1/5.0){
            System.out.printf("%s is between 0 and 1/5", n);
        }else if(n >= 1/5.0 && n <= 2/5.0){
            System.out.printf("%s is between 1/5 and 2/5", n);
        }else if(n >= 2/5.0 && n <= 3/5.0){
            System.out.printf("%s is between 2/5 and 3/5", n);
        }else if(n >= 3/5.0 && n <= 4/5.0){
            System.out.printf("%s is between 3/5 and 4/5", n);
        }else{
            System.out.printf("%s is between 4/5 and 1", n);
        }
    }
}
