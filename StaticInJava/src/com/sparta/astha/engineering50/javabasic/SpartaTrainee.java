package com.sparta.astha.engineering50.javabasic;

public class SpartaTrainee {

    private int traineeId;
    private String traineeName;
    private String gender;
    //private int num;
    private static int numberofSpartaTrainees;
    private static int onsiteSpartans=100;
    // This is a static block;
    static{
        System.out.println("Inside Static block 1");
        //num=10;
    }
    //initialization block
    {
        System.out.println("Inside Initialization block 1");
        numberofSpartaTrainees++;
    }
    {
        System.out.println("Inside Initialization block 2");
    }

    //Default constructor
    public SpartaTrainee(){
        //numberofSpartaTrainees++;
    }

    public static int getNumberofSpartaTrainees() {
        return numberofSpartaTrainees;
    }

    //Parametrized constructor
    public SpartaTrainee(int traineeId, String traineeName, String gender){
        this.traineeId=traineeId;
        this.traineeName=traineeName;
        this.gender=gender;
        //numberofSpartaTrainees++;

    }

    public static int getProjectedSpartansByEndOfMOnth(){
        return onsiteSpartans+getNumberofSpartaTrainees();
    }

    public int getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
