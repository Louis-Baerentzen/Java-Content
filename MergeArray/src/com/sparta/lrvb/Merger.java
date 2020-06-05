package com.sparta.lrvb;

public class Merger {
    public static void mergingArrays (int[] array1, int[] array2,
                                 int n1, int n2, int[] array3) {

        int i=0; //Array1
        int j=0; //Array2
        int k=0; //Array3 The merged array

        // While were counting in both arrays
        while (i < n1 && j < n2){
            //Compare values in array to each other then
            //Add to merged array and move position in both
            if (array1[i] < array2[i]) {
                array3[k++] = array1[i++];
            } else {
                array3[k++] = array2[j++];
            }
        }

        //While there are still values in both arrays
        //Increment through the values to the merged array
        while (i < n1) {
            array3[k++] = array1[i++];
        }

        while (j < n2) {
            array3[k++] = array2[j++];
        }

    }
}
