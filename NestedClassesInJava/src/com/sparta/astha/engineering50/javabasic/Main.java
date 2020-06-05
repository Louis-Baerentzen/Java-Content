package com.sparta.astha.engineering50.javabasic;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //runNonStaticNestedClass();
        //runStaticNestedClass();
        //runLocalNestedClass();
        //runAnonymousClass();

        //Practice

        runAnonymousClassPractice();

    }

    private static void runAnonymousClassPractice() {
        ImplementingAnonymousClassesPractice anonymousClassesPractice=new ImplementingAnonymousClassesPractice();
        anonymousClassesPractice.londonAcademy.aboutMethod();
        anonymousClassesPractice.spartaconsultants.getGraduationStatus();
    }




    public static void runNonStaticNestedClass() {
        //System.out.println(NonStaticNestedClass.x);
        NonStaticNestedClass nonStaticNestedClass = new NonStaticNestedClass();
        System.out.println(nonStaticNestedClass.getNum());
        //nonStaticNestedClass.nonStaticMethod();//not able to access from the instance object
        //nonStaticNestedClass.InnerNonStaticClass()=nonStaticNestedClass.new InnerNonStaticClass();
        NonStaticNestedClass.InnerNonStaticClass innerNonStaticClass = nonStaticNestedClass.new InnerNonStaticClass();
        //NonStaticNestedClass.InnerNonStaticClass innerNonStaticClass1=new NonStaticNestedClass.InnerNonStaticClass();
        innerNonStaticClass.nonStaticMethod(50);
    }
    //nonStaticNestedClass.nonStaticMethod();Outer. inner

    public static void runStaticNestedClass() {

        StaticNestedClass.InnerStaticClass innerStaticClass = new StaticNestedClass.InnerStaticClass();
        innerStaticClass.print();
    }



    public static void runLocalNestedClass() {
      LocalNestedClass localNestedClass=new LocalNestedClass();
      localNestedClass.outerMethod();

    }

    public static void runAnonymousClass(){
        ImplementingAnonymousClass implementingAnonymousClass=new ImplementingAnonymousClass();
        implementingAnonymousClass.londonAcademy.aboutMethod();
        implementingAnonymousClass.spartanOnsite.graduateStatus();
    }
}
