import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        String result = String.format("The value of pi is approximately %.2f.%n", pi);

        // EXPLORING THE SCANNER CLASS

        // scanner has a default delimiter of whitespace (space, tab, newline) // -- explore --> scanner.useDelimiter("\n");

        //        System.out.print("Enter something: ");
        //        String userInput = scanner.next(); // parses entries by spaces
        //        System.out.println("You entered: --> \"" + userInput + "\" <--");
        //        String userInputLine = scanner.nextLine(); // parses entries by new lines
        //        System.out.println("You entered: --> \"" + userInputLine + "\" <--");

        System.out.print("Enter an integer: ");

        int intValue = scanner.nextInt();

        // *** If non-integer is entered, program crashes with the following error message:
        //        Exception in thread "main" java.util.InputMismatchException
        //        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        //        at java.base/java.util.Scanner.next(Scanner.java:1594)
        //        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        //        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        //        at ConsoleExercises.main(ConsoleExercises.java:24)

    }

}

//    Explore the Scanner Class.
//
//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//
//        What happens if you input something that is not an integer?
//
//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//
//        What happens if you enter less than 3 words?
//        What happens if you enter more than 3 words?
//
//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
//        do you capture all the words?
//
//        Rewrite the above example using the nextLine method.
//
//        Calculate the perimeter and area of Codeup's classrooms.
//
//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//
//        Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//
//        Assume that the user will enter valid numeric data for length and width.
//
//        Display the area and perimeter of that classroom.
//
//        The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//
//        Bonuses
//
//        In your perimeter/area calculator:
//
//        Accept decimal entries.
//        Calculate the volume of the rooms in addition to the area and perimeter.
//        The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//
//        scanner.useDelimiter("\n");
//
//        How does this change the way your program operates?
//
//        Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
