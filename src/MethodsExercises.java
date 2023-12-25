import java.util.Scanner;

public class MethodsExercises {

    /**
     * This method will prompt the user to enter a number between min and max.
     * If the user enters a number within the range, the method will return the number.
     * If the user enters a number outside the range, the method will prompt the user to try again.
     */
    public static void areWeThereYet(Scanner sc) {
        System.out.print("Are we there yet? yes/NO? ");
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("yes")) {
            System.out.println("Yay!");
        } else {
            areWeThereYet(sc);
        }
    }

    /**
     * This method will return a random integer number between min and max.
     *
     * @param min The minimum value for the random number.
     * @param max The maximum value for the random number.
     */
    public static int getRandomRoll(int min, int max) {
        return (int) Math.floor(Math.random() * max) + min;
    }

    // Factorial using for loop
    public static long factorialForLoop(int n) {
        long result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i; // result = result * i;
        }
        return result;
    }

    // Factorial using recursion
    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * This method will return the product of two integers using recursion.
     *
     * @param num1 The first integer.
     * @param num2 The second integer.
     */
    public static int multiplyIntRecursive(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        else if(num2 > 0){
            return num1 + multiplyIntRecursive(num1, num2 - 1);
        }
        else{
            return -num1 + multiplyIntRecursive(num1, num2 + 1);
        }
    }

    // NOTE: Using overloading on method addNumbers

    public static byte addNumbers(byte x, byte y) {
        return (byte) (x + y); // NOTE: Just extra testing and experimentation
    }

    public static int addNumbers(int x, int y) {
        return x + y;
    }

    public static long addNumbers(long x, long y) {
        return x + y;
    }

    public static float addNumbers(float x, float y) {
        return (x + y);
    }

    public static double addNumbers(double x, double y) {
        return (x + y);
    }

    public static int addIntegers(int x, int y) {
        return x + y;
    }

    public static int subtractIntegers(int x, int y) {
        return x - y;
    }

    public static int multiplyIntegers(int x, int y) {
        return x * y;
    }

    public static int divideIntegers(int x, int y) {
        return x / y;
    }

    public static int modulusIntegers(int x, int y) {
        return x % y;
    }

    public static long modulusLongs(long x, long y) {
        return x % y;
    }

    // NOTE: Although Method Overloading is possible, it is not recommended to do so because it can lead to confusion in this case.
    // NOTE: For these examples, it is better to use a different method name for each method to be more clear.
    // NOTE: Method Overloading is useful when you want to use the same method name for different methods that do different things.

    public static double addDoubles(double x, double y) {
        return x + y;
    }

    public static double subtractDoubles(double x, double y) {
        return x - y;
    }

    public static double multiplyDoubles(double x, double y) {
        return x * y;
    }

    public static double divideDoubles(double x, double y) {
        return x / y;
    }

    // NOTE: Testing, is there such as thing as modulus for doubles?

    public static double modulusDoubles(double x, double y) {
        return x % y;
    }

    public static long addLongs(long x, long y) {
        return x + y;
    }

    public static long subtractLongs(long x, long y) {
        return x - y;
    }

    public static long multiplyLongs(long x, long y) {
        return x * y;
    }

    public static long divideLongs(long x, long y) {
        return x / y;
    }

    public static int productFromValueAndNumber(int value, int number) {
        int product = 0;
        for (int i = 0; i < number; i++) {
            product += value;
        }
        return product;
    }

    // The following function will prompt if the user wants to continue, returning boolean value
    public static boolean promptUserToContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to continue? [y/N] ");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y");
    }

    /**
     * This method will prompt the user to enter a number between min and max.
     * If the user enters a number within the range, the method will return the number.
     * If the user enters a number outside the range, the method will prompt the user to try again.
     */
    public static int getInteger(int min, int max) {
        Scanner scanner;
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

        //        Exercises
        //        Create a class named MethodsExercises. Inside of your class, write code to create the specified methods.
        //
        //        Test your code by creating a main method and calling each of the methods you've created.
        //
        //        Basic Arithmetic
        //
        //        Create four separate methods. Each will perform an arithmetic operation:

        //        Addition

        int a = 5;
        int b = 10;
        System.out.printf("%d + %d = %d\n", a, b, addIntegers(a, b));

        //        Subtraction

        int c = 20;
        int d = 5;
        System.out.printf("%d - %d = %d\n", c, d, subtractIntegers(c, d));

        //        Multiplication

        int e = 5;
        int f = 5;
        System.out.printf("%d * %d = %d\n", e, f, multiplyIntegers(e, f));

        //        Division

        int g = 10;
        int h = 2;
        System.out.printf("%d / %d = %d\n", g, h, divideIntegers(g, h));

        //        Each function needs to take two parameters/arguments so that the operation can be performed.
        //
        //                Test your methods and verify the output.

        //        Add a modulus method that finds the modulus of two numbers.

        int i = 10;
        int j = 3;
        System.out.printf("%d %% %d = %d\n", i, j, modulusIntegers(i, j));

        //                Food for thought: What happens if we try to divide by zero? What should happen? Error/Exception

        int k = 10;
        int l = 0;

        try {

            System.out.printf("%d / %d = %d\n", k, l, divideIntegers(k, l));

        } catch (Exception exception) {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("MY Personal Exception caught: " + exception);
            System.out.println("----------------------------------------------------------------------------");

            //             Exception in thread "main" java.lang.ArithmeticException: divide by zero
            //             at MethodsExercises.divideIntegers(MethodsExercises.java:47)
            //             at MethodsExercises.main(MethodsExercises.java:124)

        }


        //------ using overloading - testing

        int integerValue1 = 1;
        int integerValue2 = 2;
        System.out.printf("integer addition overloading: %d + %d = %d\n", integerValue1, integerValue2, addNumbers(integerValue1, integerValue2));

        long longValue1 = 1111111111L;
        long longValue2 = 2222222222L;
        System.out.printf("long addition overloading: %d + %d = %d\n", longValue1, longValue2, addNumbers(longValue1, longValue2));

        int m = 5;
        int n = 3;
        System.out.print("Multiplication without * operator: ");
        System.out.printf("%d * %d = %d\n", m, n, productFromValueAndNumber(m, n));

        // Additional testing of methods...

        int resultOfRecursiveMultiplication = multiplyIntRecursive(4, 2);
        System.out.printf("using multiplyIntRecursive --> 4 * 2 = %d\n", resultOfRecursiveMultiplication);

        int resultOfRecursiveMultiplicationNegatives = multiplyIntRecursive(-5, 3);
        System.out.printf("using multiplyIntRecursive --> -5 * 3 = %d\n", resultOfRecursiveMultiplicationNegatives);

        //-------------------------
        //        Bonus

        //        Create your multiplication method without the * operator (Hint: a loop might be helpful).
        //        Do the above with recursion.
        //        Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range.
        //        If not, prompt the user to input their number again until the input is within range.
        //        The method signature should look like this:
        //        public static int getInteger(int min, int max);
        //        and is used like this:
        //        System.out.print("Enter a number between 1 and 10: ");

        System.out.println("----[Integer Input - only in range of min-max]----");

        int userInput = getInteger(1, 10);
        System.out.printf("You entered: %d\n", userInput);

        //        If the input is invalid, prompt the user again.
        //                Hint: recursion might be helpful here!
        //                Calculate the factorial of a number.
        //                Prompt the user to enter an integer from 1 to 10.
        //        Display the factorial of the number entered by the user.

        do {

            System.out.println("----[Factorial Fun]----");

            System.out.println("----[LONG data type means factorial max is 1-20]----");

            int numForFactorial = getInteger(1, 20);
            System.out.printf("You entered: %d\n", numForFactorial);
            System.out.printf("Using For Loop: %d! = %d\n", numForFactorial, factorialForLoop(numForFactorial));
            System.out.printf("Using Recursive Function: %d! = %d\n", numForFactorial, factorial(numForFactorial));

        } while (promptUserToContinue());


        //        Ask if the user wants to continue.
        //
        //        Use a for loop to calculate the factorial.
        //
        //                Assume that the user will enter an integer, but verify it’s between 1 and
        //
        //        Use the long type to store the factorial.
        //
        //        Continue only if the user agrees to.
        //
        //        A factorial is a number multiplied by each of the numbers before it.
        //
        //                Factorials are denoted by the exclamation point (n!). Ex:
        //
        //        1! = 1               = 1
        //        2! = 1 x 2           = 2
        //        3! = 1 x 2 x 3       = 6
        //        4! = 1 x 2 x 3 x 4   = 24

        //        Bonus
        //
        //        Test the application and find the integer for the highest factorial that can be accurately calculated by this application,
        //        then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns
        //        accurate factorial calculation}". Don’t forget to change your verification too!

        //                Use recursion to implement the factorial.

        System.out.println(factorial(10)); // 3628800
        System.out.println(factorial(20)); // 2432902008176640000L
        System.out.println(factorial(21)); // -4249290049419214848L - ERROR, OVERFLOW

        //        (4)        Create an application that simulates dice rolling.
        //        Ask the user to enter the number of sides for a pair of dice.
        //        Prompt the user to roll the dice.
        //                "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
        //        Use static methods to implement the method(s) that generate the random numbers.
        //                Use the .random method of the java.lang.Math class to generate random numbers.

        do {

            System.out.println("Enter the number of sides for a pair of dice to roll.");
            int numberOfSides = getInteger(1,Integer.MAX_VALUE);
            System.out.printf("You entered: %d\n", numberOfSides);
            System.out.println("Roll the dice?");
            if (promptUserToContinue()) {
                System.out.println("Rolling the dice..." + "\n");
            } else {
                System.out.println("Goodbye!");
                break;
            }
            int diceRoll1 = (int) getRandomRoll(1, numberOfSides);
            int diceRoll2 = (int) getRandomRoll(1, numberOfSides);
            System.out.println("Dice Roll 1: " + diceRoll1);
            System.out.println("Dice Roll 2: " + diceRoll2);
            System.out.println("Roll again?");

        } while (promptUserToContinue());

        // test areWeThereYet method
        Scanner sc = new Scanner(System.in);
        areWeThereYet(sc);

    }
}
