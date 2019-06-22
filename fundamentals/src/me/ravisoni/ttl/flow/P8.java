package me.ravisoni.ttl.flow;

import java.util.Scanner;
/*
Write a program to receive a color code from the user (an Alphabhet).

The program should then print the color name, based on the color code given.

The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.

If color code provided by the user is not valid then print "Invalid Code".
 */

public class P8 {
    public static void main(String[] args) {
        System.out.println("Enter a colour code: (R | G | B | O | Y | W)");
        Scanner scanner = new Scanner(System.in);
        char code = Character.toLowerCase(scanner.next().charAt(0));

        switch (code) {
            case 'r':
                System.out.println("Red");
                break;
            case 'g':
                System.out.println("Green");
                break;
            case 'b':
                System.out.println("Blue");
                break;
            case 'o':
                System.out.println("Orange");
            case 'y':
                System.out.println("Yellow");
                break;
            case 'w':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
                break;
        }
    }
}
