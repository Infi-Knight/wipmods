package me.ravisoni.ttl.arrays;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        int[] arr = {3, 43, 32, 2134, -3, 2, 23, 31, 56, 90};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to be searched");
        int key = scanner.nextInt();

        boolean found = false;
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == key){
                found = true;
                break;
            }
        }

        System.out.printf("%d", found ? i : -1);
    }
}
