package com.sparta.astha.engineering50.javabasic;

public class Main {

  static{
      System.out.println("Above Main Static block");
  }
    public static void main(String[] args) {
	// write your code here
        System.out.println("Inside Main");
        SpartaTrainee spartaTrainee1=new SpartaTrainee();


        //Set the values of Trainee 1
        spartaTrainee1.setTraineeId(1);
        spartaTrainee1.setTraineeName("James");
        spartaTrainee1.setGender("Male");
        //System.out.println(spartaTrainee1.getNumberofSpartaTrainees());
        //Set the values of Trainee2
        SpartaTrainee spartaTrainee2=new SpartaTrainee(2,"Kajol","Female");

        //System.out.println(spartaTrainee2.getNumberofSpartaTrainees());
        //System.out.println(spartaTrainee1.getNumberofSpartaTrainees());


        System.out.println(SpartaTrainee.getNumberofSpartaTrainees());
        //System.out.println(Math.pow(2,13));
        System.out.println("Number of Sparta Trainees Onsite Projected::"+SpartaTrainee.getProjectedSpartansByEndOfMOnth());


    }

    static{
        System.out.println("Below All the code");
    }
}
