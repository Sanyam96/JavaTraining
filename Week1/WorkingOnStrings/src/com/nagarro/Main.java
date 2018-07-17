package com.nagarro;

public class Main {

    public static void main(String[] args) {
	// write your code here

        long startTime, endTime;

        String str1 = "Sanyam";
        String str2 = "Goel";
        String str3;

        String strObj1 = new String("July");
        String strObj2 = new String("2018");

        StringBuffer strB1 = new StringBuffer("Hello");
        StringBuffer strB2 = new StringBuffer("World");

        StringBuilder strBldr1 = new StringBuilder("Hey");
        StringBuilder strBldr2 = new StringBuilder("Nagarro");

        System.out.println("\nConcatenation of String");
        startTime = System.nanoTime();
        str3 = str1 + str2;
        System.out.println(str3);
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime-startTime));

        System.out.println("\nConcatenation of String Objects");
        startTime = System.nanoTime();
        strObj1 = strObj1.concat(strObj2);
        System.out.println(strObj1);
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime-startTime));

        System.out.println("\nConcatenation of String Buffer");
        startTime = System.nanoTime();
        strB1.append(strB2);
        System.out.println(strB1);
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime-startTime));

        System.out.println("\nConcatenation of String Builder");
        startTime = System.nanoTime();
        strBldr1.append(strBldr2);
        System.out.println(strBldr1);
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime-startTime));

    }
}
