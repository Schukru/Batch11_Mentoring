package Week_1.errors;

public class Monday5 {
    public static void main(String []args) {

//         Task #1. Sum of numbers
        int num1 = 10;
        int num2 = 15;

        int sum = num1 + num2;
        System.out.println("Sum of num1 and num2 is " + sum);

//         Task #2.

        int side = 5;
        int perimeter = side * 4;
        int area = side * side;

        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);

//         Task #3.
        int width = 3;
        int length = 4;

        perimeter = (width + length) * 2;
        area = length * width;

        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);

//         Task #4.
        int weeks = 3;
        int days = 5;

        int totalDays = weeks * 7 + days;
        System.out.println("total amount of days is " + totalDays);

//         Task #5.
        int minutes = 3;
        int seconds = 30;

        int totalSeconds = minutes * 60 + seconds;
        System.out.println("Total amount of seconds is " + totalSeconds);

    }
}
