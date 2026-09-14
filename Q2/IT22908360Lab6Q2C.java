import java.util.Scanner;

public class IT22908360Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int count = 0;
        int sum = 0;
        double average;

        System.out.println("Please enter 10 numbers:");

        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            numbers[count] = input.nextInt();

            sum = sum + numbers[count];

            count++;
        }

        average = (double) sum / 10;

        System.out.println();
        System.out.println("The numbers you entered are:");

        count = 0;

        while (count < 10) {
            System.out.print(numbers[count] + " ");
            count++;
        }

        System.out.println();
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}