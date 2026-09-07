import java.util.Scanner;

public class IT22921130Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumSquares = 0, rms;

        System.out.println("Enter positive numbers (-99 to stop): ");

        while (true) {

            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Negative numbers are not allowed!");
                continue;
            }

            sumSquares = sumSquares + (number * number);
            count++;
        }

        rms = Math.sqrt(sumSquares / count);

        System.out.println("Root Mean Square = " + rms);
    }
}