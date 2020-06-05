package com.sparta.astha.engineering50.javabasic;


public class LocalNestedClass {
    private int z=23;

    public void outerMethod(){
        int y=6;
        System.out.println(z);
           class InnerLocalClass{

               public void innerLocalMethod(){
                   System.out.println("It is within inner Local Class");
                   System.out.println(z);
                   System.out.println(y);

               }


        }

        //outside inner Local Class and in outer method
        InnerLocalClass innerLocalClass=new InnerLocalClass();
        innerLocalClass.innerLocalMethod();

        }


        }

