package com.nyc.personabe1984.chapter3;

import java.util.Random;

/**
 * 3.16
 * Write a program that generates four random integers in the range 0 to 999 inclusive,
 * determines their minimum and their maximum, and prints them both.
 */
public class P {
    public static void main(String[] args) {
        Random random = new Random();
        int mOne, mTwo, mThree, mFour, mMax, mMin;

        mOne = random.nextInt(998);
        mTwo = random.nextInt(998);
        mThree = random.nextInt(998);
        mFour = random.nextInt(998);

        System.out.println(mOne);
        System.out.println(mTwo);
        System.out.println(mThree);
        System.out.println(mFour);

        int[] arr = {mOne, mTwo, mThree, mFour};

        mMax = mOne;
        mMin = mOne;

        for(int i = 0; i < arr.length; i++){
            if(mMax < arr[i]){
                mMax = arr[i];
            }else{
                mMin = arr[i];
            }
        }

        System.out.println("The Max is " + mMax);
        System.out.println("The Min is " + mMin);

    }
}
