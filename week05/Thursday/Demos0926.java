import java.util.Random;
import java.util.Scanner;

class Car {
    /*
    What a car is...
    ** properties, data fields, attributes
    ** ultimately stored in variables!!

    encapsulation - bundling data/behaviors into one box
     */
    String make, model;
    float miles;
    float acceleration;
    String color;
    String vinNumber;
    String nameOfTheGuyWhoDrivesThisCar;

    /*
    not public... if there is another public class in the same file
    Car is the name of this class
    should capitalize the "C" as a best practice/naming convention
    this part of the code will define what a car is and does (data fields and methods)
     */

    /*
    Constructors - special methods
    NO return type
    initalize objects
     */
    Car() {

    }

    Car(int miles) {

    }

}

public class Demos0926 {
    public static void main(String[] args) {

        /*
        Exam review
         */
        // casting
        // demoting vs promoting
        // narrowing vs widening

        // can automatically promote
        // b/c you are taking a "smaller" data type
        // and converting to "bigger"
        // such as int to double
        int num5 = 10;
        double num6 = num5;

        // CANNOT go the other way
        double num7 = 10.5;
        int num8 = num7; // this is an error

        // BUT you can force it to work
        // by explicit casting (non automatic)
        // acknowledging to the computer
        // that there may be possible loss of data
        int num9 = (int) num7;

        // implicit > promotion
        // explicit > demotion
        // order from small to big
        // byte, short, int, long, float, double
        // can implicitly cast from left to right
        // must explicitly cast from right to left

        // array creation... must know the size
        int[] arr = new int[5]; // explicit size of 5

        int[] arr2 = {1, 2, 3, 4}; // IMPLICIT size of 4

        arr2[4] = 5; // this is out of bounds
        // arr 2 is size 4, index 4 is the 5th item

        boolean exp1 = (1 < 2) && (1 + 5 <= 10) && !true;

        int num;
        num = 5;
        // can define and initialize at same time
        int num2 = 5;

        Car honda;
        honda = new Car();

        Car toyota;
        Car mercedes, lamborghini;

        lamborghini = new Car();

        honda.make = "Honda";
        honda.model = "Civic Type-R";
        honda.acceleration = 9.99f;
        honda.miles = 2;
        honda.color = "black";
        honda.vinNumber = "1v99z69879ab98790";

        lamborghini.color = "yellow";
        lamborghini.acceleration = 99.9f;
        lamborghini.make = "Lambo";
        lamborghini.model = "Murcielago";
        lamborghini.miles = 20;

        System.out.println("First car info: ");
        System.out.println(honda.make);
        System.out.println(honda.model);

        System.out.println("Second car info: ");
        System.out.println(lamborghini.make);
        System.out.println(lamborghini.model);




        /*
        so far, we know about 3 classes
        Random
        String
        Scanner
         */
        Random rng = new Random(); // <-- this is a constructor
        // with no arguments
        // sprintMyName(); // <-- this is a method call...

        Scanner keyboard = new Scanner(System.in); // <-- constructor!
        // this one does have an argument
        // whatever "System.in" is...

        String firstName = "Alex";
        // String is definitely a class... i promise
        // to create an instance of ANY class
        // you MUST call a constructor
        // this is an example of java
        // hiding stuff from you
        String lastName = new String("Smith");
        // <-- also a constructor... with one argument
        // which is a string
    }

    static int[][][][][][] printMyName(String name, int age, int[] bowlerScores) {
        System.out.println("Mr. An");
        return new int[1][2][3][4][5][6];
    }

}
