begin JavaNotes.md  
 ***Basics of Java***  
 **all java codes requires a "main" function**  
 **it also requires the class "Main"**
 
 Naming conventions 
  -PascalNamingConvention is for Classes
  -camelNamingConventions is for Methods (functions)
 Functions:  
  -a block of code that can do a task  
  -When running a java program, the function main get called and whatever in that function get executed  
  -a function should always belong to a container (class)  
   functions:  
    ReturnType + Name(Parameters) {  
      actualJavaCode  
    }  
      
   for example:  
    class Main {  
      void main() {  
      code  
     }  
   }  
  Classes:  
    -any java program has at least 1 class  
    -to define:  
      -class keyword + name + {  
  Methods:  
    -functions inside a class  
  Acces modifiers:  
    -special keywords that determines if others can acces this class/methods (public, prive, etc)  
 Types:
 -Variables And COnstants
   -to declare a variable, we use the type of the va;ue we store and the name then "=" value and ";'
    -for example storing an interger : int age =69;
    -you can change it later down the road for exemple age = 40;
    -you cna also declare multiple variable on the same line using "," for exemple int age = 69, temp = 44;
    -Use the camel convention for naming, for exemple myAge
 -Primitive & Reference types
  -primitve types
   -byte -128 to 127
   -short -32k to 32k
   -int -2b to 2b
   -long
   -float
   -double 
   -char A, B, C
   -boolean true/false
  -To make large numbers read-able, we can use "_" to seperate every 3 digits
  -Java compiler always reads numbers as interger even if it's not defined as one, to fix this with long number, add the L or l suffix to the number.
  -To define numbers with decimal points, we use float for small numbers but double is for large ones.
  -Java compiler always reads decimal numbers as double even it's declared as float, to fix this, add F or f suffix.
  -Char is used for letters
  -boolean is used for booleans
 -Reference type Variables
  -reference types variables are different than primitive, they don't store the actual data in memory, they store the location that POINTS to the data, for example if we copy a reference type var, both of them gets the same address, so changing one will affect the other.
 -Strings
  -Strings are reference types variables, they can be initiated using the String keyword, example is String msg = "hel";
  -Escaping is done with backslashes, if you want to print "\" then you need to double it. the 2 special charactersi are " and \. \t adds a tab in the string.
 -Arrays
  -they are used to store a list of smething. See 23Jan.java for more
 -Constants, they are created using the final keyword before initializing the var, for example final float pi=3.1415F; 
  
 -Casting
 -Numbers, strings, and arrays, 
 -read inputs