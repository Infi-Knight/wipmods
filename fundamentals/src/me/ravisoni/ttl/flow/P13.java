package me.ravisoni.ttl.flow;

import java.util.Scanner;

// Write a program to print prime numbers between 10 and 99.
public class P13 {

    static boolean isPrime(int num) {
        int upper = (int)Math.sqrt(num);
        for (int i = 2; i <= upper; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i < 99; i++) {
            if (isPrime(i)) System.out.printf("%d\t", i);
        }
    }
}
