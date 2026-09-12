import java.util.Scanner;

public class IT26102355Lab6Q2C {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        int sum = 0;
        double average;

        System.out.println("Please enter 10 numbers:");

        int n = 0;

        while (n < 10) {
            System.out.print("Enter number " + (n + 1) + ": ");
            numbers[n] = input.nextInt();

            sum = sum + numbers[n];

            n++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");

        n = 0;

        while (n < 10) {
            System.out.print(numbers[n]);

            if (n < 9) {
                System.out.print(" ");
            }

            n++;
        }

        average = (double) sum / 10;

        System.out.println();
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

    }
}