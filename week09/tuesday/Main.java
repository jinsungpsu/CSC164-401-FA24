public class Main {
    public static void main(String[] args) {

        Electrician bob = new Electrician();

        FootballPlayer koo = new FootballPlayer("Younghoe Koo", 4.0);
        koo.setRank(2);
        koo.setContractAmount(3000000);
        koo.setJobDescription("Kick the ball.");

        System.out.println("Koo makes: $" + koo.getContractAmount());

        System.out.println("Koo's string representation: " + koo.toString());
        System.out.println(koo); // implied toString method call

        /* no longer need to use all the
        individual getters

        use the toString method instead
        which returns a string representation
        of that object
         */

        System.out.println("this player's info is: ");
        System.out.println(koo.getName());
        System.out.println(koo.getFortyTime());
        System.out.println(koo.getRank());
        System.out.println(koo.getContractAmount());


    }
}
