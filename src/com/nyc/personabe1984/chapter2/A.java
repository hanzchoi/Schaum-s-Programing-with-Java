package com.nyc.personabe1984.chapter2;

/**
 * Mod ex2.1 so that it prints your name and its attributes
 */
public class A {

    public static void main(String[] args) {
        String mName = "Hans Choi";
        System.out.println("This string is: " + mName);
        System.out.println("It's length is: " + mName.length());
        System.out.println("The character at index 4 is: " + mName.charAt(4));
        System.out.println("The index of the character Z is: " + mName.indexOf('Z'));
        System.out.println("The lowercase version is: " + mName.toLowerCase());
        System.out.println("The string is still: " + mName);
    }
}
