import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // what is a ref var?
        // ref var points to an object in memory...
        // does NOT directly store the value
        Contractor guy1 = new Contractor();
        guy1.setName("Guy 1");
        // guy 1 is a reference variable
        Contractor guy2;
        // guy 2 is a reference variable
        // guy2 is currently null
        // i did not create an object...

        System.out.println(guy1);

        guy2 = guy1;
        // guy2 never existed as an object...
        // meaning.. there's still only one object
        // it pointed the guy2 ref var to the same object as guy1

        guy1.setName("guy2");

        System.out.println("After changing name: ");
        System.out.println(guy1);
        System.out.println(guy2);



        // polymorphic array list

        ArrayList<Contractor> anotherTeam = new ArrayList<>();
        anotherTeam.add(new ConstructionWorker());
        anotherTeam.add(new Quarterback("Hurts", 5.5));
        anotherTeam.add(new Bowler("Shooter McGavin"));

        Quarterback qb2 = new Quarterback("Kenny Pickett", 5.1);

        anotherTeam.set(1, qb2);

        System.out.println(anotherTeam);

        System.out.println(anotherTeam.get(2));

        System.out.println("List in line 22: " + anotherTeam);
        anotherTeam.remove(qb2);
        System.out.println("After removing qb2: " + anotherTeam);

        // there's a lot of functionality built into arraylist
        // https://www.w3schools.com/java/java_arraylist.asp



        String[] names;
        ArrayList<String> moreNames = new ArrayList<>();
        moreNames.add("Alex");
        moreNames.add("Bonnie");
        System.out.println(moreNames);

        // instead of moreNames[1]
        System.out.println("Print second item: " + moreNames.get(1));

        // instead of moreNames.length
        System.out.println("The length of this list is: " + moreNames.size());

        for (int i = 0; i< moreNames.size(); i++) {
            System.out.println(moreNames.get(i));
        }

        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i <20; i++) {
            String addName = keyboard.next();
            moreNames.add(addName);
            System.out.println("The list now contains " + moreNames);
        }

        /*
        a listing of everyone that works at the eagles organization
         */


        /*
        there's no contractor objects yet
        this is an array of ref vars
         */
        Contractor[] employeeDirectory = new Contractor[3];
        employeeDirectory[0].setName("Lurie");

        employeeDirectory[0] = new Contractor();
        employeeDirectory[0].setName("Jeffrey Lurie");
        employeeDirectory[0].setContractAmount(99999999);
        employeeDirectory[0].setJobDescription("Owns the team.");

        employeeDirectory[1] = new Quarterback("Jalen Hurts", 4.3);
        employeeDirectory[1].setJobDescription("Throw the football to your own team, suckaaa");
        employeeDirectory[1].setContractAmount(55000000);

        employeeDirectory[2] = new ConstructionWorker();
        employeeDirectory[2].setName("Billy Bob");
        employeeDirectory[2].setJobDescription("Fix stuff");
        employeeDirectory[2].setContractAmount(700000);

        if (employeeDirectory[0].equals(employeeDirectory[1])) {
            System.out.println("Lurie is equals to Hurts");
        }

        System.out.println("\n###### Employee directory #######\n");
        for (Contractor each: employeeDirectory) {
            if (each instanceof FootballPlayer) {
                System.out.println("This is a football player");
                System.out.println(each);
            } else {
                System.out.println(each + " is not a football player");
            }

        }

        String password = "Password123!";
        if (password.equals("Password123")) {

        }



        Quarterback qb1;
        qb1 = new Quarterback("Brady", 5.5);

        FootballPlayer fbPlayer = qb1;
        RankedPlayer rankedPlayer = qb1;
        Contractor contractor1 = qb1;
        Object tb12 = qb1;

        // operation, 2 operands, 1st operand = ref var
        // 2nd operand is a class
        // the result is true or false




        SoccerPlayer ronaldo = new SoccerPlayer("Cristiano Ronaldo");
        ronaldo.setGoalsScored(10000);
        ronaldo.setContractAmount(999999999);
        ronaldo.setRank(2);

        System.out.println(ronaldo);










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
