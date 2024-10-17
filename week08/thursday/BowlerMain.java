public class Main {
    public static void main(String[] args) {
        Bowler[] bowlingLeague = new Bowler[4];
        bowlingLeague[0] = new Bowler("Sheva");
        bowlingLeague[1] = new Bowler("Logan");
        bowlingLeague[2] = new Bowler("Sam");
        bowlingLeague[3] = new Bowler("Haider");

        bowlingLeague[3].setRank(350);

        /* print all bowlers */
        for (Bowler each: bowlingLeague) {
            System.out.println(each.getName() + "'s rank is: " + each.getRank());
        }

        /* print only high ranked bowers (over 500) */
        System.out.println("Print only highly ranked bowlers: ");
        for (Bowler each: bowlingLeague) {
            if (each.getRank() < 500) {
                // this particular bowler is ranked between 1 - 499
                System.out.println(each.getName() + "'s rank is: " + each.getRank());
            }
        }

    }
}
