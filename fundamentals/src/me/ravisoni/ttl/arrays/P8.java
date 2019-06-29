package me.ravisoni.ttl.arrays;

public class P8 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 7, 9};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum67 = 0;
            if (arr[i] == 6) {
                while (i < arr.length) {
                    if (arr[i] == 7) {
                        sum67 = 0; // discard sum between 6 and 7
                        break;
                    } else sum67 += arr[i++];
                }
            } else sum += arr[i];

            sum += sum67;
        }
        System.out.println(sum);
    }
}
