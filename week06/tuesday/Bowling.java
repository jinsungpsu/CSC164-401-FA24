import java.util.*;

public class BetterBowling {
    public static void main(String[] args) {
        System.out.println("Number of bowlers in the league: " + Bowler.numBowlers);

        Bowler b1 = new Bowler();
        Bowler b2 = new Bowler();

        Random rng = new Random();

        for (int i = 0; i < 10; i++) {
            b1.game.frameScores[i][0] = rng.nextInt(11);
            b1.game.frameScores[i][1] = rng.nextInt(11);
            b2.game.frameScores[i][0] = rng.nextInt(11);
            b2.game.frameScores[i][1] = rng.nextInt(11);
        }

        System.out.println("Total number of bowlers i: " + Bowler.numBowlers);

        Scanner keyboard = new Scanner(System.in);
        // Scanner is a class
        // keyboard is an object/instance of Scanner class
        // Scanner(System.in) is a constructor with
        // one parameter

        b1.name = keyboard.next();
        /*
        next is a method in the Scanner class
        it takes no arguments
        returns a String
         */


        /*
        String class example
         */
        //String bowlerName = "Shooter";
        String bowlerName = new String("Shooter");

        char firstLetter = bowlerName.charAt(0);

        if (firstLetter < 'L') {
            System.out.println("You are in the first half of the alphabet... you will bowl at 1pm");
        }

        if (bowlerName.length() > 10) {
            System.out.println("You'll need a special form, because your name is very long.");
        }



        /*
        What kinds of methods are in the String class???
        https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
        https://www.geeksforgeeks.org/string-class-in-java/
         */


        b2.name = "Shooter McGavin";
        // b1.ranking = 1;
        b2.ranking = 9;
        b1.gender  = 'M';
        // b2.gender = 'M';
        b1.proStatus = false;
        b2.proStatus = true;

        System.out.println("First bowler's info: ");
        System.out.println(b1.name);
        System.out.println(b1.gender);
        System.out.println("Pro status: " + b1.proStatus);
        System.out.println("Ranking " + b1.ranking);

        System.out.println("Second bowler's info: ");
        System.out.println(b2.name);
        System.out.println(b2.gender);
        System.out.println("Pro status: " + b2.proStatus);
        System.out.println("Ranking " + b2.ranking);

        System.out.println("--- I'm \"copying\" b2 into b1 ----");
        b1 = b2;
        System.gc();
        b2.name = "Adam Sandler";

        System.out.println("First bowler's info: ");
        System.out.println(b1.name);
        System.out.println(b1.gender);
        System.out.println("Pro status: " + b1.proStatus);
        System.out.println("Ranking " + b1.ranking);

        System.out.println("Second bowler's info: ");
        System.out.println(b2.name);
        System.out.println(b2.gender);
        System.out.println("Pro status: " + b2.proStatus);
        System.out.println("Ranking " + b2.ranking);
    }
}

class BowlingGame {
    int[][] frameScores = new int[10][2];
    String date;
    String time;
}

class Bowler {
    /*
    primitive types will have a default value of 0
    reference types will have a default value of null
     */
    static final int MAX_SCORE = 300;
    static int numBowlers=0;
    boolean proStatus;
    char gender;
    int ranking;
    String name;
    BowlingGame game = new BowlingGame();
    /*
    10 frames
    2 throws each
    (not accounting for special 10th frame logic)
     */

    Bowler() {
        numBowlers++;
    }
}
