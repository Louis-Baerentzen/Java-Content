# S.O.L.I.D<br><i>'Control the connectivity'</i>
### Single Responsibility:<br>
What is a class responsible for? Each one should have one single purpose/action in an application.
ie. storing and printing should be 2 separate classes <br>
##### WHY?
Every responsibility could result in potential changes in future. If theres a class with too many responsibilities it runs the risk of producing bugs and they are harder to find when in a single class.
<br><br>

### Open/Close design principle:<br>
Classes are seen as being...<br> <i><b>open for extension & closed for modification</b></i>,<br> if you want to extend your classes do so with another class and extend it from said class. Only touch existing classes to fix errors.
<br>
##### WHY?
Keep in mind the risk of knock on effects when introducing new code means less bugs in the future!
<br><br>

### Liskov Substitution Principle:<br>
methods are in tune with the parent class and use the same name
but the implementation is specific to the child class.
METHODS IN CHILD CLASSES NEED TO BE SPECIFIC TO THAT CLASS & THEREFORE YOU NEVER MENTION THE CHILDREN CLASSES IN THE PARENT CLASSES.
<br>
##### WHY?
All animals play but they all play differently.
<br><br>
### Interface Segregation:<br>
You may not want to implement all the methods an interface has if it contained all of them in one place, interfaces need to be ideally single use/purpose like classes. As they may want to perform certain methods from the interface and not others. Try to break down your interfaces to relevant groups.
<br>
##### WHY?
Smaller interfaces lead to an easier decoupled system.
<br><br>
YOUR CLASSES CAN IMPLEMENT MORE THAN ONE INTERFACE!!

### Dependency Inversion:<br>
<i>'High cohesion & low coupling.'</i><br>
We dont want classes, regardless of importance to depend on each-other unless it is absolutely necessary.<br><br>
Its best they both depend on the abstract classes. Details should depend on abstractions (like child classes).
<br>
##### WHY?
High level classes, like abstract classes are more reusable this way.
This helps prevent any mishaps affecting other classes if any code goes wrong.
