import java.util.Scanner;

public class IT26101915Lab6Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumOfSquares = 0;

        System.out.println("Enter positive numbers.");
        System.out.println("Enter -99 to stop.");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != -99) {

            if (number < 0) {

                System.out.println("Invalid input! Please enter a positive number.");

            } else {

                sumOfSquares = sumOfSquares + (number * number);
                count++;
            }

            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        if (count > 0) {

            double rms = Math.sqrt(sumOfSquares / count);

            System.out.println("Root Mean Square = " + rms);

        } else {

            System.out.println("No valid numbers were entered.");
        }
    }
}

