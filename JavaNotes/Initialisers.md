# Initialisers

A block of code that has no associated name or data type, and is placed outside of any method constructor or block of code.


Static Initialisers aka. static blocks

initialisation always needs multiple lines.

Static means that it can be accessed at the class level and you dont need to instantiate it.
You cant have or reference non static fields or entities in a static context.

Instance is at the object level.

```java
static block {
   /*
   your code: this is the first thing
   to run when your code is executed
   and the class is loaded and is done
   so only once.
   */

   //Used to initialise static variables
}

Instance Initialiser block {
  /*
  Only gets executed when an object
  is created
  */

  /*
  used when constructors share code
  they are executed in the order you
  write them
  */
}

Default Constructor {
  //Has no parameters
}

Parameterised Constructor {
  //Has parameters
}
```

- Main is loaded first
- Then the static blocks are executed
- It then runs through all of the main method
- A new instance is made from a class
- This class then executes its first static block which constructs the object that will allow for population of data in the second object. Thanks to the static Initialisers.
- We then run the next constructor which is parameterised. Allowing us to generate an object that takes in the fields we have asked for in the parameters.
