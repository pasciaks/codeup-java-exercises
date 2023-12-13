import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

        // solution option 1
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        // solution option 2
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        // solution option 3
        String result = String.format("The value of pi is approximately %.2f.%n", pi);
        System.out.println(result);

        // EXPLORING THE SCANNER CLASS

        // scanner has a default delimiter of whitespace (space, tab, newline) // -- explore --> scanner.useDelimiter("\n");

        //        System.out.print("Enter something: ");
        //        String userInput = scanner.next(); // parses entries by spaces
        //        System.out.println("You entered: --> \"" + userInput + "\" <--");
        //        String userInputLine = scanner.nextLine(); // parses entries by new lines
        //        System.out.println("You entered: --> \"" + userInputLine + "\" <--");

        //
        //        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        //
        //        What happens if you input something that is not an integer?

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: --> \"" + intValue + "\" <--");

        // *** If non-integer is entered, program crashes with the following error message:
        //        Exception in thread "main" java.util.InputMismatchException
        //        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        //        at java.base/java.util.Scanner.next(Scanner.java:1594)
        //        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        //        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        //        at ConsoleExercises.main(ConsoleExercises.java:24)

        //        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        //
        //        What happens if you enter less than 3 words? Scanner waits for input.
        //        What happens if you enter more than 3 words? Scanner consumes the first 3 words and ignores the rest.

        scanner = new Scanner(System.in);

        System.out.println("Enter a string of 3 words: ");

        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();

        System.out.println("You entered: --> \"" + s1 + "\" <--");
        System.out.println("You entered: --> \"" + s2 + "\" <--");
        System.out.println("You entered: --> \"" + s3 + "\" <--");

        //        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        //        do you capture all the words? No, only the first word.

        scanner = new Scanner(System.in); // clear out previous scanner input
        System.out.println("Enter a sentence: ");
        String sentence = scanner.next();
        System.out.println("You entered: --> \"" + sentence + "\" <--");

        //        Rewrite the above example using the nextLine method.

        scanner = new Scanner(System.in); // clear out previous scanner input

        System.out.println("Enter a sentence: ");
        String sentence2 = scanner.nextLine();
        System.out.println("You entered: --> \"" + sentence2 + "\" <--");

        //        Calculate the perimeter and area of Codeup's classrooms.
        //        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
        //        Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
        //        Assume that the rooms are perfect rectangles.
        //        Assume that the user will enter valid numeric data for length and width.
        //        Display the area and perimeter of that classroom.
        //        The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

        scanner = new Scanner(System.in); // clear out previous scanner input

        System.out.println("Enter the integer length: ");
        String stringLength = scanner.nextLine();
        System.out.println("Enter the integer width: ");
        String stringWidth = scanner.nextLine();

        int length = Integer.parseInt(stringLength);
        int width = Integer.parseInt(stringWidth);

        int area = length * width;
        int perimeter = (2 * length) + (2 * width);

        System.out.println("The area of the classroom is: " + area + " units squared.");
        System.out.println("The perimeter of the classroom is: " + perimeter + " units.");

        ///--- BONUS ---///

        //        In your perimeter/area calculator:
        //
        //        Accept decimal entries.
        //        Calculate the volume of the rooms in addition to the area and perimeter.

        scanner = new Scanner(System.in); // clear out previous scanner input

        System.out.println("Enter the length as a decimal number: ");
        String stringLength2 = scanner.nextLine();
        System.out.println("Enter the width as a decimal number: ");
        String stringWidth2 = scanner.nextLine();
        System.out.println("Enter the height as a decimal number: ");
        String stringHeight = scanner.nextLine();

        double length2 = Double.parseDouble(stringLength2);
        double width2 = Double.parseDouble(stringWidth2);
        double height = Double.parseDouble(stringHeight);

        double area2 = length2 * width2;
        double perimeter2 = (2 * length2) + (2 * width2);
        double volume = length2 * width2 * height;

        System.out.println("The area of the classroom is: " + area2 + " units squared.");
        System.out.println("The perimeter of the classroom is: " + perimeter2 + " units.");
        System.out.println("The volume of the classroom is: " + volume + " units cubed.");

        System.out.printf("The area of the classroom is: %.2f units squared.%n", area2);
        System.out.printf("The perimeter of the classroom is: %.2f units.%n", perimeter2);
        System.out.printf("The volume of the classroom is: %.2f units cubed.%n", volume);

        scanner = new Scanner(System.in); // clear out previous scanner input

        System.out.println("Enter the length and width integers separated by a space: ");
        int lengthFromUser = scanner.nextInt();
        int widthFromUser = scanner.nextInt();
        System.out.println("The perimeter of the classroom is: " + ((2 * lengthFromUser) + (2 * widthFromUser)) + " units.");
        System.out.println("The area of the classroom is: " + (lengthFromUser * widthFromUser) + " units squared.");

        scanner = new Scanner(System.in); // clear out previous scanner input

        //        Bonuses
        //
        //        The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
        //
        //        scanner.useDelimiter("\n");
        //
        //        How does this change the way your program operates? Must enter between values.

        scanner.useDelimiter("\n");

        System.out.println("Enter the length and width integers separated by new line: ");
        int length3 = scanner.nextInt();
        int width3 = scanner.nextInt();
        System.out.println("The perimeter of the classroom is: " + ((2 * length3) + (2 * width3)) + " units.");
        System.out.println("The area of the classroom is: " + (length3 * width3) + " units squared.");

    }

}

//        Bonuses
//
//        Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
