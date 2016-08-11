package com.nyc.personabe1984.chapter4.Examples;


public class LabeledBreak {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            resume:
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    System.out.print("\n" + i + " " + j + " " + k);
                    if(i == 1 && j == 2 && k == 0)break resume;
                }
                System.out.print("\tEnd of k loop; j = " + j);
            }
            System.out.print("\tEnd of j loop; i = " + i);
        }
        System.out.print("\tEnd of i loop.");
    }
}
