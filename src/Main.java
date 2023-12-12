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

        byte myByte = 127;
        byte myByteInBinary = 0b1111111;

        System.out.println("myByte = " + myByte);
        System.out.println("myByteInBinary = " + myByteInBinary);

        short myShort = 32767;
        System.out.println("myShort = " + myShort);

        int myInt = 2147483647;
        System.out.println("myInt = " + myInt);

        long myLong = 9223372036854775807L;
        System.out.println("myLong = " + myLong);

        float myFloat = 2.1F;
        System.out.println("myFloat = " + myFloat);

        double myDouble = 2.1;
        System.out.println("myDouble = " + myDouble);

        char myChar = 'c';
        System.out.println("myChar = " + myChar);

        boolean myBoolean = true;
        System.out.println("myBoolean = " + myBoolean);

        String myString = "Hello, World!";
        System.out.println("myString = " + myString);

    }
}
