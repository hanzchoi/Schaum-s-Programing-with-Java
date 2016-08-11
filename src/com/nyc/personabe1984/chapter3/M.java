package com.nyc.personabe1984.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * 3.13
 * Write a program that interactively reads a student's year of high school graduation and then uses
 * a switch statement to print the student's college classification as either a "freshman," a "sophomore,"
 * a "junior," a "senior," a "graduate," or a "prematriculant" (still in high school).
 * Use this method to obtain the current year
 *
 *      int thisYear = Calendar.getInstance().get(Calendar.YEAR);
 *
 * from the java.util.Calendar class
 */
public class M {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        int mGraduationYear;
        String classification;

        System.out.print("Enter your graduation year: ");
        mGraduationYear = Integer.parseInt(in.readLine());
        mGraduationYear -= thisYear;

        switch(mGraduationYear){
            case 1:
                classification = "Freshman";
                break;
            case 2:
                classification = "Sophomore";
                break;
            case 3:
                classification = "Junior";
                break;
            case 4:
                classification = "Senior";
                break;
            default:
                classification = "Prematriculant";
                break;
        }

        System.out.println("You are a " + classification);
    }
}
