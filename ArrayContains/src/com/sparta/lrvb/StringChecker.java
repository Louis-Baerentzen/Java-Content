package com.sparta.lrvb;

public class StringChecker {
    public static boolean stringChecker (String words, char letter) {
        boolean hasA = false;

        for (int i=0; i < words.length(); i++) {
            if (words.charAt(i) == letter) {
                hasA = true;

            }
        }
        return hasA;
    }
}
