package com.sparta.astha.engineering50.javabasic;

public class ImplementingAnonymousClassesPractice {

    SpartaAcademy londonAcademy=new SpartaAcademy(){
        @Override
        public void aboutMethod() {
            System.out.println("Skills Powerhouse London");
        }
    };

    SpartanInterface spartaconsultants=new SpartanInterface() {
        @Override
        public void getGraduationStatus() {
            System.out.println("They have already graduated");
        }
    };

}
