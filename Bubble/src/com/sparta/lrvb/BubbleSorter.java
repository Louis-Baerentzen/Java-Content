package com.sparta.lrvb;

public class BubbleSorter {
    public static void bubbleSorting(int[] array) {

        int next = array.length;
        int temp;

        for (int current=0; current < next; current++) {
            for (int value=1; value < (next - current); value++) {
                //Swap the
                if (array[value] > array[value - 1]) {
                    temp = array[value - 1];
                    array[value - 1] = array[value];
                    array[value] = temp;
                }
            }
        }
    }

    public static void bubbleSortingAsc(int[] array) {

        int next = array.length;
        int temp;

        for (int current=0; current < next; current++) {
            for (int value=1; value < (next - current); value++) {
                //Swap the
                if (array[value] < array[value - 1]) {
                    temp = array[value - 1];
                    array[value - 1] = array[value];
                    array[value] = temp;
                }
            }
        }
    }
}

//Being void this method does not need to return anything



