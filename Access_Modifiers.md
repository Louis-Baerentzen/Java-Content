# Access modifiers<br>
You can structure things into packages which can be seen as their own directories

if you rename a variable and it is referenced throughout the project you can refactor and this 'changes how something work without changing what it does'

###### HOW CAN THEY BE ACCESSED

<table>
<th></th><th>IN CLASS</th><th>IN PACKAGE</th><th>SAME PACKAGE USING SUBCLASS</th><th>OUTSIDE PACKAGE USING SUBCLASS</th>
<tr><td>Private</td><td>YES</td><td>NO</td><td>NO</td><td>NO</td></tr>
<tr><td>Default</td><td>YES</td><td>YES</td><td>YES</td><td>NO</td></tr>
<tr><td>Protected</td><td>YES</td><td>YES</td><td>YES</td><td>NO</td></tr>
<tr><td>Public</td><td>YES</td><td>YES</td><td>YES</td><td>YES</td></tr>

</table>

methods are: <br>
- The access modifier<br>
- The datatype or void if it returns nothing as a method itself<br>
- The name of the method<br>
- The parameters in (brackets) this is the data/information needed to use the method.

```
ACCESS_MODIFIER  DATA_TYPE  NAME  (PARAMETERS)
```

ie. go to a canteen to get someone something how is this done

use classes to model behaviour of an object

scopes focus the field of view in methods this is important to understand when figuring out what influence the methods have in your work.

```java
//version 1
public void getMessageVersion1() {
System.out.println("Hello World");
}

//v2
//you must use return if a datatype is declared
public String getMessageVersion2() {
return "Hello World";
}
```
<br>
