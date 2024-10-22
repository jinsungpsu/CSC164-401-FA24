public class Quarterback extends FootballPlayer{

    public Quarterback(String name, double fortyTime) {
        super(name, fortyTime);
    }

    // this won't work, because
    // isRecordBreaking in FootballPlayer superclass
    // is private
    //    @Override
    //    private boolean isRecordBreaking(double time) {
    //
    //    }
}
