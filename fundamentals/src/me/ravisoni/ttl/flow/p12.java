package me.ravisoni.ttl.flow;

import java.util.Scanner;

//  Write a program to check if a given number is prime or not.
public class p12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        for (int i = 2; i <= (int) Math.sqrt(input); i++) {
            if (input % i == 0) {
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Prime number");
    }

}
