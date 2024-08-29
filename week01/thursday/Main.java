/*
Write a simple program that prompts the user for a number. The program should then display if the number is even, odd, positive, negative, and/or greater than 100.

You can complete this assessment using Visual Studio, onlinegdb.com, or any IDE of your choice.
 */

public class Main {

    // intelliJ code generation
    // psvm or main
    public static void main(String[] args) {
        int num; // and maybe initialize or not...

        num = 99;

        // float - floating point
        // literal values...
        // when using them in the code
        // and there's room for ambiguity
        // we need a way to explicitly tell
        // the computer what data type it is
        // for floats... we can add a "f"
        // for doubles... we can add a "d"
        float pi = 31.00000009f;
        double tax = 0.06d;
        double tip = 0.20;
         
        // float hi = 0.005 is an error
        // 0.005 is assumed to be a double by compiler
        // this is going from more precise to less precise
        // so cannot implicitly (or automatically) convert
        // but other way around is OK
        // float to double
        double blah = 1.1f;

        if (blah < 0) {
            // shortcut for intelliJ
            // code generation
            // "sout"
            System.out.println("blah is less than 0");
        }

        while (blah < 0) {
            blah = blah - 0.5;
        }

        // operators are all the same
        blah = tip * 10 / (5.5 + blah);

        // data types
        char letter = 'a';

        // string
        // upper case S
        String message = "hello world";

        // bool is different also
        boolean flag = true;

        // input is VERY different...
        // we'll do that week 2
        // you can google/chatGPT if you want to find out earlier
        // you have to use a thing called Scanner

    }
}










