package com.nyc.personabe1984.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * write a program that capitalizes a two-word name.
 * For Example, the input
 *      noRtH  CARolIna
 * would produce the output
 *      North Carolina
 */
public class H {

    public static void main(String[] args) throws IOException{
        String mName, mFirst, mSecond;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a two-word name (like noRtH  CARolIna): ");
        mName = in.readLine().toLowerCase();

        int i = mName.indexOf(' ');
        int j = mName.lastIndexOf(' ');

        String firstLetter = mName.substring(0,1).toUpperCase();
        String secondLetter = mName.substring(j+1, j+2).toUpperCase();
        System.out.println( firstLetter + " " + secondLetter);

        mFirst = mName.substring(1, i);
        mSecond = mName.substring(j+2, mName.length());
        System.out.println(mFirst + " " + mSecond);


        System.out.printf(firstLetter + mFirst + " " + secondLetter + mSecond);

    }
}
