# <i><b>Using Java</b><br>(With IntelliJ Idea)</i>
---
Developed by NetBrains

### WHAT IS PROGRAMMING?
People would write languages in languages closer to the machine code when programming was in its infancy.
As time went on we have developed a series of languages in a 'pseudo-English' form to form expressions in code.

There are 2 areas in programming: The interpreter & compiler that allows us to write code and for it to convert the code into binary for the computer to be read.

### JVM:
A machine that exists digitally (software pretending to be hardware) a piece of software deisgned to run other software.<br><b>Is platform dependant</b>

### WORA:
<i>Write Once Read Anywhere'</i><br> This is the concept that java code can be read by any machine

### RTFM:
Using 'javadocs' will give you documentation on everything java can do and does with detailed information.
<br><br>

<table>
  <tr>
    <td colspan=4>

  ###### JDK: JAVA DEVELOPMENT KIT
  JRE + dev tools
    </td>
  </tr>
  <tr>
    <td><b>&uarr;</b></td>
    <td colspan=3>

  ###### JRE: JAVA RUNTIME ENVIRONMENT
  JVM + the library classes
    </td>
  </tr>
  <tr>
    <td></td>
    <td><b>&uarr;</b></td>
    <td colspan=2>

  ###### JVM: JAVA VIRTUAL MACHINE
  Has the virtual machine
    </td>
  </tr>
</table>

Always organise your folder structure and back it up online too

Inside a default file we have these folders:<br>
<table>
<tr><td>.idea</td></tr>
<tr><td>src</td></tr>
<tr><td>External Libraries</table></tr>

---
### <b>Indexing</b>
How a program knows where a file is in a computer.

---
With java you want to separate your code out as much as possible by separating concerns.

This will help us in a way where we can find out problems when they occur  more easily.

###### <b>Variables</b>
Used to store data in your program requesting memory for it.


###### <b>Data Types</b>
UNDERFLOW ERRORS (Using Excel): <br>
=(-0.7-0.4-0.3)
==> -5.55112E-17

This is a calculation that can't be properly answered without declaring what sort of data it is. All the memory will be used to reach a figure closer and closer to zero until it reaches its limit. Declaring the type of data will format this issue in excel.
<br><br>
There is the same issue with counting up, where we can get an <i><b>'overflow error'</b></i> when we reach the ceiling of what can be done with the memory.


'Strongly Typed' there are rules to follow you need to have the syntax properly written and use the queens english (according to java)
<br><br>
'Statically Typed'
"YOU MUST DECLARE A DATA TYPE FOR VARIABLES"

Otherwise, it will refuse to run.

---
# Utility classes

### String Builder
Extends the features of a typical string where you can format and edit a string in unique ways.
You can print string builders BUT you are recommended to store these as normal strings and convert them back.

### String Buffer
Similar to Builder but with even more focused usability where you can swap characters for instance


---
# <i>CONST & FINAL</i> Keyword
This variable will not change for the entire time the program is ran for

variables cant be changed

classes that are final they cant be overwritten

methods cant be overwritten
