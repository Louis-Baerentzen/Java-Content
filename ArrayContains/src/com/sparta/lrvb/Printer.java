package com.sparta.lrvb;

public class Printer {
    public static void arrayPrinter (int [] array) {
        System.out.println("Does this array contain the number 5? " + ArrayChecker.arrayChecker(array));
    }

    public static void charPrinter (String word, char letter) {
        System.out.println("Does this word contain an 'A' inside it? " + StringChecker.stringChecker(word, letter));
    }
}
