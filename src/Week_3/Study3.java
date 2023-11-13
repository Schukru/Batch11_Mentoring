package Week_3;

public class Study3 {
    public static void main(String[] args) {

/*
        Print prime numbers from 10 to 1000
        Prime numbers can be only divided by 1 and itself
 */

boolean prime;
int counter = 0;

for (int number =10; number<=10000; number++){
    prime = true;

    for (int j=2; j<=(number+1)/2; j++){

        if (number % j == 0){
            prime = false;
            break;
        }
    }

    if (prime == true){
        System.out.println(number + "\t is a Prime Number");
        counter++;
    }
}
        System.out.println("counter = " + counter);



    }

}
