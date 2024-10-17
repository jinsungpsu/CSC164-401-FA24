public class RankedPlayer extends Contractor{
    /*
    this is the super class
    or parent class
    it holds all the commonalities that
    were redundant in the other classes
    i'm trying to consolidate information
    from
     */
    private String name;
    private int rank;

//    public RankedPlayer() {
//        System.out.println("Creating a ranked player of rank 1000");
//        rank = 1000;
//    }
    public RankedPlayer(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}
