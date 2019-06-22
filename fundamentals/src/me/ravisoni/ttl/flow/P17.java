package me.ravisoni.ttl.flow;
import java.util.Scanner;

/*
Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001
 */

public class P17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + (num % 10);
            num /= 10;
        }
        System.out.println("Reverse is " + reverse);
    }
}
