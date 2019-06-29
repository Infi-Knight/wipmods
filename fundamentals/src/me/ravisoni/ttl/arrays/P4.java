package me.ravisoni.ttl.arrays;
//import java.util.stream.IntStream;

public class P4 {
    public static void main(String[] args) {
        int[] ascii_ints = new int[128];
        for (int i = 32; i < ascii_ints.length; i++)
            ascii_ints[i] = i;
        for (int i = 32; i < ascii_ints.length; i++)
            System.out.printf("%c", i);
    }
}

//public class P4 {
//    public static void main(String[] args) {
//        IntStream.range(32, 128).forEach(i -> {
//            System.out.printf("%c", i);
//        });
//    }
//}
