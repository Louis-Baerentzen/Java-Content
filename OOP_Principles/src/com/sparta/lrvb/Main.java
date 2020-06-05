package com.sparta.lrvb;

public class Main {

    public static void main(String[] args) {
        // in this constructor we now have the parameters that are now filled in
        //We can have as many of these constructed objects we like
        Cat cat = new Cat("Bella", "Tabby", 3);
        Cat cat1 = new Cat("Fudge", "Bombay", 100);
        Cat cat2 = new Cat("Minnie", "Chantilly-Tiffany", 2);
        System.out.println(cat.toString());
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        cat1.setAge(-80);
    }
}
