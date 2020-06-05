public class StatisticsPrinter {
    //This is a method for printing the calculations
    //Using the array as a parameter
    public static void printStatistics(int [] theArray) {
        System.out.println("The highest value " + Calculator.getMaxInArray(theArray));
        System.out.println("The lowest value " + Calculator.getMinInArray(theArray));
        System.out.println("The total value " + Calculator.getTotalInArray(theArray));
    }

}
