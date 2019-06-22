package me.ravisoni.ttl.flow;
/*
Initialize a character variable in a program and

print 'Alphabhet' if the initialized value is an alphabhet,

print 'Digit' if the initialized value is a number, and

print 'Special Character', if the initialized value is anything else.
 */
public class P5 {
    public static void main(String[] args) {
        char c = '%';
        if (Character.isLetter(c)) System.out.println("Alphabet");
        else if (Character.isDigit(c)) System.out.println("Digit");
        else System.out.println("Special Character");
    }
}
