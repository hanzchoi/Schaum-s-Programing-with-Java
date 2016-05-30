package com.nyc.personabe1984.chapter2;

/**
 * Rewrite the program in ex 2.7 so that it does not use composition.
 */

public class D {

    public static void main(String[] args) {
        String inventor = "Charles Babbage";

        System.out.println(inventor);

        String temp = inventor.replace('B', 'C');
        System.out.println(temp);

        temp = inventor.replace('a', 'o');
        System.out.println(temp);

        System.out.println(inventor);
    }
}
