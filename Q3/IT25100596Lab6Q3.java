import java.util.Scanner;

public class IT25100596Lab6Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumOfSquares = 0;

        while (true) {

            System.out.print("Enter a positive number (-99 to stop): ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Invalid input. Enter a positive number.");
                continue;
            }

            sumOfSquares = sumOfSquares + (number * number);
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers entered.");
        }
        else {
            double rms = Math.sqrt(sumOfSquares / count);

            System.out.println("Root Mean Square = " + rms);
        }
    }
}