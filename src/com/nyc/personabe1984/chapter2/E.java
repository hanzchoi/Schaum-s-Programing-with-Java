package com.nyc.personabe1984.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * write a program that enters 10-digit string as a typical U.S telephone number,
 * extract the 3-digit area code, the 3-digit "exchange," and the remaining 4-digit number as
 * separate strings, prints them, and then prints the complete telephone number in the usual formatting.
 * A sample run might look like this:
 *  Enter 10-digit telephone number: 1234567890
 *  You entered 1234567890
 *  The area code is 123
 *  The exchange is 456
 *  The number is 7890
 *  The complete telephone number is (123)456-7890
 */
public class E {
    public static void main(String[] args) throws IOException{
        String mFullPhoneNumber;
        String mAreaCode, mExchange, mNumber;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter 10-digit telephone number: ");
        mFullPhoneNumber = in.readLine();
        System.out.println("You entered " + mFullPhoneNumber);

        mAreaCode = mFullPhoneNumber.substring(0,3);
        mExchange = mFullPhoneNumber.substring(3,6);
        mNumber = mFullPhoneNumber.substring(6,mFullPhoneNumber.length());

        System.out.println("The area code is " + mAreaCode);
        System.out.println("The exchange is " + mExchange);
        System.out.println("The number is " + mNumber);
        System.out.printf("The complete telephone number is (%s)%s-%s", mAreaCode, mExchange, mNumber);


    }
}
