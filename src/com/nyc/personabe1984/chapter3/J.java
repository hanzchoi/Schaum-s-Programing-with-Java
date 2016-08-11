package com.nyc.personabe1984.chapter3;

import java.util.Random;

/**
 * 3.10
 * Write a program that generates a random integer in the range of 60 to 99 and then prints the letter grade that would
 * correspond to that score on a test. Use the standard 10 point scale, with a "+" for scores that end with 8 or 9
 * and a "-" for scores that end with 0 or 1. For example, 78 gets a "C+" and 90 gets an "A-".
 */
public class J {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 60 + random.nextInt(40);
        System.out.println("n = " + n);

        int lastDigit = n%10;
        int firstDigit = n/10;

        String grade = "";

        switch (firstDigit){
            case 6:
                grade = "D";
                if(lastDigit == 0 || lastDigit == 1){
                    grade += "-";
                }else if(lastDigit == 8 || lastDigit == 9){
                    grade += "+";
                }
                break;
            case 7:
                grade = "C";
                if(lastDigit == 0 || lastDigit == 1){
                    grade += "-";
                }else if(lastDigit == 8 || lastDigit == 9){
                    grade += "+";
                }
                break;
            case 8:
                grade = "B";
                if(lastDigit == 0 || lastDigit == 1){
                    grade += "-";
                }else if(lastDigit == 8 || lastDigit == 9){
                    grade += "+";
                }
                break;
            case 9:
                grade = "A";
                if(lastDigit == 0 || lastDigit == 1){
                    grade += "-";
                }else if(lastDigit == 8 || lastDigit == 9){
                    grade += "+";
                }
                break;

        }

        System.out.println("Your letter grade is " + grade);
    }
}
