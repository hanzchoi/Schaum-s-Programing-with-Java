package com.nyc.personabe1984.chapter2;

/**
 * Write a program that does the following:
 *  1.Declare a String object named s containing the string "Call me Ishmael"
 *  2.Print the entire string
 *  3.Use the length() method to print the length of the string
 *  4.Use the charAt() method to print the first character in the string
 *  5.Use the charAt() and the length() methods to print the last character in the string
 *  6.Use the indexOf() and the substring() method to print the first word in the string
 */
public class C {
    public static void main(String[] args) {
        String s = "Call me Ishmael";
        System.out.println("The string s is: " + s);
        System.out.println("The length of the string is: " + s.length());
        System.out.println("The first character in the string is " + s.charAt(0));
        System.out.println("The last character in the string is: " + s.charAt(s.length() - 1));
        System.out.println("The first word in the string is: " + s.substring(0,s.indexOf(' ')));
    }
}
