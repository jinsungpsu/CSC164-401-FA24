import java.util.Scanner;

public class Demos0910 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number++);
        // this will display 5, then update the value to 6

        System.out.println(number); // displays 6

        System.out.println(--number);
        // this will decrement/update to 5, then display value (which is 5)

        double bigNum = 9.99;
        int smallNum = (int) bigNum;

        smallNum += 4.5;
        // quirk of java, lets you implicitly cast
        // where you can lose data

        // smallNum = smallNum + 4.5;
        // NOT allowed without explicit cast


        System.out.println("What happened to the .99? " + smallNum);

        // rounding off errors
        // due to inaccuracy of floating point under the hood
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);

        // cout << setprecision(2) << fixed;
        // display 2 decimal points!
        System.out.println(1.0 - 0.9);

        System.out.printf("If I use only 2 decimal points, it looks like this: %.2f %.2f\n\n\n", 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1, 1.0 - 0.9);

        /*
        System.out.print(); -> cout << "":
        System.out.println(); -> cout << endl << "";
        intellij shortcut is sout
        System.out.printf(); formatted printing
        intellij shortcut is souf
        printf requires more arguments to be sent in...

        within your output string...
        you can include placeholders for other tokens (things) you want to display formatted a certain way

        %s for string
        %f for float
        https://www.geeksforgeeks.org/format-specifiers-in-java/
         */
        String name = "alex";
        float gpa = 4.0f;
        System.out.printf("My name is %s and my GPA is %.2f", name, gpa);


        /*
        switch

        REALLY useful for menu driven programs
        don't forget your break
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Which track do you want to go to: ");
        int choice = input.nextInt();

        switch(choice) {
            case 5:
                // similar if (choice == 5)
                System.out.println("You're in track 5");
                break;
                // breaks me out of the current block of code
            case 1:
                // similar to if (choice == 1)
                System.out.println("You're in track 1");
                break;
            case 4:
                System.out.println("You're in track 4");
                break;
            case 99:
                // these don't have break statements
                System.out.println("99");
            case 101:
            case 200:
                System.out.println("You've chosen 99, 101, or 200");
                break;
            default:
                // similar to an else... catch all other cases
                System.out.println("Some other track...");
        } // current block of code ends... so break takes me to here...

        System.out.println("Enter word \"exit\" to exit program: " );
        String blab = input.next();
        switch (blab) {
            case "Exit":
            case "exit.":
            case "exiT":
            case "exit":
                System.out.println("Exiting program...");
                System.exit(1);
                break;
            default:
                break;
        }

        /*
        ARRAYS
         */

        int[] scores = new int[5];
        int[] scores2 = {1,2,3};
        String[] names = {"Sam", "Don", "Renu"};
        /* 2 big differences in functionality from C++ */
        // you can get the length of the array from the array
        for (int i = 0; i < names.length; i++) {

        }
        // you can create an array of any size during runtime
        int arraySize = input.nextInt();
        int[] customSizeArray = new int[arraySize];

        /*
        lab for arrays
        2 bowlers...
        each bowler has 20 different scores...

         */
        int[] bowler1 = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,10};
        int[] bowler2 = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,6};


    }
}
