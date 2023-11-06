package Week_2;

public class Study3 {
    public static void main(String[] args) {

    // STRING --->    myText.substring(start, end)  -->  in order to get a part of the myText from start to end
    //                                                                              (start and end are order index numbers)

    // STRING --->    myText.substring(start)       -->  Gets the text from start to end of the myText


    // INTEGER--->    myText.indexOf(".....")       -->  Gets the index number of the "....."
    // INTEGER--->    myText.indexOf(".....", i)    -->  Gets the index number of the "....." from beginning of the n index

        String myText  = "This is our string example to learn some methods like substring";
        String myIndex = "01234567890123456789012345";


//        - The First Word
        int spaceI = myText.indexOf(" ");
//        System.out.println("spaceI = " + spaceI);
        String myFirstWord = myText.substring(0,spaceI);
        System.out.println("myFirstWord = " + myFirstWord);

//        - The Last Word
        int lastSpaceI = myText.lastIndexOf(" ");
        String myLastWord = myText.substring(lastSpaceI + 1);
        System.out.println("myLastWord = " + myLastWord);

//       - Other 6 words
        int sp2 = myText.indexOf(" ");
        int sp3 = myText.indexOf(" ", sp2+1);
        int sp4 = myText.indexOf(" ", sp3+1);
        int sp5 = myText.indexOf(" ", sp4+1);
        int sp6 = myText.indexOf(" ", sp5+1);
        int sp7 = myText.indexOf(" ", sp6+1);
        int sp8 = myText.indexOf(" ", sp7+1);
        int sp9 = myText.indexOf(" ", sp8+1);
        int sp10 = myText.indexOf(" ", sp9+1);
        int sp11 = myText.indexOf(" ", sp10+1);

        String word2 = myText.substring(sp2+1, sp3);
        String word3 = myText.substring(sp3+1, sp4);
        String word4 = myText.substring(sp4+1, sp5);
        String word5 = myText.substring(sp5+1, sp6);
        String word6 = myText.substring(sp6+1, sp7);
        String word7 = myText.substring(sp7+1, sp8);
        String word8 = myText.substring(sp8+1, sp9);
        String word9 = myText.substring(sp9+1, sp10);
        String word10 = myText.substring(sp10+1, sp11);

        System.out.println("word the first = " + myFirstWord);

        System.out.println("word2 = " + word2);
        System.out.println("word3 = " + word3);
        System.out.println("word4 = " + word4);
        System.out.println("word5 = " + word5);
        System.out.println("word6 = " + word6);
        System.out.println("word7 = " + word7);
        System.out.println("word8 = " + word8);
        System.out.println("word9 = " + word9);
        System.out.println("word10 = " + word10);

        System.out.println("word the last = " + myLastWord);


    }
}
