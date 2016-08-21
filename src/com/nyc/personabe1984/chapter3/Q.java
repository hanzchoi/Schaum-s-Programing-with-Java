package com.nyc.personabe1984.chapter3;

import java.util.Random;

/**
 * 3.17
 * write a program that generates a random double, determines which decile of the unit interval it is in,
 * and reports it. A decile is one of the ten equal sized pieces of the whole. The first decile of the
 * unit interval is the subinterval from 0.0 ro 0.1, the second decile is the suninterval from 0.1 to 0.2,
 * the third decile is the subinterval from 0.2 to 0.3, etc.
 */

public class Q {
    public static void main(String[] args) {
        Random random = new Random();
        double n = random.nextDouble();
        System.out.println("n = " + n);

        if(n > 0.0 && n < 0.1){
            System.out.println("n is in first decile: subinterval from 0.0 to 0.1");
        }else if(n > 0.1 && n < 0.2){
            System.out.println("n is in second decile: subinterval from 0.1 to 0.2");
        }else if(n > 0.2 && n < 0.3){
            System.out.println("n is in third decile: subinterval from 0.2 to 0.3");
        }else if(n > 0.3 && n < 0.4){
            System.out.println("n is in fourth decile: subinterval from 0.3 to 0.4");
        }else if(n > 0.4 && n < 0.5){
            System.out.println("n is in fifth decile: subinterval from 0.4 to 0.5");
        }else if(n > 0.5 && n < 0.6){
            System.out.println("n is in sixth decile: subinterval from 0.5 to 0.6");
        }else if(n > 0.6 && n < 0.7){
            System.out.println("n is in seventh decile: subinterval from 0.6 to 0.7");
        }else if(n > 0.7 && n < 0.8){
            System.out.println("n is in eighth decile: subinterval from 0.7 to 0.8");
        }else if(n > 0.8 && n < 0.9){
            System.out.println("n is in ninth decile: subinterval from 0.8 to 0.9");
        }else if(n > 0.9 && n < 1.0){
            System.out.println("n is in tenth decile: subinterval from 0.9 to 1.0");
        }

    }
}
