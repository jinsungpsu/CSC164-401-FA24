public class SoccerPlayer extends RankedPlayer {
    // this is the redundant info
    // let's put it in the superclass
    //
    //    private String name;
    //    private int rank;

    private int goalsScored;

//    public SoccerPlayer() {
//        goalsScored = 0;
//        System.out.println("A soccer player was created!");
//    }

    public SoccerPlayer(String name) {
        super(name);
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    @Override
    public String toString() {
        String output="";
        output += "#### SOCCER PLAYER ####\n";
        output += super.toString() + "\n";
        output += "goals: " + goalsScored + "\n";
        return output;
    }
}
