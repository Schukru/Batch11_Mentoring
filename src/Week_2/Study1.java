package Week_2;

import java.util.Scanner;

public class Study1 {
    public static void main(String[] args) {


//        Scanner scan = new Scanner(System.in);
//
//        String num = scan.next();           // - read an String from keyboard
//        String numS = scan.nextLine();      // - read an String from keyboard

//        int numI = scan.nextInt();          // - read an integer from keyboard
//        short numSh = scan.nextShort();     // - read an Short from keyboard
//        long numL = scan.nextLong();        // - read an Long from keyboard
//        byte numB = scan.nextByte();        // - read an Byte from keyboard
//        float numF = scan.nextFloat();      // - read an Float from keyboard
//        double numD = scan.nextDouble();    // - read an Double from keyboard
//        boolean numBo = scan.nextBoolean(); // - read an Boolean from keyboard

//        scan.close();

    /*
        - Create a String. Enter your name in the console. Print your name.
        - Create an int. Enter the number of doors in your car into the console. Print this int.
        - Create a String. Type the city you lived in 10 years ago into the Console. Print this String.
        - Create a double. Enter the value of PI with two decimal places into the console. Print the double.
        - Create a boolean. Type "Do You Have a Bank Account?" into the console.
                Answer from the console as True if yes, or False if not. Print Boolean.
        - Create a byte. Write a weight in kg to the console. Print the byte.
        - Create a float. Enter your height into the console. Print the float.
    */


//- 1---------------------
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your name : ");
//        String myName = scan.nextLine();
//        System.out.println("Your name is "+ myName);

//        Scanner scan = new Scanner(System.in);
//        System.out.print("What is your number of doors in your car : ");
//        int myDoor = scan.nextInt();
//
//        System.out.println("Door number is : " + myDoor);

        Scanner scan = new Scanner(System.in);
        System.out.print("Do you have a Bank Account (true/false) : ");
        boolean myBank = scan.nextBoolean();
        System.out.println("You have a bank account ? :" + myBank);


    }
}
