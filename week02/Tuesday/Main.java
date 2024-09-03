// similar to #include
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (true) { } else {  }

        // this is a bad comment
        // if statement to check if first element
        // in args array is the word "Safe"
        // the better comment would be...
        // If the string "Safe" is passed in when running program
        // this application will enter safe mode
        // to prevent any cheat mods from being loaded
        if (args[0].equals("Safe")) {
            // equals method from String class to check
            // string equivalence

            // args[0] == "Safe"
            System.out.println("Starting in \"safe\" \nmode.");
        }

        int num;
        int num2;
        int Num3; // not a syntax error
                    // but NOOOOO
        float studentName; // noooo
        double studentGPA;

        // we need to import Scanner class
        Scanner keyboard = new Scanner(System.in);

        num = keyboard.nextInt();
        studentGPA = keyboard.nextDouble();
        String name = keyboard.next();
        boolean passing = keyboard.nextBoolean();
        float grade = keyboard.nextFloat();

        /* there's no nextChar() */

    }
}
