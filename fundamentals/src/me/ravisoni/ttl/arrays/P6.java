package me.ravisoni.ttl.arrays;

import java.util.Arrays;

public class P6 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 342, 32, 2, 324, 543, 4, 23};
        System.out.println("Original array");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array after sorting");
        System.out.println(Arrays.toString(arr));
    }
}
