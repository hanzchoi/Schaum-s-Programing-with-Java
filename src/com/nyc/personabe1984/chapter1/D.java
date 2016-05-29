package com.nyc.personabe1984.chapter1;

/**
 * Recompile and run the Wrong program in Example 1.7 without the parentheses around the expression n +n
 * at the line 5 and n + n + n at line 6. explain the output.
 */

public class D {

    public static void main(String[] args) {
        int n = 1000000000;
        System.out.println("One Million:\t" + n);
        System.out.println("Two Million:\t" + n + n);
        System.out.println("Two Million:\t" + (n + n));
        System.out.println("Three Million:\t" + (n + n + n) );
        System.out.println("Three Million:\t" + n + n + n );

        //With out the parentheses the n becomes a string and when you add string
        //the java will print out two strings attached to each other
        //Two Million:	10000000001000000000


    }
}
