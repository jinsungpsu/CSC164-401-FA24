public class BetterBowling {
    public static void main(String[] args) {
        Bowler b1 = new Bowler();
        Bowler b2 = new Bowler();

        b1.frameScores[0][1] = 2;

    }
}

class Bowler {
    String name;
    int handicap;
    int[][] frameScores = new int[10][2];
    /*
    10 frames
    2 throws each
    (not accounting for special 10th frame logic)
     */
}
