package com.sparta.lrvb;

public class Doubling {

    public static int createBinSeq (int doubleItThisMuch) {
        int firstValue = doubleItThisMuch;

        for (int i = 0; i < 10; i ++) {
            doubleItThisMuch += firstValue;
            firstValue = doubleItThisMuch;
            System.out.println(doubleItThisMuch);
        }
        return doubleItThisMuch;
    }
}
