package com.nyc.personabe1984.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Prompt the user for his or her last name seperately and then prints a greeting like this:
 * Enter your last name: Choi
 * Enter your first name: Hans
 * Hello, Hans Choi
 */
public class C {

    public static void main(String[] args) throws IOException {
        String firstName, lastName;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your last name: ");
        lastName = in.readLine();

        System.out.print("Enter your first name: ");
        firstName = in.readLine();

        System.out.printf("Hello, %s %s", firstName, lastName);
    }
}
