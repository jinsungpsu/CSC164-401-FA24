import java.util.*; // import all NEEDED classes
 // or could explicitly import the ones i need
import java.util.Scanner;

public class Demos0905 {
    public static void main(String[] args) {
        byte smallNum = 99;

        // implicit casting
        int biggerNum = smallNum;

        // explicit casting
        // required b/c it would be a checked error otherwise
        byte anotherSmallNum = (byte) biggerNum;

        int people = 3;
        int additionalPeople = 10;
        double slices = 5.5e0; // scientific notation
        // 5.5 x 10^0
        System.out.println("Slices per person is: " + (slices % people));
        //        int slicePerPerson = (int) (slices % people);

        // accumulator using augmented operator
        people += additionalPeople;
        // equivalent to people = people + additionalPeople;

        int leftParty = 2;
        people -= leftParty + 99 - 50;
        // same as
        // people = people - leftParty + 99 - 50;



        // if your variable identifier has multiple words
        // start each word with an upper case
        // camel case... upper case is a hump in the camel
        int numberOfStudentsInMyCscClass;

        // for constants...
        // all caps... underscore between each word
        final int NUMBER_OF_FLAGS = 99;

        System.out.println("Hello " + "world");
        // adding two strings together

        System.out.println("My age is: " + 18);
        // adding a string to an integer
        // + operation requires two similar types
        // the integer 18 is converted (implicitly)
        // to a string
        // then two strings are together
        // output is "My age is: 18"

        System.out.println(1+1);
        // this is adding two numbers together
        // output is "2"

        System.out.println("My age is " + 18 + 1);
        // output will be "My age is 181"

        System.out.println("My age is " + (18+1));
        // output will be "My age is 19"

        int num;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: (please enter an actual number using digits 0-9... don't use words... please... cuz i don't know how to fix it.. yet");
        num = keyboard.nextInt();

        int num2 = keyboard.nextInt();

        String name = keyboard.next();


        // cout << "You entered " << num;
        System.out.println("You entered: " + num);
        // adding (or concatenating) a bunch of values together
        // and then sending it to the "screen"




        keyboard.close();
        // clean up... not required...

        int num3 = keyboard.nextInt();
    }
}
