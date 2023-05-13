package homeworks.homework_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        byte byteSample = -128;
        short shortSample = 32767;
        int intSample = 2147483647;
        long longSample = 2L;
        float floatSample = 27.5f;
        double doubleSample = 3.14d;
        char charSample = 'A';
        boolean booleanSample = false;

        //creating two strings
        String stringSampleFirstWay = "some text";
        String stringSampleSecondWay = new String("another text");

        //byte
        int byteOperationResultFirst = byteSample + 28;
        int byteOperationResultSecond = byteSample / 2;
        System.out.println("byte operation #1: " + byteOperationResultFirst);
        System.out.println("byte operation #2: " + byteOperationResultSecond);

        //short
        int shortOperationResultFirst = shortSample - 767;
        int shortOperationResultSecond = shortSample / 2;
        System.out.println("short operation #1: " + shortOperationResultFirst);
        System.out.println("short operation #2: " + shortOperationResultSecond);

        //int
        int intOperationResultFirst = intSample - 1147483647;
        int intOperationResultSecond = intSample / 2;
        System.out.println("int operation #1: " + intOperationResultFirst);
        System.out.println("int operation #2: " + intOperationResultSecond);

        //long
        long longOperationResultFirst = longSample / 2L;
        long longOperationResultSecond = longSample * 2L;
        System.out.println("long operation #1: " + longOperationResultFirst);
        System.out.println("long operation #2: " + longOperationResultSecond);

        //float
        float floatOperationResultFirst = floatSample - 20f;
        float floatOperationResultSecond = floatSample * 20f;
        System.out.println("float operation #1: " + floatOperationResultFirst);
        System.out.println("float operation #2: " + floatOperationResultSecond);

        //double
        double doubleOperationResultFirst = doubleSample * 3.14d;
        double doubleOperationResultSecond = doubleSample / 2d;
        System.out.println("double operation #1: " + doubleOperationResultFirst);
        System.out.println("double operation #2: " + doubleOperationResultSecond);

        //char
        char charOperationResultFirst = (char) (charSample + 1);
        char charOperationResultSecond = (char) (charSample + 5);
        System.out.println("char operation #1: " + charOperationResultFirst);
        System.out.println("char operation #2: " + charOperationResultSecond);

        //boolean
        //it is impossible to perform arithmetic operations with boolean
        System.out.println("boolean operation #1, #2: it is impossible to perform arithmetic operations with boolean");

        //logic operation
        int x = 5;
        int y = 10;
        int z = 15;

        if (x < y && y < z) {
            System.out.println("x is smallest number");
        }

        boolean isSunny = true;
        boolean isRaining = false;

        if (!isSunny) {
            System.out.println("Today is cloudy");
        }
        if (isSunny ^ isRaining) {
            System.out.println("Today is sunny or rainy but not at the same time");
        }
        if (isSunny & !isRaining) {
            System.out.println("Today is sunny but not rainy");
        }
        if (isSunny == isRaining) {
            System.out.println("Check the rainbow");
        }

        int age = 70;

        if (age >= 65) {
            System.out.println("You are retired");
        }
        if (age <= 17 && age > 0) {
            System.out.println("You are not an adult");
        }
        if (age < 0 || age > 120) {
            System.out.println("Something went wrong");
        }

        int a = 10;
        int b = 20;
        int c = 30;

        if ((a > b && a > c) | (a < b & a < c)) {
            System.out.println("a - largest or smallest number");
        }

        //ternary conditional operator #1
        int maxNumber;
        int numberA = 1;
        int numberB = 9;

        maxNumber = (numberA > numberB) ? numberA : numberB;
        System.out.println("Max number is: " + maxNumber);

        //ternary conditional operator #2
        String stringResult = (maxNumber % 2 == 0) ? "even number" : "odd number";
        System.out.println("Max number is: " + stringResult);

        //increment and decrement task
        byte count = 1;
        System.out.println(count);
        System.out.println(count);
        System.out.println(count--);
        System.out.println(count++);
        System.out.println(++count);
        System.out.println(--count);
        System.out.println(count);

        //array task
        int[] myArray = new int[10];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100) + 1;
        }

        System.out.println("even numbers in array: ");
        for (int j : myArray) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}