package com.nyc.personabe1984.chapter1;

/**
 * Initialize an integer variable n with the value 5814 and then use the quotient and remainder
 * operators to extract and print each digit of n the output should look like this:
 * n = 5814
 * The digit of n are 5, 8, 1, and 4
 */
public class E {

    public static void main(String[] args) {
        int n = 5814;
        int thousand, hundred, ten, one;

        thousand = n / 1000;
        hundred = (n - thousand * 1000) / 100;
        ten = (n % 100) / 10;
        one = n % 10;

        System.out.printf("n = %s \n", n );
        System.out.printf("The digit of n are %s, %s, %s, and %s \n" , thousand, hundred, ten, one);
    }
}
