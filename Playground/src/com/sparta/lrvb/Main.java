package com.sparta.lrvb;

public class Main {

    public static void main(String[] args) {
        int x = 345;
        x >>= 0;
        //x -= 1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }
}
