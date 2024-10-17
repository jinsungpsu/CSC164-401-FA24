public class FootballPlayer extends RankedPlayer {
    /*
    A class can only inherit from one other single class
    NO multiple inheritance in java
     */


    // this is redundant
    //    private String name;
    //    private int rank;

    private double fortyTime;

    public FootballPlayer(String name, double fortyTime) {
        super(name);
        this.fortyTime = fortyTime;
    }

    public double getFortyTime() {
        return fortyTime;
    }

    public void setFortyTime(double fortyTime) {
        this.fortyTime = fortyTime;
    }
}
