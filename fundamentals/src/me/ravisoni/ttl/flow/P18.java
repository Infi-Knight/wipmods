package me.ravisoni.ttl.flow;

/*
 Write a Java program to find if the given number is palindrome or not

         Example1)
         C:\>java Sample 110011
         O/P: 110011 is a palindrome

         Example2)
         C:\>java Sample 1234
         O/P: 1234 is not a palindrome
 */
public class P18 {
    static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(int num) {
        return (num == reverse(num)) ? true : false;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (args.length > 0) {
            if (isPalindrome(n)) {
                System.out.printf("%d is a palindrome", n);
            } else {
                System.out.printf("%d is not a palindrome", n);
            }
        }   else {
            System.out.println("Invalid input");
        }

    }
}
