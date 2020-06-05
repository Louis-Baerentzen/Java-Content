# Operators

#### Arithmetic operators:<br>
`--` Increment down<br>
`++` Increment up<br>
`+` Plus<br>
`-` Minus<br>
`*` Multiply<br>
`/` Divide<br>
`%` Modulus
<br><br>

#### Relational Operators:<br>
`==` Equality Check<br>
`!=` Inequality Check<br>
`>` Greater Than <br>
`<` Less Than <br>
`>=` Greater Than or Equal To <br>
`<=` Less Than or Equal To
<br><br>

#### Logical Operators:<br>
`&&` Compound Check (all criteria need to be true)<br>
`||` Or Check (only 1 criteria needs to be true)
<br><br>

#### Assignment Operators:<br>
`=` Assignment<br>
`+=` Add Assigned value<br>
`-=` Minus Assigned value<br>
`*=` Multiply Assigned value<br>
`\=` Divide Assigned value<br>
###### <i>Bitwise assignment</i><br>
The integer value acts like it is being doubled for the amount of times being assigned. However, this is best described when referring to the binary value of an integer: it acts essentially like x10 but for binary (base 2) counting.
<br><br>
`<<=` Bitwise Assignment INCREMENT...<br>
This shifts the binary value by a whole order of magnitude. This example adds 4 0's to the binary value, which is the equivalent of multiplying by 16 in base 10.<br><br>
11 becomes 110000 when <<=4 is used.

``` java
public static void main(String[] args) {
        int x = 3;
        x <<= 0;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        //RETURNS 3
        //RETURNS 11
    }

public static void main(String[] args) {
        int x = 3;
        x <<= 4;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        //RETURNS 48
        //RETURNS 110000
    }
```

`>>=` Bitwise Assignment DECREMENT...<br>
This truncates the specified amount of values in the binary number.
It will have a different effect on the int value compared to the function above; and won't give the impression its dividing by 2 for all numbers.

``` java
public static void main(String[] args) {
        int x = 345;
        x >>= 0;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        //RETURNS 345
        //RETURNS 101011001
    }

    public static void main(String[] args) {
        int x = 345;
        x >>= 4;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        //RETURNS 21
        //Returns 10101 & truncates the 4 digits

        //345/16 = 21.5625
    }
```
