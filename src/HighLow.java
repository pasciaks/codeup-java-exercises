import java.util.Scanner;

public class HighLow {

    public static int getRandomInteger(int min, int max) {
        return (int) Math.floor(Math.random() * max) + min;
    }

    public static boolean promptUserToContinue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y");
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldTryAgain = true;
        int validUserInput = 0;
        do {
            try {
                scanner = new Scanner(System.in);
                System.out.printf("Enter a number between %d and %d: ", min, max);
                String userInputString = scanner.nextLine();
                int userInput = Integer.parseInt(userInputString);
                if (userInput >= min && userInput <= max) {
                    validUserInput = userInput;
                    shouldTryAgain = false;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input. Try again.");
            }
        } while (shouldTryAgain);
        return validUserInput;
    }

    public static void main(String[] args) {

        //        (5)       Game Development 101  (see additional class file)
        //
        //        Welcome to the world of game development!
        //
        //                You are going to build a high-low guessing game. Create a class named HighLow inside of src.
        //
        //        The specs for the game are:
        //
        //        Game picks a random number between 1 and 100.

        //        Prompts user to guess the number.

        //        All user inputs are validated.

        //        If user's guess is less than the number, it outputs "HIGHER".
        //        If user's guess is more than the number, it outputs "LOWER".
        //        If a user guesses the number, the game should declare "GOOD GUESS!"

        //        Hints
        //
        //        Use the random method of the java.lang.Math class to generate a random number.

        //        Bonus
        //
        //        Keep track of how many guesses a user makes.

        //        Set an upper limit on the number of guesses.

        int currentGuess = 0;
        int maxGuesses = 10;
        int randomNumber = getRandomInteger(1, 100);

        boolean wasSuccessful = false;

        System.out.println("Welcome to the High-Low guessing game!");

        System.out.println("You have " + maxGuesses + " guesses to guess the number between 1 and 100.");

        do {

            currentGuess++;

            System.out.println("This is guess number " + currentGuess + " of " + maxGuesses + " guesses allowed.");

            int yourGuess = getInteger(1, 100);

            if (yourGuess == randomNumber) {
                System.out.println("GOOD GUESS!");
                wasSuccessful = true;
                break;
            } else if (yourGuess < randomNumber) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }

        } while (maxGuesses > currentGuess);

        if (!wasSuccessful) {
            System.out.println("You ran out of guesses.");
        } else {
            System.out.println("You guessed the number in " + currentGuess + " guesses.");
        }

        System.out.println("The number was " + randomNumber);

    }
}
