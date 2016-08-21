package com.nyc.personabe1984.chapter4.Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Random;


public class RockScissorsPaper {
    public static void main(String[] args) throws IOException{
        Reader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        Random random = new Random();
        final String CHOICES = "RSPQ";
        final String NAME = "Rock    ScissorsPaper   ";
        int y=0, z=0;  // your choice, my choice
        System.out.println("Welcome to the Rock, Scissors, Paper game. \n"
            + "You and I will simultaneously pick one of those three choices. \n"
            + "Rock breaks scissors, scissors cut paper, paper wraps rock.");
        System.out.println("(Enter Q to quit.)");
        do{
            System.out.print("Enter your choice? (R/S/P/Q): ");
            y = CHOICES.indexOf(input.readLine().toUpperCase().charAt(0));
            if(y < 0){
                System.out.println("You must enter either 'R', 'S', or 'P'.");
                continue;
            }
            if(y > 2){
                break;
            }
            z = random.nextInt(3); // 0, 1, or 2
            System.out.println("\tYou chose " + NAME.substring(8*y, 8*y+8));
            System.out.println("\t  I chose " + NAME.substring(8*z, 8*z+8));
            if(y==z){
                System.out.println("\tWe tied.");
            }else if(y==0 && z==1 || y==1 && z==2 || y==2 && z==0){
                System.out.println("\tYou won.");
            }else{
                System.out.println("\tI won.");
            }
        }while(true);
    }
}
