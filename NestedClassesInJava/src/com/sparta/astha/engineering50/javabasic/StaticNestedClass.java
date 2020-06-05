package com.sparta.astha.engineering50.javabasic;

public class StaticNestedClass {
      private int x=23;
      private static int y=20;

    static class InnerStaticClass{

        private int num;

        public void print(){
            System.out.println("I am within inner static Class");
            System.out.println(y);
            StaticNestedClass staticNestedClass=new StaticNestedClass();
            System.out.println(staticNestedClass.x);
        }

    }
}
