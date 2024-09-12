import java.util.Random;

public class Demos0912 {
    public static void main(String[] args) {
        /*
        help for lab
         */

        int[] bowler1 = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,10};
        int[] bowler2 = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,6};

        int frame = 1;
        for (int i = 0; i < bowler1.length-1; i+=2) {
            // i = 0, i = 2, i = 4, i = 6
            // this loop repeats 10 times... not 20
            // bowler 1 first frame scores are:
            System.out.println("Frame # " + frame + " scores are: ");
            System.out.println("First throw is: " + bowler1[i] + " second throw is: " + bowler1[i+1]);
            frame++;
        }



        Random rng = new Random();

        rng.setSeed(0);

        for (int i = 0; i < 5;i ++)
            System.out.println(rng.nextInt(50));

        /* 2D arrays */
        // just an array of arrays
        String[][] teamRosters = {
                {"Saquon", "Hurts", "Kelce"},
                {"DeVito", "Nabers", "Bobby"},
                {"Mahomes", "Kelce", "Rice"}
        };

        // Done separately
        String[] eagles = {"Hurts", "Goedert", "Smith"};
        String[] giants = {"Jones", "Bellinger", "Nabers"};
        String[] chiefs = {"Mahomes", "Kelce", "Rice"};

        String[][] all3teams = {eagles, giants, chiefs};

        String[] quarterbacks = {"Hurts", "Jones", "Mahomes"};
        String[] tightEnds = {"Goedert", "Bellinger", "Kelce"};
        String[] receivers = {"Smith", "Nabers", "Rice"};

        String[][] playersByPosition = {quarterbacks, tightEnds, receivers};


        // how do I find Nabers?

        int[] scores = {1,2,3};

        // for each loop
        // syntax is:
        // for (datatype varName : arrayName)
        for (int each : scores) {
            System.out.println(each);
        }

        // this is exactly equivalent to
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score #" + (i+1) + ": " + scores[i]);
        }

        String[] players = {"Saquon", "Jones", "Hurts"};
        String[] anotherTeam = players;
        // the previous line does NOT create another team
        // of the same players as array "players"

        System.out.println("###############");

        System.out.println("pLayers array: ");
        for (String each: players) {
            System.out.println(each);
        }

        anotherTeam[1] = "DeVito";

        System.out.println("pLayers array after anotherTeam[1] was changed! ");
        for (String each: players) {
            System.out.println(each);
        }

        System.out.println("anotherTeam array");
        for (String each: anotherTeam) {
            System.out.println(each);
        }

        System.out.println("###############");

        int counter = 0;
        // this is silly
        // don't do it
        // if you need a counter, use a regular
        // for loop
        for (String player : players) {
            System.out.println(counter++ + " " + player);
        }
    }
}
