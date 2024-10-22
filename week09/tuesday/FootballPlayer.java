public class FootballPlayer extends RankedPlayer {
    /*
    A class can only inherit from one other single class
    NO multiple inheritance in java
     */


    // this is redundant
    //    private String name;
    //    private int rank;

    private double fortyTime;
    private static double recordFortyTime = 4.0;

    public FootballPlayer(String name, double fortyTime) {
        super(name);
        this.fortyTime = fortyTime;
    }

    public double getFortyTime() {
        return fortyTime;
    }



    public void setFortyTime(double fortyTime) {
        this.fortyTime = fortyTime;
        if (isRecordBreaking(fortyTime)) {
            System.out.println("Congrats! it's a new record!");
        }
    }

    private boolean isRecordBreaking(double time) {
        if (time < recordFortyTime) {
            recordFortyTime = time;
            return true;
        } else {
            return false;
        }
    }

    // @Override
    // annotation to tell the compiler this method
    // is overriding a method from a superclass
    // NOT required
    // however, a good practice, so that you can
    // check that your program is doing what you intended
    @Override
    public void setContractAmount(double contractAmount) {
        if (fortyTime < 4.1) {
            super.setContractAmount(contractAmount + 1000000);
        } else {
            super.setContractAmount(contractAmount);
        }

    }

    @Override
    public String toString() {
        return "this is a football player \n" +
                "named: " + getName() +
                "who runs the forty in: " + fortyTime +
                "\n and makes $" + getContractAmount() +
                "\n and is ranked: " + getRank();
    }
}
