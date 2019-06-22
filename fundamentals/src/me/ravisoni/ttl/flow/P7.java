package me.ravisoni.ttl.flow;

/*
Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a

 */

public class P7 {
    public static void main(String[] args) {
        char c = 'g';
        if (Character.isUpperCase(c)) {
            System.out.printf("i/p:%c\n", c);
            System.out.printf("o/p:%c->%c", c, Character.toLowerCase(c));
        } else {
            System.out.printf("i/p:%c\n", c);
            System.out.printf("o/p:%c->%c", c, Character.toUpperCase(c));
        }
    }
}
