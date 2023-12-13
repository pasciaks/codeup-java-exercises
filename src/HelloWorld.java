// Follow PascalCase for naming classes.
// Follow camelCase for naming variables and methods.
// Follow SCREAMING_SNAKE_CASE for naming constants.
// Follow snake_case for naming packages.
// Follow kebab-case for naming files.

// Strings need to be in double quotes.
// Characters need to be in single quotes.

// Classes need to be separate files, not 'in code' classes.

import java.io.IOError;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Exercises
        //        You should complete all of the following inside of your main method from the previous exercise. After each step, compile and run your code.
        //        Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

        int myFavoriteNumber = 12;
        System.out.println(myFavoriteNumber);

        //        Create a String variable named myString and assign a string value to it, then print the variable out to the console.

        String myString = "This is my string.";
        System.out.println(myString);

        //        String s = "s";

        //        Change your code to assign a character value to myString. What do you notice?

        // Fails to compile.  Cannot convert from String to char.

        // /Users/sheldonpasciak/IdeaProjects/codeup-java-exercises/src/HelloWorld.java:34:27
        // java: incompatible types: char cannot be converted to java.lang.String

        //  String myString = 'C';
        //  System.out.println(myString);

        //        Change your code to assign the value 3.14159 to myString. What happens?
        // java: incompatible types: double cannot be converted to java.lang.String

        //        String myString = 3.14159;

        //        Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        //        java: variable myNumber might not have been initialized

        //        long myNumber;

        //        System.out.println(myNumber); // java: variable myNumber might not have been initialized (after declaring it, but not assigning it a value)

        //        Change your code to assign the value 3.14 to myNumber. What do you notice?

        //        myNumber = 3.14; // java: incompatible types: possible lossy conversion from double to long

        //        long numeric = 2444444;

        //        int num = 233;

        //        double num2 = 233233D;

        //        System.out.println(num2);

        //        System.out.println(myNumber);

        //        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

        //        myNumber = 123L;

        //        Change your code to assign the value 123 to myNumber.

        // myNumber = 123; // It accepted it without the L

        //        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

        //        long testValue = 3.14; // java: incompatible types: possible lossy conversion from double to long

        long testValue = 3; // This works, because the precision is not lost.

        //        Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

        //        float myNumber = 3.14; // Already declared above, comment about the above instance, double by default, need to add the F or cast it to a float.

        //        float myNumber = 3.14F; // Already declared above, comment about the above instance, double by default, need to add the F or cast it to a float.

        float myNumber = (float) 3.14; // Already declared above, comment about the above instance, double by default, need to add the F or cast it to a float.

        //        Copy and paste the following code blocks one at a time and execute them

        //                int x = 5;
        //                System.out.println(x++); // increments after the x value is displayed (post increment)
        //                System.out.println(x); // prints the incremented value of x

        //                int x = 5;
        //                System.out.println(++x); // increments before the x value is displayed (pre increment)
        //                System.out.println(x); // prints the incremented value of x

        //        What is the difference between the above code blocks? Explain why the code outputs what it does. (see above)
        //
        //        Try to create a variable named class. What happens?

        //        int class = 5; // java: not a statement  (( class )) is a reserved word


        //        Object is the most generic type in Java. You can assign any value to a variable of type Object.
        //        What do you think will happen when the following code is run?  Runtime error ?? Versus compile time error ??

        //                String theNumberThree = "three";
        //                Object o = theNumberThree;
        //                int three = (int) o;

        try {
            String theNumberThree = "three";
            Object o = theNumberThree;
            int three = (int) o;
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }



        //        Copy and paste the code above and then run it. Does the result match with your expectation? yes, I imagined it would fail.

        // Exception in thread "main" java.lang.ClassCastException: java.lang.String incompatible with java.lang.Integer
        //	at HelloWorld.main(HelloWorld.java:102)
        //
        //        How is the above example different from the code block below? Casting to a specific type instead of Object.
        //
        //        int three = (int) "three";

        //        What are the two different types of errors we are observing? (see above)
        //
        //        Rewrite the following expressions using the relevant shorthand assignment operators:

        //        int x = 4;
        //        x = x + 5;

        int x = 4;
        x += 5;

        //        int x = 3;
        //        int y = 4;

        x = 3;

        int y = 4;

        //        y = y * x;

        y *= x;

        //        int x = 10;
        //        int y = 2;
        //        x = x / y;
        //        y = y - x;

        x = 10;
        y = 2;
        x /= y;
        y -= x;


        //        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?

        byte myByte = 127;

        //        myByte = 3333333; // java: incompatible types: possible lossy conversion from int to byte
        //        myByte = -3333; // java: incompatible types: possible lossy conversion from int to byte

        //        What happens if you increment a numeric variable past the type's capacity?

        // the value will wrap around, i.e. byte 127 + 1 = -128

        //
        //        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

        System.out.println(Integer.MAX_VALUE); // 2147483647

        //        [^1]: How many bytes of memory are allocated to store a variable of this data type

        // 4 bytes used to store this value.

        // int	4	Integers from -2,147,483,648 to 2,147,483,647

    }

}
