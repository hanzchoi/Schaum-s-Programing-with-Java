package com.nyc.personabe1984.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3.11
 * Write a program that inputs the name of the month and then process it by:
 *      a. echoing the input
 *      b. extracting the first three letters
 *      c. capitalizing them
 *      d. printing the abbreviation
 *      e. extracting each of the three letter as a separate char variable
 *      f. using the nested if and if...else statement to identify the number of the month from the char variable
 *      g. print the number of the month
 *
 *  Here is a sample run:
 *      Enter the month: February
 *      You entered February
 *      Its abbreviation is FEB
 *      This is month number 2
 */
public class K {
    public static void main(String[] args) throws IOException{
        String mMonth, mThreeLettersOfTheMonth;
        int mNumberOfTheMonth = -1;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\tEnter the month: ");
        mMonth = in.readLine();
        System.out.println("\tYou entered " + mMonth);

        mThreeLettersOfTheMonth = mMonth.substring(0,3).toUpperCase();
        System.out.println("\tIts abbreviation is " + mThreeLettersOfTheMonth);

        if(mThreeLettersOfTheMonth.charAt(0) == 'A'){
            if(mThreeLettersOfTheMonth.charAt(1) == 'P'){
                mNumberOfTheMonth = 4;
            }else{
                mNumberOfTheMonth = 8;
            }
        }else if(mThreeLettersOfTheMonth.charAt(0) == 'J'){
            if(mThreeLettersOfTheMonth.charAt(1) == 'A'){
                mNumberOfTheMonth = 1;
            }else if(mThreeLettersOfTheMonth.charAt(1) == 'U'){
                if(mThreeLettersOfTheMonth.charAt(2) == 'N'){
                    mNumberOfTheMonth = 6;
                }else{
                    mNumberOfTheMonth = 7;
                }
            }
        }else if(mThreeLettersOfTheMonth.charAt(0) == 'F'){
            mNumberOfTheMonth = 2;
        }else if(mThreeLettersOfTheMonth.charAt(0) == 'M'){
            if(mThreeLettersOfTheMonth.charAt(2) == 'R'){
                mNumberOfTheMonth = 3;
            }else{
                mNumberOfTheMonth = 5;
            }
        }else if(mThreeLettersOfTheMonth.charAt(0) == 'A'){
            mNumberOfTheMonth = 8;
        }else if(mThreeLettersOfTheMonth.charAt(0) == 'S'){
            mNumberOfTheMonth = 9;
        }else if(mThreeLettersOfTheMonth.charAt(0) == 'O'){
            mNumberOfTheMonth = 10;
        }else if(mThreeLettersOfTheMonth.charAt(0) == 'N'){
            mNumberOfTheMonth = 11;
        }else{
            mNumberOfTheMonth = 12;
        }

        System.out.println("\tThis is the month number " + mNumberOfTheMonth);
    }
}
