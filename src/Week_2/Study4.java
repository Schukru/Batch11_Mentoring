package Week_2;

import java.util.Locale;

public class Study4 {
    public static void main(String[] args) {


    /*  Groups

        myText.charAt(intNumber);		    char
        myText.length();		    	    int
        myText.indexOf(string);			    int
        myText.lastIndexOf(string);	    	int

        myText.toLowerCase();		    	String
        myText.toUpperCase();		    	String
        myText.substring(intNumber);		String
        myText.concat(string);			    String

        myText.contains(string);		    boolean
        myText.equals(string);			    boolean
        myText.equalsIgnoreCase(string);	boolean

        myText.replace(string, string);		String
        myText.replaceFirst(string, string);String
        myText.replaceAll(string, string);	String

*/

        String myText = "THIS     IS         YOUR           FIRST SENTENCE TO LEARN SOME STRING METHODS";

        String myResult = "This is our first sentence to learn some string methods...";

// 1-
        myText = myText.toLowerCase(Locale.ENGLISH);

        // 2-
        myText = myText.replaceAll(" +", " ");

//        // "this a wronggggggg text"
//            myText = myText.replaceAll("g+", "g");

//  3-
        myText = myText.substring(0,1).toUpperCase().concat(myText.substring(1));

//  4-
        myText = myText.replace("your", "our");

//  5-
        myText = myText.concat("...");

        System.out.println("myText.equals(myResult) = " + myText.equals(myResult));
        System.out.println("myText = " + myText);
        System.out.println("myResult = " + myResult);


    }
}
