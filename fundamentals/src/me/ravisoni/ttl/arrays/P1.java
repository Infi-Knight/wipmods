package me.ravisoni.ttl.arrays;

public class P1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int a : arr)
            sum += a;
        System.out.println(sum);
    }
}
