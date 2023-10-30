package Week_1;

import java.awt.*;

public class Study2 {
    public static void main(String[] args) {


/*
	+----------------------------------------------------+
	|                     Times of day                   |
	+----------------+------------------+----------------+
	|     Morning    |    Afternoon     |     Evening    |
	+----------------+------------------+------------ ---+

*/

        System.out.println("+----------------------------------------------------+\n" +
                           "|                     Times of day                   |\n" +
                           "+----------------+------------------+----------------+\n" +
                           "|     Morning    |    Afternoon     |     Evening    |\n" +
                           "+----------------+------------------+------------ ---+");


/*

"This is our first line. It started with double quote.
    We want to move to next line below but it should start with a tab.
Then go to the next line. "Now we need to print this sentence in double quotes"
Then go to the next line again and add a backspace character to the end of the line""

*/

        System.out.println("\"This is our first line. It started with double quote.\n\t" +
                "We want to move to next line below but it should start with a tab.\n" +
                "Then go to the next line. \"Now we need to print this sentence in double quotes\"\n" +
                "Then go to the next line again and add a backspace character to the end of the line\"\"\b");


        System.out.println("\"This is our first line. It started with double quote.\n" +
                "\tWe want to move to next line below but it should start with a tab.\n" +
                "Then go to the next line. \"Now we need to print this sentence in double quotes\"\n" +
                "Then go to the next line again and add a backspace character to the end of the line\"\"\b");

    }
}
