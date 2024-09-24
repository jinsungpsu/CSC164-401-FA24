import java.util.Scanner;

public class Demos0924 {
    public static void main(String[] args) {
        // calling methods and overloaded methods
        System.out.println("The sum of 1+2 is: " + sum(1,2));
        System.out.println("The sum of 1+2+3 is: " + sum(1,2,3));

        // you can call value returning methods like this
        sum(5,6);  // nelson aghalore (dropped pass)

        /*
        Write a method that adds up a specific row of values in a 2 dimensional array of integers.

            Return type?
                int

            Parameters?
                 int[][] the array, int the row

        */


        /*
        Write a method that does input validation - for example, an integer between 1 and 5
        Return type?
        Parameters?

        option 1
          return type: true/false whether it's valid?
          parameters: input int

        option 2
            an integer.. a valid integer
            return type: int - which MUST be between 1-5
            parameters: integer to validate? maybe none?
            notes: does a previous value get sent in? maybe not...

       option 3???????
         */

        System.out.println("Option 1");
        Scanner scanner = new Scanner(System.in);
        if (isValidInput(scanner.nextInt())) {
            System.out.println("That input is between 1-5");
        } else {
            System.out.println("Invalid!");
        }

        System.out.println("Option 2");
        int userInput = getValidUserInputBetween1and5();

        System.out.println("Please enter a value between 10 and 99");
        int someInput = getValidUserInputBetween10and99();

    }
// can't do this... ambiguous invocation situation... because there's alrady
    // another method called sum with two int params
//    static int sum(int blah, int taco) {
//        return 99;
//    }

    // different return type does NOT provide enough information
    // to computer to differentiate between the next 2 methods
//    static double sum(int num1, int num2) {
//        return 1.1;
//    }

    static int sum(int num1, int num2) {
        return num1+num2;
    }

    // overloading a method
    static int sum(int num1, int num2, int num3) {
        return num1+num2 +num3;
    }

    /*
    this method will add each item in the row of the array sent in
    we'll assume row is not out of bounds
    OR - it will return -999999 if it is out of bounds

     */
    static int sumRowIn2DArray(int[][] array, int row) {
        if (row > array.length-1) {
            System.out.println("Error");
            return -999999;
        }
        int sum = 0;
        for (int i = 0; i < array[row].length; i++) {
            sum+=array[row][i];
        }
        return sum;
    }

    static boolean isValidInput(int inputToValidate) {
        if (inputToValidate > 0 && inputToValidate < 6) {
            return true;
        } else {
            return false;
        }

        /*
        fancy/concise way of doing the same thing:
        return (inputToValidate > 0 && inputToValidate < 6);
         */
    }

    static int getValidUserInputBetween10and99() {
        return getValidUserInputBetweenAnyTwoNumbers(10, 99);
    }

    static int getValidUserInputBetween1and5() {
        Scanner keyboard = new Scanner(System.in);
        int userInput = keyboard.nextInt();
        while (userInput < 1 || userInput > 5) {
            userInput = keyboard.nextInt();
        }
        return userInput;
    }

    /*
    this method validates user input user scanner/keyboard
    it will return an integer when it's done
    it will loop until a valid user input has been entered
    parameter int low is the lowest valid value
    parameter int high is the highest valid value
    INCLUSIVE!  So range is [low, high]
     */
    static int getValidUserInputBetweenAnyTwoNumbers(int low, int high) {
        Scanner keyboard = new Scanner(System.in);
        int userInput = keyboard.nextInt();
        while (userInput < low || userInput > high) {
            userInput = keyboard.nextInt();
        }
        return userInput;
    }
}
