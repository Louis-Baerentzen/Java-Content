package com.sparta.lrvb;

public class SumEvenNum {

    public static int sumEvenOnly(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i]%2) ==0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
