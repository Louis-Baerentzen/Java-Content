package com.sparta.lrvb;

public class PrintThis {
    public static void printMyResults(int number) {

        System.out.println( "\nThe number " + number + ", in the Fibonacci sequence is: "
                + Fibonacci.createFibSeq(number));
    }
}
