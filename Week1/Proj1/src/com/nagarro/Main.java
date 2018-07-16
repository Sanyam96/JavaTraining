package com.nagarro;

public class Main {

    /**
     * Main function for try-catch learning
     *
     * @param args
     */
    public static void main(String[] args) {

        try {
            System.out.println(args[0] + " from Argument input");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

    }
}
