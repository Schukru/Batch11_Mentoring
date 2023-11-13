package Week_3;

public class Study1 {
    public static void main(String[] args) {


/*
    Print the total VAT amount for your profit of the car you sold

    your profit = 500

    VAT rate = 10%   -->  up to $200
    VAT rate = 15%   -->  between $201 and $400
    VAT rate = 20%   -->  more than $401

 */

//  First way

        int profit = 500;
        double vat = 0;

        if (profit <= 200){
            vat = profit * 10/100;
        }
        else if (profit <= 400){
            vat = 200 * 10/100 + (profit-200) * 15/100;
        }else {
            vat = 200 * 10/100 + 200 * 15/100 +(profit-400) * 20/100;
        }

        System.out.println("vat = " + vat);


        //  Second way

        vat = 0;

        if (profit > 400){
            vat  = (profit - 400) * 20/100;
            profit = 400;
        }

        if (profit > 200){
            vat += (profit - 200) * 15/100;
            profit = 200;
        }

        vat += profit * 10/100;

        System.out.println("vat = " + vat);


    }

}
