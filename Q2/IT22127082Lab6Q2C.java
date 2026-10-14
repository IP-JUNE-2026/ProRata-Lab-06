
import java.util.Scanner;

public class IT22127082Lab6Q2C {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();

            sum = sum + number;
            count++;
        }

        double average = sum / 10.0;

        System.out.println("\nThe sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}
