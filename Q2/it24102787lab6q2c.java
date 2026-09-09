import java.util.Scanner;

public class it24102787lab6q2c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        for (int x = 0; x < 10; x++) {
            System.out.print("Enter number " + (x + 1) + ": ");
            numbers[x] = input.nextInt();
            sum += numbers[x];
        }

        System.out.println("\nThe numbers you entered are:");
        for (int number : numbers) {
            System.out.print(number + " ");


        }
        // calculate sum and average

        System.out.println("\nSum of the numbers:" + sum);
        double average = sum / 10.0;
        System.out.println("average of the numbers:" + average);

    }
}
