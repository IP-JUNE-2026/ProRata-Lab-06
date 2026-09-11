import java.util.Scanner;

public class IT25100726Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;
        double sumSquares = 0;

        while (true) {
            System.out.print("Enter a positive number (-99 to stop): ");
            num = input.nextInt();

            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                continue;
            }

            sumSquares = sumSquares + (num * num);
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumSquares / count);

            System.out.println("Root Mean Square = " + rms);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}