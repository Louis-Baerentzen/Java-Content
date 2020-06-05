package com.sparta.lrvb;

public class Main {

    public static void main(String[] args) {
        double start = System.nanoTime();

        int [] arrayA = {23,43,6796,2345,214,797,36,13,84};
        int n1 = arrayA.length;

        int [] arrayB = {54,68,25,852,123,974,1451,896,24};
        int n2 = arrayB.length;

        int [] array3 = new int [n1+n2];

        Merger.mergingArrays(arrayA, arrayB, n1, n2, array3);

        System.out.println("The array after merging");
        for (int i = 0; i < n1 + n2 ; i++) {
            System.out.println(array3[i] + " ");
        }

        
        double end = System.nanoTime();
        System.out.println("Ran for: " + (end-start)/1000000 + " nanoseconds");
    }
}
