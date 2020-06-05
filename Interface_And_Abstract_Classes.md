# Interface & Abstract Classes
Interfaces are classes that many children or sub classes share and use. All the methods in an interface are like the states that an object in the real world can have.
<br><br>
All car engines turn on and off

Children classes IMPLEMENT interfaces<br>
Children classes EXTEND parent classes
<br><br>
Both can also use the `@Override` annotation to adapt the methods in their parent class or interface as they want them.
<br><br>

### The difference between interface and abstract classes
Interfaces can have children classes that have different behaviours. A vehicle has a set amount of states but there are a range of behaviours that different vehicles have.<br><br>
Planes Fly • Cars Drive • Boats Float<br><br>
But these all fulfil the same purpose: to travel in motion.
<br><br>
Children classes can only extend with one Abstract class.<br>
Children classes can implement multiple interfaces.<br>

<img src="images/Interfaces&Abstracts.jpg">

### The difference between an abstract class and a normal class
Abstract classes can have methods without a body.
