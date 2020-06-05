package com.sparta.lrvb;

public class ReverseArray {

    public static int[] reverseOrder (int [] array2) {
        int [] reverseArray = {0, 0, 0};

        for (int i = array2.length; i >= 0; i++) {
            reverseArray[0] = array2[2];
            reverseArray[1] = array2[1];
            reverseArray[2] = array2[0];
        }
        return reverseArray;
    }

}
