package Week_2;

public class Study2 {
    public static void main(String[] args) {

/*
        myText.length();
        myText.charAt(intNumber);
        myText.indexOf(string);
        myText.lastIndexOf(string);
        myText.toLowerCase();
        myText.toUpperCase();
        myText.substring(intNumber);
        myText.contains(string);
        myText.concat(string);
        myText.equals(string);
        myText.equalsIgnoreCase(string);
*/

      String myText  = "This is our string example";
      String myIndex = "01234567890123456789012345";

        int lengthT = myText.length();
        int lengthI = myIndex.length();

        System.out.println("lengthT = " + lengthT);
        System.out.println("lengthI = " + lengthI);

        char charmyT = myText.charAt(12);
        char charmyI = myIndex.charAt(12);
        myIndex.equals(charmyI);

        System.out.println("charmyT = " + charmyT);
        System.out.println("charmyI = " + charmyI);





    }
}
