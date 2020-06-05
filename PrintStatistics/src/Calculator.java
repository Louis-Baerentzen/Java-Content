//Print Statistics
//Write a program with a method called printStatistics()
//The method will take an Array of ints as a parameter and return the following:
//  The highest number in the Array
//	The lowest number in the Array
//	The total of all the values in the Array

/*
We'll need a class for:
the array of numbers
for printing out the results
for calculating the 3 operations
*/

public class Calculator {

    public static int getMaxInArray(int[] theArray) {
        int maxNumber = theArray[0];
        for (int currentValue : theArray) {
            if (currentValue > maxNumber) {
                maxNumber = currentValue;
            }
        }
        return maxNumber;
    }


    public static int getMinInArray(int[] theArray) {
        int minNumber = theArray[0];
        for (int currentValue : theArray) {
            if (currentValue < minNumber) {
                minNumber = currentValue;
            }
        }
        return minNumber;
    }


    public static int getTotalInArray(int[] theArray) {
        int total = 0;
        for (int currentValue : theArray) {
            total += currentValue;
        }
        return total;
    }
}