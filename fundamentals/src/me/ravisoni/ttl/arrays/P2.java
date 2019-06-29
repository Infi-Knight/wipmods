package me.ravisoni.ttl.arrays;
import java.util.Collections;

public class P2 {
    public static void main(String[] args) {
        int[] arr = {43, 42, 3, 23, 0, 32, 2};
        int max = -1;
        for (int i : arr)
            if ( i > max)
                max = i;
        System.out.println(max);
    }
}
