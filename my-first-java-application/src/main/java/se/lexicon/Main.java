package se.lexicon;


public class Main {

    /* This is a multiline comment
    it can span several lines
     */

    /**
     * This is a Java Doc <b>(Documentary Comments)</b>
     * ## Used to create documentation for **Java Codes**
     */


    // psvm + tab
    public static void main(String[] args) {
        // sout + tab
        System.out.println("Hello, World!");
        System.out.println("----------------");
        System.out.println("Hello");
        System.out.println("Martin");
        System.out.println("----------------");

        System.out.println("Hello again!");

        System.out.println("----------------");
        System.out.println("Speed");

        //Variables
        // [data type] [value name];
        int speed;
        speed = 100;

        double salary = 5000.55;
        char grade = 'A';
        char specialChar ='\u2764';
        boolean isActive = true;
        boolean isReserved = false;

        long balance = 500000000000000L;
        double area = 20.55;
        int setNumber = 100;
        int studentId = 5000;
        System.out.println("Speed" + " " + speed);
        System.out.println("------------------");

        int number1 = 10;
        int number2 = 5;
        int additionResult = number1 + number2;
        System.out.println("Addition: " + additionResult);
        int subtractionResult = number1 - number2;
        System.out.println("Subtraction: " + subtractionResult);
        // *    /   %
        int division = number1 / number2;
        System.out.println("Division: " + division);
        int modulus = number1 % number2; //Remainder of the division, 10/5 = 2 no remainder, 9/4=2+1 remainder (4x2=8+1=9)
        System.out.println("Modulus: " + modulus);

        // Increment (++) and Decrement (--) operators
        int counter = 0;
        System.out.println(++counter);

        int num1 = 500, num2 = 200, num3 = 10;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // (== , != , < , > , <= , >=)
        boolean isEqual = num1 == num2;
        System.out.println("Is Equal: " + isEqual);
        boolean isGreaterThan = num1 > num2;
        System.out.println("Is Greater Than: " + isGreaterThan);

        int age= 16;
        if(age >= 18){
            System.out.println("You are eligible to vote!");
            }
        else {
            System.out.println("You are not eligible to vote!");
        }

        int marks = 85;
        if (marks >= 90){
            System.out.println("Grade A");
        } else if(marks >= 80){
            System.out.println("Grade B");
        } else if(marks >= 70){
            System.out.println("Grade C");
        } else{
            System.out.println("Grade F");
        }




    }

    // Ctrl + Alt + L = reformat code


}