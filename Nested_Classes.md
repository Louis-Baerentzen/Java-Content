# Nested Classes
Essentailly a class in a class all the attributes of the outer class can be accessed by the nested class even when private, as it is a member of that outer class.

The inner class can also be private and this allows for very applicable encapsulation.

outer classes can only be `public` or `default` not `private` or `protected` the inner classes can be given any access htey like.

### When are they best used?
When a class is exclusively used for one other class only.
<br><br>
abcdefghijklmnopqrstuvwxyz
if a significant amount of these classes are paired like this.
<br><br>
###### B>>A F>>G O>>P
<br>
It makes more sense to make these classes (B,F,O) nested inside (A,G,P) its better to contain it in the scope it is used to avoid 'pollutiing' your project (keeps it clean).
<br><br>

###### Increases Encapsulation
If A is private and B needs access to A it allows B to access A properties even when it is private.

Static nested Classes

```java
public class outer{

  public static class Nested{

  }
}  
```
Can you access the outer class which is non static? NO but it can be done by creating an instance of it inside the nested class.

<img src="images/Screen Shot 2020-06-03 at 14.22.11.png"/>
<br><br>

We always go from the `outer class` to the `nested class` to the `instance`. Which in this case is an instance of the outer class so we can ask for 'staticNestedClass.x'.

### Non-Static Nested classes
```java
public class Outer{

  public class Inner{

  }
}  
```
Used for when the inner class object needs access to the outer object. As there are no static classes present that means we can use/access any members of the outer class for use inside the inner.

This can also be done the other way round (from in to out) but you would then have to make an instance of that.

###### Shadowing
Anything local gets the precendece first. The tiered levels of access creates what called the shadowing effect.

<img src="images/Screen Shot 2020-06-03 at 14.50.13.png"/>

It will default to 0 when a value has not been defined.

### Local Nested classes

### Anonyomus classes
Anon classes are nameless classes. This helps avoid creating loads of classes with separate names. We do this by creating an instance where the name would be declared.

<img src="images/Screen Shot 2020-06-03 at 15.30.24.png"/>
<br><br>
These are very useful for threading.
