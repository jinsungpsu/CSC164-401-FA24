import java.util.Random;
import java.util.Scanner;

public class Demos0917 {
    public static void main(String[] args) {
        Random rng = new Random();

        Scanner keyboard = new Scanner(System.in);


        final int NUM_FRAMES = 10;
        final int NUM_THROWS = 2;
        final int MAX_NUM = 11;
        int[][] bowlerScores = new int[NUM_FRAMES][NUM_THROWS];
        for (int frameNum = 0; frameNum < bowlerScores.length; frameNum++) {
            for (int throwNum = 0; throwNum < bowlerScores[frameNum].length; throwNum++) {
                // bowlerScores[frameNum][throwNum] = rng.nextInt(MAX_NUM);
                bowlerScores[frameNum][throwNum] = randomBowlingThrowScore();
                // The Random class hides *some* of the complexity
                // int randomNumber = (int)(Math.random()*11);
                // System.out.println(bowlerScores[frameNum]);
                // diagnostic output... not needed for the actual problem we're trying to solve
                // DON'T DO THIS.. USE THE DEBUGGER
            }
        }

        System.out.print("| ");
        for (int frameNum = 0; frameNum < bowlerScores.length; frameNum++) {
            // this area repeats 10x
            for (int throwNum = 0; throwNum < bowlerScores[frameNum].length; throwNum++) {
                System.out.print(bowlerScores[frameNum][throwNum] + " ");
                // this area repeats 20x
            }
            // this area repeats 10x
            System.out.print("| ");

            if (bowlerScores[frameNum][0] > 5) {
                // good job, you got more than 5 on your first throw
            }

        }


        System.out.println("\n\nWhich frame score do you want to view: ");
        int frameNum = keyboard.nextInt();

        // I want to see the XXXXXX frame scores...
        // whatever is stored in frameNum variable...
        // frameNum - 1

        System.out.println("The " + (frameNum) + " frame scores are: ");
        System.out.println("Throw #1 " + bowlerScores[frameNum - 1][0]);
        System.out.println("Throw #2 " + bowlerScores[frameNum - 1][1]);

        // i want to see the 10th frame scores...

        System.out.println("The tenth frame scores are: ");
        System.out.println("Throw #1 " + bowlerScores[9][0]);
        System.out.println("Throw #2 " + bowlerScores[9][1]);

        // check if a scoring error has occurred
        if (isValidScore(bowlerScores)) {
            // if (isValidScore(bowlerScores) == true)) {
            // no cheating has occurred
        }

    }

    // write a method to provide a random bowling score
    // how to write "functions" in java (really methods)
    // static return_type function_name(parameter list)
    // only difference from C++ is putting the word static in front
    // this also has to be INSIDE the class...
    static int randomBowlingThrowScore() {
        Random rng = new Random();
        return rng.nextInt(10);
    }

    // method stub
    // placeholder
    // what's the interface???
    // what's the point of this?  --> the name of the method
    // what's the data it needs to solve the problem?  --> parameter list
    // what does it need to give back to whoever is using this code?
    // in other words, what is the output of this black box?
    // in other words, what's the "solution" to the problem? --> return type

    // problem I have is ... checking a scoring error in my bowling scores
    // name: checkScores
    // data: the bowling scores
    // return type: yes or no if cheating has occurred...
    static boolean isValidScore(int[][] scores) {
        return false;
    }
}
