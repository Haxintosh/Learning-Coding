package com.company;

import java.awt.*;
import java.lang.management.MemoryManagerMXBean;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class Apr9 {

    public static void main(String[] args) {
	//begin
        System.out.println("hello world");
        //variables
        int age = 69;
        System.out.println(age);
        //the first word is the type of variable
        //ONLY required when initiating the variable
        //can also copy the variable
        int ageDuplicate = age ;
        System.out.println(ageDuplicate);
        //other types of variables
        //primitive
        //whole numbers
        //type  bytes  range
        //byte    1    -128, 127
        //short   2    -32k, 32k
        //int     4    -2b, 2b
        //long    8    ????
        //decimal numbers
        //type  bytes  range
        //float   4    ?????
        //double  8    ?????
        //characters
        //char, 4 bytes, A B C, etc
        byte huh = 30;
        //can also use _ to sperate large numbers without changing th80_e results
        int duh = 70_80_00;
        //for numbers larger than the limit of int, use long BUT also need to add L at the end
        long nuh = 700_000_000_000L;
        //for decimal numbers, use float or double, if using float add F to the end of the numbers
        //decimal point is dot
        float fuh = 70.77F;
        //boolean
        boolean isFuckable = true;
        //reference types
        //used to store complex objects
        //to declare it, start with a package and declare it with the new operator
        Date now = new Date();
        //they have members that can be accesed using . operabtors
        //example
        //now.getTime();
        System.out.println(now);
        //primitive vs reference
        byte x = 69;
        byte y = x;
        System.out.println("y = " + y);
        System.out.println("x = " + x);
        //and if i change x it doesn't affect the other, they are independant of eachother
        System.out.println(x +69);
        System.out.println(y);
        //but in a reference variable, the variables are attached to eachother
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        System.out.println("point1 = " + point1);
        point2.x = 7;
        System.out.println("point1 (updated using point1) = " + point1);
        //so changing a single variable related to the first variable also changes all the variable
        //strings
        String message = new String("hello");
        System.out.println(message);
        //you can also initiate them easier and faster
        String message2 = "hellow ";
        System.out.println(message2);
        //can also concatenate them using operators
        message = message2 + message;
        System.out.println(message);
        //dot operators for string
        boolean startWith = message.startsWith("hellow");
        System.out.println( startWith);
        System.out.println(message.replace("hellow", "hellowwwwwww"));
        System.out.println(message);
        //does not modify string
        //escape, add "\" in front of symboles to escape them, use 2 \\ to escape \
        //use "\n" to make a new line
        //use "\t" to make a tab
        //arrays in java
        // add [] after the type and use new operators
        //they are reference types
        int[] numbers = new int[70]; //numbers of items in the array
        //to call those, use index
        numbers[1] = 69;
        numbers[69] = 987;
        //to convert it's space in memory to string, use
        Arrays.toString(numbers);
        System.out.println(numbers[69]);
        //can also start variables with
        int[] numbers2 = {7, 6, 2, 4, 6};
        //all arrays have a fixed lengths
        //can also use dot operators with Arrays keyword
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
        //for 2d/3d arrays, go google
        //constants
        final float PI = 3.14F;
        //by adding final, it becomes impossible to change
        //arithmatic expressions
        int results = 10+3;
        System.out.println(results);
        int result = 10/3;
        //in java answer for division is alays a whole number
        System.out.println(result);
        double resultDiv = (double)10/(double)10;
        //use double or float for decimal points
        //use type in parenthesis to declare the tyoe of the following number
        //there are also increment operators like, could also be used in front BUT it's different
        int z = 69;
        z++;
        int a = 69;
        a--;
        System.out.println(z);
        System.out.println(a);
        int s = 69;
        int d = ++s;
        System.out.println(s);
        System.out.println(d);
        //the original variable will be affected
        //augemnted compounds
        int g = 69;
        g += 2;
        //is the same
        int t = 69;
        t += 2;
        System.out.println(g);
        System.out.println(t);



    }
}
