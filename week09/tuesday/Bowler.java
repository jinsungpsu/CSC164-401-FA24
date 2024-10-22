public class Bowler extends RankedPlayer {
    // extends RankedPlayer class
    // inherits all the data-fields/methods
    // of the RankedPlayer class

    // this is redundant
    //    private String name;
    //    private int rank;

    private double ballWeight;


    /*
    The RankedPlayer class doesn't have a
    no arg constructor...
    in other words... you cannot create a
    ranked player without a name
    therefore, you cannot create a bowler
    without a name
     */

    /*
    one possible solution is to provide a way
    to create a bowler with a name
     */
    public Bowler(String name) {
        super(name);
    }

    public Bowler(double ballWeight) {
        super("Some bowler...");
        // the super class constructor call
        // must always be the first line
        this.ballWeight = ballWeight;
    }

    public Bowler(double ballWeight, String name) {
        super(name);
        this.ballWeight = ballWeight;
    }

    /*
    alternatively
    we can provide a way to create a bowler
    without a name... kind of manually
     */

    public Bowler() {
        super("Unknown bowler");

    }

//    public Bowler(String name) {
//        this.name = name;
//        rank = 1000;
//    }

    public void setBallWeight(double ballWeight) {
        this.ballWeight = ballWeight;
    }

    public double getBallWeight() {
        return ballWeight;
    }

}
