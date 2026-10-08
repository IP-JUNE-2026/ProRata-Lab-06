import java.util.Scanner;

public class IT22619976Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumOfSquares = 0;

        System.out.println("Enter positive numbers (-99 to stop):");

        while (true) {
            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                continue;
            }

            sumOfSquares = sumOfSquares + (number * number);
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("Root Mean Square = " + rms);
        }
    }
}