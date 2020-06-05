package com.sparta.lrvb;

public class ArrayChecker {
    public static boolean arrayChecker (int [] array) {
        boolean isIn = false;

        for (int i =0 ; i < array.length; i++) {
            if (array[i] == 5) {
                isIn = true;
            }
        }
        return isIn;
    }
}
