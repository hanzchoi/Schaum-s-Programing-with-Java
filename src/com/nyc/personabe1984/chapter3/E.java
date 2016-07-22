package com.nyc.personabe1984.chapter3;

import java.util.Random;

/**
 * 3.5
 * Write a program that generates three random floats and them prints them in their ascending order
 */

public class E {

    public static void main(String[] args) {
        Random random = new Random();
        float[] randomFloat = new float[3];

        for(int i = 0; i < randomFloat.length; i++){
            randomFloat[i] = random.nextFloat();
        }

        for (int i = 0; i < randomFloat.length; i++){
            System.out.print(randomFloat[i] + " ");
        }

        System.out.println();;
        bubbleSort(randomFloat);

        for (int i = 0; i < randomFloat.length; i++){
            System.out.print(randomFloat[i] + " ");
        }

    }

    public static void bubbleSort(float[] array){
        boolean swapped = true;
        int j = 0;

        while(swapped){
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++){
                if(array[i] > array[i+1]){
                    swapNumbers(i, i+1, array);
                    swapped = true;
                }
            }
        }
    }

    private static void swapNumbers(int i, int j, float[] array){
        float temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
