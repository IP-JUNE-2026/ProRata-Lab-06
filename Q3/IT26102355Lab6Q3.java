import java.util.Scanner;

public class IT26102355Lab6Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumOfSquares = 0;
        double rootMeanSquare;

        System.out.println(
            "Enter positive integers (terminate input with -99):"
        );

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != -99) {

            if (number < 0) {
                System.out.println(
                    "Invalid input. Please enter a positive integer or -99 to terminate."
                );
            } else {
                sumOfSquares = sumOfSquares + Math.pow(number, 2);
                count++;
            }

            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        if (count > 0) {
            rootMeanSquare = Math.sqrt(sumOfSquares / count);

            System.out.println(
                "The Root Mean Square (RMS) is: " + rootMeanSquare
            );
        } else {
            System.out.println("No positive numbers were entered.");
        }

    }
}