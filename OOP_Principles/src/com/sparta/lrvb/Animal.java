package com.sparta.lrvb;

// here is our abstract class you cannot create objects from an abstract class.
public abstract class Animal {
    //These are absolutes in a class
    String name;
    String breed;
    int age;

    /* here is our constructor with the 'this'
    notation that contains the parameters we want to
    */
    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void setAge(int age) {
        //this is conditional statement to restrict negative values for our cats age
        if (age <= 0) {
            System.out.println("invalid age");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}

