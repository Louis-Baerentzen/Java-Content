package com.sparta.lrvb;

import java.sql.SQLOutput;
import java.util.Arrays;

public class BubblePrinter {
    public static void bubblePrintingDesc (int[] array) {
        System.out.println("Your original array: " + Arrays.toString(array));
        BubbleSorter.bubbleSorting(array);
        System.out.println("Your sorted array, in descending order: " + Arrays.toString(array) + "\n");
    }

    public static void bubblePrintingAsc (int[] array) {
        System.out.println("Your original array: " + Arrays.toString(array));
        BubbleSorter.bubbleSortingAsc(array);
        System.out.println("Your sorted array, in ascending order: " + Arrays.toString(array) + "\n");
    }
}

//You can't concat a void class and use it in s.out.
//But you can convert it into a string with Arrays.toString()
//First loop allows movement in the array
//Second loop allows the paired inspection
//If statement is the order of the array
