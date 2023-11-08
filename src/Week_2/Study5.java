package Week_2;

public class Study5 {
    public static void main(String[] args) {

        /*
                &&  --->  AND
                ||  --->  OR  (ALT+124)
         */

        boolean a = true;
        boolean b = false;

//    Lets find out what is the value of a and b

        // 1-
//        if (a == true) {          //        if (a)
//            System.out.println("a = true");
//        }
//
//        if (b == true) {         // if (b)
//            System.out.println("b = true");
//        }
//
////   2-
//
//        if (b == false) {                    //  if (b) statement is wrong and we cannot use it for this statement
//            System.out.println("b = false");
//        }else {
//            System.out.println("b = true");
//        }


        //3 -
        if (b == true) {         // if (b)
            System.out.println("b = true");
        }
        else if (a == true) {
            System.out.println("a = true");
        }
        else {
            System.out.println(" b is not true and a is not true");
        }


    }
}
