package Week_1;

public class Study4 {
    public static void main(String[] args) {


      /*
         We bought a car for 500
         Then we sold this car for 687
         and now we have to pay a tax, 17% of our income

         */

        int buyingCar = 500;
        int sellingCar = 687;

        int tax_int = (687-500) / 100 * 17;
        float tax_flo = (687-500) / 100 * 17;
        double tax_dou = (687-500) / 100 * 17;

        System.out.println("tax_int = " + tax_int);
        System.out.println("tax_flo = " + tax_flo);
        System.out.println("tax_dou = " + tax_dou);

        int income = sellingCar-buyingCar;

        tax_int = income /100 * 17;
        tax_flo = (float) income / 100 * 17;
        tax_dou = (double) income / 100 * 17;

        System.out.println("tax_int = " + tax_int);
        System.out.println("tax_flo = " + tax_flo);
        System.out.println("tax_dou = " + tax_dou);


    }
}
