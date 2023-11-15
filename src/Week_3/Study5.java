package Week_3;

import java.util.Scanner;

public class Study5 {
    public static void main(String[] args) {

      /*
      print char characters for between 65-70
       */

        char myChar;
        int number;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Print a number between 65-70 :");
            number = scan.nextInt();
            myChar = (char) number;

            System.out.println(myChar);

        }while (number!=0);

    }


}
