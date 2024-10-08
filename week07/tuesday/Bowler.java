import java.util.Random;

public class Bowler {
    private String name;
    private int[][] scores = new int[10][2];
    private boolean proStatus;

    public Bowler() {
        proStatus = false;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setProStatus(boolean newProStatus) {
        proStatus = newProStatus;
    }

    public boolean getProStatus() {
        return proStatus;
    }

    public void setScores(int[][] newScores) {
        scores = newScores;
    }

    public int[][] getScores() {
        return scores;
    }

    public void simulateRandomGame() {
        Random rng = new Random();
        for (int i = 0; i < scores.length; i++) {
            scores[i][0] = rng.nextInt(11);
            scores[i][1] = rng.nextInt(11);
        }
    }

    public void printGameScores() {
        for (int j = 0; j < scores.length; j++) {
            System.out.print(scores[j][0] + " ");
            System.out.print(scores[j][1] + " \n");
        }
    }

}

class BowlingLegueApp {
    public static void main(String[] args) {
        Bowler[] bowlers = new Bowler[2];
        for (int i = 0; i < bowlers.length; i++) {
            bowlers[i] = new Bowler();
            bowlers[i].simulateRandomGame();
        }
        bowlers[0].setName("Alex");
        bowlers[1].setName("Chris");

        /*
        How would I print out their scores?
         */

        // this loop goes through each bowler
        for (int i = 0; i < bowlers.length; i++) {
            System.out.println("Bowler name: " + bowlers[i].getName());
            bowlers[i].printGameScores();
        }
    }
}
