package me.ravisoni.ttl.flow;

import java.util.Scanner;

// Write a program to check if a given integer number is Positive, Negative, or Zero.
public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scanner.nextInt();
        if (input == 0) System.out.println("ZERO");
        else if (input < 0) System.out.println("NEGATIVE");
        else System.out.println("POSITIVE");
    }
}
