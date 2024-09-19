import java.util.Random;
import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {
        final int NUM_FRAMES = 10;
        final int NUM_THROWS = 2;
        int[][] bowlerScores = new int[NUM_FRAMES][NUM_THROWS];

        simulateBowling(bowlerScores);

        System.out.print("| ");
        for (int frameNum = 0; frameNum < bowlerScores.length - 1; frameNum++) {
            System.out.print("Frame " + frameNum + ": ");
            for (int throwNum = 0; throwNum < bowlerScores[frameNum].length; throwNum++) {
                System.out.print(bowlerScores[frameNum][throwNum] + " ");
                // this area repeats 20x
            }

            if (bowlerScores[frameNum][1] + bowlerScores[frameNum][2] >= 10) {
                System.out.print("**");
            }

            // this area repeats 10x
            System.out.print("| ");
        }

        System.out.println("\n\n ** Denotes possible error in score!");

    }
    static void simulateBowling(int[][] scores) {
        for (int frameNum = 0; frameNum < scores.length; frameNum++) {
            for (int throwNum = 0; throwNum < scores[frameNum].length; throwNum++) {
                scores[throwNum][frameNum] = randomBowlingThrowScore();
            }
        }
    }

    static int randomBowlingThrowScore() {
        Random rng = new Random();
        return rng.nextInt(10);
    }
}
