package com.nyc.personabe1984.chapter3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3.12
 * Mod the problem 3.11, replacing the nested if and if...else... statement with 12 parallel if statements.
 * For example
 *      if(month.equals("FEB")) n = 2;
 */

public class L {

    public static void main(String[] args) throws IOException{
        String mMonth, mThreeLettersOfTheMonth;
        int n = -1;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\tEnter the month: ");
        mMonth = in.readLine();
        System.out.println("\tYou entered " + mMonth);

        mThreeLettersOfTheMonth = mMonth.substring(0,3).toUpperCase();
        System.out.println("\tIts abbreviation is " + mThreeLettersOfTheMonth);

        if(mThreeLettersOfTheMonth.equals("JAN")) n = 1;
        if(mThreeLettersOfTheMonth.equals("FEB")) n = 2;
        if(mThreeLettersOfTheMonth.equals("MAR")) n = 3;
        if(mThreeLettersOfTheMonth.equals("APR")) n = 4;
        if(mThreeLettersOfTheMonth.equals("MAY")) n = 5;
        if(mThreeLettersOfTheMonth.equals("JUN")) n = 6;
        if(mThreeLettersOfTheMonth.equals("JUL")) n = 7;
        if(mThreeLettersOfTheMonth.equals("AUG")) n = 8;
        if(mThreeLettersOfTheMonth.equals("SEP")) n = 9;
        if(mThreeLettersOfTheMonth.equals("OCT")) n = 10;
        if(mThreeLettersOfTheMonth.equals("NOV")) n = 11;
        if(mThreeLettersOfTheMonth.equals("DEC")) n = 12;

        System.out.println("\tThis is the month number " + n);


    }
}
