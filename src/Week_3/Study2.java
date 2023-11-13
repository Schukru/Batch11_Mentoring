package Week_3;

import java.util.Scanner;

public class Study2 {
    public static void main(String[] args) {

   /*
        Guess you the number hold by computer through random method.
        Between 1-100
        We will have only 10 try attempt.
 */

        Scanner scan = new Scanner(System.in);
        int num = (int) (Math.random() * 100) + 1;  // 1-100

        int user;
        int attempt = 0;

        do {
            System.out.print("Please guess my number : ");
            user = scan.nextInt();
            attempt++;

            if (user == num) {
                System.out.println("You guessed my number in " + attempt + " attempt\nCongratulations!");
                break;
            } else if (user > num) {
                System.out.println("My number is smaller");
            } else {
                System.out.println("My number is greater");
            }

        } while (attempt<10);


    }



}

