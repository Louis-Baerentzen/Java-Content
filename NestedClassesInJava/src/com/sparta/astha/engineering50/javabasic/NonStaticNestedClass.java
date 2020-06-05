package com.sparta.astha.engineering50.javabasic;

public class NonStaticNestedClass {
    private int num;
    private int x;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void runInnerClass(){
        InnerNonStaticClass innerNonStaticClass=new InnerNonStaticClass();
        innerNonStaticClass.nonStaticMethod(6);
    }

    class InnerNonStaticClass{  //try making it private
        private int num=23;
        void nonStaticMethod(int num){

            System.out.println("Within inner class::"+ num);
        }
    }

}
