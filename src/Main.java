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

        System.out.println("Hello, World!");

        System.out.println("args = " + Arrays.toString(args));

        for (String arg : args) {
            System.out.println("arg = " + arg);
        }

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

        String myString = "Hello, World!"; // String is a reference type
        System.out.println("myString = " + myString);

        char letter = '\u0041'; // Unicode for letter 'A', note the value is in HEX
        System.out.println(letter);

        String mySentenceWithQuotes = "Hello, \"World!\"";
        System.out.println("mySentenceWithQuotes = " + mySentenceWithQuotes);

        final int SIDES_OF_A_DICE = 6; // constant variable in JAVA
        // SIDES_OF_A_DICE = 6; // this will not work because it is a constant variable

        byte someNumber = 32;

        short anotherNumber = 123;

        int total = (int) ( someNumber + anotherNumber );

        int anotherTotal = (int) someNumber + (int) anotherNumber;

        int yetAnother = (int) anotherTotal + (int) 5;

        float almostPi = 3.14159F;

        double doublePi = 3.141592653589793D;

        long rawLong = 123234123412341234L;

        int piToInt = (int) almostPi;

        System.out.println("almostPi = " + almostPi);

        System.out.println("doublePi = " + doublePi);

        System.out.println("piToInt = " + piToInt);

        System.out.println("doublePi = " + doublePi);

        System.out.println("rawLong = " + rawLong);

    }
}
