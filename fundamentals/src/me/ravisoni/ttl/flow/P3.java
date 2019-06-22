package me.ravisoni.ttl.flow;

/*
Write a program to check if the program has received command line arguments or not.

If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)

Example1) java Example
O/P: No values

Example2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore

 */

public class P3 {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String arg : args) {
                System.out.print(arg + ",");
            }
        } else System.out.println("No values");
    }
}
