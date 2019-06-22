package me.ravisoni.ttl.flow;

public class P16 {
    public static void main(String[] args) {
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            for (int i = 1; i <= n; i++) {
//                System.out.println("*\t".repeat(i)); // Java 11

                int j = 1;
                while (j <= i) {
                    System.out.print("*\t");
                    j++;
                }

                System.out.println();
            }
        } else {
            System.out.println("Please enter an integer");
        }
    }
}
