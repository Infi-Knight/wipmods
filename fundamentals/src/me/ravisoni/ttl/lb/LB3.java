package me.ravisoni.ttl.lb;

//Write a Program to accept two integers as command line arguments and print the sum of the two numbers
//        Example1)
//        C:\>java Sample 10 20
//        O/P Expected : The sum of 10 and 20 is 30

public class LB3 {
    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.printf("The sum of %d and %d is %d", args[0], args[1], args[0]+args[1]);
        }
    }
}
