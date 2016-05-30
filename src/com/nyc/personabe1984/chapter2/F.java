package com.nyc.personabe1984.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The Y2K problem was that many of old software system around the world had been using only two digits
 * for the year in stored dates. It was feared that on January 1, 2000, those dates were likely to be
 * misinterpreted by the software as being January 1, 1900, thus causing unpredictable errors ad system crashes.
 *
 * Write a program that inputs a date in the form mm/dd/yy and outputs in the expanded form mm/dd/19yy.
 * For example, the input 06/30/98 would be printed as 06/30/1998
 */

public class F {

    public static void main(String[] args) throws IOException{
        String mDate, mMonthAndDay, mYear;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a date in mm/dd/yy format: ");
        mDate = in.readLine();
        mMonthAndDay = mDate.substring(0,6);
        mYear = "19" + mDate.substring(6,mDate.length());

        System.out.println("The expanded form will be: " + mMonthAndDay + mYear);
    }
}
