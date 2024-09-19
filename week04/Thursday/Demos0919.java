import java.util.Scanner;

public class Demos0919 {
    static Scanner keyboard = new Scanner(System.in);

    static void printGradeArrays(char[] arr) {
        for (char each: arr) {
            System.out.print(each + " ");
        }
    }
    public static void main(String[] args) {

        /*
        why array variable names are actually
        pointing to references rather than values
         */
        char[] grades = {'a', 'b', 'b', 'a', 'a'};
        char[] wishfulThinking = grades;
        wishfulThinking[1] = 'a';
        grades[2] = 'a';

        System.out.println("\n\nContents of grades arr: ");
        printGradeArrays(grades);

        System.out.println("\n\nContents of wishfulThinking array: ");
        printGradeArrays(wishfulThinking);





        int[] twoNums = {1,2};
        System.out.println("\n\nAdding " + twoNums[0] + " + " + twoNums[1]);
        addTwoNums(twoNums);
        System.out.println("\n\nValues in " + twoNums[0] + " + " + twoNums[1] + " AFTER the method call!");

        int num1=2, num2 = -5;
        System.out.println("Adding " + num1 + " + " + num2);
        addTwoNums(num1, num2);
        System.out.println("Values in " + num1 + " + " + num2 + " AFTER the method call!");




        printNum(num1);
        printNum(num2);

        terribleNameMethod();


        int number = 5;
        printNum(number);

    }

    static void addTwoNums(int[] arr) { // this is similar to pass by ref in c++
        arr[1] = 999;
        System.out.println(arr[0] + arr[1]);
    }

    static void addTwoNums(int num1, int num2) { // this IS pass by value
        num2 = 100;
        System.out.println(num1 + num2);
    }

    static void terribleNameMethod() {
        int i = 0;
        printNum(gimme5());
    }

    public static int gimme5() {
        return 5;
    }


    public static void printNum(int number) {
        if(number<0) {
            System.out.println("Your number is negative.. and my computer can't print negative numbers!");
            return;
        }

        System.out.println(number);

        return;
    }
}
