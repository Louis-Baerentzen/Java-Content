package com.sparta.lrvb;

public class Fibonacci {

    public static int createFibSeq (int number) {

        int firstValue;
        int secondValue = 1;
        int newValue = 0;
        int fibNumber = 1;


        for (int i = 0; i < number; i++) {
            firstValue = secondValue;
            secondValue = newValue;
            newValue = secondValue + firstValue;
            System.out.println("Fibonacci Number " + fibNumber++ + ": " + newValue);
        }
        return newValue;
    }

}
