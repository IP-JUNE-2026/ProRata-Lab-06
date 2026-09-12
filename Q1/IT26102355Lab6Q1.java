import java.util.Scanner;

public class IT26102355Lab6Q1 {

    public static void main(String[] args) {

        double num, square;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextDouble();

        square = Math.pow(num, 2);
        System.out.println("The square of " + num + " is: " + square);

        if (num < 0) {
            System.out.println(
                "The square root of " + num + " is not a real number."
            );
        } else {
            double squareRoot = Math.sqrt(num);
            System.out.println(
                "The square root of " + num + " is: " + squareRoot
            );
        }

    }
}