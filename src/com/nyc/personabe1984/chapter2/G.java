package com.nyc.personabe1984.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a program that inputs a name in the form first Middle Last and then
 * prints it in the form Last, First M., where "M" is the person's middle initial.
 * For example, the input would be
 *      William Jefferson Clinton
 * would produce the output
 *      Clinton, William J.
 */
public class G {

    public static void main(String[] args) throws IOException{
        String mName, mLastName, mFirstName, mMiddleName;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name in a form of First Middle Last: ");
        mName = in.readLine();

        int i = mName.indexOf(' ');
        int j = mName.lastIndexOf(' ');

        mFirstName = mName.substring(0, i);
        mMiddleName = mName.substring(i+1, j);
        mLastName = mName.substring(j+1, mName.length());

        System.out.printf("%s, %s %s.", mLastName, mFirstName, mMiddleName.charAt(0));

    }
}
