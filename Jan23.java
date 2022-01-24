package com.company;


import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Jan23 {

    public static void main(String[] args) {
        byte name = 69;
        name = 35;
        //primitive types
	    System.out.println(name);
        int testingNumber = 2_000_000_000;
        System.out.println(testingNumber+" this is the max of int");
        long testingNumberLong = 3_000_000_000L;
        System.out.println(testingNumberLong+ " oooooooo");
        float price = 69.99F;
        System.out.println(price+ " this is float with java");
        char hello = 'h';
        System.out.println(hello);
        //reference types
        Date now = new Date();
        System.out.println(now);
        Point coord = new Point(6, 7);
        Point coord2 = coord;
        System.out.println(coord);
        coord.x = 2;
        System.out.println(coord2);
        String msg = "helllllllo";
        msg = msg +"hello";
        System.out.println(msg);
        //arrays
        int[] numbers = new int[5];
        numbers[0] =1;
        numbers[1] =2;
        numbers[2] =1;
        System.out.println(Arrays.toString(numbers));
        //another way is to
        byte[] numbersSec = {6, 9, 4, 5, 6, 8, 9, 0, 2, 5};
        Arrays.sort(numbersSec);
        System.out.println(Arrays.toString(numbersSec));
        byte[][] numbersSec2D = new byte[2][3];
        numbersSec2D[1][2] = 3;
        System.out.println(Arrays.deepToString(numbersSec2D));
        //ez ways for 2d arrays
        byte[][] ezNumber = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(ezNumber));
    }
}
