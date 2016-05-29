package com.nyc.personabe1984.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * write a program that inputs an integer that represents a temperature on the Fahrenheit scale
 * and then computes and prints its equivalent Celsius value.
 * Use the conversion formula C = 5(F-32)/9
 */

public class F {

    public static void main(String[] args) throws IOException {
        int celsius, fahrenheit;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a Fahrenheit value: ");
        fahrenheit = Integer.parseInt(in.readLine());

        celsius = 5 * (fahrenheit-32) / 9;
        System.out.println("The equivalent Celsius value is " + celsius);
    }
}
