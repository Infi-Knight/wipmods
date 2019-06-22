package me.ravisoni.ttl.flow;

import java.util.Scanner;
public class P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new number");
        int input = Math.abs(scanner.nextInt());
        int sum = 0;
        while (input != 0) {
            sum += input%10;
            input /= 10;
        }
        System.out.printf("Sum of the digits is %d", sum);
    }
}
