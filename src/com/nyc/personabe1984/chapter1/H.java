package com.nyc.personabe1984.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * T = 40 + c / 4
 * crickets tend to chirp in the summer at a rate that is related to the temperature
 * c is the number of chirps per minute
 * T is the temperature in Fahrenheit degrees
 * Write a program that inputs a chirps per min and output the temp in decimal form
 */

public class H {

    public static void main(String[] args) throws IOException{
        double fahrenheit;
        int chirpPerMin;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of chirps per minute: ");
        chirpPerMin = Integer.parseInt(in.readLine());

        fahrenheit = 40 + (chirpPerMin / 4.0);
        System.out.printf("The temperature is %s degrees Fahrenheit.", fahrenheit);
    }
}
