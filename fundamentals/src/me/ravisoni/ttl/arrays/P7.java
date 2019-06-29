package me.ravisoni.ttl.arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P7 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 4, 4, 4 , 88, 9, 9, 0, -4};
        System.out.println("Original array");
        System.out.println(Arrays.toString(arr));
        Set<Integer> myset = new HashSet<Integer>();
        for (int i : arr)
            myset.add(i);
        System.out.println("After removing duplicates");
        System.out.println(myset);
    }
}
