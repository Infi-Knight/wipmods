package me.ravisoni.ttl.arrays;

public class P10 {
    public static void main(String[] args) {
        if (args.length < 9)
            System.out.println("Please enter 9 integers");
        else {
            int k = 0;
            int[][] arr = new int[3][3];
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    arr[i][j] = Integer.parseInt(args[k++]);

            int max = Integer.MIN_VALUE;
            for (int[] row : arr)
                for (int x : row)
                    if (x > max)
                        max = x;

            System.out.printf("The biggest number in the given array is %d", max);
        }
    }
}
