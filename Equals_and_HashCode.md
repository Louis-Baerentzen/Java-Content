# Equals & Hash Code
These are two different ways of determining whether data inside a variable is equal or mathcing

###### For Example...
```java
String sOne = "Hello";
String sTwo = "Hello";
String sThree = new String ("Hello");
```
<br>

String `sOne` & `sTwo` are both the same object.
String `sThree` however has been forced to become a new string and therefore isnt the same object.

### .equals()
This compares the content itself that's inside the object.

```Java
(sOne.equals(sThree)); // this is true
```

### ==
This operator compares the object to see if they are the same.

```Java
sOne == sThree; // this is false
```
<br>
