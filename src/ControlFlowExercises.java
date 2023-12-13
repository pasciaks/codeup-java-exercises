import java.util.Scanner;

public class ControlFlowExercises {

    /**
     * Converts an integer to a string of a given length, padding with spaces on the left.
     *
     * @param input
     * @param length
     * @return
     */
    public static String convertIntToStringOfLengthPaddingLeft(int input, int length) {
        StringBuilder output = new StringBuilder(String.format("%d", input));
        while (output.length() < length) {
            output.insert(0, " ");
        }
        return output.toString();
    }

    /**
     * Converts an integer to a string of a given length, padding with spaces on the right.
     *
     * @param input
     * @param length
     * @return
     */
    public static String convertIntToStringOfLengthPaddingRight(int input, int length) {
        StringBuilder output = new StringBuilder(String.format("%d", input));
        while (output.length() < length) {
            output.append(" ");
        }
        return output.toString();
    }

    public static void main(String[] args) {

        // ----------------------------------------------------------------------------------------------------------------
        //        Create an integer variable i with a value of 5.
        //        Create a while loop that runs so long as i is less than or equal to 15
        //        Each loop iteration, output the current value of i, then increment i by one.
        // ----------------------------------------------------------------------------------------------------------------
        //        int i = 5;
        //        while (i <= 15) {
        //            System.out.println(i);
        //            i++;
        //        }

        // ----------------------------------------------------------------------------------------------------------------
        //        Do While
        //        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        // ----------------------------------------------------------------------------------------------------------------
        //        int i = 0;
        //        do {
        //            System.out.println(i);
        //            i += 2;
        //        } while (i <= 100);

        // ----------------------------------------------------------------------------------------------------------------
        //        Alter your loop to count backwards by 5's from 100 to -10.
        // ----------------------------------------------------------------------------------------------------------------

        //        int i = 100;
        //        do {
        //            System.out.println(i);
        //            i -= 5;
        //        } while (i >= -10);

        //        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.

        //        long i = 2;
        //        do {
        //            System.out.println(i);
        //            i *= i;
        //        } while (i < 1000000);

        //        For
        //
        //        Refactor the previous two exercises to use a for loop instead.

        // count by 2's starting with 0 and ending at 100. Follow each number with a new line.

        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        //  refactor the previous two exercises to use a for loop instead.
        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }

        //        Alter your loop to count backwards by 5's from 100 to -10.

        for (int i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }

        //        Fizzbuzz
        //
        //        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //
        //        Write a program that prints the numbers from 1 to 100.
        //        For multiples of three: print “Fizz” instead of the number.
        //        For the multiples of five: print “Buzz”.
        //        For numbers which are multiples of both three and five: print “FizzBuzz”.

        for (int i = 1; i <= 100; i++) {
            String output = "";
            if (i % 3 == 0) {
                output += " Fizz";
            }
            if (i % 5 == 0) {
                output += " Buzz";
            }
            if (output.isEmpty()) {
                output = String.format("%d", i);
            }
            System.out.println(output);
        }


        //        Display a table of powers.
        //
        //        Prompt the user to enter an integer.
        //        Display a table of squares and cubes from 1 to the value entered.
        //        Ask if the user wants to continue.
        //        Assume that the user will enter valid data.
        //        Only continue if the user agrees to.

        Scanner scanner = new Scanner(System.in);

        String s = "Sheldon";

        String stringLeftPadding = String.format("%15s", s); // pads left
        String stringRightPadding = String.format("%-15s", s); // pads right

        System.out.println("..." + stringLeftPadding + "...");
        System.out.println("..." + stringRightPadding + "...");

        int userChoice = 0;

        do {


            System.out.println("Enter an integer: ");
            userChoice = scanner.nextInt();

            System.out.println("Here is your table!\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int i = 1; i <= userChoice; i++) {
                String s1 = convertIntToStringOfLengthPaddingRight(i, 6);
                String s2 = convertIntToStringOfLengthPaddingRight(i * i, 6);
                String s3 = convertIntToStringOfLengthPaddingRight(i * i * i, 6);
                System.out.printf("%s | %s  | %s %n", s1, s2, s3);
            }

            scanner = new Scanner(System.in);

            System.out.println("Would you like to continue? [y/n]");

            String userResponse = scanner.nextLine();

            if (userResponse.equalsIgnoreCase("y")) {
                userChoice = 0;
            } else {
                userChoice = 1;
            }

        } while (userChoice == 0);

        //        Example Output
        //
        //        What number would you like to go up to? 5
        //
        //        Here is your table!
        //
        //        number | squared | cubed
        //        ------ | ------- | -----
        //        1      | 1       | 1
        //        2      | 4       | 8
        //        3      | 9       | 27
        //        4      | 16      | 64
        //        5      | 25      | 125


        //        Convert given number grades into letter grades.
        //
        //        Prompt the user for a numerical grade from 0 to 100.
        //
        //        Display the corresponding letter grade.
        //
        //        Prompt the user to continue.
        //
        //        Assume that the user will enter valid integers for the grades.
        //
        //        The application should only continue if the user agrees to.
        //
        //        Grade Ranges:
        //
        //        A : 100 - 88
        //        B : 87 - 80
        //        C : 79 - 67
        //        D : 66 - 60
        //        F : 59 - 0

        do {

            scanner = new Scanner(System.in);

            int userGrade = 0;

            System.out.println("Enter a numerical grade from 0 to 100: ");

            userGrade = scanner.nextInt();

            System.out.println("You entered: " + userGrade);

            String userLetterGrade = "F";

            if (userGrade >= 88) {
                userLetterGrade = "A";
            } else if (userGrade >= 80) {
                userLetterGrade = "B";
            } else if (userGrade >= 67) {
                userLetterGrade = "C";
            } else if (userGrade >= 60) {
                userLetterGrade = "D";
            }

            System.out.println("Your letter grade is: " + userLetterGrade);

            scanner = new Scanner(System.in);

            System.out.println("Would you like to continue? [y/n]");

            String userResponse = scanner.nextLine();

            if (userResponse.equalsIgnoreCase("y")) {
                userChoice = 0;
            } else {
                userChoice = 1;
            }

        } while (userChoice == 0);


    }
}


//Exercises
//
//        For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, comment out your previous code and continue coding in the main method with the next exercise.
//
//        Loop Basics
//
//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5
//        6
//        7
//        8
//        9
//        10
//        11
//        12
//        13
//        14
//        15

//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//
//        Alter your loop to count backwards by 5's from 100 to -10.
//
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536

//        For
//
//        Refactor the previous two exercises to use a for loop instead.

//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//        Display a table of powers.
//
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125
//
//        Convert given number grades into letter grades.
//
//        Prompt the user for a numerical grade from 0 to 100.
//
//        Display the corresponding letter grade.
//
//        Prompt the user to continue.
//
//        Assume that the user will enter valid integers for the grades.
//
//        The application should only continue if the user agrees to.
//
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
//        [^1]: With some exceptions. Because of how the JVM is implemented, string literals will be re-used, so an expression like "abc" == "abc" will evaluate to true, but only because both sides refer to the same object. This is why it is necessary to use the example with the scanner to demonstrate this concept. Although a shorter demonstration could be done by noting that the expression "abc" == new String("abc") evaluates to false, we feel that this is too complex, given that we have not yet discussed the details of creating objects. See here for more details.
//
