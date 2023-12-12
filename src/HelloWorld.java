public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public void sayHello() {
        System.out.println("Hello, World!");
    }

    // Follow PascalCase for naming classes.
    // Follow camelCase for naming variables and methods.
    // Follow SCREAMING_SNAKE_CASE for naming constants.
    // Follow snake_case for naming packages.
    // Follow kebab-case for naming files.

    // Strings need to be in double quotes.
    // Characters need to be in single quotes.

    // Classes need to be separate files, not 'in code' classes.

}

//Exercises
//        You should complete all of the following inside of your main method from the previous exercise. After each step, compile and run your code.
//
//        Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//
//        Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//
//        Change your code to assign a character value to myString. What do you notice?
//
//        Change your code to assign the value 3.14159 to myString. What happens?
//
//        Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//
//        Change your code to assign the value 3.14 to myNumber. What do you notice?
//
//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//
//        Change your code to assign the value 123 to myNumber.
//
//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//
//        Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//
//        Copy and paste the following code blocks one at a time and execute them
//
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        What is the difference between the above code blocks? Explain why the code outputs what it does.
//
//        Try to create a variable named class. What happens?
//
//        Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        Copy and paste the code above and then run it. Does the result match with your expectation?
//
//        How is the above example different from the code block below?
//
//        int three = (int) "three";
//        What are the two different types of errors we are observing?
//
//        Rewrite the following expressions using the relevant shorthand assignment operators:
//
//        int x = 4;
//        x = x + 5;
//        int x = 3;
//        int y = 4;
//        y = y * x;
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
//
//        [^1]: How many bytes of memory are allocated to store a variable of this data type



// Bonus (Completed and then removed the created .class file)

//        Build the project from the command line:
//
//        Open a terminal and navigate to your project.
//
//        Change directories into the src directory. You should see your HelloWorld.java file here.
//
//        Run the following command to compile your Java file
//
//        javac HelloWorld.java
//        View the contents of the directory again. You should now see a file named HelloWorld.class (this is the compiled Java bytecode).
//
//        Run your program with the following command
//
//        java HelloWorld
//        This process is part of what IntelliJ does when we press the "Run" button. This can start to get very complex very quickly as we start to introduce multiple Java files, multiple packages, and external libraries. For the rest of the course, we will be using IntelliJ to compile and run our applications, but it is good to have an idea of what is going on behind the scenes.
//
