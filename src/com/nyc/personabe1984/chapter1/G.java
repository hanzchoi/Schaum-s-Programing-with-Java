package com.nyc.personabe1984.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * write a program that inputs an integer that represents a temperature on the Celsius scale
 * and then computes and prints its equivalent Fahrenheit value.
 * Use the conversion formula F=1.8C+32
 */
public class G {

    public static void main(String[] args) throws IOException {
        int celsius;
        double fahrenheit;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a Celsius value: ");
        celsius = Integer.parseInt(in.readLine());

        fahrenheit = 1.8 * celsius + 32;
        System.out.println("The equivalent Fahrenheit value is " + fahrenheit);
    }
}
