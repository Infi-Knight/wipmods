package me.ravisoni.ttl.flow;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scanner.nextInt();
        if (input % 2 == 0) System.out.println("EVEN");
        else System.out.println("ODD");
    }
}
