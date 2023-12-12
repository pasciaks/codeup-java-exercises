import java.util.Arrays;

public class Main {

    // I am a single line comment

    /* I take up one line */

    /**
     * I take up
     * multiple
     * lines
     */


    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();

        System.out.println("Hello, World!");

        System.out.println("args = " + Arrays.toString(args));

        for (String arg : args) {
            System.out.println("arg = " + arg);
        }

        helloWorld.sayHello();
    }
}
