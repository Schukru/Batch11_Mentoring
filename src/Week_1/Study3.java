package Week_1;

public class Study3 {
    public static void main(String[] args) {

//        data types
//                explicit casting
//                        scanner

              /*

        Data Type	Size	    Description (How much byte takes in memory)
        ---------   -------     ----------------------------------------------

        byte	    1 byte	    Stores whole numbers from -128 to 127
        short	    2 bytes	    Stores whole numbers from -32,768 to 32,767
        int 	    4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	    8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807   (Suffix: L/l)

        float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits             (Suffix: F/f)
        double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits                 (Suffix: D/d)  Optional

        boolean	    1 bit	    Stores true or false values

        char	    2 bytes	    Stores a single character/letter or ASCII values

         */


//        System.out.println("Byte.Min = " + Byte.MIN_VALUE);
//        System.out.println("Byte.Max = " + Byte.MAX_VALUE);
//
//        System.out.println("Float.Min = " + Float.MIN_VALUE);
//        System.out.println("Float.Max = " + Float.MAX_VALUE);

//        float floatType = 25455884.25f;

//        System.out.println("floatType = " + floatType);

        int num1= 5;
        int num2= 2;

        System.out.println("num1/num2 = " + num1/num2);
        System.out.println("double = " + (double) num1/num2);    // explicit casting
        System.out.println("double2 = " + num1 / (double)num2);    // explicit casting
        System.out.println("double3 = " + (double) (num1 / num2));    // explicit casting


/*
        int / int     ->  int
        double / int  ->  double
        int / double  ->  double

 */

        int num3 = 5;
        double num4 = 2;

        System.out.println("num3/num4 = " + num3/num4);





    }
}
