package Week_3;

import java.util.Scanner;

public class Study4 {

    public static void main(String[] args) {

               /*
        print all numbers that can divide a given number without remainder
        if we give the number as 0, the loop should be broken
         */

        Scanner scan = new Scanner(System.in);
        int number;

        do{
            System.out.print("Please input a number : ");
            number = scan.nextInt();

            for (int i=1; i<=number; i++){

                if (number % i == 0){
                    System.out.println(number + "\t = \t" + i + " x " + (number / i));
                }

                if (number == 0){
                    break;
                }
            }

        }while (number != 0);

        System.out.println("Program stopped.");

    }
}
