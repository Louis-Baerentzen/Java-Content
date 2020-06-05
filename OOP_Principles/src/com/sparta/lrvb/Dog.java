package com.sparta.lrvb;

public class Dog extends Animal {
    //we don't want to repeat ourselves by typing the same variables in cat
    //we want to store in a separate class what is common to both a cat and a dog
    // we do this with abstract classes
    //extending the class takes the parts of animal into this class
    public Dog (String name, String breed, int age) {
        super(name, breed, age);
    }

}
