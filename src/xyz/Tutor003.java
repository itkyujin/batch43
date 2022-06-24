package xyz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Tutor003 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4};
        ArrayList<Integer> intArray2 = new ArrayList<>();
        intArray2.add(1);


        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(1000);
        set.add(5);
        set.add(500);
        set.add(15608);
        set.add(78941);
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(5);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(3);
        set2.add(6);
        set2.add(4);

        System.out.println(set);
        System.out.println(set2);

        HashMap<String, Integer> map = new HashMap<String,Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("six",6);
        System.out.println(map.get("six"));

    }

    /*public static ArrayList<Integer> Arr1 () {
        int num1 = 0; int num2 = 1; // 0, 1, 1,2
        // x=0 + y=1 = z=1
        // x= 1 + y= 1 = z=2
        // 1 + 2 = 3
        // 1 + 3 = 4
        int sum = num1 + num2;
        int nextNum = num2 + sum;

        ArrayList<Integer> intArray2 = new ArrayList<>();
        intArray2.add(num1);
        intArray2.add(num2);

        for (int i = 0; i < nextNum; i++) {
            sum = num1 + num2;
            nextNum = num1 + sum;
        }

         return sum;
    }*/



        /*
    1. Arrays
    2. Loops
    3. Classes
    4. Objects

    5. Collection
    6. Inheritance
    7. Polymorphism
    8. File Handling
    9.
    */
    /*
    2. Find sum of natural numbers using for loop
    3. Find factorial of a number using loops
    4. Print Fibonacci Series using for loop-
    */
/*

-----------------------------------------------------------------------------------------------------

We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

}




------------------------------------------------------------------------------------------------------------

We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.


parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false


public boolean parrotTrouble(boolean talking, int hour) {

}




---------------------------------------------------------------------------------------------------------------------

Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8


public int sumDouble(int a, int b) {

}


----------------------------------------------------------------------------------------------------------


Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true


public boolean makes10(int a, int b) {

}


-----------------------------------------------------------------------------------------------------------------

Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false


public boolean nearHundred(int n) {

}

 */
}
