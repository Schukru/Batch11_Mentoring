package Week_3;

public class Study6 {
    public static void main(String[] args) {

        /*
            print char characters between 65-115 randomly
            if two consequtive char numbers is "65" and "115",  the program should stop.
        */

//        int numberF;
//        int numberS = 0;
//
//        char myChar;
//
//        do{
//
//            numberF = (int) (Math.random() * 50) + 65; // (max - min) * random() + min  (min is not included)
//            myChar = (char) numberF;
//
//            System.out.print(myChar);
//            if (numberF==65 && numberS==114){
//                break;
//            }else {
//                numberS = numberF;
//            }
//
//        }while (true);

        int numberF;
        int numberS = 0;
        int myMin=60;
        int myMax=150;

        char myChar;

        do{

            numberF = (int) (Math.random() * (myMax-myMin)) + myMin; // (max - min) * random() + min  (min is not included)
            myChar = (char) numberF;

            System.out.print(myChar);
//            System.out.println("myMin = " + myMin +"     -    myMax = " + myMax + "   -   number = " + numberF);

            if (numberF==60 && numberS==149){
                break;
            }else {
                numberS = numberF;
            }

        }while (true);


    }
}
