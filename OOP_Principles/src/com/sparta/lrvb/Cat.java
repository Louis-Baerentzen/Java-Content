package com.sparta.lrvb;

public class Cat extends Animal {
    //We can extend to our abstract class
    //parents always give their methods to the children
    //and the children wont return their methods back
    //super retrieves from the parent/abstract class
    public Cat (String name, String breed, int age) {
        super(name, breed, age);
    }
    //methods in the cat class will be exclusive to cats

    public void play() {
        System.out.println();
    }

}
