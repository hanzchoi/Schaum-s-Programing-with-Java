package com.nyc.personabe1984.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *3.7
 * Write a program that inputs three names and then prints them in their increasing alphabetical order. Use the String
 * class method compareTo().
 * For example, if s1 is the string ABACADABRA and s2 is the string ABLE, then s1.compareTo(s2)
 * will be a negative integer, s2.compareTo(s2) will be a 0,and s2.compareTo(s1) will be a positive integer.
 * So the condition (s1.compareTo(s2) <= 0) can be used to determine whether s1 precedes s2 lexicographically.
 *
 */
public class G {

    public static void main(String[] args) throws IOException{
        String s1 = "", s2 = "", s3 = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first name: ");
        s1 = in.readLine();
        System.out.print("Enter the second name: ");
        s2 = in.readLine();
        System.out.print("Enter the third name: ");
        s3 = in.readLine();

        if(s1.compareTo(s2) <= 0) { //meaning that s1 is before s2 ex: AA and AB
            if(s3.compareTo(s1) <= 0){
                System.out.println(s3 + " " + s1 + " " + s2);
            }else if(s3.compareTo(s2) <= 0){  // when s3 is after s1
                System.out.println(s1 + " " + s3 + " " + s2 );
            }else{
                System.out.println(s1 + " " + s2 + " " + s3);
            }
        }else{ //when s2 is before s1
            if(s3.compareTo(s2) <= 0){
                System.out.println(s3 + " " + s2 + " " + s1);
            }else if(s3.compareTo(s1) <= 0){
                System.out.println(s2 + " " + s3 + " " + s1);
            }else{
                System.out.println(s2 + " " + s1 + " " + s3);
            }

        }
    }
}

/**
 * pos com
 * s1 s2 s3 check
 * s1 s3 s2 check
 * s2 s1 s3 check
 * s2 s3 s1 check
 * s3 s1 s2 check
 * s3 s2 s1 check
 */
