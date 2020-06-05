package com.sparta.lrvb;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        int [] array = {3,5,7,8,6,2,4,1,9};
        Printer.arrayPrinter(array);

        String word = "Amalgamation";
        char letter = 'a';
        StringChecker.stringChecker(word, letter);
        Printer.charPrinter(word, letter);
    }
}
