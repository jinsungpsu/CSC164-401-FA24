import java.util.*;

public class BetterBowling {
    public static void main(String[] args) {
        /*
        Array of objects!!!
         */

        // array of ints
        int[] arr = new int[5];
        // new keyword
        // also need a size

        int[] arr2 = {1,2,3};
        // implied size

        BowlingPlayer[] bowlingTeam = new BowlingPlayer[4];
        // it is creating an array
        // of reference variables
        // right now in this part of the program
        // i don't have 4 bowlers...
        // i have 4 ref vars that COULD point to a bowler
        // how do i REALLY know this??????
        // i never called Bowler constructor...

        // need to actually create an object
        BowlingPlayer alex = new BowlingPlayer();
        bowlingTeam[0] = alex;

        bowlingTeam[0].name = "Alex";
        bowlingTeam[0].game.simulateGame();
        bowlingTeam[0].proStatus = false;
        bowlingTeam[0].ranking = 952;

        // create a second bowler and directly assign it
        // into the ref var array
        bowlingTeam[1] = new BowlingPlayer();

        // could do multiple bowlers using a loop
        for (int i = 2; i < bowlingTeam.length; i++) {
            bowlingTeam[i] = new BowlingPlayer();
        }

        Random rng = new Random();

        System.out.println("Number of bowlers in the league: " + BowlingPlayer.numBowlers);

        BowlingPlayer b1 = new BowlingPlayer();
        BowlingPlayer b2 = new BowlingPlayer();

//        simulateBowlerScores(b1);
//        simulateBowlerScores(b2);
        b1.game.simulateGame();
        b2.game.simulateGame();

        System.out.println("Total number of bowlers i: " + BowlingPlayer.numBowlers);

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
        char gender = 'T';
        b1.setGender(gender);
//        if (gender == 'M' || gender == 'F' || gender == 'm' || gender == 'f') {
//            // a valid gender is provided...
//            b1.gender  = 'M';
//        } else {
//            // an invalid gender
//        }
        // b2.gender = 'M';
        b1.proStatus = false;
        b2.proStatus = true;

        System.out.println("First bowler's info: ");
        System.out.println(b1.name);
        System.out.println(b1.getGender());
        System.out.println("Pro status: " + b1.proStatus);
        System.out.println("Ranking " + b1.ranking);

        System.out.println("Second bowler's info: ");
        System.out.println(b2.name);
        System.out.println(b2.getGender());
        System.out.println("Pro status: " + b2.proStatus);
        System.out.println("Ranking " + b2.ranking);

        System.out.println("--- I'm \"copying\" b2 into b1 ----");
        b1 = b2;
        System.gc();
        b2.name = "Adam Sandler";

        System.out.println("First bowler's info: ");
        System.out.println(b1.name);
        System.out.println(b1.getGender());
        System.out.println("Pro status: " + b1.proStatus);
        System.out.println("Ranking " + b1.ranking);

        System.out.println("Second bowler's info: ");
        System.out.println(b2.name);
        System.out.println(b2.getGender());
        System.out.println("Pro status: " + b2.proStatus);
        System.out.println("Ranking " + b2.ranking);
    }

    /*
    passing objects into a method... always by reference!!!  changes in method will affect values EVERYWHERE
     */
    static void printBowlerInfo(BowlingPlayer bowlingPlayer) {

    }

    static void simulateBowlerScores(BowlingPlayer bowlingPlayer) {
        Random rng = new Random(0);
        for (int i = 0; i < 10; i++) {
            bowlingPlayer.game.frameScores[i][0] = rng.nextInt(11);
            bowlingPlayer.game.frameScores[i][1] = rng.nextInt(11);
        }
    }

}

class BowlingGame {
    /*
    best practice
    all data fields should be private!!!
     */
    int[][] frameScores = new int[10][2];
    String date;
    String time;

    void simulateGame() {
        Random rng = new Random(0);
        for (int i = 0; i < 10; i++) {
            frameScores[i][0] = rng.nextInt(11);
            frameScores[i][1] = rng.nextInt(11);
        }
    }
}

class BowlingPlayer {
    /*
    primitive types will have a default value of 0
    reference types will have a default value of null
     */

    /*
    best practice
    all data fields should be private!!!

    EXCEPT constants
     */
    static final int MAX_SCORE = 300;
    static int numBowlers=0;
    boolean proStatus;
    private char gender;
    int ranking;
    String name;
    BowlingGame game = new BowlingGame();
    /*
    10 frames
    2 throws each
    (not accounting for special 10th frame logic)
     */

    BowlingPlayer() {
        numBowlers++;
    }

    // setter or mutator
    // provides an interface to change
    // private data
    // gender is a char type
    // method name will be "set" followed by var name
    public void setGender(char genderInfo) {
        if (genderInfo == 'M' || genderInfo == 'F' || genderInfo == 'm' || genderInfo == 'f') {
            // a valid gender is provided...
            gender  = genderInfo;
        } else {
            // an invalid gender
        }
    }

    // if I need to access to private data
    // getter or accessor
    // getters always follow the same patter
    // return type = same as the piece of info I need
    // in this case a char
    // name will be "get" followed by the var name
    // no parameters
    // will have public visibility

    public char getGender() {
        return gender;
    }

}
