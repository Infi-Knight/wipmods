package me.ravisoni.ttl.arrays;

public class P5 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 53, 32, 23, 2, 43242,422, 34 ,2, 424, 24};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x > max1)
                max1 = x;
            if (x > max2 && x < max1)
                max2 = x;

            if (x < min1)
                min1 = x;
            if (x > min1 && x < min2)
                min2 = x;
        }

        System.out.printf("Max1: %d, Max2: %d, Min1: %d, Min2: %d", max1, max2, min1, min2);
    }
}
